package com.navi.studentdata.dao;

import com.navi.studentdata.daoInterface.DaoInterface;

import com.navi.studentdata.model.Studentdata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class StudentDao implements DaoInterface {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();


    private EntityTransaction transactionOn() {
        transaction.begin();
        return transaction;
    }

    private void transactionOff() {
        transaction.commit();
        if (transaction.isActive()) {
            transaction.rollback();
        }
        entityManager.clear();
        entityManagerFactory.close();
    }

    @Override
    public List<Studentdata> getAll() {
        return null;
    }


    @Override
    public int save(String[] params) {
        transactionOn();

        Studentdata studentdata = new Studentdata();
        studentdata.setName(params[1]);
        studentdata.setMatri(Integer.parseInt(params[0]));
        studentdata.setCourse(params[2]);
        entityManager.persist(studentdata);
        transactionOff();
        return 0;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }
}
