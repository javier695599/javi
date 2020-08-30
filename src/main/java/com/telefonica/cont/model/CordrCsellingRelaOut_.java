package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.758+0200")
@StaticMetamodel(CordrCsellingRelaOut.class)
public class CordrCsellingRelaOut_ {
    public static volatile SingularAttribute<CordrCsellingRelaOut, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingRelaOut, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingRelaOut, BigDecimal> buinIdBusinessInterac;
    public static volatile SingularAttribute<CordrCsellingRelaOut, Date> csroDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingRelaOut, Date> csroDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingRelaOut, BigDecimal> csroIdCsellingRelaOut;
    public static volatile SingularAttribute<CordrCsellingRelaOut, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingRelaOut, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingRelaOut, CordpCustomerSelling> cordpCustomerSelling;
    public static volatile SingularAttribute<CordrCsellingRelaOut, CordrCsellingRelaType> cordrCsellingRelaType;
}
