package Counters;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean
public class ApplicationScoped_Counter {
    private int counter = 1;

    // Methods
    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
