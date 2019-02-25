//Import the needed packages
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Class
public class USCommunityData
{
    //Declare needed arrays
    String []col = new String[20];
    long []statePopulation=new long[20];
    float []percentage = new float[20];
    int counter=0;
   
    //Method readData()
    public void readData() throws FileNotFoundException
    {
        //File location
        String fileLoc="H:/CommunityData.txt";
       
        //Create new instance
        Scanner scIn = new Scanner(new File(fileLoc));
       
        //Variable needed       
        int idx=0;
       
        //Loop
        while(scIn.hasNext())
        {
            //Read
            String fLine = scIn.nextLine();
           
            //Check condition
            if(idx<2)
            {
                //Update
                col[counter]=fLine;
               
                //Increment
                counter++;
            }
           
            //Otherwise
            else
            {
                    //Split
                    String []t=fLine.split("years");
                    col[counter]=t[0]+" years";
                    long ll= Long.valueOf(t[1].split(" ")[1]);
                    float ff=Float.valueOf(t[1].split(" ")[2]);
                    statePopulation[counter]=ll;
                    percentage[counter]=ff;
                    counter++;
            }
            idx++;
        }
    }
   
    //Method printArrays()
    public void printArrays()
    {
        //Initialize the needed variables
        long maximum=Long.MIN_VALUE;
        long minimum=Long.MAX_VALUE;
        long total=0;
        long average;
        float maximum1=Float.MIN_NORMAL;
        float minimum1=Float.MAX_VALUE;
        float total1=0;
        float average1;
        int idx=0;
       
        //Display
        System.out.println("Community Data..\n");
        System.out.println(col[0]);
        System.out.println(col[1]);
       
        //Loop
        for( idx=2;idx<counter;idx++)
        {
            //Check condition
            if(maximum<statePopulation[idx])
               
                //Update
                maximum=statePopulation[idx];
           
            //Check condition
            if(minimum>statePopulation[idx])
               
                //Update
                minimum=statePopulation[idx];
           
            //Check condition
            if(maximum1<percentage[idx])
               
                //Update
                maximum1=percentage[idx];
           
            //Check condition
            if(minimum1>percentage[idx])
               
                //Update
                minimum1=percentage[idx];
           
            //Display
            System.out.println(col[idx]+" "+statePopulation[idx]+" "+percentage[idx]);
           
            //Compute
            total=total+statePopulation[idx];
           
            //Compute
            total1=total1+percentage[idx];
        }
       
        //Display
        System.out.println("Max Population : "+maximum);
        System.out.println("Min Population : "+minimum);
        System.out.println("Average of statePopulation : "+total/(long)idx);
        System.out.println("Max Population percentage : "+maximum1);
        System.out.println("Min Population Percent : "+minimum1);
        System.out.println("Average of statePopulation percentage : "+total1/(float)idx);
    }
   
    //Method sortData()
    public void sortData()
    {
        //Loop
        for(int idx=2;idx<counter-1;idx++)
        {
            //Loop
            for(int idx1=idx+1;idx1<counter;idx1++)
            {
                //Check condition
                if(statePopulation[idx1]<statePopulation[idx])
                {
                    //Initialize
                    long t=statePopulation[idx];
                   
                    //Update
                    statePopulation[idx]=statePopulation[idx1];
                    statePopulation[idx1]=t;
                    String tempcolumn=col[idx];
                    col[idx]=col[idx1];
                    col[idx1]=tempcolumn;
                   
                    //Initialize
                    float tPercent=percentage[idx];
                   
                    //Update
                    percentage[idx]=percentage[idx1];
                    percentage[idx1]=tPercent;
                }
            }
        }
    }
   
    //Method main()
    public static void main(String[] args) throws FileNotFoundException
    {
        //Create new instance
        USCommunityData uscd =new USCommunityData();
       
        //Function call
        uscd.readData();
       
        //Display
        System.out.println("Printing unsorted data...");
       
        //Function call
        uscd.printArrays();
       
        //Function call
        uscd.sortData();
       
        //Display
        System.out.println("Sorting the data as per population column...");
        System.out.println("\nPrinting sorted data...\n");
       
        //Function call
        uscd.printArrays();
    }
}