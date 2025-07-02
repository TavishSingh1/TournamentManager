package model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name", nullable = false)
    private String playerName;
}
