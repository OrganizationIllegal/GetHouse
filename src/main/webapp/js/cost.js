$(function(){
    		var myChart = echarts.init(document.getElementById('GouFang_pie')); 
	        
	        var option = {
	        	title : {
			        text: '���¸������ڣ�2015-04-26             ',
			        x:'right',
			        show:true
			    	},
	        	animation:false,
	        	tooltip: {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} ({d}%)",
				        show:false
				    },
			    legend: {
			        orient : 'vertical',
			        x : 'left',
			        padding: 10,
			        itemGap: 20,
			        data:['ӡ��˰','Ӫҵ��','�ǽ���','��ȫ��','������'],
			        show:true
			    },
			    calculable : true,
			    series : [
			        {
			            
			            type:'pie',
			            radius : '55%',
			            itemStyle : {
			                normal : {
			                    label : {
			                        show : true
			                    },
			                    labelLine : {
			                        show : true
			                    }
			                },
			                emphasis : {
			                    label : {
			                        show : false,
			                        position : 'center',
			                        textStyle : {
			                            fontSize : '30',
			                            fontWeight : 'bold'
			                        }
			                    }
			                }
			            },
			            center: ['50%', '50%'],
			            data:[
			                {value:335, name:'ӡ��˰'},
			                {value:310, name:'Ӫҵ��'},
			                {value:234, name:'�ǽ���'},
			                {value:135, name:'��ȫ��'},
			                {value:1548, name:'������'}
			            ]
			        }
			    ]
			};
			option.legend.data=eval(houseTaxStr);
			option.series[0].data=eval(housetaxdata);
	        // Ϊecharts����������� 
	        myChart.setOption(option); 



    	});

$(function(){
	        $('#MySelect').change(function(){  
			   // alert($(this).children('option:selected').val());  
			   // var p1=$(this).children('option:selected').val();//�����selected��ֵ  
			   // var p2=$('#param2').val();//��ȡ��ҳ��������ǩ��ֵ  
			   // window.location.href="xx.php?param1="+p1+"&param2="+p2+"";//ҳ����ת������  
			   //ͨ��Ajax��ȡ����
			   alert("hideLoading");
	            $.ajax({
	                type: "post",
	                async: false, //ͬ��ִ��
	                url: "/Ajax/GetChartData.aspx?type=getData&count=12",
	                dataType: "json", //����������ʽΪjson
	                success: function (result) {
	                    if (result) {                        
	                        //�����ص�category��series����ֵ��options�����ڵ�category��series
	                        //��ΪxAxis��һ������ ������Ҫ��xAxis[i]����ʽ
	                        options.xAxis[0].data = result.category;
	                        options.series = result.series;
	                        options.legend.data = result.legend;
	                        myChart.hideLoading();
	                        myChart.setOption(options);
	                    }
	                },
	                error: function (XMLHttpRequest, textStatus, errorThrown) {
	                    alert("������˼,ͼ����������ʧ����!");
	                }
	            });
			});
			$('#MySelect1').change(function(){  
			   // alert($(this).children('option:selected').val());  
			   // var p1=$(this).children('option:selected').val();//�����selected��ֵ  
			   // var p2=$('#param2').val();//��ȡ��ҳ��������ǩ��ֵ  
			   // window.location.href="xx.php?param1="+p1+"&param2="+p2+"";//ҳ����ת������  
			   //ͨ��Ajax��ȡ����
	            $.ajax({
	                type: "post",
	                async: false, //ͬ��ִ��
	                url: "/Ajax/GetChartData.aspx?type=getData&count=12",
	                dataType: "json", //����������ʽΪjson
	                success: function (result) {
	                    if (result) {                        
	                        //�����ص�category��series����ֵ��options�����ڵ�category��series
	                        //��ΪxAxis��һ������ ������Ҫ��xAxis[i]����ʽ
	                        options.xAxis[0].data = result.category;
	                        options.series = result.series;
	                        options.legend.data = result.legend;
	                        myChart.hideLoading();
	                        myChart.setOption(options);
	                    }
	                },
	                error: function (errorMsg) {
	                    alert("������˼����ү��ͼ����������ʧ����!");
	                }
	            });
			   });

    	});


$('#costTabs a').click(function (e) {
      e.preventDefault()

      $(this).tab('show');

      var myChart1 = echarts.init(document.getElementById('ChengBen_pie')); 
	        
	        var option1={
	        		title : {
			        text: '���¸������ڣ�2015-04-26             ',
			        x:'right',
			        show:true
			    	},
	        		animation:false,
				    tooltip: {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} ({d}%)",
				        show:false
				    },
				    legend: {
				        orient : 'vertical',
				        x : 'left',
				        padding: 10,
			        	itemGap: 20,
				        data:['��ҵ��','������','ˮ���','���շ�','��������']
				    },
				    calculable : true,
				    series : [
			        {
			            
			            type:'pie',
			            radius : '55%',
			            center: ['50%', '50%'],
			            itemStyle : {
			                normal : {
			                    label : {
			                        show : true
			                    },
			                    labelLine : {
			                        show : true
			                    }
			                },
			                emphasis : {
			                    label : {
			                        show : false,
			                        position : 'center',
			                        textStyle : {
			                            fontSize : '30',
			                            fontWeight : 'bold'
			                        }
			                    }
			                }
			            },
			            data:[
			                {value:335, name:'��ҵ��'},
				            {value:310, name:'������'},
				            {value:234, name:'ˮ���'},
				            {value:135, name:'���շ�'},
				            {value:1548, name:'��������'}
			            ]
			        }
			    ]

				};
            option1.legend.data=eval(holdingTaxStr);
			option1.series[0].data=eval(holdingdata);
	        // Ϊecharts����������� 
	        myChart1.setOption(option1);
    }); 