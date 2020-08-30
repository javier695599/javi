package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.604+0200")
@StaticMetamodel(CordpCustomerOrder.class)
public class CordpCustomerOrder_ {
    public static volatile SingularAttribute<CordpCustomerOrder, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpCustomerOrder, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpCustomerOrder, Long> bispIdBusinessInteSpecCat;
    public static volatile SingularAttribute<CordpCustomerOrder, BigDecimal> buinIdCustomerOrder;
    public static volatile SingularAttribute<CordpCustomerOrder, Timestamp> buinTiCustOrderClose;
    public static volatile SingularAttribute<CordpCustomerOrder, Date> cordDaCustOrderDue;
    public static volatile SingularAttribute<CordpCustomerOrder, Long> cordNuCustOrderPriority;
    public static volatile SingularAttribute<CordpCustomerOrder, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpCustomerOrder, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CordpCustomerOrder, CevcpOrchestrationPlan> cevcpOrchestrationPlans;
	public static volatile SingularAttribute<CordpCustomerOrder, CordaLockingLog> cordaLockingLog;
    public static volatile SingularAttribute<CordpCustomerOrder, CorddCsellingType> corddCsellingType;
    public static volatile ListAttribute<CordpCustomerOrder, CordpCustomerOrderItem> cordpCustomerOrderItems;
    public static volatile SingularAttribute<CordpCustomerOrder, CordpCustomerSelling> cordpCustomerSelling;
    public static volatile SingularAttribute<CordpCustomerOrder, CordrCorderLegacyRestReq> cordrCorderLegacyRestReq;
    public static volatile ListAttribute<CordpCustomerOrder, CordrCorderLocation> cordrCorderLocations;
}
