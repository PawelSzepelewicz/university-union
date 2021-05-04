package com.moshecorp.universityunion.model.user;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Getter
@Entity
@Table(name = "clients")
@NoArgsConstructor
public class Clients extends AbstractEntity {


    private String surname;
    private String name;
    private String patronymic;
    @Column(name="initials")
    private String initials;

    public Clients(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.initials =  String.valueOf(surname.charAt(0)) +
                String.valueOf(name.charAt(0)) + String.valueOf(patronymic.charAt(0));
    }

}

