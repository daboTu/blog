<template>
  <div class="blog">
      <div class="about">
          座右铭
      </div>
      <div class="from">
          <p><Input v-model="motto" type="textarea" :rows="4" placeholder="座右铭..." /></p>      
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
      motto: "",
    };
  },
  created() {}
};
</script>
<style scoped>
    @import '../aboutBlog/index.css';
</style>
