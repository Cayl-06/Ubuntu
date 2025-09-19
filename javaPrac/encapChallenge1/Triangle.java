package encapChallenge1;
public class Triangle{
    private float base;
    private float height;
    private float area;
    
    
    public Triangle(){
        this.base = 0;
        this.height = 0;
        this.area = 0;
    }
    
    public void setBase(float base){
        if(base <= 0){
            System.out.println("Error: Base must be a positive number.");
            base = 0;
        } else{
        this.base = base;}
        calculateArea();
    }
    public void setHeight(float height){
        if(height <= 0){
            System.out.println("Error: Height must be a positive number.");
            height = 0;
        } else{
        this.height = height; }
        calculateArea();
    }
    
    private void calculateArea(){
        this.area = (this.base * this.height) / 2;
    }
    
    
    public float getBase(){
        return base;
    }
    public float getHeight(){
        return height;
    }
    public float getArea(){
        return area;
    }

    
}