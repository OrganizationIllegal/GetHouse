$(document).ready(function(){
	$("#left").mouseover(function(){
		$(".news_action").show();
		setInterval('scroll_news()',1000);
	});
	
	$("#left").mouseout(function(){
		$(".news_action").hide();	
	});
	
	$("#right").mouseover(function(){
		$(".news_action").show();
		setInterval('scroll_news()',1000);
	});
	
	$("#right").mouseout(function(){
		$(".news_action").hide();	
	});
	

});


 function scroll_news(){
	$('.list li').eq(0).fadeOut('slow',function(){
	    //   alert($(this).clone().html());
	    //��¡:���ÿ�¡�Ļ���remove()��û�ˡ�
	    $(this).clone().appendTo($(this).parent()).fadeIn('slow');
	    $(this).remove();
	    });
} 
