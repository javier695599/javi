package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.883+0200")
@StaticMetamodel(CordrCsellingTypeLang.class)
public class CordrCsellingTypeLang_ {
    public static volatile SingularAttribute<CordrCsellingTypeLang, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingTypeLang, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingTypeLang, String> ctylDsCsellingTypeLang;
    public static volatile SingularAttribute<CordrCsellingTypeLang, String> ctylNaCsellingTypeLang;
    public static volatile SingularAttribute<CordrCsellingTypeLang, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingTypeLang, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingTypeLang, CorddCsellingType> corddCsellingType;
    public static volatile SingularAttribute<CordrCsellingTypeLang, CordrCsellingTypeLangPK> id;
}
