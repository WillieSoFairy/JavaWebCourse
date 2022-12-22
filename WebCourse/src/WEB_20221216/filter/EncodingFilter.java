package WEB_20221216.filter;

import java.io.IOException;
import javax.servlet.*;

public class EncodingFilter implements Filter {
    protected String encoding = null;
    protected FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        // 得到在web.xml中配置的编码
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        if (request.getCharacterEncoding() == null) {
            // 得到指定的编码
            String encode = getEncoding();
            if (encode != null) {
                //设置request的编码
                request.setCharacterEncoding(encode);
                response.setCharacterEncoding(encode);
            }
        }
        chain.doFilter(request, response);
    }

    protected String getEncoding() {
        return encoding;
    }

    public void destroy() {
    }
}
