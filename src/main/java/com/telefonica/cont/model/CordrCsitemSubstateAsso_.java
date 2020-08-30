package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.976+0200")
@StaticMetamodel(CordrCsitemSubstateAsso.class)
public class CordrCsitemSubstateAsso_ {
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, Long> csuaIdCsitemSubstateAsso;
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CordrCsitemSubstateAsso, CordaCsitemSubstatMove> cordaCsitemSubstatMoves;
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, CorddCsitemSubstate> corddCsitemSubstate;
    public static volatile SingularAttribute<CordrCsitemSubstateAsso, CordrCsitemTypeAssoc> cordrCsitemTypeAssoc;
}
