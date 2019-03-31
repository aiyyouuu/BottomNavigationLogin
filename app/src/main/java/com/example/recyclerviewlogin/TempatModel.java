package com.example.recyclerviewlogin;

public class TempatModel  {
    String namaTempat;
    int fotoTempat;
    String overview;

    public TempatModel(String namaTempat, int fotoTempat, String overview){
        this.namaTempat = namaTempat;
        this.fotoTempat = fotoTempat;
        this.overview = overview;
    }
    public String getNamaTempat() {
        return namaTempat;
    }

    public int getFotoTempat() {
        return fotoTempat;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) { this.overview = overview; }

}
