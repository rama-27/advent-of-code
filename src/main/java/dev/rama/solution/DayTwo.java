package dev.rama.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DayTwo {
    public static void sol() throws Exception
    {

        File file = new File(
                "Inputs/input2");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String st;

        int t=0;
        int report=0;
        while ( (st = br.readLine()) != null) {
            System.out.println(st);
            int s;
            String[] y = st.split(" ");
            int len=y.length;
            int[]x= new int[len];
            for(int i=0;i<len;i++){
                x[i]=Integer.parseInt(y[i]);
            }
            if(x[0]<x[len-1]){//15, 12, 10, 8, 7
                for(int i=1;i<len;i++){
                    if(x[i-1]<x[i] && x[i]-x[i-1]<=3 && x[i]-x[i-1]>=1){
                        if(i==len-1){
                            report++;
                        }
                    }
                    else{
                        break;
                    }
                }

            }
            else{
                for(int i=1;i<len;i++){
                    if(x[i-1]>x[i] && x[i-1]-x[i]<=3 && x[i-1]-x[i]>=1){
                        if(i==len-1){
                            report++;
                        }
                    }
                    else{
                        break;
                    }
                }

            }
        }
        System.out.println(report);
    }
}
