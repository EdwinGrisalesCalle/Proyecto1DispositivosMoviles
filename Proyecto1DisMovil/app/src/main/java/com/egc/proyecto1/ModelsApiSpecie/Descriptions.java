package com.egc.proyecto1.ModelsApiSpecie;

public class Descriptions {
    public int key;
    public int taxonKey;
    public String type;
    public String language;
    public String description;
    public String source;
    public int sourceTaxonKey;
    public String creator;
    public String contributor;
    public String license;

    public Descriptions(int key, int taxonKey, String type, String language, String description, String source, int sourceTaxonKey, String creator, String contributor, String license) {
        this.key = key;
        this.taxonKey = taxonKey;
        this.type = type;
        this.language = language;
        this.description = description;
        this.source = source;
        this.sourceTaxonKey = sourceTaxonKey;
        this.creator = creator;
        this.contributor = contributor;
        this.license = license;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getTaxonKey() {
        return taxonKey;
    }

    public void setTaxonKey(int taxonKey) {
        this.taxonKey = taxonKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getSourceTaxonKey() {
        return sourceTaxonKey;
    }

    public void setSourceTaxonKey(int sourceTaxonKey) {
        this.sourceTaxonKey = sourceTaxonKey;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
