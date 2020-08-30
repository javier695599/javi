package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.754+0200")
@StaticMetamodel(CordrCsellingRelaIn.class)
public class CordrCsellingRelaIn_ {
    public static volatile SingularAttribute<CordrCsellingRelaIn, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingRelaIn, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingRelaIn, Date> csrsDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingRelaIn, Date> csrsDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingRelaIn, BigDecimal> csrsIdCsellingRelaIn;
    public static volatile SingularAttribute<CordrCsellingRelaIn, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingRelaIn, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingRelaIn, CordpCustomerSelling> cordpCustomerSelling1;
    public static volatile SingularAttribute<CordrCsellingRelaIn, CordpCustomerSelling> cordpCustomerSelling2;
    public static volatile SingularAttribute<CordrCsellingRelaIn, CordrCsellingRelaType> cordrCsellingRelaType;
}
