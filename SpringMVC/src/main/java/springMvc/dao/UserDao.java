package springMvc.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springMvc.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@org.springframework.transaction.annotation.Transactional
	public int saveUser(User user) {
		
		
		int id=(Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
