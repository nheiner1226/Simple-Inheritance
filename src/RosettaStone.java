public class RosettaStone extends Langybase implements Requirements  {

    // Create constructor
    // Don't pass any attributes
    // User super method to get attributes
    public RosettaStone()  {
        super("Rosetta Stone", "Blue and Yellow", "Rock-shape", 2016, 100000, 3);
    }


    // Initialize genInfo method
    @Override
    public void genInfo()    {
        System.out.println("You have selected Rosetta Stone. " + super.toString());
    }

}
