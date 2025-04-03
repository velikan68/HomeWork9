package taxes;

public class USNTypeB extends TaxSystem {
    private static final double TAX_RATE = 0.15;

    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        if (profit < 0) {
            return 0; // Учитываем только положительную разницу
        }
        return (int) (profit * TAX_RATE);
    }
}