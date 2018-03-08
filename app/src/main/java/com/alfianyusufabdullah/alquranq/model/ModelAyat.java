package com.alfianyusufabdullah.alquranq.model;

/**
 * Created by jonesrandom on 2/22/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class ModelAyat {

    private String surah;
    private String ayat;
    private String arab;
    private String terjemahan;
    private String terjemahanIndonesia;
    private String terjemahanEnglish;

    public ModelAyat(String surah, String ayat, String arab, String terjemahan) {
        this.surah = surah;
        this.ayat = ayat;
        this.arab = arab;
        this.terjemahan = terjemahan;
    }

    public ModelAyat(String surah, String ayat, String arab, String terjemahanIndonesia, String terjemahanEnglish) {
        this.surah = surah;
        this.ayat = ayat;
        this.arab = arab;
        this.terjemahanIndonesia = terjemahanIndonesia;
        this.terjemahanEnglish = terjemahanEnglish;
    }

    public String getSurah() {
        return surah;
    }

    public String getAyat() {
        return ayat;
    }

    public String getArab() {
        return arab;
    }

    public String getTerjemahan() {
        return terjemahan;
    }

    public String getTerjemahanIndonesia() {
        return terjemahanIndonesia;
    }

    public String getTerjemahanEnglish() {
        return terjemahanEnglish;
    }
}
