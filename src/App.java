import processing.core.*;
import java.util.*;

public class App extends PApplet {

    ArrayList<Circle> circles;
    public static void main(String[] args)  {
        PApplet.main("App");
    }


    public void settings(){
        size(800,600);
    }
    public void setup(){
      circles = new ArrayList<>();
    }

    public void draw(){
        background(255);

        for(Circle c : circles){
            c.display();
            c.moveX(5);
        }
        
    }

    public void mousePressed(){
        Circle temp = new Circle(150, mouseX, mouseY, this);
        circles.add(temp);
    }
}
