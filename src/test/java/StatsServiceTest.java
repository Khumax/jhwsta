import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.khumax.sta.StatsService;


class StatsServiceTest {
    @Test
    public void checkSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSalesYear(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void checkAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSaleYear(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMaxSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMaxSaleMonth(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMinSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMinSaleMonth(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkBelowAverageSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcBelowAverageSaleMonth(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkHigherAverageSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcHigherAverageSaleMonth(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}