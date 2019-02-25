//==============================================================
//Darryl Green
//07/28/2017
//CSC 3020
//Oulette
// Title: Library Lenders
// Description:
//  This application Displays the borrowing 
//  status of several items from a library
//
//==============================================================



//Define abstract class
public abstract class Medium 
{
    //Field(s)
    public final String VERSION;

    /**

     * @param VERSION

     */
    
    

    //non-parameter constructor
    public Medium() 
    {

        VERSION = "1.0";

    }

    //abstract methods
    public abstract String getTitle();
    public abstract int getDaysOverdue();
    public abstract double calculateFine();

}