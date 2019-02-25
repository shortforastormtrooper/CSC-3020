import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class BicycleSpeed
{
    public static void main(String[] args) throws IOException
    {
        //Creates a new instance
        BufferedReader ourBr = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            //Prompt for input
            System.out.print("\nEnter wheel diameter [range 10 - 50]: ");
           
            //Read input and assign it to a variable
            int wd = Integer.parseInt(ourBr.readLine());
           
            //Loop
            while (wd < 10 || wd > 50)
            {
                //Prompt for input
                System.out.print("Invalid input! wheel diameter [range 10 - 50]: ");
               
                //Read input and assign it to a variable
                wd = Integer.parseInt(ourBr.readLine());
            }
           
            //Prompt for input
            System.out.print("Enter wheel-to-pedal ratio [range 0.1-10]: ");
           
            //Read input and assign it to a variable
            float w2pr = Float.parseFloat(ourBr.readLine());
           
            //Loop
            while (w2pr < 0.1 || w2pr > 10)
            {
                //Prompt for input
                System.out.print("Invalid input! Enter wheel-to-pedal ratio [range 0.1-10]: ");
               
                //Read input and assign it to a variable
                w2pr = Float.parseFloat(ourBr.readLine());
            }
           
            //Prompt for input
            System.out.print("Enter pedal rotations per minute [range 1-120]: ");
           
            //Read input and assign it to a variable
            int prpm = Integer.parseInt(ourBr.readLine());
           
            //Loop
            while (prpm < 1 || prpm > 120)
            {
                //Prompt for input
                System.out.print("Invalid input! Enter pedal rotations per minute [range 1-120]: ");
               
                //Read input and assign it to a variable
                prpm = Integer.parseInt(ourBr.readLine());
            }

            //Compute wheel circumference
            double wC = 2 * Math.PI * (wd/2);
           
            //Compute speed
            double speed = prpm * wC * w2pr * 60;
           
            //Create new instance
            DecimalFormat df = new DecimalFormat("#.00");
           
            //Display output
            System.out.println("\n----------------------------------------------------------------------------------");
            System.out.println("Wheel diameter\t Wheel-to-pedal ratio\tPedal rotations per minute\t    Speed");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("\t"+df.format(wd)+"\t\t\t"+df.format(w2pr)+"\t\t\t    "+df.format(prpm)+"\t"+df.format(speed));
            System.out.println("----------------------------------------------------------------------------------");
           
            //Prompt for input
            System.out.print("\nDo you want to try again? ");
           
            //Read input and assign it to a variable
            String ourStr = ourBr.readLine();
           
            //Check
            if(ourStr.equalsIgnoreCase("n"))
               
                //Stop
                break;
        }
    }
}