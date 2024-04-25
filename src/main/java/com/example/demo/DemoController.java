package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoRepository repository;

    @PostMapping
    public ResponseEntity<DemoEntity> addEntity(@RequestBody DemoEntity entity) {
        repository.save(entity);
        return ResponseEntity.ok().body(entity);
    }


    @GetMapping
    public ResponseEntity<List<DemoEntity>> getEntities() {
        List<DemoEntity> entityList = repository.findAll();
        return ResponseEntity.ok().body(entityList);
    }

    @GetMapping("/test")
    public String getStringus(){
        return "Deploy cu succes :)";
    }

}
