package demo.models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;
    public String NameOfBook;
    public String Author;
    public String Genre;
    public String Publisher;
    public LocalDate Year;
    public String Description;
}
