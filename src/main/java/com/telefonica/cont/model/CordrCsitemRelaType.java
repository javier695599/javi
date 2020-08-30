package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CordrCsitemRelaTypeS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemRelaType.findAll", query = "SELECT c FROM CordrCsitemRelaType c")
@Table(name = "CORDR_CSITEM_RELA_TYPE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CIRT_ID_CSITEM_RELA_TYPE", "CSIT_ID_CSELLING_ITEM_TYPE", "CSIT_ID_CSELLING_ITEM_TYPE_RE"})})
public class CordrCsitemRelaType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIR_ID_BI_SPEC_ITEM_REL", precision = 10)
    private Long biirIdBiSpecItemRel;

    @Column(columnDefinition = "DATE", name = "CIRT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cirtDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CIRT_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cirtDaStartValidity;

    @Column(length = 80, name = "CIRT_DS_CSITEM_RELA_TYPE")
    private String cirtDsCsitemRelaType;

    @Column(name = "CIRT_ID_CSITEM_RELA_TYPE", nullable = false, precision = 3)
    @GeneratedValue(generator = "CORDR_CSITEM_RELA_TYPE_CIRTIDCSITEMRELATYPE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSITEM_RELA_TYPE_CIRTIDCSITEMRELATYPE_GENERATOR", sequenceName = "CORD_CUSTSELLITRELATYPE_SEQ")
    private Long cirtIdCsitemRelaType;

    @Column(length = 20, name = "CIRT_NA_CSITEM_RELA_TYPE", nullable = false)
    private String cirtNaCsitemRelaType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CSIT_ID_CSELLING_ITEM_TYPE_RE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType1;
    @JoinColumn(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType2;
    @OneToMany(mappedBy = "cordrCsitemRelaType")
    private List<CordrCsellingItemRelaIn> cordrCsellingItemRelaIns;
    @OneToMany(mappedBy = "cordrCsitemRelaType")
    private List<CordrCsellingItemRelaOut> cordrCsellingItemRelaOuts;
    @OneToMany(mappedBy = "cordrCsitemRelaType")
    private List<CordrCsitemRelaTypeLang> cordrCsitemRelaTypeLangs;

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

    public Long getBiirIdBiSpecItemRel() {
        return this.biirIdBiSpecItemRel;
    }

    public void setBiirIdBiSpecItemRel(Long biirIdBiSpecItemRel) {
        this.biirIdBiSpecItemRel = biirIdBiSpecItemRel;
    }

    public Date getCirtDaEndValidity() {
        if (this.cirtDaEndValidity != null)
            return (Date) this.cirtDaEndValidity.clone ();
        else
            return null;
    }

    public void setCirtDaEndValidity(Date cirtDaEndValidity) {
        if (cirtDaEndValidity != null)
            this.cirtDaEndValidity = (Date) cirtDaEndValidity.clone ();
        else
            this.cirtDaEndValidity = cirtDaEndValidity;
    }

    public Date getCirtDaStartValidity() {
        if (this.cirtDaStartValidity != null)
            return (Date) this.cirtDaStartValidity.clone ();
        else
            return null;
    }

    public void setCirtDaStartValidity(Date cirtDaStartValidity) {
        if (cirtDaStartValidity != null)
            this.cirtDaStartValidity = (Date) cirtDaStartValidity.clone ();
        else
            this.cirtDaStartValidity = cirtDaStartValidity;
    }

    public String getCirtDsCsitemRelaType() {
        return this.cirtDsCsitemRelaType;
    }

    public void setCirtDsCsitemRelaType(String cirtDsCsitemRelaType) {
        this.cirtDsCsitemRelaType = cirtDsCsitemRelaType;
    }

    public Long getCirtIdCsitemRelaType() {
        return this.cirtIdCsitemRelaType;
    }

    public void setCirtIdCsitemRelaType(Long cirtIdCsitemRelaType) {
        this.cirtIdCsitemRelaType = cirtIdCsitemRelaType;
    }

    public String getCirtNaCsitemRelaType() {
        return this.cirtNaCsitemRelaType;
    }

    public void setCirtNaCsitemRelaType(String cirtNaCsitemRelaType) {
        this.cirtNaCsitemRelaType = cirtNaCsitemRelaType;
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

    public CorddCsellingItemType getCorddCsellingItemType1() {
        return this.corddCsellingItemType1;
    }

    public void setCorddCsellingItemType1(CorddCsellingItemType corddCsellingItemType1) {
        this.corddCsellingItemType1 = corddCsellingItemType1;
    }

    public CorddCsellingItemType getCorddCsellingItemType2() {
        return this.corddCsellingItemType2;
    }

    public void setCorddCsellingItemType2(CorddCsellingItemType corddCsellingItemType2) {
        this.corddCsellingItemType2 = corddCsellingItemType2;
    }

    public List<CordrCsellingItemRelaIn> getCordrCsellingItemRelaIns() {
        return this.cordrCsellingItemRelaIns;
    }

    public void setCordrCsellingItemRelaIns(List<CordrCsellingItemRelaIn> cordrCsellingItemRelaIns) {
        this.cordrCsellingItemRelaIns = cordrCsellingItemRelaIns;
    }

    public void addCordrCsellingItemRelaIns(CordrCsellingItemRelaIn cordrCsellingItemRelaIn) {
        if (this.cordrCsellingItemRelaIns == null)
            this.cordrCsellingItemRelaIns = new ArrayList<CordrCsellingItemRelaIn> ();
        this.cordrCsellingItemRelaIns.add ( cordrCsellingItemRelaIn );
    }

    public void removeCordrCsellingItemRelaIns(CordrCsellingItemRelaIn cordrCsellingItemRelaInToRemove) {
        if (cordrCsellingItemRelaInToRemove != null)
            this.cordrCsellingItemRelaIns.remove ( cordrCsellingItemRelaInToRemove );
    }

    public List<CordrCsellingItemRelaOut> getCordrCsellingItemRelaOuts() {
        return this.cordrCsellingItemRelaOuts;
    }

    public void setCordrCsellingItemRelaOuts(List<CordrCsellingItemRelaOut> cordrCsellingItemRelaOuts) {
        this.cordrCsellingItemRelaOuts = cordrCsellingItemRelaOuts;
    }

    public void addCordrCsellingItemRelaOuts(CordrCsellingItemRelaOut cordrCsellingItemRelaOut) {
        if (this.cordrCsellingItemRelaOuts == null)
            this.cordrCsellingItemRelaOuts = new ArrayList<CordrCsellingItemRelaOut> ();
        this.cordrCsellingItemRelaOuts.add ( cordrCsellingItemRelaOut );
    }

    public void removeCordrCsellingItemRelaOuts(CordrCsellingItemRelaOut cordrCsellingItemRelaOutToRemove) {
        if (cordrCsellingItemRelaOutToRemove != null)
            this.cordrCsellingItemRelaOuts.remove ( cordrCsellingItemRelaOutToRemove );
    }

    public List<CordrCsitemRelaTypeLang> getCordrCsitemRelaTypeLangs() {
        return this.cordrCsitemRelaTypeLangs;
    }

    public void setCordrCsitemRelaTypeLangs(List<CordrCsitemRelaTypeLang> cordrCsitemRelaTypeLangs) {
        this.cordrCsitemRelaTypeLangs = cordrCsitemRelaTypeLangs;
    }

    public void addCordrCsitemRelaTypeLangs(CordrCsitemRelaTypeLang cordrCsitemRelaTypeLang) {
        if (this.cordrCsitemRelaTypeLangs == null)
            this.cordrCsitemRelaTypeLangs = new ArrayList<CordrCsitemRelaTypeLang> ();
        this.cordrCsitemRelaTypeLangs.add ( cordrCsitemRelaTypeLang );
    }

    public void removeCordrCsitemRelaTypeLangs(CordrCsitemRelaTypeLang cordrCsitemRelaTypeLangToRemove) {
        if (cordrCsitemRelaTypeLangToRemove != null)
            this.cordrCsitemRelaTypeLangs.remove ( cordrCsitemRelaTypeLangToRemove );
    }

}
