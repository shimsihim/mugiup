import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";
import router from "../router";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    users: [],
    searchUsers: [],
    user: {},
    loginUser: null,
    randomUser: null,
    posts : [],
    post : {},

  },
  getters: {
    userCnt: function (state) {
      return state.users.length;
    },
    postCnt: function (state) {
      return state.posts.length;
    },
    searchUserCnt: function (state) {
      return state.searchUsers.length > 0 ? state.searchUsers.length : null;
    },
  },
  mutations: {
    CREATE_USER: function (state, user) {
      state.users.push(user);
    },
    SET_USERS: function (state, users) {
      state.users = users;
    },
    SET_USER: function (state, user) {
      state.user = user;
    },
    SEARCH_NAME: function (state, users) {
      state.searchUsers = users;
    },
    SET_LOGIN_USER: function (state, user) {
      state.loginUser = user;
    },
    LOGOUT: function (state) {
      state.loginUser = null;
    },
    SET_RANDOM_USER: function (state, user) {
      state.randomUser = user;
    },
    SET_POSTS: function (state, posts) {
      state.posts = posts;
    },
  },
  actions: {
    createUser: function ({ commit }, user) {
      console.log(user)
      //중복확인 후 추가하기 
      //빈칸있을 때 입력하라고 하기
      const API_URL = `http://localhost:9999/ssafit/user/signUp`;
      axios({
        url: API_URL,
        method: "POST",
        data: user,
      })
        .then(() => {
          commit("CREATE_USER", user);
          alert("등록되었습니다.");
          router.push("/user");
        })
        .catch((err) => {
          console.log(err);
        });
    },
    //전체 유저를 불러오는 기능
    setUsers: function ({ commit }) {
      const API_URL = `http://localhost:9999/ssafit/user/selectAll`;
      return axios({
        url: API_URL,
        method: "GET",
      })
        .then((res) => {
          console.log("user setting...");
          console.log(res.data);
          commit("SET_USERS", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    
    updateUser: function ({commit}, loginUser) {
      console.log(commit);
      const API_URL = `http://localhost:9999/ssafit/user/updateUserInfo`;
      axios({
        url: API_URL,
        method: "POST",
        data: loginUser,
      })
      .then(() => {
        alert("수정 완료!");
        router.push("/user");
      })
      .catch((err) => {
        console.log(err);
      });
    },

    deleteUser: function ({ state }, user_id) {
      const API_URL = `http://localhost:9999/ssafit/user/withdraw/${user_id}`;
      axios({
        method: 'DELETE',
        url: API_URL,
        
      })
      .then(() => {
        alert("삭제 완료!");
        let index;
        for (let i = 0; i < state.users.length; i++) {
          if (state.users[i].user_id === user_id) {
            index = i;
          }
        }
        state.users.splice(index, 1);
        router.push("/user");
      })
      .catch((err) => {
        console.log(err);
      });
    },
    
    setUser: function ({ commit }, id) {
      const API_URL = `http://localhost:9999/userapi/user/${id}`;
      axios({
        url: API_URL,
        method: "GET",
      })
      .then((res) => {
          commit("SET_USER", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
      },
      searchName: function ({ commit }, name) {
        const API_URL = `http://localhost:9999/userapi/user/search`;
        axios({
          url: API_URL,
          method: "GET",
          params: {
            key: "name",
            word: name,
          },
        })
        .then((res) => {
          commit("SEARCH_NAME", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
      },
    setLoginUser: function ({ commit }, user) {
      const API_URL = `http://localhost:9999/ssafit/user/login`;
      axios({
        url: API_URL,
        method: "POST",
        params: {
          user_id : user.user_id,
          user_pw : user.user_pw,
        },
      })
      .then((res) => {
        console.log(res);
        // let resUser = res.data;
        // if (resUser.id === user.id && resUser.password === user.password) {
          //   alert("로그인 성공!");
          //   commit("SET_LOGIN_USER", res.data);
          //   router.push("/");
          // } else {
            //   alert("로그인 실패");
            // }
            alert("로그인 성공!");
            commit("SET_LOGIN_USER", res.data);
            router.push("/");
          })
          .catch(() => {
            alert("로그인 실패");
          });
        },
        setRandomUser: async function ({ commit }) {
      const API_URL = `https://random-data-api.com/api/users/random_user`;

      try {
        const res = await axios.get(API_URL);
        let user = {
          id: res.data.username,
          password: res.data.password,
          name: res.data.first_name,
          email: res.data.email,
          age: Math.floor(Math.random() * (99 - 20)) + 20,
        };
        commit("SET_RANDOM_USER", user);
      } catch (err) {
        console.log(err);
      }
    },
    setPosts: function ({ commit },board_id) {
      const API_URL = `http://localhost:9999/ssafit/post/board/${board_id}`;
      return axios({
        url: API_URL,
        method: "GET",
      })
        .then((res) => {
          commit("SET_POSTS", res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    createPost : function({commit} , post){
      const API_URL = `http://localhost:9999/ssafit/post/regist`;
      return axios({
        url: API_URL,
        method: "POST",
        data : post
      })
        .then(() => {
          commit("SET_POSTS", post);
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
  modules: {},
});