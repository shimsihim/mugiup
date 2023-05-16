
<template>
  <div>
    <h2>게시판 뷰</h2>
    <board-nav></board-nav>
    <router-view></router-view>
    <hr />
  </div>
</template>

<script>
import BoardNav from "@/components/board/BoardNav.vue"
export default {
  name: "Board",
  components : {
    BoardNav,
  }
};
</script>



