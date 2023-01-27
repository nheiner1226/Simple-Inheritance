public class Drops extends Langybase implements Requirements  {

    // Create constructor
    // Pass int attributes as parameters
    // Use super method to get str attributes
    public Drops(int year, int pts, int amt)  {
        super("Drops", "Purple", "Drop-shape", year, pts, amt);
    }


    // Initialize genInfo method
    @Override
    public void genInfo()    {
        System.out.println("You have selected Drops. " + super.toString());
    }

}
