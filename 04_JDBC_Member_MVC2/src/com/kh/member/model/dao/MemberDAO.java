package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.member.common.JDBCTemplate1;
import com.kh.member.common.JDBCTemplate2;
import com.kh.member.model.vo.Member;

// DB와 연동할 수 있는 클래스
public class MemberDAO {


	// 회원 등록
	public int insertMember(Connection conn, Member mb) {
						// DBMS 연결을 공통모듈로 사용해서 매개변수로 받아줌(서비스 모듈로 연결 제어)
		// 코드 내 Connection 생성 부분과 연결닫는 부분을 모두 지워줌
	
		// DB에 저장 
		String query = null;
		Statement stmt = null;
		int result = 0;
		

		try {
			query = "INSERT INTO MEMBER VALUES('"+mb.getMemberId()+"','"+mb.getMemberPwd()+"','"+mb.getMemberName()+"','"+
					mb.getGender()+"',"+mb.getAge()+",'"+mb.getEmail()+"','"+mb.getPhone()+"','"+mb.getAddress()+"','"
					+mb.getHobby()+"','"+mb.getEnrollDate()+"')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요~!");
			e.printStackTrace();
		} finally {
			try { 
				stmt.close(); 
			} catch (SQLException e) {
				System.out.println("오류발생 : 관리자에게 문의하세요~!");
				e.printStackTrace();
			}
		}
		return result;
	}
	
	

	// 회원 정보 수정
	public int updateMember(Member mb) {
		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		int result = 0;
		// 조회된 데이터가 없는 경우
		if(mb == null) {
			return result;
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			query = "UPDATE MEMBER SET MEMBER_PWD=?, GENDER=?, AGE=?, EMAIL=?, PHONE=?, ADDRESS=?, HOBBY=? WHERE MEMBER_ID=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mb.getMemberPwd());
			pstmt.setString(2, String.valueOf(mb.getGender()));	// gender는 단일문자여서 문자열 형태로 변환
			pstmt.setInt(3, mb.getAge());
			pstmt.setString(4, mb.getEmail());
			pstmt.setString(5, mb.getPhone());
			pstmt.setString(6, mb.getAddress());
			pstmt.setString(7, mb.getHobby());
			pstmt.setString(8, mb.getMemberId());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
			}
		}
			return result;
		}
	
	// 회원정보 삭제
	public int deleteMember(String id) {
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		int result = 0;
		
		if(id == null) {
			return result;
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
		
		query = "DELETE FROM MEMBER WHERE MEMBER_ID = '"+id+"'";
		stmt = conn.createStatement();
		result = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				stmt.close();
				conn.close();
		} catch (SQLException e2) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		}
	}	
		return result;
	}
	
	// 회원 목록 전체 조회
	public ArrayList<Member> searchMember() {
		ArrayList<Member> list = new ArrayList<Member>();
		
		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		ResultSet rset = null;
	
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			query = "SELECT * FROM MEMBER";
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
			// 리스트에 조회해온 데이터 저장
			while(rset.next()) {
			Member mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
					,(rset.getString(4)==null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
					,rset.getString(8),rset.getString(9),rset.getDate(10));
			list.add(mb);
			}	
		}catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류 발생 : 관리자에게 문의하세요");
			}
		}
		return list;
			
	}
	
	// 회원정보 조회(ID)
	public Member searchMemberId(String id) {
		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		// 조회해온 데이터를 저장할 Member 참조변수 생성 
			// 조회해온 데이터가 있을 때는 Member 객체를 만들어서 저장하고, 없을 때는 null
		Member mb = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				// 조회해 온 데이터 Member 객체에 저장
				mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
				,(rset.getString(4) == null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
						,rset.getString(8),rset.getString(9),rset.getDate(10));
			}

		}catch (SQLException e) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
			}
		}
		return mb;

	}
	
	// 회원정보 조회(Name)
	public ArrayList<Member> searchMemberName(String name) {
		// DB연결을 위한 참조변수
			Connection conn = null;
			String query = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			// 조회해 온 데이터를 저장해 줄 리스트 객체 생성
			ArrayList<Member> list = new ArrayList<Member>();
			
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
				// DB에서 아이디로 회원 조회
				query = "SELECT * FROM MEMBER WHERE MEMBER_NAME = ?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, name);
				rset = pstmt.executeQuery();

				// 조회해 온 데이터 Member 객체에 저장
				while(rset.next()) {
					Member mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
							,(rset.getString(4)==null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
							,rset.getString(8),rset.getString(9),rset.getDate(10));
					list.add(mb);
				}
			}catch (SQLException e) {
					System.out.println("오류발생 : 관리자에게 문의하세요");
				} finally {
					try {
						rset.close();
						pstmt.close();
						conn.close();
					} catch (SQLException e2) {
						System.out.println("오류발생 : 관리자에게 문의하세요");
					}
				}
			return list;
	}

	
	
	
	
}

