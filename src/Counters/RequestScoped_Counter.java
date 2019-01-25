package Counters;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean
public class RequestScoped_Counter {
    private int counter = 1;

    // Methods
    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
