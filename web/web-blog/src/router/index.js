import logo from '@/components/logo';
import admin from '../vive/index.vue';
import register from '@/components/register';
import aboutBlog from '../vive/aboutBlog/index.vue';
import notice from '../vive/notice/index.vue';
import motto from '../vive/motto/index.vue';
import link from '../vive/link/index.vue';
import article from '../vive/article/index.vue'
import study from '../vive/study/index.vue'
import moodRelease from '../vive/mood/release.vue'
import adminMood from '../vive/mood/adminMood.vue'
import articleAdmin from '../vive/article/admin.vue'
import studyAdmin from '../vive/study/admin.vue'
import album from '../vive/album/index'
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
          path:'/moodRelease',
          name:'moodRelease',
          component:moodRelease,
          meta:{
            title:'你的心情'
          }
        },
        {
          path:'/adminMood',
          name:'adminMood',
          component:adminMood,
          meta:{
            title:'管理你的心情'
          }
        },
        {
          path:'/article',
          name:'article',
          component:article,
          meta:{
            title:'发布文章'
          }
        },
        {
          path:'/articleAdmin',
          name:'articleAdmin',
          component:articleAdmin,
            meta:{
              title:'管理文章'
            }
        },
        {
          path:'/study',
          name:'study',
          component:study,
          meta:{
            title:'学习笔记'
          }
        },
        {
          path:'/studyAdmin',
          name:'studyAdmin',
          component:studyAdmin,
          meta:{
            title:'管理你的笔记'
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
        },
        {
          path:"/album",
          name:"album",
          component:album,
          meta:{
            title:'你的相册'
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
