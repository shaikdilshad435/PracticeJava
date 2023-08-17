
public class SortingSearchingTechniques {
void bubbleSort(int arr[]) {
	for(int i=0;i<=arr.length-2;i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
			if(arr[j]>arr[j+1]) {
				int help=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=help;
			}
		}
	}
}
void selectionSort(int arr[]) {
	for(int i=0;i<=arr.length-1;i++) {
		int min=arr[i];
		int pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(min>arr[j]) {
				min=arr[j];
				pos=j;
			}
		}
		int help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
	}
}
void insertionSort(int arr[]) {
	for(int i=1;i<=arr.length-1;i++) {
		int element=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>element) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=element;
	}
}
int linearSearch(int arr[],int key) {
	for(int i=0;i<=arr.length-1;i++) {
		if(key==arr[i]) {
			return i;
		}
	}
	return -1;
}
int binarySearch(int arr[],int key) {
	int low=0;
	int high=arr.length-1;
	while(low<=high){
		int mid=(low+high)/2;
		if(key==arr[mid]) {
			return mid;
		}
		else if(key>arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	return -1;
}

}
