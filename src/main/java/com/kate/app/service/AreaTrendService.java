package com.kate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.AreaTrendDao;
import com.kate.app.model.AreaMiddle;
import com.kate.app.model.AreaZhikong;
import com.kate.app.model.AreaZujin;
@Service
public class AreaTrendService {
		@Autowired
		private AreaTrendDao areaTrendDao;
		public List<AreaMiddle> getAreaMiddleTrend(){
			List<AreaMiddle> areaMiddleList=areaTrendDao.getAreaMiddleTrend();
			return areaMiddleList;
		}
		public List<AreaZujin> getAreaZujinTrend(){
			List<AreaZujin> areaZujinList=areaTrendDao.getAreaZujinTrend();
			return areaZujinList;
		}
		public List<AreaZhikong> getAreaZhikongTrend(){
			List<AreaZhikong> areaZhikongList=areaTrendDao.getAreaZhikongTrend();
			return areaZhikongList;
		}
}
