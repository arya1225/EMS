package org.comp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.comp.pojo.Employee;

public class DateUtil {

	public static boolean isAfterCurrentDate(String joiningDate) throws ParseException {

		// Employee emp = new Employee();
		SimpleDateFormat dateJoin = new SimpleDateFormat("yyyy-MM-dd");
		Date empJoinDate = dateJoin.parse(joiningDate);

		Date date = new Date();
		String date1 = dateJoin.format(date);
		Date currentDate = dateJoin.parse(date1);
		boolean isAfter = empJoinDate.after(currentDate);
		return isAfter;

	}

	public static Date formatStringToDate(String date, String format) throws ParseException {

		Date formattedDate = new SimpleDateFormat(format).parse(date);

		return formattedDate;

	}
}
