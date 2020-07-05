import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.Statement;
import java.sql.ResultSet;
import java.net.*;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 
import javax.servlet.http.*;
import java.io.*;
import java.nio.file.Paths;

@WebServlet("/subirFotos") 
public class subirFotos extends HttpServlet { 
    private static final long serialVersionUID = 1L; 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Obtiene <input type="text" name="txtDir">
 
    



    try { 

           
            Connection con = DatabaseConnection.initializeDatabase(); 
            PreparedStatement st = con.prepareStatement("insert into fotos (nombre, idusuarios) values(?, ?)"); 

            
            st.setString(1, request.getParameter("nombre")); 

            
            st.setString(2, request.getParameter("id")); 


            
            st.executeUpdate(); 

            
            st.close(); 
            con.close(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        }     
 }  
}

//javac -classpath ".;C:\Program Files\tomcat\lib\servlet.jar" Login.java