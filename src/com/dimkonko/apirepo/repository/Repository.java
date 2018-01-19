package com.dimkonko.apirepo.repository;

import com.dimkonko.apirepo.Client;
import com.dimkonko.apirepo.WgException;
import com.dimkonko.apirepo.repository.specs.RepositorySpec;

public class Repository<T> {

    protected final Client client = new Client();

//        abstract T create(Map fields);
//        abstract T update(String uid, Map fields);
//        abstract void delete(String uid, Map fields);

    public T execute(RepositorySpec<T> spec) throws WgException {
        try {
            return spec.callResource(this.client);
        } catch(Exception e) {
            StringBuilder builder = spec.getErrorMsg().append(" >> wrapped error");

            throw new WgException(builder.toString(), e);
        }
    }
}
