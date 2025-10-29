package Tasks;
import java.util.*;

public class ReverseArray
{
	public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size=scn.nextInt();
        
        int[]arr=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println("The reversed array:");
        for(int i=size-1;i>=0;i--) {
        	System.out.print(arr[i]+" ");        
        	}
        scn.close();
    }
}
