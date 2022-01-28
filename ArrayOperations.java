import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


 class ArrayOperations {
	static int[] sort(int[] anArray) {
		int temp = 0;
		for (int i = 0; i <anArray.length; i++) {     
			for (int j = i+1; j <anArray.length; j++) {     
				if(anArray[i] >anArray[j]) {      //swap elements if not in order
	            	temp = anArray[i];    
	            	anArray[i] = anArray[j];    
	            	anArray[j] = temp;    
	             }     
	         }     
	     }
				
		return anArray;
	}
	
	static int[] reverse(int[] anArray) {
		
		int len = anArray.length;
		for(int i = 0; i < len / 2; i++) {
			int temp = anArray[i];
			anArray[i] = anArray[len - 1 - i];
			anArray[len - 1 - i] = temp;
		}
		for(int i : anArray) {
			System.out.print(i + " ");
		}
		return anArray;
	}
	
	public static int findSum(int[] anArray)
    {
        int sum = 0;
        for(int i= 0; i < anArray.length; i++){
            sum += anArray[i];
        }
        return sum;
    }
	
	public static double findAverage(int[] anArray){
        int sum = 0;
        double ave = 0;

        sum = findSum(anArray);
        ave = sum / anArray.length;
        return ave;
    }
	
	public static boolean findSpec(int[] anArray, int spec) {
		boolean flag = false;
		for(int i = 0; i < anArray.length; i++) {
			if(anArray[i] == spec) {
				flag = true;
			}
		}
		return flag;
	}
	
	public static int findIndex(int[] anArray, int value) {
		int index = 0;
		for(int i = 0; i < anArray.length; i++) {
			if(anArray[i] == value) {
				index = i;
			}
		}
		return index;
	}
	
	public static int[] removeSpec(int[] anArray, int spec) {
		int pointer = 0;
		int len = 0;
		for(int i = 0; i < anArray.length; i++) {
			if(anArray[i] == spec) {
				len++;
			}
		}
		int newArray[] = new int[anArray.length - len];
		for(int i = 0; i < anArray.length; i++) {
			if(anArray[i] != spec) {
				newArray[pointer] = anArray[i];
				pointer++;
			}
		}
		for(int i : newArray) {
			System.out.print(i + " ");
		}
		return newArray;
	}
	
	public static int[] findMaxMin(int[] anArray){
        int[] limits = new int[2];
        int max = anArray[0];   
        int min = anArray[0];   

        for(int i = 0; i < anArray.length; i++){
            if(max < anArray[i])
                max = anArray[i];
            if(min > anArray[i])
                min = anArray[i];
        }
        limits[0] = max;
        limits[1] = min;
        return limits;
    }
	
	public static int[] findDuplicateInt(int[] anArray) {
		int[] duplicate = new int[anArray.length];
		int k = 0;
		for(int i = 0; i < anArray.length; i++) {
			for(int j = i+1; j < anArray.length; j++) {
				if(anArray[i] == anArray[j]) {
					duplicate[k] = anArray[i];
					k++;
				}
			}
		}
		return duplicate;
	}
	
	public static String[] findDuplicateString(String[] anArray) {
		String[] duplicate = new String[anArray.length];
		int k = 0;
		for(int i = 0; i < anArray.length; i++) {
			for(int j = i+1; j < anArray.length; j++) {
				if(anArray[i] == anArray[j]) {
					duplicate[k] = anArray[i];
					k++;
				}
			}
		}
		return duplicate;
	}
	
	public static String[] findCommon(String[] first, String[] second) {
		String[] common = new String[first.length];
		int k = 0;
		for(int i = 0; i < first.length; i++) {
			for(int j = 1; j < second.length; j++) {
				if(first[i] == second[j]) {
					common[k] = first[i];
					k++;
				}
			}
		}
		return common;
	}
	
	public static List removeDuplicate(int[] anArray) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < anArray.length; i++) {
			if(!list.contains(anArray[i])) {
				list.add(anArray[i]);
			}
		}
		return list;
	}
	
	public static int findSecondLagest(int[] anArray) {
		anArray = sort(anArray);
		int secLag = anArray[anArray.length - 2];
		return secLag;
	}
	
	public static int findSecondSmallest(int[] anArray) {
		anArray = sort(anArray);
		int secSma = anArray[1];
		return secSma;
	}
	
	public static int[] separateEvenOdd(int[] anArray) {
		for (int i = 0; i <=anArray.length/2 ; i++) {
			for(int j = anArray.length-1;j >= anArray.length/2; j--) {
				if(anArray[i] % 2 != 0 && anArray[j] % 2 ==0) {
					int temp = anArray[i];
					anArray[i] = anArray[j];
					anArray[j] = temp;
				}
			}
		}
		return anArray;
	}
	
	public static int findKLagest(int[] anArray, int k) {
		anArray = sort(anArray);
		int kLag = anArray[anArray.length - k];
		return kLag;
	}
	
	public static int findKSmallest(int[] anArray, int k) {
		anArray = sort(anArray);
		int ksmal = anArray[k-1];
		return ksmal;
	}
	
	public static void swapTwoArray(int[] first, int[] second) {
		for (int i = 0; i < first.length ; i++) {
			int temp = first[i];
			first[i] = second[i];
			second[i] = temp;
		}
		System.out.print("arr1 = ");
		for(int i : first) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("arr2 = ");
		for(int i : second) {
			System.out.print(i + " ");
		}
	}
	
	public static void swapThreeArray(int[] first, int[] second, int[] third) {
		for (int i = 0; i < first.length ; i++) {
			int temp = first[i];
			first[i] = second[i];
			second[i] = third[i];
			third[i] = temp;
		}
		System.out.print("arr1 = ");
		for(int i : first) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("arr2 = ");
		for(int i : second) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("arr3 = ");
				for(int i : third) {
			System.out.print(i + " ");
		}
	}
	
	public static int[]copyArray(int[] anArray){
		int[] newArray = new int[anArray.length];
		for (int i = 0; i < anArray.length ; i++) {
			newArray[i] = anArray[i];
		}
		for(int i : newArray) {
			System.out.print(i + " ");
		}
		return newArray;
	}
	
	public static void findFrequency(int[] anArray) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < anArray.length; i++) {
			if(map.containsKey(anArray[i])) {
				int frequency = map.get(anArray[i]);
				map.put(anArray[i], frequency+1);
			}else {
				map.put(anArray[i], 1);
			}
		}
		System.out.println(map);
	}
	
	public static void printEvenPosition(int[] anArray) {
		for(int i = 0; i < anArray.length; i += 2) {
			System.out.print(anArray[i] + " ");
		}
	}
	
	public static void printOddPosition(int[] anArray) {
		for(int i = 1; i < anArray.length; i += 2) {
			System.out.print(anArray[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Q1: Average of array");
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] newArr = new int[arr.length];
		
		
		
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("Average: " + findAverage(arr));
		System.out.println();
		
		
		System.out.println("Q2: Contains specific value ’2‘ in the array");
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		boolean flag = findSpec(arr, 2);
		if(flag = true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println();
		
		
		System.out.println("Q3: find the index of value ’3‘ in the array");
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		int index = findIndex(arr, 3);
		System.out.println("the index of 3 is " + index);
		System.out.println();
		
		
		System.out.println("Q4: remove the value ’4‘ in the array");
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		removeSpec(arr, 4);
		System.out.println();
		
		
		System.out.println("Q5: Min and max in the array");
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("Max is " + findMaxMin(arr)[0] + " Min is " + findMaxMin(arr)[1]);
		System.out.println();
		
		
		System.out.println("Q6: Reverse the array");
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		reverse(arr);		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q7: Dupulicate value in the string array");
		String[] strArr = {"Java", "Python", "C", "Java", "C++", "C"};
		for(String i : strArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		for(String j : findDuplicateString(strArr)) {
			System.out.print(j + " ");
			}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q8: Dupulicate value in the int array");
		int[] intArr = {1, 2, 3, 4, 5, 6, 2};
		for(int i : intArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		for(int i : findDuplicateInt(intArr)) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q9: Common value in two arrays");
		String[] firstArr = {"Java", "Python", "C"};
		for(String i : firstArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		String[] secondArr = {"C++", "C#", "Java"};
		for(String i : secondArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		for(String i : findCommon(firstArr, secondArr)) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q10: Remove dupulicate value in the arrays");
		for(int i : intArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		List<Integer> newlist = new ArrayList<Integer>();
		newlist = removeDuplicate(intArr);
		System.out.println(newlist);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q11: Second lagest");
		for(int i : intArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("Second lagest: " + findSecondLagest(intArr));
		System.out.println();
		
		
		System.out.println("Q12: Second Smallest");
		for(int i : intArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("Second smallest: " + findSecondSmallest(intArr));
		System.out.println();
		
		
		System.out.println("Q13: Separate even and odd in the array");
		int[] mixArr = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i : mixArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		for(int i : separateEvenOdd(mixArr)) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q14: find k = '4' lagest value in the array");
		for(int i : mixArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		int lagk = findKLagest(mixArr, 4);
		System.out.println("4th lagest: " + lagk);
		System.out.println();
		
		
		System.out.println("Q15: find k = '4' smallest value in the array");
		for(int i : mixArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		int smalk = findKSmallest(mixArr, 4);
		System.out.println("4th smallest: " + smalk);
		System.out.println();
		
		
		System.out.println("Q16 and Q26: Swap two arrays");
		int[] arr1 = {1, 2, 3};
		System.out.print("arr1 = ");
		for(int i : arr1) {
			System.out.print(i + " ");
			}
		System.out.println();
		int[] arr2 = {4, 5, 6};
		System.out.print("arr2 = ");
		for(int i : arr2) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		swapTwoArray(arr1, arr2);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q17 and Q27: Swap Three arrays");
		int[] farr = {1, 2, 3};
		System.out.print("arr1 = ");
		for(int i : farr) {
			System.out.print(i + " ");
			}
		System.out.println();
		int[] sarr = {4, 5, 6};
		System.out.print("arr2 = ");
		for(int i : sarr) {
			System.out.print(i + " ");
			}
		System.out.println();
		int[] tarr = {7, 8, 9};
		System.out.print("arr3 = ");
		for(int i : tarr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		swapThreeArray(farr, sarr, tarr);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q18: Copy an old array to a new array");
		int[] oldarr = {2, 4, 6, 8, 0};
		System.out.println("Old array: ");
		for(int i : oldarr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("New array: ");
		copyArray(oldarr);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q19: The frequency of each value in the array");
		int[] freArr = {1, 2, 2, 4, 5, 6, 6, 8};
		for(int i : freArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		findFrequency(freArr);
		System.out.println();
		
		
		System.out.println("Q20: Reverse the array");
		for(int i : freArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		reverse(freArr);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q21: Print even position in the array");
		int[] poArr = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i : poArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		printEvenPosition(poArr);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q22: Print odd position in the array");
		for(int i : poArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		printOddPosition(poArr);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q23: Sum of the array");
		for(int i : poArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("Sum is " + findSum(poArr));
		System.out.println();
		
		
		System.out.println("Q24: Print the array in ascending");
		int[] inArr = {3, 6, 7, 2, 1, 8, 4, 5};
		for(int i : inArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		for(int i : sort(inArr)) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Q25: Print the array in ascending");
		int[] deArr = {3, 6, 7, 2, 1, 8, 4, 5};
		for(int i : deArr) {
			System.out.print(i + " ");
			}
		System.out.println();
		for(int i : sort(deArr)) {
			System.out.print(i + " ");
			}
		System.out.println();
		reverse(deArr);
		System.out.println();
		System.out.println();
	}
	
}
