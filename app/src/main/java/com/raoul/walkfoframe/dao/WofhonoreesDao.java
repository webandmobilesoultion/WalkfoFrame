package com.raoul.walkfoframe.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.raoul.walkfoframe.model.Wofhonorees;
import com.raoul.walkfoframe.database.DaoSession;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;



// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table WOFHONOREES.
*/
public class WofhonoreesDao extends AbstractDao<Wofhonorees, Void> {

    public static final String TABLENAME = "WOFHONOREES";

    /**
     * Properties of entity Wofhonorees.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property HonoreeID = new Property(0, Integer.class, "honoreeID", false, "HONOREE_ID");
        public final static Property BioThumbnail = new Property(1, String.class, "bioThumbnail", false, "BIO_THUMBNAIL");
        public final static Property Biography = new Property(2, String.class, "biography", false, "BIOGRAPHY");
        public final static Property BirthCity = new Property(3, String.class, "birthCity", false, "BIRTH_CITY");
        public final static Property BirthCountry = new Property(4, String.class, "birthCountry", false, "BIRTH_COUNTRY");
        public final static Property BirthDate = new Property(5, String.class, "birthDate", false, "BIRTH_DATE");
        public final static Property CreatedTimeStamp = new Property(6, String.class, "createdTimeStamp", false, "CREATED_TIME_STAMP");
        public final static Property DeathCity = new Property(7, String.class, "deathCity", false, "DEATH_CITY");
        public final static Property DeathState = new Property(8, String.class, "deathState", false, "DEATH_STATE");
        public final static Property Education = new Property(9, String.class, "education", false, "EDUCATION");
        public final static Property Ethnicity = new Property(10, String.class, "ethnicity", false, "ETHNICITY");
        public final static Property InductionDate = new Property(11, String.class, "inductionDate", false, "INDUCTION_DATE");
        public final static Property FullName = new Property(12, String.class, "fullName", false, "FULL_NAME");
        public final static Property NameFullFirst = new Property(13, String.class, "nameFullFirst", false, "NAME_FULL_FIRST");
        public final static Property NameFullFirstLetter = new Property(14, String.class, "nameFullFirstLetter", false, "NAME_FULL_FIRST_LETTER");
        public final static Property NameFullLast = new Property(15, String.class, "nameFullLast", false, "NAME_FULL_LAST");
    };


    public WofhonoreesDao(DaoConfig config) {
        super(config);
    }
    
    public WofhonoreesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'WOFHONOREES' (" + //
                "'HONOREE_ID' INTEGER," + // 0: honoreeID
                "'BIO_THUMBNAIL' TEXT," + // 1: bioThumbnail
                "'BIOGRAPHY' TEXT," + // 2: biography
                "'BIRTH_CITY' TEXT," + // 3: birthCity
                "'BIRTH_COUNTRY' TEXT," + // 4: birthCountry
                "'BIRTH_DATE' TEXT," + // 5: birthDate
                "'CREATED_TIME_STAMP' TEXT," + // 6: createdTimeStamp
                "'DEATH_CITY' TEXT," + // 7: deathCity
                "'DEATH_STATE' TEXT," + // 8: deathState
                "'EDUCATION' TEXT," + // 9: education
                "'ETHNICITY' TEXT," + // 10: ethnicity
                "'INDUCTION_DATE' TEXT," + // 11: inductionDate
                "'FULL_NAME' TEXT," + // 12: fullName
                "'NAME_FULL_FIRST' TEXT," + // 13: nameFullFirst
                "'NAME_FULL_FIRST_LETTER' TEXT," + // 14: nameFullFirstLetter
                "'NAME_FULL_LAST' TEXT);"); // 15: nameFullLast
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'WOFHONOREES'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Wofhonorees entity) {
        stmt.clearBindings();
 
        Integer honoreeID = entity.getHonoreeID();
        if (honoreeID != null) {
            stmt.bindLong(1, honoreeID);
        }
 
        String bioThumbnail = entity.getBioThumbnail();
        if (bioThumbnail != null) {
            stmt.bindString(2, bioThumbnail);
        }
 
        String biography = entity.getBiography();
        if (biography != null) {
            stmt.bindString(3, biography);
        }
 
        String birthCity = entity.getBirthCity();
        if (birthCity != null) {
            stmt.bindString(4, birthCity);
        }
 
        String birthCountry = entity.getBirthCountry();
        if (birthCountry != null) {
            stmt.bindString(5, birthCountry);
        }
 
        String birthDate = entity.getBirthDate();
        if (birthDate != null) {
            stmt.bindString(6, birthDate);
        }
 
        String createdTimeStamp = entity.getCreatedTimeStamp();
        if (createdTimeStamp != null) {
            stmt.bindString(7, createdTimeStamp);
        }
 
        String deathCity = entity.getDeathCity();
        if (deathCity != null) {
            stmt.bindString(8, deathCity);
        }
 
        String deathState = entity.getDeathState();
        if (deathState != null) {
            stmt.bindString(9, deathState);
        }
 
        String education = entity.getEducation();
        if (education != null) {
            stmt.bindString(10, education);
        }
 
        String ethnicity = entity.getEthnicity();
        if (ethnicity != null) {
            stmt.bindString(11, ethnicity);
        }
 
        String inductionDate = entity.getInductionDate();
        if (inductionDate != null) {
            stmt.bindString(12, inductionDate);
        }
 
        String fullName = entity.getFullName();
        if (fullName != null) {
            stmt.bindString(13, fullName);
        }
 
        String nameFullFirst = entity.getNameFullFirst();
        if (nameFullFirst != null) {
            stmt.bindString(14, nameFullFirst);
        }
 
        String nameFullFirstLetter = entity.getNameFullFirstLetter();
        if (nameFullFirstLetter != null) {
            stmt.bindString(15, nameFullFirstLetter);
        }
 
        String nameFullLast = entity.getNameFullLast();
        if (nameFullLast != null) {
            stmt.bindString(16, nameFullLast);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public Wofhonorees readEntity(Cursor cursor, int offset) {
        Wofhonorees entity = new Wofhonorees( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // honoreeID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bioThumbnail
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // biography
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // birthCity
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // birthCountry
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // birthDate
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // createdTimeStamp
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // deathCity
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // deathState
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // education
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ethnicity
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // inductionDate
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // fullName
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // nameFullFirst
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // nameFullFirstLetter
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15) // nameFullLast
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Wofhonorees entity, int offset) {
        entity.setHonoreeID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setBioThumbnail(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBiography(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBirthCity(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBirthCountry(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBirthDate(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCreatedTimeStamp(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDeathCity(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDeathState(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setEducation(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setEthnicity(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setInductionDate(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setFullName(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setNameFullFirst(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setNameFullFirstLetter(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setNameFullLast(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(Wofhonorees entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(Wofhonorees entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
