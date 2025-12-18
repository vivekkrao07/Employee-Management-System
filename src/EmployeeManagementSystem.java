import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Update Department");
            System.out.println("5. Delete Employee");
            System.out.println("6. Search Employee");
            System.out.println("7. View By Department");
            System.out.println("8. Increment Salary");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    InsertEmployee.main(null);
                    break;
                case 2:
                    ViewEmployee.main(null);
                    break;
                case 3:
                    UpdateSalary.main(null);
                    break;
                case 4:
                    UpdateDepartment.main(null);
                    break;
                case 5:
                    DeleteEmployee.main(null);
                    break;
                case 6:
                    SearchEmployee.main(null);
                    break;
                case 7:
                    ViewByDepartment.main(null);
                    break;
                case 8:
                    IncrementSalary.main(null);
                    break;

                case 9:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
