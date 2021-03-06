package com.kh.member.common;
/* Common 패키지
 * - 공통적으로 사용되는 코드를 모아놓은 패키지
 * - 공통적인 코드들을 Template Class로 만들어서 중복을 제거
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* JDBCTemplate Class
 * - JDBC를 사용하면서 공통적으로 사용되는 코드들을 모아서 만들어 놓은 Class
 * - 드라이버 등록
 * - DBMS 연결 (Connection)
 * - DBMS 연결 닫기 (Connection close)
 * - 트랜젝션 제어 코드 (Commit, Rollback)
 * - Statement, PreparedStatement, ResultSet 닫기(close)
 */

// 방법 2: 일반 라이브러리 클래스로 만들기 (JDBCTemplate 객체 생성 후 사용 - new JDBCTemplate2)
	//JDBCTemplate2 : 템플릿 클래스 내 Connection 참조변수를 getConnection() 메소드의 지역변수로 선언
public class JDBCTemplate2 {
// 필드부
// 메소드부
	// DBMS 연결
	public  Connection getConnection() {
		Connection conn = null;
		try {
			// 드라이버 등록 - 생략가능(JDBC 하위버전 호환성을 위해 포함해 줌)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DBMS 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "STUDENT", "STUDENTPASS");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("예기치 못한 오류 발생 : 데이터 베이스 연결 정보를 확인하세요.");
			e.printStackTrace();
		}
		return conn;
	}
	

	// DBMS 연결 닫기
	public  void close(Connection conn) {
		// 닫아주려하니까 연결의 정보 어디에있어? -> conn에 있음, 어떤 conn인지 알기 위해 인자값으로 conn 받아줌
		try {
			// 연결 정보가 있고, 닫혀있지 않은 경우에만 닫아주기
			if(conn != null && !conn.isClosed()) {
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
