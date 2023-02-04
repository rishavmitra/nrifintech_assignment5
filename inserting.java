package assignment5;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;


public class inserting {
    
    int id;
    String name;
    int age;
    String address;
    String course;

    Scanner in = new Scanner(System.in);

    Statement stmt;
    void insert(Connection con){
        int flag = 1;
        while(flag==1)
        {
            System.out.print("Id:");
            this.id = in.nextInt();
            System.out.print("Name:");
            in.nextLine();
            this.name = in.nextLine();
            System.out.print("Age:");
            this.age = in.nextInt();
            System.out.print("Address:");
            in.nextLine();
            this.address = in.nextLine();
            try{
                System.out.print("Course:");
                this.course = in.nextLine();
                String query = "insert into student values("+this.id+",'"+this.name+"'"+","+ this.age +","+"'"+this.address+"'"+","+this.course+")";
                stmt = con.createStatement();
                stmt.executeUpdate(query);
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        System.out.println("Do you want to continue?(yes/no)");
        String op = in.next();
        if(op.toLowerCase().equals("yes"))
            flag = 1;
        else
            flag = 0;
        }
    }
}
