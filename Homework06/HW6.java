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



//import classes
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Define a class
public class HW6 
{
    //main
    public static void main(String[] args) 
    {
        
        //Welcome Message
        System.out.println("Welcome to Library Lenders Status Software VERSION 1.0");

        List<Medium> media = readTextFile("MediumStatusIn.txt");

        printMediaStatus(media);

        writeObjectFile(media);

    }

    /**

     * @param media

     */

    public static void writeObjectFile(List<Medium> media) 
    {

        PrintWriter writer = null;

        try 
        {

            writer = new PrintWriter(new File("MediumStatusOut.obj"));

            for (int i = 0; i < media.size(); i++) 
            {

                writer.write(media.get(i).toString());

            }

            writer.flush();
        } 
        
        catch (Exception e) 
        {

            // handle exception

        }

    }

    /**

     * @param media

     */

    public static void printMediaStatus(List<Medium> media) 
    {
        //Prints media title, fine, and overdue fees
        for (int i = 0; i < media.size(); i++) 
        {

            System.out.println("Title: " + media.get(i).getTitle());
            System.out.println("Days overdue: " + media.get(i).getDaysOverdue());
            System.out.println("Fine: " + media.get(i).calculateFine() + "\n");

        }

        //Prints all checked out media
        System.out.println("Number of Electronic Media:" + ElectronicMedium.count);
        System.out.println("Number of Print Media:" + PrintMedium.count);

    }

    /**

     * @param fileName

     * @return

     */

    public static List<Medium> readTextFile(String fileName) 
    {

        List<Medium> media = new ArrayList<Medium>();

        Scanner scanner = null;

        try 
        {
            scanner = new Scanner(new File(fileName));

            while (scanner.hasNext()) 
            {

                String line = scanner.nextLine();

                char mediumType = line.charAt(0);

                String title = line.substring(1, line.lastIndexOf(' '));

                int daysOverdue = Integer.parseInt(line.substring(

                            line.lastIndexOf(' '), line.length()).trim());

                Medium medium = null;

                if (mediumType == 'P')

                    medium = new PrintMedium(title, daysOverdue);

                else

                    medium = new ElectronicMedium(title, daysOverdue);

                media.add(medium);

            }

        } catch (Exception e) {

            //handles exception

            e.printStackTrace();

        }

        return media;

    }

}