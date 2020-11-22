/**
 * bootstrap-table 表格中的值改变，同步data的值
 */
$(function () {
    request_getList();
})
function loadData(listInfo) {
    $("#tbl").bootstrapTable({
        // toolbar: '#toolbar',                //工具按钮用哪个容器
        sort : true,
        striped: true,                      //是否显示行间隔色
        smartDisplay:false,
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber:1,                       //初始化加载第一页，默认第一页
        pageSize: 10,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        search: true,                      //是否显示表格搜索，此搜索是客户端搜索，不会进服务端
        showColumns: false,                 //是否显示所有的列
        showRefresh: true,                 //是否显示刷新按钮
        clickToSelect: true,                //是否启用点击选中行
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        columns: columnsData,
        data : listInfo                     //列设置
    });
}
function request_getList() {
    $.ajax({
        url:"/shortVideo/getList" ,
        type:"POST" ,
        success:function (data) {
            loadData(data);
        },//响应成功后的回调函数
        dataType:"json"//设置接受到的响应数据的格式
    });
}

/**
 * 当input改变时记录值
 *
 * @param key
 */
function getValue(key) {
    var arr = key.split("-");
    $('#tbl').bootstrapTable('updateCell', {
        index: arr[1],
        field: arr[0],
        value: $("#" + key).val()
    })
}


