package objectConstructor;

import org.testng.annotations.Test;

public class ContBancarTest {
    @Test
    public void metodaContBancarTest() {
        System.out.println("==== Exemplul 1 ====");
        ContBancar contValid = new ContBancar("Gabriel", 150.55);
        contValid.infoCont();
        System.out.println("==== Exemplul 2 ====");
        ContBancar contInvalid = new ContBancar("Mita", 70.55);
        contInvalid.infoCont();
    }
}
