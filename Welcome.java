import java.util.Scanner; // whole point of this "Welcome" class is to act as a conditional that calls to the other classes
public class Welcome {
    public String welcome()
    {
        Scanner mode = new Scanner(System.in);
        String Str; //want to add conditional that says if user says "Fast" or "fast", then send a call to the fast class but I'm not sure how to do that
        System.out.println("Hello There! Welcome to battleship!");
        System.out.println("Would you rather play the fast mode or the Regular mode?");
        Str = mode.nextLine();
        mode.close();
        return Str;
    }
}
