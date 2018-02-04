package team.LeboyOA.common.handle;

import java.io.InputStream;
import java.util.Properties;

import team.LeboyOA.common.utils.IDWorker;

public class Config{
	
	public static long workId;
	
	public static long dataCenterId;
	
	public static IDWorker idWorker;
	
	public void init(){
		
		//ID生成器
		initIDWorker();
	}	

	public static void initIDWorker(){
		Properties properties = new Properties();
		InputStream inputStream = Config.class.getClassLoader().getResourceAsStream("/dbconfig.properties");
		try {
			properties.load(inputStream);
			workId = Integer.parseInt(properties.getProperty("id.work"));
			dataCenterId = Integer.parseInt(properties.getProperty("id.datacenter"));
			idWorker = new IDWorker(workId, dataCenterId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static long getID(){
		if (idWorker == null) {
			initIDWorker();
		}
		return idWorker.nextId();
	}
}
