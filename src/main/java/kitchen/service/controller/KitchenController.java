package kitchen.service.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import kitchen.service.Menu;

@Controller("/kitchenservice")
public class KitchenController {

    @Get(uri = "/menu2")
    public Menu menu2() {
        return new Menu();
    }

}
