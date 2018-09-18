/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square back;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Square trunk1;
    private Square trunk2;
    private Circle o1;
    private Circle o2;
    private Circle o3;
    private Circle o4;
    private Triangle star;
    private Person guy;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        back = new Square();
        trunk1 = new Square();
        trunk2 = new Square();
        tree1 = new Triangle();
        tree2 = new Triangle(); 
        tree3 = new Triangle(); 
        o1 = new Circle();
        o2 = new Circle();
        o3 = new Circle();
        o4 = new Circle();
        star = new Triangle();
        guy = new Person();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }
    public void draw_Haynberg()
    {
            back = new Square();
        trunk1 = new Square();
        trunk2 = new Square();
        tree1 = new Triangle();
        tree2 = new Triangle(); 
        tree3 = new Triangle(); 
        o1 = new Circle();
        o2 = new Circle();
        o3 = new Circle();
        o4 = new Circle();
        star = new Triangle();
        guy = new Person();
        
            back.changeSize(400);
            back.changeColor("white");
            back.makeVisible();
            
            trunk1.moveHorizontal(250);
            trunk1.moveVertical(250);
            trunk1.makeVisible();
            trunk2.moveHorizontal(250);
            trunk2.moveVertical(210);
            trunk2.makeVisible();
            
            tree1.moveHorizontal(270);
            tree1.moveVertical(150);
            tree1.makeVisible();
            
            tree2.moveHorizontal(270);
            tree2.moveVertical(100);
            tree2.makeVisible();
            
            tree3.moveHorizontal(270);
            tree3.moveVertical(50);
            tree3.makeVisible();
            
            o1.moveHorizontal(265);
            o1.moveVertical(190);
            o1.changeColor("yellow");
            o1.makeVisible();
            
            o2.moveHorizontal(270);
            o2.moveVertical(120);
            o2.changeColor("magenta");
            o2.makeVisible();
            
            o3.moveHorizontal(280);
            o3.moveVertical(220);
            o3.makeVisible();
            
            o4.moveHorizontal(250);
            o4.moveVertical(140);
            o4.changeColor("red");
            o4.makeVisible();
            
            star.moveHorizontal(270);
            star.moveVertical(40);
            star.changeColor("yellow");
            star.changeSize(25,25);
            star.makeVisible();
            
            guy.moveHorizontal(150);
            guy.moveVertical(250);
            guy.makeVisible();
            
         
            
   

    
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
