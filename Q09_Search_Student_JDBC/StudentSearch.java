import java.sql.*;
import java.util.*;

class StudentSearch {
public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/college","root","password");

System.out.print("Enter Student ID: ");
int id = sc.nextInt();

Statement st = con.createStatement();
ResultSet rs = st.executeQuery(
"SELECT * FROM Student WHERE id="+id);

if(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
else
System.out.println("Student Not Found");

con.close();
sc.close();
}
}