package cz.cvut.ear.clubevidence.rest;

import cz.cvut.ear.clubevidence.model.Alert;
import cz.cvut.ear.clubevidence.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/alerts")
public class AlertController {
    AlertService alertService;
    @Autowired
    public AlertController(AlertService alertService){
        this.alertService = alertService;
    }
}
