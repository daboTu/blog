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
                <DropdownItem><router-link to='/studyAdmin' class='childLink'>管理笔记</router-link></DropdownItem>
                <DropdownItem><router-link to="/study" class='childLink'>发布笔记</router-link></DropdownItem> 
            </DropdownMenu>
        </Dropdown>
       </li>  
       <li class="a" :class="{b:ind==2}" @click="ind=2">
         <Dropdown>
            <p> 分享文章</p>
            <DropdownMenu slot="list">
                <DropdownItem><router-link to='/articleAdmin' class='childLink'>管理文章</router-link></DropdownItem>
                <DropdownItem><router-link to="/article" class='childLink'>发布文章</router-link></DropdownItem> 
            </DropdownMenu>
        </Dropdown>
       </li>

       <li class="a" :class="{b:ind==3}" @click="ind=3">
          <Dropdown>
            <p> 心情随笔</p>
            <DropdownMenu slot="list">
                <DropdownItem><router-link to="/adminMood" class='childLink'>管理心情</router-link></DropdownItem>
                <DropdownItem><router-link to="/moodRelease" class='childLink'>发布心情</router-link></DropdownItem> 
            </DropdownMenu>
          </Dropdown>
       </li>
       <li class="a"><router-link to="/albumAdmin" class='link'><span class="c">相册</span></router-link></li>
       <li class="a"><router-link to="/aboutBlog" class='link'> <span class="c">关于博主</span></router-link></li>
       <li class="a"><router-link to="/notice" class='link'><span class="c">公告</span></router-link></li>
       <!-- <li class="a"><router-link to="/motto"  class='link'><span class="c">座右铭</span></router-link></li> -->
       <li class="a"><router-link to="/link"  class='link'><span class="c">友情链接</span></router-link></li>
       <li class="a"><router-link to="/message"  class='link'><span class="c">我的留言</span></router-link></li>       
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
      ind: 0
    };
  },
  created() {
    window.screenWidth = document.body.clientWidth;
    this.screenWidth = window.screenWidth;
    console.log(document.documentElement.clientHeight);
  }
};
</script>
<style scoped lang='less'>
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
  p{
    width: 100%;
  }
}
.link {
  color: #fff;
  display: block;
  &.router-link-active{
    .c{
      width: 100%;
      height: 100%;
      display: block;
      background-color: rgba(171, 38, 73, 0.5);;
    }
  }
}
.childLink {
  color: #4d4d4d;
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

.b {
  background: rgba(171, 38, 73, 0.5);
}
</style>
