import Vue from 'vue'
import RouterR from 'vue-router'
import App from './App'
import rou from './router/index'
import iView from 'iview';
import 'iview/dist/styles/iview.css';
import axios from './api/axios';
import tit from './api/title';
import mavonEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'
// use
Vue.use(mavonEditor)
Vue.prototype.$ajax = axios;



Vue.use(iView)
Vue.use(RouterR)



const router = new RouterR({
  routes: rou
})

router.afterEach((transition) => {
  setTimeout(function () {
    iView.LoadingBar.finish();
  },2000)
  let title = transition.meta.title;
  tit.SetTitle(title)
});

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
