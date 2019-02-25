//==============================================================
//Darryl Green
//07/12/2017
//CSC 3020
//Oulette
// Title: Inventory Manager
// Description:
//   This application manages product inventory
//   using two application classes
//
//==============================================================

// Define a class
public class Product
{
    // define a required variables
    static int ProductCount=0;
    static double InventoryValue=0;
    static int InventoryCount=0;
    private int Code;
    private String Name;
    private double Cost;
    private int Count;
    // Define a Method
    public Product()
    {
        ProductCount = ProductCount + 1;
        Code = -1;
        Name = "(not set)";
        Cost = -1;
        Count = -1;
    }
    // Define a Method
    public Product(int C,String N, double cost,int Ctr)
    {
        ProductCount = ProductCount + 1;
        InventoryValue = InventoryValue + (Cost * Ctr);
        InventoryCount = InventoryCount + Ctr;
        Code=C;
        Name=N;
        Cost=cost;
        Count =Ctr;
    }

    public static int GetProductCount()
    {
        return ProductCount;
    }

    public static double GetInventoryValue()
    {
        return InventoryValue;
    }

    public static int GetInventoryCount()
    {
        return InventoryCount;
    }

    public int GetCode()
    {
        return Code;
    }

    public String GetName()
    {
        return Name;
    }

    public double GetCost()
    {
        return Cost;
    }

    public int GetCount()
    {
        return Count;
    }

    public static void SetProductCount(int prd )
    {
        InventoryCount = prd;
    }

    public static void SetInventoryValue(double inv )
    {
        InventoryValue=inv;
    }

    public void SetInventoryCount(int inc )
    {
        InventoryCount = inc;
    }

    public void SetCode(int cd )
    {
        Code = cd;
    }

    public void SetName(String N )
    {
        Name= N;
    }

    public void SetCost(double c )
    {
        Cost = c;
    }

    public void SetCount(int c )
    {
        Count = c;
    }

    public boolean Equals(Product prd)
    {
        if(Code==prd.Code)
            return true;
        return false;
    }

    public String ToString()
    {
        return +Code + "\t"
        +Name + "\t"
        +Cost + "\t"
        +Count;
    }
}