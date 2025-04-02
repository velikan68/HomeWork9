import taxes.USNTypeA;
import taxes.USNTypeB;

public class Main {
    public static void main(String[] args) {
        // Создаём компанию
        Company company1 = new Company("ООО 'Ёжик в Тумане'", new USNTypeA());
        Company company2 = new Company("АО 'АВТОВАЗ'", new USNTypeB());

        // Добавляем доходы и расходы
        company1.shiftMoney(100_000); // Доходы
        company1.shiftMoney(-50_000); // Расходы
        company2.shiftMoney(2_000_000); // Доходы
        company2.shiftMoney(-1_999_999); // Расходы

        //Плата налога
        company1.payTaxes();
        company2.payTaxes();

        //Смена налогообложения и плата
        company1.setTaxSystem(new USNTypeB());
        company1.shiftMoney(50_000);
        company1.shiftMoney(-10_000);
        company1.payTaxes();

        // Проверяем, что debit и credit обнулились
        System.out.println("Доходы ООО 'Ёжик в Тумане' после уплаты налогов: " + company1.getDebit()); // Доходы компании1 после уплаты налогов: 0
        System.out.println("Расходы ООО 'Ёжик в Тумане' после уплаты налогов: " + company1.getCredit()); // Расходы компании1 после уплаты налогов: 0
    }
}