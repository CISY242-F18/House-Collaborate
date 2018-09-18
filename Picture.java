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
    private Square shipwhite1;
    private Square shipwhite2;
    private Square shipwhite3;
    private Square shipwhite4;
    private Square shipwhite5;
    private Square shipwhite6;
    private Square shipwhite7;
    private Square shipwhite8;
    private Square shipwhite9;
    private Square shipwhite0;
    private Square shipwhite11;
    private Square shipwhite12;
    private Square shipwhite13;
    private Square shipwhite14;
    private Square shipwhite15;
    private Square shipred1;
    private Square shipred2;
    private Square shipred3;
    private Square shipred4;
    private Square shipred5;
    private Square shipred6;
    private Square ship1;
    private Square ship2;
    private Square ship3;
    private Square ship4;
    private Square ship5;
    private Square ship6;
    private Square ship7;
    private Square ship8;
    private Square ship9;
    private Square shipp1;
    private Square shipp8;
    private Square shipp2;
    private Square shipp3;
    private Square shipp4;
    private Square shipp5;
    private Square shipp6;
    private Square shipp7;
    private Square wing1;
    private Square wing2;
    private Square wing3;
    private Square wing4;
    private Square wing5;
    private Square wing6;
    private Square wing7;
    private Square wing8;
    private Square wing9;
    private Square wing0;
    private Square wingg1;
    private Square wingg2;
    private Square wingg3;
    private Square wingg4;
    private Square wingg5;
    private Circle wingg6;
    private Square wingg7;
    private Square wingg8;
    private Square wingg9;
    private Square wingg0;
    private Person star1;
    private Person star2;
    private Person star3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instanback = new Square();
        shipwhite1 = new Square();
        shipwhite2 = new Square();
        shipwhite3 = new Square();
        shipwhite4 = new Square();
        shipwhite5 = new Square();
        shipwhite6 = new Square();
        shipwhite7 = new Square();
        shipwhite8 = new Square();
        shipwhite9 = new Square();
        shipwhite0 = new Square();
        shipred1 = new Square();
        shipred2 = new Square();
        shipred3 = new Square();
        shipred4 = new Square();
        shipred5 = new Square();
        shipred6 = new Square();
        ship1 = new Square();
        ship2 = new Square();
        ship3 = new Square();
        ship4 = new Square();
        ship5 = new Square();
        ship6 = new Square();
        ship7 = new Square();
        ship8 = new Square();
        ship9 = new Square();
        shipp1 = new Square();
        shipp2 = new Square();
        shipp3 = new Square();
        shipp4 = new Square();
        shipp5 = new Square();
        shipp6 = new Square();
        shipp7 = new Square();
        wing1 = new Square();
        wing2 = new Square();
        wing3 = new Square();
        wing4 = new Square();
        wing5 = new Square();
        wing6 = new Square();
        wing7 = new Square();
        wing8 = new Square();
        wing9 = new Square();
        wing0 = new Square();
        wingg1 = new Square();
        wingg2 = new Square();
        wingg3 = new Square();
        wingg4 = new Square();
        wingg5 = new Square();
        wingg6 = new Circle();
        wingg7 = new Square();
        wingg8 = new Square();
        wingg9 = new Square();
        wingg0 = new Square();
        star1 = new Person();
        star2 = new Person();
        star3 = new Person();
        roof = new Triangle();  
    }

    /**
     * Draw this picture.
     */
    public void draw_Floyd()
    {
        back.changeColor("black");
            back.moveHorizontal(-400);
            back.moveVertical(-150);
            back.changeSize(1000);
            back.makeVisible();
            
            shipwhite1.changeColor("white");
            shipwhite1.moveHorizontal(-80);
            shipwhite1.moveVertical(100);
            shipwhite1.changeSize(10);
            shipwhite1.makeVisible();
    
            shipwhite2.changeColor("white");
            shipwhite2.moveHorizontal(-80);
            shipwhite2.moveVertical(110);
            shipwhite2.changeSize(10);
            shipwhite2.makeVisible();
            
            shipwhite3.changeColor("white");
            shipwhite3.moveHorizontal(-80);
            shipwhite3.moveVertical(120);
            shipwhite3.changeSize(10);
            shipwhite3.makeVisible();
            
            shipwhite4.changeColor("white");
            shipwhite4.moveHorizontal(-80);
            shipwhite4.moveVertical(130);
            shipwhite4.changeSize(10);
            shipwhite4.makeVisible();
            
            shipwhite5.changeColor("white");
            shipwhite5.moveHorizontal(-90);
            shipwhite5.moveVertical(130);
            shipwhite5.changeSize(10);
            shipwhite5.makeVisible();
            
            shipwhite6.changeColor("white");
            shipwhite6.moveHorizontal(-90);
            shipwhite6.moveVertical(140);
            shipwhite6.changeSize(10);
            shipwhite6.makeVisible();
            
            shipwhite7.changeColor("red");
            shipwhite7.moveHorizontal(-90);
            shipwhite7.moveVertical(150);
            shipwhite7.changeSize(10);
            shipwhite7.makeVisible();
            
            shipwhite8.changeColor("red");
            shipwhite8.moveHorizontal(-90);
            shipwhite8.moveVertical(160);
            shipwhite8.changeSize(10);
            shipwhite8.makeVisible();
            
            shipwhite9.changeColor("red");
            shipwhite9.moveHorizontal(-80);
            shipwhite9.moveVertical(140);
            shipwhite9.changeSize(10);
            shipwhite9.makeVisible();
            
            shipwhite0.changeColor("red");
            shipwhite0.moveHorizontal(-80);
            shipwhite0.moveVertical(150);
            shipwhite0.changeSize(10);
            shipwhite0.makeVisible();
            
            shipred1.changeColor("red");
            shipred1.moveHorizontal(-70);
            shipred1.moveVertical(150);
            shipred1.changeSize(10);
            shipred1.makeVisible();
            
            shipred2.changeColor("red");
            shipred2.moveHorizontal(-70);
            shipred2.moveVertical(160);
            shipred2.changeSize(10);
            shipred2.makeVisible();
            
            shipred3.changeColor("white");
            shipred3.moveHorizontal(-80);
            shipred3.moveVertical(160);
            shipred3.changeSize(10);
            shipred3.makeVisible();
            
            shipred4.changeColor("white");
            shipred4.moveHorizontal(-60);
            shipred4.moveVertical(160);
            shipred4.changeSize(10);
            shipred4.makeVisible();
            
            shipred5.changeColor("white");
            shipred5.moveHorizontal(-60);
            shipred5.moveVertical(150);
            shipred5.changeSize(10);
            shipred5.makeVisible();
            
            shipred6.changeColor("blue");
            shipred6.moveHorizontal(-60);
            shipred6.moveVertical(140);
            shipred6.changeSize(10);
            shipred6.makeVisible();
            
            ship2.changeColor("white");
            ship2.moveHorizontal(-70);
            ship2.moveVertical(130);
            ship2.changeSize(10);
            ship2.makeVisible();
            
            ship3.changeColor("white");
            ship3.moveHorizontal(-70);
            ship3.moveVertical(140);
            ship3.changeSize(10);
            ship3.makeVisible();
            
            ship4.changeColor("white");
            ship4.moveHorizontal(-50);
            ship4.moveVertical(140);
            ship4.changeSize(10);
            ship4.makeVisible();
            
            ship5.changeColor("white");
            ship5.moveHorizontal(-50);
            ship5.moveVertical(130);
            ship5.changeSize(10);
            ship5.makeVisible();
            
            ship6.changeColor("red");
            ship6.moveHorizontal(-50);
            ship6.moveVertical(120);
            ship6.changeSize(10);
            ship6.makeVisible();
            
            ship7.changeColor("blue");
            ship7.moveHorizontal(-50);
            ship7.moveVertical(150);
            ship7.changeSize(10);
            ship7.makeVisible();
            
            ship8.changeColor("white");
            ship8.moveHorizontal(-50);
            ship8.moveVertical(160);
            ship8.changeSize(10);
            ship8.makeVisible();
            
            ship9.changeColor("white");
            ship9.moveHorizontal(-50);
            ship9.moveVertical(170);
            ship9.changeSize(10);
            ship9.makeVisible();
            
            shipp1.changeColor("white");
            shipp1.moveHorizontal(-60);
            shipp1.moveVertical(170);
            shipp1.changeSize(10);
            shipp1.makeVisible();
            
            shipp2.changeColor("white");
            shipp2.moveHorizontal(-70);
            shipp2.moveVertical(170);
            shipp2.changeSize(10);
            shipp2.makeVisible();
            
            shipp3.changeColor("white");
            shipp3.moveHorizontal(-80);
            shipp3.moveVertical(170);
            shipp3.changeSize(10);
            shipp3.makeVisible();
            
            shipp4.changeColor("white");
            shipp4.moveHorizontal(-90);
            shipp4.moveVertical(170);
            shipp4.changeSize(10);
            shipp4.makeVisible();
            
            shipp5.changeColor("white");
            shipp5.moveHorizontal(-100);
            shipp5.moveVertical(170);
            shipp5.changeSize(10);
            shipp5.makeVisible();
            
            shipp6.changeColor("white");
            shipp6.moveHorizontal(-110);
            shipp6.moveVertical(170);
            shipp6.changeSize(10);
            shipp6.makeVisible();
            
            shipp7.changeColor("white");
            shipp7.moveHorizontal(-110);
            shipp7.moveVertical(160);
            shipp7.changeSize(10);
            shipp7.makeVisible();
            
            wing1.changeColor("blue");
            wing1.moveHorizontal(-110);
            wing1.moveVertical(150);
            wing1.changeSize(10);
            wing1.makeVisible();
            
            wing2.changeColor("white");
            wing2.moveHorizontal(-110);
            wing2.moveVertical(140);
            wing2.changeSize(10);
            wing2.makeVisible();
            
            wing3.changeColor("white");
            wing3.moveHorizontal(-110);
            wing3.moveVertical(130);
            wing3.changeSize(10);
            wing3.makeVisible();
            
            wing4.changeColor("red");
            wing4.moveHorizontal(-110);
            wing4.moveVertical(120);
            wing4.changeSize(10);
            wing4.makeVisible();
            
            wing5.changeColor("blue");
            wing5.moveHorizontal(-100);
            wing5.moveVertical(140);
            wing5.changeSize(10);
            wing5.makeVisible();
            
            wing6.changeColor("white");
            wing6.moveHorizontal(-100);
            wing6.moveVertical(150);
            wing6.changeSize(10);
            wing6.makeVisible();
            
            wing7.changeColor("white");
            wing7.moveHorizontal(-100);
            wing7.moveVertical(160);
            wing7.changeSize(10);
            wing7.makeVisible();
            
            wing8.changeColor("white");
            wing8.moveHorizontal(-120);
            wing8.moveVertical(170);
            wing8.changeSize(10);
            wing8.makeVisible();
            
            wing9.changeColor("white");
            wing9.moveHorizontal(-130);
            wing9.moveVertical(170);
            wing9.changeSize(10);
            wing9.makeVisible();
            
            wing0.changeColor("white");
            wing0.moveHorizontal(-130);
            wing0.moveVertical(160);
            wing0.changeSize(10);
            wing0.makeVisible();
            
            wingg1.changeColor("red");
            wingg1.moveHorizontal(-130);
            wingg1.moveVertical(150);
            wingg1.changeSize(10);
            wingg1.makeVisible();
            
            wingg2.changeColor("red");
            wingg2.moveHorizontal(-30);
            wingg2.moveVertical(150);
            wingg2.changeSize(10);
            wingg2.makeVisible();
            
            wingg3.changeColor("white");
            wingg3.moveHorizontal(-30);
            wingg3.moveVertical(160);
            wingg3.changeSize(10);
            wingg3.makeVisible();
            
            wingg4.changeColor("white");
            wingg4.moveHorizontal(-30);
            wingg4.moveVertical(170);
            wingg4.changeSize(10);
            wingg4.makeVisible();
            
            wingg5.changeColor("white");
            wingg5.moveHorizontal(-40);
            wingg5.moveVertical(170);
            wingg5.changeSize(10);
            wingg5.makeVisible();
            
            wingg6.changeColor("yellow");
            wingg6.moveHorizontal(-40);
            wingg6.moveVertical(20);
            wingg6.changeSize(5);
            wingg6.makeVisible();
            
            wingg7.changeColor("blue");
            wingg7.moveHorizontal(-180);
            wingg7.moveVertical(110);
            wingg7.changeSize(5);
            wingg7.makeVisible();
            
            wingg8.changeColor("magenta");
            wingg8.moveHorizontal(-190);
            wingg8.moveVertical(10);
            wingg8.changeSize(5);
            wingg8.makeVisible();
            
            wingg9.changeColor("white");
            wingg9.moveHorizontal(-10);
            wingg9.moveVertical(40);
            wingg9.changeSize(5);
            wingg9.makeVisible();
            
            wingg0.changeColor("white");
            wingg0.moveHorizontal(-100);
            wingg0.moveVertical(10);
            wingg0.changeSize(5);
            wingg0.makeVisible();
            
            star1.changeColor("white");
            star1.moveHorizontal(0);
            star1.moveVertical(10);
            star1.changeSize(5,5);
            star1.makeVisible();
            
            star2.changeColor("white");
            star2.moveHorizontal(40);
            star2.moveVertical(-185);
            star2.changeSize(5,5);
            star2.makeVisible();
            
            star3.changeColor("white");
            star3.moveHorizontal(-90);
            star3.moveVertical(70);
            star3.changeSize(5,5);
            star3.makeVisible();
            
            roof.changeSize(15, 10);
            roof.moveHorizontal(-120);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(10);
            sun.makeVisible();
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
