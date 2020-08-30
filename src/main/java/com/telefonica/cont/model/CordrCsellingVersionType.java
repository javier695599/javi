package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordrCsellingVersionTypeS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingVersionType.findAll", query = "SELECT c FROM CordrCsellingVersionType c")
@Table(name = "CORDR_CSELLING_VERSION_TYPE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BINT_ID_CSELLING_TYPE", "CSVR_ID_CSELLING_VERS_REASON"})})
public class CordrCsellingVersionType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSTV_ID_CSELLING_VERSION_TYPE", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CORDR_CSELLING_VERSION_TYPE_CSTVIDCSELLINGVERSIONTYPE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSELLING_VERSION_TYPE_CSTVIDCSELLINGVERSIONTYPE_GENERATOR", sequenceName = "CORD_CUSTSELLTYPEVERS_SEQ")
    private Long cstvIdCsellingVersionType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BINT_ID_CSELLING_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @JoinColumn(name = "CSVR_ID_CSELLING_VERS_REASON", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingVersReason corddCsellingVersReason;
    @OneToMany(mappedBy = "cordrCsellingVersionType")
    private List<CordrCsellingVersionRela> cordrCsellingVersionRelas;

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

    public Long getCstvIdCsellingVersionType() {
        return this.cstvIdCsellingVersionType;
    }

    public void setCstvIdCsellingVersionType(Long cstvIdCsellingVersionType) {
        this.cstvIdCsellingVersionType = cstvIdCsellingVersionType;
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

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public CorddCsellingVersReason getCorddCsellingVersReason() {
        return this.corddCsellingVersReason;
    }

    public void setCorddCsellingVersReason(CorddCsellingVersReason corddCsellingVersReason) {
        this.corddCsellingVersReason = corddCsellingVersReason;
    }

    public List<CordrCsellingVersionRela> getCordrCsellingVersionRelas() {
        return this.cordrCsellingVersionRelas;
    }

    public void setCordrCsellingVersionRelas(List<CordrCsellingVersionRela> cordrCsellingVersionRelas) {
        this.cordrCsellingVersionRelas = cordrCsellingVersionRelas;
    }

    public void addCordrCsellingVersionRelas(CordrCsellingVersionRela cordrCsellingVersionRela) {
        if (this.cordrCsellingVersionRelas == null)
            this.cordrCsellingVersionRelas = new ArrayList<CordrCsellingVersionRela> ();
        this.cordrCsellingVersionRelas.add ( cordrCsellingVersionRela );
    }

    public void removeCordrCsellingVersionRelas(CordrCsellingVersionRela cordrCsellingVersionRelaToRemove) {
        if (cordrCsellingVersionRelaToRemove != null)
            this.cordrCsellingVersionRelas.remove ( cordrCsellingVersionRelaToRemove );
    }

}
