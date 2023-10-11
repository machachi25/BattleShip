import java.util.Scanner;
import java.util.Random; // this is for fast mode, but going to try and get regualr working first
 
 public class Battleship
{

    Scanner ship = new Scanner(System.in); // variable declarations for board, as well as the basics of the game
    int numRows = 10;
    int numCols = 10;
    int[] ships = new  int[5];

    int[][] game = new int[numRows][numCols]; 
     int xPos;
     int yPos;
     int direction;
     String type;
     final int destroyer = 2;
     final int carrier = 5;
     final int cruiser = 3;
     final int submarine = 3;
     final int battleship = 4;
    public static void main()
    {



    }
    public void shipPlace()
    {


        /*int numRows = 10;
        int numCols = 10;
        int[] ships = new  int[5];

        //System.out.println("The board is a 10 x 10 square");
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
        final int battleship = 4;*/ //accidental repeat
        System.out.println("The board is a 10 x 10 square"); // "board" game instructions on how to play
        System.out.println(" 1 is north, 2 is west, 3 is south, 4 is east");
        System.out.println("The ships:");
        System.out.println("Destroyer - 2 units long");
        System.out.println("Cruiser - 3 units long");
        System.out.println("Submarine: 3 units long");
        System.out.println("Battleship - 4 units long");
        System.out.println("Carrier - 5 units long"); 
        System.out.println("The board is a 10 x 10 square");
        System.out.println(" 1 is north, 2 is west, 3 is south, 4 is east");
        do
        {
            System.out.println("What ship would you like to place?");
            type = ship.nextLine();
        }
        while(!type.equalsIgnoreCase("destroyer") || !type.equalsIgnoreCase("Cruiser") || !type.equalsIgnoreCase("carrier") || !type.equalsIgnoreCase("Battleship") || !type.equalsIgnoreCase("Submarine"));
        System.out.println("What row would you like your " + type +  " to go in? "); // user inputs the x coordinate of their ship
        xPos = ship.nextInt();
        System.out.println("What column would you like to place your " + type + "?"); //user inputs the y coordinate of their ship
        yPos = ship.nextInt();

        /*do
         * {
         *  System.out.println("Enter the ship you want to place: ");
         * type = ship.nextLine();
         * }
         *while(type == "Destroyer" || type == "destroyer")
         */
        //Was gonna repeat this do while loop for all of the ship names, hoping that when they type their ship name, it will only register for 10 "correct" names;
        //

    }
     public void setDirection(String shipName) // this class is meant to be a validator to see if their ship placement is valid
      {
        int direction;        
            do
            {
                System.out.println("What direction would you like your" + shipName +  "to go in? ");
                System.out.println(" 1 is up, 2 is down, 3 is left, 4 is right");
                direction = ship.nextInt(); // want to use int values to register if their postiton is accpetable or not
                // using a do while for a similar reason as my ship type do while
            }
            while(direction > 1 || direction < 4);
            if(direction == 1)
            {
                if(xPos + destroyer >= numRows)// to see if the row number they put is in the grid itself
                if(yPos + destroyer >= numCols)// same as rows, but for columns, and for yPos
                {
                    System.out.println("\n Sorry, but that is not on the board \n");
                    setDirection(shipName);
                }
            }                




        }    
    public void printBoard() // class is to print out a board, i think we did this in class
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

//Things that i have made progress on: i have a very clear set of directions that are made up of print statements, 
//my main problem is how to write out my plan in the java language, hence my do while problem
//to make my conditional, I tried to create a main mehtod in the fast and battleship classes, but it got overcomplicated very quickly
//Currently have tester class issue with adding set direction object








