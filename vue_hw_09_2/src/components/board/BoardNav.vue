<template>
  <header>
    <nav class="board-nav">
      <div>
        <router-link :to="{name: 'PostList', params: {board_id: 1}}" >공지사항</router-link>
        <router-link :to="{name: 'PostList', params: {board_id: 2}}" >자유게시판</router-link>
        <router-link :to="{name: 'PostList', params: {board_id: 3}}" >운동관련정보</router-link>
        <router-link :to="{name: 'PostList', params: {board_id: 4}}" >식단관련정보</router-link>
      </div>
    </nav>
  </header>
</template>

<script>
export default {
  name: "BoardNav",

};
</script>
