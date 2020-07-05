import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Login")
@MultipartConfig
public class Login extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

    
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
   

    String parametro1 = request.getParameter("username");

    if(parametro1.equals("adolfo")){
        PrintWriter out;
        out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Enviar parametros a un Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Enviar parametros a un Servlet</h1>");
        out.println("La primera palabra pasada como parametro es <strong>" + parametro1 + "</strong><br>");
        
        out.println("</body></html>");

    }else{
         PrintWriter out;
        out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Enviar parametros a un Servlet</title></head>");
        out.println("<body>");
        out.println("<p>No jala esta madre</p>");
        
        out.println("</body></html>");

    }

    
}   

        //javac -classpath ".;C:\Program Files\tomcat\lib\servlet-api.jar" Login.java
                 
}
