package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcpProcessMarkGroupS database table.
 */
@Entity
@NamedQuery(name = "CevcpProcessMarkGroup.findAll", query = "SELECT c FROM CevcpProcessMarkGroup c")
@Table(name = "CEVCP_PROCESS_MARK_GROUP")
public class CevcpProcessMarkGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PMGR_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmgrDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PMGR_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmgrDaStartValidity;

    @Column(length = 500, name = "PMGR_DS_PROCESS_MARK_GROUP")
    private String pmgrDsProcessMarkGroup;

    @Column(name = "PMGR_ID_PROCESS_MARK_GROUP", nullable = false, precision = 4, unique = true)
    @Id
    private Long pmgrIdProcessMarkGroup;

    @Column(length = 100, name = "PMGR_NA_PROCESS_MARK_GROUP", nullable = false)
    private String pmgrNaProcessMarkGroup;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcpProcessMarkGroup")
    private List<CevcrPmGroup> cevcrPmGroups;

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

    public Date getPmgrDaEndValidity() {
        if (this.pmgrDaEndValidity != null)
            return (Date) this.pmgrDaEndValidity.clone ();
        else
            return null;
    }

    public void setPmgrDaEndValidity(Date pmgrDaEndValidity) {
        if (pmgrDaEndValidity != null)
            this.pmgrDaEndValidity = (Date) pmgrDaEndValidity.clone ();
        else
            this.pmgrDaEndValidity = pmgrDaEndValidity;
    }

    public Date getPmgrDaStartValidity() {
        if (this.pmgrDaStartValidity != null)
            return (Date) this.pmgrDaStartValidity.clone ();
        else
            return null;
    }

    public void setPmgrDaStartValidity(Date pmgrDaStartValidity) {
        if (pmgrDaStartValidity != null)
            this.pmgrDaStartValidity = (Date) pmgrDaStartValidity.clone ();
        else
            this.pmgrDaStartValidity = pmgrDaStartValidity;
    }

    public String getPmgrDsProcessMarkGroup() {
        return this.pmgrDsProcessMarkGroup;
    }

    public void setPmgrDsProcessMarkGroup(String pmgrDsProcessMarkGroup) {
        this.pmgrDsProcessMarkGroup = pmgrDsProcessMarkGroup;
    }

    public Long getPmgrIdProcessMarkGroup() {
        return this.pmgrIdProcessMarkGroup;
    }

    public void setPmgrIdProcessMarkGroup(Long pmgrIdProcessMarkGroup) {
        this.pmgrIdProcessMarkGroup = pmgrIdProcessMarkGroup;
    }

    public String getPmgrNaProcessMarkGroup() {
        return this.pmgrNaProcessMarkGroup;
    }

    public void setPmgrNaProcessMarkGroup(String pmgrNaProcessMarkGroup) {
        this.pmgrNaProcessMarkGroup = pmgrNaProcessMarkGroup;
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

    public List<CevcrPmGroup> getCevcrPmGroups() {
        return this.cevcrPmGroups;
    }

    public void setCevcrPmGroups(List<CevcrPmGroup> cevcrPmGroups) {
        this.cevcrPmGroups = cevcrPmGroups;
    }

    public void addCevcrPmGroups(CevcrPmGroup cevcrPmGroup) {
        if (this.cevcrPmGroups == null)
            this.cevcrPmGroups = new ArrayList<CevcrPmGroup> ();
        this.cevcrPmGroups.add ( cevcrPmGroup );
    }

    public void removeCevcrPmGroups(CevcrPmGroup cevcrPmGroupToRemove) {
        if (cevcrPmGroupToRemove != null)
            this.cevcrPmGroups.remove ( cevcrPmGroupToRemove );
    }

}
