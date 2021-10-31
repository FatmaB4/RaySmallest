public class Main
{
	public static void main( String args[] )
	{			

    int[] ray={-99,1,2,3,4,5,6,7,8,9,10,12345};
    int[] ray2={10,9,8,7,6,5,4,3,2,1,-99};
    int[] ray3={10,20,30,40,50,-11818,40,30,20,10};
    int[] ray4={32767};
    int[] ray5={255,255};
    int[] ray6={9,10,-88,100,-555,1000};
    
    System.out.println(RaySmallest.go(ray));			
    System.out.println(RaySmallest.go(ray2));
    System.out.println(RaySmallest.go(ray3));
    System.out.println(RaySmallest.go(ray4));
    System.out.println(RaySmallest.go(ray5));
    System.out.println(RaySmallest.go(ray6));
    
	}
}