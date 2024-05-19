import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int months = service.calculate(income, expenses, threshold);
        System.out.println(months + " месяца, получится отдохнуть в следующем году");
    }
}