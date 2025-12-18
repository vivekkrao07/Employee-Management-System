import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Salary: ");
        double salary = sc.nextDouble();

        try {
            Connection con = DBConnection.getConnection();

            String query = "UPDATE employee SET salary=? WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
