package practice;

public class helloWorld {

	public static void main(String[] args) {
		
		int totalDays=109;
		int month=0;
		int days=0;
		for(int i=1;i<=totalDays;i++) {
			if (i%30==0) {
				month++;
			}
			}
		days=totalDays-month*30;
		
		System.out.println(month+ " MONTHS " +days+ " DAYS" );
		 }

	
		
	
	
	
}
