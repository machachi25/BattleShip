import java.util.Scanner;
public class Welcome {
    public static void main(String[] args)
    {
        Scanner mode = new Scanner(System.in);
        System.out.println("Hello There! Welcome to battleship!");
        System.out.println("Would you rather play the fast mode or the Regular mode?");
        String Mode;
        Mode = mode.nextLine();
        if(Mode == "fast" || Mode == "Fast") //conditionial will lead to to file being used
        {
            fast.main();
        } 
        else if(Mode == "Regular" || Mode == "regular")
        {
            Battleship.main();
        }
    
    }
}
