/**
 * @author Chinmay Machavaram
 * @since 10/19/23
 * @version 1.0.0
 * This class is the first class that compiles to lead to fast/reg
 */
import java.util.Scanner; // whole point of this "Welcome" class is to act as a conditional that calls to the other classes
public class Welcome {

    public boolean welcome()
    {
        Scanner mode = new Scanner(System.in);
        boolean choice;
        String str; //want to add conditional that says if user says "Fast" or "fast", then send a call to the fast class but I'm not sure how to do that
        System.out.println("Hello There! Welcome to battleship!");
        do
        {
        System.out.println("Would you rather play the fast mode or the Regular mode?");
        str = mode.nextLine().toLowerCase();
        }
        while( (!str.equals("fast")) && (!str.equals("regular")) );
        //mode.close();
        if(str.equals("fast")) 
        {
            choice = true;
        }
       else // make user have to sya fast  or regular(ask twyford)
       {
            choice = false;
       }
            return choice; 
    }
}
