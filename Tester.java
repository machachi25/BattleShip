public class Tester {
    public static void main(String[] args)
    {
        int[][] game;
        int xPos;
        int yPos;
        int direction;
        int length;
        Welcome w1 = new Welcome();//instance of the welcome class
        Fast f1 = new Fast();//instance of the fast class
        Battleship b1 = new Battleship(); // want to add all my class into the tester; instance of battleship class
        String str = "";
        //Str = w1.welcome();
       if(w1.welcome())
        { 
            f1.welcome();  //direct to the fast class
        }
        else
        {
            b1.welcome();
            b1.printBoard();
            b1.shipPlace();  //direct to battleship class
            b1.validator();
        }
        //b1.setDirection();
    }
}
