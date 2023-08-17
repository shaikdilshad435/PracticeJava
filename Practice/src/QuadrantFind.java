import java.util.Scanner;

public class QuadrantFind {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
System.out.println("enter  x and y");
int x=scan.nextInt();
int y=scan.nextInt();
quadrant(x, y);
}
public static void quadrant(int x,int y) {
	if(x>0&&y>0) {
		System.out.println("1st quadrant");
	}
	else if(x<0&&y>0) {
		System.out.println("2nd quadrabnt");
	}
	else if(x<0&&y<0) {
		System.out.println("3rd quadrabnt");
	}
	else if(x>0&&y<0) {
		System.out.println("4th quadrabnt");
	}
	else if(x!=0&&y==0) {
		System.out.println("X-axis");
	}
	else if(x==0&&y!=0) {
		System.out.println("y-axis");
	}
	else {
		System.out.println("origin");
	}
}
}
