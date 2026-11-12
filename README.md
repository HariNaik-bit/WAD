WAD LAB EXTERNAL - SIMPLE CODE PACK
===================================

HOW TO USE
1. Open the folder for the question number.
2. Create the same files in Eclipse / VS Code / your lab environment.
3. For HTML questions, open index.html in a browser.
4. For Java JDBC questions, install MySQL Connector/J, create the database using database.sql,
   and change username/password in the Java file.
5. For Servlet questions, create a Dynamic Web Project, add MySQL Connector/J and the
   Servlet API supplied by your Tomcat version. Place HTML in the web content folder and
   Java servlet files in the Java source folder.
6. For React questions, create the app with the commands in package-note.txt.

IMPORTANT SETTINGS
- Replace YOUR_API_KEY with your own OpenWeatherMap API key for weather programs.
- Replace root/password with your own MySQL username/password.
- Servlet examples use javax.servlet imports (Tomcat 9). For Tomcat 10+, change javax.servlet
  to jakarta.servlet.
- Q10 uses an ArrayList, so records remain only while the program is running.
- Q13 displays current weather as a chart; the lab prompt says current and historical data,
  but the supplied PDF's sample only demonstrates current temperature and illustrative
  past/current/future values. It does not fetch genuine historical records.

EXAM MEMORY SHORTCUTS
Q1: 4 pages = Home, Login, Register, Catalog. CSS = navbar + hero + form + grid.
Q2: Same pages + Bootstrap CDN + container/row/col/card.
Q3: Read values -> check empty -> check email -> check password -> success.
Q4/Q6: Input city -> fetch API -> JSON -> show details/chart.
Q5: Arrow = (a,b)=>; map = array.map(); callback = function passed to function.
Q7: Promise -> setTimeout -> resolve -> then / catch.
Q8: CRUD = INSERT, SELECT, UPDATE, DELETE.
Q9: ID -> PreparedStatement -> executeQuery -> rs.next().
Q10: ArrayList -> add, display, update, remove.
Q11: XML + DOCTYPE + DTD ELEMENT rules.
Q12: XML schema link + xs:element + xs:complexType + xs:sequence.
Q13: Service fetches data; React state stores value; Chart.js displays graph.
Q14: Cookie create -> response.addCookie -> request.getCookies.
Q15: BrowserRouter -> Routes -> Route -> Link.
Q16: Servlet doPost -> getParameter -> SELECT -> result.
Q17: Servlet doPost -> getParameter -> INSERT -> success.
Q18: Get selected product -> INSERT into catalogue -> response.

EXPECTED OUTPUT GUIDE
- Q1/Q2: Home welcome page; Login form; Register form; Catalog cards.
- Q3: Alerts for empty fields, invalid email, short password; otherwise Registration successful.
- Q4/Q6/Q13: City weather values and a temperature chart (requires API key and internet).
- Q5: Sum: 9; Squares: 1,4,9; Hello Ravi.
- Q7: Loading..., then Data fetched successfully! after 2 seconds.
- Q8: Menu for Insert/Display/Update/Delete; messages Inserted/Updated/Deleted.
- Q9: Prints matching student details or Student not found.
- Q10: Menu for Add/View/Update/Delete books.
- Q11/Q12: XML bookstore document validates against DTD/XSD.
- Q14: Cookie stored successfully; read page displays Welcome Student.
- Q15: Navigation links open Home/Register/Login/Contact/About pages.
- Q16: Login Successful or Invalid Login.
- Q17: Registration Successful.
- Q18: Product stored in catalogue.
