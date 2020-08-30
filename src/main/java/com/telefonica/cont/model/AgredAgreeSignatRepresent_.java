package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.018+0200")
@StaticMetamodel(AgredAgreeSignatRepresent.class)
public class AgredAgreeSignatRepresent_ {
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, String> agsrDsAgreeSignatRepresent;
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, Long> agsrIdAgreeSignatRepresent;
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, String> agsrNaAgreeSignatRepresent;
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgredAgreeSignatRepresent, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<AgredAgreeSignatRepresent, AgreaCagreeAuthoriza> agreaCagreeAuthorizas;
}
