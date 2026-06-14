public class Array_TwoPointersPrograms {

//    static boolean isPalindrome(int[] arr)
//    {
//        int L = 0;
//        int R = arr.length - 1;
//
//        while(L < R)
//        {
//            if(arr[L] != arr[R])
//            {
//                return false;
//            }
//
//            L++;
//            R--;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,4,4,3,2,1};
//
//        System.out.println(isPalindrome(arr));
//    }


    //===========================================================================

//    public static void main(String[] args) {
//
//
//        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7};
//
//        int L = 0;
//
// //        for(int R=1; R<arr.length; R++)
// //        {
// //            if(arr[L] != arr[R])
// //            {
// //                L++;
// //                arr[L] = arr[R];
// //            }
// //        }
//
//        int R = 1;
//        while (R < arr.length) {
//            if (arr[L] != arr[R]) {
//                L++;
//                arr[L] = arr[R];
//                R++;
//            } else {
//                R++;
//            }
//        }
//
//        for (int i = 0; i <= L; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//
//    }

    //============================================================================

    public static void main(String[] args) {

        int[] arr = {5, 0, 6, 3, 0, 0, 0, 1, 2, 0, 7};

        int L = 0;

        for(int R=0; R<arr.length; R++)
        {
            if(arr[R] != 0)
            {
                int temp = arr[L];
                arr[L] = arr[R];
                arr[R] = temp;

                L++;
            }
        }

        for(int no : arr)
        {
            System.out.print(no+" ");
        }

    }
}
