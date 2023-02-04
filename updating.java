package assignment5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updating {
    void update(Connection obj){
        int id;
        String name;
        int age;
        String address;
        String course;

        Scanner in = new Scanner(System.in);

        Statement stmt;
        String query;
        try{
            int flag = 1;
            while(flag == 1){
            System.out.println("Enter the column to be updated\n1.Name\n2.Age\n3.Address\n4.Course");
            int cs = in.nextInt();
            switch (cs){
                case 1:
                    System.out.println("Enter id:");
                    id = in.nextInt();
                    System.out.println("Enter new name:");
                    in.nextLine();
                    name = in.nextLine();
                    query = "update student set name ='"+name+"' where id="+id;
                    stmt = obj.createStatement();
                    stmt.executeUpdate(query);
                    break;
                case 2:
                    System.out.println("Enter id:");
                    id = in.nextInt();
                    System.out.println("Enter new age:");
                    age = in.nextInt();
                    query = "update student set age ='"+age+"' where id="+id;
                    stmt = obj.createStatement();
                    stmt.executeUpdate(query);
                    break;
                case 3:
                    System.out.println("Enter id:");
                    id = in.nextInt();
                    System.out.println("Enter new address:");
                    in.nextLine();
                    address = in.nextLine();
                    query = "update student set address ='"+address+"' where id="+id;
                    stmt = obj.createStatement();
                    stmt.executeUpdate(query);
                    break;
                case 4:
                    System.out.println("Enter id:");
                    id = in.nextInt();
                    System.out.println("Enter new course:");
                    in.nextLine();
                    course = in.nextLine();
                    query = "update student set course ='"+course+"' where id="+id;
                    stmt = obj.createStatement();
                    stmt.executeUpdate(query);
                    break;
                default:System.out.println("Invalid Input");
                break;
            }
            System.out.println("Do you want to continue?(yes/no):");
            String op = in.next();
            if(op.toLowerCase().equals("yes"))
                flag=1;
            else
                flag = 0;
        }
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
