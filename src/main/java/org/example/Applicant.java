package org.example;

public class Applicant {
    private String name;
    private int age;
    private String sex;
    private boolean isADegreeHolder;
    private int assessmentScore;

    public Applicant(String name, int age, String sex, boolean isADegreeHolder, int assessmentScore) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isADegreeHolder = isADegreeHolder;
        this.assessmentScore = assessmentScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return sex;
    }

    public boolean isADegreeHolder() {
        return isADegreeHolder;
    }

    public int getAssessmentScore() {
        return assessmentScore;
    }
}

