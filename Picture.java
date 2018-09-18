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
    private Square grass;
    private Square sky;
    private Square band;
    private Square band2;
    private Square goggles;
    private Square goggles2;
    private Triangle hat;
    private Circle head;
    private Person body;
    private Square blowDart; 
    private Square blowDart2; 
    private Square blowDart3; 
    private Square blowDart4; 
    private Square blowDart5; 


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
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
    public void draw_Monterroso()
    {
        band = new Square();
        band2 = new Square();
        goggles= new Square();
        goggles2= new Square();
        hat = new Triangle();  
        head = new Circle();
        body = new Person();
        blowDart = new Square();
        blowDart2 = new Square();
        blowDart3 = new Square();
        blowDart4 = new Square();
        blowDart5 = new Square();
        grass = new Square();
        sky = new Square();
        
            grass.changeColor("green");
            grass.moveHorizontal(-300);
            grass.moveVertical(90);
            grass.changeSize(800);
            grass.makeVisible();
            
            sky.changeColor("blue");
            sky.moveHorizontal(-300);
            sky.moveVertical(-700);
            sky.changeSize(800);
            sky.makeVisible();
            head.changeColor("yellow");
            head.moveHorizontal(40);
            head.moveVertical(-30);
            head.changeSize(80);
            head.makeVisible();
            
            body.changeColor("yellow");
            body.moveHorizontal(32);
            body.moveVertical(-55);
            body.changeSize(120,60);
            body.makeVisible();
            
            hat.changeSize(60,90);
            hat.moveHorizontal(100);
            hat.moveVertical(-110);
            hat.makeVisible();
    
            band.moveHorizontal(0);
            band.moveVertical(-52);
            band.changeSize(26);
            band.makeVisible();
            band2.changeColor("red");
            band2.moveHorizontal(-26);
            band2.moveVertical(-52);
            band2.changeSize(26);
            band2.makeVisible();
            
            goggles.changeColor("blue");
            goggles.moveHorizontal(5);
            goggles.moveVertical(-47);
            goggles.changeSize(16);
            goggles.makeVisible();
            
            goggles2.changeColor("blue");
            goggles2.moveHorizontal(-20);
            goggles2.moveVertical(-47);
            goggles2.changeSize(16);
            goggles2.makeVisible();
            
            blowDart.changeColor("brown");
            blowDart.moveHorizontal(28);
            blowDart.moveVertical(40);
            blowDart.changeSize(8);
            blowDart.makeVisible();
            
            blowDart2.changeColor("brown");
            blowDart2.moveHorizontal(28);
            blowDart2.moveVertical(32);
            blowDart2.changeSize(8);
            blowDart2.makeVisible();
            
            blowDart3.changeColor("brown");
            blowDart3.moveHorizontal(28);
            blowDart3.moveVertical(24);
            blowDart3.changeSize(8);
            blowDart3.makeVisible();
            
            blowDart4.changeColor("brown");
            blowDart4.moveHorizontal(28);
            blowDart4.moveVertical(16);
            blowDart4.changeSize(8);
            blowDart4.makeVisible();
            
            blowDart5.changeColor("brown");
            blowDart5.moveHorizontal(28);
            blowDart5.moveVertical(48);
            blowDart5.changeSize(8);
            blowDart5.makeVisible();
            
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
