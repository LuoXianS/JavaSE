import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class cal extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        Integer num1 =Integer.parseInt(req.getParameter("num1"));
        Integer num2 =Integer.parseInt(req.getParameter("num2"));
        Integer result = num1+num2;
        PrintWriter writer = resp.getWriter();
        writer.println("两个数的和为"+result);
    }
}
