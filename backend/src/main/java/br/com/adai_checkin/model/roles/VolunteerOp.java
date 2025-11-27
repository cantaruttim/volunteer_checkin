package br.com.adai_checkin.model.roles;

import java.time.LocalDate;

import br.com.adai_checkin.enums.Role;

public class VolunteerOp extends Volunteer {

    private Role role = Role.VOLUNTEER;

    public VolunteerOp(
        Long id,
        String name,
        LocalDate birthDate,
        String campus,
        String phone,
        String address
    ) {
        super(id, name, birthDate, campus, phone, address);
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "VolunteerOp{" +
                baseToString() +  
                ", role=" + role +
                '}';
    }

    
}
