package springMvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMvc.model.Reservation;

@Repository
public class ReservationDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveRegistration(Reservation resv) {
		int id=(Integer)this.hibernateTemplate.save(resv);
		return id;
		
	}
	
}
