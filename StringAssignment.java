import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringAssignment {
	
	public static void removeAllSpace() {
		String str = "    V Soft    ";
		System.out.println("Q1) remove space in: " + str);
		System.out.println(str.trim());
		System.out.println(str.replaceAll(" ", ""));
		System.out.println();
	}
	
	public static void lowToUpOrLowtoUp() {
		String str = "VSoft";
		String str1 = str.toUpperCase();
		String str2 = str.toLowerCase();
		System.out.println("Q2) Lower char to Upper char and vice versa: " + str1);
		System.out.println("Lower char to Upper char and vice versa: " + str2);
		System.out.println();
		
	}
	
	public static void replaceSpeccahr() {
		String str = "VSofttraining";
		System.out.println("Q3) Replace i to n in: " + str);
		System.out.println(str.replace("i", "n"));
		System.out.println();
	}
	
	public static void totalCharsNumber() {
		String str = "VSofttraining";
		System.out.println("Q4) Count the total number of: " + str);
		System.out.println(str.length());
		System.out.println();
		
	}
	
	public static void isPalindrome() {
		String str = "VSoft";
		String reverse = "";
		System.out.println("Q5) Palindrome: " + str);
		str = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		System.out.println(str.equals(reverse));
		
		String str1 = "abcddcba";
		String reverse1 = "";
		System.out.println("Palindrome: " + str1);
		for(int i = 0; i < str1.length(); i++) {
			reverse1 = str1.charAt(i) + reverse1;
		}
		System.out.println(str1.equals(reverse1));
		System.out.println();
	}
	
	public static void reverse() {
		String str = "VSoft";
		String reverse = "";
		System.out.println("Q6) Reverse: " + str);
		str = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		System.out.println(reverse);
		System.out.println();
	}
	
	public static void maxAndMinOccurChar() {
		String str = "abbcccdddd";
		System.out.println("Q7) Max and Min Occurring chars: " + str);
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				Integer count = map.get(ch);
				count += 1;
				map.put(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		/*for(Character key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + " occurs "+ value);
			System.out.println("Q8) Max and Min Occurring chars: " + str);
		}*/
		int max = Collections.max(map.values());
		int min = Collections.min(map.values());
		System.out.println(max + " and " + min);
		System.out.println();
	}
	
	public static void findDuplicateChar() {
		String str = "abbcccdddd";
		System.out.println("Q8) Duplicate char: " + str);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for(Character ch:chars){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> keys = map.keySet();
		for(Character ch:keys){
			int n = map.get(ch);
			if(n > 1){
				System.out.println("Char "+ch+" "+n);
			}
		}
		System.out.println();
	}
	
	public static void findDuplicateWords() {
		String str = "abc bcd abc bcd cdf dfg abcd bcde ";
		System.out.println("Q9) Duplicate word: " + str);
		String words[] = str.split(" ");
		int count;
		for(int i = 0; i < words.length; i++) {
			count = 1;
			for(int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0") {
				System.out.println(words[i]);  
			}
		}
		System.out.println();
	}
	
	public static void charsFreqency() {
		String str = "abbcccdddd";
		System.out.println("Q 10) Characters frequency: " + str);
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				Integer count = map.get(ch);
				count += 1;
				map.put(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		for(Character key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + " occurs "+ value);
		}
		System.out.println();
	}
	
	public static void smallestLargestWord() {
		String str = "a ab abc abcd abcde abcdef";
		System.out.println("Q 11) Find Smallest and Largest Words : " + str);
		String word = "";
		String smallest = "";
		String largest = "";
		int length = 0;
		String[] words = new String[str.length()];
		str = str + " ";
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ' '){
				word = word + str.charAt(i);
			}else {
				words[length] = word;
				length++;
				word = "";
			}				
		}
		smallest = largest = words[0];
		for(int j = 0; j < length; j++) {
			if(smallest.length() > words[j].length())
				smallest = words[j];
			if(largest.length() < words[j].length())    
				largest = words[j];
		}
		System.out.println("Smallest word: " + smallest);    
		System.out.println("Largest word: " + largest); 
		System.out.println();
	}
	
	public static void swapTwoStrings() {
		String str1 = "Vsoft";
		String str2 = "Training";
		System.out.println("Q12) Swap two strings");
		System.out.println("str1: " + str1 + " str2: " + str2);
		str1 = str1 + str2; //VsoftTraining
		str2 = str1.replace(str2, "");
		str1 = str1.replace(str2, "");
		System.out.println("str1: " + str1 + " str2: " + str2);
		System.out.println();
	}
	
	public static void charofGivenIndex() {
		String str = "Vsoft Training";
		System.out.println("Q12) Find the char by given index");
		System.out.println("The char at 0 is " + str.charAt(0));
		System.out.println("The char at 6 is " + str.charAt(6));
		System.out.println();
	}
	
	public static void replaceDwithF() {
		String str = "dddddddddd";
		System.out.println("Replace all d with f in " + str);
		System.out.println(str.replace("d", "f"));
		System.out.println();
	}
	
	public static void secMostFreqentChar() {
		String str = "abbcccddddeeeee";
		System.out.println("Q 15) Find the second most frequent char in: " + str);
		int i = 0;
		int first = 0;
		int second = 0;
		int[] arr = new int[256];
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				arr[str.charAt(i)]++;
			}
		}
		for(i = 0; i < 256; i++) {
			if(arr[i]>arr[first]) {
				second = first;
				first = i;
			}else if(arr[i] > arr[second] && arr[i] != arr[first]){
				second = i ;
			} 
		}
		System.out.print("The Second Most occurring character in a string is "+(char)(second));
		System.out.println();
	}
	
	public static void removeDuplicate() {
		String str = "abbcccddddeeeee";
		System.out.println("Q 15) Remove duplicate char in: " + str);
		char[] ch = str.toCharArray();
		int index = 0;
		for(int i = 0; i < str.length(); i++) {
			int j;
			for(j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					break;
				}
			}
			if(j == i) {
				ch[index++] = ch[i];
			}
		}
		String newStr = String.valueOf(Arrays.copyOf(ch, index));
		System.out.println("After removing: " + newStr);
	}

	public static void main(String[] args) {
		removeAllSpace();
		lowToUpOrLowtoUp();
		replaceSpeccahr();
		totalCharsNumber();
		isPalindrome();
		reverse();
		maxAndMinOccurChar();
		findDuplicateChar();
		findDuplicateWords();
		charsFreqency();
		smallestLargestWord();
		swapTwoStrings();
		charofGivenIndex();
		replaceDwithF();
		secMostFreqentChar();
		removeDuplicate();
	}

}
