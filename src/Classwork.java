
public class Classwork {

	public static void main(String[] args) {
		String evens = "evens: ", odds = "odds: ";
		int[] x = new int[10];
		for (int j = 0 ; j < x.length; j++) {
			x[j]= (int)(Math.random() * 100 +1);
			if (x[j]%2==0)
				evens += x[j] + " ";
			else
				odds += x[j] + " ";
			
		}
		
		

	}

}
