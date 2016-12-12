
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class ATM2 extends ATM {
    private  static Acount user[];
    private static  Scanner input1;
    private static Formatter output;
    protected static int k=0;
   //*****************************************************************************
    public static  Acount read() throws FileNotFoundException{

            File myfile=new File("ATM6.txt");
            input1=new Scanner(myfile);
            while(input1.hasNext()){
        try{
            user=new Acount[20];
            for (int i = 0; i < user.length; i++) {
               user[i]=new Acount(input1.nextInt(),input1.nextInt(),input1.next(),input1.nextInt());

            }

          }
          catch(SecurityException se){
            System.out.println("error...SecurityException");
            System.exit(1);
        }
        }
        return user[k];
    }
 //***********************************************************************************
    public void save(){

        try{
            
            output=new Formatter("ATM6.txt");

           }
           catch(FileNotFoundException fnfe){
            System.out.println("error...SecurityException");
            System.exit(1);
        }
       
             for (int i = 0; i < user.length; i++) {
                 output.format("%d %d %s %d \n",ATMTest.user[i].getId(),ATMTest.user[i].getpassword(),ATMTest.user[i].getName(),ATMTest.user[i].getbalance());
             }

            output.close();
           System.exit(1);
        }

   

//************************************************************************************************
public void closefile(){

    output.close();
    }

 }