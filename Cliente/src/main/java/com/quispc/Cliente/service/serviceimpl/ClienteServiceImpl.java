package com.quispc.Cliente.service.serviceimpl;

import com.quispc.Cliente.entity.Cliente;
import com.quispc.Cliente.repository.ClienteRepository;
import com.quispc.Cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl  implements ClienteService {

    @Autowired
    private ClienteRepository clienteRespository;
    @Override
    public List<Cliente> listar() {
        return clienteRespository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRespository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteRespository.save(cliente);
    }

    @Override
    public Optional<Cliente> listarPorId(Integer id) {
        return clienteRespository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        clienteRespository.deleteById(id);
    }
}

