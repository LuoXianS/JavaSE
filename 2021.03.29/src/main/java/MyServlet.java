import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //谁知编码格式
        resp.setCharacterEncoding("utf-8");
        //设置返回的数据类型
        resp.setContentType("text/html");
        String num1 = req.getParameter("num1");
        PrintWriter writer = resp.getWriter();
        writer.println("获取一个参数"+num1);
    }
}
