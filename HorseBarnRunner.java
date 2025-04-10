import java.util.*;

public class HorseBarnRunner
{
    public static void main(String[] args) 
    {
		HorseBarn it = new HorseBarn(7);
		
		//create the Mustang class and switch Arabian to Mustang		
		it.add( new Arabian( "Trigger", 1340 ), 0 );
		it.add( new Arabian( "Silver", 1210 ), 2 );
		it.add( new Arabian( "Lady", 1575 ), 3 );
		it.add( new Arabian( "Patches", 1350 ), 5 );
		it.add( new Arabian( "Duke", 1410 ), 6 );
		
		System.out.println( it );		//[Trigger 1340, null, Silver 1210, Lady 1575, null, Patches 1350, Duke 1410]
		
		System.out.println(it.findHorseSpace("Trigger")); 	 	//	0	A horse named Trigger is in space 0.
		System.out.println(it.findHorseSpace("Silver"));  		//	2	A horse named Silver is in space 2.
		System.out.println(it.findHorseSpace("Coco"));  		// -1	A horse named Coco is not in the barn.
		
		it.consolidate();
		System.out.println( it );		//[Trigger 1340, Silver 1210, Lady 1575, Patches 1350, Duke 1410, null, null]
		System.out.println(it.findHorseSpace("Duke")); 	 		// 4
		System.out.println(it.findHorseSpace("Lady"));  		// 2	
		System.out.println(it.findHorseSpace("Fred"));  		//-1			
    }	
}