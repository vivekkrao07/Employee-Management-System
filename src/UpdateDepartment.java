import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Department: ");
        String dept = sc.next();

        try {
            Connection con = DBConnection.getConnection();

            String query = "UPDATE employee SET department=? WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, dept);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Department Updated Successfully");
            else
                System.out.println("Employee Not Found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
