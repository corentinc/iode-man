package fr.istic.iodeman.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import fr.istic.iodeman.model.Room;
import fr.istic.iodeman.model.TimeBox;

public interface TimeBoxDAO {
	public Session openCurrentSession();

	public Session openCurrentSessionwithTransaction();

	public void closeCurrentSession();

	public void closeCurrentSessionwithTransaction();

	SessionFactory getSessionFactory();

	public Session getCurrentSession();

	public void setCurrentSession(Session currentSession);

	public Transaction getCurrentTransaction();
	
	public void setCurrentTransaction(Transaction currentTransaction);
	
	public void persist(TimeBox r);

	public void update(TimeBox r) ;
	
	public TimeBox findById(int id);

	public void delete(TimeBox r) ;

	@SuppressWarnings("unchecked")
	public List<TimeBox> findAll();

	public void deleteAll();
}