package com.dimkonko.apirepo.repository.specs;

import com.dimkonko.apirepo.Client;
import com.dimkonko.apirepo.Models;

import java.util.Map;

public class StudentSpecs {

    private static final String ENTITY_NAME = "Student";

    public static final class CreateStudentSpec implements RepositorySpec<Models.Student> {

        private final Map fields;
        private final String instUid;

        public CreateStudentSpec(Map fields, String instUid) {
            this.fields = fields;
            this.instUid = instUid;
        }

        @Override
        public Models.Student callResource(Client client) {
            return client.createStudent(this.fields, this.instUid);
        }

        @Override
        public StringBuilder getErrorMsg() {
            return new StringBuilder("Error creating ")
                    .append(ENTITY_NAME)
                    .append(" with fields: ")
                    .append(this.fields.toString());
        }
    }

    public static final class GetStudentSpec extends GenericSpecs.GenericGetResourceSpec<Models.Student> {

        public GetStudentSpec(String uid) {
            super(uid, ENTITY_NAME);
        }

        @Override
        public Models.Student callResource(Client client) {
            return client.getStudent(this.uid);
        }
    }
}
