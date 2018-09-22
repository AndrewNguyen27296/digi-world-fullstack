package com.digiworld.demo.api;

import com.digiworld.demo.model.Ram;
import com.digiworld.demo.repository.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private RamRepository ramRepository;

    @RequestMapping("/test")
    public Iterable<Ram> getAll() {
        return ramRepository.findAll();
    }
}
