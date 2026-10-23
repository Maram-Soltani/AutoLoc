
package org.example.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Vehicule;
import org.example.autoloc.services.IVehiculeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/ajoute")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @GetMapping("/getAll")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.consulterVehicules();
    }

    @GetMapping("/getById/{idVehicule}")
    public Vehicule getVehiculeById(@PathVariable Long idVehicule) {
        return vehiculeService.consulterVehiculeById(idVehicule);
    }

    @PutMapping("/update")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/delete/{idVehicule}")
    public void deleteVehicule(@PathVariable Long idVehicule) {
        vehiculeService.supprimerVehiculeById(idVehicule);
    }
}
