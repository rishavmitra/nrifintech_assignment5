package assignment5;
import java.util.Scanner;
import java.sql.Connection;

public class studentInput {
    Scanner in = new Scanner(System.in);
    inserting obIn = new inserting();
    updating obUp = new updating();

    
    void input(Connection con){
        int flag = 1;
        while(flag==1){
            System.out.println("Enter option:\n1. Insert\n2. Update\n3. Exit");
            int cs = in.nextInt();
            switch (cs){
                case 1:obIn.insert(con);
                break;
                case 2:obUp.update(con);
                break;
                case 3: return;
                default:System.out.println("Invalid Input");
                break;
            }
        }
    }
}
