<template>
  <div id="app">
    <div class="box"> 
       <router-view/>
    </div>
  </div>
</template>

<script>import {mapState} from "vuex"

export default {
  data(){
    return{
      
    }
  },
  created(){
    console.log(this.userinfo)
  },
  computed:{
    ...mapState(['userinfo'])
  },
  watch:{
    "$route":function(to , from){

        console.log('走了！')
    }
  }
}
</script>

<style>
  @import 'assets/public.css';
  #app{
      background-image: url(./assets/9k=.jpg);
      background-repeat: no-repeat;
      background-position: 50% 0;
      /* background-size: contain; */
      height: 100%;
      position:fixed;
      width: 100%;
    }
    .box{
      overflow: auto;
      height: 100%;
    }
</style>
