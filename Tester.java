public class Tester {
    public static void main(String[] args)
    {
        Fast f1 = new Fast();//instance of the fast class
        Battleship b1 = new Battleship(); // want to add all my class into the tester; instance of battleship class
        Welcome w1 = new Welcome();//instance of the welcome class
        String Str;
        Str = w1.welcome();
        f1.welcome(); 
        b1.welcome();
        b1.printBoard();
        b1.shipPlace();
        //b1.setDirection();
    }
}
