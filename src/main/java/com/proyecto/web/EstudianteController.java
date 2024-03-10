package com.proyecto.web;

import com.proyecto.dominio.Estudet;
import com.proyecto.dominio.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private StudentServices studentServices;

    @GetMapping("/all")
    public ResponseEntity<List<Estudet>> getAll(){

        return new ResponseEntity<>(studentServices.getAll(), HttpStatus.OK);
    }

    @GetMapping("{idEstud}")
    public ResponseEntity<Estudet> getById(@PathVariable int idEstud){

        return studentServices.getById(idEstud)
                .map(estudet -> new ResponseEntity<>(estudet, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Estudet> save(@RequestBody Estudet estudet){

        return new ResponseEntity<>(studentServices.save(estudet), HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{idEstud}")
    public ResponseEntity<Estudet> delete (@PathVariable int idEstud){

        if(studentServices.delete(idEstud)){

            return new ResponseEntity<>(HttpStatus.OK);
        }else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{idEstud}")
    public ResponseEntity<Estudet> update(@RequestBody Estudet estudet,@PathVariable int idEstud){
        return new ResponseEntity<>(studentServices.update(estudet,idEstud), HttpStatus.OK);
    }
}
