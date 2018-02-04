package team.LeboyOA.common.pojos;

public class Manager {

	private int id;
	
	private String uuid = null;
	
	private String user = null;
	
	private String pwd = null;
	
	private String position = null;
	
	private String belong_dep_uuid = null;
	
	// 登录用户等级
	public Integer level = null;

	// 系统中用户最小等级
	public Integer lowestLevel = null;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getLowestLevel() {
		return lowestLevel;
	}

	public void setLowestLevel(Integer lowestLevel) {
		this.lowestLevel = lowestLevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBelong_dep_uuid() {
		return belong_dep_uuid;
	}

	public void setBelong_dep_uuid(String belong_dep_uuid) {
		this.belong_dep_uuid = belong_dep_uuid;
	}
	
}
