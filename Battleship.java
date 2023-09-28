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