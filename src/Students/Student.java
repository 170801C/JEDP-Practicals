package Students;

import sun.security.validator.ValidatorException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class Student {
    // Attributes
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String postalCode;
    private int freePasses;
    private String phoneNumber;
    private String courseCode;
    List<String> countryOptions;
    private String[] favouriteLanguages;

    // Constructor
    public Student() {
        countryOptions = new ArrayList<>();

        countryOptions.add("Brazil");
        countryOptions.add("France");
        countryOptions.add("Singapore");
        countryOptions.add("Italy");

        // Pre-populate fields
        firstName = "Mary";
        lastName = "Public";
        favouriteLanguages = new String[] {"C#", "Python"};
    }

    // Getter & Setter methods
    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getFavouriteLanguages() {
        return favouriteLanguages;
    }

    public void setFavouriteLanguages(String[] favouriteLanguages) {
        this.favouriteLanguages = favouriteLanguages;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

//    Custom validation
    public void validateCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value == null) {
            return;
        }

        String data = value.toString();

        if (!data.startsWith("LUV")) {
            // Validation message object
            FacesMessage message = new FacesMessage("Course code must start with LUV");
            context.addMessage(component.getClientId(context), message);
        }

//        This doesn't work
//        if (!data.startsWith("LUV")) {
//            FacesMessage message = new FacesMessage("Course code must start with LUV");
//
//            throw new ValidatorException(message);
//        }
    }
}
