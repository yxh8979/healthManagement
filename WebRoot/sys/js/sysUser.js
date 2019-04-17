layui.use(['table','jquery','form'], function(){
  var table = layui.table;
  var $ = layui.$;
  var form = layui.form;
  
  //第一个实例
  table.render({
    elem : '#sysUserTable',
    height : 530,
    url : '/skillCompete/sysUserController/queryUserList',
    limits : [10,20,50],
    page : true, //开启分页
    toolbar: 'default',
    where : {name : '111'},
    cols : [[ //表头
        {type: 'checkbox', fixed: 'left',width:'5%'},
        {field: 'username', title: '姓名',align : 'center',width:'10%'},
		{field: 'sex', title: '性别',align : 'center',width:'10%'},
		{field: 'age', title: '年龄',align : 'center',width:'10%'},
		{field: 'height', title: '身高',align : 'center',width:'10%'},
		{field: 'weight', title: '体重',align : 'center',width:'10%'},
		{field: 'frequency', title: '运动频率',align : 'center',width:'10%'},
		{field: 'bmi', title: 'BMI',align : 'center', width:'10%'},
		{field: 'tzl', title: '体脂率',align : 'center', width:'10%'},
		{field: 'bmr', title: 'BMR', align : 'center',width:'10%'},
		{field: 'des', title: '个人简介',align : 'center', width:'20%'},
		//{fixed: 'right', title:'操作', width: '20%', align:'center', toolbar: '#sysUserBar'}
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
		    url : '/skillCompete/sysUserController/queryUser',
		    where : {data : JSON.stringify({
		    	username : namekey
		    })},
		  }); 
  });
  
//监听头工具栏事件
  table.on('toolbar(sysUserTable)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    var data = checkStatus.data; //获取选中的数据
    switch(obj.event){
      case 'add':
        //跳转到新增页面
    	  layer.open({
    		  type:2,
    		  shade:0.1,
    		  title:'' +
              '<li id="icon" class="layui-icon layui-icon-tabs layui-anim layui-anim-scaleSpring" ' +
              'style="font-size: 30px; color: #009688;" data-anim="layui-anim-scaleSpring"></li>新增页面',
    		  area:['450px','500px'],
    		  content:'sys/jsp/useradd.jsp'
    	  });
      break;
      case 'update':
        if(data.length === 0){
          layer.msg('请选择一行');
        } else if(data.length > 1){
          layer.msg('只能同时编辑一个');
        } else {
          layer.open({
        	  type : 1,
        	  title : '编辑',
        	  area:['450px','500px'],
    		  content:$('#UpdateTest'),
    		  success : function(data) {
    			  alert(data[0].username);
    			  $('#newusername').attr("value",data[0].username);
    		  }
          });
        }
      break;
      case 'delete':
        if(data.length === 0){
          layer.msg('请选择一行');
        } else if(data.length > 1){
          layer.msg('只能同时删除一个');
        }else {
          layer.confirm('确认删除此行？',{btn:['yes','no']},function(index){
        	  delByName(checkStatus.data[0].username);
          });
        }
      break;
    };
  });
  
  
  function delByName(name) {
		$.ajax({
			url : '/skillCompete/sysUserController/removeUser',
			data : {username : name},
			dataType : 'json',
			type : 'POST',
			success : function(data) {
				if(data.code == 0) {
					layer.msg('删除成功');
					table.reload('testReload',{
						url : '/skillCompete/sysUserController/queryUserList'
							}
					);
				} else {
					layer.msg('删除失败');
				}
			}
		});
	};
}); 



