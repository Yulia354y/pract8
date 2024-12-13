import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        schedule.addEvent(new Event("Нарада", LocalDateTime.of(2024, 12, 20, 10, 30), "Офіс"));
        schedule.addEvent(new Event("Презентація проекту", LocalDateTime.of(2024, 12, 21, 15, 0), "Конференц-зал"));
        schedule.addEvent(new Event("День народження", LocalDateTime.of(2024, 12, 19, 18, 0), "Ресторан"));
        schedule.addEvent(new Event("Спортивний захід", LocalDateTime.of(2024, 12, 18, 9, 0), "Стадіон"));


        System.out.println("Всі заходи:");
        schedule.printAllEvents();


        LocalDate filterDate = LocalDate.of(2024, 12, 20);
        System.out.println("Заходи на дату " + filterDate + ":");
        List<Event> eventsByDate = schedule.getEventsByDate(filterDate);
        for (Event event : eventsByDate) {
            System.out.println(event);
        }

        // Видалення минулих заходів
        System.out.println("Видалення минулих заходів...");
        schedule.removePastEvents();


        System.out.println("Оновлений розклад:");
        schedule.printAllEvents();
    }
}
