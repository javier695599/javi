package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.698+0200")
@StaticMetamodel(CordrCsellingItemBiType.class)
public class CordrCsellingItemBiType_ {
    public static volatile SingularAttribute<CordrCsellingItemBiType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingItemBiType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingItemBiType, Long> biasIdCsellingItemBiType;
    public static volatile SingularAttribute<CordrCsellingItemBiType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingItemBiType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingItemBiType, CorddCsellingItemType> corddCsellingItemType;
    public static volatile SingularAttribute<CordrCsellingItemBiType, CorddCsellingType> corddCsellingType;
    public static volatile ListAttribute<CordrCsellingItemBiType, CordrCsellingItemBiAssoc> cordrCsellingItemBiAssocs;
}
