package ArayW;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

/**
 * Created by User on 06.10.2016.
 */
public class Main {
    public static void main(String[] args)
    {

        int[] first_array = new int[10];
        Random rnd = new Random();

        for (int i= 0; i< first_array.length; i++)
        {
            first_array[i]= rnd.nextInt(100);
        }
        for (int value: first_array)
        {
            System.out.print(value + "  ");
        }
    }
}
