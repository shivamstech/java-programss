public class ArraySortingOperation {

    public static void main(String[] args) {

        int[] arr={10,40,30,50,20};

        for(int i=0; i<arr.length ; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr)
        {
            System.out.print(" "+a);
        }

    }
}
