package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercDate {
	
	public static void main(String[]args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("23/07/2002");
		Date y2 = sdf2.parse("23/07/2002 15:42:07");
		System.out.println("y1 : " + sdf2.format(y1));
		System.out.println("y2 : " + sdf2.format(y2));
		System.out.println(sdf2.format(x1));
	}

}
