package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.054+0200")
@StaticMetamodel(CordsCsellingRelaIn.class)
public class CordsCsellingRelaIn_ {
    public static volatile SingularAttribute<CordsCsellingRelaIn, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingRelaIn, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingRelaIn, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CordsCsellingRelaIn, Long> bintIdCsellingTypeRe;
    public static volatile SingularAttribute<CordsCsellingRelaIn, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordsCsellingRelaIn, BigDecimal> buinIdCustomerSellingRe;
    public static volatile SingularAttribute<CordsCsellingRelaIn, Date> csrsDaEndValidity;
    public static volatile SingularAttribute<CordsCsellingRelaIn, Date> csrsDaStartValidity;
    public static volatile SingularAttribute<CordsCsellingRelaIn, BigDecimal> csrsIdCsellingRelaIn;
    public static volatile SingularAttribute<CordsCsellingRelaIn, Long> csrtIdCsellingRelaType;
    public static volatile SingularAttribute<CordsCsellingRelaIn, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingRelaIn, BigDecimal> userIdUpdaterParty;
}
