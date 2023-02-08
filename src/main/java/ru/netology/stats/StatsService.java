package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }

        return totalSale;


    }

    public long averageSale(long[] sales) {
        long result = sumSales(sales);

        return result / sales.length;


    }

    public int monthMaximumSale(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumMonth = i;
                maximumSale = sales[i];


            }

        }
        return maximumMonth + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int minimumMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= maximumSale) {
                minimumMonth = i;
                maximumSale = sales[i];


            }

        }
        return minimumMonth + 1;

    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                counter++;

            }
        }
        return counter;

    }

    public int monthsUpperAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                counter++;

            }
        }
        return counter;

    }


}
