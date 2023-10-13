import java.util.Scanner;
//fast class is the class th
public class Fast
 {
    Scanner battle = new Scanner(System.in);
    int rows = 8; //similar to regular, board wise
    int columns =  8;
    int[] pieces = new int[3];

    int[][] speed = new int[rows][columns];
    int x;
    int y;
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
    }

    public void welcome()
    {
        //System.out.println("Test");
    }
}


