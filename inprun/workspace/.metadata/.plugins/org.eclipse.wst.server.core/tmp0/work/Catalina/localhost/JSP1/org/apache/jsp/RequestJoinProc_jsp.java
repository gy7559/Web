/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.92
 * Generated at: 2023-08-31 09:10:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RequestJoinProc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h2>회원 정보보기</h2>\r\n");

	//post방식으로 데이터가 넘어올때 한글이 깨질수 있어서 밑에줄 코드를 넣는다.
	 request.setCharacterEncoding("EUC-KR");

	//사용자로 부터 넘어온 각 데이터를 저장 
	String id = request.getParameter("id");
	String pass1 = request.getParameter("pass1");
	String pass2 = request.getParameter("pass2");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");
	
	//체크박스는 []배열 타입으로 리턴 
	String[] hobby = request.getParameterValues("habby");
	
	String job = request.getParameter("job");
	String age = request.getParameter("age");
	String info = request.getParameter("info");
	
	
	if(!pass1.equals(pass2)){
		
      out.write("\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			alert(\"비밀번호가 틀립니다.\");\r\n");
      out.write("			history.go(-1);//이전페이지 이동\r\n");
      out.write("		</script>\r\n");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"500\" border =\"1\">\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">아이디</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">");
      out.print( id );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">이메일</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">");
      out.print( email );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">전화번호</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">");
      out.print( tel );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">관심분야</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">\r\n");
      out.write("		");
 
			for(int i=0;i<hobby.length;i++){
				out.write(hobby[i]+" ");
				
			}
		
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">직업</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">");
      out.print( job );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">연령은</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">");
      out.print( age );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">하고싶은말</td>\r\n");
      out.write("		<td width=\"350\" align=\"center\">");
      out.print( info );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}