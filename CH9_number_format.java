import java.util.Calendar;	
class CH9_number_format{
	public static void main(String args[]){
		//String s = String.format("%, d",1000000000);
		Calendar cal = Calendar.getInstance();
		cal.set(2013,0,7,15,40);
		long day1 = cal.getTimeInMillis();
		day1 += 1000*60*60;
		cal.setTimeInMillis(day1);
		System.out.println("new hour"+cal.get(cal.HOUR_OF_DAY));
	}
}