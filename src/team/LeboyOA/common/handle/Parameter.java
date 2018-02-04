package team.LeboyOA.common.handle;

import java.util.HashMap;
import java.util.Map;

public class Parameter {

	/** 存放条件查询值 */
	private Map<String, String> para = new HashMap<String, String>();
	
	/** 参数字符串数组 */
	private Map<String, String[]> paraArray = new HashMap<String, String[]>();
	
	/** 参数字符串数组 */
	private Map<String, Object> result = new HashMap<String, Object>();

	/** 返回ID */
	private int id;

	/** 协议内容 */
	private String content;

	/** 查询开始记录位置 */
	private Integer commstart = 0;

	/** 查询页大小 */
	private Integer commnum = 14;
	
	/** 查询数据总数 */
	private Integer comcount = 0;
	
	public Parameter(){
		this.result.put("msg", "bad");
	}
	
	public Map<String, String> getPara() {
		return para;
	}

	public void setPara(Map<String, String> para) {
		this.para = para;
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

	public void put(String _para, String _val) {
		this.para.put(_para, _val);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, String[]> getParaArray() {
		return paraArray;
	}

	public void setParaArray(Map<String, String[]> paraArray) {
		this.paraArray = paraArray;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getComcount() {
		return comcount;
	}

	public void setComcount(Integer comcount) {
		this.comcount = comcount;
	}

	public Map<String, Object> getResult() {
		clearParameter();
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	
	public void goodResult(){
		this.result.put("msg", "good");
	}
	
	public void clearParameter(){
		if (this.para != null) {
			this.para = null;
		}
		if (this.paraArray != null) {
			this.paraArray = null;
		}
		if (this.content != null) {
			this.content = null;
		}
	}

}
