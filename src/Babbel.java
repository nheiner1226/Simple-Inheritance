public class Babbel extends Langybase implements Requirements  {

    // Create constructor
    // Pass str attributes as parameters
    // Use super method to get int attributes
    public Babbel(String name, String ic, String is)  {
        super(name, is, ic, 2018, 50000, 3);
    }


    // Initialize genInfo method
    @Override
    public void genInfo()    {
        System.out.println("You have selected Babbel. " + super.toString());
    }

}
