package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CordrCsellingRelaTypeS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingRelaType.findAll", query = "SELECT c FROM CordrCsellingRelaType c")
@Table(name = "CORDR_CSELLING_RELA_TYPE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSRT_ID_CSELLING_RELA_TYPE", "BINT_ID_CSELLING_TYPE_RE", "BINT_ID_CSELLING_TYPE"})})
public class CordrCsellingRelaType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSRT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csrtDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSRT_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csrtDaStartValidity;

    @Column(length = 500, name = "CSRT_DS_CSELLING_RELA_TYPE")
    private String csrtDsCsellingRelaType;

    @Column(name = "CSRT_ID_CSELLING_RELA_TYPE", nullable = false, precision = 3)
    @GeneratedValue(generator = "CORDR_CSELLING_RELA_TYPE_CSRTIDCSELLINGRELATYPE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSELLING_RELA_TYPE_CSRTIDCSELLINGRELATYPE_GENERATOR", sequenceName = "CORD_CUSTSELLREALTYPE_SEQ")
    private Long csrtIdCsellingRelaType;

    @Column(length = 50, name = "CSRT_NA_CSELLING_RELA_TYPE", nullable = false)
    private String csrtNaCsellingRelaType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BINT_ID_CSELLING_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType1;
    @JoinColumn(name = "BINT_ID_CSELLING_TYPE_RE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType2;
    @OneToMany(mappedBy = "cordrCsellingRelaType")
    private List<CordrCsellingRelaIn> cordrCsellingRelaIns;
    @OneToMany(mappedBy = "cordrCsellingRelaType")
    private List<CordrCsellingRelaOut> cordrCsellingRelaOuts;
    @OneToMany(mappedBy = "cordrCsellingRelaType")
    private List<CordrCsellingRelaTypeLan> cordrCsellingRelaTypeLans;

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

    public Date getCsrtDaEndValidity() {
        if (this.csrtDaEndValidity != null)
            return (Date) this.csrtDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsrtDaEndValidity(Date csrtDaEndValidity) {
        if (csrtDaEndValidity != null)
            this.csrtDaEndValidity = (Date) csrtDaEndValidity.clone ();
        else
            this.csrtDaEndValidity = csrtDaEndValidity;
    }

    public Date getCsrtDaStartValidity() {
        if (this.csrtDaStartValidity != null)
            return (Date) this.csrtDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsrtDaStartValidity(Date csrtDaStartValidity) {
        if (csrtDaStartValidity != null)
            this.csrtDaStartValidity = (Date) csrtDaStartValidity.clone ();
        else
            this.csrtDaStartValidity = csrtDaStartValidity;
    }

    public String getCsrtDsCsellingRelaType() {
        return this.csrtDsCsellingRelaType;
    }

    public void setCsrtDsCsellingRelaType(String csrtDsCsellingRelaType) {
        this.csrtDsCsellingRelaType = csrtDsCsellingRelaType;
    }

    public Long getCsrtIdCsellingRelaType() {
        return this.csrtIdCsellingRelaType;
    }

    public void setCsrtIdCsellingRelaType(Long csrtIdCsellingRelaType) {
        this.csrtIdCsellingRelaType = csrtIdCsellingRelaType;
    }

    public String getCsrtNaCsellingRelaType() {
        return this.csrtNaCsellingRelaType;
    }

    public void setCsrtNaCsellingRelaType(String csrtNaCsellingRelaType) {
        this.csrtNaCsellingRelaType = csrtNaCsellingRelaType;
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

    public CorddCsellingType getCorddCsellingType1() {
        return this.corddCsellingType1;
    }

    public void setCorddCsellingType1(CorddCsellingType corddCsellingType1) {
        this.corddCsellingType1 = corddCsellingType1;
    }

    public CorddCsellingType getCorddCsellingType2() {
        return this.corddCsellingType2;
    }

    public void setCorddCsellingType2(CorddCsellingType corddCsellingType2) {
        this.corddCsellingType2 = corddCsellingType2;
    }

    public List<CordrCsellingRelaIn> getCordrCsellingRelaIns() {
        return this.cordrCsellingRelaIns;
    }

    public void setCordrCsellingRelaIns(List<CordrCsellingRelaIn> cordrCsellingRelaIns) {
        this.cordrCsellingRelaIns = cordrCsellingRelaIns;
    }

    public void addCordrCsellingRelaIns(CordrCsellingRelaIn cordrCsellingRelaIn) {
        if (this.cordrCsellingRelaIns == null)
            this.cordrCsellingRelaIns = new ArrayList<CordrCsellingRelaIn> ();
        this.cordrCsellingRelaIns.add ( cordrCsellingRelaIn );
    }

    public void removeCordrCsellingRelaIns(CordrCsellingRelaIn cordrCsellingRelaInToRemove) {
        if (cordrCsellingRelaInToRemove != null)
            this.cordrCsellingRelaIns.remove ( cordrCsellingRelaInToRemove );
    }

    public List<CordrCsellingRelaOut> getCordrCsellingRelaOuts() {
        return this.cordrCsellingRelaOuts;
    }

    public void setCordrCsellingRelaOuts(List<CordrCsellingRelaOut> cordrCsellingRelaOuts) {
        this.cordrCsellingRelaOuts = cordrCsellingRelaOuts;
    }

    public void addCordrCsellingRelaOuts(CordrCsellingRelaOut cordrCsellingRelaOut) {
        if (this.cordrCsellingRelaOuts == null)
            this.cordrCsellingRelaOuts = new ArrayList<CordrCsellingRelaOut> ();
        this.cordrCsellingRelaOuts.add ( cordrCsellingRelaOut );
    }

    public void removeCordrCsellingRelaOuts(CordrCsellingRelaOut cordrCsellingRelaOutToRemove) {
        if (cordrCsellingRelaOutToRemove != null)
            this.cordrCsellingRelaOuts.remove ( cordrCsellingRelaOutToRemove );
    }

    public List<CordrCsellingRelaTypeLan> getCordrCsellingRelaTypeLans() {
        return this.cordrCsellingRelaTypeLans;
    }

    public void setCordrCsellingRelaTypeLans(List<CordrCsellingRelaTypeLan> cordrCsellingRelaTypeLans) {
        this.cordrCsellingRelaTypeLans = cordrCsellingRelaTypeLans;
    }

    public void addCordrCsellingRelaTypeLans(CordrCsellingRelaTypeLan cordrCsellingRelaTypeLan) {
        if (this.cordrCsellingRelaTypeLans == null)
            this.cordrCsellingRelaTypeLans = new ArrayList<CordrCsellingRelaTypeLan> ();
        this.cordrCsellingRelaTypeLans.add ( cordrCsellingRelaTypeLan );
    }

    public void removeCordrCsellingRelaTypeLans(CordrCsellingRelaTypeLan cordrCsellingRelaTypeLanToRemove) {
        if (cordrCsellingRelaTypeLanToRemove != null)
            this.cordrCsellingRelaTypeLans.remove ( cordrCsellingRelaTypeLanToRemove );
    }

}
