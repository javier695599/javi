package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.034+0200")
@StaticMetamodel(AgredCagreeAuthorizStatus.class)
public class AgredCagreeAuthorizStatus_ {
    public static volatile SingularAttribute<AgredCagreeAuthorizStatus, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgredCagreeAuthorizStatus, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgredCagreeAuthorizStatus, Long> caasIdCagreeAuthorizStatus;
    public static volatile SingularAttribute<AgredCagreeAuthorizStatus, String> caasNaCagreeAuthorizStatus;
    public static volatile SingularAttribute<AgredCagreeAuthorizStatus, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgredCagreeAuthorizStatus, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<AgredCagreeAuthorizStatus, AgreaCagreeAuthoriza> agreaCagreeAuthorizas;
}
