import java.util.Scanner; // whole point of this "Welcome" class is to act as a conditional that calls to the other classes
public class Welcome {
    public boolean welcome()
    {
        Scanner mode = new Scanner(System.in);
        boolean Mode;
        String Str; //want to add conditional that says if user says "Fast" or "fast", then send a call to the fast class but I'm not sure how to do that
        System.out.println("Hello There! Welcome to battleship!");
        System.out.println("Would you rather play the fast mode or the Regular mode?");
        Str = mode.nextLine();
        mode.close();
        if(Str.equalsIgnoreCase("fast"))
        {
            Mode = true;
            return Mode;
        }
       else // make user have to sya fast  or regular(ask twyford)
       {
            Mode = false;
            return Mode;
       }
    }
}
