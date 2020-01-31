// The "BlueRectangle" class.
import java.awt.*;
import hsa.Console;

public class BlueRectangle
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	// Place your program here.  'c' is the output console
	c.setColor(Color.blue);
	c.fillRect(0,0,100,100);
    } // main method
} // BlueRectangle class
