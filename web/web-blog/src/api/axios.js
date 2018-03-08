// import store from '../store/store'
import axios from 'axios';
import qs from 'qs';

axios.interceptors.request.use((config) => {
  config.data = qs.stringify(config.data);
  return config;
},function (error) {
  if (error) {
   
  }
  return Promise.reject(error);
});


axios.defaults.timeout = 100000;
axios.interceptors.response.use(function (response) {

//   store.commit('SET_LOADING', {isLoading: false});

  return response;

}, function (error) {
  if (error) {
    // store.commit('SET_LOADING', {isLoading: false})
  }
  return Promise.reject(error)
});
axios.defaults.baseURL = '/api/';
// axios.defaults.baseURL = 'http://ceshi.51bpc.com.cn/'; //配置线上，请求URL

export default axios;
