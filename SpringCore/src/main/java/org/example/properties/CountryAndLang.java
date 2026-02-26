package org.example.properties;

import java.util.Properties;

public class CountryAndLang {
    private Properties candl;

    @Override
    public String toString() {
        return "CountryAndLang{" +
                "candl=" + candl +
                '}';
    }

    public CountryAndLang() {
    }

    public CountryAndLang(Properties candl) {
        this.candl = candl;
    }

    public Properties getCandl() {
        return candl;
    }

    public void setCandl(Properties candl) {
        this.candl = candl;
    }
}
