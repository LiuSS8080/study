$(function () {
    //点击打开文件
    $("#open-btn").click(function(){
        request_openFile();
    });
})

/**
 * 请求打开文件
 */
function request_openFile() {
    $.ajax({
        url:"/test/openFile?fileName=1.xlsx" ,
        type:"get" ,
        success:function (data) {
            alert(data);
        }
    });
}