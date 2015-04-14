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
	    //克隆:不用克隆的话，remove()就没了。
	    $(this).clone().appendTo($(this).parent()).fadeIn('slow');
	    $(this).remove();
	    });
} 
