package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.143+0200")
@StaticMetamodel(AgrerCsellingAttachment.class)
public class AgrerCsellingAttachment_ {
    public static volatile SingularAttribute<AgrerCsellingAttachment, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgrerCsellingAttachment, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgrerCsellingAttachment, Date> caatDaEndValidity;
    public static volatile SingularAttribute<AgrerCsellingAttachment, Date> caatDaStartValidity;
    public static volatile SingularAttribute<AgrerCsellingAttachment, Long> caatIdCsellingAttachment;
    public static volatile SingularAttribute<AgrerCsellingAttachment, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgrerCsellingAttachment, BigDecimal> userIdUpdaterParty;
	public static volatile SingularAttribute<AgrerCsellingAttachment, AgredCsellingAttachmentType> agredCsellingAttachmentType;
    public static volatile SingularAttribute<AgrerCsellingAttachment, CordpAttachment> cordpAttachment;
    public static volatile SingularAttribute<AgrerCsellingAttachment, CordpCustomerSelling> cordpCustomerSelling;
}
