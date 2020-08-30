package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.992+0200")
@StaticMetamodel(CordrCsitemSubstateLang.class)
public class CordrCsitemSubstateLang_ {
    public static volatile SingularAttribute<CordrCsitemSubstateLang, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, String> csulDsCsitemSubstateLang;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, String> csulNaCsitemSubstateLang;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, CorddCsitemSubstate> corddCsitemSubstate;
    public static volatile SingularAttribute<CordrCsitemSubstateLang, CordrCsitemSubstateLangPK> id;
}
