package packageThree;

public class arrayLoopOne {

	public static void main(String[] args) {
		String firstName [] = new String [6];
		String lastName [] = new String [6];
		
		firstName [0]="Michael";
		firstName [1]="john";
		firstName [2]="Del";
		firstName [3]="Mike";
		firstName [4]="Joe";
		firstName [5]="Peter";
		
		lastName [0]="Scott";
		lastName [1]="david";
		lastName [2]="Mathew";
		lastName [3]="Schur";
		lastName [4]="Biden";
		lastName [5]="Pan";
		
		int x = 0;
		
		while(x<6){
			
			System.out.println(firstName [x] +" " +  lastName [x] );
			
			x++;
		}
		
		

	}

}
