 var map = null;
 var searchManager = null;  
 var defaltCenter=new Microsoft.Maps.Location(39.916927,116.404269);//天安门         
      /*加载地图*/
      function getMap()
      {
       map = new Microsoft.Maps.Map(document.getElementById('myMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn',showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false,showDashboard: false, disableZooming: true });
       map.setView({ zoom: 11, center: defaltCenter });	
       addDefaultPushpin(); 
      }
      function getPopMap(){
    	  map = new Microsoft.Maps.Map(document.getElementById('popMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn',showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false});
    	  map.setView({ zoom: 11, center: defaltCenter });
    	  addDefaultPushpin2();
      }
     
      /* 增加pushpin*/
      function addDefaultPushpin()
      {
         $.ajax({
	 	    type: "GET",
	 		dateType: "json",
	 		url: "/BingMap/Coordinates", 		
	 		success:function(data){
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		    for(var i=0;i<items.length;i++){
	 		        var LA=new Microsoft.Maps.Location(items[i].latitude,items[i].longitude);
	 		        var pushpin= new Microsoft.Maps.Pushpin(LA, null); 
	 		        Microsoft.Maps.Events.addHandler(pushpin, 'click', popModal); 	
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
	 		url: "/BingMap/Coordinates", 		
	 		success:function(data){
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		    for(var i=0;i<items.length;i++){
	 		        var LA=new Microsoft.Maps.Location(items[i].latitude,items[i].longitude);
	 		        var pushpin= new Microsoft.Maps.Pushpin(LA, null); 
	 		        Microsoft.Maps.Events.addHandler(pushpin, 'click', addDefaultInfobox); 
				    map.entities.push(pushpin);	  		        	        
	 		    }
	 		},
	 		error:function(){
	 			alert("addDefaultPushpin error")
	 		}
        });		 
      }
      /* 增加infobox*/
	  function addDefaultInfobox()
      { 
         $.ajax({
	 	    type: "GET",
	 		dateType: "json",
	 		url: "/BingMap/Coordinates", 		
	 		success:function(data){
	 		data=$.parseJSON(data);
	 		    var items=data.List;
	 		    for(var i=0;i<items.length;i++){
	 		        var LA=new Microsoft.Maps.Location(items[i].latitude,items[i].longitude);
	 		        var name=items[i].place;
	 		        var desc=items[i].project_price;	
				    var infoboxOptions = {width :200, height :100,title:name, description:desc,offset:new Microsoft.Maps.Point(0,20)}; 
				    var defaultInfobox = new Microsoft.Maps.Infobox(LA, infoboxOptions );    
				    map.entities.push(defaultInfobox); 		        	        
	 		    }
	 		},
	 		error:function(){
	 			alert("addDefaultInfobox error")
	 		}
        });		 
      }
	  /*弹出模态框*/
	  function popModal(){
		  getPopMap();
		  $('#myModal').modal('show');
	  }
	 /* 搜索*/
	    function createSearchManager() 
  {
      map.addComponent('searchManager', new Microsoft.Maps.Search.SearchManager(map)); 
      searchManager = map.getComponent('searchManager'); 
  }
  function LoadSearchModule()
  {
    Microsoft.Maps.loadModule('Microsoft.Maps.Search', { callback: geocodeRequest })
  }
  function geocodeRequest() 
  { 
    createSearchManager(); 
    //var where = 'Denver, CO';
	var where =document.getElementById("txtQuery").value;
    var userData = { name: 'Maps Test User', id: 'XYZ' }; 
    var request = 
    { 
        where: where, 
        count: 5, 
        bounds: map.getBounds(), 
        callback: onGeocodeSuccess, 
        errorCallback: onGeocodeFailed, 
        userData: userData 
    }; 
    searchManager.geocode(request); 
  } 
  function onGeocodeSuccess(result, userData) 
  { 
    if (result) { 
        map.entities.clear(); 
        var topResult = result.results && result.results[0]; 
        if (topResult) { 
            var pushpin = new Microsoft.Maps.Pushpin(topResult.location, null); 
            map.setView({ center: topResult.location, zoom: 12 });
            map.entities.push(pushpin); 
        } 
    } 
  } 
  function onGeocodeFailed(result, userData) { 
    alert('Geocode failed'); 
  } 