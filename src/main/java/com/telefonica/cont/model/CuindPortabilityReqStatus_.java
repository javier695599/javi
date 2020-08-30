package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.492+0200")
@StaticMetamodel(CuindPortabilityReqStatus.class)
public class CuindPortabilityReqStatus_ {
    public static volatile SingularAttribute<CuindPortabilityReqStatus, Long> prstIdPortReqStatus;
    public static volatile SingularAttribute<CuindPortabilityReqStatus, String> prstNaPorReqStatus;
    public static volatile ListAttribute<CuindPortabilityReqStatus, CuinpPortabilityRequest> cuinpPortabilityRequests;
}
