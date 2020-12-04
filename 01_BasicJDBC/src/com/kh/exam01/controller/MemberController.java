package com.kh.exam01.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.exam01.model.vo.Member;

public class MemberController {
	// Statement : Insert1 (기본 연동 실습)
	public void method01() {
		System.out.println("------- Statement : Inset1 (기본연동실습) -------");
	// [JDBC 작업 순서]
		// 1. Driver 등록 (DriverManger)
		// 2. DBMS와 연결 (Connection)
		// 3. SQL 생성 (String)
		// 4. SQL 전송 (Statement)
		// 5. 결과 받기 (ResultSet || int)
		// 6. 연결 닫기 (close)
		
	// DBMS와 연동하기 위한 참조변수 생성 (닫아줘야하는 애들이 있어서)
		// DriverManager는 직접 객체 생성 불가능
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		int result = 0; // INSERT 할거니까 반환값은 정수이기 때문에
		try {
		// 1. Driver 등록(DriverManager)
			// 기존에는 코드에서 드라이버 클래스를 별도로 등록해 줘야 했으나 현재는 안해줘도 됨
			// Class.forName("oracle.jdbc.driver.OracleDriver"); , 예외처리 필수
	
		// 2. DBMS와 연결(Connection)
			// DriverManager.getConnection("JDBC형식URL","계정","패스워드");
			// JDBC 형식의 URL : 접속할 DBMS 정보(DBMS마다 설정 내용이 조금씩 다름)
			// 오라클 - jdbc:oracle:thin:[@hostname][:port]:dbname
			
				conn = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			
		// 3. SQL 생성 (String)
			query = "INSERT INTO MEMBER VALUES('chuchu','1234qwer','춘향이',"
					+ "'F','20','chuchu@kh.com','01085207676','서울시 종로구','공부','"
					+new java.sql.Date(new java.util.Date().getTime()) +"')";
			// 생성된 쿼리문 확인
			System.out.println(query);
//			// 자바와 오라클 날짜처리(Date) 방법
//			java.util.Date dt = new java.util.Date();
//			System.out.println(dt); // Thu Dec 03 16:41:45 KST 2020
//			java.sql.Date sdt = new java.sql.Date(dt.getTime()); // 현재 날짜 알아와서 sql형식으로 바꿈
//			System.out.println(sdt);	// 2020-12-03
		
		// 4. SQL 전송(Statement) + // 5. 결과 받기(ResultSet | int)
			// 쿼리문을 전송하기 위한 Statement 객체 생성
			stmt = conn.createStatement();
			// 쿼리문 전송 후 결과값을 result 변수에 저장장
			result = stmt.executeUpdate(query);
			// 결과 확인
			System.out.println("결과 : "+result);
		} catch (SQLException e) {
				System.out.println("삽입 오류 발생 : 관리자에게 문의하세요.");
				//e.printStackTrace();
		} finally {
			// 6. 연결 닫기 (close)
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		
		
		
	}	

	// Statement : Insert2 (Member객체 사용)
	public void method02() {
		System.out.println("------- Statement : Insert2 (Member객체 사용) -------");
		Member mb = new Member(
				"mongmong","1q2w3e4r","몽룡이",'M',25,"mongmong@kh.com","01085205050",
				"서울시 강남구","게임",new java.sql.Date(new java.util.Date().getTime()));
		System.out.println(mb);

	// [JDBC 작업 순서]
		// 1. Driver 등록(DriverManager) - 생략 가능
		// 2. DBMS와 연결(Connection)
		// 3. SQL 생성(String)
		// 4. SQL 전송(Statement)
		// 5. 결과 받기(ResultSet | int)
		// 6. 연결 닫기(close)
		
	// DBMS와 연동하기 위한 참조변수 생성
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		int result  = 0;
		
		try {
			// 2. DBMS와 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			// 3. SQL 생성
			query = "INSERT INTO MEMBER VALUES('"+mb.getMemberId()+"','"+mb.getMemberPwd()
			+"','"+mb.getMemberName()+"','"+mb.getGender()+"','"+mb.getAge()+"','"+
					mb.getEmail()+"','"+mb.getPhone()+"','"+mb.getAddress()+"','"+mb.getHobby()+"','"+mb.getEnrollDate()+"')";
			System.out.println(query);
			
			// 4. SQL 전송 + 5. 결과 받기
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
			System.out.println("결과 : "+result);
			
		} catch (SQLException e) {
			System.out.println("삽입 오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	
	
	
	}

	// Statement : Update
	public void method03() {
		Member mb = new Member(
				"satosato","112233","사또",'M',
				26,"satosato@kh.com","01045454545","서울시 강서구","축구",new java.sql.Date(new java.util.Date().getTime()));
		System.out.println(mb);
		
	Connection conn = null;
	String query = null;
	Statement stmt = null;
	Statement stmt2 = null;
	
	int result = 0;
	int result2 = 0;
	try {
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
	
		query = "INSERT INTO MEMBER VALUES('"+mb.getMemberId()+"','"+mb.getMemberPwd()
		+"','"+mb.getMemberName()+"','"+mb.getGender()+"','"+mb.getAge()+"','"+
				mb.getEmail()+"','"+mb.getPhone()+"','"+mb.getAddress()+"','"+mb.getHobby()+"','"+mb.getEnrollDate()+"')";
		System.out.println(query);
		stmt = conn.createStatement();
		result = stmt.executeUpdate(query);
		System.out.println("INSERT 결과 : "+query);
		
		mb.setMemberPwd("qwer1234");
		query = "UPDATE MEMBER SET MEMBER_PWD = '"+mb.getMemberPwd()+"' WHERE MEMBER_ID ='"+mb.getMemberId()+"'";
		System.out.println(query);
		stmt2 = conn.createStatement();
		result2 = stmt2.executeUpdate(query);
		System.out.println("UPDATE 결과 : "+result2);
	
	} catch (SQLException e) {
		System.out.println("수정 오류 발생");
		e.printStackTrace();
	} finally {
		try {
			stmt2.close();
			stmt.close();
			conn.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	}
	
	// Statement : Delete
	public void method04() {
	
	Connection conn = null;
	String query = null;
	Statement stmt = null;
	int result = 0;
	
	try {
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
	
		query = "DELETE FROM MEMBER WHERE MEMBER_ID='satosato'"; 
		System.out.println(query);
		stmt = conn.createStatement();
		result = stmt.executeUpdate(query);
		System.out.println("결과  : "+result);
		
	} catch (SQLException e) {
		System.out.println("삭제 실패");
		e.printStackTrace();
	} finally {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
		
	}

	// Statement : Select
	public void method05() {
		System.out.println("------- Statement : Select -------");
		// 참조변수 생성
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		ResultSet rset = null; // Select문의 결과를 저장할 객체
				
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost"
					,"STUDENT","STUDENTPASS");
			query = "SELECT * FROM MEMBER";
			stmt = conn.createStatement();
			// Select 쿼리를 DBMS에 보내고 ResultSet형태의 결과를 받아와서 ResultSet참조변수에 저장
			rset = stmt.executeQuery(query);
			// 결과를 출력
			System.out.println("결과 : "+rset);
		
//		// 조회된 데이터 사용하기 1
//			// 커서 이동
//			rset.next();
//			// 컬럼명을 이용해서 데이터 사용(query문에서 별칭으로 조회해온 경우 반드시 별칭으로 확인해야 함)
//			System.out.println(rset.getString("MEMBER_NAME"));
//			// 컬럼 위치를 이용해서 데이터 사용
//			System.out.println(rset.getString(7));
//			// 현재 사용하고 있는 행 번호 조회
//			System.out.println("행번호 : "+rset.getRow());
//		
//		// 조회된 데이터 사용하기 2 - 여러 행을 조회한 경우 반복문을 이용해서 사용 가능
//			while(rset.next()) {
//				System.out.println("-------------------------------");
//				System.out.println("행번호 : "+rset.getRow());
//				System.out.println("아이디 : "+rset.getString("MEMBER_ID"));
//				System.out.println("이름 : "+rset.getString("MEMBER_NAME"));
//				System.out.println("성별 : "+rset.getString("GENDER"));
//				System.out.println("나이 : "+rset.getInt("AGE"));
//			}
			
//		// 조회된 데이터 사용하기 3 - 조회된 데이터를 객체에 담아서 사용(1개 데이터)	
//			// 주의할 것 !! 데이터 타입을 반드시 맞춰줘야 함 !!
//			rset.next();
//			// ResultSet에는 Char 타입이 없음 - <String객체>.charAt(0)
//			// 방법 1 : 매개변수 있는 생성자 활용
//			Member mb1 = new Member(
//					rset.getString("MEMBER_ID"), rset.getString("MEMBER_PWD"),
//					rset.getString("MEMBER_NAME"), rset.getString("GENDER").charAt(0),
//					rset.getInt("AGE"), rset.getString("EMAIL"),
//					rset.getString("PHONE"), rset.getString("ADDRESS"),
//					rset.getString("HOBBY"), rset.getDate("ENROLL_DATE"));
//			
//			System.out.println(mb1);
//			// 방법 2 : Setter 메소드 활용 
//			rset.next();
//			Member mb2 = new Member();
//			mb2.setMemberId(rset.getString("MEMBER_ID"));
//			mb2.setMemberPwd(rset.getString("MEMBER_PWD"));
//			mb2.setMemberName(rset.getString("MEMBER_NAME"));
//			mb2.setGender(rset.getString("GENDER").charAt(0));
//			mb2.setAge(rset.getInt("AGE"));
//			mb2.setEmail(rset.getString("EMAIL"));
//			mb2.setPhone(rset.getString("PHONE"));
//			mb2.setAddress(rset.getString("ADDRESS"));
//			mb2.setHobby(rset.getString("HOBBY"));
//			mb2.setEnrollDate(rset.getDate("ENROLL_DATE"));
//			System.out.println(mb2);
		
		// 조회된 데이터 사용하기 3 - 조회된 데이터를 객체에 담아서 사용(여러개 데이터)
			// 여러 데이터를 객체 담아서 사용하려면 여려개의 객체가 생성되어야 함
			// (하나의 객체로만 담으면 덮어쓰기가 됨)
			ArrayList<Member> list = new ArrayList<Member>();
			
			// 리스트에 담아줄 임시 Member 객체 생성
			while(rset.next()) {
			Member tmpMb = new Member();
			// 객체의 각 필드에 데이터 저장
			tmpMb.setMemberId(rset.getString("MEMBER_ID"));
			tmpMb.setMemberPwd(rset.getString("MEMBER_PWD"));
			tmpMb.setMemberName(rset.getString("MEMBER_NAME"));
			tmpMb.setGender(rset.getString("GENDER")==null? 0 : rset.getString("GENDER").charAt(0));
			tmpMb.setAge(rset.getInt("AGE"));
			tmpMb.setEmail(rset.getString("EMAIL"));
			tmpMb.setPhone(rset.getString("PHONE"));
			tmpMb.setAddress(rset.getString("ADDRESS"));
			tmpMb.setHobby(rset.getString("HOBBY"));
			tmpMb.setEnrollDate(rset.getDate("ENROLL_DATE"));
		
			// 객체를 리스트에 추가
			list.add(tmpMb);
		}
			
		// 리스트 전체 데이터 조회
			System.out.println("--------------------------------");
			System.out.println(list);

		// 리스트 내 각 객체 데이터 조회
			System.out.println("--------------------------------");
			for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+"번 인덱스 객체 : "+list.get(i));
			}
		
		// 리스트 내 각 객체의 필드 데이터 조회
			System.out.println("--------------------------------");
			for(int i=0; i<list.size(); i++) {
			System.out.println("### "+(i+1)+"번 회원 정보 ###");
			System.out.println("이름 : "+list.get(i).getMemberName());
			System.out.println("아이디 : "+list.get(i).getMemberId());
			System.out.println("연락처: "+list.get(i).getPhone());
			}
			
		
		
		} catch (SQLException e) {
		
			
			System.out.println("조회 오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// PreparedStatement
	public void method06() {
		System.out.println("------- PreparedStatement -------");
	// [JDBC 작업 순서]
		// 1. Driver 등록(DriverManager) - 생략가능
		// 2. DBMS 연결(Connection)
		// 3. SQL 생성(String) 
		//		- 미완성 SQL문 생성 : 미완성된 부분을 위치홀더(?)로 표현
		// 		- PreparedStatement 객체 생성 - 생성 시 미완성 SQL문을 저장
		//		- SQL문 완성 : PreparedStatement 객체를 이용해서 각 위치 홀더의 값을 지정
		// 4. SQL 전송(PreparedStatement)
		//		- 전송할 쿼리문을 별도로 지정할 필요 없음(이미 객체에 저장되어 있기 때문에)
		// 5. 결과 받기(ResultSet | int)
		// 6. 연결 닫기(close)
		
	// 참조변수 생성
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// 2. DBMS 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
					"STUDENT","STUDENTPASS");
			// 3. SQL 생성
				// 미완성된 SQL문 생성 - 미완성될 부분을 위치홀더(?)로 표현
				query = "INSERT INTO MEMBER(MEMBER_ID,MEMBER_PWD,MEMBER_NAME,AGE) VALUES(?,?,?,?)";
				// 미완성 SQL문을 담아 줄 PreparedStatement 객체 생성
				pstmt = conn.prepareStatement(query);
				// SQL문 완성 시키기!! - 전송하기 전에 반드시 완성시켜줘야 됨!!
					// PreparedStatement 객체의 set메소드를 이용해서 완성 시켜 줌
					// 입력 될 데이터 타입에 따라 set 메소드가 존재함
					// <PreparedStatement객체명>.set메소드 (위치홀더의 순서번호, 입력값);
				System.out.print("아이디 : ");
				pstmt.setString(1, sc.next());
				System.out.print("비밀번호 : ");
				pstmt.setString(2, sc.next());
				System.out.print("이름 : ");
				pstmt.setString(3, sc.next());
				System.out.print("나이 : ");
				pstmt.setInt(4, sc.nextInt());
				// 완성된 쿼리문을 보는 기능은 자체적으로 지원하지 않음
				
			// 4. SQL문 전송
				// 인자값으로 별도의 쿼리문을 전달할 필요가 없음
				result = pstmt.executeUpdate();
				System.out.println("결과 : "+result);
				
		} catch (SQLException e) {
			System.out.println("삽입 오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
			// 6. 연결 닫기
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	// JDBC 트랜젝션
	public void method07() {
		System.out.println("---------- JDBC 트랜젝션 ----------");
		// 트랜젝션 : 한번에 처리되어야 할 최소 작업 단위
		// TCL : COMMIT, ROLLBACK, SAVEPOINT <SP명>, ROLLBACK TO <SP명>
		// [JDBC 트랜젝션]
			// JDBC는 기본 AUTOCOMMIT이 설정되어 있음
			// Connection 객체를 이용해서 트랜젝션 제어 가능
			// AUTOCOMMIT 끄기
				// <Connection객체명>.setAutoCommit(false);
			// COMMIT
				// <Connection객체명>.commit();
			// ROLLBACK
				// <Connection객체명>.rollback();
	
	Connection conn = null;
	String query = null;
	Statement stmt = null;
	int result = 0;
	int result2 = 0;
	ResultSet rset = null;
	
	Scanner sc = new Scanner(System.in);
	try {
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
				"STUDENT","STUDENTPASS");
		conn.setAutoCommit(false);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();

		query = "INSERT INTO MEMBER(MEMBER_ID,MEMBER_PWD,MEMBER_NAME,AGE) VALUES('"
				+id+"','"+pw+"','"+name+"',"+age+")";
		stmt = conn.createStatement();
		result = stmt.executeUpdate(query);
		
		query = "UPDATE MEMBER SET GENDER = 'X' WHERE MEMBER_ID ='tester'";
		result2 = stmt.executeUpdate(query);
		
		System.out.println(result);
		System.out.println(result2);
		if(result > 0 && result2 > 0) {
			conn.commit();
		}else {
			conn.rollback();
		}
		
	} catch (SQLException e) {
		System.out.println("관리자에게 문의하세요");
		e.printStackTrace();
	}finally {
		try {
			//rset.close();
			stmt.close();
			conn.close();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}
	
}
	
	
	
	
}