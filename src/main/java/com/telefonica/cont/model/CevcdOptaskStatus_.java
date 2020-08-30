package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.237+0200")
@StaticMetamodel(CevcdOptaskStatus.class)
public class CevcdOptaskStatus_ {
    public static volatile SingularAttribute<CevcdOptaskStatus, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdOptaskStatus, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdOptaskStatus, Date> optsDaEndValidity;
    public static volatile SingularAttribute<CevcdOptaskStatus, Date> optsDaStartValidity;
    public static volatile SingularAttribute<CevcdOptaskStatus, Long> optsIdOptaskStatus;
    public static volatile SingularAttribute<CevcdOptaskStatus, Boolean> optsInFinalState;
    public static volatile SingularAttribute<CevcdOptaskStatus, String> optsNaOptaskStatus;
    public static volatile SingularAttribute<CevcdOptaskStatus, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdOptaskStatus, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdOptaskStatus, CevcaOptaskStatusMove> cevcaOptaskStatusMoves;
}
