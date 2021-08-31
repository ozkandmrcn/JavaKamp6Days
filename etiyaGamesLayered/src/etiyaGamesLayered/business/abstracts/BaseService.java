package etiyaGamesLayered.business.abstracts;

import java.util.List;


public interface BaseService <T> {
	
	void add(T entity);
	List<T> getAll();
	void delete(T entity);
	void update(T entity);

}
