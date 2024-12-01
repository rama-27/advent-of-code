package dev.rama.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DayOne {
    public static void sol() throws Exception {
        // File path is passed as parameter
        File file = new File(
                "Inputs/input1");


        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        List<Integer> l1 = new ArrayList<>(1000);
        List<Integer> l2 = new ArrayList<>(1000);
        // Condition holds true till
        // there is character in a string
        int temp = 2000;
        while (temp > 0 && (st = br.readLine()) != null) {
            // Print the string
            // System.out.println(st);
            int s;
            String[] y = st.split("   ");
            s = Integer.parseInt(y[0]);
            l1.add(s);
            temp--;
            s = Integer.parseInt(y[1]);
            l2.add(s);
            temp--;
        }
//    System.out.println("\n\n\n");
//    System.out.println(l1.getFirst());
//    System.out.println(l1.getLast());
//    System.out.println(l2.getFirst());
//    System.out.println(l2.getLast());
//    System.out.println("\n\n\n");
        Collections.sort(l1);
        Collections.sort(l2);
        int res = 0;
        int d  ;
        while (l1.size() > 0) {
            d = Math.abs(l1.get(0) - l2.get(0));
            res += d;
            l1.remove(0);
            l2.remove(0);
        }
        System.out.println("\n\n\n" + res);
    }
}

