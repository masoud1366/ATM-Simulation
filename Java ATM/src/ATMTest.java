import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Formatter;
import java.util.FormatterClosedException;
public class ATMTest extends ATM2 {
    protected static Acount user[]=new Acount[20];
    

    public static void main(String args[]) throws FileNotFoundException{
        ATM2 at=new ATM2();


//***************************************************************************************
        //read from file
       for(k=0;k<user.length;k++)
        user[k]=at.read();
        
//***************************************************************************************
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("**************Welcome to Troy University Bank************" );
        System.out.println("Enter your username:" );
        int u=input.nextInt();
        if( at.checkusername(u)==0){
            System.out.println("wrong username!!");
         }
        if( at.checkusername(u)>0){
        System.out.println("Enter your password:" );
        int p=input.nextInt();
        if(at.checkpassword(u,p)==0){
          System.out.println("wrong password!!!");
           }
        if (at.checkpassword(u,p)!=0){
          System.out.println("1)view my balance\n2)withdraw cash\n3)deposit cash\n4)cash transfer\n5)Exit\n6)Enter 6 To Exit From ATM\n\nEnter the number to continue:");
        int number=input.nextInt();
        while(number!=5){
         if(number==1)
           at.viewbalance(p);
         if(number==2)
            at.withdraw(p);
         if(number==3)
            at.deposit(p);
         if(number==4)
           at.cashtransfer(p);
         if(number==6){
             at.save();
             at.closefile();
            }
         System.out.println("1)view my balance\n2)withdraw cash\n3)deposit cash\n4)cash transfer\n5)Exit\n6)Enter 6 To Exit From ATM\nEnter the number to continue:" );
         number=input.nextInt();
}

         if(number==5)
             System.out.println("you are existed from ATM\n");


    }

    }

 }

}
}

