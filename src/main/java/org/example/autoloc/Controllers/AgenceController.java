
package org.example.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.example.autoloc.entities.Agence;
import org.example.autoloc.services.IAgenceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private IAgenceService agenceService;

    @PostMapping("/ajoute")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @GetMapping("/getAll")
    public List<Agence> getAllAgences() {
        return agenceService.consulterAgences();
    }

    @GetMapping("/getById/{idAgence}")
    public Agence getAgenceById(@PathVariable Long idAgence) {
        return agenceService.consulterAgenceById(idAgence);
    }

    @PutMapping("/update")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @DeleteMapping("/delete/{idAgence}")
    public void deleteAgence(@PathVariable Long idAgence) {
        agenceService.supprimerAgenceById(idAgence);
    }
}
