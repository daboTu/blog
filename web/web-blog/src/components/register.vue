<template>
  <div class="box">
    <div class="childBox">
      <div class="top">
        <Input v-model="user" placeholder="用户名" style="width: 300px" />
      </div>
      <div class="top">
        <RadioGroup v-model="sex">
            <Radio label="0">
                <Icon type="man"></Icon>
                <span>男</span>
            </Radio>
            <Radio label="1">
               <Icon type="woman"></Icon>
                <span>女 </span>
            </Radio>
        </RadioGroup>     
      </div>
      <div class="top">
        <Input v-model="pwd" placeholder="登录密码" style="width: 300px" />        
      </div>
      <div class="top">
        <Input v-model="pwds" placeholder="确认密码" style="width: 300px" />        
      </div>
      <div class="top">
        <Input v-model="email" placeholder="email" type="email" style="width: 300px" />        
      </div>
      <div class="top">
        <Button type="primary" size="large" @click="register">立即注册</Button> <span class="goRegister"><router-link to='/#'> 有账号！去登录</router-link></span> 
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
        user:'',
        pwd:'',
        pwds:'',
        email:'',
        sex:'0'
    }
  },
  methods:{
    // register(){
    //   console.log(1)
    //   this.$ajax({
    //     url:'register.do',
    //     method:'post',
    //     data:{
    //       userName:this.user,
    //       passWord:this.pwd,
    //       sex:this.sex,
    //       isAdmin:'n'
    //     }
    //   }).then(r=>{
    //     console.log(r)
    //   })
    // }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .box{
    position: relative;
    width: 100%;
    height: 100%;
  }
  .childBox{
    position: absolute;
    width: 500px;
    height: 360px;
    background-color: rgba(255,255,255,.8);
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    border-radius: 5px; 
    text-align: center;
  }
  .top{
    margin-top: 20px;
  }
  .goRegister{
    margin-left: 12px;
    font-size: 12px;
    cursor: pointer;
    text-decoration:underline;
    transition: all .3s cubic-bezier(0.165, 0.84, 0.44, 1);
  }
  .goRegister:hover{
    color:chocolate;
  }
</style>
