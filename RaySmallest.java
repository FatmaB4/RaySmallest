public class RaySmallest
{
	public static int go(int[] ray)
	{
    int min=ray[0];
    int length= ray.length;

     for(int i=1;i<length;i++) {
      if(ray[i]<min) {
        min=ray[i];
      }
    }
		return min;
	}
}