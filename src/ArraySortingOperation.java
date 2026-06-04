public class ArraySortingOperation {

    public static void main(String[] args) {
        //  Bubble sort

        int[] arr={10,40,30,50,20};

        for(int i=0; i<arr.length ; i++)
        {
            boolean swapped=false;
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        for(int a:arr)
        {
            System.out.print(" "+a);
        }

    }
}
