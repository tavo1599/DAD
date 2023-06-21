package com.quispc.Cliente.controller;

import com.quispc.Cliente.entity.Cliente;
import com.quispc.Cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> list(){
        return ResponseEntity.ok().body(clienteService.listar());
    }
    @PostMapping()
    public ResponseEntity<Cliente> save(@RequestBody Cliente producto) {
        return ResponseEntity.ok(clienteService.guardar(producto));
    }
    @PutMapping()
    public ResponseEntity<Cliente> update(@RequestBody Cliente producto) {
        return ResponseEntity.ok(clienteService.actualizar(producto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(clienteService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        clienteService.eliminarPorId(id);
        return "Eliminacion correcta";
    }
}
