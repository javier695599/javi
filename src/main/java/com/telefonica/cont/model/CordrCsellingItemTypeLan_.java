package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.729+0200")
@StaticMetamodel(CordrCsellingItemTypeLan.class)
public class CordrCsellingItemTypeLan_ {
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, String> ciylDsCsellingItemTypeLan;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, String> ciylNaCsellingItemTypeLan;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, CorddCsellingItemType> corddCsellingItemType;
    public static volatile SingularAttribute<CordrCsellingItemTypeLan, CordrCsellingItemTypeLanPK> id;
}
