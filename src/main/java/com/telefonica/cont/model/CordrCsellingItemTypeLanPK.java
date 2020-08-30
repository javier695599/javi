package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsellingItemTypeLanPKS database table.
 */
@Embeddable
public class CordrCsellingItemTypeLanPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3, unique = true)
    private Long csitIdCsellingItemType;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
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
        result = prime * result + ((csitIdCsellingItemType == null) ? 0 : csitIdCsellingItemType.hashCode ());
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
        CordrCsellingItemTypeLanPK other = (CordrCsellingItemTypeLanPK) obj;
        if (csitIdCsellingItemType == null) {
            if (other.csitIdCsellingItemType != null)
                return false;
        } else if (!csitIdCsellingItemType.equals ( other.csitIdCsellingItemType ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
