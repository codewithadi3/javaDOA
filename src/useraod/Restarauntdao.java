package useraod;

import java.util.*;

import model.Restaraunt;

public interface Restarauntdao {
int insertRestaraunt(Restaraunt res);    //done
List<Restaraunt> getAllres();            //done
Restaraunt getResById(int id);              //done
int deleteResById(int id);                  //done
int updateResById(int id,boolean isActive);     //inprogress

}
