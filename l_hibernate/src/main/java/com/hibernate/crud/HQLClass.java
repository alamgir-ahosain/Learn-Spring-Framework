package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.connection_provider.Hibernate;
import com.hibernate.entities.Student;

public class HQLClass {
    SessionFactory sessionFactory = Hibernate.getSessionFactory();

    // Read All
    public void getAllStudent() {
        try (Session session = sessionFactory.openSession()) {
            List<Student> students = session.createQuery("FROM Student", Student.class).list();
            if (!students.isEmpty()) {
                for (Student s : students) {
                    System.out.println(s);
                }
            } else {
                System.out.println("Empty");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Single Result
    public void getStudentById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Student student = session.createQuery("FROM Student where id=:studentId", Student.class)
                    .setParameter("studentId", id).uniqueResult();

            if (student != null) {
                System.out.println(student);

            } else {
                System.out.println("Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Multiple Result
    public void getAllStudentByName(String name) {
        try (Session session = sessionFactory.openSession()) {
            List<Student> students = session.createQuery("FROM Student where name=:studentName", Student.class)
                    .setParameter("studentName", name)
                    .list();

            if (!students.isEmpty()) {
                for (Student s : students) {
                    System.out.println(s);
                }
            } else {
                System.out.println("Not Found Any");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Update
    public void updateStudentById(int id, String name) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            int updatedCount = session.createMutationQuery("UPDATE Student SET name = :studentName WHERE id = :id")
                    .setParameter("studentName", name)
                    .setParameter("id", id)
                    .executeUpdate();

            if (updatedCount != 0) {
                System.out.println("No of Rows updated: " + updatedCount);
                transaction.commit();
            } else {
                System.out.println("Failed to update student with ID: " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete
    public void deleteStudentById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            int deletedCount = session.createMutationQuery("DELETE FROM Student  WHERE id = :studentId")
                    .setParameter("studentId", id)
                    .executeUpdate();

            if (deletedCount != 0) {
                System.out.println("No of Rows Deleted: " + deletedCount);
                transaction.commit();
            } else {
                System.out.println("Failed to Delete");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Pagination
    public void getAllStudentsPaginated(int pageNo, int pageSize) {
        try (Session session = sessionFactory.openSession()) {

            String hql = "FROM Student";
            Query<Student> query = session.createQuery(hql, Student.class);
            
            query.setFirstResult((pageNo - 1) * pageSize);
            query.setMaxResults(pageSize);

            List<Student> students = query.getResultList();
            if (!students.isEmpty()) {
                for (Student student : students) {
                    System.out.println(student);
                }
            } else {
                System.out.println("No students found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
