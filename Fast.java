import java.util.Scanner;//fast class is the class for the fast mode
//import java.util.Random; //random ints for the place of the ships
public class Fast
 {
    Scanner battle = new Scanner(System.in);
    double order = (Math.random() * 100);
    int rows = 8; //similar to regular, board wise
    int columns =  8;
    int[] pieces = new int[3];

    int[][] speed = new int[rows][columns];
    int location;
    String species;
    final int destroyer = 2;
    final int cruiser = 3;
    final int submarine = 3;

   public void placeShip()
    {
        System.out.println("The board is an 8x8");
        System.out.println("1 is north, 2 is west, 3 is south, 4 is east");
        System.out.println("Ships: Destroyer(2), Cruiser(3), Submarine(3)"); // want to add a varibale that uses a random int value, and that int will place the ship anywhere on the 2d array
        if(order > 100)
        {
            for(int x =0; x < 8; x++)
            {
             System.out.println("1");
            }
        }
        else
        {
            for(int y = 0; y < 8; y++)
            {
                System.out.println("1");
            }
        }
    }

    public void welcome()
    {
        //System.out.println("Test");
    }

    public void gameBoard()
    {
        for(int row = 0; row < 8; row++ )
        {
            for(int column = 0; column < 8; column++)
            {
                System.out.println(speed[row][column] + " ");
            }
            System.out.println(" ");
        }
    }
}
 

