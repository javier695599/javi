package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.523+0200")
@StaticMetamodel(CuinpPortabilityRequest.class)
public class CuinpPortabilityRequest_ {
    public static volatile SingularAttribute<CuinpPortabilityRequest, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CuinpPortabilityRequest, String> buinCoCustomerOrder;
    public static volatile SingularAttribute<CuinpPortabilityRequest, String> buinCoCustomerQuote;
    public static volatile SingularAttribute<CuinpPortabilityRequest, BigDecimal> buinIdCustomerInquiry;
    public static volatile SingularAttribute<CuinpPortabilityRequest, BigDecimal> buinIdCustomerOrder;
    public static volatile SingularAttribute<CuinpPortabilityRequest, BigDecimal> buinIdCustomerQuote;
    public static volatile SingularAttribute<CuinpPortabilityRequest, BigDecimal> buinIdSpPortaOrder;
    public static volatile SingularAttribute<CuinpPortabilityRequest, BigDecimal> paroIdCustomer;
    public static volatile SingularAttribute<CuinpPortabilityRequest, Long> poreIdPortabilityRequest;
    public static volatile SingularAttribute<CuinpPortabilityRequest, Long> poreInCounter;
    public static volatile SingularAttribute<CuinpPortabilityRequest, Long> portIdPortabilProcessType;
    public static volatile SingularAttribute<CuinpPortabilityRequest, String> rsidDsValue;
    public static volatile SingularAttribute<CuinpPortabilityRequest, Timestamp> scheTiItemDeadline;
    public static volatile SingularAttribute<CuinpPortabilityRequest, Timestamp> scheTiPortaDateREnd;
    public static volatile SingularAttribute<CuinpPortabilityRequest, Timestamp> scheTiPortaDateRStart;
    public static volatile ListAttribute<CuinpPortabilityRequest, CuinaPortaReqHasStep> cuinaPortaReqHasSteps;
    public static volatile SingularAttribute<CuinpPortabilityRequest, CuindPortabilityReqStatus> cuindPortabilityReqStatus;
}
