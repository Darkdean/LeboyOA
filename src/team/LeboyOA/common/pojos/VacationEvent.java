package team.LeboyOA.common.pojos;

public class VacationEvent {
	private String uuid;
	
	private String manager_user;
	
	private String stu_uuid;
	
	private String duration = null;
	
	private String reason = null;
	
	private Integer examine_level = null;
	
	private String registration_time;
	
	private Integer status = null;
	
	private String leave_time = null;
	
	private String back_time = null;
	
	private String actual_leave_time = null;
	
	private String actual_back_time = null;
	
	private String stu_belong_dep_uuid = null;
	
	private String student_name = null;
	
	private String department_name = null;
	
	public String getManager_user() {
		return manager_user;
	}
	public void setManager_user(String manager_user) {
		this.manager_user = manager_user;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStu_belong_dep_uuid() {
		return stu_belong_dep_uuid;
	}
	public void setStu_belong_dep_uuid(String stu_belong_dep_uuid) {
		this.stu_belong_dep_uuid = stu_belong_dep_uuid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getStu_uuid() {
		return stu_uuid;
	}
	public void setStu_uuid(String stu_uuid) {
		this.stu_uuid = stu_uuid;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getExamine_level() {
		return examine_level;
	}
	public void setExamine_level(Integer examine_level) {
		this.examine_level = examine_level;
	}
	public String getRegistration_time() {
		return registration_time;
	}
	public void setRegistration_time(String registration_time) {
		this.registration_time = registration_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getLeave_time() {
		return leave_time;
	}
	public void setLeave_time(String leave_time) {
		if(leave_time == null || leave_time.equals("")){
			this.leave_time = "";
		}else{
			this.leave_time = leave_time;
		}
	}
	public String getBack_time() {
		return back_time;
	}
	public void setBack_time(String back_time) {
		if(back_time == null || back_time.equals("")){
			this.back_time = "";
		}else{
			this.back_time = back_time;
		}	
	}
	public String getActual_leave_time() {
		return actual_leave_time;
	}
	public void setActual_leave_time(String actual_leave_time) {
		this.actual_leave_time = actual_leave_time;
	}
	public String getActual_back_time() {
		return actual_back_time;
	}
	public void setActual_back_time(String actual_back_time) {
		this.actual_back_time = actual_back_time;
	}
	

}
