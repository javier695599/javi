package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.553+0200")
@StaticMetamodel(CorddCsellingType.class)
public class CorddCsellingType_ {
    public static volatile SingularAttribute<CorddCsellingType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingType, Long> bintIdCsellingType;
    public static volatile SingularAttribute<CorddCsellingType, Long> bstyIdBiSpecType;
    public static volatile SingularAttribute<CorddCsellingType, Long> cstiQuCsinteVersion;
    public static volatile SingularAttribute<CorddCsellingType, Date> cstyDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingType, Date> cstyDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingType, String> ctylDsCsellingTypeLang;
    public static volatile SingularAttribute<CorddCsellingType, String> ctylNaCsellingTypeLang;
    public static volatile SingularAttribute<CorddCsellingType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCsellingType, CorddCsellingItemType> corddCsellingItemTypes;
    public static volatile ListAttribute<CorddCsellingType, CorddCsellingRoleType> corddCsellingRoleTypes;
    public static volatile SingularAttribute<CorddCsellingType, CorddCsellingType> corddCsellingType;
    public static volatile ListAttribute<CorddCsellingType, CorddCsellingType> corddCsellingTypes;
    public static volatile ListAttribute<CorddCsellingType, CordpCustomerOrder> cordpCustomerOrders;
    public static volatile ListAttribute<CorddCsellingType, CordpCustomerSelling> cordpCustomerSellings;
    public static volatile ListAttribute<CorddCsellingType, CordrCsellingItemBiType> cordrCsellingItemBiTypes;
    public static volatile ListAttribute<CorddCsellingType, CordrCsellingRelaType> cordrCsellingRelaTypes1;
    public static volatile ListAttribute<CorddCsellingType, CordrCsellingRelaType> cordrCsellingRelaTypes2;
    public static volatile ListAttribute<CorddCsellingType, CordrCsellingStateRela> cordrCsellingStateRelas;
    public static volatile ListAttribute<CorddCsellingType, CordrCsellingTypeLang> cordrCsellingTypeLangs;
    public static volatile ListAttribute<CorddCsellingType, CordrCsellingVersionType> cordrCsellingVersionTypes;
}
