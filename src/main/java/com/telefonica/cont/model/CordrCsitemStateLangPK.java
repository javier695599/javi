package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsitemStateLangPKS database table.
 */
@Embeddable
public class CordrCsitemStateLangPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false, precision = 3, unique = true)
    private Long csisIdCsellingItemState;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCsisIdCsellingItemState() {
        return this.csisIdCsellingItemState;
    }

    public void setCsisIdCsellingItemState(Long csisIdCsellingItemState) {
        this.csisIdCsellingItemState = csisIdCsellingItemState;
    }

    public Long getLangIdLanguage() {
        return this.langIdLanguage;
    }

    public void setLangIdLanguage(Long langIdLanguage) {
        this.langIdLanguage = langIdLanguage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((csisIdCsellingItemState == null) ? 0 : csisIdCsellingItemState.hashCode ());
        result = prime * result + ((langIdLanguage == null) ? 0 : langIdLanguage.hashCode ());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass () != obj.getClass ())
            return false;
        CordrCsitemStateLangPK other = (CordrCsitemStateLangPK) obj;
        if (csisIdCsellingItemState == null) {
            if (other.csisIdCsellingItemState != null)
                return false;
        } else if (!csisIdCsellingItemState.equals ( other.csisIdCsellingItemState ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
