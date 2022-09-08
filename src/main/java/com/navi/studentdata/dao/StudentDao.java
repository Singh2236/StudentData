package com.navi.studentdata.dao;

import com.navi.studentdata.daoInterface.DaoInterface;
import com.navi.studentdata.model.Student;

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
    public List<Student> getAll() {
        return null;
    }

    @Override
    public int save(String[] params) {
        transactionOn();
        int id = Integer.parseInt(params[0]);
        int matri = Integer.parseInt(params[2]);
        String name = params[2];
        String course = params[3];


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
