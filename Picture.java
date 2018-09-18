/**
 * Isabella Kovarik
 * Jigglypuff
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    
    private Square blurple;
    
    private Circle body;
    
    private Circle mouthCover;
    private Circle mouth;
    
    private Circle eyeL;
    private Circle eyeR;
    private Circle pupilL;
    private Circle pupilR;
    private Circle highlightL;
    private Circle highlightR;
    
    private Circle handL;
    private Circle handR;
    private Circle footL;
    private Circle footR;
    
    private Triangle earL;
    private Triangle earR;
    
    private Person ash;

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
    
    /**
     * Kovarik
     */
    public void draw_Kovarik()
    {
           blurple = new Square();
       
           body = new Circle();
           
           mouthCover = new Circle();
           mouth = new Circle();
           
           eyeL = new Circle();
           eyeR = new Circle();
           pupilL = new Circle();
           pupilR = new Circle();
           highlightL = new Circle();
           highlightR = new Circle();
           
           handL = new Circle();
           handR = new Circle();
           footL = new Circle();
           footR = new Circle();
           
           earL = new Triangle();
           earR = new Triangle();
           
           ash = new Person();
       
       
           blurple.changeColor("blurple");
           blurple.changeSize(500);
           blurple.makeVisible();
           
           body.changeColor("blossom");
           body.changeSize(200);
           body.moveHorizontal(150);
           body.moveVertical(50);
           body.makeVisible();
           
           mouth.changeColor("black");
           mouth.changeSize(60);
           mouth.moveHorizontal(215);
           mouth.moveVertical(130);
           mouth.makeVisible();
           
           mouthCover.changeColor("blossom");
           mouthCover.changeSize(75);
           mouthCover.moveHorizontal(208);
           mouthCover.moveVertical(110);
           mouthCover.makeVisible();
           
           eyeL.changeColor("white");
           eyeL.changeSize(60);
           eyeL.moveHorizontal(170);
           eyeL.moveVertical(110);
           eyeL.makeVisible();
           
           eyeR.changeColor("white");
           eyeR.changeSize(60);
           eyeR.moveHorizontal(260);
           eyeR.moveVertical(110);
           eyeR.makeVisible();
           
           pupilL.changeSize(50);
           pupilL.moveHorizontal(170);
           pupilL.moveVertical(110);
           pupilL.makeVisible();
           
           pupilR.changeSize(50);
           pupilR.moveHorizontal(260);
           pupilR.moveVertical(110);
           pupilR.makeVisible();
           
           highlightL.changeColor("white");
           highlightL.changeSize(30);
           highlightL.moveHorizontal(170);
           highlightL.moveVertical(117);
           highlightL.makeVisible();
           
           
           highlightR.changeColor("white");
           highlightR.changeSize(30);
           highlightR.moveHorizontal(260);
           highlightR.moveVertical(117);
           highlightR.makeVisible();
           
           handL.changeColor("blossom");
           handL.changeSize(40);
           handL.moveHorizontal(120);
           handL.moveVertical(150);
           handL.makeVisible();
           
           handR.changeColor("blossom");
            handR.changeSize(40);
            handR.moveHorizontal(340);
            handR.moveVertical(155);
            handR.makeVisible();
            
            footL.changeColor("blossom");
            footL.changeSize(55);
            footL.moveHorizontal(180);
            footL.moveVertical(220);
            footL.makeVisible();
            
            footR.changeColor("blossom");
            footR.changeSize(55);
            footR.moveHorizontal(260);
            footR.moveVertical(220);
            footR.makeVisible();
            
            earL.changeColor("blossom");
            earL.changeSize(60, 70);
            earL.moveHorizontal(200);
            earL.moveVertical(20);
            earL.makeVisible();
            
            earR.changeColor("blossom");
            earR.changeSize(60, 70);
            earR.moveHorizontal(300);
            earR.moveVertical(20);
            earR.makeVisible();
        
            ash.changeSize(60, 30);
            ash.moveHorizontal(135);
            ash.moveVertical(150);
            ash.makeVisible();
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
