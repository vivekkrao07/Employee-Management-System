import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Department: ");
        String dept = sc.next();

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);
            ps.setString(4, dept);

            ps.executeUpdate();
            System.out.println("Employee Added Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
