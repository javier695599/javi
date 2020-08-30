package com.minsait.msa.labs.common.request;
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
public class BaseRequest<T extends Serializable> implements Serializable {

private static final transient long serialVersionUID = 7041180356803356676L;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property ="@class")
private Class<T> entityClass;
	private T data;
	public BaseRequest() {
	super();
 }
@JsonCreator
@SuppressWarnings("unchecked")
public BaseRequest(T data) {
 this();
this.entityClass = (Class<T>) ((data != null) ? data.getClass() : null);
this.data = data;
}
 }