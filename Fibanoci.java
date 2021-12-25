package week1.day1;

public class Fibanoci {
public static void main(String[] args) {
	int range = 13;
	int firstNumber = 0;
	int secondNumber =1;
	System.out.println(firstNumber);
	
	for(int i=2;i<range;i++)
	{

		int sum =firstNumber+secondNumber;
		firstNumber=secondNumber;
		secondNumber=sum;
		System.out.println(sum);
		
	}
	
}
	
		
}
