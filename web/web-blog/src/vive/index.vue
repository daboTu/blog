<template>
  <div>
    <div class="logo">
      欢迎进入个人博客后台管理系统！
    </div>
    <div class="top">
     <ul class="nev">
       <li class="a" :class="{b:ind==1}" @click="ind=1">
         <Dropdown>
            <p> 学习笔记</p>
            <DropdownMenu slot="list">
                <DropdownItem>管理笔记</DropdownItem>
                <DropdownItem>发布笔记</DropdownItem> 
            </DropdownMenu>
        </Dropdown>
       </li>  
       <li class="a" :class="{b:ind==2}" @click="ind=2">
         <Dropdown>
            <p> 分享文章</p>
            <DropdownMenu slot="list">
                <DropdownItem>管理文章</DropdownItem>
                <DropdownItem>发布文章</DropdownItem> 
            </DropdownMenu>
        </Dropdown>
       </li>

       <li class="a" :class="{b:ind==3}" @click="ind=3">
          <Dropdown>
            <p> 心情随笔</p>
            <DropdownMenu slot="list">
                <DropdownItem>管理心情</DropdownItem>
                <DropdownItem>发布心情</DropdownItem> 
            </DropdownMenu>
          </Dropdown>
       </li>
       <li class="a" :class="{b:ind==4}" @click="ind=4">
          <Dropdown>
            <p> 相册</p>
            <DropdownMenu slot="list">
                <DropdownItem>管理相册</DropdownItem>
                <DropdownItem>发布图片</DropdownItem> 
            </DropdownMenu>
          </Dropdown>
       </li>
       <li class="a" :class="{b:ind==5}" @click="ind=5"><router-link to="/aboutBlog" class='link'> 关于博主</router-link></li>
       <li class="a" :class="{b:ind==6}" @click="ind=6"><router-link to="/notice" class='link'>公告</router-link></li>
       <li class="a" :class="{b:ind==7}" @click="ind=7"><router-link to="/motto"  class='link'>座右铭</router-link></li>
       <li class="a" :class="{b:ind==8}" @click="ind=8"><router-link to="/link"  class='link'>友情链接</router-link></li>
     </ul>   
    </div>
    <div class="info">
        <router-view/>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      ind:0
    };
  },
  created() {}
};
</script>
<style>

</style>

<style scoped>
.info {
  max-width: 1220px;
  min-width: 1000px;
  margin: 0 auto;
}
.top {
  height: 40px;
  max-width: 100%;
  min-width: 1000px;
  background-color: rgba(195, 195, 195, 0.5);
}
.nev {
  min-width: 1000px;
  max-width: 1220px;
  margin: 0 auto;
  display: flex;
}
.nev .a {
  flex: 1;
  text-align: center;
  line-height: 40px;
  cursor: pointer;
  color: #fff;
  transition: all 0.5s;
  position: relative;
}
.link {
  color: #fff;
  display: block;
}
.nev li:hover {
  background: rgba(171, 38, 73, 0.5);
}
.logo {
  min-width: 1000px;
  max-width: 1220px;
  margin: 0 auto;
  font-size: 12px;
  line-height: 20px;
  height: 20px;
  color: #666;
}

li .list {
  position: absolute;
  bottom: top;
  width: 100%;
  /* background: rgba(171, 38, 73, 0.5); */
}
.b{
  background: rgba(171, 38, 73, 0.5);
}
</style>
