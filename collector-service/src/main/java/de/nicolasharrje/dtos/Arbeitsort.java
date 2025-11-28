package de.nicolasharrje.dtos;

public class Arbeitsort {
    private String plz;
    private String ort;
    private String strasse;
    private String region;
    private String land;
    private Koordinaten koordinaten;

    public String getPlz() { return plz; }
    public void setPlz(String plz) { this.plz = plz; }

    public String getOrt() { return ort; }
    public void setOrt(String ort) { this.ort = ort; }

    public String getStrasse() { return strasse; }
    public void setStrasse(String strasse) { this.strasse = strasse; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getLand() { return land; }
    public void setLand(String land) { this.land = land; }

    public Koordinaten getKoordinaten() { return koordinaten; }
    public void setKoordinaten(Koordinaten koordinaten) { this.koordinaten = koordinaten; }
}
