package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 8, 344, 1, 56);
        sortPuzirek(list);
        System.out.println(list);

        list = Arrays.asList(3, 8, 344, 1, 56);
        sortInsert(list);
        System.out.println(list);
    }

    static List<Integer> sortInsert(List<Integer> mas) {
        int len = mas.size();
        for (int i = 1; i < len; i++) {
            int pos = i;
            for (int j = i; j >= 0; j--) {
                if (mas.get(j) > mas.get(pos)) {
                    Integer buf = mas.get(j);
                    mas.set(j, mas.get(pos));
                    mas.set(pos, buf);
                    pos = j;
                }
            }
        }
        return mas;
    }

    static void sortPuzirek(List<Integer> mas) {
        int len = mas.size();
        int count = 0;
        for (int i = 1; i < len; i++) {
            count = 0;
            for (int j = 0; j < len-1; j++) {
                if (mas.get(j)>mas.get(j+1)){
                    Integer buf = mas.get(j);
                    mas.set(j, mas.get(j+1));
                    mas.set(j+1, buf);
                    count++;
                }
            }
            if (count==0) return;
        }
        return;
    }
}
