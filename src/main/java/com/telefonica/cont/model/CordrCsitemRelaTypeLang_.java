package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.914+0200")
@StaticMetamodel(CordrCsitemRelaTypeLang.class)
public class CordrCsitemRelaTypeLang_ {
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, String> clanDsCsitemRelaTypeLang;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, String> clanNaCsitemRelaTypeLang;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, CordrCsitemRelaType> cordrCsitemRelaType;
    public static volatile SingularAttribute<CordrCsitemRelaTypeLang, CordrCsitemRelaTypeLangPK> id;
}
