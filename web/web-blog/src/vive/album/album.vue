<template>
  <div>
      <div class="box">
          <div class="title">
              相册  &nbsp;&nbsp;&nbsp;&nbsp;<span @click=" modal1 =true" class="add"><Icon type="plus-round"></Icon> 添加相册</span> 
          </div>
          <div class="box">
              <div class="album" v-for="inv in 10">
                <router-link to="/album">
                  <div>
                    <div class="img">
                      <img src="../../assets/9k=.jpg" alt="">
                    </div>
                    <p class="name">这是相册的名称</p>
                  </div>
                </router-link>
              </div>
          </div>
      </div>
      <div class="mask"></div>
      <div class="add">
          <p class="name">名称：<i-input :value.sync="name" placeholder="请输入相册名称" style="width: 300px"></i-input></p>
          <p class="name">简介：<i-input :value.sync="brief " placeholder="请输入相册简介" style="width: 300px"></i-input></p>
          <p class="name">
            <Radio-group :model.sync="look2">
                <Radio value="y">
                    <span>公开</span>
                </Radio>
                <Radio value="n">
                    <span>不公开</span>
                </Radio>
                <Radio value="t">
                    <span>回答问题可见</span>
                </Radio>
            </Radio-group>
          </p>
          <p class="name">
            问题：<i-input :value.sync="question " placeholder="请输入相册名称" style="width: 100px"></i-input>
            答案：<i-input :value.sync="answer " placeholder="请输入相册名称" style="width: 100px"></i-input>
          </p>
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      value: "",
      sho: false,
      modal1: false,
      name: "", //相册名称
      brief: "", //简介
      pubopen: false, //是否公开
      question: "", //问题
      answer: "" ,//答案
      look2:'y',//可见程度
      // y:"y",//可见
      // n:"n",//不可见
      // t:"n",//回答问题可见
    };
  },
  methods: {
    ok() {},
    cancel() {}
  }
};
</script>
<style lang="less" scoped>
.mask {
  width: 100%;
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  height: 100%;
  background-color: rgba(5, 5, 5, 0.4);
}
.add {
  width: 400px;
  height: 300px;
  position: fixed;
  left: 50%;
  padding: 24px;
  margin-left: -200px;
  border-radius: 10px;
  top: 50px;
  background-color: #fff;
}
.box {
  padding: 30px 24px;
}
.title {
  height: 45px;
  line-height: 45px;
  padding-left: 24px;
  font-size: 14px;
  color: #666;
  font-weight: 600;
  background-color: rgba(255, 255, 255, 0.63);
}
.album {
  width: 150px;
  height: 180px;
  display: inline-flex;
  flex-direction: column;
  align-content: flex-start;
  margin-bottom: 24px;
  margin-right: 10px;
  overflow: hidden;
  cursor: pointer;
  box-shadow: 0 0 14px #666;
  border-radius: 3px;
}
.img {
  width: 100%;
  height: 150px;
  position: relative;
}
.img img {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  height: 100%;
}
.name {
  line-height: 30px;
  font-size: 14px;
  color: #333;
  background-color: #fff;
  text-align: center;
}
.add {
  cursor: pointer;
}
</style>
