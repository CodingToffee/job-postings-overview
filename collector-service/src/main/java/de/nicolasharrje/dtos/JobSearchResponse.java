package de.nicolasharrje.dtos;

import java.util.List;

public class JobSearchResponse {
    List<Stellenangebot> stellenangebote;
    int maxResults;
    int page;
    int size;
    FacettenAusschnitt facettenAusschnitt;
}
