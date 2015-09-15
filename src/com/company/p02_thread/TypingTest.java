package com.company.p02_thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TypingTest {
    //dsaf

    public static void main(String[] args){
        String[] data = {"If", "two", "instances" ,"of", "Random"};// are created with the same seed, and the same sequence of method calls is made for each, they will generate and return identical sequences of numbers. In order to guarantee this property, particular algorithms are specified for the class Random. Java implementations must use all the algorithms shown here for the class Random, for the sake of absolute portability of Java code. However, subclasses of class Random are permitted to use other algorithms, so long as they adhere to the general contracts for all the methods}

        Random random = new Random();
        ArrayList<String> list = new ArrayList<String>();

        while(true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int index = random.nextInt(data.length);
            String word = data[index];
            list.add(word);

            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println("");

            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            for(int i=0; i<list.size(); i++){
                if(input.equals(list.get(i))){
                    list.remove(i);
                    break;
                }
            }
        }

    }
}
