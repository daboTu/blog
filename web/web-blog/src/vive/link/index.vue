<template>
  <div class="blog">
      <div class="about">
          友情链接
      </div>
      <div class="from">
          <Tag closable @on-close="handleClose">友链1</Tag>
          <Tag closable @on-close="handleClose">友链2</Tag>
          <Tag closable @on-close="handleClose">友链3</Tag>
          <div>
              <p><span>友情链接名称：</span><Input v-model="name" placeholder="名称" style="width: 300px" /></p>
              <p><span>友情链接地址：</span><Input v-model="www" placeholder="网址" style="width: 300px" /></p>
              <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            <Button type="primary">提 交</Button> </p>
          </div>
      </div>
  </div>
</template>
<script>
export default {
    data(){
        return{
            name:'',
            www:''
        }
    },
    methods:{
        handleClose(){
            
        }
    }
};
</script>
<style scoped>
@import "../aboutBlog/index.css";
</style>
