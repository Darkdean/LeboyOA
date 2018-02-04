package team.LeboyOA.common.pojos;

public class Students {
	
	private String uuid;
	private String name;
	private int    sex;
	private String id_number;
	private String belong_dep_uuid;
	private String photo_url;
	private String code;
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getBelong_dep_uuid() {
		return belong_dep_uuid;
	}
	public void setBelong_dep_uuid(String belong_dep_uuid) {
		this.belong_dep_uuid = belong_dep_uuid;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
