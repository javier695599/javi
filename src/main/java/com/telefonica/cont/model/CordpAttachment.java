package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordpAttachmentS database table.
 */
@Entity
@NamedQuery(name = "CordpAttachment.findAll", query = "SELECT c FROM CordpAttachment c")
@Table(name = "CORDP_ATTACHMENT")
public class CordpAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 100, name = "ATTA_CO_DOCUMENT", nullable = false, unique = true)
    private String attaCoDocument;

    @Column(name = "ATTA_ID_DOCUMENT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal attaIdDocument;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordpAttachment")
    private List<AgrerCsellingAttachment> agrerCsellingAttachments;

    public String getAttaCoDocument() {
        return this.attaCoDocument;
    }

    public void setAttaCoDocument(String attaCoDocument) {
        this.attaCoDocument = attaCoDocument;
    }

    public BigDecimal getAttaIdDocument() {
        return this.attaIdDocument;
    }

    public void setAttaIdDocument(BigDecimal attaIdDocument) {
        this.attaIdDocument = attaIdDocument;
    }

    public Timestamp getAudiTiCreation() {
        if (this.audiTiCreation != null)
            return (Timestamp) this.audiTiCreation.clone ();
        else
            return null;
    }

    public void setAudiTiCreation(Timestamp audiTiCreation) {
        if (audiTiCreation != null)
            this.audiTiCreation = (Timestamp) audiTiCreation.clone ();
        else
            this.audiTiCreation = audiTiCreation;
    }

    public Timestamp getAudiTiUpdate() {
        if (this.audiTiUpdate != null)
            return (Timestamp) this.audiTiUpdate.clone ();
        else
            return null;
    }

    public void setAudiTiUpdate(Timestamp audiTiUpdate) {
        if (audiTiUpdate != null)
            this.audiTiUpdate = (Timestamp) audiTiUpdate.clone ();
        else
            this.audiTiUpdate = audiTiUpdate;
    }

    public BigDecimal getUserIdCreatorParty() {
        return this.userIdCreatorParty;
    }

    public void setUserIdCreatorParty(BigDecimal userIdCreatorParty) {
        this.userIdCreatorParty = userIdCreatorParty;
    }

    public BigDecimal getUserIdUpdaterParty() {
        return this.userIdUpdaterParty;
    }

    public void setUserIdUpdaterParty(BigDecimal userIdUpdaterParty) {
        this.userIdUpdaterParty = userIdUpdaterParty;
    }

    public List<AgrerCsellingAttachment> getAgrerCsellingAttachments() {
        return this.agrerCsellingAttachments;
    }

    public void setAgrerCsellingAttachments(List<AgrerCsellingAttachment> agrerCsellingAttachments) {
        this.agrerCsellingAttachments = agrerCsellingAttachments;
    }

    public void addAgrerCsellingAttachments(AgrerCsellingAttachment agrerCsellingAttachment) {
        if (this.agrerCsellingAttachments == null)
            this.agrerCsellingAttachments = new ArrayList<AgrerCsellingAttachment> ();
        this.agrerCsellingAttachments.add ( agrerCsellingAttachment );
    }

    public void removeAgrerCsellingAttachments(AgrerCsellingAttachment agrerCsellingAttachmentToRemove) {
        if (agrerCsellingAttachmentToRemove != null)
            this.agrerCsellingAttachments.remove ( agrerCsellingAttachmentToRemove );
    }

}
