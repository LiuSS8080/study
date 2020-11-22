columnsData = [
    {
        checkbox: true,
        width:60
    },
    {
        field: "id",
        title:'id',
        sortable : true   //列是否需要排序
    },
    {
        field:'areaId',
        title:'区域id',
        sortable : true
    },{
        field:'areaName',
        title:'areaName',
        sortable : true
    },{
        field:'projectId',
        title:'projectId'
    },{
        field:'projectName',
        title:'projectName'
    },{
        field:'total',
        title:'total',
        formatter:function(value,row,index) {
            //解决翻页input变回默认值
            var key = this['field'] + "-" + index;
            return '<input id="'
                + key
                +'" value="'
                + value
                + '" onchange="getValue(\''
                + key
                + '\')">';
        }
    },{
        field:'createTime',
        title:'createTime',
        sortable : true
    },{
        field:'updateTime',
        title:'updateTime',
        sortable : true
    }
];
serverData = [
    {
        id : "1",
        name : "aaa",
        age : 20
    },{
        id : "2",
        name : "bbb",
        age : 20
    },{
        id : "3",
        name : "ccc",
        age : 20
    },{
        id : "4",
        name : "ddd",
        age : 20
    }
]