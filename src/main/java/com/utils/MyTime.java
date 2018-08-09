package com.utils;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/**
 *  @author
 * */
public class MyTime {

	public static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	/**
	 * 是否在当前日期时间之后
	 * 
	 * @param param
	 * @return
	 * */
	public static boolean isAfter(String param) {
		try {
			LocalDateTime dateTime = LocalDateTime.parse(param, DATETIME_FORMATTER);
			return dateTime.isAfter(LocalDateTime.now());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 是否在当前日期时间之前
	 * 
	 * @param param
	 * @return
	 * */
	public static boolean isBefore(String param) {
		try {
			LocalDateTime dateTime = LocalDateTime.parse(param, DATETIME_FORMATTER);
			return dateTime.isBefore(LocalDateTime.now());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * 返回当前的日期
     * 
     * @return
     */
    public static LocalDate getCurrentLocalDate() {
        return LocalDate.now();
    }

    /**
     * 返回当前日期时间
     * 
     * @return
     */
    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }
	
	/**
     * 返回当前日期字符串 yyyyMMdd
     * 
     * @return
     */
    public static String getCurrentDateStr() {
        return LocalDate.now().format(DATE_FORMATTER);
    }

    /**
     * 返回当前日期时间字符串 yyyyMMddHHmmss
     * 
     * @return
     */
    public static String getCurrentDateTimeStr() {
        return LocalDateTime.now().format(DATETIME_FORMATTER);
    }

    public static LocalDate parseLocalDate(String dateStr, String pattern) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDateTime parseLocalDateTime(String dateTimeStr, String pattern) {
        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 日期相隔天数
     * 
     * @param startDateInclusive
     * @param endDateExclusive
     * @return
     */
    public static int periodDays(LocalDate startDateInclusive, LocalDate endDateExclusive) {
        return Period.between(startDateInclusive, endDateExclusive).getDays();
    }

    /**
     * 日期相隔小时
     * 
     * @param startInclusive
     * @param endExclusive
     * @return
     */
    public static long durationHours(Temporal startInclusive, Temporal endExclusive) {
        return Duration.between(startInclusive, endExclusive).toHours();
    }

    /**
     * 日期相隔分钟
     * 
     * @param startInclusive
     * @param endExclusive
     * @return
     */
    public static long durationMinutes(Temporal startInclusive, Temporal endExclusive) {
        return Duration.between(startInclusive, endExclusive).toMinutes();
    }

    /**
     * 日期相隔毫秒数
     * 
     * @param startInclusive
     * @param endExclusive
     * @return
     */
    public static long durationMillis(Temporal startInclusive, Temporal endExclusive) {
        return Duration.between(startInclusive, endExclusive).toMillis();
    }

    /**
     * 是否当天
     * 
     * @param date
     * @return
     */
    public static boolean isToday(LocalDate date) {
        return getCurrentLocalDate().equals(date);
    }

    /**
     * 获取本月的第一天
     * 
     * @return
     */
    public static String getFirstDayOfThisMonth() {
        return getCurrentLocalDate().with(TemporalAdjusters.firstDayOfMonth()).format(DATE_FORMATTER);
    }

    /**
     * 获取本月的最后一天
     * 
     * @return
     */
    public static String getLastDayOfThisMonth() {
        return getCurrentLocalDate().with(TemporalAdjusters.lastDayOfMonth()).format(DATE_FORMATTER);
    }

    /**
     * 获取yyyy-MM-dd的第一个周一
     * 
     * @param dateStr
     * @return
     */
    public static String getFirstMonday(String dateStr) {
        return LocalDate.parse(dateStr).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY))
                .format(DATE_FORMATTER);
    }

    /**
     * 获取当前日期的后n周
     * 
     * @param week
     * @return
     */
    public static String getCurDateAfterTwoWeek(int week) {
        return getCurrentLocalDate().plus(week, ChronoUnit.WEEKS).format(DATE_FORMATTER);
    }

    /**
     * 获取当前日期的n个月后的日期
     * 
     * @param month
     * @return
     */
    public static String getCurDateAfterSixMonth(int month) {
        return getCurrentLocalDate().plus(month, ChronoUnit.MONTHS).format(DATE_FORMATTER);
    }

    /**
     * 获取当前日期的n年后的日期
     * 
     * @param year
     * @return
     */
    public static String getCurDateAfterFiveYear(int year) {
        return getCurrentLocalDate().plus(year, ChronoUnit.YEARS).format(DATE_FORMATTER);
    }

    /**
     * 获取当前日期的n*10年后的日期
     * 
     * @param year
     * @return
     */
    public static String getCurDateAfterTwentyYear(int year) {
        return getCurrentLocalDate().plus(year, ChronoUnit.DECADES).format(DATE_FORMATTER);
    }
	
}
