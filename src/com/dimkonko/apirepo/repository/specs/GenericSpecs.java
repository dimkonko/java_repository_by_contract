package com.dimkonko.apirepo.repository.specs;

public class GenericSpecs {

    static abstract class GenericGetResourceSpec<T> implements RepositorySpec<T> {

        protected final String uid;
        protected final String entityName;

        protected GenericGetResourceSpec(String uid, String entityName1) {
            this.uid = uid;
            this.entityName = entityName1;
        }

        @Override
        public StringBuilder getErrorMsg() {
            return new StringBuilder("Error getting ")
                    .append(this.entityName)
                    .append(" entity with UID: ")
                    .append(this.uid);
        }
    }
}
