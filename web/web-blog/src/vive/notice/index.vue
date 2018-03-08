<template>
  <div class="blog">
      <div class="about">
          公告
      </div>
      <div class="from">
          <p><Input v-model="notice" type="textarea" :rows="4" placeholder="公告..." /></p>      
          <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            <Button type="primary">提 交</Button></p>
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      notice: "",
    };
  },
  created() {}
};
</script>
<style scoped>
    @import '../aboutBlog/index.css';
</style>
