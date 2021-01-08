import java.util.Collections;
import java.util.Scanner;

/* A palindromic number is a number (in some base b) that is the same when written forwards or
 backwards. The first few palindromic numbers are therefore are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11,
 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, ... (rule 1).
 In some special cases, 0012100, 000 is a palindromic number. Therefore, 00121, 001210,
 012100, 12100, 00, 0 is also a palindromic number (rule 2).
We can classify positive integers into three categories:
  
Task:
Given N positive numbers, your mission is to classify them into three categories described above.
Input:
 On the first line is one integer, 1 ≤ N ≤ 1000.
 In the next N lines, each line contains a positive integer Ai (0 ≤ i ≤ N-1, 0 ≤ Ai ≤ 10100)
Output:
The result has N lines, the ith line contains a number 0, 1 or 2 depending on the classification of the number Ai.
Example 1:
 Type 0: numbers that not palindromic number.
 Type 1: palindromic numbers according to rule 1.
 
 */
public class PalindromeClassification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr0 = new String[10100];
		String[] arr1 = new String[10100];
		String[] arr2 = new String[10100];
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < 3; i++) {
			sf.append(sc.nextLine());
		}
		sf.reverse();
		System.out.println(sf);
		
	}
}
