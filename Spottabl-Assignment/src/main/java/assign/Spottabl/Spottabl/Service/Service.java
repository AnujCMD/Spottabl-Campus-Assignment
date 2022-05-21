package assign.Spottabl.Spottabl.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

//import org.springframework.data.jdbc.repository.query.Query;


public class Service {
	private String Code;

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}
	//-------Spottabl
	public String userOnSpottabl() {
		String str1 = "";
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count(email) as FlexMoney From registrations Where email LIKE '%Spottabl.com' AND email LIKE 'user%'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);
	   return "";
	    }
	}
	public String userInvitedFromSpottabl() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as 'Number of users invited from spottabl' From clientuserinvites WHERE inviter LIKE '%spottabl.com' AND email Like '%Spottabl.com' AND email Like 'user%'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);}
	    return "";
	}
	public String userAcceptedInvite() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as 'Number of users accepted Invited' From clientuserinvites WHERE accepted= 'TRUE' AND email Like '%Spottabl.com' AND email Like 'user%'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);}
	    return "";
	}
	public String userInvitedFromSpottablUser() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as 'Number of users inviter from spottabl user' From clientuserinvites WHERE inviter LIKE 'user%' AND (inviter Like '%Spottabl.com') AND (email Like '%Spottabl.com') AND (email Like 'user%')";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);}
	    return "";
	}
	// -------Flexmoney
	public String flexUserOnSpottabl() {
		String str1 = "";
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as FlexMoney From registrations Where email LIKE '%flexmoney.in' AND email LIKE 'user%'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);
	   return "";
	    }
	}
	public String flexUserInvitedFromSpottabl() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as 'Number of users invited from spottabl' From clientuserinvites WHERE inviter LIKE '%spottabl.com' AND email Like '%flexmoney.in' AND email Like 'user%'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);}
	    return "";
	}
	public String flexUserAcceptedInvite() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as 'Number of users accepted Invited' From clientuserinvites WHERE accepted= 'TRUE' AND email Like '%flexmoney.in' AND email Like 'user%'";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);}
	    return "";
	}
	public String flexUserInvitedFromSpottablUser() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Spottabl","root","root");
	        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        String sql = "Select Count( DISTINCT email) as 'Number of users inviter from spottabl user' From clientuserinvites WHERE inviter LIKE 'user%' AND (inviter Like '%Spottabl.com') AND (email Like '%flexmoney') AND (email Like 'user%')";
	        ResultSet rs = stmt.executeQuery(sql);
	        rs.absolute(1);
	        String str = rs.getString(1);
	        con.close();
	        return str;
	    } catch(Exception e){ System.out.println(e);}
	    return "";
	}
	
	
	
//	@Query("Select Count( DISTINCT email) as 'Number of users invited from spottabl' From clientuserinvites WHERE inviter LIKE '%spottabl.com'", nativeQuery = true)
//	public
//	List<Integer> userInvitedFromSpottabl() {
//		return null;
//	}
//	@Query("Select Count(email) as FlexMoney From registrations Where email LIKE '%flexmoney.in'")
//	public
//	List<Integer> userOnSpottabl() {
//		return null;
//	}
//	@Query("Select Count( DISTINCT email) as 'Number of users accepted Invited' From clientuserinvites WHERE accepted= 'TRUE' AND email Like '%flexmoney.in'")
//	public
//	List<Integer> userAcceptedInvite() {
//		return null;
//	}
//	@Query("Select Count( DISTINCT email) as 'Number of users inviter from spottabl user' From clientuserinvites WHERE inviter LIKE 'user%' AND (inviter Like '%flexmoney.in')")
//	public
//	List<Integer> userInvitedFromSpottablUser() {
//		return null;
	}	

