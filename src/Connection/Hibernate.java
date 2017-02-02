package Connection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Gabriel
 */
public class Hibernate {
 
    public SessionFactory connection = getConnection();
    
    public SessionFactory getConnection(){
        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        SessionFactory sessao = cfg.buildSessionFactory(build.build());
        return sessao;
    }
    
}
