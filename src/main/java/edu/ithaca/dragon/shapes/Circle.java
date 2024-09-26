package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;{
        
    }
        
    

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("radius is not a positive number");  
    }
        this.radius = radius;
        
    }

    /**
     * @return the area of this circle
     * @throws Exception 
     */
    public double calcArea() throws Exception{
        
        double circleArea = (Math.PI * this.radius * this.radius);
        return circleArea;
    }
         
        
        
       
       

        //throw new RuntimeException("Not implemented yet");
    

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = this.radius * 2;

        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
       double theDiamater = radius * 2;
       return theDiamater;

        //throw new RuntimeException("Not implemented yet");
    }
    
}
