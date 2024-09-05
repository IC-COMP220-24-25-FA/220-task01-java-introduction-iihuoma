package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    

    public Rectangle(double length, double width){
        if (length <= 0){
            throw new IllegalArgumentException("length is not postive");
        }
        if (width <= 0){
            throw new IllegalArgumentException("width is not positive");
        }

        this.length = length;
        this.width = width;
    }
    
        
    
        
        //throw new RuntimeException("Not implemented yet");
    

    public double calcArea(){
        double recArea = this.length * this.width;
        return recArea;

       //throw new RuntimeException("Not implemented yet");
    }

    public void doubleSize(){
        this.length = length * 2;
        this.width = width * 2;

        //throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        double longLine = (this.length * this.length) + (this.width * this.width);
        return Math.sqrt(longLine);

        //throw new RuntimeException("Not implemented yet");
    }
    
}
