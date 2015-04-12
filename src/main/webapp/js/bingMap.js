 var map = null;
	  var searchManager = null;
      var LA=new Microsoft.Maps.Location(39.877491,116.486297);      
      function getMap()
      {
         map = new Microsoft.Maps.Map(document.getElementById('myMap'), {credentials: 'AiI0UVY6YDQ0GtOirYyxVo0F_NckOJMIDtjDeuHjOqfENWZ3a_pDopdHYOTAZSjn',showMapTypeSelector:false,enableSearchLogo: false,showScalebar: false});
		 map.setView({ zoom: 12, center: LA });
		 addDefaultPushpin();
      }
      function addDefaultPushpin()
      {
        var pushpin= new Microsoft.Maps.Pushpin(LA, null); 
		pushpinOver= Microsoft.Maps.Events.addHandler(pushpin, 'mouseover', addDefaultInfobox);  
        map.entities.push(pushpin);
      }
	  function addDefaultInfobox()
      {       
        var infoboxOptions = {width :200, height :100,title:'Infobox Title', description:'Infobox description',offset:new Microsoft.Maps.Point(0,20)}; 
        var defaultInfobox = new Microsoft.Maps.Infobox(LA, infoboxOptions );    
        map.entities.push(defaultInfobox);
      }
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