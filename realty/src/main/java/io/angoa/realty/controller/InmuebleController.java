package io.angoa.realty.controller;

import io.angoa.realty.model.Inmueble;
import io.angoa.realty.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inmuebles")
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;

    @GetMapping
    public List<Inmueble> getAllInmuebles() {
        return inmuebleService.getAllInmuebles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inmueble> getInmuebleById(@PathVariable Long id) {
        return inmuebleService.getInmuebleById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Inmueble createInmueble(@RequestBody Inmueble inmueble) {
        return inmuebleService.createInmueble(inmueble);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inmueble> updateInmueble(@PathVariable Long id, @RequestBody Inmueble inmuebleDetails) {
        return inmuebleService.updateInmueble(id, inmuebleDetails)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInmueble(@PathVariable Long id) {
        inmuebleService.deleteInmueble(id);
        return ResponseEntity.noContent().build();
    }
}
