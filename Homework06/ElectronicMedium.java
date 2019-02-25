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



//Define a class extend Medium class
public class ElectronicMedium extends Medium 
{
    //Field(s) 
    public static int count = 0;
    public String title;
    public int daysOverdue;

    //non-parameter constructor
    public ElectronicMedium() 
    {

        super();

        count = count + 1;

        title = "(not set)";

        daysOverdue = 0;

    }

    /**

     * @param vERSION

     * @param title

     * @param daysOverdue

     */

    //two-parameter constructor
    public ElectronicMedium(String title, int daysOverdue) 
    {

        super();

        count = count + 1;

        this.title = title;

        this.daysOverdue = daysOverdue;

    }
    //----------------------------------------------------------------
    // get methods
    //----------------------------------------------------------------

    @Override

    public String getTitle() 
    {

        return "E " + title;

    }

    @Override

    public int getDaysOverdue() 
    {

        return daysOverdue;

    }
    
    public static void getCount(int count) 
    
    {
        ElectronicMedium.count = count;
    }

    /**

     * @param count

     * the count to set

     */

    //----------------------------------------------------------------
    // set methods
    //----------------------------------------------------------------

    public static void setCount(int count) 
    {

        ElectronicMedium.count = count;

    }

    /**

     * @param title

     * the title to set

     */

    public void setTitle(String title) 
    {

        this.title = title;

    }

    /**

     * @param daysOverdue

     * the daysOverdue to set

     */

    public void setDaysOverdue(int daysOverdue) 
    {

        this.daysOverdue = daysOverdue;

    }

    @Override

    public double calculateFine() 
    {

        // auto-generated method stub

        if (this.daysOverdue <= 0)

            return 0;

        else

            return daysOverdue * 0.75;

    }

    /*

     * (non-Javadoc)

     *

     * @see java.lang.Object#toString()

     */

    @Override

    
    //----------------------------------------------------------------
    // equals and toString methods
    //----------------------------------------------------------------
    public String toString() 
    {

        return "ElectronicMedium [title=" + title + ", daysOverdue="

        + daysOverdue + "]";

    }

    @Override

    public boolean equals(Object obj) 
    {

        // auto-generated method stub

        if (obj instanceof ElectronicMedium) 
        {

            ElectronicMedium electronicMedium = (ElectronicMedium) obj;

            if (this.getTitle().equals(electronicMedium.getTitle()))

                return true;

            else

                return false;

        } else

            return false;

    }

}