<template>
  <div>
      <div class="box">
          <div class="l">
        <h1>上传图片 <span> &nbsp;&nbsp;&nbsp;&nbsp;<Checkbox :checked.sync="pubopen">不公开</Checkbox></span></h1>
        <div class="upBox">
            <div class="img">
               <input type="file" name="file" ref="img" class="element" accept='image/*' @change="upimg($event)">
                <img :src="imgvalue" alt=""/>
            </div>
            <div class="text">
                <span>文字内容说明:</span><i-input :value.sync="value" placeholder="文字内容说明..." style="width: 200px"></i-input>
                <span> <Checkbox :checked.sync="pubopen">不公开</Checkbox></span>
                <span><i-button type="ghost">点我上传</i-button></span>
            </div>
        </div>
    </div>
    <div class="r">
        <h1>管理相册</h1>
        <div class="imgBox">
            <div v-for="ind in 2">
                <p class="time"><Icon type="clock"></Icon>   2018-03-14</p>
                <div>
                    <div class="img-cont" v-for="ind in 5" >
                        <p class="option">
                            <Tooltip content="预览" placement="top"><span @click="aler"><Icon type="ios-eye"></Icon></span>&nbsp;&nbsp;</Tooltip>
                            <Tooltip content="删除" placement="top"><Icon type="ios-trash"></Icon></Tooltip>
                        </p>
                        <img src="../../assets/9k=.jpg" alt="">
                    </div>
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
      value: "",
      imgvalue: "",
      pubopen: false,
      modal1: false
    };
  },
  created(){
    this.getal()
  },
  methods: {
    getal() {
      this.$ajax({
        url: "/getAlbumPoById.do",
        method: "post",
        data: {
          album_id:id,
        }
      }).then(r=>{
        console.log(r)
      })
    },
    upimg(e) {
      const list = this.$refs.img.files;
      const itme = {
        name: list[0].name,
        size: list[0].size,
        file: list[0]
      };
      this.html5Reader(list[0], itme);
    },
    html5Reader(file, time) {
      var self = this;
      const reader = new FileReader();
      reader.onload = e => {
        self.imgvalue = e.target.result;
      };
      reader.readAsDataURL(file);
    },
    ok() {
      this.$Message.info("点击了确定");
    },
    cancel() {
      this.$Message.info("点击了取消");
    },
    aler() {
      this.modal1 = true;
    }
  }
};
</script>
<style lang="less" scoped>
.box {
  display: flex;
  padding: 12px 0;
  .l,
  .r {
    flex: 1;
    padding: 12px 24px;
    background-color: rgba(255, 255, 255, 0.63);
    h1 {
      font-weight: 100;
      color: #666;
    }
  }
}
.l {
  border-right: 1px dotted #dcd6cb;
}
.upBox {
  padding: 24px;
}
.img {
  position: relative;
  width: 100%;
  height: 300px;
  background-image: url(../../assets/xj.png);
  background-position: 50% 50%;
  background-size: 30%;
  background-repeat: no-repeat;
  margin-bottom: 24px;
  overflow: hidden;
  img {
    width: 100%;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
  }
  .element {
    width: 100%;
    position: absolute;
    outline: none;
    opacity: 0;
    top: 0%;
    left: 0%;
    cursor: pointer;
    z-index: 33333;
    height: 100%;
  }
}
.text {
  font-size: 14px;
}
.imgBox {
  padding: 12px 0;
  .time {
    color: #666;
    margin-bottom: 12px;
    font-size: 14px;
  }
}
.img-cont {
  width: 120px;
  height: 120px;
  display: inline-block;
  margin-right: 20px;
  margin-bottom: 12px;
  overflow: hidden;
  position: relative;
  cursor: pointer;
  img {
    height: 100%;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
  }
}
.option {
  position: absolute;
  top: 0;
  height: 20px;
  background-color: rgba(0, 0, 0, 0.2);
  width: 100%;
  z-index: 3;
  text-align: right;
  padding-right: 12px;
  line-height: 20px;
  color: #bf4a03;
}
</style>
