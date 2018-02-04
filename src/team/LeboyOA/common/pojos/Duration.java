package team.LeboyOA.common.pojos;
//用于接收部门审核时间与等级对应信息的类

public class Duration {
	private String depId = null;
	private String minDuration = "0";
	private String maxDuration = "0";
	private Integer examineLevel = null;
	private String depName = null;
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getMinDuration() {
		return minDuration;
	}
	public void setMinDuration(String minDuration) {
		this.minDuration = minDuration;
	}
	public String getMaxDuration() {
		return maxDuration;
	}
	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}
	public Integer getExamineLevel() {
		return examineLevel;
	}
	public void setExamineLevel(Integer examineLevel) {
		this.examineLevel = examineLevel;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	

}
