import java.util.*;

public class Tour {
    private Map<String, String> countries_cities = new HashMap<>();
    private List<String> cities = new ArrayList<>();
    private Set<String> unique_cities = new HashSet<>();

    public Tour() {
        countries_cities.put("Francja", "Paryż");
        countries_cities.put("Szwecja", "Sztokholm");
        countries_cities.put("Polska", "Warszawa");
        countries_cities.put("Rosja", "Moskwa");
        countries_cities.put("USA", "Waszyngton");
        countries_cities.put("Niemcy", "Barcelona");
        countries_cities.put("Grecja", "Ateny");
        cities.add("Wrocław");
        cities.add("Lizbona");
        cities.add("Berlin");
        cities.add("Kraków");
        cities.add("Warszawa");
        cities.add("Rzym");
        cities.add("Florencja");
        cities.add("Paryż");
        cities.add("Waszyngton");
        cities.add("Nowy Jork");
        cities.add("Wrocław");
        cities.add("Sztokholm");

        unique_cities.addAll(cities);
    }

    public void print_countries_cities() {
        System.out.println("Państwa ze swoimi stolicami:");
        for (Map.Entry<String, String> entry : countries_cities.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Czy zawiera Szwecję? " + countries_cities.containsKey("Szwecja"));
        System.out.println("Liczba państw: " + countries_cities.size());
    }

    public void print_cities() {
        System.out.println("Odwiedzone miasta:");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println("Czy zawiera Paryż? " + cities.contains("Paryż"));
        System.out.println("Liczba miast: " + cities.size());
    }

    public void print_unique_cities() {
        System.out.println("Unikalne miasta:");
        for (String city : unique_cities) {
            System.out.println(city);
        }
        System.out.println("Czy kolekcja zawiera Rzym? " + unique_cities.contains("Rzym"));
        System.out.println("Liczba unikalnych miast: " + unique_cities.size());
    }

    public static void main(String[] args) {
        Tour tour = new Tour();
        tour.print_countries_cities();
        tour.print_cities();
        tour.print_unique_cities();
    }
}