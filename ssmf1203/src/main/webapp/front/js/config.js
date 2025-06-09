
var projectName = '大学生兼职跟踪系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '兼职招聘',
	url: './pages/jianzhizhaopin/list.html'
}, 

{
	name: '兼职论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '系统公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmf1203/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"兼职招聘","menuJump":"列表","tableName":"jianzhizhaopin"}],"menu":"兼职招聘管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"兼职应聘","menuJump":"列表","tableName":"jianzhiyingpin"}],"menu":"兼职应聘管理"},{"child":[{"buttons":["查看","修改","删除","审核","处罚"],"menu":"商家投诉","menuJump":"列表","tableName":"shangjiatousu"}],"menu":"商家投诉管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"投诉处理","menuJump":"列表","tableName":"tousuchuli"}],"menu":"投诉处理管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","应聘"],"menu":"兼职招聘列表","menuJump":"列表","tableName":"jianzhizhaopin"}],"menu":"兼职招聘模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"兼职招聘","menuJump":"列表","tableName":"jianzhizhaopin"}],"menu":"兼职招聘管理"},{"child":[{"buttons":["查看","审核"],"menu":"兼职应聘","menuJump":"列表","tableName":"jianzhiyingpin"}],"menu":"兼职应聘管理"},{"child":[{"buttons":["查看","支付"],"menu":"投诉处理","menuJump":"列表","tableName":"tousuchuli"}],"menu":"投诉处理管理"}],"frontMenu":[{"child":[{"buttons":["查看","应聘"],"menu":"兼职招聘列表","menuJump":"列表","tableName":"jianzhizhaopin"}],"menu":"兼职招聘模块"}],"roleName":"商家","tableName":"shangjia"},{"backMenu":[{"child":[{"buttons":["查看","删除","投诉"],"menu":"兼职应聘","menuJump":"列表","tableName":"jianzhiyingpin"}],"menu":"兼职应聘管理"},{"child":[{"buttons":["查看","删除"],"menu":"商家投诉","menuJump":"列表","tableName":"shangjiatousu"}],"menu":"商家投诉管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","应聘"],"menu":"兼职招聘列表","menuJump":"列表","tableName":"jianzhizhaopin"}],"menu":"兼职招聘模块"}],"roleName":"学生","tableName":"xuesheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
