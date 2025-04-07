package useraod;

import java.util.*;

import model.Restaraunt;

public interface Restarauntdao {
int insertRestaraunt(Restaraunt res);
List<Restaraunt> getAllres();
Restaraunt getResById(int id);
int deleteResById(int id);
int updateResById(int id,boolean isActive);

}
