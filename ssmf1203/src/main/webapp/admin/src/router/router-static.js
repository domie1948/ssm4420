import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import jianzhiyingpin from '@/views/modules/jianzhiyingpin/list'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import jianzhizhaopin from '@/views/modules/jianzhizhaopin/list'
    import shangjiatousu from '@/views/modules/shangjiatousu/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import tousuchuli from '@/views/modules/tousuchuli/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import shangjia from '@/views/modules/shangjia/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/jianzhiyingpin',
        name: '兼职应聘',
        component: jianzhiyingpin
      }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
          ,{
	path: '/jianzhizhaopin',
        name: '兼职招聘',
        component: jianzhizhaopin
      }
          ,{
	path: '/shangjiatousu',
        name: '商家投诉',
        component: shangjiatousu
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/tousuchuli',
        name: '投诉处理',
        component: tousuchuli
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
