package com.navi.studentdata.service;

import com.navi.studentdata.daoInterface.DaoInterface;
import com.navi.studentdata.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentDao implements DaoInterface {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();


    private void transactionOn() {
        transaction.begin();
        //return transaction;
    }

    private void transactionOff() {
        transaction.commit();
        if (transaction.isActive()) {
            transaction.rollback();
        }
        entityManager.clear();
        entityManagerFactory.close();
    }

    //TODO: method to get the maximum id number

    @Override
    public List<Student> getAll() {
        transactionOn();
        List<Student> studentList = new ArrayList<>();
        //Todo: get maximum id number and replace with 5
        for (int i = 1; i <= 20; i++) {
            Student student = entityManager.find(Student.class, i);
            if (Objects.nonNull(student)) {
                studentList.add(student);
            }
        }
        transactionOff();
        return studentList;
    }


    @Override
    public int save(String[] params) {
        transactionOn();
        Student student = new Student();
        student.setName(params[0]);
        student.setCourse(params[1]);
        student.setMatri(Integer.parseInt(params[2]));
        entityManager.persist(student);
        transactionOff();
        return 0;
    }

    @Override
    public int update(int id, String[] params) {
        transactionOn();
        Student student = entityManager.find(Student.class, id);
        student.setName(params[0]);
        student.setCourse(params[1]);
        student.setMatri(Integer.valueOf(params[2]));
        transactionOff();
        return 0;
    }

    @Override
    public int delete(int id) {
        transactionOn();
        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);

        transactionOff();
        return 0;
    }
}
