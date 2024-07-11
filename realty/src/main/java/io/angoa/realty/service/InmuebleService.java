package io.angoa.realty.service;

import io.angoa.realty.model.Inmueble;
import io.angoa.realty.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InmuebleService {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    public List<Inmueble> getAllInmuebles() {
        return inmuebleRepository.findAll();
    }

    public Optional<Inmueble> getInmuebleById(Long id) {
        return inmuebleRepository.findById(id);
    }

    public Inmueble createInmueble(Inmueble inmueble) {
        return inmuebleRepository.save(inmueble);
    }

    public Optional<Inmueble> updateInmueble(Long id, Inmueble inmuebleDetails) {
        return inmuebleRepository.findById(id).map(inmueble -> {
            inmueble.setNombre(inmuebleDetails.getNombre());
            inmueble.setDireccion(inmuebleDetails.getDireccion());
            inmueble.setTelefono(inmuebleDetails.getTelefono());
            inmueble.setCapacidadAforo(inmuebleDetails.getCapacidadAforo());
            return inmuebleRepository.save(inmueble);
        });
    }

    public void deleteInmueble(Long id) {
        inmuebleRepository.deleteById(id);
    }
}
