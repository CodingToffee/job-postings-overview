package de.nicolasharrje.dtos;

/**
 * DTO for a job posting (Stellenangebot).
 * Contains various attributes related to the job posting.
 * It is implemented in German because the source data is in German.
 */
public class Stellenangebot {
    String hashID;
    String beruf;
    String refNr;
    String arbeitgeber;
    String aktuelleVeroeffentlichungsdatum;
    String eintrittsdatum;
    String arbeitsort;
    String modifikationsTimestamp;

    // Getter und Setter
    public String getHashID() { return hashID; }  
    public void setHashID(String hashID) { this.hashID = hashID; }

    public String getBeruf() { return beruf; }
    public void setBeruf(String beruf) { this.beruf = beruf; }

    public String getRefNr() { return refNr; }
    public void setRefNr(String refNr) { this.refNr = refNr; }

    public String getArbeitgeber() { return arbeitgeber; }
    public void setArbeitgeber(String arbeitgeber) { this.arbeitgeber = arbeitgeber; }

    public String getaktuelleVeroeffentlichungsdatum() { return aktuelleVeroeffentlichungsdatum; }
    public void setaktuelleVeroeffentlichungsdatum(String aktuelleVeroeffentlichungsdatum) { this.aktuelleVeroeffentlichungsdatum = aktuelleVeroeffentlichungsdatum; }

    public String getEintrittsdatum() { return eintrittsdatum; }
    public void setEintrittsdatum(String eintrittsdatum) { this.eintrittsdatum = eintrittsdatum; }

    public String getArbeitsort() { return arbeitsort; }
    public void setArbeitsort(String arbeitsort) { this.arbeitsort = arbeitsort; }

    public String getModifikationsTimestamp() { return modifikationsTimestamp; }
    public void setModifikationsTimestamp(String modifikationsTimestamp) { this.modifikationsTimestamp = modifikationsTimestamp; }
}