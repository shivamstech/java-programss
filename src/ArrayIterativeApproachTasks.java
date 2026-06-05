public class ArrayIterativeApproachTasks {
    public static void main(String[] args) {

        //WAP to calculate the sum of even and odd numbers separately in a given array.

        int[] arr={10,20,33,40,53,60,77};

        int evensum=0;
        int oddsum=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2 ==0)
            {
               evensum +=arr[i];
            }
            else{

                oddsum +=arr[i];
            }
        }
        System.out.println("Sum of even numbers "+evensum+" & Sum of odd number is "+oddsum);
    }
}
