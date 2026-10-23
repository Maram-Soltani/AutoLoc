package org.example.autoloc.services;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Employe;
import org.example.autoloc.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeServiceImp implements IEmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> consulterEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe consulterEmployeById(long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerEmployeById(long id) {
        employeRepository.deleteById(id);
    }
}
