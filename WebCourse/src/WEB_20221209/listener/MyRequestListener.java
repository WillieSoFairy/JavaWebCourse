package WEB_20221209.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

@WebListener
public final class MyRequestListener
        implements ServletRequestListener {
    private Integer count = 0;

    public void requestInitialized(ServletRequestEvent re) {
        HttpServletRequest request =
                (HttpServletRequest) re.getServletRequest();
        if (request.getRequestURI().equals("/WEB_20221209/listener_test.jsp")) {
            count++;
            re.getServletContext().setAttribute("count", count);
        }
    }

    public void requestDestroyed(ServletRequestEvent re) {
    }
}
