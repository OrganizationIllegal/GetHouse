

$(function(){
    		var myChart = echarts.init(document.getElementById('zonefamily_pie')); 
	        
	        var labelTop = {
				    normal : {
				        label : {
				            show : true,
				            position : 'center',
				            formatter : '{b}',
				            textStyle: {
				                baseline : 'bottom'
				            }
				        },
				        labelLine : {
				            show : false
				        }
				    }
				};
				var labelFromatter = {
				    normal : {
				        label : {
				            formatter : function (params){
				                return 100 - params.value + '%'
				            },
				            textStyle: {
				                baseline : 'top'
				            }
				        }
				    },
				};
				var labelBottom = {
				    normal : {
				        color: '#ccc',
				        label : {
				            show : true,
				            position : 'center'
				        },
				        labelLine : {
				            show : false
				        }
				    },
				    emphasis: {
				        color: 'rgba(0,0,0,0)'
				    }
				};
				var radius = [60, 75];
				option = {
				    legend: {
				        x : 'center',
				        y : 'center',
				        data:[
				            '独立青年','青年家庭','老年家庭'//'独立青年','青年家庭','老年家庭'
				        ],
				        show:false
				    },
				    series : [
				        {
				            type : 'pie',
				            center : ['20%', '50%'],
				            radius : radius,
				            x: '0%', // for funnel
				            itemStyle : labelFromatter,
				            data : [
				                {name:'other', value:46, itemStyle : labelBottom},
				                {name:'独立青年', value:54,itemStyle : labelTop}
				            ]
				        },
				        {
				            type : 'pie',
				            center : ['50%', '50%'],
				            radius : radius,
				            x:'20%', // for funnel
				            itemStyle : labelFromatter,
				            data : [
				                {name:'other', value:56, itemStyle : labelBottom},
				                {name:'青年家庭', value:44,itemStyle : labelTop}
				            ]
				        },
				        {
				            type : 'pie',
				            center : ['80%', '50%'],
				            radius : radius,
				            x:'40%', // for funnel
				            itemStyle : labelFromatter,
				            data : [
				                {name:'other', value:65, itemStyle : labelBottom},
				                {name:'老年家庭', value:35,itemStyle : labelTop}
				            ]
				        }
				        
				    ]
				};
                    

	        // 为echarts对象加载数据 
	        myChart.setOption(option); 



    	});