package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.206+0200")
@StaticMetamodel(CevcdOplanStatus.class)
public class CevcdOplanStatus_ {
    public static volatile SingularAttribute<CevcdOplanStatus, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CevcdOplanStatus, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CevcdOplanStatus, Date> oplsDaEndValidity;
    public static volatile SingularAttribute<CevcdOplanStatus, Date> oplsDaStartValidity;
    public static volatile SingularAttribute<CevcdOplanStatus, Long> oplsIdOplanStatus;
    public static volatile SingularAttribute<CevcdOplanStatus, String> oplsNaOplanStatus;
    public static volatile SingularAttribute<CevcdOplanStatus, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CevcdOplanStatus, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CevcdOplanStatus, CevcaOplanStatusMove> cevcaOplanStatusMoves;
}
