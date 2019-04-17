layui.use(['jquery','element'], function(){
	var $ = layui.$;
	var element = layui.element;
	
});

function sysUserFunction(url) {
    $.ajax({
        type: "POST",
        async: true,
        dataType: "html",
        contentType: 'application/json; charset=utf-8',
        success: function (html) {
            $('#mydiv').load(url);//load函数同样能实现效果
        }
    });
}




	