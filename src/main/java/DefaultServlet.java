import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class DefaultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // forward — делегирует обработку запроса другому сервлету на сервере, клиент при этом не задействуется
        getServletContext().getRequestDispatcher("/hello").forward(req, resp);

//        // redirect — возвращает клиенту адрес, по которому нужно обратиться для обработки его запроса. Большинство браузеров переходит на переданную ссылку автоматически
//        resp.sendRedirect(req.getContextPath() + "/hello");
    }
}
