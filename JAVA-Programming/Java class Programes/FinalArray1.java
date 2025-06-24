import java.util.*;
class FinalArray1
{
	public static void main(String... s)
	{
	//final
	int z[]={10,20,30};
	System.out.println(z[0]);
	int y[]={100,200,300};
	z=y;
	System.out.println(z[0]);
	z[0]=10000;
	System.out.println(z[0]);
	}
}