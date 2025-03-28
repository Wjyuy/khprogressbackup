/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.102
 * Generated at: 2025-03-21 08:38:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import magic.board.BoardBean;
import magic.board.BoardDBBean;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("magic.board.BoardBean");
    _jspx_imports_classes.add("magic.board.BoardDBBean");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");

	int b_id=0 , b_ref=1, b_step=0, b_level=0;
	String b_title="";
	
// 답변글 (show.jsp 에서 글번호를 가지고 온다)
	if(request.getParameter("bid") !=null){
		b_id= Integer.parseInt(request.getParameter("bid"));
	}

	BoardDBBean db = BoardDBBean.getInstance();
	BoardBean board =db.getBoard(b_id, false);
	
	if(board !=null){ //답변글
		b_ref= board.getB_ref();
		b_step= board.getB_step();
		b_level= board.getB_level();
		b_title= board.getB_title();
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<script src=\"board.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<center>\r\n");
      out.write("		<h1>글 올 리 기</h1>\r\n");
      out.write("		<form name=\"reg_frm\" method=\"post\" action=\"write_ok.jsp\">\r\n");
      out.write("			<input type=\"hidden\" name=\"b_id\" value=\"");
      out.print(b_id );
      out.write("\">\r\n");
      out.write("			<input type=\"hidden\" name=\"b_ref\" value=\"");
      out.print(b_ref );
      out.write("\">\r\n");
      out.write("			<input type=\"hidden\" name=\"b_step\" value=\"");
      out.print(b_step );
      out.write("\">\r\n");
      out.write("			<input type=\"hidden\" name=\"b_title\" value=\"");
      out.print(b_title );
      out.write("\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr height=\"30\">\r\n");
      out.write("					<td width=\"80\">작성자</td>\r\n");
      out.write("					<td width=\"140\">\r\n");
      out.write("					<!-- 					maxlength : 화면단에서 데이터베이스 오류를 미리 방지 -->\r\n");
      out.write("						<input type=\"text\" name=\"b_name\" size=\"10\" maxlength=\"20\">\r\n");
      out.write("					</td>\r\n");
      out.write("					<td width=\"80\">이메일</td>\r\n");
      out.write("					<td width=\"240\">\r\n");
      out.write("					<!-- 					maxlength : 화면단에서 데이터베이스 오류를 미리 방지 -->\r\n");
      out.write("						<input type=\"text\" name=\"b_email\" size=\"24\" maxlength=\"50\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr height=\"30\">\r\n");
      out.write("					<td width=\"80\">글제목</td>\r\n");
      out.write("					<td colspan=\"3\" width=\"460\">\r\n");
      out.write("					");

// 						[답변]: 의 존재여부 제목 분기처리 
						if(b_id==0){ //신규 글
							
      out.write("<input type=\"text\" name=\"b_title\" size=\"55\" maxlength=\"80\">");

						}else{ //답변글
							
      out.write("\r\n");
      out.write("						<input type=\"text\" name=\"b_title\" size=\"55\" maxlength=\"80\" \r\n");
      out.write("								value=\"[답변]: ");
      out.print(b_title);
      out.write("\">\r\n");
      out.write("							");

						}
					
      out.write("\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"4\">\r\n");
      out.write("						<textarea rows=\"10\" cols=\"65\" name=\"b_content\"></textarea>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr height=\"30\">\r\n");
      out.write("					<td width=\"80\">암&nbsp;&nbsp;호 </td>\r\n");
      out.write("					<td colspan=\"3\" width=\"460\">\r\n");
      out.write("<!-- 					maxlength 랑 varchar2 길이를 맞춰주자 !! 꼭  -->\r\n");
      out.write("						<input type=\"password\" name=\"b_pwd\" size=\"12\" maxlength=\"12\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr height=\"50\" align=\"center\">\r\n");
      out.write("					<td colspan=\"4\">\r\n");
      out.write("						<input type=\"button\" value=\"글쓰기\" onclick=\"check_ok()\">&nbsp;\r\n");
      out.write("						<input type=\"reset\" value=\"다시작성\">\r\n");
      out.write("						<input type=\"button\" value=\"글목록\" onclick=\"location.href='list.jsp'\">&nbsp;\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("		</form>\r\n");
      out.write("	</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
