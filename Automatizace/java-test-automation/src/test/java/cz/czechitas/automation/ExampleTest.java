package cz.czechitas.automation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Example test class for functionality showcase
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
final class ExampleTest extends TestRunner {

    @Test
    void overKontaktniWwwAdresu() {
        prohlizec.horniMenu.jdiDoSekceKontakt();
        overeni.overAdresuWwwStranky("www.czechitas.cz");
    }

    @Test
    void overUspesnePrihlaseni() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("admin@czechitas-app.loc");
        prohlizec.prihlasovani.vyplnHeslo("Czechitas123");
        prohlizec.prihlasovani.provedPrihlaseni();
        overeni.overPrihlaseniUzivatele();
    }

@Test
void vyplnHeslo() {
    prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
    prohlizec.cekejNekolikVterin(5);
    prohlizec.prihlasovani.vypHeslo("Czechitas123");
    prohlizec.cekejNekolikVterin(5);
    prohlizec.prihlasovani.klikniNaPrihlasit();

}

@Test
void overUrlAdresuOdkazu() {
    prohlizec.horniMenu.jdiDoSekceNavodyAFormulareProUcitele();
    overeni.sekcePrihlasky.overSpravnyOdkazNavodyProUcitele("https://google.com/");
}
 @Test
    void navigace1() {
 prohlizec.horniMenu.jdiDoSekceObjednavkaProMSZS();
 prohlizec.sekceObjednavky.vyplnICO("22834958");
 prohlizec.cekejNekolikVterin(5);
 prohlizec.sekceObjednavky.vyberMoznostSkolaVPrirode();
 prohlizec.sekceObjednavky.vyplnPocetDeti(20);
 prohlizec.cekejNekolikVterin(5);
 }

    @Test
    void Assertace() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("nikolaschebestikova@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Nikola22");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        for (String s : Arrays.asList("Jméno", "Kategorie")) {
        }
    }
    @Test
    void komplexniTest1() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("nikolaschebestikova@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Nikola22");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        prohlizec.sekcePrihlasky.klikniNaVytvoreniNovePrihlasky();
        prohlizec.sekcePrihlasky.vyberObdobiProgramovani();
        prohlizec.sekcePrihlasky.klikniNaVytvoritPrihlasku();
        prohlizec.detailPrihlasky.vyberTermin("21.11.2021-30.11.2022");
        prohlizec.cekejNekolikVterin(5);
        prohlizec.detailPrihlasky.vyplnKrestniJmenoZaka("Nikca");
        prohlizec.detailPrihlasky.vyplnPrijmeniZaka("Schebik");
        prohlizec.detailPrihlasky.vyplnDatumNarozeni("19.9.2002");
        prohlizec.detailPrihlasky.vyplnPoznamku("Aloha");
        prohlizec.detailPrihlasky.zvolZpusobUhradyHotove();
        prohlizec.detailPrihlasky.klikniNaSouhlasSPodminkami();
        prohlizec.detailPrihlasky.klikniNaVytvoritPrihlasku();
        prohlizec.cekejNekolikVterin(5);
        overeni.detailPrihlasky.overKrestniJmeno("Nikca");
        overeni.detailPrihlasky.overPrijmeni("Schebik");
        overeni.detailPrihlasky.overDatumNarozeni("19.09.2002");
        overeni.detailPrihlasky.overPoznamku("Aloha");
        overeni.sekcePrihlasky.overTermin("21.11. - 30.11.2022");
    }
@Test
void komplexniTest3() {
    prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
    prohlizec.prihlasovani.vyplnEmail("nikolaschebestikova@seznam.cz");
    prohlizec.prihlasovani.vyplnHeslo("Nikola22");
    prohlizec.prihlasovani.provedPrihlaseni();
    prohlizec.horniMenu.jdiDoSekcePrihlasky();
    prohlizec.sekcePrihlasky.vyhledej("Test Tester001");
    prohlizec.cekejNekolikVterin(5);
    prohlizec.sekcePrihlasky.klikniNaUpravitUprvniPrihlasky();
    prohlizec.detailPrihlasky.zvolZpusobUhradyBankovnimPrevodem();
    prohlizec.detailPrihlasky.klikniNaUpravitPrihlasku();
    prohlizec.sekcePrihlasky.otevriDetailPrvniPrihlasky();
    overeni.detailPrihlasky.overZpusobUhradyPrihlasky("Bankovní převod");
    overeni.detailPrihlasky.overZbyvajiciCastkuKUhrazeni("1 500 Kč");
    overeni.detailPrihlasky.overZpravaProPrijemceObsahujePrijmeniZaka("Test Tester001");


}
    @Test
    void domaciukolCzechitas() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("nikola.schebestikova@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Nikola55");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.cekejNekolikVterin(5);
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        prohlizec.sekcePrihlasky.klikniNaVytvoreniNovePrihlasky();
        prohlizec.cekejNekolikVterin(5);
        prohlizec.sekcePrihlasky.vyberObdobiProgramovani();
        prohlizec.sekcePrihlasky.vyberKurzJava();
        prohlizec.cekejNekolikVterin(5);
        prohlizec.detailPrihlasky.vyberTermin("09.01. - 13.01.2023");
        prohlizec.detailPrihlasky.vyplnKrestniJmenoZaka("Adéla");
        prohlizec.detailPrihlasky.vyplnPrijmeniZaka("Schebestiková");
        prohlizec.detailPrihlasky.vyplnDatumNarozeni("21.1.2000");
        prohlizec.detailPrihlasky.zvolZpusobUhradyHotove();
        prohlizec.detailPrihlasky.vyplnPoznamku("Ahoj");
        prohlizec.detailPrihlasky.klikniNaVytvoritPrihlasku();
        prohlizec.cekejNekolikVterin(5);
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        overeni.overExistenciSloupce("Detail");
        prohlizec.cekejNekolikVterin(5);
        prohlizec.profil.otevriProfil();
        overeni.overJmenoProfilu("Fata Morgana");
        prohlizec.horniMenu.jdiDoSekceKontakt();
        overeni.overCastAdresy("Horní Dolní");
    }
}

