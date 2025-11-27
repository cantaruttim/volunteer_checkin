package br.com.adai_checkin.model.forms;
import java.time.LocalDate;

public class FormsToServe {

    private Long id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private String daysOfServices;
    private boolean specialEvents;

    public FormsToServe() {}

    public FormsToServe(
        Long id,
        String name,
        String email,
        LocalDate birthDate,
        String daysOfServices,
        boolean specialEvents
        ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.daysOfServices = daysOfServices;
        this.specialEvents = specialEvents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDaysOfServices() {
        return daysOfServices;
    }

    public void setDaysOfServices(String daysOfServices) {
        this.daysOfServices = daysOfServices;
    }

    public boolean isSpecialEvents() {   // para boolean → "is" é o padrão Java
        return specialEvents;
    }

    public void setSpecialEvents(boolean specialEvents) {
        this.specialEvents = specialEvents;
    }
}
