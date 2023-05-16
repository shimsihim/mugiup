<template>
  <div class="container">
    <h2>회원 가입</h2>
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
      <label for="user_name">이름</label>
      <input type="text" id="user_name" v-model="user_name" class="view" /><br />
      <label for="user_email">이메일</label>
      <input type="email" id="user_email" v-model="user_email" class="view" /><br />
      <label for="user_phone">휴대폰번호</label>
      <input type="text" id="user_phone" v-model="user_phone" class="view" /><br />
      <label for="user_nickname">닉네임</label>
      <input type="text" id="user_nickname" v-model="user_nickname" class="view" /><br />
      <!-- <label for="age">나이</label>
      <input type="number" id="age" v-model="age" class="view" /><br /> -->
      <button class="btn" @click="regist">등록</button>
      <button class="btn" @click="getInfoFromAPI">랜덤</button>
    </fieldset>
  </div>
</template>
<script>
import { mapState } from "vuex";
export default {
  name: "UserList",
  data() {
    return {
      user_id: "",
      user_pw: "",
      user_name: "",
      user_email: "",
      user_phone: "",
      user_nickname: "",
      //age: 0,
      //img: "",
    };
  },
  methods: {
    async getInfoFromAPI() {
      await this.$store.dispatch("setRandomUser");
      this.id = this.randomUser.id;
      this.password = this.randomUser.password;
      this.name = this.randomUser.name;
      this.email = this.randomUser.email;
      //this.age = this.randomUser.age;
    },
    regist() {
      if (
        this.id === "" ||
        this.password === "" ||
        this.name === "" ||
        this.email === ""
      ) {
        alert("모든 내용을 입력해주세요");
        return;
      }

      let user = {
        user_id: this.user_id,
        user_pw: this.user_pw,
        user_name: this.user_name,
        user_email: this.user_email,
        user_phone: this.user_phone,
        user_nickname: this.user_nickname,
        //age: this.age,
        //img: "#",
      };

      this.$store.dispatch("createUser", user);
    },
  },
  computed: {
    ...mapState(["randomUser"]),
  },
};
</script>
