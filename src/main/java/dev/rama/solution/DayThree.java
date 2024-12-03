package dev.rama.solution;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayThree {
    public static void sol() throws IOException {

    /*

    Using bash is the way :)
     grep -oE 'mul\([0-9]{1,3},([0-9]{1,3})\)' yo |
     grep -oE '[0-9]*' |
     awk '{if (NR%2==1) {a=$1} else {print a * $1}}'|
     awk '{sum+=$1} END  {print sum}'
     */
        File file = new File(
                "Inputs/input3fromgrep");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String regex = "mul\\(([0-9]{1,3}),([0-9]{1,3})\\)";
        Pattern pattern = Pattern.compile(regex);
        String st;

        int res=0;
        while ( (st = br.readLine()) != null) {
            System.out.println(st);
            int s;


            // Example strings to match

            Matcher matcher = pattern.matcher(st);

            // Find all matches in the string
            while (matcher.find()) {
                System.out.println("Full match: " + matcher.group(0));
                System.out.println("First number: " + matcher.group(1));
                System.out.println("Second number: " + matcher.group(2));
                System.out.println("---");
                res+=Integer.parseInt(matcher.group(1))*Integer.parseInt(matcher.group(2));

            }
        }
        System.out.println("\n\n"+res);
    }
}
