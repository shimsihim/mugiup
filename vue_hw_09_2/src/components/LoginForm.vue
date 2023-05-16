<template>
  <div class="container">
    <h2>로그인</h2>
    <fieldset class="text-center">
      <label for="user_id">아이디</label>
      <input type="text" id="user_id" v-model="user_id" class="view" /><br />
      <label for="user_pw">비밀번호</label>
      <input
        type="password"
        id="user_pw"
        v-model="user_pw"
        class="view"
      /><br />
      <button class="btn" @click="login">로그인</button>
    </fieldset>
  </div>
</template>
<script>
export default {
  name: "LoginForm",
  data() {
    return {
      user_id: "",
      user_pw: "",
    };
  },
  methods: {
    login() {
      let user = {
        user_id: this.user_id,
        user_pw: this.user_pw,
      };

      this.$store.dispatch("setLoginUser", user);
    },
  },
};
</script>
<style></style>
