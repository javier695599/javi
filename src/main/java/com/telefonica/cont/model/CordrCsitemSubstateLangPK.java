package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsitemSubstateLangPKS database table.
 */
@Embeddable
public class CordrCsitemSubstateLangPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CSSB_ID_CSITEM_SUBSTATE", nullable = false, precision = 3, unique = true)
    private Long cssbIdCsitemSubstate;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCssbIdCsitemSubstate() {
        return this.cssbIdCsitemSubstate;
    }

    public void setCssbIdCsitemSubstate(Long cssbIdCsitemSubstate) {
        this.cssbIdCsitemSubstate = cssbIdCsitemSubstate;
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
        result = prime * result + ((cssbIdCsitemSubstate == null) ? 0 : cssbIdCsitemSubstate.hashCode ());
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
        CordrCsitemSubstateLangPK other = (CordrCsitemSubstateLangPK) obj;
        if (cssbIdCsitemSubstate == null) {
            if (other.cssbIdCsitemSubstate != null)
                return false;
        } else if (!cssbIdCsitemSubstate.equals ( other.cssbIdCsitemSubstate ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
