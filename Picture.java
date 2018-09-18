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

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        
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
    public void draw_Leal()
    {
        if(!drawn) {
            sand.moveHorizontal(-310);
            sand.changeColor("sand");
            sand.moveVertical(20);
            sand.changeSize(550);
            sand.makeVisible();
            
            sky.moveHorizontal(-320);
            sky.changeColor("skyBlue");
            sky.moveVertical(-520);
            sky.changeSize(550);
            sky.makeVisible();
            
            balloon.changeColor("red");
            balloon.moveHorizontal(45);
            balloon.moveVertical(45);
            balloon.changeSize(70);
            balloon.makeVisible();
            
            person.moveHorizontal(30);
            person.moveVertical(40);
            person.changeSize(20, 15);
            person.makeVisible();
            
            sqr1.moveHorizontal(-20);
            sqr1.changeColor("blue");
            sqr1.moveVertical(90);
            sqr1.changeSize(5);
            sqr1.makeVisible();
            
            sqr2.moveHorizontal(-15);
            sqr2.changeColor("blue");
            sqr2.moveVertical(105);
            sqr2.changeSize(5);
            sqr2.makeVisible();
            
            sqr3.moveHorizontal(15);
            sqr3.changeColor("blue");
            sqr3.moveVertical(90);
            sqr3.changeSize(5);
            sqr3.makeVisible();
            
            sqr4.moveHorizontal(10);
            sqr4.changeColor("blue");
            sqr4.moveVertical(105);
            sqr4.changeSize(5);
            sqr4.makeVisible();
    
            basket.changeColor("blue");
            basket.moveHorizontal(-10);
            basket.moveVertical(120);
            basket.changeSize(20);
            basket.makeVisible();
    
            pyramid.changeSize(70, 90);
            pyramid.changeColor("brown");
            pyramid.moveHorizontal(-115);
            pyramid.moveVertical(-30);
            pyramid.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(120);
            sun.moveVertical(-60);
            sun.changeSize(50);
            sun.makeVisible();
            drawn = true;
        }
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
