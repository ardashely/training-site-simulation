package com.company;

public class InstructorManager {
    public void add(Instructor instructor) {
        System.out.println("Sisteme" + instructor + "tipinde bir kullanıcı eklendi");
        System.out.println("ID" + instructor.getID());
        System.out.println("İsim Soyisim" + instructor.getName());
        System.out.println("Kimlik Numarası" + instructor.getIdentificationNumber());
        System.out.println("Kurum" + instructor.getInstitution());
        System.out.println("Uzmanlık Alanı" + instructor.getExpertise());
    }
}