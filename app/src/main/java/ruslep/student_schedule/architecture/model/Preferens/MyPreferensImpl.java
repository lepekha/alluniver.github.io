package ruslep.student_schedule.architecture.model.Preferens;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.sharedpreferences.Pref;

import ruslep.student_schedule.architecture.other.MyPrefs_;

/**
 * Created by Lepekha.R.O on 18.09.2016.
 */
@EBean(scope = EBean.Scope.Singleton)
public class MyPreferensImpl implements MyPreferens {

    @Pref
    MyPrefs_ myPrefs;

    @Override
    public void setAuth(boolean auth) {
        myPrefs.flagAuth().put(auth);
    }

    @Override
    public boolean getAuth() {
        return myPrefs.flagAuth().get();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        myPrefs.MyPhoneNumber().put(phoneNumber);
    }

    @Override
    public String getPhoneNumber() {
        return myPrefs.MyPhoneNumber().get();
    }

    @Override
    public void setInvertTypeOfWeek(boolean invertTypeOfWeek) {
        myPrefs.invertWeek().put(invertTypeOfWeek);
    }

    @Override
    public boolean getInvertTypeOfWeek() {
        return myPrefs.invertWeek().get();
    }

    @Override
    public void setTypeOfWeek(String typeOfWeek) {
        myPrefs.typeOfWeek().put(typeOfWeek);
    }

    @Override
    public String getTypeOfWeek() {
        return myPrefs.typeOfWeek().get();
    }

    @Override
    public void setRegistrations(boolean registrations) {
        myPrefs.flagRegistration().put(registrations);
    }

    @Override
    public boolean getRegistrations() {
        return myPrefs.flagRegistration().get();
    }

    @Override
    public void setID(int id) {
        myPrefs.id().put(id);
    }

    @Override
    public int getID() {
        return myPrefs.id().get();
    }
}