package com.dimkonko.apirepo.repository.specs;

import com.dimkonko.apirepo.Client;

public interface RepositorySpec<T> {
    T callResource(Client client);
    StringBuilder getErrorMsg();
}
