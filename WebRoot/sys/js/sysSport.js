layui.use(['table','jquery','util'], function(){
  var table = layui.table;
  var $ = layui.$;
  var util = layui.util;
  
  //第一个实例
  table.render({
    elem : '#sysSportTable',
    height : 530,
    url : '/skillCompete/sysSportController/querySportList',
    limits : [10,20,50],
    page : true, //开启分页
    toolbar: 'default',
    cols : [[ //表头
        {type: 'checkbox', fixed: 'left',width:'5%'},
        {field: 'sportid', title: 'ID',align : 'center',width:'10%'},
        {field: 'username', title: '姓名',align : 'center',width:'10%'},
		{field: 'starttime', title: '开始时间',align : 'center',width:'16%',templet:function(d){return util.toDateString(d.starttime, "yyyy-MM-dd HH:mm:ss");}},
		{field: 'endtime', title: '结束时间',align : 'center',width:'16%',templet:function(d){return util.toDateString(d.endtime);}},
		{field: 'sport', title: '运动类型',align : 'center',width:'10%'},
		{field: 'daycount', title: '运动时长(小时)',align : 'center',width:'12%'},
		{field: 'des', title: '运动描述',align : 'center', width:'21.5%'},
    ]],
    id: 'testReload',
    parseData: function(res){//res 即为原始返回的数据
    	return {
        	"code": res.code, //解析接口状态
            "msg": res.mgs, //解析提示文本
            "count": res.count, //解析数据长度
            "data": res.data //解析数据列表
        };
      }
  });
  
  $('#bt1').click(function() {
	  var namekey = $('#namekey').val();
	  table.reload('testReload',{
		    url : '/skillCompete/sysSportController/querySport',
		    where : {
		    	username : namekey
		    },
		  }); 
  });
  
//监听头工具栏事件
  table.on('toolbar(sysSportTable)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    data = checkStatus.data; //获取选中的数据
    switch(obj.event){
      case 'add':
        //跳转到新增页面
    	  layer.open({
    		  type:2,
    		  shade:0.1,
    		  title:'' +
              '<li id="icon" class="layui-icon layui-icon-tabs layui-anim layui-anim-scaleSpring" ' +
              'style="font-size: 30px; color: #009688;" data-anim="layui-anim-scaleSpring"></li>新增页面',
    		  area:['450px','370px'],
    		  content:'sys/jsp/sportadd.jsp'
    	  });
      break;
      case 'update':
        if(data.length === 0){
          layer.msg('请选择一行');
        } else if(data.length > 1){
          layer.msg('只能同时编辑一个');
        } else {
          layer.alert('编辑 [姓名]：'+ checkStatus.data[0].username);
        }
      break;
      case 'delete':
        if(data.length === 0){
          layer.msg('请选择一行');
        } else if(data.length > 1){
          layer.msg('只能同时删除一个');
        }else {
          layer.confirm('确认删除此行？',{btn:['yes','no']},function(index){
        	  delByName(checkStatus.data[0].sportid);
          });
        }
      break;
    };
  });
  
  function delByName(sportid) {
		$.ajax({
			url : '/skillCompete/sysSportController/removeSport',
			data : {sportid : sportid},
			dataType : 'json',
			type : 'POST',
			success : function(data) {
				if(data.code == 0) {
					layer.msg('删除成功');
					table.reload('testReload',{
						url : '/skillCompete/sysSportController/querySportList'
							}
					);
				} else {
					layer.msg('删除失败');
				}
			}
		});
	};
}); 



