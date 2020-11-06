package exercise1;

import java.util.ArrayList;
import java.util.List;

interface Filter<T> {
    boolean accept(T x);
}

public class Exercise1 {
    public static String[] filter(String[] a, Filter<String> f) {
        //list will contain all Strings that have at least 9 characters
        List<String> list = new ArrayList<>();
        for (String str : a) {
            //check if String is accepeted, if it is, add to arraylist
            if (f.accept(str))
                list.add(str);
        }
        //convert to arraylist to array
        String[] ans = new String[list.size()];
        ans = list.toArray(ans);
        return ans;
    }

    public static int[] filter(int[] a, Filter<Integer> f) {
        //list will contain all values that are positive
        List<Integer> list = new ArrayList<>();

        for (int num : a) {
            //check if number is accepted, if it is, add to arraylist
            if (f.accept(num))
                list.add(num);
        }
        int[] ans = new int[list.size()];
        //copy values from arraylist to array
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        FilterClass<Integer> a = new FilterClass<>();
        FilterClass<String> b = new FilterClass<>();
        int[] intArray = new int[]{3, -3, 31, 1, -1, -10};

        System.out.println("Integer array before filtering: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        //call filter method to filter out negative numbers
        int[] positiveNumbers = filter(intArray, a);

        System.out.println("\n\nFiltered Numbers:");

        for (int i = 0; i < positiveNumbers.length; i++) {
            System.out.print(positiveNumbers[i] + " ");
        }

        System.out.println("\n\nString array before filtering: ");

        String[] strArray = new String[]{"abc", "def", "abcdefhifas", "adsfasdfsfd", "aa", "asdsadfsdf"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }

        //call filter method to filter out Strings with less than 9 characters
        String[] longStrings = filter(strArray, b);


        System.out.println("\n\nFiltered Strings: ");

        for (int i = 0; i < longStrings.length; i++) {
            System.out.print(longStrings[i] + " ");
        }
    }
}

class FilterClass<T> implements Filter<T> {
    @Override
    public boolean accept(T x) {
        //
        if (x instanceof String) {
            String ex = (String) x;
            //returns true if String is at least 9 characters
            return ex.length() > 9 ? true : false;
        }
        if (x instanceof Integer) {
            int ex = (Integer) x;
            //returns true if number is positive
            return (ex > 0) ? true : false;
        }
        return false;
    }
}

