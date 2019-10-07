package com.alfianyusufabdullah.alquranq.model;

/**
 * Created by jonesrandom on 2/22/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class ModelSurah {

    private String surah;
    private String ayat;
    private String terjemahan;
    private String terjemahanIndonesia;
    private String terjemahanEnglish;
    private String jumlahAyat;

    public ModelSurah(String surah,
                      String ayat,
                      String terjemahan,
                      String jumlahAyat
    ) {
        this.surah = surah;
        this.ayat = ayat;
        this.terjemahan = terjemahan;
        this.jumlahAyat = jumlahAyat;
    }

    public ModelSurah(String surah,
                      String ayat,
                      String terjemahanIndonesia,
                      String terjemahanEnglish,
                      String jumlahAyat
    ) {
        this.surah = surah;
        this.ayat = ayat;
        this.terjemahanIndonesia = terjemahanIndonesia;
        this.terjemahanEnglish = terjemahanEnglish;
        this.jumlahAyat = jumlahAyat;
    }

    public String getSurah() {
        return surah;
    }

    public String getAyat() {
        return ayat;
    }

    public String getTerjemahan() {
        return terjemahan;
    }

    public String getJumlahAyat() {
        return jumlahAyat;
    }

    public String getTerjemahanIndonesia() {
        return terjemahanIndonesia;
    }

    public String getTerjemahanEnglish() {
        return terjemahanEnglish;
    }
}
