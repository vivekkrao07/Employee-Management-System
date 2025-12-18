import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewEmployee {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM employee";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("ID   Name   Salary   Department");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + "   " +
                                rs.getString("name") + "   " +
                                rs.getDouble("salary") + "   " +
                                rs.getString("department")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
