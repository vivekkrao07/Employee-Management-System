import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        try {
            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM employee WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
