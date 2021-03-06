package com.frodo.app.framework.orm;

import com.frodo.app.framework.context.MicroContext;
import com.frodo.app.framework.toolbox.TextUtils;

/**
 * Created by frodo on 2015/9/6.
 */
public final class DaoConfig {
    private MicroContext context;
    private String dbName = "framework.db"; // default db name
    private int dbVersion = 1;
    private DbUpgradeListener dbUpgradeListener;

    private String dbDir;

    public DaoConfig(MicroContext context) {
        this.context = context;
    }

    public MicroContext getMicroContext() {
        return context;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        if (!TextUtils.isEmpty(dbName)) {
            this.dbName = dbName;
        }
    }

    public int getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(int dbVersion) {
        this.dbVersion = dbVersion;
    }

    public DbUpgradeListener getDbUpgradeListener() {
        return dbUpgradeListener;
    }

    public void setDbUpgradeListener(DbUpgradeListener dbUpgradeListener) {
        this.dbUpgradeListener = dbUpgradeListener;
    }

    public String getDbDir() {
        return dbDir;
    }

    /**
     * set database dir
     *
     * @param dbDir If dbDir is null or empty, use the app default db dir.
     */
    public void setDbDir(String dbDir) {
        this.dbDir = dbDir;
    }
}
