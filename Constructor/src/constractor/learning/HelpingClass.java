package constractor.learning;

public class HelpingClass {
	int insideA;
	int insideB;
	
	public HelpingClass(int a, int b) {
		insideA = a;
		insideB = b;
	}

	public void functionOne() {
		int sum = insideA + insideB;
		System.out.println(sum);
	}
	
	public void functionTwo() {
		int sum = insideA + insideB;
		System.out.println(sum);
	}
	
	public void functionThree() {
		System.out.println(insideA - insideB);
	}
}
