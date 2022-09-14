package studio2;

public class GamblerRuin {

	public static void main(String[] args) {
		
		double winChance = 0.5;
		int winLimit = 8;
		int totalSimulation = 365;
		
		
		int dayNumber = 0;
		int loss = 0;
		
		
	while (dayNumber < totalSimulation) {
		dayNumber ++;
		int startAmount = 3;
		int trial = 0;
		
		while (startAmount < 8 && startAmount >0) {
			trial ++;
			double p1 = Math.random();
			if (p1 <= winChance)
				startAmount++;
			else
				startAmount--;
		}
		
		
		
		boolean result = (startAmount ==8);
		String winLose;
		if (result == true)
			winLose = "WIN";
		else
			winLose = "LOSE";
			loss++;
		System.out.println("simulation day " + dayNumber + ":" + trial + winLose);
		
	}
	System.out.println("Losses:" + loss + "Simulation: 365");
	System.out.println("Ruin Rate from Simulation: " + loss/365 + " Expectated Ruin Rate: 5/8"); 
	}

}
