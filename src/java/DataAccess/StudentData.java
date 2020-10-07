
package DataAccess;

import PoJo.Student;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentData {
    
    Scanner sc=new Scanner(System.in);
    
    @Autowired
    SessionFactory sessionFactory;
    
    public void addStudent(Student student){
        Session session=this.sessionFactory.getCurrentSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        tx.commit();
    }
   
    public List<Student> displayStudent(){
          Session session=this.sessionFactory.getCurrentSession();
        Transaction tx=session.beginTransaction();
        List<Student> studentList=session.createQuery("from Student").list();
        tx.commit();
           return studentList;          
      }
    
     public Student getStudent(int id){
        
        Session session=this.sessionFactory.getCurrentSession();
        Transaction tx=session.beginTransaction();
     Student s=(Student)session.load(Student.class,new Integer(id));
          tx.commit();
        return s;
     }
     
     public void deleteStudent(int id){
        
        Session session=this.sessionFactory.getCurrentSession();
        Transaction tx=session.beginTransaction();

     Student s=(Student)session.load(Student.class,new Integer(id));
         if(null!=s){
             session.delete(s);
         }          
     tx.commit();
}  
   
   public void updateStudent(Student student){
        
        Session session=this.sessionFactory.getCurrentSession();
        Transaction tx=session.beginTransaction();
             session.update(student);
           tx.commit();
}  
}
