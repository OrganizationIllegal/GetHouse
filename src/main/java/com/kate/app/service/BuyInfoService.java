package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.BuyInfoDao;
import com.kate.app.model.BuyInfo;

@Service
public class BuyInfoService {
	@Autowired
	private BuyInfoDao buyInfoDao;
	public String getReturnMoney(){
		int returnMoney=buyInfoDao.BuyInfoDao();
		String returnprice=getMoney(returnMoney);
		return returnprice;
	}
	
	public String getMoney(int money){
    	//閲戦鏍煎紡杞崲
    			String str1=String.valueOf(money);
    			str1 = new StringBuilder(str1).reverse().toString();     //鍏堝皢瀛楃涓查鍊掗『搴�
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
