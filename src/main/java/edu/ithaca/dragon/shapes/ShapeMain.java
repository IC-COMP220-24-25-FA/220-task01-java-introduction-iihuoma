package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        List<Rectangle> allRectangles;
        allRectangles = new ArrayList<Rectangle>();
        allRectangles.add(new Rectangle(16, 12));
        allRectangles.add(new Rectangle(2, 20));
        allRectangles.add(new Rectangle(45,67));
        allRectangles.add(new Rectangle(12, 9));
        allRectangles.add(new Rectangle(37,46));
        
        for (int i = 1; i <= 5; ++i){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number 0-4");
            int number = myObj.nextInt();
            allRectangles.get(number).doubleSize();
            for (int j=0; j < allRectangles.size(); j++){
                System.out.println("Rectangle " + j + " LongestLine:" + allRectangles.get(j).longestLineWithin());
                System.out.println("Rectangle " + j + " area:" + allRectangles.get(j).calcArea());

                
            }

        }
        
        }
    }

