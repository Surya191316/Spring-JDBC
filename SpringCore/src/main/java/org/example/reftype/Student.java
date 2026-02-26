package org.example.reftype;

import org.springframework.context.annotation.ScopeMetadataResolver;

public class Student {
    private Scores scores;

    @Override
    public String toString() {
        return "Student{" +
                "scores=" + scores +
                '}';
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    public Student(Scores scores) {
        this.scores = scores;
    }

    public Student() {
    }
}
