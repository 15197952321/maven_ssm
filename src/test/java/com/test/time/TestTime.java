package com.test.time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.utils.MyTime;

public class TestTime {
	
	public static void main(String[] args) {
		
		/*// 获得当天得日期，不包含时间
		LocalDate localDate = LocalDate.now();
		System.out.println("当天日期：" + localDate);
		
		// 获取指定日期
		localDate = localDate.of(2018, 8, 3);
		System.out.println("指定日期：" + localDate);
		System.out.println("英文字体月份：" + localDate.getMonth());
		System.out.println("阿拉伯数字月份：" + localDate.getMonthValue());
		System.out.println("阿拉伯数字年份：" + localDate.getYear());
		System.out.println("英文星期：" + localDate.getDayOfWeek());
		System.out.println("阿拉伯数字日数：" + localDate.getDayOfMonth());
		System.out.println("当年的第多少天：" + localDate.getDayOfYear());
		
		// 月日
		MonthDay day = MonthDay.from(localDate);
		System.out.println("月日：" + day);
		
		// 获取当前时间
		LocalTime localTime = LocalTime.now();
		System.out.println("当前时间：" + localTime);
		localTime = localTime.plusHours(1);
		System.out.println("1小时之后的时间：" + localTime);
		
		// 获取时区
		Clock clock = Clock.systemUTC();
		System.out.println("clock：" + clock);
		
		// 获取日期和时间
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("dateTime：" + dateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime2 = LocalDateTime.parse("2018-08-09 12:00:00", formatter);
		System.out.println(dateTime.isAfter(dateTime2));
		System.out.println(dateTime.isBefore(dateTime2));
		
		// 带时区的日期和时间
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime：" + zonedDateTime);
		
		// 
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dateStr = formatter2.format(dateTime);
		System.out.println("dateStr：" + dateStr);
		
		System.out.println(MyTime.isAfter("2018-08-09 14:00:00"));
		System.out.println(MyTime.isBefore("2018-08-09 14:00:00"));*/
		
		LocalDate date = LocalDate.parse("2018-08-01");
		LocalDate date2 = LocalDate.now();
		System.out.println(MyTime.periodDays(date, date2));
		
		LocalDateTime dateTime = MyTime.parseLocalDateTime("2018-08-01 12:00:00", "yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime2 = LocalDateTime.now();
		System.out.println(MyTime.durationHours(dateTime, dateTime2));
		
	}
	
}
