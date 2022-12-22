package WEB_20221216.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuditFilter implements Filter {
    protected FilterConfig config;

    public void init(FilterConfig filterConfig)
            throws ServletException {
        this.config = filterConfig;
    }

    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String addr = req.getRemoteAddr();
        String user = req.getRemoteHost();
        config.getServletContext().log("RemoteAddress:" + addr +
                ",RemoteHost:" + user);
        chain.doFilter(req, res);
    }

    public void destroy() {
    }
}
