import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("before sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}System.out.println();
		SortingSearchingTechniques sortingSearchingTechniques=new SortingSearchingTechniques();
		sortingSearchingTechniques.insertionSort(arr);;
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("enter key to searc");
		int key=scan.nextInt();
		int res=sortingSearchingTechniques.linearSearch(arr, key);
		if(res>=0) {
			System.out.println("key fount at "+res);
		}
		else {
			System.out.println("key not found");
		}
	}
}
