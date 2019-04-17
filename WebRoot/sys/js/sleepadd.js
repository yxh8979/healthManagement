layui.use(['form','jquery','laydate'], function(){
  var form = layui.form;
  var $ = layui.$;
  var laydate = layui.laydate;
  
  laydate.render({
	    elem: '#starttime', //指定元素
	    type : 'datetime'
	  });
  laydate.render({
	    elem: '#endtime', //指定元素
	    type : 'datetime'
	  });
  
  $('#submit').click(function(){
        $.ajax({
            url: "/skillCompete/sysSleepController/saveSleep",
            type: "post",
            data:$('#addform').serialize(),
            dataType: "json",
            success: function(data){
                if(data.code == 0){
//                    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                    layer.msg("新增成功");
//                    parent.layer.close(index); //再执行关闭
//                    parent.location.reload();
                }else{
                    layer.msg("新增失败");
                }
            },
            error : function() {
            	layer.msg("新增失败");
            }
        });
    });
}); 



