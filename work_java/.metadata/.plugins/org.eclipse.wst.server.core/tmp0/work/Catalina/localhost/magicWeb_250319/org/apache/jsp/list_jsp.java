/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.102
 * Generated at: 2025-03-21 08:38:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import magic.board.BoardBean;
import java.util.ArrayList;
import magic.board.BoardDBBean;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("magic.board.BoardBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	BoardDBBean db = BoardDBBean.getInstance();
//	호출된 메소드의 반환 타입으로 받아주면 됨
	ArrayList<BoardBean> boardList = db.listBoard();
	int b_id=0, b_hit=0, b_level=0;
	String b_name,b_email,b_title,b_content;
	Timestamp b_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<center>\r\n");
      out.write("		<h1>게시판에 등록된 글 목록 보기</h1>\r\n");
      out.write("		<table width=\"600\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"right\">\r\n");
      out.write("					<a href=\"write.jsp\">글 쓰 기</a>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</center>\r\n");
      out.write("	<center>\r\n");
      out.write("		<table border=\"1\" width=\"800\" cellspacing=\"0\">\r\n");
      out.write("			<tr height=\"25\">\r\n");
      out.write("				<td width=\"40\" align=\"center\">번호</td>\r\n");
      out.write("				<td width=\"450\" align=\"center\">글제목</td>\r\n");
      out.write("				<td width=\"120\" align=\"center\">작성자</td>\r\n");
      out.write("				<td width=\"130\" align=\"center\">작성일</td>\r\n");
      out.write("				<td width=\"60\" align=\"center\">조회수</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");

// 			boardList 에 있는 오라클 데이터를 가져옴
				for(int i=0; i<boardList.size(); i++){
//	 				ArrayList 데이터의 BoardBean 객체를 가져온다.
					BoardBean board = boardList.get(i);
//	 				board 객체에 있는 컬럼의 데이터를 가져온다.
					b_id = board.getB_id();
					b_name = board.getB_name();
					b_email = board.getB_email();
					b_title = board.getB_title();
					b_content = board.getB_content();
					b_date = board.getB_date();
					b_hit= board.getB_hit();
					b_level= board.getB_level();
			
      out.write("\r\n");
      out.write("			<tr bgcolor=\"#f7f7f7\" \r\n");
      out.write("				onmouseover=\"this.style.backgroundColor='#eeeeef'\"\r\n");
      out.write("				onmouseout=\"this.style.backgroundColor='#f7f7f7'\">\r\n");
      out.write("				<td align=\"center\">");
      out.print( b_id );
      out.write("</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					");

						//b_level 기준으로 화살표 이미지를 들여쓰기로 출력
						if(b_level>0){ //답변글
							//for 기준으로 들여쓰기를 얼마나 할것인지 정함 
							for(int j=0;j<b_level;j++){
								
      out.write("\r\n");
      out.write("									&nbsp;\r\n");
      out.write("								");

							}
						//들여쓰기가 적용된 시점 -> 이미지 추가
						
      out.write("\r\n");
      out.write("							<img src=\"./images/AnswerLine.gif\" width=\"16\" height=\"16\">\r\n");
      out.write("						");

						}
					
      out.write("\r\n");
      out.write("					<a href=\"show.jsp?b_id=");
      out.print( b_id );
      out.write("\">\r\n");
      out.write("						");
      out.print( b_title );
      out.write("\r\n");
      out.write("					</a>\r\n");
      out.write("				</td>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<a href=\"mailto:");
      out.print( b_email );
      out.write("\">\r\n");
      out.write("						");
      out.print( b_name );
      out.write("\r\n");
      out.write("					</a>\r\n");
      out.write("				</td>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("					");
      out.print( sdf.format(b_date) );
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("				<td align=\"center\">");
      out.print( b_hit );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
