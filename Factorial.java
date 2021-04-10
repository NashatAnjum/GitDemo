import java.util.*;

public class Factorial {

	
	public static int fact(int n)
	{
		if(n==1) return 1;
		else return(fact(n-1)*n);
		
	}
	public static void main(String[] args) {
		
	System.out.println("enter your number here");
	
	Scanner read_no = new Scanner(System.in);
	
	int given_no = read_no.nextInt();
	
	int result = fact(given_no);
	
	System.out.println(result);
	
	read_no.close();
	
	
		
	}

}
