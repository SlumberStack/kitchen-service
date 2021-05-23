package roomservice.bot.kitchen.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import roomservice.bot.kitchen.Menu;

@Controller("/kitchenservice")
public class KitchenController {

    @Get(uri = "/menu")
    public Menu menu2() {
        return makeSampleMenu();
    }

    private Menu makeSampleMenu() {
        Menu appetiserMenu = Menu
                .builder()
                .title("Appetisers")
                .subtitle("Small bites to start off")
                .imageUri("https://images.pexels.com/photos/3662103/pexels-photo-3662103.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
                .description("Freshly prepared soups, bruschetta, and other starters.")
                .build();
        return Menu
                .builder()
                .title("RoomService Menu")
                .subtitle("Elegant in-room dining")
                .imageUri("https://images.pexels.com/photos/1030947/pexels-photo-1030947.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260")
                .description("Choose from our range of delicious dishes 24 hours a day")
                .subMenu(appetiserMenu)
                .build();
    }
}
