package eu.europa.ec.grow.espd.criteria.enums;

import eu.europa.ec.grow.espd.criteria.CcvLegislation;
import lombok.Getter;

/**
 * Created by vigi on 11/18/15:11:26 AM.
 */
@Getter
public enum LegislationReference implements CcvLegislation {

    /**
     *
     */
    DIRECTIVE_2014_24_EU_57_1("Directive 2014/24/EU", "On public procurement and repealing Directive 2004/18/EC",
            "http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=celex:32014L0024", "57(1)"),
    /**
     *
     */
    DIRECTIVE_2014_24_EU_57_2("Directive 2014/24/EU", "On public procurement and repealing Directive 2004/18/EC",
            "http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=celex:32014L0024", "57(2)"),
    /**
     *
     */
    DIRECTIVE_2014_24_EU_57_4("Directive 2014/24/EU", "On public procurement and repealing Directive 2004/18/EC",
            "http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=celex:32014L0024", "57(4)"),
    /**
     *
     */
    DIRECTIVE_2014_24_EU_58_2("Directive 2014/24/EU", "On public procurement and repealing Directive 2004/18/EC",
            "http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=celex:32014L0024", "58(2)"),
    /**
     *
     */
    DIRECTIVE_2014_24_EU_58_3("Directive 2014/24/EU", "On public procurement and repealing Directive 2004/18/EC",
            "http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=celex:32014L0024", "58(3)");

    private final String title;

    private final String description;

    private final String url;

    private final String article;

    LegislationReference(String title, String description, String url, String article) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.article = article;
    }

}