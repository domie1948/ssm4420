const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmf1203/",
            name: "ssmf1203",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmf1203/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "大学生兼职跟踪系统"
        } 
    }
}
export default base
