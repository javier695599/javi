package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.851+0200")
@StaticMetamodel(CordrCsellingStateLang.class)
public class CordrCsellingStateLang_ {
    public static volatile SingularAttribute<CordrCsellingStateLang, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsellingStateLang, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsellingStateLang, String> cuslDsCsellingStateLang;
    public static volatile SingularAttribute<CordrCsellingStateLang, String> cuslNaCsellingStateLang;
    public static volatile SingularAttribute<CordrCsellingStateLang, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsellingStateLang, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsellingStateLang, CorddCsellingState> corddCsellingState;
    public static volatile SingularAttribute<CordrCsellingStateLang, CordrCsellingStateLangPK> id;
}
