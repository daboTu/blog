<template>
  <div class="blog">
      <div class="about">
          友情链接
      </div>
      <div class="from">
          <span v-for= " (val,index) in cont"><Tag closable  @on-close="handleClose(val.link_id)">友链1</Tag></span>
          <div>
              <p><span>友情链接名称：</span><Input v-model="name" placeholder="名称" style="width: 300px" /></p>
              <p><span>友情链接地址：</span><Input v-model="www" placeholder="网址" style="width: 300px" /></p>
              <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            <Button type="primary" @click="commit()">提 交</Button> </p>
          </div>
      </div>
  </div>
</template>
<script>
export default {
    data(){
        return{
            name:'',
            www:'',
            cont:[]
        }
    },
    created(){
        this.$ajax({
            url:'/getLinkList.do',
            method:"post",
            data:{}
        }).then(r=>{
           this.cont=r
        })
    },
    methods:{
        handleClose(link){
            this.$ajax({
                url:'/deleteLinkPo.do',
                method:'post',
                data:{
                    link_id:link
                }
            }).then(r=>{
                console.log(r)
            })
        },
        commit(){
            this.$ajax({
                url:'/addLinkPo.do',
                method:'post',
                data:{
                    linkName:this.name,
                    linkUrl:this.www
                }
            }).then(r=>{
                console.log(r)
            })
        }
    }
};
</script>
<style scoped>
@import "../aboutBlog/index.css";
</style>
