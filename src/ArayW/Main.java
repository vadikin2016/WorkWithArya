package ArayW;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
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
        Arrays.sort(first_array);
        System.out.println();
        for (int value: first_array)
        {
            System.out.print(value + "  ");
        }
        String[] s_array = new String[4];
        s_array[0] = "vasya";
        s_array[1] = "peta";
        s_array[2] = "sveta";
        s_array[3] = "ola";
        System.out.println();
        for (String value: s_array)
        {
            System.out.print(value + "!");
        }
        Arrays.sort(s_array);
        System.out.println();
        for (String value: s_array)
        {
            System.out.print(value + "!");
        }

    }
}
