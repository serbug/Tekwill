public class ContractEmployee extends Employee {
    protected long payPerHour;
    protected String contractPeriod;

    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        super(name, birthDate);
        this.payPerHour = payPerHour;
        this.contractPeriod = contractPeriod;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "payPerHour=" + payPerHour +
                ", contractPeriod='" + contractPeriod + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}