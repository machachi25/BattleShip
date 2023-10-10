import java.util.Scanner; // whole point of this "Welcome" class is to act as a conditional that calls to the other classes
public class Welcome {
    public static void main(String[] args)
    {
        Scanner mode = new Scanner(System.in);
        String str; //want to add conditional that says if user says "Fast" or "fast", then send a call to the fast class but Im't not sure how to do that
        System.out.println("Hello There! Welcome to battleship!");
        System.out.println("Would you rather play the fast mode or the Regular mode?");
        str = mode.nextLine();
        if(str == "fast" || str == "Fast")
        {
            
        }
       
        
    }
}
