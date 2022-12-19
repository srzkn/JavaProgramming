package day20_Arrays;

import java.util.Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[]chars={'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D', 'E', 'E'};
       String result="";
       int high=0;
       char highFreq='a';
        for (int i = 0; i < chars.length; i++) {
            char each=chars[i];
            int count=0;
            for (int i1 = 0; i1 < chars.length; i1++) {
                if (each==chars[i1]) count++;
            }
            if (count==2 && !result.contains(""+chars[i]))
                result+=chars[i]+" ";
            if (count>high)
            {high=count;
            highFreq=each;
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(result);
        System.out.println("highest frequency letter is "+highFreq+" and it appears "+high+" times.");
        }
    }
