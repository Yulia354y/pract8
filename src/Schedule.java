import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class Schedule {
    private List<Event> events;


    public Schedule() {
        events = new ArrayList<>();
    }


    public void addEvent(Event event) {
        events.add(event);
    }

    //  отримання заходів за датою
    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> filteredEvents = new ArrayList<>();
        for (Event event : events) {
            if (event.getDateTime().toLocalDate().equals(date)) {
                filteredEvents.add(event);
            }
        }
        return filteredEvents;
    }

    //видалення заходів
    public void removePastEvents() {
        LocalDateTime now = LocalDateTime.now();
        events.removeIf(event -> event.getDateTime().isBefore(now));
    }

    // вив всіх заходів
    public void printAllEvents() {
        if (events.isEmpty()) {
            System.out.println("Розклад порожній.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
}

