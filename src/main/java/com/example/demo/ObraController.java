package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ObraDAO;
import com.example.demo.model.Obra;

@RestController
public class ObraController {
    @CrossOrigin(origins = "*")
    @GetMapping("/obra")
    public List<Obra> listarObras() {
        ObraDAO obraDAO = new ObraDAO();
        return obraDAO.listar();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/obra/agregar")
    public void addObras(@RequestBody String titulo, String descripcion, String img) {
        Obra obra = new Obra(titulo, descripcion, img);

        ObraDAO obraDAO = new ObraDAO();
        obraDAO.add(obra);

    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/obra/eliminar/{id}")
    public void delObra(@PathVariable("id") Integer id) {
        Obra obra = new Obra(id);

        ObraDAO obraDAO = new ObraDAO();
        obraDAO.del(obra);

    }
}
