//Importing input output classes.
import java.io.*;

public class DtH
{
    //to convert decimal to hexadecimal
    static void decTohex(int n)
    {
        //Creating an array to store octal number
        int hexNum[] = new int[100];

       // counter for hexadecimal number arary
        int i = 0;
        while (n != 0)
        {
            //Storing remainder in hexadecimal array
            hexNum[i] = n % 16;
            n = n / 16;
            i++;
        }

        //Print hexadecimal number array in the reverse order
        for (int j = i - 1; j >= 0; j--)
        {
            if (hexNum[j] > 9)
                System.out.print((char)(55 + hexNum[j]));
            else
                System.out.print(hexNum[j]);
        }
    }

    //Main Function
    public static void main(String[] args)
    {
        //input decimal number to be converted into hexadecimal number
        int n = 10;

        //Calling the above Method to convert decimal into hexadecimal number
        decTohex(n);
    }
}

