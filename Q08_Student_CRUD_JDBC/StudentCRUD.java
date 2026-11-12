
import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Connect to MySQL database
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "YOUR_PASSWORD"
        );

        System.out.println("Database Connected Successfully!");

        while (true) {

            System.out.println("\n===== STUDENT CRUD OPERATIONS =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            // INSERT
            if (ch == 1) {

                System.out.println("\n--- INSERT STUDENT ---");

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Student Name: ");
                String name = sc.next();

                System.out.print("Enter Student Age: ");
                int age = sc.nextInt();

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO Student VALUES(?,?,?)");

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, age);

                ps.executeUpdate();

                System.out.println("Student Inserted Successfully!");

            }

            // DISPLAY
            else if (ch == 2) {

                System.out.println("\n--- STUDENT DETAILS ---");

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(
                    "SELECT * FROM Student");

                while (rs.next()) {

                    System.out.println("ID   : " + rs.getInt(1));
                    System.out.println("Name : " + rs.getString(2));
                    System.out.println("Age  : " + rs.getInt(3));
                    System.out.println("-----------------------");

                }

            }

            // UPDATE
            else if (ch == 3) {

                System.out.println("\n--- UPDATE STUDENT ---");

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                System.out.print("Enter New Name: ");
                String name = sc.next();

                System.out.print("Enter New Age: ");
                int age = sc.nextInt();

                PreparedStatement ps = con.prepareStatement(
                    "UPDATE Student SET name=?, age=? WHERE id=?");

                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setInt(3, id);

                int n = ps.executeUpdate();

                if (n > 0)
                    System.out.println("Student Updated Successfully!");
                else
                    System.out.println("Student ID Not Found!");

            }

            // DELETE
            else if (ch == 4) {

                System.out.println("\n--- DELETE STUDENT ---");

                System.out.print("Enter Student ID to Delete: ");
                int id = sc.nextInt();

                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM Student WHERE id=?");

                ps.setInt(1, id);

                int n = ps.executeUpdate();

                if (n > 0)
                    System.out.println("Student Deleted Successfully!");
                else
                    System.out.println("Student ID Not Found!");

            }

            // EXIT
            else if (ch == 5) {

                System.out.println("Thank You! Program Exited.");
                break;

            }

            else {

                System.out.println("Invalid Choice! Try Again.");

            }
        }

        con.close();
        sc.close();

    }
}
