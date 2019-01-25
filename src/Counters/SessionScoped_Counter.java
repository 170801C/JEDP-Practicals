package Counters;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


@SessionScoped
@ManagedBean
public class SessionScoped_Counter {
    private int counter = 1;

    // Methods
    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
