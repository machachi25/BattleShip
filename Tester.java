public class Tester {
    
    public static void main(String[] args)
    {
        int numRows = 10; // redeclaration of variables from the battleship class from the validator
        int numCols = 10;
        int[][] game = new int[numRows][numCols];
        int xPos = 0;
        int yPos = 0;
        int direction = 0;;       
        int length = 0;
        Welcome w1 = new Welcome();//instance of the welcome class
        Fast f1 = new Fast();//instance of the fast class
        Battleship b1 = new Battleship(); // want to add all my class into the tester; instance of battleship class
       //String str = ""; unused variable
        //Str = w1.welcome();
       if(w1.welcome())
        { 
            f1.welcome();  //direct to the fast class
            //f1.placeShip();
            f1.gameBoard();// prints fast board
        }
        else
        {
            b1.welcome();// call from the welcome class
            b1.printBoard();// direct to place ship class
            b1.shipPlace();  //direct to battleship class
            b1.validator(game, xPos, yPos, direction, length);
        }
        //b1.setDirection();
    }
}
