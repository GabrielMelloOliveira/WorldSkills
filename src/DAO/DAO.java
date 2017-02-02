package DAO;

import Connection.Hibernate;
import Model.*;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel
 */
public class DAO {
    
    Hibernate connection = new Hibernate();;
    Session sessao;
    
    void DAO(){
        sessao = connection.getConnection().openSession();
    }
    
    public boolean add(MDAO a){
        Transaction tx = sessao.beginTransaction();
        sessao.save(a);
        tx.commit();
        sessao.close();
        return true;
    }
    
    public boolean update(MDAO a){
        Transaction tx = sessao.beginTransaction();
        sessao.update(a);
        tx.commit();
        sessao.close();
        return true;
    }
    
    public boolean remove(MDAO a){
        Transaction tx = sessao.beginTransaction();
        sessao.delete(a);
        tx.commit();
        sessao.close();
        return true;
    }
    
    public List<Charity> getList_Charity(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Charity");
        List<Charity> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Country> getList_Country(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Country");
        List<Country> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Event> getList_Event(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Event");
        List<Event> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<EventType> getList_EventType(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from EventType");
        List<EventType> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Gender> getList_Gender(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Gender");
        List<Gender> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Marathon> getList_Marathon(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Marathon");
        List<Marathon> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Position> getList_Position(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Position");
        List<Position> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<RaceKitOption> getList_RaceKitOption(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from RaceKitOption");
        List<RaceKitOption> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Registration> getList_Registration(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Registration");
        List<Registration> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<RegistrationEvent> getList_RegistrationEvent(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from RegistrationEvent");
        List<RegistrationEvent> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<RegistrationStatus> getList_RegistrationStatus(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from RegistrationStatus");
        List<RegistrationStatus> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Role> getList_Role(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Role");
        List<Role> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Runner> getList_Runner(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Runner");
        List<Runner> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Sponsorship> getList_Sponsorship(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Sponsorship");
        List<Sponsorship> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Staff> getList_Staff(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Staff");
        List<Staff> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Timesheet> getList_Timesheet(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Timesheet");
        List<Timesheet> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<User> getList_User(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from users");
        List<User> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public List<Volunteer> getList_Volunteer(){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from Volunteer");
        List<Volunteer> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
    
    public void fechaConnections(){
        sessao.close();
    }
    
}
