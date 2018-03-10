<template>
  <div class="blog">
      <div class="about">
          心情随笔
      </div>
      <div class="from">
          <Input v-model="mood" type="textarea" :rows="4" placeholder="心是任何想法都能产生的源泉..."/>
          <p>
              <Button type="primary">提 交</Button>
          </p>
          
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      mood: ""
    };
  }
};
</script>

<style scoped>
    @import "../aboutBlog/index.css";
</style>