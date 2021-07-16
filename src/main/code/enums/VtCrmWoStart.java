package com.inhe.crm.vt;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VtCrmWoStart {

	private String orgId;
	
	private String deptId;
	//T 启动流程必传的业务类型
	private String woType;

	private String startUser;
	//描述
	private String description;
	//附加参数
	private Map<String, Object> variables;
	//备注
    private String remark;
}
