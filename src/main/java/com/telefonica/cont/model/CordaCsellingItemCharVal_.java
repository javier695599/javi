package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.440+0200")
@StaticMetamodel(CordaCsellingItemCharVal.class)
public class CordaCsellingItemCharVal_ {
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Long> cchaIdCsellingCharac;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Long> cchvIdCsellingCharacValue;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Date> cscvDaEndValidity;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Date> cscvDaStartValidity;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, String> cscvDsCsellingValue;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, Long> cscvIdCsellingItemCharVal;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordaCsellingItemCharVal, CordpCustomerSellingItem> cordpCustomerSellingItem;
}
