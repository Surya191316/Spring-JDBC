package org.example.pph;

public class MyDAO {
    private String dbServer;

    public MyDAO(String dbServer) {
        this.dbServer = dbServer;
    }

    public MyDAO() {
    }

    public String getDbServer() {
        return dbServer;
    }

    public void setDbServer(String dbServer) {
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "MyDAO{" +
                "dbServer='" + dbServer + '\'' +
                '}';
    }
}
