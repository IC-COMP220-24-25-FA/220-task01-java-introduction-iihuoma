package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        int largestNum = 0;
        if (first < 0){
            throw new IllegalArgumentException("Integer is not positive");
        }
        if (second < 0){
            throw new IllegalArgumentException("Integer is not positive");
        }
        if (third < 0){
            throw new IllegalArgumentException("Integer is not positive");
        }
        if (first >= second && first >= third) {
           largestNum = first; 
        }
        else if (second > first && second > third){
            largestNum = second;
        }
        else if (third > first && third > second) {
            largestNum = third;
        }
        
        return largestNum;
        //throw new RuntimeException("Not Implemented");
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double newPercent = discountPercent/100;
        double SalePrice = originalPrice - (newPercent * originalPrice);
        double newSalePrice = SalePrice + salesTax;
        return newSalePrice;

        //throw new RuntimeException("Not Implemented");
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        boolean goodDog = true;
        if (yearsOld >= 2 && daysSinceShoesChewed >= 3 && fetchedThePaperToday == true){
            goodDog = true;

        }else{
            goodDog = false;
        }
        return goodDog;



        //throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size()==0){
            return -1;

        }
        int index = 0;
        int max_value = 0;
        for(int i =0; i<numbers.size(); i++){
            if (numbers.get(i)> max_value)
                max_value = numbers.get(i);
       

            


        }
        return numbers.indexOf(max_value);

        //throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size()==0){
            return -1;

        }
        int index = 0;
        int max_value = 0;
        for(int i =0; i<numbers.size(); i++){
            if (numbers.get(i)> max_value)
                max_value = numbers.get(i);
                index = i;
       

            


        }
        return index;
        
        //throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){

        if (words.size() == 0){
            throw new IllegalArgumentException("List is empty");
        }
        int newLetterCount =0;
        String mostWord = "";
        for(int i =0; i<words.size(); i++) {
            int letterCount = 0;
            for (int j=0; j<words.get(i).length(); j++){
                char wordLetter = words.get(i).charAt(j);
                if (wordLetter==letter){
                    letterCount +=1;

                }
                    
                if (newLetterCount<=letterCount){
                    mostWord = words.get(i); 
                    newLetterCount = letterCount;

                }
                

            }

        }
        return mostWord;

        //throw new RuntimeException("Not Implemented");
    }


}
