package Tour;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Tour {
    private String kindOfTour;

    // Constructor
    public Tour() {}

    // Methods
    public String getKindOfTour() {
        return kindOfTour;
    }

    public void setKindOfTour(String kindOfTour) {
        this.kindOfTour = kindOfTour;
    }

    public String startTheTour() {
        if (kindOfTour != null && kindOfTour.equals("city")) {
            // Return JSF page name. JSF will automatically append .xhtml on the string.
            return "city_tour";
        }
        else {
            return "country_tour";
        }
    }
}
