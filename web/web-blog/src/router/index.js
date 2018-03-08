import logo from '@/components/logo';
import admin from '../vive/index.vue';
import register from '@/components/register';
import aboutBlog from '../vive/aboutBlog/index.vue';
import notice from '../vive/notice/index.vue';
import motto from '../vive/motto/index.vue';
import link from '../vive/link/index.vue';
import study from '../vive/pub/study.vue'
export default [
    {
      path: '/',
      name: 'logo',
      component: logo,
      meta : {
        title : '欢迎登录我的博客后台'
      }
    },
    {
      path:'/admin',
      name:'admin',
      component:admin,
      meta : {
        title : '欢迎进入我的博客后台'
      },
      children:[
        {
          path:'/aboutBlog',
          name:'aboutBlog',
          component:aboutBlog,
          meta:{
            title:'关于博主-管理'
          }
        },
        {
          path:'/study',
          name:'study',
          component:study,
          meta:{
            title:'发布信息'
          }
        },
        {
          path:'/notice',
          name:'notice',
          component:notice,
          meta:{
            title:'公告'
          }
        },
        {
          path:'/motto',
          name:'motto',
          component:motto,
          meta:{
            title:'座右铭'
          }
        },
        {
          path:'/link',
          name:'link',
          component:link,
          meta:{
            title:'管理-友情链接'
          }
        }
      ]
    },
    {
      path:'/register',
      name:'register',
      component:register,
      meta:{
        title:"欢迎注册"
      }
    }
  ]
