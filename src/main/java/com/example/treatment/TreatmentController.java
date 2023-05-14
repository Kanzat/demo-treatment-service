package com.example.treatment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreatmentController {

    @GetMapping("/treatment")
    public String getTreatment() {
        return "Take two tablets of paracetamol";
    }

}
