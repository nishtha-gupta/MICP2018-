import java.util.Scanner;
import java.util.Arrays;

public class FindTriplet 
{
    public static void TakingInput(int[] A ,int size){
        if(size==0){
            return ;
        }
        Scanner s = new Scanner(System.in);
        for(int i=0;i<size;i++){
            A[i]=s.nextInt();
        }
    }
    // returns true if there is triplet with equal to zero
    public static int find3Numbers(int A[], int arr_size) 
    {
        int l, r;
        
        
 
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) 
        {
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) 
            {
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) 
                {
                    if (A[i] + A[j] + A[k] == 0) 
                    {
                        System.out.print("Triplet is " + A[i] + " ," + A[j] + " ," + A[k]);
                        return 1;
                    }
                }
            }
        }
 
        // If we reach here, then no triplet was found
        return -1;
    }
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        FindTriplet triplet = new FindTriplet();
        int A[];
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int A[]=new int[size];
        TakingInput(A,size);
        
        if(size==0 || size <=3){
            System.out.print("invalid input");
        }
 
        int a = triplet.find3Numbers(A,size);
        if(a==-1){
            System.out.print("No triplets found");
        }
    }
}
/* test cases
INPUT             :       OUTPUT 
0                 : invalid input
2                 : invalid input
3 [3,1,-4]        : invalid input
5 [1,-1,2,3,-2]   : -2,-1,3
5 [6,5,-1,-2,-4]  : -4,-2,6
                    -4,-1,5
4 [1,5,3,2]       : No triplets found

*/
