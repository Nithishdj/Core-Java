package Tasks;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int[] A= {1,2,3,4,5,6,7,8,9};
         int[] B= {1,2,3,4,5,6};
         int count1=0,count2=0;
         for(int a:A) {
        	 count1++;
         }
         for(int b:B) {
        	 count2++;
         }
         if(count1>count2) {
        	 System.out.println("Array A is longer with "+count1+" elements");
         }
         else if(count1<count2) {
        	 System.out.println("Array B is longer with "+count2+" elements");
         }
         else {
        	 System.out.println("Both are equal");
         }
         System.out.println("Array A count= "+count1);
         System.out.println("Array B count= "+count2);

}
}