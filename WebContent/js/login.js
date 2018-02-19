$(document).ready(function(){});

function goLogin(){
	var user_name = $("#user_name").val();
	var user_pwd = hex_md5($("#user_pwd").val());
	$.ajax({
		url: '../home/goLogin.php',
		type: 'post',
		data: {'user_name' : user_name , 'user_pwd' : user_pwd},
		success: function(data){
			if(data.length != 0){
				if (data.msg == "good") {
					window.location.href = "../home/goLogin.php";
				}else if(data.msg == "setCommonData"){
					window.location.href = "../bigBoss/bigBoss.php";
				}else{
					alert("登录失败，请确认用户名和密码输入正确.");
				}
			}else{
				alert("登录失败，请确认用户名和密码输入正确.");
			}
		}
	});
}


