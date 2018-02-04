package team.LeboyOA.common.pojos;

//审核类
public class Examine {
	
	private String vacation_uuid;
	private int    dep_level = -100;
	private int    status = -100;
	private String manager_user;
	private String time;
	private String reason;
	//private Integer examineStatus = null;
	
//	public Integer getExamineStatu() {
//		return examineStatus;
//	}
//	public void setExamineStatu(Integer examineStatus) {
//		this.examineStatus = examineStatus;
//	}
	public String getVacation_uuid() {
		return vacation_uuid;
	}
	public void setVacation_uuid(String vacation_uuid) {
		this.vacation_uuid = vacation_uuid;
	}
	public int getDep_level() {
		return dep_level;
	}
	public void setDep_level(int dep_level) {
		this.dep_level = dep_level;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getManager_user() {
		return manager_user;
	}
	public void setManager_user(String manager_user) {
		this.manager_user = manager_user;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
