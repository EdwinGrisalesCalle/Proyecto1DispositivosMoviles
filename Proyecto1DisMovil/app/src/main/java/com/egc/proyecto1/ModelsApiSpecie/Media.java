package com.egc.proyecto1.ModelsApiSpecie;

import java.util.Date;

public class Media {
    public String type;
    public String format;
    public String identifier;
    public String references;
    public String title;
    public String description;
    public String source;
    public String audience;
    public Date created;
    public String creator;
    public String publisher;
    public int taxonKey;
    public int sourceTaxonKey;

    public Media(String type, String format, String identifier, String references, String title, String description, String source, String audience, Date created, String creator, String publisher, int taxonKey, int sourceTaxonKey) {
        this.type = type;
        this.format = format;
        this.identifier = identifier;
        this.references = references;
        this.title = title;
        this.description = description;
        this.source = source;
        this.audience = audience;
        this.created = created;
        this.creator = creator;
        this.publisher = publisher;
        this.taxonKey = taxonKey;
        this.sourceTaxonKey = sourceTaxonKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getTaxonKey() {
        return taxonKey;
    }

    public void setTaxonKey(int taxonKey) {
        this.taxonKey = taxonKey;
    }

    public int getSourceTaxonKey() {
        return sourceTaxonKey;
    }

    public void setSourceTaxonKey(int sourceTaxonKey) {
        this.sourceTaxonKey = sourceTaxonKey;
    }
}
