package com.dimkonko.apirepo.service;

import com.dimkonko.apirepo.Models;
import com.dimkonko.apirepo.WgException;
import com.dimkonko.apirepo.repository.Repository;
import com.dimkonko.apirepo.repository.specs.StudentSpecs;

import java.util.Map;

public class StudentService {

    // @Resource (aka)
    private final Repository<Models.Student> repo = new Repository<>();

    public Object createStudent(Map fields, String instUid) throws WgException {
        return repo.execute(new StudentSpecs.CreateStudentSpec(fields, instUid));
    }

    public Object getStudent(String uid) throws WgException {
        return repo.execute(new StudentSpecs.GetStudentSpec(uid));
    }
}
