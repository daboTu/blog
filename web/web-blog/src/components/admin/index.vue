<template>
  <div class='box'>
      <div  class="title">
        <p class="tlt"> 管理你的文章</p>
        <p class="inpu"><i-input size="small"   placeholder="搜索关键字..."></i-input></p>
        <p class="startTime">
            <i-col span="12">
                <Date-picker type="date" size="small" placeholder="选择开始日期" style="width: 200px"></Date-picker>
            </i-col>
        </p>
        <p class="endTime">
            <i-col span="12">
                <Date-picker type="date" size="small" placeholder="选择结束日期" style="width: 200px"></Date-picker>
            </i-col>
        </p>
        <p class="but">
            <i-button type="primary" shape="circle" icon="ios-search" size='small'></i-button>
        </p>
      </div>
      <div v-for="ind in 8">
        <div class="contBox">
            <div class="contImg">
                <img src="../../assets/9k=.jpg" alt="">
            </div>
            <div class="contText">
                <div class="titText">
                    <span class="tit">这是我的第一条博客</span>
                    <span class="open"> <Checkbox :checked.sync="pubopen">不公开</Checkbox> </span>
                    <span class="del"><Icon type="ios-trash"></Icon> 删除</span>
                    <span class="updet"><Icon type="ios-compose-outline"></Icon> 编辑</span>
                </div>
                <div class="content">
                    斯蒂芬·威廉·霍金（Stephen William Hawking，1942年1月8日~2018年3月14日），出生于英国牛津，英国剑桥大学著名物理学家，现代最伟大的物理学家之一、20世纪享有国际盛誉的伟人之一。
                    霍金21岁时患上肌肉萎缩性侧索硬化症（卢伽雷氏症），全身瘫痪，不能言语，手部只有三根手指可以活动。1979至2009年任卢卡斯数学教授，主要研究领域是宇宙论和黑洞，证明了广义相对论的奇
                    性定理和黑洞面积定理，提出了黑洞蒸发理论和无边界的霍金宇宙模型，在统一20世纪物理学的两大基础理论——爱因斯坦创立的相对论和普朗克创立的量子力学方面走出了重要一步。[1]  获得CH（
                    英国荣誉勋爵）、CBE（大英帝国司令勋章）、FRS（英国皇家学会会员）、FRSA（英国皇家艺术协会会员）等荣誉。
                </div>
                <div class="option">
                    <span><Icon type="ios-chatboxes"></Icon>123</span>
                    <span class="preview"><Icon type="ios-eye"></Icon>123</span>
                    <span><Icon type="android-favorite-outline"></Icon>11</span>
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
      pubopen: false
    };
  }
};
</script>
<style lang="less" scoped>
.box {
  padding: 12px 0 45px ;
}
.title {
  background-color: rgba(255, 255, 255, 0.63);
  line-height: 45px;
  padding: 0 24px;
  color: #666;
  font-size: 14px;
  display: flex;
  .tlt {
    width: 140px;
  }
  .inpu {
    width: 160px;
  }
  .startTime {
    margin: 0 24px;
  }
  .but {
    margin: 0 24px;
  }
}
.contBox {
  display: flex;
  padding: 24px;
  background-color: rgba(255, 255, 255, 0.63);
  margin-bottom: 12px;
}
.contImg {
  width: 150px;
  margin-right: 24px;
  height: 150px;
  overflow: hidden;
  position: relative;
  img {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    height: 100%;
  }
}
.contText {
  flex: 1;
}
.titText {
  font-size: 12px;
  display: flex;
  line-height: 25px;
  span{
    cursor: pointer;
    color: #520000;
  }
  .tit {
    flex: 1;
    font-size: 18px;
    font-weight: 600;
    color: #666;
  }
  .del {
    margin: 0 12px;
  }
}
.content {
  padding: 12px 0 0 0;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 4;
  overflow: hidden;
  line-height: 20px;
  font-size: 12px;
  height: 90px;
  margin-bottom: 12px
}
.option {
    text-align: right;
    font-size: 14px;
    line-height: 20px;
    color: #520000;
    cursor: pointer;
    .preview{
        margin: 0 12px;
    }    
}
</style>
