package com.thi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<int[]> list = new ArrayList();

        list.add(new int[]{1, 3, 2, 1}); // false
        list.add(new int[]{1, 3, 2}); // true
        list.add(new int[]{1, 2, 1, 2}); // false
        list.add(new int[]{1, 4, 10, 4, 2}); // false
        list.add(new int[]{10, 1, 2, 3, 4, 5}); // true
        list.add(new int[]{1, 1, 1, 2, 3}); // false
        list.add(new int[]{0, -2, 5, 6}); // true
        list.add(new int[]{1, 2, 3, 4, 5, 3, 5, 6}); // false
        list.add(new int[]{40, 50, 60, 10, 20, 30}); // false
        list.add(new int[]{1, 1}); // true
        list.add(new int[]{10, 1, 2, 3, 4, 5, 6, 1}); // false
        list.add(new int[]{1, 2, 3, 4, 3, 6}); // true
        list.add(new int[]{1, 2, 3, 4, 99, 5, 6}); // true

        for (int i = 0; i < list.size(); i++) {
            boolean result = almostIncreasingSequence(list.get(i));
            System.out.println(i + " - " + result);
        }
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int breakCnt = 0;
        int before;

        if (sequence.length > 0 && sequence[0] < sequence[1]) {
            before = sequence[0];
        } else {
            breakCnt++;
            before = sequence[1];
        }

        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                breakCnt++;

                if(before < sequence[i+1]) {
                    continue;
                }

                if(i < sequence.length - 2 && sequence[i] < sequence[i + 2]) {
                    before = sequence[i];
                    continue;
                }

                breakCnt++;
            } else {
                before = sequence[i];
            }
        }

        System.out.println(breakCnt + "\n");
        if (breakCnt == 1) {
            return true;
        }
        return false;
    }

}
