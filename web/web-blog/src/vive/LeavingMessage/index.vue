<template>
    <div class="box">
        <div class="title">
            网友们给你的建议（留言）
        </div>
        <div class="cont">
            <div class="img"></div>
            <div class="content">
                <p class="con">帐号名称长度为4-30个字符，一个中文字等于2个字符。提交名称前请检测名称是否可用。点击了解更多名称规则</p>
                <p class="input"><i-input :value.sync="value" placeholder="回复（他/她）" style="width: 300px"></i-input> &nbsp;&nbsp;<i-button type="ghost">回复</i-button></p>
            </div>
        </div>
    </div>
</template>
<script>
export default {
  data(){
      return{
          value:''
      }
  }
}
</script>
<style lang="less" scoped>
    .box{
        padding: 24px 0;
    }   
    .title{
        background-color: rgba(255, 255, 255, 0.5);
        line-height: 45px;
        padding: 0 24px;
        font-size: 14px;
        color: #666;
        font-weight: 600;
    }
    .cont{
        display: flex;
        padding: 24px;
        background-color:rgba(255, 255, 255, 0.5);
        border-top: 1px solid #e0e0e0;
    }
    .img{
        width: 45px;
        height: 45px;
        background-image: url(./xr.png);
        background-size: contain;
        background-repeat: no-repeat;
        margin-right:24px ;
    }
    .content{
        width: 100%;
        color: #666;
        font-size: 14px;
    }
    .con{
        margin: 12px 0;
    }
    .input{
        text-align: center;
    }
</style>
