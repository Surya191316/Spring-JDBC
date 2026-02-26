package org.surya.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Resume {
    @Value("PTA")
    private String title;
    @Value("Cognizant")
    private String company;

    @Override
    public String toString() {
        return "Resume{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public Resume(String title, String company) {
        this.title = title;
        this.company = company;
    }

    public Resume() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
