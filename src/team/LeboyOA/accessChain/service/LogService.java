package team.LeboyOA.accessChain.service;

import team.LeboyOA.common.handle.Parameter;

public interface LogService {
	
	public int addSystemLog(Parameter parameter);
	
	public int addExceptionLog(Parameter parameter);
}
