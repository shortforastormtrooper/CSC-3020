//==============================================================
//Darryl Green
//07/12/2017
//CSC 3020
//Oulette
// Title: Inventory Manager
// Description:
//  This application manages product inventory
//  using two application classes
//
//==============================================================

// Including the header files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW5
{
    // Declare a array variable
    static Product products[] = new Product[10];
    public static void PerformOperation(int Op,int num )
    {
        Scanner scan = new Scanner(System.in);
    }
    // Implement a method
    public static void DisplayMenu()
    {   
        System.out.println("Half Foods Menu ");
        System.out.println("1 - Sell Product ");
        System.out.println("2 - Order Product ");
        System.out.println("3 – List Product I");
        System.out.println("4 – Exit");
        System.out.println("Enter Your Choice:");
    }
    // Define a main program
    public static void main(String args[])
    {
        int i=0, Code,numb,Options;
        double Cost;
        String Name;
        // Read a text file
        File myFile = new File("H:/ProductInventoryIn.txt");
        try
        {
            Scanner scan = new Scanner(myFile);
            Scanner scan1= new Scanner(System.in);
            // checks loop condition
            while(scan.hasNextLine())
            {
                Code = scan.nextInt();
                Name = scan.next();
                while(!scan.hasNextDouble())
                    Name= Name +" "+scan.next();
                Cost = scan.nextDouble();
                numb = scan.nextInt();
                products[i] = new Product(Code,Name,Cost,numb);
                i++;
            }
            DisplayMenu();
            Options = scan1.nextInt();
            int n=10;
            while(Options!=4)
            {
                int Qty;
                if(Options==1)
                {
                    System.out.println("Enter The Code");
                    Code = scan.nextInt();
                    while(true)
                    {
                        for(i=0;i<products.length;i++) {
                            if(products[i].GetCode()==Code)
                                break;
                        }
                        if(i>=n)
                        {
                            System.out.println("Enter Valid Code");
                            Code = scan.nextInt();
                            continue;
                        }
                        break;
                    }
                    System.out.println("Enter The Quantity");
                    Qty = scan.nextInt();
                    while(Qty>products[i].GetCount())
                    {
                        System.out.println("Enter Valid Quantity");
                        Qty = scan.nextInt();
                    }
                    double dbl;
                    int ic;
                    dbl=products[i].GetInventoryValue() - (Qty* products[i].GetCost());
                    ic=products[i].GetInventoryCount() - Qty;
                    numb=products[i].GetCount() - Qty;
                    products[i].SetInventoryValue(dbl);
                    products[i].SetInventoryCount(ic);
                    products[i].SetCount(numb);
                    System.out.println("Code - "+Code);
                    System.out.println("Quantity - "+Qty);
                    System.out.println("Revenue From Sale - $"+Qty* products[i].GetCost());
                }
                else
                if(Options==2)
                {
                    System.out.println("Enter The Code");
                    Code = scan.nextInt();
                    while(true)
                    {
                        for(i=0;i<products.length;i++) {
                            if(products[i].GetCode()==Code)
                                break;
                        }
                        if(i>=n)
                        {
                            System.out.println("Enter Valid Code");
                            Code = scan1.nextInt();
                            continue;
                        }
                        break;
                    }
                    System.out.println("Enter The Quantity");
                    Qty = scan.nextInt();
                    while(Qty>products[i].GetCount())
                    {
                        System.out.println("Enter Valid Quantity");
                        Qty = scan.nextInt();
                    }
                    double dbl1;
                    int ic;
                    dbl1=products[i].GetInventoryValue() +(Qty* products[i].GetCost());
                    ic=products[i].GetInventoryCount() +Qty;
                    numb=products[i].GetCount() +Qty;
                    products[i].SetInventoryValue(dbl1);
                    products[i].SetInventoryCount(ic);
                    products[i].SetCount(numb);
                    System.out.println("Code - "+Code);
                    System.out.println("Quantity Ordered - "+Qty);
                    System.out.println("Cost Of Order - $"+Qty* products[i].GetCost());
                }
                else
                {
                    for(i=0;i<products.length;i++) {
                        System.out.println(products[i].toString());
                    }
                    System.out.println("Inventory Count - "+products[i].InventoryCount);
                    System.out.println("Inventory Value - "+products[i].InventoryValue);
                    System.out.println("Product Count - "+products[i].ProductCount);
                }
                DisplayMenu();
                Options = scan.nextInt();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}