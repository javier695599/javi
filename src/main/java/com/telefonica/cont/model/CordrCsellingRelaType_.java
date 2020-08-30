package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.804+0200")
@StaticMetamodel(CordrCsellingRelaType.class)
public class CordrCsellingRelaType_ {
    public static volatile SingularAttribute<CordrCsellingRelaType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingRelaType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingRelaType, Date> csrtDaEndValidity;
    public static volatile SingularAttribute<CordrCsellingRelaType, Date> csrtDaStartValidity;
    public static volatile SingularAttribute<CordrCsellingRelaType, String> csrtDsCsellingRelaType;
    public static volatile SingularAttribute<CordrCsellingRelaType, Long> csrtIdCsellingRelaType;
    public static volatile SingularAttribute<CordrCsellingRelaType, String> csrtNaCsellingRelaType;
    public static volatile SingularAttribute<CordrCsellingRelaType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingRelaType, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingRelaType, CorddCsellingType> corddCsellingType1;
    public static volatile SingularAttribute<CordrCsellingRelaType, CorddCsellingType> corddCsellingType2;
    public static volatile ListAttribute<CordrCsellingRelaType, CordrCsellingRelaIn> cordrCsellingRelaIns;
    public static volatile ListAttribute<CordrCsellingRelaType, CordrCsellingRelaOut> cordrCsellingRelaOuts;
    public static volatile ListAttribute<CordrCsellingRelaType, CordrCsellingRelaTypeLan> cordrCsellingRelaTypeLans;
}
