package com.xupt.riqi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		//此时就获得了一个Calendar实例对象，就好比你自己new了一个对象
		Calendar c=Calendar.getInstance();
		//设置日期
		c.set(Calendar.YEAR, 2019);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.DATE, 29);
		c.set(Calendar.HOUR, 12);
		c.set(Calendar.MINUTE, 12);
		c.set(Calendar.SECOND, 12);
		
		c.add(Calendar.YEAR, -1);
		//格式化类
		SimpleDateFormat s=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a d 'D' S G");
		//格式化
		String str=s.format(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		
		
	}
}
