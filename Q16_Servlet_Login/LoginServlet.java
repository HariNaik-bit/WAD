import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req,
    HttpServletResponse res) throws IOException {

        String u = req.getParameter("username");
        String p = req.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?");

            ps.setString(1, u);
            ps.setString(2, p);

            ResultSet rs = ps.executeQuery();

            PrintWriter out = res.getWriter();

            if(rs.next())
                out.println("Login Successful");
            else
                out.println("Invalid Login");

            con.close();

        } catch(Exception e) {
            res.getWriter().println(e);
        }
    }
}