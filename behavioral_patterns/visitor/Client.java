package behavioral_patterns.visitor;

import java.util.List;
import java.util.stream.LongStream;

public class Client {
    public static void main(String[] args) {
        FixedPriceContract project1 = new FixedPriceContract(10000);
        SupportedContract project2 = new SupportedContract(500);
        TimeAndMaterialContract project3 = new TimeAndMaterialContract(150, 10);
        TimeAndMaterialContract project4 = new TimeAndMaterialContract(50, 50);

        List<ReportElement> contracts = List.of(project1, project2, project3, project4);

        YearlyReport yearlyReport = new YearlyReport();
        MonthlyReport monthlyReport = new MonthlyReport();

        long monthlyCost = contracts.stream().flatMapToLong(c -> LongStream.of(c.accept(monthlyReport))).sum();
        long yearlyCost = contracts.stream().flatMapToLong(c -> LongStream.of(c.accept(yearlyReport))).sum();

        System.out.println("Monthly cost: %d \nYearly cost: %d".formatted(monthlyCost, yearlyCost));
    }
}
