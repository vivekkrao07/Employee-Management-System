import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ViewByDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        String dept = sc.next();

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM employee WHERE department=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dept);

            ResultSet rs = ps.executeQuery();

            System.out.println("ID  Name  Salary  Department");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " " +
                                rs.getString("name") + " " +
                                rs.getDouble("salary") + " " +
                                rs.getString("department")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
