package com.navi.studentdata.daoInterface;

import com.navi.studentdata.model.Student;

import java.util.List;

public interface DaoInterface {
    public List<Student> getAll();
    // will be returning the List of Students

    public int save(String[] params);
    // will be returning the no. of rows affected

    public int update(int id, String[] params);
    // will be returning the no. of rows affected

    public int delete(int id);
    // will be returning the no. of rows affected


}
