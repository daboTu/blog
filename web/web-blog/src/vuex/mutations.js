import * as types from './mutation-types';
 const mutations = {
 		[types.SET_USERINFO](state,data){
 			state.userinfo = data;
 		}
 };

 export default mutations;