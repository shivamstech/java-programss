/*
It is an approach (programming method) that tries all possible solutions / combinations
to find the correct one.

NOTE: This approach does not rely on advanced techniques i.e. two pointer, sliding window
etc, it uses nested loops or multiple iterations for every possible solution.

Its time complexity is O(nA2) or higher.
*/

public class Array_BruteForceApproach {
      public static void main(String[] args) {
//
//        //    WAP to find the duplicate elements in an array
//        //  - duplicate number is occured maximum two times

//        int[] arr={10,20,30,10,30,40,50,40};
//
//        boolean found=false;
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=i+1; j< arr.length; j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    System.out.print(" "+arr[i]);
//                    found=true;
//                    break;
//                }
//            }
//        }
//        if(!found)
//        {
//            System.out.println("Duplicate are not found");
//        }
//
     // ======================================================================


//         //WAP to find the duplicate elements in an array
//          //— duplicate number is occured more then two times
//
//          int[] arr={10,20,30,10,30,10,20,50,40,40};
//
//          boolean found=false;
//          for(int i=0; i<arr.length; i++)
//          {
//              boolean status=false;
//              for(int k=0; k<i; k++)
//              {
//                  if(arr[i]==arr[k])
//                  {
//                      status=true;
//                      break;
//                  }
//              }
//
//              if(status)
//              {
//                  continue;
//              }
//
//              for(int j=i+1; j< arr.length; j++)
//              {
//                  if(arr[i]==arr[j])
//                  {
//                      System.out.print(" "+arr[i]);
//                      found=true;
//                      break;
//                  }
//              }
//          }
//          if(!found)
//          {
//              System.out.println("Duplicate are not found");
//          }

          //================================================================

//          // 2. Find the union of two arrays
//          //[10, 20, 30, 40] [30, 40, 50, 60] = [10,20,30,40,50,60]
//
//          int[] arr={10,20,30,40};
//          int[] arr2={30,40,50,60};
//
//          int n1=arr.length;
//          int n2=arr2.length;
//
//          int[] newArr=new int[n1+n2];
//          int index=0;
//
//
//        for(int i=0; i<n1; i++)
//        {
//            newArr[i]=arr[i];
//            index++;
//        }
//
//        for(int i=0; i<n2; i++)
//        {
//            boolean isDuplicate=false;
//            for(int j=0; j<newArr.length ; j++)
//            {
//               if(arr2[i] == newArr[j])
//               {
//                   isDuplicate=true;
//               }
//
//            }
//            if(!isDuplicate)
//            {
//                newArr[index]=arr2[i];
//                index++;
//            }
//        }
//        for(int a:newArr)
//        {
//            System.out.print(" "+a);
//        }
//

          //=======================================================================


          //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



      }
}
