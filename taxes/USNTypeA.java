package taxes;

//УСН доходы — налог 6% от доходов;
public class USNTypeA extends TaxSystem {
    private static final double TAX_RATE = 0.06;

    @Override
    public int calcTaxFor(int debit, int credit) {
        // налог от доходов 6%
        return (int) (debit * TAX_RATE);
    }
}