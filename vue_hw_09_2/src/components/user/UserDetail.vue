<template>
  <div class="container">
    <h2>회원 정보</h2>
    <fieldset class="text-center">
      <label for="user_id">아이디</label>
      <input
        readonly
        type="text"
        id="user_id"
        v-model="loginUser.user_id"
        class="view"
      /><br />
      <label for="user_pw">비밀번호</label>
      <input
        type="password"
        id="user_pw"
        v-model="loginUser.user_pw"
        class="view"
      /><br />

      <label for="user_name">이름</label>
      <input type="text" id="user_name" v-model="loginUser.user_name" class="view" /><br />
      <label for="user_email">이메일</label>
      <input type="email" id="user_email" v-model="loginUser.user_email" class="view" /><br />
      <label for="user_phone">휴대폰번호</label>
      <input type="text" id="user_phone" v-model="loginUser.user_phone" class="view" /><br />
      <label for="user_nickname">닉네임</label>
      <input type="text" id="user_nickname" v-model="loginUser.user_nickname" class="view" /><br />


      <button class="btn" @click="updateUser">수정</button>
      <button class="btn" @click="deleteUser">삭제</button>
    </fieldset>
  </div>
</template>
<script>
import { mapState } from "vuex";
export default {
  name: "UserDetail",
  methods: {
    updateUser() {
      this.$store.dispatch("updateUser", this.loginUser);
    },
    deleteUser() {
      this.$store.dispatch("deleteUser", this.loginUser.user_id);
    },
    // async setUser(user_id) {
    //   await this.$store.dispatch("setUser", user_id);
    // },
  },
  computed: {
    ...mapState(["loginUser"]),
    //관리자용
  //   ...mapState(["user"]),
  // },
  // created() {
  //   const pathName = new URL(document.location).pathname.split("/");
  //   const id = pathName[pathName.length - 1];
  //   this.setUser(id);
   },
};
</script>
