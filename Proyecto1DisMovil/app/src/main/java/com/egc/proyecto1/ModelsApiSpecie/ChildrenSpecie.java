package com.egc.proyecto1.ModelsApiSpecie;

public class ChildrenSpecie {
    public int key;
    public int nubKey;
    public int nameKey;
    public String taxonID;
    public int sourceTaxonKey;
    public String kingdom;
    public String phylum;
    public int kingdomKey;
    public int phylumKey;
    public String datasetKey;
    public String constituentKey;
    public int parentKey;
    public String parent;
    public String scientificName;
    public String canonicalName;
    public String authorship;
    public String nameType;
    public String rank;
    public String origin;
    public String taxonomicStatus;
    public String remarks;
    public int numDescendants;
    //public Date lastCrawled;
    //public Date lastInterpreted;
    //public List<Object> issues;
    public boolean synonym;
    public String publishedIn;

    public ChildrenSpecie(int key, int nubKey, int nameKey, String taxonID, int sourceTaxonKey,
                          String kingdom, String phylum, int kingdomKey, int phylumKey, String datasetKey,
                          String constituentKey, int parentKey, String parent, String scientificName,
                          String canonicalName, String authorship, String nameType, String rank,
                          String origin, String taxonomicStatus, String remarks, int numDescendants,
                          boolean synonym, String publishedIn) {
        this.key = key;
        this.nubKey = nubKey;
        this.nameKey = nameKey;
        this.taxonID = taxonID;
        this.sourceTaxonKey = sourceTaxonKey;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.kingdomKey = kingdomKey;
        this.phylumKey = phylumKey;
        this.datasetKey = datasetKey;
        this.constituentKey = constituentKey;
        this.parentKey = parentKey;
        this.parent = parent;
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
        this.publishedIn = publishedIn;
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

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public int getKingdomKey() {
        return kingdomKey;
    }

    public void setKingdomKey(int kingdomKey) {
        this.kingdomKey = kingdomKey;
    }

    public int getPhylumKey() {
        return phylumKey;
    }

    public void setPhylumKey(int phylumKey) {
        this.phylumKey = phylumKey;
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

    public String getPublishedIn() {
        return publishedIn;
    }

    public void setPublishedIn(String publishedIn) {
        this.publishedIn = publishedIn;
    }
}
