public class HollowDiamond
{
    // function to print the pattern
    static void printPattern(int n)
    {
        int i,j,mid;

        //when n is odd, increase it by 1 to make it even
        if(n%2==1)
            n++;
        mid = n/2;

        // upper half pattern
        for(i = 1; i<= mid; i++)
        {
            //print the blank spaces and outer box before star
            for(j = 1; j<=mid-i; j++)
                System.out.print(" ");

            if(i == 1)
            {
                System.out.print("*");
            }
            else
            {
                //in each line star at start and end position
                System.out.print("*");
                for(j = 1; j<=2*i-3; j++)
                {
                    //print space to make hollow
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            //print the blank spaces and outer box after star
            for(j = 1; j<=mid-i; j++)
                System.out.print(" ");

            System.out.println();
        }

        // lower half pattern
        for(i = mid+1; i<n; i++)
        {
            //print the blank spaces and outer box before star
            for(j = 1; j<=i-mid; j++)
                System.out.print(" ");

            if(i == n-1)
            {
                System.out.print("*");
            }
            else
            {
                //in each line star at start and end position
                System.out.print("*");

                //print space to make hollow
                for(j = 1; j<=2*(n - i)-3; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            //print the blank spaces and outer box after star
            for(j = 1; j<=i-mid; j++)
                System.out.print(" ");

            System.out.println();
        }

    }

    // Main function
    public static void main(String args[])
    {
        int n = 11;
        printPattern(n);
    }
}
