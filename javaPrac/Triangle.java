
package activity11;

public class Triangle{
    private float base;
    private float height;
    private float area;
    
    
    public Triangle(){
        this.base = base;
        this.height = height;
        this.area = area;
    }
    
    public void setBase(float base){
        if(base <= 0){
            System.out.println("Error: Base must be a positive number.");
            base = 0;
        } else
        this.base = base;
    }
    public void setHeight(float height){
        if(height <= 0){
            System.out.println("Error: Height must be a positive number.");
            height = 0;
        } else
        this.height = height;
    }
    
    private float calculateArea(float base, float height){
        float res = base * height;
        return res / 2;
    }
    
    public void setArea(float result){
        this.area = result;
    }
    
    public float getBase(){
        return base;
    }
    public float getHeight(){
        return height;
    }
    public float getArea(){
        return calculateArea(base, height);
    }
    
    
}
