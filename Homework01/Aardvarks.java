public class Aardvarks {

  

   public static void main(String[] args) {

      

       if(args != null && args.length>0){

          

           for(int i=0; i<args.length; i++){

               System.out.println("args["+i+"]\t"+args[i]);

           }

       }else{

           System.out.println("Please pass command line argument");

       }

   }

}