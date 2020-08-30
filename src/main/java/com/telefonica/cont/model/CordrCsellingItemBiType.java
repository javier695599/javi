package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordrCsellingItemBiTypeS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingItemBiType.findAll", query = "SELECT c FROM CordrCsellingItemBiType c")
@Table(name = "CORDR_CSELLING_ITEM_BI_TYPE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSIT_ID_CSELLING_ITEM_TYPE", "BINT_ID_CSELLING_TYPE"})})
public class CordrCsellingItemBiType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIAS_ID_CSELLING_ITEM_BI_TYPE", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CORDR_CSELLING_ITEM_BI_TYPE_BIASIDCSELLINGITEMBITYPE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSELLING_ITEM_BI_TYPE_BIASIDCSELLINGITEMBITYPE_GENERATOR", sequenceName = "CORD_BIITEMBIASSO_SEQ")
    private Long biasIdCsellingItemBiType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType;
    @JoinColumn(name = "BINT_ID_CSELLING_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @OneToMany(mappedBy = "cordrCsellingItemBiType")
    private List<CordrCsellingItemBiAssoc> cordrCsellingItemBiAssocs;

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

    public Long getBiasIdCsellingItemBiType() {
        return this.biasIdCsellingItemBiType;
    }

    public void setBiasIdCsellingItemBiType(Long biasIdCsellingItemBiType) {
        this.biasIdCsellingItemBiType = biasIdCsellingItemBiType;
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

    public CorddCsellingItemType getCorddCsellingItemType() {
        return this.corddCsellingItemType;
    }

    public void setCorddCsellingItemType(CorddCsellingItemType corddCsellingItemType) {
        this.corddCsellingItemType = corddCsellingItemType;
    }

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public List<CordrCsellingItemBiAssoc> getCordrCsellingItemBiAssocs() {
        return this.cordrCsellingItemBiAssocs;
    }

    public void setCordrCsellingItemBiAssocs(List<CordrCsellingItemBiAssoc> cordrCsellingItemBiAssocs) {
        this.cordrCsellingItemBiAssocs = cordrCsellingItemBiAssocs;
    }

    public void addCordrCsellingItemBiAssocs(CordrCsellingItemBiAssoc cordrCsellingItemBiAssoc) {
        if (this.cordrCsellingItemBiAssocs == null)
            this.cordrCsellingItemBiAssocs = new ArrayList<CordrCsellingItemBiAssoc> ();
        this.cordrCsellingItemBiAssocs.add ( cordrCsellingItemBiAssoc );
    }

    public void removeCordrCsellingItemBiAssocs(CordrCsellingItemBiAssoc cordrCsellingItemBiAssocToRemove) {
        if (cordrCsellingItemBiAssocToRemove != null)
            this.cordrCsellingItemBiAssocs.remove ( cordrCsellingItemBiAssocToRemove );
    }

}
