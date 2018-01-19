package com.dimkonko.apirepo.repository.specs;

import com.dimkonko.apirepo.Client;
import com.dimkonko.apirepo.Models;

import java.util.Map;

public class ClasseSpecs {

    public static final class CreateClasseSpec implements RepositorySpec<Models.Classe> {

        private final Map fields;

        public CreateClasseSpec(Map fields) {
            this.fields = fields;
        }

        @Override
        public Models.Classe callResource(Client client) {
            return client.createClasse(this.fields);
        }

        @Override
        public StringBuilder getErrorMsg() {
            return new StringBuilder("Error creating student with fields: ")
                    .append(this.fields.toString());
        }
    }

    public static final class GetClasseSpec extends GenericSpecs.GenericGetResourceSpec<Models.Classe> {

        public GetClasseSpec(String uid) {
            super(uid, "Classe");
        }

        @Override
        public Models.Classe callResource(Client client) {
            return client.getClasse(this.uid);
        }
    }
}
