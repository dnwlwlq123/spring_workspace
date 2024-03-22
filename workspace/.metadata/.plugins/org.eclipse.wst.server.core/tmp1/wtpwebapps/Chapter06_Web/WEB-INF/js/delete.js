$(function(){
	//삭제버튼
	$('#deleteBtn').click(function(){
		if(confirm('정말 삭제할꺼?')){
			$.ajax({
				type: 'post',
				url: '/Chapter06_Web/user/delete',
				data: 'id='+$('#id').val(),
				success: function(){
					console.log('회원정보 삭제 완료');
					location.href = '/Chapter06_Web/user/list';	
				},
				error: function(err){
					console.log(err);
				}
			});
		}//if
	});
});