package org.example.autoloc.entities;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;
    String nom;
    String Ville;
    String adresse;
    String Telephone;
    @OneToMany(mappedBy = "agence")
    private List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules = new ArrayList<>();
}
