package nl.kars.topicuscasus.controller;

import nl.kars.topicuscasus.Service.ReceptService;
import nl.kars.topicuscasus.model.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/recepten")
public class ReceptController {

    @Autowired
    private ReceptService service;

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public String notFound(Exception ex) {
        ex.printStackTrace();
        return "An error occurred.";
    }

    @GetMapping
    public List<Recept> findAll() {
        return service.getRecepten();
    }

    @PostMapping
    public Recept postRecept(@RequestBody Recept recept) {
        return service.saveRecept(recept);
    }

}
