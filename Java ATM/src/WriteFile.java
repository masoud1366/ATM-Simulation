import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;

public class WriteFile {
    private static Formatter output;
    
    public static void writerecords(String filename){
        try{
            output=new Formatter(filename);
           }
        catch(FileNotFoundException fnfe){
            System.out.println("error...SecurityException");
            System.exit(1);
        }

         output.format("%10d %10d %10s %10d \n",1,11, "Tom",1000 );
         output.format("%10d %10d %10s %10d \n",2,22, "Jan",2000 );
         output.format("%10d %10d %10s %10d\n",3,33, "Maryam",3000 );
         output.format("%10d %10d %10s %10d\n",4,44, "Liam",4000 );
         output.format("%10d %10d %10s %10d\n",5,55, "Masoud",50000000 );
         output.format("%10d %10d %10s %10d\n",6,66, "Jack",6000 );
         output.format("%10d %10d %10s %10d\n",7,77, "Liz",7000 );
         output.format("%10d %10d %10s %10d\n",8,88, "Arash",8000 );
         output.format("%10d %10d %10s %10d\n",9,99, "Rita",9000 );
         output.format("%10d %10d %10s %10d\n",10,100, "Marie",10000 );
         output.format("%10d %10d %10s %10d\n",11,111, "Max",11000 );
         output.format("%10d %10d %10s %10d \n",12,222, "David",22000 );
         output.format("%10d %10d %10s %10d\n",13,333, "Bob",33000 );
         output.format("%10d %10d %10s %10d\n",14,444, "Chulk",44000 );
         output.format("%10d %10d %10s %10d\n",15,555, "Donald",55000 );
         output.format("%10d %10d %10s %10d\n",16,666, "Trump",66000 );
         output.format("%10d %10d %10s %10d\n",17,777, "Don",77000 );
         output.format("%10d %10d %10s %10d\n",18,888, "Jane",88000 );
         output.format("%10d %10d %10s %10d\n",19,999, "Julie",99000 );
         output.format("%10d %10d %10s %10d\n",20,1000, "Jana",100000 );

    }
    public static void closefile(){

           output.close();
    }
    public static void main(String[] args) {
        writerecords("ATM6.txt");
        closefile();
    }

}
