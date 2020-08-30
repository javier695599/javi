package com.telefonica.cont.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Generated(value = "Dali", date = "2018-04-26T16:34:03.034+0200")
@StaticMetamodel(AgredCsellingAttachmentType.class)
public class AgredCsellingAttachmentType_ {
    
    public static volatile SingularAttribute<AgredCsellingAttachmentType, Timestamp> audiTiCreation;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, Timestamp> audiTiUpdate;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, Long> catpIdCsellingAttachmentTp;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, String> catpNaCsellingAttachmentTp;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, Timestamp> catpTiEndValidity;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, Timestamp> catpTiStartValidity;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, BigDecimal> userIdCreatorParty;
    public static volatile SingularAttribute<AgredCsellingAttachmentType, BigDecimal> userIdUpdaterParty;
    public static volatile ListAttribute<AgredCsellingAttachmentType, AgrerCsellingAttachment> agrerCsellingAttachments;
 
}
