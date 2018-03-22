<template>
  <div>
      <div class="box">
          <div class="title">
              相册  &nbsp;&nbsp;&nbsp;&nbsp;<span @click="modal1 =true" class="add"><Icon type="plus-round"></Icon> 添加相册</span> 
          </div>
          <div class="box">
              <div class="album" v-for="inv in 10">
                <!-- <router-link to="/album"> -->
                  <div>
                    <div class="img"> 
                      <span class="delIcon" @click="del()"><Icon type="trash-a"></Icon></span>
                      <img src="../../assets/9k=.jpg" alt=""  @click="routAlbum(id)">
                    </div>
                    <p class="name">这是相册的名称</p>
                  </div>
                <!-- </router-link> -->
              </div>
          </div>
      </div>
      <div class="mask" v-show="modal1" @click="modal1=false"></div>
      <div class="addBox" v-show="modal1">
          <p class="name2">名称：<i-input :value.sync="name" placeholder="请输入相册名称" style="width: 300px"></i-input></p>
          <p class="name2">简介：<i-input :value.sync="brief " placeholder="请输入相册简介" style="width: 300px"></i-input></p>
          <p class="name2">
            <Radio-group v-model="look2">
                <Radio label="y">
                    <span>公开</span>
                </Radio>
                <Radio label="n">
                    <span>不公开</span>
                </Radio>
                <Radio label="t">
                    <span>回答问题可见</span>
                </Radio>
            </Radio-group>
          </p>
          <p class="name2" v-show='look2=="t"'>
            问题：<i-input :value.sync="question " placeholder="请输入问题" style="width: 100px"></i-input>
            答案：<i-input :value.sync="answer " placeholder="请输入问题答案" style="width: 100px"></i-input>
          </p>
          <p style="text-align: center;margin-top:24px;">
            <Button type="ghost" @click="modal1=false">取消</Button>&nbsp;&nbsp;&nbsp;
            <Button type="ghost" @click="okadd()">添加</Button>
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
      answer: "", //答案
      look2: "y" //可见程度
    };
  },
  created() {
    this.getAlbum();
  },
  methods: {
    getAlbum() {
      this.$ajax({
        url: "/getAlbumPoList.do",
        method: "post",
        data: {}
      }).then(r => {
        console.log(r);
      });
    },
    routAlbum(id) {
      this.$router.push({ path: "/album" });
    },
    okadd() {
      this.$ajax({
        url: "/addAlbumPo.do",
        method: "post",
        data: {
          albumName: this.name,
          summary: this.brief,
          isShow: this.look2,
          question: this.question,
          answer: this.answer
        }
      }).then(r => {
        console.log(r);
      });
    },
    del(id) {
      this.$ajax({
        url:"/deleteAlbumPoById.do",
        method:'post',
        data:{
            album_id:id,
        }
      }).then(r=>{
        console.log(r)
      })
    }
  }
};
</script>
<style lang="less" scoped>
.mask {
  width: 100%;
  position: fixed;
  top: 0;
  left: 0;
  z-index: 6;
  right: 0;
  height: 100%;
  background-color: rgba(5, 5, 5, 0.4);
}
.addBox {
  width: 400px;
  z-index: 6;
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
.name2 {
  font-size: 14px;
  margin-bottom: 14px;
}
.delIcon {
  position: absolute;
  top: 4px;
  width: 20px;
  height: 20px;
  right: 7px;
  z-index: 3;
  text-align: center;
  line-height: 20px;
}
</style>
