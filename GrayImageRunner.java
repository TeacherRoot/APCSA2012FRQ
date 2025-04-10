import java.util.*;

public class GrayImageRunner 
{
    public static void main(String[] args) 
    {
    	GrayImage bob = new GrayImage(4,5);
    	System.out.println( bob.countWhitePixels() );    	
    	bob.processImage();    	
    	System.out.println( bob );
    }
}
