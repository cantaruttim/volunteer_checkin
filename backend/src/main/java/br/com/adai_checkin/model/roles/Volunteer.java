package br.com.adai_checkin.model.roles;

import java.time.LocalDate;

public abstract class Volunteer {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String campus;
    private String phone;
    private String address;

    public Volunteer() {}

    public Volunteer(
        Long id,
        String name,
        LocalDate birthDate,
        String campus,
        String phone,
        String address
    ) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.campus = campus;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getCampus() { return campus; }
    public void setCampus(String campus) { this.campus = campus; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    
    protected String baseToString() {
        return "id=" + id +
               ", name='" + name + '\'' +
               ", birthDate=" + birthDate +
               ", campus='" + campus + '\'' +
               ", phone='" + phone + '\'' +
               ", address='" + address + '\'';
    }

}
