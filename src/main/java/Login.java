import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        DataUsers users = new DataUsers();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        for (Cookie cookie : req.getCookies()) {
            for (User u : users.getUsers()) {
                if (cookie.getName().equals(u.getName())) {
                    resp.sendRedirect("/welcome.jsp");
                    return;
                }
            }
        }
        if(username != null){
            for (User u : users.getUsers()) {
                if (username.equals(u.getName()) && password.equals(u.getPassword())) {
                    session.setAttribute("user", username);
                    if(req.getParameter("rememberme") != null){
                        Cookie c = new Cookie("user", u.getName());
                        c.setMaxAge(30*24*60*60); //in seconds
                        resp.addCookie(c);
                    }
                    resp.sendRedirect("/welcome.jsp");
                    return;
                }

            }
        }
        session.setAttribute("error", "Username o Password invalid");
        resp.sendRedirect("/index.jsp");
    }
}
