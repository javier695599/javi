package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.914+0200")
@StaticMetamodel(CordrCsitemRelaType.class)
public class CordrCsitemRelaType_ {
    public static volatile SingularAttribute<CordrCsitemRelaType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemRelaType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemRelaType, Long> biirIdBiSpecItemRel;
    public static volatile SingularAttribute<CordrCsitemRelaType, Date> cirtDaEndValidity;
    public static volatile SingularAttribute<CordrCsitemRelaType, Date> cirtDaStartValidity;
    public static volatile SingularAttribute<CordrCsitemRelaType, String> cirtDsCsitemRelaType;
    public static volatile SingularAttribute<CordrCsitemRelaType, Long> cirtIdCsitemRelaType;
    public static volatile SingularAttribute<CordrCsitemRelaType, String> cirtNaCsitemRelaType;
    public static volatile SingularAttribute<CordrCsitemRelaType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemRelaType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsitemRelaType, CorddCsellingItemType> corddCsellingItemType1;
    public static volatile SingularAttribute<CordrCsitemRelaType, CorddCsellingItemType> corddCsellingItemType2;
    public static volatile ListAttribute<CordrCsitemRelaType, CordrCsellingItemRelaIn> cordrCsellingItemRelaIns;
    public static volatile ListAttribute<CordrCsitemRelaType, CordrCsellingItemRelaOut> cordrCsellingItemRelaOuts;
    public static volatile ListAttribute<CordrCsitemRelaType, CordrCsitemRelaTypeLang> cordrCsitemRelaTypeLangs;
}
