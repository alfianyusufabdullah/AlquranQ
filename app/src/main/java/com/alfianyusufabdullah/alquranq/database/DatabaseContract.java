package com.alfianyusufabdullah.alquranq.database;

import android.provider.BaseColumns;

/**
 * Created by jonesrandom on 2/20/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class DatabaseContract {

    static final String DATABASE_NAME = "AlquranQ";
    static final int DATABASE_VERSION = 1;

    public static final String LOAD_TERJEMEMAHAN_INDONESIA = "TerjemahanIndonesia";
    public static final String LOAD_TERJEMEMAHAN_ENGLISH = "TerjemahanEnglish";

    public static class TableSurah implements BaseColumns {
        public static final String TABLE_SURAH = "table_surah";

        public static final String SURAH = "Surah";
        public static final String AYAT = "Ayat";
        public static final String TERJEMAHAN_INDONESIA = LOAD_TERJEMEMAHAN_INDONESIA;
        public static final String TERJEMAHAN_ENGLISH = LOAD_TERJEMEMAHAN_ENGLISH;
        public static final String JUMLAH_AYAT = "Jumlah_Ayat";

        static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_SURAH + "("
                + SURAH + " TEXT,"
                + AYAT + " TEXT,"
                + TERJEMAHAN_INDONESIA + " TEXT,"
                + TERJEMAHAN_ENGLISH + " TEXT,"
                + JUMLAH_AYAT + " TEXT)";
        public static final String QUERY_STATEMENT = "INSERT INTO " + TABLE_SURAH + "(" + SURAH + "," + AYAT + "," + TERJEMAHAN_INDONESIA + "," + TERJEMAHAN_ENGLISH + "," + JUMLAH_AYAT + ") VALUES (?,?,?,?,?)";
    }

    public static class TableAyat implements BaseColumns {
        public static final String TABLE_AYAT = "table_ayat";

        public static final String SURAH = "Surah";
        public static final String AYAT = "Ayat";
        public static final String ARAB = "Arab";
        public static final String TERJEMAHAN_INDONESIA = LOAD_TERJEMEMAHAN_INDONESIA;
        public static final String TERJEMAHAN_ENGLISH = LOAD_TERJEMEMAHAN_ENGLISH;

        static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_AYAT + "("
                + SURAH + " TEXT,"
                + AYAT + " TEXT,"
                + ARAB + " TEXT,"
                + TERJEMAHAN_INDONESIA + " TEXT,"
                + TERJEMAHAN_ENGLISH + " TEXT)";

        public static final String QUERY_STATEMENT = "INSERT INTO " + TABLE_AYAT + "(" + SURAH + "," + AYAT + "," + ARAB + "," + TERJEMAHAN_INDONESIA + "," + TERJEMAHAN_ENGLISH + ") VALUES (?,?,?,?,?)";
    }
}
