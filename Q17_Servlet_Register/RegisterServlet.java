import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
    HttpServletResponse res) throws IOException {

        String u = req.getParameter("username");
        String e = req.getParameter("email");
        String p = req.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users VALUES(?,?,?)");

            ps.setString(1, u);
            ps.setString(2, e);
            ps.setString(3, p);

            ps.executeUpdate();

            res.getWriter().println("Registration Successful");

            con.close();

        } catch(Exception ex) {
            res.getWriter().println(ex);
        }
    }
}