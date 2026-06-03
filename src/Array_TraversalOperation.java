public class Array_TraversalOperation {

    public static void main(String[] args) {

        int[] arr=new int[5];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for(int i=0;i<arr.length;i++)  // agar single statement hai tou curly braches {} lagani ki need nhi hai
            System.out.print(arr[i] + " ");

        System.out.println(" ");

        int[] arr1=new int[5];

        arr1[0]=100;
        arr1[1]=200;
        arr1[2]=300;
        arr1[3]=400;
        arr1[4]=500;

        for(int i=arr.length-1; i>=0;i--)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
