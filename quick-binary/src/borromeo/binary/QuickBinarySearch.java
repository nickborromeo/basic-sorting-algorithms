
//Nicholas Borromeo
package borromeo.binary;
import java.io.*;

public class QuickBinarySearch{
	public static void main (String[] args) throws IOException {
		
		BufferedReader fin = new BufferedReader (new FileReader("searchsort.in"));
		
		while (fin.ready()){
			
			String list = fin.readLine();
			String [] tokens = list.split(" ");
			
			int [] listNum = new int [tokens.length];
			
			for(int i=0; i<tokens.length; i++)
				listNum[i] = Integer.parseInt(tokens[i]);
			
			String number = fin.readLine();
			
			int searchItem = Integer.parseInt(number);
			
			int left = 0;
			int right = listNum.length-1;
			
			display(listNum);
			int position = sequentialSearch(listNum, searchItem);
			displayPosition(searchItem, position);
					
			//selectionSort(listNum);
			quickSort(listNum,left,right);
			
			displaySorted(listNum);
			int binaryPosition = binarySearch(listNum,searchItem,left,right);
			displayPosition(searchItem, binaryPosition);
			System.out.println();	
		}
	
	
			
	}  //end-main
	
	public static void display(int [] list) {
		System.out.print("orig : ");
		for(int i=0; i<list.length; i++)
			System.out.print(list[i]+" ");
			
	} //end-display

	public static void displaySorted(int [] list) {
		System.out.print("sorted: ");
		for(int i=0; i<list.length; i++)
			System.out.print(list[i]+" ");
			
	} //end-displaySorted
	
	public static int sequentialSearch(int[] listNum, int searchItem) {
		
		for(int i=0; i<listNum.length; i++)
			if(listNum[i] == searchItem)
				return i;
		return -1;
		
	}//end-sequentialSearch	
	
	public static int binarySearch(int[] list, int searchItem, int left, int right) {
				
		while (left <= right){
		
			int mid = (left + right) / 2;
			
			if (searchItem > list[mid])
				left = mid+1;
			else if (searchItem < list[mid])
				right = mid-1;
			else
				return mid;	
				
		}//end while
		
		return -1;
		
	}//end-binarySearch	
	
	public static void  displayPosition(int searchItem, int position){
	 	
	 	if (position == -1)
			System.out.println("\nThe number is not in the list.");
		else
			System.out.println("\nThe number " + searchItem + " is at position " + (position+1) + ".");
	 }//end - displayLocation
	 
	public static void quickSort(int [] list, int left, int right){
		
		int i=left, j=right,temp;
		int x = list[(left+right)/2];
		
		do{
			while (list[i]<x)
				i++;
			while (list[j]>x)
				j--;
			if (i<=j){
				
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
				
				i++;
				j--;
			}
			
		}while(i<=j);
		
		if (left<j)
			quickSort(list,left,j);
		if (i<right)
			quickSort(list,i, right);
	}//end quickSOrt
	 
}// end-class