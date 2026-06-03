public class Array_Updation {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int pos = 2;
        int element = 111;

        arr[pos] = element;     // update

        for(int no:arr)
        {
            System.out.print(no+" ");
        }

    }
}
