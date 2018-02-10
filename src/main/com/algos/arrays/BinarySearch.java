

public class BinarySearch{
	public static void main(String[] args){
		int[] intArray = {0, 1, 2, 3, 5, 6, 7, 8, 9};
		int searchValue = 4;
		
		int searchIndx = binarySearch_rec(searchValue, 0, intArray.length, intArray);
		System.out.println("Search index is "+searchIndx);

	}

	public static int binarySearchIndx1(int searchValue, int[] intArray){
		int leftIndx =0;
		int rightIndx =intArray.length;
		int midIndx = (rightIndx - leftIndx) / 2;
		int searchIndx = -1;
		while(rightIndx-leftIndx != 2){
			System.out.println(leftIndx +" "+ rightIndx);
			if(intArray[midIndx] != searchValue){
				if(intArray[midIndx] < searchValue){
					leftIndx = midIndx;
				} else {
					rightIndx = midIndx;
				}
				midIndx =(rightIndx - leftIndx)/2;
			}
		}

		if(intArray[midIndx] == searchValue)
			searchIndx = midIndx;

		return searchIndx;
	}

	public static int binarySearchIndx2(int searchValue, int[] intArray){
		int low = 0;
		int high = intArray.length;
		int mid = (high - low) / 2;
		
		while(low <= high){
			System.out.println(low +" "+ high + " "+mid);
			if(intArray[mid] > searchValue){
				high = mid-1;
			}else if(intArray[mid] < searchValue){
				low = mid+1;
			}else {
				return mid;
			}
			mid =low + (high - low) /2;
		}
		return -1;
	}

	public static int binarySearch_rec(int searchValue, int low, int high, int[] intArray){
		if(low > high){
			return -1;
		}

		int mid = low + (high - low)/2;
		if(intArray[mid] == searchValue){
			return mid;
		}else if(intArray[mid] > searchValue){
			return binarySearch_rec(searchValue, low, mid-1, intArray);
		}else{
			return binarySearch_rec(searchValue, mid+1, high, intArray);
		}

	}
 
}