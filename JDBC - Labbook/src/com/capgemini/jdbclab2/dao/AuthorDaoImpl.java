package com.capgemini.jdbclab2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.jdbclab2.entities.Author;
import com.capgemini.jdbclab2.util.MyDBConnection;

public class AuthorDaoImpl implements AuthorDao {
	Connection con=MyDBConnection.getConnection();
	@Override
	public String insertAuthor(Author a) {
		try {
	//		Statement stat=con.createStatement();
		//    ResultSet rs=stat.executeQuery("select authorid.nextval from dual");
			//rs.next();
//			long aid=rs.getLong(1);
//			ResultSet rs1=stat.executeQuery("select isbn.nextval from dual;");
//			rs1.next();
//			long isbn=rs1.getLong(1);
			PreparedStatement ps=con.prepareStatement("insert into author values(?,?,?,?,?)");
			ps.setString(1,a.getAuthorId());
			ps.setString(2,a.getFirstName());
			ps.setString(3,a.getMiddleName());
			ps.setString(4,a.getLastName());
			ps.setLong(5,a.getPhoneNo());
			int s=ps.executeUpdate();
			if(s>0) 
				return "Author created! ";
			else
				return "Author Not Created!";
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return "Author not created";
		}
	}
	@Override
	public String updateAuthor(String a,double price) {
		try {	
			PreparedStatement ps=con.prepareStatement("update book set price=? where isbn=(select isbn from book_author where authorid=(select authorid from author where firstname=?))");
			ps.setDouble(1, price);
			ps.setString(2, a);
			int x=ps.executeUpdate();
			if(x>0) {
				return "price updated";
			}
			else {
				return "price not updated"; 
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return "price not updated";
		}
	}
	@Override
	public String deleteAuthor(String authorId) {
		try {
			PreparedStatement ps=con.prepareStatement("delete from author where authorId=?");
			ps.setString(1, authorId);
			int d=ps.executeUpdate();
			if (d > 0) {
			    return "Author was deleted successfully!";
			}
			else {
				return "Author not deleted";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return "Author not deleted";
		}
		
	}
	@Override
	public Author findAuthor(String authorId) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from author where authorid=?");
			ps.setString(1, authorId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Author a=new Author();
				a.setAuthorId(rs.getString(1));
				a.setFirstName(rs.getString(2));
				a.setMiddleName(rs.getString(3));
				a.setLastName(rs.getString(4));
				a.setPhoneNo(rs.getLong(5));
				return a;
			}
			else
			{
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<String> displayAuthorId() {
		List<String> authorIds = new ArrayList<String>() ;
		try {
			Statement stmt = con.createStatement();
			String sql = "select authorId from author";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				authorIds.add(rs.getString(1));
			}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return authorIds;
	}
}
