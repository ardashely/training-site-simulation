package com.company;

public class Main {

    public static void main(String[] args) {

        Instructor instructor1 = new Instructor();

        instructor1.setID(1);
        instructor1.setName("Engin Demiroğ");
        instructor1.setIdentificationNumber("99999999999");
        instructor1.setInstitution("Kurum İsmi");
        instructor1.setExpertise("Uzmanlık Alanı");

        Student student1 = new Student();

        student1.setID(2);
        student1.setName("Arda Aydın");
        student1.setIdentificationNumber("99999999999");
        student1.setEducationStatus("Öğrenim Bilgisi");

        // Aksiyonlar

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);

    }

}