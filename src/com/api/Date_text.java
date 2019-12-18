package com.api;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.*;
public class Date_text {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
		Date date1= new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		SimpleDateFormat sdf=new SimpleDateFormat("GYYYY年MM月dd日：今天是yyyy年的第D天，E");
		System.out.println(sdf.format(date1));
		
		
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		System.out.println("当前时间为："+year+"年"+month+"月"+date+"日");
		
		
		
		
		Calendar rili=Calendar.getInstance();
		year=rili.get(Calendar.YEAR);
		month=rili.get(Calendar.MONTH)+1;
		date=rili.get(Calendar.DATE);
		System.out.println("今天是："+year+"年"+month+"月"+date+"日");

		rili.add(Calendar.DATE,100);
		year=rili.get(Calendar.YEAR);
		month=rili.get(Calendar.MONTH)+1;
		date=rili.get(Calendar.DATE);
		System.out.println("一百天以后是："+year+"年"+month+"月"+date+"日");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate ldt=LocalDate.now();
		Date date4=sdf1.parse(""+ldt.plusDays(100));
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月d日");
		System.out.println("100天以后是"+sdf2.format(date4));
	
	
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM");
		Date date5=sdf3.parse(""+YearMonth.now());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月");
		System.out.println("当 前年月是"+sdf4.format(date5));
		
		
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println("当前系统时区是"+zoneId);
		
		Instant instant=Instant.now();
		System.out.println("当前时间是"+instant);
	}

}
