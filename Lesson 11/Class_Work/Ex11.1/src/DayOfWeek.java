public enum DayOfWeek {

    MONDAY("LUNI"),
    TUESDAY("MARTI"),
    WEDNESDAY("MIERCURI"),
    THURSDAY("JOI"),
    FRIDAY("VINERI"),
    SATURDAY("SAMBATA"),
    SUNDAY("DUMINICA");

    private final String mdName;

    DayOfWeek(String mdName) {
        this.mdName=mdName;
    }
}
