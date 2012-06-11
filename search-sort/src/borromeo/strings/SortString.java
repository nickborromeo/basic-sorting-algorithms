package borromeo.strings;
//Nicholas Borromeo & Nico Romano Torrejon
//Searching and Sorting Strings
//July 18, 2006

import java.io.*;

public class SortString {
	public static void main (String[] args) throws IOException {
		
		BufferedReader fin = new BufferedReader (new FileReader("strings.in"));
		
		String input = fin.readLine();
		int cases = Integer.parseInt(input);
		
		String [] words = new String [cases];
		
		for (int i=0; i<cases; i++){
			
			String input1 = fin.readLine();
			words[i] = input1;
		}
		
		String input2 = fin.readLine();
	
		display(words);
		displayLocation(words, input2);
		
		//selectionSort(words);
		//bubbleSort(words);	//Remove comment to use Bubble Sort
		insertionSort(words);		//Remove comment to use Insertion Sort
		System.out.println();
		
		display(words);
		displayLocation(words, input2);

			
	}  //end-main
	
	public static void display(String[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}	
	
	} //end-display
	
	public static int sequentialSearch(String[] words, String searchWord) {
		
		for(int i=0; i<words.length; i++)
			if(words[i].equals(searchWord))
				return i;
		return -1;
		
	}//end-sequentialSearch	
	
	public static void bubbleSort(String[] words) {
		String temp;
		int counter, index;
		
		for(counter=0; counter<(words.length-1); counter++) {
	
			for(index=0; index<(words.length-1)-counter; index++) {
	
				if (words[index].compareTo(words[index+1]) > 0) {
					//swap
					temp = words[index];
					words[index] = words[index+1];
					words[index+1] = temp;
	
				} //end-if
	
			} //end-for index
	
		}//end-for counter
	
	} //end-bubbleSort
	
	public static void selectionSort(String[] words) {
		int index, smallestIndex, minIndex;
		String temp = " ";
			
		for(index=0; index<(words.length-1); index++) {
			smallestIndex = index;
			for(minIndex=index+1; minIndex<words.length; minIndex++) 
				if (words[minIndex].compareTo(words[smallestIndex]) < 0) 
					smallestIndex=minIndex;	
			//swap
			temp = words[smallestIndex];
			words[smallestIndex] = words[index];
			words[index] = temp;	
	
		}//end-for index
	
	} //end-selectionSort
	
	public static void insertionSort(String[] words) {
		
		int firstOutOfOrder, location;
		String temp;
			
		for(firstOutOfOrder=1; firstOutOfOrder<words.length; firstOutOfOrder++) {
			if (words[firstOutOfOrder].compareTo(words[firstOutOfOrder-1]) < 0) {
				
				temp = words[firstOutOfOrder];
				location = firstOutOfOrder;
				do {
					words[location] = words[location-1];
					location--;
				} while (location>0 && words[location-1].compareTo(temp) > 0);
			
			words[location] = temp;
			
			} //end-if
		
		}//end-for firstOutOfOrder
	
	} //end-insertionSort
	
	 public static void  displayLocation(String[] array, String searchItem){
	 	
	 	int stringLocation = sequentialSearch(array,searchItem);
	 	
	 	if (stringLocation == -1)
			System.out.println("\n" + searchItem +  " is not in the list.");
		else
			System.out.println("\n" + searchItem + " is at index " + stringLocation+".");
	 }//end - displayLocation
	
}// end-class