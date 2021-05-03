package cellularAutomata;

import java.util.Random;

public class Prng {

	public static void main(String[] args) {
		
		System.out.println();
	}
	
	public String generaCadena(int n) {
		String result = "";
		for(int i = 0; i<n ; i++)
			if(Math.random() > 0.5)
				result += "1";
			else
				result += "0";
		return result;
	}
	
	public int generaRandom() {
		Random random = new Random();
		return random.nextInt(225)+32; 
	}

}
