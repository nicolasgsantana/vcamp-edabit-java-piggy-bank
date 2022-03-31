public class Challenge {
	
  public static int NumberOfDays(int cost, int savings, int start) {
	  
		int daysToBuyCar = 0;
		int weekday = 0;
		
		while(cost >= savings){
			
			// cada loop do while representa um dia
			savings += start + weekday;
			
			weekday += 1;
			daysToBuyCar += 1;
			
			// a cada 7 dias + 1 é adicionado ao valor inicial
			if(weekday > 6){
				start += 1;
				weekday = 0;
			}
			
		}
		return daysToBuyCar;
	}
}