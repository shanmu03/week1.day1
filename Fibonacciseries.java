package week1.day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range = 10, firstNum = 0, secNum = 1, sum in the series)

				// Print first number
				
				// Iterate from 1 to the range
				
				// add first and second number assign to sum

				// Assign second number to the first number

				// Assign sum to the second number
				
				// print sum
		
		
		int range =10, firstNum=0, secNum =1;
		System.out.println("Print first number ="+ firstNum);
		
		for(int j=1;j<range;j++)
		{
			
		int sum =firstNum+secNum;
		firstNum=secNum;
		secNum=sum ;
	
				System.out.println("Value ="+ sum);
		
		}			
	}

}
