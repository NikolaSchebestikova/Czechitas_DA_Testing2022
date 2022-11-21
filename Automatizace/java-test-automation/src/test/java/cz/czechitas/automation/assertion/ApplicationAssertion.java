package cz.czechitas.automation.assertion;

import cz.czechitas.automation.ElementFinder;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Application specific assertions
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
@ParametersAreNonnullByDefault
public final class ApplicationAssertion {

    private final ElementFinder elementFinder;

    ApplicationAssertion(ElementFinder elementFinder) {
        this.elementFinder = Objects.requireNonNull(elementFinder);
    }


    public void overAdresuWwwStranky(String wwwAdresa) {
        var url = elementFinder.findByXPath("/html/body/div/div/div/div/div/div/div/div[1]/p[2]/a");
        assertThat(url.getText()).isEqualTo(wwwAdresa);
    }

    public void overZeVTabulcePrihlasekNeniZadnaZobrazena() {
        var applicationsCountElement = elementFinder.findByXPath("//*[@id=\"DataTables_Table_0_info\"]");
        assertThat(applicationsCountElement.getText()).contains("Žádné záznamy nenalezeny");
    }

    public void overZeVTabulcePrihlasekJePraveZobrazenych(int pocetPrihlasek) {
        var applicationsCountElement = elementFinder.findByXPath("//*[@id=\"DataTables_Table_0_info\"]");
        assertThat(applicationsCountElement.getText()).contains("Zobrazeno " + pocetPrihlasek + " až " + pocetPrihlasek +
                " záznamů z " + pocetPrihlasek);
    }



public void overSpravnyOdkazNavodyProUcitele(String odkaz) {
    var url = elementFinder.findByXPath("/html/body/div/div/div/div/div/div/ul/li/a");
            assertThat(url.getAttribute("href")).isEqualTo(odkaz);
}


    public void overTermin (String Termin) {
        var dateElement = elementFinder.findByXPath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/button/div/div/div");
        assertThat(dateElement.getText()).isEqualTo(Termin);
    }



}