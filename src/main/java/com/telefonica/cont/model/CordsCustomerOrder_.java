package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.101+0200")
@StaticMetamodel(CordsCustomerOrder.class)
public class CordsCustomerOrder_ {
    public static volatile SingularAttribute<CordsCustomerOrder, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCustomerOrder, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCustomerOrder, Long> bintIdCustOrderType;
    public static volatile SingularAttribute<CordsCustomerOrder, Long> bispIdBusinessInteSpecCat;
    public static volatile SingularAttribute<CordsCustomerOrder, BigDecimal> buinIdCustomerOrder;
    public static volatile SingularAttribute<CordsCustomerOrder, Timestamp> buinTiCustOrderClose;
    public static volatile SingularAttribute<CordsCustomerOrder, Date> cordDaCustOrderDue;
    public static volatile SingularAttribute<CordsCustomerOrder, Long> cordNuCustOrderPriority;
    public static volatile SingularAttribute<CordsCustomerOrder, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCustomerOrder, BigDecimal> userIdUpdaterParty;
}
