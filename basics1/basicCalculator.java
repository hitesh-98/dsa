package basics1;

import java.util.Scanner;

public class basicCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true){
		char ch = scn.next().charAt(0);

		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
			long n1 = scn.nextLong();
			long n2 = scn.nextLong();

			switch(ch)
			{
			case'+':
				System.out.println(n1+n2);
				break;
			case'-':
				System.out.println(n1-n2);
				break;
			case'*':
				System.out.println(n1*n2);
				break;
			case'/':
				System.out.println(n1/n2);
				break;
			case'%':
				System.out.println(n1%n2);
				break;
			}

		}

		else if (ch == 'x' || ch == 'X')
			break;
		else
			System.out.println("Invalid operation. Try again");
		}

	}

}
