$(function(){
    		var myChart = echarts.init(document.getElementById('GouFang_pie')); 
	        
	        var option = {
	        	tooltip: {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} ({d}%)"
				    },
			    title : {
			        x:'center'
			    },
			    legend: {
			        orient : 'vertical',
			        x : 'left',
			        padding: 10,
			        itemGap: 20,
			        data:['ӡ��˰','��ʦ��','��ʦ��','��ʦ��','��ʦ��'],
			        show:true
			    },
			    calculable : true,
			    series : [
			        {
			            name:'������Դ',
			            type:'pie',
			            radius : '55%',
			            center: ['50%', '60%'],
			            data:[
			                {value:335, name:'ӡ��˰'},
			                // {value:310, name:'��ʦ��'},
			                // {value:234, name:'��ʦ��'},
			                // {value:135, name:'��ʦ��'},
			                {value:1548, name:'��ʦ��'}
			            ]
			        }
			    ]
			};

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


$('#MyTabs a').click(function (e) {
      e.preventDefault()

      $(this).tab('show');

      var myChart1 = echarts.init(document.getElementById('ChengBen_pie')); 
	        
	        var option1={
				    tooltip: {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} ({d}%)"
				    },
				    legend: {
				        orient : 'vertical',
				        x : 'left',
				        data:['��ҵ��','������','ˮ���','���շ�','��������']
				    },
				    calculable : true,
				    series : [
			        {
			            name:'������Դ',
			            type:'pie',
			            radius : '55%',
			            center: ['50%', '60%'],
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
                    
	        // Ϊecharts����������� 
	        myChart1.setOption(option1);
    }); 