package de.nicolasharrje.dtos;

import java.util.List;

public class JobSearchResponse {
    List<Stellenangebot> stellenangebote;
    int maxResults;
    int page;
    int size;
    FacettenAusschnitt facettenAusschnitt;

    public void setStellenangebote(List<Stellenangebot> stellenangebote) { this.stellenangebote = stellenangebote; }
    public List<Stellenangebot> getStellenangebote() { return this.stellenangebote; }

    public void  setMaxResults(int maxResults) { this.maxResults = maxResults; }
    public int getMaxResults() { return this.maxResults; }

    public void setPage(int page) { this.page = page; }
    public int getPage() { return this.page; }

    public void setSize(int size) { this.size = size; }
    public int getSize() { return this.size; }

    public void setFacettenAusschnitt(FacettenAusschnitt facettenAusschnitt) { this.facettenAusschnitt = facettenAusschnitt; }
    public FacettenAusschnitt getFacettenAusschnitt() { return this.facettenAusschnitt; }
}
