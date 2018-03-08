<template>
  <div class="box">
    <div class="childBox">
      <div class="top">
        <Input v-model="user" placeholder="用户名" style="width: 300px" />
      </div>
      <div class="top">
        <Input v-model="pwd" placeholder="登录密码" style="width: 300px" />        
      </div>
      <div class="top">
        <Button type="primary" size="large">登录</Button> <span class="goRegister">没有账号？去注册...</span> 
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      user: "",
      pwd: ""
    };
  },
  created() {
    this.$ajax({
      url: "/api/Classify/groupMore",
      method: "post",
      data: {
          goods_id :21
      }
    }).then(r=>{
      console.log(r)
    });
  }
};
</script>

<style scoped>
.box {
  position: relative;
  width: 100%;
  height: 100%;
}
.childBox {
  position: absolute;
  width: 500px;
  height: 300px;
  background-color: rgba(255, 255, 255, 0.8);
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  border-radius: 5px;
  text-align: center;
}
.top {
  margin-top: 50px;
}
.goRegister {
  margin-left: 12px;
  font-size: 12px;
  cursor: pointer;
  text-decoration: underline;
  transition: all 0.3s cubic-bezier(0.165, 0.84, 0.44, 1);
}
.goRegister:hover {
  color: chocolate;
}
</style>
