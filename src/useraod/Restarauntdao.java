package useraod;

import java.util.*;

import model.Restaraunt;

public interface Restarauntdao {
int insertRestaraunt(Restaraunt res);    //done
List<Restaraunt> getAllres();            //done
Restaraunt getResById(int id);              //inprogress
int deleteResById(int id);                  //inprogress
int updateResById(int id,boolean isActive);     //inprogress

}
