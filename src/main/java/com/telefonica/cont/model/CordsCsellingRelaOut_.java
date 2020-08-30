package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.070+0200")
@StaticMetamodel(CordsCsellingRelaOut.class)
public class CordsCsellingRelaOut_ {
    public static volatile SingularAttribute<CordsCsellingRelaOut, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordsCsellingRelaOut, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordsCsellingRelaOut, Long> bintIdBusinessInteracType;
    public static volatile SingularAttribute<CordsCsellingRelaOut, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CordsCsellingRelaOut, BigDecimal> buinIdBusinessInterac;
    public static volatile SingularAttribute<CordsCsellingRelaOut, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<CordsCsellingRelaOut, Date> csroDaEndValidity;
    public static volatile SingularAttribute<CordsCsellingRelaOut, Date> csroDaStartValidity;
    public static volatile SingularAttribute<CordsCsellingRelaOut, BigDecimal> csroIdCsellingRelaOut;
    public static volatile SingularAttribute<CordsCsellingRelaOut, Long> csrtIdCsellingRelaType;
    public static volatile SingularAttribute<CordsCsellingRelaOut, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordsCsellingRelaOut, BigDecimal> userIdUpdaterParty;
}
