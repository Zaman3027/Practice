package com.company;

public class Practice2 {
    public static void main(String[] args) {
        String values[] = {"P","E","R","F","E","C","T"," ","M","A","N"," ","M","A","K","E"," ","P","R","A","C","T","I","C","E"};
        reverseArray(values,0,values.length);
        reverseWord(values,0,values.length);
        for (String i : values)
            System.out.print(i);
    }

    private static void reverseArray(String[] values, int inital, int length) {
        int f = inital;
        int l = length-1;

        while (f<l){
            String temp = values[f];
            values[f] = values[l];
            values[l] = temp;
            l--;
            f++;
        }


    }

    private static void reverseWord(String[] values, int initail, int length) {
        int initialLength = initail;
        while (initail<length-1){
            if (values[initail].equals(" ")){
                int wordLength = initail;
                reverseArray(values,initialLength,wordLength);
                initialLength = wordLength+1;
            }
            initail++;
        }
        reverseArray(values,initialLength,values.length);
    }


}
