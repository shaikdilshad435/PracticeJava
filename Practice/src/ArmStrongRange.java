import java.util.Scanner;

public class ArmStrongRange {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter start and stop positions");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int count=0;
	for(int i=num1;i<=num2;i++) {
		int pow=getcount(i);
		int res=getsum(i, pow);
		if(i==res) {
			System.out.print(res+" ");
			count++;
		}
	}System.out.println();
	System.out.println("there are "+count+" in between "+num1+" and "+num2);
}
public static int getcount(int n) {
	
	int count=0;
	while(n!=0) {
		int digi=n%10;
		count++;
		n=n/10;
	}
	return count;
}
public static int getsum(int n,int pow) {
	int sum=0;
	if(n==0) {
		return 0;
	}
	while(n!=0) {
		int digi=n%10;
		int value=(int)Math.pow(digi, pow);
		sum=sum+value;
		n=n/10;
	}
	return sum;
}
}
