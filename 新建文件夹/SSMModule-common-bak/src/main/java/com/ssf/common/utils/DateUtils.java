package com.ssf.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtils {
	/**
	 * 日期/时间格式
	 */
	public static final String DATETIME_PATTERN = "yyyy-MM-dd mm:hh:ss";
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	public static final TimeZone DEFAULT_TIME_ZONE = TimeZone.getTimeZone("Asia/Shanghai");

	private DateUtils() {
	}

	public static final long DAY = 24 * 60 * 60 * 1000L;
	public final static String YYYY = "yyyy";
	public final static String MM = "MM";
	public final static String DD = "dd";
	public final static String YYYY_MM_DD = "yyyy-MM-dd";
	public final static String YYYY_MM = "yyyy-MM";
	public final static String HH_MM_SS = "HH:mm:ss";
	public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	
	public final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

	public static String formatStr_yyyyMMddHHmmssS = "yyyy-MM-dd HH:mm:ss.S";
	public static String formatStr_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
	public static String formatStr_yyyyMMddHHmm = "yyyy-MM-dd HH:mm";
	public static String formatStr_yyyyMMddHH = "yyyy-MM-dd HH";
	public static String formatStr_yyyyMMdd = "yyyy-MM-dd";
	public static String[] formatStr = { formatStr_yyyyMMddHHmmss, formatStr_yyyyMMddHHmm, formatStr_yyyyMMddHH,
			formatStr_yyyyMMdd };

	/**
	 * 把字符串日期默认转换为yyyy-mm-dd格式的Data对象
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date format(String strDate) {
		Date d = null;
		if (strDate == "")
			return null;
		else
			try {
				d = getFormatter(YYYY_MM_DD).parse(strDate);
			} catch (ParseException pex) {
				return null;
			}
		return d;
	}

	/**
	 * 把字符串日期转换为f指定格式的Data对象
	 * 
	 * @param strDate
	 *            ,f
	 * @return
	 */
	public static Date format(String strDate, String f) {
		Date d = null;
		if (strDate == "")
			return null;
		else
			try {
				d = getFormatter(f).parse(strDate);
			} catch (ParseException pex) {
				return null;
			}
		return d;
	}

	/**
	 * 日期解析－将<code>String</code>类型的日期解析为<code>Date</code>型
	 * 
	 * @param date
	 *            待格式化的日期
	 * @param pattern
	 *            日期样式
	 * @exception ParseException
	 *                如果所给的字符串不能被解析成一个日期
	 * @return 一个被格式化了的<code>Date</code>日期
	 */
	public static Date parse(String strDate, String pattern) throws ParseException {
		try {
			return getFormatter(pattern).parse(strDate);
		} catch (ParseException pe) {
			throw new ParseException("Method parse in Class DateUtils err: parse strDate fail.", pe.getErrorOffset());
		}
	}

	/**
	 * 获取当前日期
	 * 
	 * @return 一个包含年月日的<code>Date</code>型日期
	 */
	public static synchronized Date getCurrDate() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}

	/**
	 * 获取当前日期
	 * 
	 * @return 一个包含年月日的<code>String</code>型日期，但不包含时分秒。yyyy-mm-dd
	 */
	public static String getCurrDateStr() {
		return format(getCurrDate(), YYYY_MM_DD);
	}

	/**
	 * 获取当前时间
	 * 
	 * @return 一个包含年月日时分秒的<code>String</code>型日期。hh:mm:ss
	 */
	public static String getCurrTimeStr() {
		return format(getCurrDate(), HH_MM_SS);
	}

	/**
	 * 获取当前完整时间,样式: yyyy－MM－dd hh:mm:ss
	 * 
	 * @return 一个包含年月日时分秒的<code>String</code>型日期。yyyy-MM-dd hh:mm:ss
	 */
	public static String getCurrDateTimeStr() {
		return format(getCurrDate(), YYYY_MM_DD_HH_MM_SS);
	}

	/**
	 * 获取当前年分 样式：yyyy
	 * 
	 * @return 当前年分
	 */
	public static String getYear() {
		return format(getCurrDate(), YYYY);
	}

	/**
	 * 获取当前月分 样式：MM
	 * 
	 * @return 当前月分
	 */
	public static String getMonth() {
		return format(getCurrDate(), MM);
	}

	/**
	 * 获取当前日期号 样式：dd
	 * 
	 * @return 当前日期号
	 */
	public static String getDay() {
		return format(getCurrDate(), DD);
	}

	/**
	 * 按给定日期样式判断给定字符串是否为合法日期数据
	 * 
	 * @param strDate
	 *            要判断的日期
	 * @param pattern
	 *            日期样式
	 * @return true 如果是，否则返回false
	 */
	public static boolean isDate(String strDate, String pattern) {
		try {
			parse(strDate, pattern);
			return true;
		} catch (ParseException pe) {
			return false;
		}
	}

	/**
	 * 判断给定字符串是否为特定格式日期（包括：年月日yyyy-MM-dd）数据
	 * 
	 * @param strDate
	 *            要判断的日期
	 * @return true 如果是，否则返回false
	 */
	// public static boolean isDate(String strDate) {
	// try {
	// parse(strDate, YYYY_MM_DD);
	// return true;
	// }
	// catch (ParseException pe) {
	// return false;
	// }
	// }

	/**
	 * 判断给定字符串是否为特定格式年份（格式：yyyy）数据
	 * 
	 * @param strDate
	 *            要判断的日期
	 * @return true 如果是，否则返回false
	 */
	public static boolean isYYYY(String strDate) {
		try {
			parse(strDate, YYYY);
			return true;
		} catch (ParseException pe) {
			return false;
		}
	}

	public static boolean isYYYY_MM(String strDate) {
		try {
			parse(strDate, YYYY_MM);
			return true;
		} catch (ParseException pe) {
			return false;
		}
	}

	/**
	 * 判断给定字符串是否为特定格式的年月日（格式：yyyy-MM-dd）数据
	 * 
	 * @param strDate
	 *            要判断的日期
	 * @return true 如果是，否则返回false
	 */
	public static boolean isYYYY_MM_DD(String strDate) {
		try {
			parse(strDate, YYYY_MM_DD);
			return true;
		} catch (ParseException pe) {
			return false;
		}
	}

	/**
	 * 判断给定字符串是否为特定格式年月日时分秒（格式：yyyy-MM-dd HH:mm:ss）数据
	 * 
	 * @param strDate
	 *            要判断的日期
	 * @return true 如果是，否则返回false
	 */
	public static boolean isYYYY_MM_DD_HH_MM_SS(String strDate) {
		try {
			parse(strDate, YYYY_MM_DD_HH_MM_SS);
			return true;
		} catch (ParseException pe) {
			return false;
		}
	}

	/**
	 * 判断给定字符串是否为特定格式时分秒（格式：HH:mm:ss）数据
	 * 
	 * @param strDate
	 *            要判断的日期
	 * @return true 如果是，否则返回false
	 */
	public static boolean isHH_MM_SS(String strDate) {
		try {
			parse(strDate, HH_MM_SS);
			return true;
		} catch (ParseException pe) {
			return false;
		}
	}

	/**
	 * 判断给定字符串是否为特定格式时间（包括：时分秒hh:mm:ss）数据
	 * 
	 * @param strTime
	 *            要判断的时间
	 * @return true 如果是，否则返回false
	 */
	// public static boolean isTime(String strTime) {
	// try {
	// parse(strTime, HH_MM_SS);
	// return true;
	// }
	// catch (ParseException pe) {
	// return false;
	// }
	// }

	/**
	 * 判断给定字符串是否为特定格式日期时间（包括：年月日时分秒 yyyy-MM-dd hh:mm:ss）数据
	 * 
	 * @param strDateTime
	 *            要判断的日期时间
	 * @return true 如果是，否则返回false
	 */
	// public static boolean isDateTime(String strDateTime) {
	// try {
	// parse(strDateTime, YYYY_MM_DD_HH_MM_SS);
	// return true;
	// }
	// catch (ParseException pe) {
	// return false;
	// }
	// }

	/**
	 * 获取一个简单的日期格式化对象
	 * 
	 * @return 一个简单的日期格式化对象
	 */
	private static SimpleDateFormat getFormatter(String parttern) {
		return new SimpleDateFormat(parttern);
	}

	/**
	 * 获取给定日前的后intevalDay天的日期
	 * 
	 * @param refenceDate
	 *            给定日期（格式为：yyyy-MM-dd）
	 * @param intevalDays
	 *            间隔天数
	 * @return 计算后的日期
	 */
	public static String getNextDate(String refenceDate, int intevalDays) {
		try {
			return getNextDate(parse(refenceDate, YYYY_MM_DD), intevalDays);
		} catch (Exception ee) {
			return "";
		}
	}

	/**
	 * 获取给定日前的后intevalDay天的日期
	 * 
	 * @param refenceDate
	 *            Date 给定日期
	 * @param intevalDays
	 *            int 间隔天数
	 * @return String 计算后的日期
	 */
	public static String getNextDate(Date refenceDate, int intevalDays) {
		try {
			java.util.Calendar calendar = java.util.Calendar.getInstance();
			calendar.setTime(refenceDate);
			calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + intevalDays);
			return format(calendar.getTime(), YYYY_MM_DD);
		} catch (Exception ee) {
			return "";
		}
	}

	public static long getIntevalDays(String startDate, String endDate) {
		try {
			return getIntevalDays(parse(startDate, YYYY_MM_DD), parse(endDate, YYYY_MM_DD));
		} catch (Exception ee) {
			return 0l;
		}
	}

	public static long getIntevalDays(Date startDate, Date endDate) {
		try {
			java.util.Calendar startCalendar = java.util.Calendar.getInstance();
			java.util.Calendar endCalendar = java.util.Calendar.getInstance();
			startCalendar.setTime(startDate);
			endCalendar.setTime(endDate);
			long diff = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();
			return (diff / DAY);
		} catch (Exception ee) {
			return 0l;
		}
	}

	/**
	 * 求当前日期和指定字符串日期的相差天数
	 * 
	 * @param startDate
	 * @return
	 */
	public static long getTodayIntevalDays(String startDate) {
		try {
			// 当前时间
			Date currentDate = new Date();

			// 指定日期
			SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date theDate = myFormatter.parse(startDate);

			// 两个时间之间的天数
			long days = (currentDate.getTime() - theDate.getTime()) / DAY;

			return days;
		} catch (Exception ee) {
			return 0l;
		}
	}

	public static Date parseToDate(String dateTimeStr) {
		if (dateTimeStr == null)
			return null;
		Date d = null;
		int formatStrLength = formatStr.length;
		for (int i = 0; i < formatStrLength; i++) {
			d = parseToDate2(dateTimeStr, formatStr[i]);
			if (d != null) {
				break;
			}
		}
		return d;
	}

	private static Date parseToDate2(String dateTimeStr, String formatString) {
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat(formatString);
		try {
			d = sdf.parse(dateTimeStr);
		} catch (ParseException pe) {

		}
		return d;
	}

	/**
	 * 由年、月份，获得当前月的最后一天
	 * 
	 * @param year
	 *            month 月份 12
	 * @return
	 * @throws ParseException
	 */
	public static String getLastDayOfMonth(String year, String month) throws ParseException {
		String LastDay = "";
		Calendar cal = Calendar.getInstance();
		Date date_;
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(year + "-" + month + "-14");
		cal.setTime(date);
		int value = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, value);
		date_ = cal.getTime();
		LastDay = new SimpleDateFormat("yyyy-MM-dd").format(date_);
		return LastDay;
	}

	/**
	 * @param year
	 *            年
	 * @param month
	 *            月(1-12)
	 * @param day
	 *            日(1-31)
	 * @return 输入的年、月、日是否是有效日期
	 */
	public static boolean isValid(int year, int month, int day) {
		if (month > 0 && month < 13 && day > 0 && day < 32) {
			// month of calendar is 0-based
			int mon = month - 1;
			Calendar calendar = new GregorianCalendar(year, mon, day);
			if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) == mon
					&& calendar.get(Calendar.DAY_OF_MONTH) == day) {
				return true;
			}
		}
		return false;
	}

	private static Calendar convert(Date date) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		return calendar;
	}

	/**
	 * 返回指定年数位移后的日期
	 */
	public static Date yearOffset(Date date, int offset) {
		return offsetDate(date, Calendar.YEAR, offset);
	}

	/**
	 * 返回指定月数位移后的日期
	 */
	public static Date monthOffset(Date date, int offset) {
		return offsetDate(date, Calendar.MONTH, offset);
	}

	/**
	 * 返回指定天数位移后的日期
	 */
	public static Date dayOffset(Date date, int offset) {
		return offsetDate(date, Calendar.DATE, offset);
	}

	/**
	 * 返回指定日期相应位移后的日期
	 * 
	 * @param date
	 *            参考日期
	 * @param field
	 *            位移单位，见 {@link Calendar}
	 * @param offset
	 *            位移数量，正数表示之后的时间，负数表示之前的时间
	 * @return 位移后的日期
	 */
	public static Date offsetDate(Date date, int field, int offset) {
		Calendar calendar = convert(date);
		calendar.add(field, offset);
		return calendar.getTime();
	}

	/**
	 * 返回当月第一天的日期
	 */
	public static Date firstDay(Date date) {
		Calendar calendar = convert(date);
		calendar.set(Calendar.DATE, 1);
		return calendar.getTime();
	}

	/**
	 * 返回当月最后一天的日期
	 */
	public static Date lastDay(Date date) {
		Calendar calendar = convert(date);
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
		return calendar.getTime();
	}

	/**
	 * 返回两个日期间的差异天数
	 * 
	 * @param date1
	 *            参照日期
	 * @param date2
	 *            比较日期
	 * @return 参照日期与比较日期之间的天数差异，正数表示参照日期在比较日期之后，0表示两个日期同天，负数表示参照日期在比较日期之前
	 */
	public static long dayDiff(Date date1, Date date2) {
		return getIntevalDays(date1, date2);
	}

	/**
	 * <p>
	 * Checks if two calendar objects are on the same day ignoring time.
	 * </p>
	 * 
	 * <p>
	 * 28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true. 28 Mar 2002
	 * 13:45 and 12 Mar 2002 13:45 would return false.
	 * </p>
	 * 
	 * @param startDate
	 *            the first calendar, not altered, not null
	 * @param endDate
	 *            the second calendar, not altered, not null
	 * @return true if they represent the same day
	 * @throws IllegalArgumentException
	 *             if either calendar is <code>null</code>
	 * @since 2.1
	 */
	public static boolean isSameDay(Calendar startDate, Calendar endDate) {
		if (startDate == null && endDate == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		if (startDate == null || endDate == null) {
			return false;
		}
		return (startDate.get(Calendar.ERA) == endDate.get(Calendar.ERA)
				&& startDate.get(Calendar.YEAR) == endDate.get(Calendar.YEAR)
				&& startDate.get(Calendar.DAY_OF_YEAR) == endDate.get(Calendar.DAY_OF_YEAR));
	}

	public static Date parseDate(String string) {
		return parseDate(string, DATETIME_PATTERN);
	}

	public static Date parseDate(String string, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		try {
			return dateFormat.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static long getHours(Date date) {
		return getHours(date, DEFAULT_TIME_ZONE);
	}

	public static long getHours(Date date, TimeZone timeZone) {
		if (date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	public static long getMinutes(Date date) {
		if (date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	public static String format(Date date) {
		return format(date, DATETIME_PATTERN);
	}

	public static Date getDayBegin(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1, 0, 0, 0);
		return cal.getTime();
	}

	/**
	 * 获得指定日期的起始时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getStartTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获得指定日期的结束时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getEndTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}

	public static Date today() {
		return getStartTime(new Date());
	}

	public static String format(Date date, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	public static String format(Calendar calendar) {
		return format(calendar, DATETIME_PATTERN);
	}

	public static String format(Calendar calendar, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(calendar.getTime());
	}

	/**
	 * 根据不同时区，转换时间
	 */
	public static Date transformTime(Date date, TimeZone oldZone, TimeZone newZone) {
		Date finalDate = null;
		if (date != null) {
			int timeOffset = oldZone.getOffset(date.getTime()) - newZone.getOffset(date.getTime());
			finalDate = new Date(date.getTime() - timeOffset);
		}
		return finalDate;
	}

	/**
	 * GMT 时间(格林时间) 即中央时区时间，北京时间是在东八区，所以北京时间= 格林时间+8小时.
	 * @return
	 */
	public static String getGMTBasicTime() {
		Calendar cd = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS, Locale.US);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT")); // 设置时区为GMT
		String str = sdf.format(cd.getTime());
		return str;
	}
	
	/**
	 * 将 GMT 0时区的时间转换为系统默认时区的时间
	 * @param GMTTimeStr	GMT 0时区的时间 默认YYYYMMDDHHMMSS
	 * @return
	 */
	public static String GMTTimeZoneTransToSysTimeZoneStr(String GMTTimeStr) {
		Date _GMTTimeDate = parseDate(GMTTimeStr, formatStr_yyyyMMddHHmmss);
		Date _localTimeDate = transformTime(_GMTTimeDate, TimeZone.getTimeZone("GMT"), TimeZone.getDefault());
		String _localTimeDateStr = format(_localTimeDate, formatStr_yyyyMMddHHmmss);
		return _localTimeDateStr;
	}

}