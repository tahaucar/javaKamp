package day4Hw3Game;

import java.util.List;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
	Gamer get(int id);
	List<Gamer> getaAll();
}
