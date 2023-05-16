<template>
  <header>
    <nav class="header-nav">
      <div>
        <router-link to="/" class="logo">SSAFY USERS</router-link>
      </div>
      <div>
        <router-link to="/board/list/1">게시판</router-link>
      </div>
      <div>
        <div v-if="getUser">
          <a href="#" @click="logout">로그아웃</a>
          <router-link to="/mypage">마이페이지</router-link>
        </div>
        <div v-else>
          <router-link to="/login">로그인</router-link>
          <router-link :to="{ name: 'Regist' }" >회원가입</router-link>
          <!-- 관리자용 사용자목록 -->
          <!-- <router-link to="/user">사용자목록</router-link> -->
        </div>
      </div>
    </nav>
  </header>
</template>
<script>
import { mapState } from "vuex";
export default {
  name: "HeaderNav",
  methods: {
    logout() {
      this.$store.commit("LOGOUT");
      alert("로그아웃 되었습니다.");
    },
  },
  computed: {
    ...mapState(["loginUser"]),
    getUser() {
      if (this.loginUser) {
        return true;
      } else {
        return false;
      }
    },
  },
};
</script>
<style>
header {
  height: 70px;
  background-color: #53e3a6;
  line-height: 70px;
  padding: 0px 30px;
}

header a {
  margin: 10px;
  text-decoration: none;
  color: white;
}

.header-nav {
  display: flex;
  justify-content: space-between;
}

.logo {
  display: inline-block;
  font-size: 2rem;
  font-weight: bold;
  color: white;
  margin: 0;
}
</style>
