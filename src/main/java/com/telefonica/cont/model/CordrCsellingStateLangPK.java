package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsellingStateLangPKS database table.
 */
@Embeddable
public class CordrCsellingStateLangPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CSST_ID_CSELLING_STATE", nullable = false, precision = 3, unique = true)
    private Long csstIdCsellingState;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCsstIdCsellingState() {
        return this.csstIdCsellingState;
    }

    public void setCsstIdCsellingState(Long csstIdCsellingState) {
        this.csstIdCsellingState = csstIdCsellingState;
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
        result = prime * result + ((csstIdCsellingState == null) ? 0 : csstIdCsellingState.hashCode ());
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
        CordrCsellingStateLangPK other = (CordrCsellingStateLangPK) obj;
        if (csstIdCsellingState == null) {
            if (other.csstIdCsellingState != null)
                return false;
        } else if (!csstIdCsellingState.equals ( other.csstIdCsellingState ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
