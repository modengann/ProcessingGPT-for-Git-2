import processing.core.*;

public class Circle {

    private int radius;
    private int locX;
    private int locY;
    private PApplet parent;
    private int direction;


    public Circle(int r, int lX, int lY, PApplet p){
        radius = r;
        locX = lX;
        locY = lY;
        parent = p;
        direction = 1;
    }

    public void display(){
        parent.ellipse(locX, locY,radius, radius);
    }

    public void moveX(int num){
        if(locX + 2*radius >= 800 || locX - radius <= 0){
            direction *= -1;
        }
        locX += num*direction;
    }



    
}
