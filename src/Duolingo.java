public class Duolingo extends Langybase implements Requirements  {

    // Create constructor
    // Don't pass any attributes
    // User super method to get attributes
    public Duolingo()  {
        super("Duolingo", "Green", "Owl", 2020, 20000, 2);
    }


    // Initialize genInfo method
    @Override
    public void genInfo()    {
        System.out.println("You have selected Duolingo. " + super.toString());
    }

}
