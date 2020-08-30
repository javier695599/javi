package com.minsait.msa.labs.common.response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
@Data
public class ResponseInfo implements Serializable {

private static final transient long serialVersionUID = -7633083846359999349L;
private String code;
private String description;
private Map<String, String> additionalInformation = new HashMap<>();
}