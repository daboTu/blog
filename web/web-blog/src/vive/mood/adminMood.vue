<template>
  <div class="mood">
      <h1>管理你的心情</h1>
      <div class="moodBox" v-for='inx in 15'>
          <div class="content">
            <p class="time"><Icon type="clock"></Icon> 2018-03-09</p>
            <p class="cont">
                时光如水，流淌而过。转眼间邻居家看着我长大的姐姐要举行婚礼了，回首那些年无忧无虑的时光，曾记否，那个下午我不小心在你家睡着了
                ，醒来后你说看我睡得香，不忍叫醒我，于是便由着我在你榻上睡去，一睡就是一个下午；还有那些快乐的周末，我们偷偷去山上摘果......
                那时候的我，总以为长大是一件非常遥远的事情，怎料到，这一转眼，你已为人妻。
            </p>
          </div>
      </div>
  </div>
</template>
<script>
export default {
  data() {
    return {};
  },
  created() {},
  methods: {}
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
  }
  .cont {
    line-height: 18px;
    font-size: 14px;
    color: #888;
    text-align: justify;
  }
}
</style>

