public class Challenge {
	
  public static int NumberOfDays(int cost, int savings, int start) {
	  
		int days= 0;
		int weekDay = 0;
		
		while(cost >= savings){
			
			savings += start + weekDay;
			
			weekDay += 1;
			days += 1;
			
			if(weekDay > 6){
				start += 1;
				weekDay = 0;
			}
			
		}
		return days;
	}
}