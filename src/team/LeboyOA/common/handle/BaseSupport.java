package team.LeboyOA.common.handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseSupport {

	public static int getPageSize(String size, int commnum) {
		int _num = 0;
		int _pageCount = Integer.parseInt(size);
		if (_pageCount % commnum == 0) {
			_num = _pageCount / commnum;
		} else {
			_num = _pageCount / commnum + 1;
		}
		return _num;
	}
	//比较请假是否逾期
	/*public static int getDuration(String leave_time, String back_time, String duration) {
		int _num = 0;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		int vacation_duration = Integer.parseInt(duration);
		String new_date = "";
		try {
			new_date = addDateHour(leave_time, vacation_duration);
			Date date_new = format.parse(new_date);
			Date date_back = format.parse(back_time);
			if(date_new.compareTo(date_back) >=0){
				_num = 7;
			}else {
				_num = 6;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return _num;
	}*/
	//日期加请假小时
/*	public static String addDateHour(String day, int x)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 24小时制  
		Date date = null;   
		try {
				date = format.parse(day);   
			} catch (Exception ex) {   
				ex.printStackTrace();   
			}
			Calendar cal = Calendar.getInstance();   
			cal.setTime(date);   
			cal.add(Calendar.HOUR, x);  
			date = cal.getTime();   
			cal = null;   
			return format.format(date);   
	}*/
	public static int getDuration(String back_time, String actual_back_time) {
		int _num = 0;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		try {
			Date date_new = format.parse(actual_back_time);
			Date date_back = format.parse(back_time);
			if(date_new.compareTo(date_back) <=0){
				_num = 7;
			}else {
				_num = 6;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return _num;
	}
	
}
