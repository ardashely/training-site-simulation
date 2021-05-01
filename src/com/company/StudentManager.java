package com.company;

public class StudentManager {

    public void add(Student studnet) {
        System.out.println("Sisteme" + studnet + "tipinde bir kullanıcı eklendi");
        System.out.println("ID" + studnet.getID());
        System.out.println("İsim Soyisim" + studnet.getName());
        System.out.println("Kimlik Numarası" + studnet.getIdentificationNumber());
        System.out.println("Eğitim Durumu" + studnet.getEducationStatus());
    }

}