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

         output.format("%10d %10d %10s %10d \n",1,11, "zahra",1000 );
         output.format("%10d %10d %10s %10d \n",2,22, "sara",2000 );
         output.format("%10d %10d %10s %10d\n",3,33, "samira",3000 );
         output.format("%10d %10d %10s %10d\n",4,44, "sahar",4000 );
         output.format("%10d %10d %10s %10d\n",5,55, "sanaz",5000 );
         output.format("%10d %10d %10s %10d\n",6,66, "samira",6000 );
         output.format("%10d %10d %10s %10d\n",7,77, "sana",7000 );
         output.format("%10d %10d %10s %10d\n",8,88, "saba",8000 );
         output.format("%10d %10d %10s %10d\n",9,99, "mahsa",9000 );
         output.format("%10d %10d %10s %10d\n",10,100, "mahtab",10000 );
         output.format("%10d %10d %10s %10d\n",11,111, "mahshad",110000 );
         output.format("%10d %10d %10s %10d \n",12,222, "Fateme",22000 );
         output.format("%10d %10d %10s %10d\n",13,333, "maryam",33000 );
         output.format("%10d %10d %10s %10d\n",14,444, "nastaran",44000 );
         output.format("%10d %10d %10s %10d\n",15,555, "nazanin",55000 );
         output.format("%10d %10d %10s %10d\n",16,666, "kimia",66000 );
         output.format("%10d %10d %10s %10d\n",17,777, "kiana",77000 );
         output.format("%10d %10d %10s %10d\n",18,888, "mina",88000 );
         output.format("%10d %10d %10s %10d\n",19,999, "minoo",99000 );
         output.format("%10d %10d %10s %10d\n",20,1000, "mehrnoosh",100000 );

    }
    public static void closefile(){

           output.close();
    }
    public static void main(String[] args) {
        writerecords("ATM6.txt");
        closefile();
    }

}
