<template>
  <div class="blog">
      <div class="about">
          公告 &nbsp;&nbsp;&nbsp;&nbsp;<span class="tie"><Input v-model="title" type="text" size="small" placeholder="标题" /></span>
          &nbsp;&nbsp;&nbsp;&nbsp;<Checkbox v-model="pubopen">不公开</Checkbox>
      </div>
      <div class="from">
          <p><Input v-model="notice" type="textarea" :rows="4" placeholder="公告..." /></p>      
          <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            <Button type="primary" @click="commit">提 交</Button></p>
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      notice: "",
      title: "",
      pubopen: false
    };
  },
  created() {},
  methods: {
    commit() {
      this.$ajax({
        url: "/addNoticePo.do",
        method: "post",
        data: {
          title: this.title,
          content:this.notice,
          isShow:this.pubopen?"y":"n"
        }
      }).then(r => {
        console.log(r)
      });
    }
  }
};
</script>
<style scoped>
@import "../aboutBlog/index.css";
</style>
  
