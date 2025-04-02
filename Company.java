import taxes.TaxSystem;

public class Company {

private String title;
private int debit;
private int credit;
private TaxSystem taxSystem;

// Конструктор класса
    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0; // Начальные доходы равны 0
        this.credit = 0; // Начальные расходы равны 0
        this.taxSystem = taxSystem; // Система налога
    }
    // Метод изменения доходов и расходов
    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }
    //Метод уплаты налога
    public void payTaxes() {
        int taxAmount = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог: " + taxAmount + " руб.");
        debit = 0; // Обнуляем доходы
        credit = 0; // Обнуляем расходы
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }
    public String getTitle() {
        return title;
    }
    public int getDebit() {
        return debit;
    }
    public int getCredit(){
        return credit;
    }
    public TaxSystem getTaxSystem(){
        return taxSystem;
    }
}
