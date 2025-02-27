package homework02;
import java.util.Scanner;

public class numConvert {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		int reverse = 0;	
		while(x>0) {
			reverse = reverse*10+(x%10);
			x = x/10;
		}
		System.out.println(x);
		
		input.close();
	}

}