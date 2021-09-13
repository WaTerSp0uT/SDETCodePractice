package javapractice;

import java.util.*;

public class DuplicatesInArrayDemo {
    //using brute force method
    public static void main(String[] args) {
        int[] numbArr = {1, 4, 6, 3, 1, 3, 5};

        findDuplicatesBruteForce(numbArr);
        findDuplicatesUsingSorting(numbArr);
        findDuplicatesUsingHashSet(numbArr);
        findDuplicateUsingHashMap(numbArr);
    }

    // o(n^2) using nested loop
    public static void findDuplicatesBruteForce(int[] numbArr) {
        for (int i = 0; i < numbArr.length; i++) {
            for (int j = i + 1; j < numbArr.length; j++) {
                if (numbArr[i] == numbArr[j]) {
                    System.out.println("The Duplicated number found =>" + numbArr[i]);
                }
            }
        }
    }

    //Using sorting o(n)+o(nlog)
    public static void findDuplicatesUsingSorting(int[] numbArr) {
        Arrays.sort(numbArr);
        //need to use -1 cuse of index out of bound
        for (int i = 0; i < numbArr.length - 1; i++) {
            if (numbArr[i] == numbArr[i + 1]) {
                System.out.println("Duplicates element is :" + numbArr[i]);
            }
        }
    }
    //Using HashSet  o(n)
    public static void findDuplicatesUsingHashSet(int[] numbArr) {
        Set<Integer> mySet = new HashSet<Integer>();
        for (int num : numbArr) {
            if (!mySet.add(num))
                System.out.println("Hash Duplicates element is :" + num);
        }
    }
    //Using HashMap <Key,Count>
    public static void findDuplicateUsingHashMap (int[] numbArr){
        Map <Integer,Integer> myMap = new HashMap<>();

        for (int numb: numbArr) {
            if(! myMap.containsKey(numb) ){
                myMap.put(numb,1);
            }else {
                myMap.put(numb, myMap.get(numb)+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("HashMap Duplicate found: " + entry.getKey());
            }
        }

    }

}
