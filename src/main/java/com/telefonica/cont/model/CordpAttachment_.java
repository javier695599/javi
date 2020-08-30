package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.604+0200")
@StaticMetamodel(CordpAttachment.class)
public class CordpAttachment_ {
    public static volatile SingularAttribute<CordpAttachment, String> attaCoDocument;
    public static volatile SingularAttribute<CordpAttachment, BigDecimal> attaIdDocument;
    public static volatile SingularAttribute<CordpAttachment, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<CordpAttachment, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<CordpAttachment, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<CordpAttachment, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<CordpAttachment, AgrerCsellingAttachment> agrerCsellingAttachments;
}
