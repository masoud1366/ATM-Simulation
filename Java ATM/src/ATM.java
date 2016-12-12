import java.util.Scanner;
public class ATM {
    protected static Acount[] user;



//*****************************************************************
public static int checkusername(int u){
        int m=0;
        for(int i=0;i<ATMTest.user.length;i++)
         if(ATMTest.user[i].getId()==u)
           m++;
         return m;
         }

//******************************************************************
 public static int  checkpassword(int u,int p){
        int m=0;
        for(int i=0;i<ATMTest.user.length;i++)
         if(ATMTest.user[i].getId()==u)
           if(ATMTest.user[i].getpassword()==p){
              System.out.printf("Hello %s\n\n",ATMTest.user[i].getName());
              m++;
             }
        return m;
       }
//*******************************************************************
   public static void viewbalance(int p){
      for(int i=0;i<ATMTest.user.length;i++)
        if(ATMTest.user[i].getpassword()==p)
          System.out.printf("your balance is:%d\n\n",ATMTest.user[i].getbalance() );
        }
 //*******************************************************************
    public static   void cashtransfer(int p){
        System.out.println("Enter the amount of money to transfer :");
        Scanner input=new Scanner(System.in);
        int amount=input.nextInt();
        System.out.println("Enter the acount number of person:");
        int n=input.nextInt();
        for(int i=0;i<ATMTest.user.length;i++)
          if(ATMTest.user[i].getpassword()==p)
              if(ATMTest.user[i].getbalance()>=amount){

                for(int j=0;j<ATMTest.user.length;j++)
                  if(ATMTest.user[j].getId()==n){
                    System.out.printf("do you want to transfer money to %s ?\nEnter yes or no:\n\n ",ATMTest.user[j].getName());
                    String m=input.next();
                    if(m.equals("yes")){
                    ATMTest.user[j].setbalance(ATMTest.user[j].getbalance()+amount);
                    ATMTest.user[i].setbalance(ATMTest.user[i].getbalance()-amount);
                    System.out.printf("%d Dollar was transfered to %s\n\n",amount,ATMTest.user[j].getName());
                    break;
                      }
                    }
                  else
                      if(j==ATMTest.user.length-1)
                      System.out.println("wrong username!! you can't transfer money to this person");
                  }
                 else{
                    System.out.println("you dont have enough money in your account!!");
                    break;
                 }



    }
 //********************************************************************
public static void withdraw(int p){
    System.out.println("Enter the amount of money you want to withdraw:");
    Scanner input=new Scanner(System.in);
    int amount=input.nextInt();
    for(int i=0;i<ATMTest.user.length;i++)
       if(ATMTest.user[i].getpassword()==p)
           if(ATMTest.user[i].getbalance()>=amount){
                ATMTest.user[i].setbalance(ATMTest.user[i].getbalance()-amount);
                System.out.printf("%d Dollar was withdrawn from your account\n\n",amount);
           }
                    else{
                    System.out.println("your dont have enough money in your account!!\n");
                    break;
                 }
    }
//**********************************************************************
 public static void deposit(int p){
    System.out.println("Enter the amount of money you want to deposit:");
    Scanner input=new Scanner(System.in);
    int amount=input.nextInt();
    for(int i=0;i<ATMTest.user.length;i++)
       if(ATMTest.user[i].getpassword()==p){
           ATMTest.user[i].setbalance(ATMTest.user[i].getbalance()+amount);
           System.out.printf("%d Dollar was deposited to your account\n\n",amount);
           }
 }





}
