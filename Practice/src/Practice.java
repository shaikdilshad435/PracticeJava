import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double num=scan.nextInt();
	int res=(int)Math.round (tax(num));
	System.out.printf("%d%n",res);
}
public static double tax(double income) {
	double tax=0;
	if(income<=250000) {
		return tax;
	}
	else if(income>250000&&income<=500000) {
		tax=(income-250000)*0.05;
		return tax;
	}
	
	return tax;
}
}
