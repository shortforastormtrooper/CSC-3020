import java.util.*;
public class Currency
{
   public static void main(String args[])
           {
               char code='a';
               double currency1,currency2;

               //Gives constant for conversion values
               final double CODEA=0.89;
               final double CODEB=110.94;
               final double CODEC=1.12;
               final double CODED=124.10;
               final double CODEE=0.01;
               final double CODEF=0.01;

               //Gives constants for currency symbols
               final String USDOLLAR= "\u0024";
               final String YEN= "\u20AC";
               final String EURO= "\u00A5";

               Scanner in=new Scanner(System.in);

               while(code !='x')
                   {
                   //menu
                   System.out.print("\n a : US Dollar -> Euro ");
                   System.out.print("\n b : US Dollar -> Japanese Yen ");
                   System.out.print("\n c : Euro -> US Dollar ");
                   System.out.print("\n d : Euro->Japanese Yen ");
                   System.out.print("\n e : Japanese Yen -> US Dollar ");
                   System.out.print("\n f : Japanese Yen -> EURO ");
                   System.out.print("\n x : Exit ");
                   System.out.print("\n Enter appropriate CODE ");

                   code=in.next().charAt(0); //Enter the conversion code

                   if(code=='a') //Converts USD to Euro
                       {
                           System.out.print("\n Enter the value of currency in US Dollar : ");
                           currency1=in.nextDouble();
                           currency2=currency1*CODEA;
                           System.out.printf("\n Conversion of US Dollar %.2f %s to EURO is %.2f %s ", currency1 ,USDOLLAR,currency2,EURO);
                       }
                   else if(code=='b')   //Converts USD to Yen
                       {
                           System.out.print("\n Enter the value of currency in US Dollar : ");
                           currency1=in.nextDouble();
                           currency2=currency1*CODEB;
                           System.out.printf("\n Conversion of US Dollar %.2f %s to Japanese Yen is %.2f %s ", currency1 ,USDOLLAR,currency2,YEN);
                       }
                   else if(code=='c')   //Converts Euro to US Dollar
                           {
                           System.out.print("\n Enter the value of currency in Euro : ");
                           currency1=in.nextDouble();
                           currency2=currency1*CODEC;
                           System.out.printf("\n Conversion of Euro %.2f %s to US Dollar is %.2f %s ", currency1 ,EURO,currency2,USDOLLAR);
                       }
                   else if(code=='d')   //Converts Euro to US Yen
                                           {
                                               System.out.print("\n Enter the value of currency in Euro : ");
                                               currency1=in.nextDouble();
                                               currency2=currency1*CODED;
                                               System.out.printf("\n Conversion of Euro %.2f %s to Japanese Yen is %.2f %s ", currency1 ,EURO,currency2,YEN);
                       }
                   else if(code=='e')   //Converts Yen to US Dollar
                                           {
                                               System.out.print("\n Enter the value of currency in US Japanese Yen : ");
                                               currency1=in.nextDouble();
                                               currency2=currency1*CODEE;
                                               System.out.printf("\n Conversion of Japanese Yen %.2f %s to US Dollar is %.2f %s ", currency1 ,YEN,currency2,USDOLLAR);
                       }
                   else if(code=='f')   //Converts Yen to Euro
                                           {
                                               System.out.print("\n Enter the value of currency in US Japanse Yen : ");
                                               currency1=in.nextDouble();
                                               currency2=currency1*CODEF;
                                               System.out.printf("\n Conversion of Japanese yen %.2f %s to Euro is %.2f %s ", currency1 ,YEN,currency2,EURO);
                       }


               }

           }

       }