package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String ip = "127.0.0.1";
	private static int port = 3306;
	private static String database = "hutubill";
	private static String defaultcharset = "UTF-8";
	private static String loginuser = "root";
	private static String password = "wdx1993125";
	//������ʱ�;�̬��������
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		String url =String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip,port,database,defaultcharset);
		return DriverManager.getConnection(url, loginuser, password);
	}
	
}
