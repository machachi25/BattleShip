import java.util.Scanner;

public class Battleship
{
    Scanner ship = new Scanner(System.in);
    int numRows = 10;
    int numCols = 10;
    int[] ships = new  int[5];

    int[][] game = new int[numRows][numCols];

    
    public void shipPlace()
    {
        int xPos;
        int yPos;
        int direction;
        final int Destroyer = 2;
        final int carrier = 5;
        final int cruiser = 3;
        final int submarine = 3;
        final int battleship = 4;

        System.out.println("The board is a 10 x 10 square");
        System.out.println(" 1 is north, 2 is west, 3 is south, 4 is east");
        System.out.println("What row would you like your ship to go in? ");
        xPos = ship.nextInt();
        System.out.println("What column would you like to place your ship? ");
        yPos = ship.nextInt();
        do
        {        
        System.out.println("What direction would you like your destroyer to face? ");
        direction = ship.nextInt();
        }
        while(direction <=1 || direction >= 4);

        if(direction == 1)
        {

        }

        

    }
    
    public void printBoard()
    {
        for(int r = 0; r < 10; r++ )
        {
            for (int c = 0; c < 10; c++ )
            {
                System.out.print(game[r][c] + " ");
            }
            System.out.println("");
        }
    }
}