 import java.util.Scanner;

public class Battleship
{
    public static void main()
    {
         

    }
    public void shipPlace()
    {
        int numRows = 10;
        int numCols = 10;
        int[] ships = new  int[5];

        int[][] game = new int[numRows][numCols];
        Scanner ship = new Scanner(System.in);
        int xPos;
        int yPos;
        int direction;
        String type;
        final int destroyer = 2; //ship variables and declarations
        final int carrier = 5;
        final int cruiser = 3;
        final int submarine = 3;
        final int battleship = 4;
        System.out.println("The board is a 10 x 10 square"); // "board" game instructions on how to play
        System.out.println("1 is horizontal, 2 is vertical");
        System.out.println("The ships:");
        System.out.println("Destroyer - 2 units long");
        System.out.println("Cruiser - 3 units long");
        System.out.println("Submarine: 3 units long");
        System.out.println("Battleship - 4 units long");
        System.out.println("Carrier - 5 units long");
        System.out.println("What ship would you like to place?"); // user should input the type(variable) of ship they want to place first
        type = ship.nextLine();
        System.out.println("What row would you like your " + type +  " to go in? "); // user inputs the x coordinate of their ship
        xPos = ship.nextInt();
        System.out.println("What column would you like to place your " + type + "?"); //user inputs the y coordinate of their ship
        yPos = ship.nextInt();

    }
     public void Setdirection(String shipName) 
      {        
        int direction;
        int xPos;
        int destroyer;
        int numRows;
        Scanner ship = new Scanner(System.in);
            do
            {
                System.out.println("What direction would you like your" + shipName +  "to go in? ");
                System.out.println(" 1 is up, 2 is down, 3 is left, 4 is right");
                direction = ship.nextInt();
            }
            while (direction < 1 || direction > 4);
            if(direction == 1)
            {
                if(xPos + destroyer >= numRows)
                {
                    System.out.println("\n Sorry, but that is not on the board \n");
                    Setdirection(shipName);
                }
            }
        }    
    public void printBoard()
    {
    int numRows = 10;
    int numColumns = 10;
    int[][] game = new int[numRows][numColumns];
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