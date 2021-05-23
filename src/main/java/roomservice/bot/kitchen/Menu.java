package roomservice.bot.kitchen;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Menu {
    private String imageUri;
    private String title;
    private String subtitle;
    private String description;
    @Singular
    private List<Food> dishes;
    @Singular("subMenu")
    private List<Menu> subMenus;

    @Data
    @Builder
    public static class Food {
        private String name;
        @Singular
        private List<String> aliases;
        private List<String> infoLabels;
        private String description;
        private double price;
        private String imageUri;
    }
}
