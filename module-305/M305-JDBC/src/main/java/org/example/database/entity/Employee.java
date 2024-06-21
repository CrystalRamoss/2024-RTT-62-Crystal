package org.example.database.entity;
import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@Entity
@Table(name = "employees")

public class Employee {

    @Id //this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is telling hibernate that the pk is auto incremented
    @Column(name = "id")
    private Integer id;

    @Column(name = "office_id")
    private String officeId;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private Integer reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private Integer vacationHours;

    @Column(name = "profile_image_url")
    private String profileImportUrl;
}
