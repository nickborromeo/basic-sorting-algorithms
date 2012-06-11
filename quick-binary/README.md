# Binary Search and Quicksort

____

A program that highlights binary and sequential search with an implementation of the quicksort algorithm

---

#### Input
Each input case uses two lines. The first line indicates the contents of the list of numbers. The second line indicates the number being searched in the list.
The program allows multiple inputs.

#### Output
It should output the original numbers (unordered list), location of the number being searched (using sequential search), the numbers in sorted order, the position of the number in the sorted order (using a binary search). If the number is not found, print the corresponding error message. (See sample output.)

---

#### *Sample Input* 

10 2 0 1 4 5 7 8 6 10  
10  
1 2 0 1 4 5 6 7 8 0  
18  
1 2 0 1 4 5 6  
0  

#### *Sample Output*

orig : 10 2 0 1 4 5 7 8 6 10  
The number 10 is at position 1.  
sorted: 0 1 2 4 5 6 7 8 10 10  
The number 10 is at position 9. 

orig : 1 2 0 1 4 5 6 7 8 0  
The number is not in the list.  
sorted: 0 0 1 1 2 4 5 6 7 8  
The number is not in the list. 

orig : 1 2 0 1 4 5 6  
The number 0 is at position 3.  
sorted: 0 1 1 2 4 5 6  
The number 0 is at position 1. 

