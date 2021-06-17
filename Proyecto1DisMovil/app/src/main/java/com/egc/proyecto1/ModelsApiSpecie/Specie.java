package com.egc.proyecto1.ModelsApiSpecie;

import java.io.Serializable;

public class Specie implements Serializable {
    public int key;
    public int nubKey;
    public int nameKey;
    public String taxonID;
    public int sourceTaxonKey;
    public String kingdom;
    public int kingdomKey;
    public String datasetKey;
    public String constituentKey;
    public String scientificName;
    public String canonicalName;
    public String authorship;
    public String nameType;
    public String rank;
    public String origin;
    public String taxonomicStatus;
    public String remarks;
    public int numDescendants;
    public boolean synonym;
    public String phylum;
    public int phylumKey;
    public int parentKey;
    public String parent;
    public int acceptedKey;
    public String accepted;

    public Specie(int key, int nubKey, int nameKey, String taxonID, int sourceTaxonKey, String kingdom, int kingdomKey, String datasetKey, String constituentKey, String scientificName, String canonicalName, String authorship, String nameType, String rank, String origin, String taxonomicStatus, String remarks, int numDescendants, boolean synonym, String phylum, int phylumKey, int parentKey, String parent, int acceptedKey, String accepted) {
        this.key = key;
        this.nubKey = nubKey;
        this.nameKey = nameKey;
        this.taxonID = taxonID;
        this.sourceTaxonKey = sourceTaxonKey;
        this.kingdom = kingdom;
        this.kingdomKey = kingdomKey;
        this.datasetKey = datasetKey;
        this.constituentKey = constituentKey;
        this.scientificName = scientificName;
        this.canonicalName = canonicalName;
        this.authorship = authorship;
        this.nameType = nameType;
        this.rank = rank;
        this.origin = origin;
        this.taxonomicStatus = taxonomicStatus;
        this.remarks = remarks;
        this.numDescendants = numDescendants;
        this.synonym = synonym;
        this.phylum = phylum;
        this.phylumKey = phylumKey;
        this.parentKey = parentKey;
        this.parent = parent;
        this.acceptedKey = acceptedKey;
        this.accepted = accepted;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getNubKey() {
        return nubKey;
    }

    public void setNubKey(int nubKey) {
        this.nubKey = nubKey;
    }

    public int getNameKey() {
        return nameKey;
    }

    public void setNameKey(int nameKey) {
        this.nameKey = nameKey;
    }

    public String getTaxonID() {
        return taxonID;
    }

    public void setTaxonID(String taxonID) {
        this.taxonID = taxonID;
    }

    public int getSourceTaxonKey() {
        return sourceTaxonKey;
    }

    public void setSourceTaxonKey(int sourceTaxonKey) {
        this.sourceTaxonKey = sourceTaxonKey;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public int getKingdomKey() {
        return kingdomKey;
    }

    public void setKingdomKey(int kingdomKey) {
        this.kingdomKey = kingdomKey;
    }

    public String getDatasetKey() {
        return datasetKey;
    }

    public void setDatasetKey(String datasetKey) {
        this.datasetKey = datasetKey;
    }

    public String getConstituentKey() {
        return constituentKey;
    }

    public void setConstituentKey(String constituentKey) {
        this.constituentKey = constituentKey;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public String getAuthorship() {
        return authorship;
    }

    public void setAuthorship(String authorship) {
        this.authorship = authorship;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTaxonomicStatus() {
        return taxonomicStatus;
    }

    public void setTaxonomicStatus(String taxonomicStatus) {
        this.taxonomicStatus = taxonomicStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getNumDescendants() {
        return numDescendants;
    }

    public void setNumDescendants(int numDescendants) {
        this.numDescendants = numDescendants;
    }

    public boolean isSynonym() {
        return synonym;
    }

    public void setSynonym(boolean synonym) {
        this.synonym = synonym;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public int getPhylumKey() {
        return phylumKey;
    }

    public void setPhylumKey(int phylumKey) {
        this.phylumKey = phylumKey;
    }

    public int getParentKey() {
        return parentKey;
    }

    public void setParentKey(int parentKey) {
        this.parentKey = parentKey;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public int getAcceptedKey() {
        return acceptedKey;
    }

    public void setAcceptedKey(int acceptedKey) {
        this.acceptedKey = acceptedKey;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }
}
