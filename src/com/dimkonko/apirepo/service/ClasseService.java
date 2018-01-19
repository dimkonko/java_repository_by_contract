package com.dimkonko.apirepo.service;

import com.dimkonko.apirepo.Models;
import com.dimkonko.apirepo.WgException;
import com.dimkonko.apirepo.repository.Repository;
import com.dimkonko.apirepo.repository.specs.ClasseSpecs;

import java.util.Map;

public class ClasseService {

    // @Resource (aka)
    private final Repository<Models.Classe> repo = new Repository<>();

    public Object createClasse(Map fields) throws WgException {
        return repo.execute(new ClasseSpecs.CreateClasseSpec(fields));
    }

    public Object getClasse(String uid) throws WgException {
        return repo.execute(new ClasseSpecs.GetClasseSpec(uid));
    }
}
