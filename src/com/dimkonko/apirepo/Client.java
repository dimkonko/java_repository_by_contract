package com.dimkonko.apirepo;

import java.util.Map;

public class Client {

    /* Classes */

    public Models.Classe createClasse(Map fields) {
        return new Models.Classe();
    }

//    public Models.Classe updateClasse(String uid, Map fields) {
//        return new Models.Classe();
//    }

    public Models.Classe getClasse(String uid) {
        return new Models.Classe();
    }

    /* Students */

    public Models.Student createStudent(Map fields, String instUid) {
        return new Models.Student();
    }

//    public Models.Student updateStudent(String uid, Map fields) {
//        return new Models.Student();
//    }

    public Models.Student getStudent(String uid) {
        return new Models.Student();
    }
}
