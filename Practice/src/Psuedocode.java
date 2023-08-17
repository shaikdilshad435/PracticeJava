import java.util.Scanner;

public class Psuedocode {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
		String text=scan.nextLine();
		findchar(text);
		
}
public static void findchar(String text) {
	int len=text.length();
	int counter[]=new int[256];
	for(int i=0;i<len;i++) {
		counter[(int)text.charAt(i)]++;
	}
	for(int i=254;i>0;i--) {
		if(counter[i]!=0) {
			if((char)i==' ') {
				continue;
			}
			else {
			System.out.println((char)i+":"+counter[i]);
			}
		}
	}
	
			
}
}
