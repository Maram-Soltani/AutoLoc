package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Vehicule;
import org.example.autoloc.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeServiceImp implements IVehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> consulterVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule consulterVehiculeById(long idVehicule) {
        return vehiculeRepository.findById(idVehicule).orElse(null);
    }

    @Override
    public void supprimerVehiculeById(long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }
}
