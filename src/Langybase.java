// This code displays generic information about a user's usage statistics of language apps

public abstract class Langybase  {

    // Declare class attributes
    protected String appName;
    protected String iconColor;
    protected String iconShape;
    protected int downloadYear;
    protected int points;
    protected int numLangTaken;


    // Create no arg constructor
    public Langybase()    {
        // Provides default values to attributes
        // Can be accessed by subclasses
    }


    // Create arg constructor
    public Langybase(String name, String ic, String is, int year, int pts, int amt)  {

        // Provide references to the attributes
        // Can be accessed by subclasses
        // Can be used to set values
        this.appName = name;
        this.iconColor = ic;
        this.iconShape = is;
        this.downloadYear = year;
        this.points = pts;
        this.numLangTaken = amt;

    }


    // Setter methods
    // Allow values to be set from Test class
    // Accepts arg of varType name declared in constructor
    // Establishes a reference for the class to use
    public void setAppName(String name)    {
        this.appName = name;
    }

    public void setIconColor(String ic)    {
        this.iconColor = ic;
    }

    public void setIconShape(String is)    {
        this.iconShape = is;
    }

    public void setDownloadYear(int year)    {
        this.downloadYear = year;
    }

    public void setPoints(int pts)    {
        this.points = pts;
    }

    public void setNumLangTaken(int amt)    {
        this.numLangTaken = amt;
    }


    // Getter methods
    // Returns the value set in the setter methods back to the class
    public String getAppName()    {
        return this.appName;
    }

    public String getIconColor()    {
        return this.iconColor;
    }

    public String getIconShape()    {
        return this.iconShape;
    }

    public int getDownloadYear()    {
        return this.downloadYear;
    }

    public int getPoints()    {
        return this.points;
    }

    public int getNumLangTaken()    {
        return this.numLangTaken;
    }


    // toString
    // Used to print values


    @Override
    public String toString() {
        return '\n' + "Selected App : " + appName + '\n' + "Icon Color: " + iconColor + '\n' + "Icon Shape: " + iconShape + '\n'
                + "Year downloaded: " + downloadYear + '\n' + "Points accumulated: " + points + '\n'
                + "Number of languages enrolled in: " + numLangTaken;
    }

}
