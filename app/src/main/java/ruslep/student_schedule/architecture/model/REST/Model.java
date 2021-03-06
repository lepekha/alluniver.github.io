package ruslep.student_schedule.architecture.model.REST;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Response;
import ruslep.student_schedule.architecture.model.entity.Contacts;
import ruslep.student_schedule.architecture.model.entity.Subject;
import ruslep.student_schedule.architecture.model.entity.User;
import rx.Observable;

/**
 * Created by Ruslan on 12.08.2016.
 */
public interface Model {


    Observable<Response<ResponseBody>> setSchedule(String phoneMD5, String schedule, boolean hide);

    Observable<Response<ResponseBody>> delete(String phoneMD5);

    Observable<Response<ResponseBody>> registerUser(String phoneMD5);

    Observable<List<Subject>> getSchedule(String phoneMD5, boolean mySchedule);
    Observable<List<User>> getUserSchedule(String phoneMD5, boolean mySchedule);

    Observable<List<Contacts>> getContacts(String contactsMD5);

}
