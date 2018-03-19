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
        <Button type="primary" size="large" @click="login">登录</Button> <span class="goRegister"><router-link to='/register'>没有账号？去注册...</router-link> </span> 
      </div>
    </div>
  </div>
</template>

<script>
import { mapMutations } from "vuex";
export default {
  data() {
    return {
      user: "",
      pwd: ""
    };
  },
  created() {},
  methods: {
    ...mapMutations(["SET_USERINFO"]),
    login() {
      this.$ajax({
        url: "/login.do",
        method: "post",
        data: {
          userName: this.user,
          passWord: this.pwd
        }
      }).then(r => {
        if (r.data.code == "0") {
          this.SET_USERINFO({info:r.data})
          this.$router.push({ path: "/study" });
        } else if (r.data.code == "1") {
          console.log(r.data.message);
        }
      });
    }
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
