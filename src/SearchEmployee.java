import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM employee WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Employee Found:");
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println("Department: " + rs.getString("department"));
            } else {
                System.out.println("Employee Not Found");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
