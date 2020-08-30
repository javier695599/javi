package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.820+0200")
@StaticMetamodel(CordrCsellingRelaTypeLan.class)
public class CordrCsellingRelaTypeLan_ {
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, String> ctlaDsCsellingRelaTypeLan;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, String> ctlaNaCsellingRelaTypeLan;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, CordrCsellingRelaType> cordrCsellingRelaType;
    public static volatile SingularAttribute<CordrCsellingRelaTypeLan, CordrCsellingRelaTypeLanPK> id;
}
