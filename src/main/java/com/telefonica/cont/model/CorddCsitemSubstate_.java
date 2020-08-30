package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.557+0200")
@StaticMetamodel(CorddCsitemSubstate.class)
public class CorddCsitemSubstate_ {
    public static volatile SingularAttribute<CorddCsitemSubstate, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CorddCsitemSubstate, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CorddCsitemSubstate, Date> cssbDaEndValidity;
    public static volatile SingularAttribute<CorddCsitemSubstate, Date> cssbDaStartValidity;
    public static volatile SingularAttribute<CorddCsitemSubstate, Long> cssbIdCsitemSubstate;
    public static volatile SingularAttribute<CorddCsitemSubstate, String> csulDsCsitemSubstateLang;
    public static volatile SingularAttribute<CorddCsitemSubstate, String> csulNaCsitemSubstateLang;
    public static volatile SingularAttribute<CorddCsitemSubstate, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CorddCsitemSubstate, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CorddCsitemSubstate, CordrCsitemSubstateAsso> cordrCsitemSubstateAssos;
    public static volatile ListAttribute<CorddCsitemSubstate, CordrCsitemSubstateLang> cordrCsitemSubstateLangs;
}
