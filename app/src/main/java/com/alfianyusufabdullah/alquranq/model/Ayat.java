package com.alfianyusufabdullah.alquranq.model;

/**
 * Created by jonesrandom on 2/23/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class Ayat extends ModelAyat {
    public Ayat(String surah, String ayat, String arab, String terjemahan) {
        super(surah, ayat, arab, terjemahan);
    }

    @Override
    public String getSurah() {
        return super.getSurah();
    }

    @Override
    public String getAyat() {
        return super.getAyat();
    }

    @Override
    public String getArab() {
        return super.getArab();
    }

    @Override
    public String getTerjemahan() {
        return super.getTerjemahan();
    }
}
