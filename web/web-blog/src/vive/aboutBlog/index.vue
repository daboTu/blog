<template>
  <div class="blog">
      <div class="about">
          关于博主
      </div>
      <div class="from">
          <p><span>姓名：</span><Input v-model="name" placeholder="姓名 / 笔名" style="width: 300px" /></p>
          <p><span>性别：</span> 
            <RadioGroup v-model="sex">
            <Radio label="0"><Icon type="man"></Icon><span>男</span></Radio>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <Radio label="1"><Icon type="woman"></Icon><span>女 </span></Radio>
        </RadioGroup></p>
        <p>
           <span>星座：<Select v-model="constellation" style="width:300px">
                    <Option v-for="item in cityList" :value="item.value" :key="item.label">{{ item.value}}</Option>
                </Select>
           </span>
        </p>
          <p><span>职业：</span><Input v-model="Occupation" placeholder="职业" style="width: 300px" /></p>
          <p><span>爱好：</span><Input v-model="lick" placeholder="爱好" style="width: 300px" /></p>
          <p><span>其他：</span><Input v-model="outh" placeholder="其他" style="width: 300px" /></p>
          <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            <Button type="primary" @click="updateAboutBlog">提 交</Button></p>
      </div>
  </div>
</template>
<script>
import cityLists from "../../api/constellation.js";

export default {
  data() {
    return {
      name: "",
      sex: "0",
      cityList: cityLists,
      constellation: "",
      Occupation: "",
      lick: "",
      outh: ""
    };
  },
  created() {
    this.$ajax({
      url: "/getAboutBlogPo.do",
      method: "post",
      data: {}
    }).then(r => {
      this.name=r.data.name;
      this.sex=r.data.sex;
      this.constellation=r.data.constellatory;
      this.Occupation=r.data.job;
      this.lick=r.data.favorate;
      this.outh=r.data.other;

      console.log(r)
    });
  },
  methods: {
    updateAboutBlog() {
      this.$ajax({
        url: "/updateAboutBlog.do",
        method: "post",
        data: {
          name:this.name,
          sex:this.sex,
          constellatory:this.constellation,
          favorate : this.lick,
          job:this.Occupation,
          other:this.outh
        }
      }).then(r => {
        console.log(r);
      });
    }
  }
};
</script>
<style scoped>
@import "./index.css";
</style>
