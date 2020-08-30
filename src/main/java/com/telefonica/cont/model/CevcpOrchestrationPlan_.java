package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.253+0200")
@StaticMetamodel(CevcpOrchestrationPlan.class)
public class CevcpOrchestrationPlan_ {
    public static volatile SingularAttribute<CevcpOrchestrationPlan, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcpOrchestrationPlan, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcpOrchestrationPlan, BigDecimal> orplIdOrchestrationPlan;
    public static volatile SingularAttribute<CevcpOrchestrationPlan, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcpOrchestrationPlan, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcpOrchestrationPlan, CevcaOplanStatusMove> cevcaOplanStatusMoves;
    public static volatile ListAttribute<CevcpOrchestrationPlan, CevcpOplanElement> cevcpOplanElements;
    public static volatile SingularAttribute<CevcpOrchestrationPlan, CordpCustomerOrder> cordpCustomerOrder;
}
