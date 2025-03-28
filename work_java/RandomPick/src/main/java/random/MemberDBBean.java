package random;

import java.sql.*;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDBBean {

    private static MemberDBBean instance = new MemberDBBean();

    public static MemberDBBean getInstance() {
        return instance;
    }

    private Connection getConnection() throws Exception {
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
        return ds.getConnection();
    }

    // 1. 회원가입
    public int insertMember(MemberBean member) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = -1;
        String sql = "INSERT INTO memberP (m_id, m_pwd) VALUES (?, ?)";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getUsername());
            pstmt.setString(2, member.getPassword());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
        return result;
    }

    // 2. 아이디 중복 확인
    public int confirmID(String id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int result = -1;
        String sql = "SELECT m_id FROM member WHERE m_id = ?";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                result = 1; // 중복
            } else {
                result = -1; // 사용 가능
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }

        return result;
    }

    // 3. 로그인 시 아이디/비번 확인
    public int userCheck(String id, String pwd) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT m_pwd FROM memberP WHERE m_id = ?";
        int result = -1;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String db_pwd = rs.getString("m_pwd");
                if (db_pwd.equals(pwd)) {
                    result = 1; // 로그인 성공
                } else {
                    result = 0; // 비밀번호 불일치
                }
            } else {
                result = -1; // 아이디 없음
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }

        return result;
    }
}
