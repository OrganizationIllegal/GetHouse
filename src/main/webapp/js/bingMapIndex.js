 var map = null;
 var defaultInfobox;
 var map2=null; 
 var url=location.search
 //var defaltCenter=new Microsoft.Maps.Location(-37.847019, 145.064643); 
      /*加载地图*/
      function getIndexMap(){
    	 map = new Microsoft.Maps.Map(document.getElementById('indexMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn',showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false, disableZooming: true });
     	 map2 = new Microsoft.Maps.Map(document.getElementById('eyeMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn', mapTypeId: Microsoft.Maps.MapTypeId.birdseye,showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false,disableZooming: true });
    	  $.ajax({
  	 	    type: "GET",
  	 		dateType: "json",
  	 		url: "/BingMap/FileterProNum"+url, 		
  	 		success:function(data){
  	 		//alert(data)
  	 		data=$.parseJSON(data);
  	 		    var items=data.List;
  	 		    for(var i=0;i<items.length;i++){
  	 		        var arr=new Array();
  	 		        arr=items[i].gps.split(",");
  	 		        var LA=new Microsoft.Maps.Location(arr[0],arr[1]);
  	 		       map.setView({ zoom: 14, center: LA });
  	 	    	   map2.setView({ zoom: 18, center: LA });
  	 		        var pushpin= new Microsoft.Maps.Pushpin(LA,null); 
  	 		        Microsoft.Maps.Events.addHandler(pushpin, 'click', popModal); 
  	 		       // Microsoft.Maps.Events.addHandler(pushpin, 'mouseover', getEyeMap); 	
  				    map.entities.push(pushpin);	
  				  map2.entities.push(pushpin);
  	 		    }
  	 		},
  	 		error:function(){
  	 			alert("addDefaultPushpin error")
  	 		}
          });		
    	 //addDefaultPushpin();	
      }
      function getPopMap(){
    	  map = new Microsoft.Maps.Map(document.getElementById('popMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn',showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false});
    	  $.ajax({
  	 	    type: "GET",
  	 		dateType: "json",
  	 		url: "/BingMap/Coordinates",  	 		
  	 		success:function(data){
  	 		//alert(data)
  	 		data=$.parseJSON(data);
  	 		    var items=data.List;
  	 		    for(var i=0;i<items.length;i++){
  	 		        var arr=new Array();
  	 		        arr=items[i].gps.split(",");
  	 		        var LA=new Microsoft.Maps.Location(arr[0],arr[1]);
  	 		        map.setView({ zoom: 14, center: LA });
  	 		        var num=items[i].project_num;
  	 		        var image=items[i].project_img;
  	 		        var img="http://101.200.174.253:8080/all/"+image;
  	 		        var name=items[i].project_name;
  	 		        var minprice=items[i].project_min_price;
  	 		        var maxprice=items[i].project_high_price;
  	 		        var price="$"+minprice+"-$"+maxprice;
  	 		        var pushpin= new Microsoft.Maps.Pushpin(LA, null); 
  				    add(name,img,price,num,pushpin,LA);
  				    map.entities.push(pushpin);	  		        	        
  	 		    }
  	 		},
  	 		error:function(){
  	 			alert("addDefaultPushpin error")
  	 		}
          });		 
    	 // addDefaultPushpin2();
      }
      function getEyeMap(){ 
      map=new Microsoft.Maps.Map(document.getElementById('eyeMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn', mapTypeId: Microsoft.Maps.MapTypeId.birdseye,showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false,showDashboard: false, disableZooming: true });
       $.ajax({
	 	    type: "GET",
	 		dateType: "json",
	 		url: "/BingMap/FileterProNum"+url, 		
	 		success:function(data){
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		    for(var i=0;i<items.length;i++){
	 		        var arr=new Array();
	 		        arr=items[i].gps.split(",");
	 		        var LA=new Microsoft.Maps.Location(arr[0],arr[1]);
	 		        map.setView({ zoom: 15, center: LA });	 		        		        	        
	 		    }
	 		},
	 		error:function(){
	 			alert("getMap error")
	 		}
        });		 
      }
       
      /* 增加pushpin*/
      function addDefaultPushpin()
      {
         $.ajax({
	 	    type: "GET",
	 		dateType: "json",
	 		url: "/BingMap/FileterProNum"+url, 		
	 		success:function(data){
	 		//alert(data)
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		    for(var i=0;i<items.length;i++){
	 		        var arr=new Array();
	 		        arr=items[i].gps.split(",");
	 		        var LA=new Microsoft.Maps.Location(arr[0],arr[1]);
	 		        var flag=i+1;
	 		        var pushpinOptions={text:''+flag}
	 		        var pushpin= new Microsoft.Maps.Pushpin(LA, pushpinOptions); 
	 		        Microsoft.Maps.Events.addHandler(pushpin, 'click', popModal); 
	 		       // Microsoft.Maps.Events.addHandler(pushpin, 'mouseover', getEyeMap); 	
				    map.entities.push(pushpin);	  		        	        
	 		    }
	 		},
	 		error:function(){
	 			alert("addDefaultPushpin error")
	 		}
        });		 
      }
       function addDefaultPushpin2()
      {
         $.ajax({
	 	    type: "GET",
	 		dateType: "json",
	 		url: "/BingMap/FileterProNum"+url, 	 		
	 		success:function(data){
	 		//alert(data)
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		    for(var i=0;i<items.length;i++){
	 		        var arr=new Array();
	 		        arr=items[i].gps.split(",");
	 		        var LA=new Microsoft.Maps.Location(arr[0],arr[1]);
	 		        var num=items[i].project_num;
	 		        var image=items[i].project_img;
	 		        var img="http://101.200.174.253:8080/all/"+image;
	 		        var name=items[i].project_name;
	 		        var minprice=items[i].project_min_price;
	 		        var maxprice=items[i].project_high_price;
	 		        var price="$"+minprice+"-$"+maxprice;
	 		        var flag=i+1;
	 		        var pushpinOptions={text:''+flag}
	 		        var pushpin= new Microsoft.Maps.Pushpin(LA, pushpinOptions); 
				    add(name,img,price,num,pushpin,LA);
				    map.entities.push(pushpin);	  		        	        
	 		    }
	 		},
	 		error:function(){
	 			alert("addDefaultPushpin error")
	 		}
        });		 
      }
       function add(name,img,price,num,pushpin,LA){
     	  Microsoft.Maps.Events.addHandler(pushpin, 'click', function(){
 		        var infoboxOptions = {width :400, height :100,offset:new Microsoft.Maps.Point(0,20), }; 
 		        var num1=num;
 		        var img1=img;
 		        var price1=price;
 		        var name1=name;
 		        if(defaultInfobox){
 		        	defaultInfobox.setOptions({ visible: false });
 		        }
 			    defaultInfobox = new Microsoft.Maps.Infobox(LA, infoboxOptions);
 			    //alert(defaultInfobox.getId())
 			    map.entities.push(defaultInfobox); 
 			    defaultInfobox.setHtmlContent('<div id="infoboxText" style="background-color:White;min-height:100px;width:330px;"><a href="/Index?proNum='+num1+'"><img src="'+img1+'" width="110" height="80" style="position:absolute;left:10px;top:10px;"></a><b id="infoboxTitle" style="position:absolute; top:30px; left:125px; width:250px;">项目价格：'+price1+'</b><a href="/Index?proNum='+num1+'" id="infoboxDescription" style="position:absolute; top:50px; left:125px; width:250px;">项目名称:'+name1+'</a></div>'); 
 			    
 		    });
       }
      /* 增加infobox*/
	  /*function addDefaultInfobox()
      { 
         $.ajax({
	 	    type: "GET",
	 		dateType: "json",
	 		url: "/BingMap/Coordinates", 		
	 		success:function(data){
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		   for(var i=0;i<items.length;i++){
	 		        var arr=new Array();
	 		        arr=items[i].gps.split(",");
	 		        var LA=new Microsoft.Maps.Location(arr[0],arr[1]);
	 		        var num=items[i].project_num;
	 		        var img=items[i].project_img;
	 		        //var id=items[i].id;
	 		        var name=items[i].project_name;
	 		        var price=items[i].project_price;	
				    //var infoboxOptions = {width :200, height :100,title:name, description:desc,offset:new Microsoft.Maps.Point(0,20)}; 
	 		        var infoboxOptions = {width :400, height :100,offset:new Microsoft.Maps.Point(0,20)}; 
				    var defaultInfobox = new Microsoft.Maps.Infobox(LA, infoboxOptions ); 
				    defaultInfobox.setHtmlContent('<div id="infoboxText" style="background-color:White;min-height:100px;width:300px;"><img src="'+img+'" width="110" height="80" style="position:absolute;left:10px;top:10px;"><b id="infoboxTitle" style="position:absolute; top:30px; left:125px; width:250px;">项目价格：'+price+'</b><a href="/Index?proNum='+num+'" id="infoboxDescription" style="position:absolute; top:50px; left:125px; width:250px;">项目名称:'+name+'</a></div>'); 
				    map.entities.push(defaultInfobox); 		        	        
	 		    }
	 		},
	 		error:function(){
	 			alert("addDefaultInfobox error")
	 		}
        });		 
      }*/
	  /*弹出模态框*/
	  function popModal(){
		  getPopMap();
		  $('#myModal').modal('show');
	  }