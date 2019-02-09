package masum.com.roompersistencelibrary;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.lang.annotation.Target;
import java.util.List;

@Dao
public interface MyDatabaseDao {

    @Insert
    void insertUserData(User user);

    @Query("Select * from user")
    List<User> getData();


}
