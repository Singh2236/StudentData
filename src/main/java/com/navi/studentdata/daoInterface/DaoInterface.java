package com.navi.studentdata.daoInterface;
import com.navi.studentdata.model.Studentdata;

import java.util.List;

public interface DaoInterface {
    public List<Studentdata> getAll();
    // will be returning the List of Students

    public int save(String[] params);
    // will be returning the no. of rows affected

    public int update();
    // will be returning the no. of rows affected

    public int delete();
    // will be returning the no. of rows affected


}
