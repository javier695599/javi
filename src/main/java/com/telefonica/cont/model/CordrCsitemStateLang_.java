package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.961+0200")
@StaticMetamodel(CordrCsitemStateLang.class)
public class CordrCsitemStateLang_ {
    public static volatile SingularAttribute<CordrCsitemStateLang, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemStateLang, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemStateLang, String> csslDsCsitemStateLang;
    public static volatile SingularAttribute<CordrCsitemStateLang, String> csslNaCsitemStateLang;
    public static volatile SingularAttribute<CordrCsitemStateLang, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemStateLang, BigDecimal> userIdUpdaterParty;
    public static volatile SingularAttribute<CordrCsitemStateLang, CorddCsellingItemState> corddCsellingItemState;
    public static volatile SingularAttribute<CordrCsitemStateLang, CordrCsitemStateLangPK> id;
}
