
import java.util.Scanner;
public class Acount {
    private int Id;
    private String name;
    private int password;
    private int balance;

    public Acount(int username, int password,String name,int balance) {
        this.Id = username;
        this.name = name;
        this.password = password;
        this.balance=balance;
    }

    public int getbalance(){
        return balance;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }



    public int getpassword() {
        return password;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setpassword(int password) {
        this.password = password;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }





}
