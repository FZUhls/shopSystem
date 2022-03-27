package com.wrk.shopsystem.admin.requestWrapper;


import lombok.extern.slf4j.Slf4j;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


/**
 * XSS过滤处理
 */
@Slf4j
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private HttpServletRequest request;

    public XssHttpServletRequestWrapper(HttpServletRequest request){
        super(request);

        log.debug(request.getCookies().toString());
        this.request = request;
    }

//    @Override
//    public ServletInputStream getInputStream(){
//        ServletInputStream servletInputStream = null;
//        try {
//            ServletInputStream inputStream = this.request.getInputStream();
//            String body = IoUtil.read(inputStream,"utf-8");
//            final InputStream stream = IoUtil.toStream(cleanXss(body),"utf-8");
//            servletInputStream = new ServletInputStream() {
//                @Override
//                public boolean isFinished() {
//                    throw new RuntimeException("not yet implemented");
//                }
//
//                @Override
//                public boolean isReady() {
//                    throw new RuntimeException("not yet implemented");
//                }
//                @Override
//                public void setReadListener(ReadListener listener) {
//                    throw new RuntimeException("not yet implemented");
//                }
//
//                @Override
//                public int read() throws IOException {
//                    return stream.read();
//                }
//            };
//        }catch (IOException e){
//            log.error(e.getMessage());
//        }
//        return servletInputStream;
//    }

//    @Override
//    public String getHeader(String name) {
//        String head = super.getHeader(name);
//        if (head!=null){
//            return cleanXss(head);
//        }
//        return name;
//    }

    @Override
    public String getParameter(String name) {
        String param = super.getParameter(name);
        if (param!=null){
            return cleanXss(param);
        }
        return param;
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        if (values != null) {
            int length = values.length;
            String[] escapseValues = new String[length];
            for (int i = 0; i < length; i++) {
                escapseValues[i] = cleanXss(values[i]);
            }
            return escapseValues;
        }
        return super.getParameterValues(name);
    }

    private String cleanXss(String value){
        log.debug(value);
        value = value.replaceAll("<","&lt;").replaceAll(">","&gt;");
        value = value.replaceAll("\\(","&#40;").replaceAll("\\)","&#41;");
        value = value.replaceAll("'","&#39;");
        value = value.replaceAll("eval\\((.*)\\)","");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']","\"\"");
        value = value.replaceAll("script","");
        //add clean sql injection

        log.debug(value);
        return value;
    }
}
