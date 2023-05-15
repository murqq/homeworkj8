package ru.netology.stats;

public class StatsService {
    public int calculateTotalSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(int[] sales) {
        int totalSales = calculateTotalSales(sales);
        double averageSales = (double) totalSales / sales.length;
        return averageSales;
    }

    public int calculatePeakMonth(int[] sales) {
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int calculateMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthsBelowAverage(int[] sales) {
        int count = 0;
        double average = calculateAverageSales(sales);
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsAboveAverage(int[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}