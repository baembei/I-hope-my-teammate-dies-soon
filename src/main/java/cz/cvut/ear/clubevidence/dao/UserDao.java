package cz.cvut.ear.clubevidence.dao;

import cz.cvut.ear.clubevidence.model.Payment;
import cz.cvut.ear.clubevidence.model.User;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends BaseDao{
    public UserDao(){
        super(User.class);
    }
    public User findByUsername(String username) {
        try {
            return em.createNamedQuery("User.findByUsername", User.class).setParameter("username", username)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Payment> allPaymentsRecord(String username) {
        try {
            return em.createNamedQuery("PaymentsRecord", Payment.class).setParameter("username", username).getResultList();
        }catch (NoResultException e ){
            return null;
        }
    }
}