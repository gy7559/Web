/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.92
 * Generated at: 2023-08-30 05:36:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RequestJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<center>\r\n");
      out.write("	<h2>회원 가입</h2>\r\n");
      out.write("	<form action=\"RequestJoinProc.jsp\" method=\"post\">\r\n");
      out.write("	<table width=\"500\" border=\"1\">\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\"> 아이디</td>\r\n");
      out.write("			<td width=\"350\"> <input type=\"text\" name=\"id\" size=\"40\"></td>\r\n");
      out.write("		\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\"> 패스워드</td>\r\n");
      out.write("			<td width=\"350\"> <input type=\"password\" name=\"pass1\" size=\"40\"></td>\r\n");
      out.write("		\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\"> 패스워드확인</td>\r\n");
      out.write("			<td width=\"350\"> <input type=\"password\" name=\"pass2\" size=\"40\"></td>\r\n");
      out.write("		\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\"> 이메일</td>\r\n");
      out.write("			<td width=\"350\"> <input type=\"email\" name=\"email\" size=\"40\" ></td>\r\n");
      out.write("		\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\"> 전화번호</td>\r\n");
      out.write("			<td width=\"350\"> <input type=\"tel\" name=\"tel\" size=\"40\"></td>\r\n");
      out.write("		\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\">당신의 관신분야</td>\r\n");
      out.write("			<td width=\"350\" align=\"center\">\r\n");
      out.write("			<input type=\"checkbox\" name=\"habby\" value=\"캠핑\">캠핑 &nbsp;&nbsp;\r\n");
      out.write("			<input type=\"checkbox\" name=\"habby\" value=\"등산\">등산 &nbsp;&nbsp;\r\n");
      out.write("			<input type=\"checkbox\" name=\"habby\" value=\"영화\">영화 &nbsp;&nbsp;\r\n");
      out.write("			<input type=\"checkbox\" name=\"habby\" value=\"독서\">독서 &nbsp;&nbsp;\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\">당신의 직업은?</td>\r\n");
      out.write("			<td width=\"350\" align=\"center\">\r\n");
      out.write("			<select name=\"job\">\r\n");
      out.write("				<option value=\"교사\">교사</option>\r\n");
      out.write("				<option value=\"변호사\">변호사</option>\r\n");
      out.write("				<option value=\"의사\">의사</option>\r\n");
      out.write("				<option value=\"기술사\">기술사</option>\r\n");
      out.write("			</select>\r\n");
      out.write("			</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("			<td width=\"150\" align=\"center\">당신의 연령은</td>\r\n");
      out.write("			<td width=\"350\" align=\"center\">\r\n");
      out.write("			<input type=\"radio\" name=\"age\" value=\"10\">10대 &nbsp;&nbsp;\r\n");
      out.write("			<input type=\"radio\" name=\"age\" value=\"20\">20대  &nbsp;&nbsp;\r\n");
      out.write("			<input type=\"radio\" name=\"age\" value=\"30\">30대 &nbsp;&nbsp;\r\n");
      out.write("			<input type=\"radio\" name=\"age\" value=\"40\">40대 &nbsp;&nbsp;\r\n");
      out.write("			</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("		<td width=\"150\" align=\"center\">하고싶은 말</td>\r\n");
      out.write("			<td width=\"350\" align=\"center\">\r\n");
      out.write("				<textarea rows=\"5\" cols=\"40\" name=\"info\"></textarea>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr height=\"50\">\r\n");
      out.write("		<td align=\"center\" colspan=\"2\">\r\n");
      out.write("		<input type=\"submit\" value=\"회원가입\">\r\n");
      out.write("		<input type=\"reset\" value=\"취소\">\r\n");
      out.write("		</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	</center>\r\n");
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
