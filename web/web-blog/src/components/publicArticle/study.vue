<template>
  <div>
      <div class="box">
          <p class="title">发布文章</p>
          <div class="contBox">
              <div class="tit">
                  <div class="titBox">
                      <span>标题：</span>
                      <Input v-model="name" placeholder="标题" style="width: 80%" />
                  </div>
                  <div class="titBox">
                      <span>分类：</span>
                      <Select v-model="constellation" style="width:300px">
                        <Option v-for="item in 3"  :value="item" >item</Option>
                      </Select>
                  </div>
              </div>
              <div>
                  <mavon-editor style=" max-height:600px" v-model="value"  :ishljs = "true" @change="vu"/>
              </div>
              <div>
                 <div class="tit">
                  <div class="titBox">
                        <span>版权声明：</span>
                        <Input v-model="copyright" style="width: 80%" />
                  </div>
                  <div class="titBox">
                        <span>转载请注明：</span>
                        <Input v-model="prompt"   style="width: 80%" />
                  </div>
              </div>
              </div>
          </div>
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      name: "",//标题
      value:'',//文本内容
      constellation:'',//下拉内容分类
      copyright:'', //版权声明
      prompt:'',//注明
    };
  },
  created(){
    console.log(this)
  },
  methods:{
      vu(){
          console.log(this.value,111)
      }
  }
};
</script>
<style scoped>
@import "./public.css";
</style>
