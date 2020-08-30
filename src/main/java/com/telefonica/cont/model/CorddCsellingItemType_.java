package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.529+0200")
@StaticMetamodel(CorddCsellingItemType.class)
public class CorddCsellingItemType_ {
    public static volatile SingularAttribute<CorddCsellingItemType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingItemType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingItemType, String> ciylDsCsellingItemTypeLan;
    public static volatile SingularAttribute<CorddCsellingItemType, String> ciylNaCsellingItemTypeLan;
    public static volatile SingularAttribute<CorddCsellingItemType, Date> csitDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingItemType, Date> csitDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingItemType, Long> csitIdCsellingItemType;
    public static volatile SingularAttribute<CorddCsellingItemType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingItemType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CorddCsellingItemType, CorddCsellingType> corddCsellingType;
    public static volatile ListAttribute<CorddCsellingItemType, CordpCustomerSellingItem> cordpCustomerSellingItems;
    public static volatile ListAttribute<CorddCsellingItemType, CordrCsellingItemBiType> cordrCsellingItemBiTypes;
    public static volatile ListAttribute<CorddCsellingItemType, CordrCsellingItemTypeLan> cordrCsellingItemTypeLans;
    public static volatile ListAttribute<CorddCsellingItemType, CordrCsitemDateType> cordrCsitemDateTypes;
    public static volatile ListAttribute<CorddCsellingItemType, CordrCsitemRelaType> cordrCsitemRelaTypes1;
    public static volatile ListAttribute<CorddCsellingItemType, CordrCsitemRelaType> cordrCsitemRelaTypes2;
    public static volatile ListAttribute<CorddCsellingItemType, CordrCsitemTypeAssoc> cordrCsitemTypeAssocs;
}
