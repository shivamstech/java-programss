public class ArrayProgram
{
    public static void main(String[] args) {

        // First way to create array
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        // second way
        int[] arr1={100,200,300,400,500,600,700,800,900,1000};

        for(int a: arr)
        {
            System.out.print(" "+a);
        }

        System.out.println("  ");
        for(int i=0; i<arr1.length; i++)
        {
            System.out.print(" "+arr1[i]);
        }


    }

}
