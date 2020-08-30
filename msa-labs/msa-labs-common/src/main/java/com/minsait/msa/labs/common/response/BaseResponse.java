package com.minsait.msa.labs.common.response;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class BaseResponse<T extends Serializable> implements Serializable {

	private static final transient long serialVersionUID = -1217998503200320759L;
	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property ="@class")
	private Class<T> entityClass;
	private ResponseInfo responseInfo;
	private T data;
	
	public BaseResponse() {
		super();
	}
	@JsonCreator
	@SuppressWarnings("unchecked")
	public BaseResponse(T data) {
		this();
		this.entityClass = (Class<T>) ((data != null) ? data.getClass() : null);
		this.data = data;
	}

}