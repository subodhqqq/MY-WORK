/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */    // WAP time and date format
package Question1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class question23
{

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("dd mm yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}


    
}
