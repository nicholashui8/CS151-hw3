package exercise1;

import java.util.ArrayList;
import java.util.List;

interface Filter<T> {
    boolean accept(T x);
}

public class Exercise1 {
    public static String[] filter(String[] a, Filter<String> f) {
        List<String> list = new ArrayList<>();
        for (String str : a) {
            if (f.accept(str))
                list.add(str);
        }
        String[] ans = new String[list.size()];
        ans = list.toArray(ans);
        return ans;
    }

    public static int[] filter(int[] a, Filter<Integer> f) {
        List<Integer> list = new ArrayList<>();
        System.out.println(f.accept(-65));
        for (int num : a) {
            if (f.accept(num))
                list.add(num);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        FilterClass<Integer> a = new FilterClass<>();
        FilterClass<String> b = new FilterClass<>();
        int[] intArray = new int[]{3, -3, 31, 1, -1, -10};
        String[] strArray = new String[]{"abc", "def", "abcdefhifas", "adsfasdfsfd", "aa", "asdsadfsdf"};
        filter(intArray, a);
    }
}

class FilterClass<T> implements Filter<T> {
    @Override
    public boolean accept(T x) {
        if (x instanceof String) {
            String ex = (String) x;
            return ex.length() > 9 ? true : false;
        }
        if (x instanceof Integer) {
            int ex = (Integer) x;
            return (ex > 0) ? true : false;
        }
        return false;
    }
}

