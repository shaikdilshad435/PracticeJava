import java.util.Scanner;

public class LCMOfTwoNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int m=scan.nextInt();
	int n=scan.nextInt();
	
	int res=gcd(m, n);
	int lcm=(m*n)/res;
	System.out.println(lcm);
	
}
static int gcd(int m,int n) {
	while(n>0) {
int rem=m%n;
m=n;
n=rem;
}
	
	return m;
}
}
