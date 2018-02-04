package team.LeboyOA.common.pojos;

public class StudentCondition {
	
	//当前查看学员请假信息的管理员等级
	private Integer level = null;
	//学员所属部门
	private String depUuid = null;
	//学员姓名
	private String name = null;
	//学员请假理由
	private String reason = null;
	//请假状态
	private Integer status = null;
	
	/** 查询起始页数*/
	private Integer commstart = 0;
	/** 查询页大小 */
	private Integer commnum = 10;
	
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getCommstart() {
		return commstart;
	}
	public void setCommstart(Integer commstart) {
		this.commstart = commstart;
	}
	public Integer getCommnum() {
		return commnum;
	}
	public void setCommnum(Integer commnum) {
		this.commnum = commnum;
	}
	public String getDepUuid() {
		return depUuid;
	}
	public void setDepUuid(String depUuid) {
		this.depUuid = depUuid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
