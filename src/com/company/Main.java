package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*
* Question is {"P","E","R","F","E","C","T"," ","M","A","K","E"," ","P","R","A","C","T","I","C","E"} is an array I have to make it
* {"P","R","A","C","T","I","C","E"," ","M","A","K","E"," "P","E","R","F","E","C","T"}
*
* I have Finally solved it but I am getting extra space in my answer
* PRACTICE MAKE  PERFECT
*
* help me out with this
* and suggest me better solution
* Thank You!!
* */

public class Main {

    public static void main(String[] args) {
	// write your code here
        String values[] = {"P","E","R","F","E","C","T"," ","M","A","K","E"," ","P","R","A","C","T","I","C","E"};
        int lastLength = 0;
        int initialLength = 0;
        List<String> newValue = new ArrayList<>();
        lastLength = values.length;

        //position of space
        Stack<Integer> positionOfSpace = new Stack<>();
        positionOfSpace.push(0);
        for (int i =0; i<values.length; i++){
            if (values[i].equals(" ")){
                positionOfSpace.push(i);
            }
        }

        //System.out.println(positionOfSpace);
        while (!positionOfSpace.empty()){
            initialLength = positionOfSpace.pop();
            //System.out.println(initialLength);
            if (initialLength == 0)
                initialLength = -1;

            for (int i =initialLength+1; i<lastLength; i++ ){
                newValue.add(values[i]);
            }
            newValue.add(" ");
            lastLength = initialLength+1;


        }

        for (String i: newValue)
            System.out.print(i);

    }
}
