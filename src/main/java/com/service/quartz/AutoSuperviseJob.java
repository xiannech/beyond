package com.service.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AutoSuperviseJob {
	
	public void quartzTest(){
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println("定时任务测试"+ sdf.format(new Date()));
	}
}
