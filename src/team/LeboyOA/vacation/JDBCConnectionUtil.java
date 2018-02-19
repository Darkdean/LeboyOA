package team.LeboyOA.vacation;

public class JDBCConnectionUtil {
	
	private JDBCConnectionUtil() {};
	
	private JDBCConnectionUtil connectionUtil;
	
	public JDBCConnectionUtil getInstance() {
		if(connectionUtil==null) {
			connectionUtil = new JDBCConnectionUtil();
		}
		return connectionUtil;
	}

}
