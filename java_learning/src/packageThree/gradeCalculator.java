package packageThree;

import java.util.Scanner;

public class gradeCalculator {

	public static void main(String[] args) {
		
		System.out.println("Enter Stduent's Score ......");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt(); 
		
		boolean gradeA = score>=90;
		boolean gradeB = score<90 && score>=80;
		boolean gradeC = score<80 && score>=70;
		boolean gradeD = score<70 && score>=60;
		
			if(gradeA) {
				
				System.out.println("Student receives Grade A");
				
			}
			
			else if(gradeB) {
				
				System.out.println("Student receives Grade B");
				
			}
			
			else if(gradeC) {
				
				System.out.println("Student receives Grade C");	
				
			}
			
	    else if(gradeD) {
				
				System.out.println("Student receives Grade D");	
				
			}
			
	    else {
	    	
	    	
	    	System.out.println("Student failed the exam");	
	    	
	    }
		
		

	}

}
