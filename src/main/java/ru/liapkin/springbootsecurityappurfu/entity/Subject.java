package ru.liapkin.springbootsecurityappurfu.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SUBJECTS")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "weight")
    private int weight;

}
