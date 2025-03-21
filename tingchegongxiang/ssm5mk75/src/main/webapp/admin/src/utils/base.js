const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5mk75/",
            name: "ssm5mk75",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5mk75/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "停车共享小程序"
        } 
    }
}
export default base
