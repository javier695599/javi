package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:04.008+0200")
@StaticMetamodel(CordrCsitemTypeAssoc.class)
public class CordrCsitemTypeAssoc_ {
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, Long> ctyaIdCsitemTypeAssoc;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, Boolean> ctyaInFinalState;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CordrCsitemTypeAssoc, CordaCsitemStateMove> cordaCsitemStateMoves;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, CorddCsellingItemState> corddCsellingItemState;
    public static volatile SingularAttribute<CordrCsitemTypeAssoc, CorddCsellingItemType> corddCsellingItemType;
    public static volatile ListAttribute<CordrCsitemTypeAssoc, CordrCsitemSubstateAsso> cordrCsitemSubstateAssos;
}
