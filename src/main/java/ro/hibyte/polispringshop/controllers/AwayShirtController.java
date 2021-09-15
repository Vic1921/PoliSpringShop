
package ro.hibyte.polispringshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ro.hibyte.polispringshop.domain.AwayShirt;
import ro.hibyte.polispringshop.services.AwayShirtService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(AwayShirtController.BASE_URL)
public class AwayShirtController {

    public static final String BASE_URL = "/api/v1/away";

    private AwayShirtService awayShirtService;

    public AwayShirtController(AwayShirtService awayShirtService) {
        this.awayShirtService = awayShirtService;
    }

    protected AwayShirtController() {}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AwayShirt> getAllAwayShirts() {
        return awayShirtService.getAllAwayShirts();
    }


}
