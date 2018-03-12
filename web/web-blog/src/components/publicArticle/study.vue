<template>
  <div>
      <div class="box">
          <div class="title">
              <p> 发布文章</p> 
              <p>
                 <span>
                    <Checkbox :checked.sync="pubopen">不公开</Checkbox>
                 </span> 
                 <span>完成</span>
              </p>
          </div>
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
              <div class="img">
                <p class="ti ">上传展示图片：</p>
                <p class="im">
                    <img src="../../assets/9k=.jpg" alt="">
                </p>
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
      pubopen:false,//是否公开
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
