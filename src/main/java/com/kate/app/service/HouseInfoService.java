package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.HouseInfoDao;
import com.kate.app.model.HouseInfo;

@Service
public class HouseInfoService {
	@Autowired
	private HouseInfoDao houseInfoDao;
	public List<HouseInfo> getHouseInfoList(){
		List<HouseInfo> list=new ArrayList<HouseInfo>();
		list=houseInfoDao.HouseInfoDao();
		for(int i=0;i<list.size();i++){
			String houseprice=list.get(i).getHouse_price();
			String price=getMoney(houseprice);
			list.get(i).setHouse_price(price);
			}
		return list;
	}
    public String getMoney(String money){
    	//閲戦鏍煎紡杞崲
    			//String str1=String.valueOf(money);
    			String str1 = new StringBuilder(money).reverse().toString();     //鍏堝皢瀛楃涓查鍊掗『搴�
    			String str2 = "";
    			for(int i=0;i<str1.length();i++){
    				if(i*3+3>str1.length()){
    					str2 += str1.substring(i*3, str1.length());
    					break;
    				}
    				str2 += str1.substring(i*3, i*3+3)+",";
    			}
    			if(str2.endsWith(",")){
    				str2 = str2.substring(0, str2.length()-1);
    			}
    			//鏈�悗鍐嶅皢椤哄簭鍙嶈浆杩囨潵
    			String result="$"+new StringBuilder(str2).reverse().toString();
    		return result;
    }
}
