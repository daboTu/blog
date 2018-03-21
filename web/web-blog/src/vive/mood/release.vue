<template>
  <div class="blog">
      <div class="about">
          <p>
              心情随笔
          </p>
          <p>
              <Checkbox :checked.sync="pubopen">不公开</Checkbox>
          </p>
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
      mood: "",
      pubopen:false
    };
  },
  creared(){},
  methods:{
      commit(){
          this.$ajax({
              url:'/addMoodPo.do',
              method:'post',
              data:{
                content:this.mood
              } 
         }).then(r=>{
             console.log(r)
         })
      }
  }
};
</script>

<style scoped>
    @import "../aboutBlog/index.css";
</style>