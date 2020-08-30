package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.159+0200")
@StaticMetamodel(AgresCsellingAttachment.class)
public class AgresCsellingAttachment_ {
    public static volatile SingularAttribute<AgresCsellingAttachment, BigDecimal> attaIdDocument;
    public static volatile SingularAttribute<AgresCsellingAttachment, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgresCsellingAttachment, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgresCsellingAttachment, Long> bintIdCsellingType;
    public static volatile SingularAttribute<AgresCsellingAttachment, BigDecimal> buinIdCustomerSelling;
    public static volatile SingularAttribute<AgresCsellingAttachment, Date> caatDaEndValidity;
    public static volatile SingularAttribute<AgresCsellingAttachment, Date> caatDaStartValidity;
    public static volatile SingularAttribute<AgresCsellingAttachment, Long> caatIdCsellingAttachment;
    public static volatile SingularAttribute<AgresCsellingAttachment, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgresCsellingAttachment, BigDecimal> userIdUpdaterParty;
}
