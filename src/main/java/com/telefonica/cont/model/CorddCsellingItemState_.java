package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.518+0200")
@StaticMetamodel(CorddCsellingItemState.class)
public class CorddCsellingItemState_ {
    public static volatile SingularAttribute<CorddCsellingItemState, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsellingItemState, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsellingItemState, Date> csisDaEndValidity;
    public static volatile SingularAttribute<CorddCsellingItemState, Date> csisDaStartValidity;
    public static volatile SingularAttribute<CorddCsellingItemState, Long> csisIdCsellingItemState;
    public static volatile SingularAttribute<CorddCsellingItemState, String> csslDsCsitemStateLang;
    public static volatile SingularAttribute<CorddCsellingItemState, String> csslNaCsitemStateLang;
    public static volatile SingularAttribute<CorddCsellingItemState, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsellingItemState, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCsellingItemState, CordrCsitemStateLang> cordrCsitemStateLangs;
    public static volatile ListAttribute<CorddCsellingItemState, CordrCsitemTypeAssoc> cordrCsitemTypeAssocs;
    public static volatile ListAttribute<CorddCsellingItemState, CuinrCsellingStateInvolve> cuinrCsellingStateInvolves;
}
