/**
 * @author Chinmay Machavaram
 * @since 10/19/23
 * @version 1.0.0
 * This class is the fast mode of the game
 */
import java.util.Scanner;//fast class is the class for the fast mode
//import java.util.Random; //random ints for the place of the ships

public class Fast
 {
     public void welcome()
    { 
        //System.out.println("Test");
    }
    Scanner battle = new Scanner(System.in);
    int rows = 8; //similar to regular, board wise
    int columns =  8;
    int[] pieces = new int[3];

    int[][] speed = new int[rows][columns];// fast game baord
    int location;
    double order = (Math.random() * 100);
    String species;
    final int destroyer = 2; // ships that should go into fast mode after radnomizer  palces ships
    final int cruiser = 3;
    final int submarine = 3;


    public void gameBoard()
    {
        
    for(int hor = 0; hor < 8; hor++ )
    {
        for(int ver = 0; ver < 8; ver++ )
            {
                System.out.print(speed[hor][ver] + " ");
            }
        System.out.println("");
    }
    }

    /**public void placeShip() my attempt at incorporating my ships palcement throuhg a randomizer
    {
        System.out.println("The board is an 8x8");
        System.out.println("1 is north, 2 is west, 3 is south, 4 is east");
        System.out.println("Ships: Destroyer(2), Cruiser(3), Submarine(3)"); // want to add a varibale that uses a random int value, and that int will place the ship anywhere on the 2d array
        if(order > 100)
        {
            for(int x =0; x < 8; x++)
            {
             System.out.println("1");
             //System.out.println(int speed[hor + x][ver]);
            }
        }
        else
        {
            for(int y = 0; y < 8; y++)
            {
                System.out.println("1");
                //System.out.println(int speed [hor][ver + y]);
            }
        }

    }*/
}
 

