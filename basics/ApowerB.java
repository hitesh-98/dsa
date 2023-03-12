package basics;
import java.util.Scanner;

public class ApowerB {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int power = 1;
		while(b>0)
		{
			power = a*power;
			b--;
		}
		System.out.println(power);

	}

}
