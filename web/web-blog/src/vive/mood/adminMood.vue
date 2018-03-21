<template>
  <div class="mood">
      <h1>管理你的心情</h1>
      <div class="moodBox" v-for='(val , inx ) in cont'>
          <div class="content">
            <div class="time">
              <p class="text-left"><Icon type="clock"></Icon>{{val.createTime}}</p>
              <p><span class="del" @click="del(val.mood_id)">删除</span>&nbsp;&nbsp; <span  @click="upda(val.mood_id),isShow=val.mood_id">编辑</span>&nbsp;&nbsp; <Checkbox :checked.sync="pubopen">不公开</Checkbox> </p> 
            </div>
            <p class="cont">
                <Input v-show="isShow==val.mood_id" v-model="mood" type="textarea" :rows="4" placeholder="心是任何想法都能产生的源泉..."/>
                {{val.content}}
            </p>
          </div>
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      pubopen: false,
      cont: [],
      mood:'',//内容
      isShow:"",
    };
  },
  created() {
    this.$ajax({
      url: "/getMoodList.do",
      method: "post",
      data: {
        pageNum: 1,
        pageSize: 10
      }
    }).then(r => {
      this.cont = r;
      console.log(r);
    });
  },
  methods: {
    del(id) {
      this.$ajax({
        url: "/deleteMoodById.do",
        method: "post",
        data: {
          mood_id: id
        }
      }).then(r => {
        console.log(r);
      });
    },
    upda(id) {
      this.$ajax({
        url: "/updateMoodById.do",
        method: "post",
        data: {
          mood_id: id,
          content:this.mood
        }
      }).then(r => {
        console.log(r);
        this.isShow=""
      });
    }
  }
};
</script>

<style lang="less" scoped>
.mood {
  padding: 30px 0;
  width: 80%;
  margin: 0 auto;
  h1 {
    font-size: 16px;
    color: #b1b1b1;
    font-weight: 300;
    padding: 0 24px;
    background-color: rgba(255, 255, 255, 0.63);
    line-height: 45px;
  }
}
.moodBox {
  width: 100%;
  padding: 5px 24px 20px;
  background-color: rgba(255, 255, 255, 0.8);
  margin-bottom: 24px;
  border-bottom-right-radius: 6px;
  border-bottom-left-radius: 6px;
  .time {
    line-height: 45px;
    color: #999;
    display: flex;
    .text-left {
      text-align: left;
    }
    p {
      flex: 1;
      font-size: 14px;
      text-align: right;
      span {
        color: #ce7400;
        cursor: pointer;
      }
    }
  }
  .cont {
    line-height: 18px;
    font-size: 14px;
    color: #888;
    text-align: justify;
  }
}
</style>

