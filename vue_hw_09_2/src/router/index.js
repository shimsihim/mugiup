import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import LoginForm from "@/components/LoginForm.vue";
import User from "../views/User.vue";
import UserList from "@/components/user/UserList.vue";
import UserRegist from "@/components/user/UserRegist.vue";
import UserDetail from "@/components/user/UserDetail.vue";
import Board from "../views/Board.vue";
import PostList from "@/components/board/PostList.vue"


Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/login",
    name: "Login",
    component: LoginForm,
  },
  {
    path: "/board",
    name: "Board",
    component: Board,
    children:[
      {
        path: "list/:board_id",
        name: "PostList",
        component: PostList,
      },
    ]
  },
  // {
  //   path: "/board",
  //   name: "Board",
  //   component: Board,
  //   children:[
  //     {
  //       path: "/:board_id",
  //       name: "BoardList",
  //       component: BoardList,
  //     },
  //   ],
  // },
  {
    path: "/user",
    component: User,
    children: [
      {
        path: "/regist",
        name: "Regist",
        component: UserRegist,
      },
      {
        path: "",
        name: "List",
        component: UserList,
      },
      {
        path: "/:id",
        name: "Detail",
        component: UserDetail,
      },
      {
        path: "/mypage",
        name: "UserMyPage",
        component: UserDetail,
      },
    ],
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
