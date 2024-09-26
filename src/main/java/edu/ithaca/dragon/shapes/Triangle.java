package edu.ithaca.dragon.shapes;


public class Triangle {
    private double base;
    private double height;
    

    public Triangle(double base, double height){
        if (base <= 0){
            throw new IllegalArgumentException ("base is not positive nunber");
        }

        if (height <= 0){
            throw new IllegalArgumentException("height is not positive number");
        }
            
        
        this.base=base;
        this.height=height;
        
    }

    public double calcArea(){
        double areaTriangle = (height * base) / 2;
        return areaTriangle;

       //throw new IllegalArgumentException ("not implemented yet");
    }

    public void doubleSize(){
        base = base * 2; 
        height = height * 2;

        
    }

    public double longestLineWithin(){
        double lineWithin = (base * base) + (height *height);
        return Math.sqrt(lineWithin);
        
        //throw new IllegalArgumentException ("not implemented yest");

    }
    
    public String toString(){
        //return "Trinagle" + "base=" + base + '\'' + ",height=" + height;
        return "Triangle:" + "base=' " + base + '\'' + ", height=' " + height;

    


    }

}

    


