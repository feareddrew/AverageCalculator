import java.util.Scanner;
public class Calculator
{

public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	
	int[] num; // array of numbers
	double average; // number average
	int numbers = 0; // how many numbers to average
	
	
	System.out.println("How Many Numbers Do You Want To Calculate?");
	numbers = cin.nextInt();
	num = new int[numbers];
	
	 for(int i = 0; i < num.length; i++ )
	{	
		System.out.println("Enter Number " + (i+1) + ':');
		num[i] = cin.nextInt();
	}
	
	for (int i = 0; i < num.length; i++)
	{
		System.out.println(num[i]);
	}
	
average = Average(num);
	System.out.print(average);
}

public static double Average(int[] avg){
	double average = 0;
	
	for(double i: avg)
	{
		average += i;
	}
	
	if(average == 0)
	{
		return -1;
	}
	
	if(average > 0)
	{
		average = (average / avg.length);
	}
	
	return average;
}

}






