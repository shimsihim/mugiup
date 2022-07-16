import Vue from "vue";
import Vuex from "vuex";
import router from "@/router";
import axios from "axios";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    users: [],
    searchUsers: [],
    user: null,
    loginUser: null,
    randomUser: null,
  },
  getters: {
    userCnt: function (state) {
      return state.users.length;
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
      state.________ = user;
    },
  },
  actions: {
    createUser: function ({ commit }, user) {
      commit("CREATE_USER", user);
      router.push("/user");
    },
    setUsers: function () {},
    updateUser: function ({ state }, user) {
      for (let i = 0; i < state.users.length; i++) {
        if (state.users[i].id === user.id) {
          Vue.set(state.users, i, user);
          alert("수정 완료");
          break;
        }
      }

      router.push("/user");
    },
    deleteUser: function ({ state }, id) {
      for (let i = 0; i < state.users.length; i++) {
        if (state.users[i].id === id) {
          state.users.splice(i, 1);
          alert("삭제 완료");
          break;
        }
      }

      router.push("/user");
    },
    setUser: function ({ commit, state }, id) {
      for (let i = 0; i < state.users.length; i++) {
        if (state.users[i].id === id) {
          commit("SET_USER", state.users[i]);
          break;
        }
      }
    },
    searchName: function ({ commit, state }, name) {
      let newUserList = [];

      for (let i = 0; i < state.users.length; i++) {
        if (state.users[i].name.indexOf(name) >= 0) {
          newUserList.push(state.users[i]);
        }
      }

      commit("SEARCH_NAME", newUserList);
    },
    setLoginUser: function ({ commit, state }, user) {
      let matched = false;

      for (let i = 0; i < state.users.length; i++) {
        if (
          user.id === state.users[i].id &&
          user.password === state.users[i].password
        ) {
          matched = true;
          break;
        }
      }
      if (matched) {
        commit("SET_LOGIN_USER", user);
        alert("로그인 성공");
        router.push("/");
      } else {
        alert("로그인 실패");
      }
    },
    // 비동기 통신으로 값이 준비될때까지 대기
    getRandomUser: ________ function ({ commit }) {
      const API_URL = `________________________`;
      try {
        const res = ________ ________(________);
        let user = {
          id: ________.username,
          password: ________.password,
          name: ________.first_name,
          email: ________.email,
          age: Math.floor(Math.random() * (99 - 20)) + 20,
        };
        // mutation으로 randomuser 변경
        commit("________", user);
      } catch (err) {
        console.log(err);
      }
    },
  },
  modules: {},
});
