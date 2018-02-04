package team.LeboyOA.common.pojos;

public class Department {
	
	String uuid = null;
	String name = null;
	Integer level = null;
	String parent_dep_uuid = null;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getParent_dep_uuid() {
		return parent_dep_uuid;
	}
	public void setParent_dep_uuid(String parent_dep_uuid) {
		this.parent_dep_uuid = parent_dep_uuid;
	}
	

}
