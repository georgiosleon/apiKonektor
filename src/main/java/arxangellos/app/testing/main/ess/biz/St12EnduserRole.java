package arxangellos.app.testing.main.ess.biz;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.Generated;

@Generated("by generation tool")
public enum St12EnduserRole {
    _5000_EUR_21A_VISA_AUTHORITIES("5000", "EUR 21A – Visa Authorities"),

    _5001_EUR_21B_VISA_AUTHORITIES_WITH_PASSIVE_ACCESS_TO_VIS("5001", "EUR 21B – Visa Authorities (with passive access to VIS)"),

    _5002_EUR_22_BORDER_AUTHORITIES("5002", "EUR 22 – Border Authorities"),

    _5003_EUR_22A_MANUAL_BORDER_CONTROL_FIRST_LINE("5003", "EUR 22A - Manual Border Control First Line"),

    _5004_EUR_22B_AUTOMATED_BORDER_CONTROL("5004", "EUR 22B - Automated Border Control"),

    _5005_EUR_22C_MANUAL_BORDER_CONTROL_SECOND_LINE("5005", "EUR 22C - Manual Border Control Second Line"),

    _5006_EUR_23_IMMIGRATION_AUTHORITIES("5006", "EUR 23 – Immigration Authorities"),

    _5007_EUR_24_LAW_ENFORCEMENT_AUTHORITIES("5007", "EUR 24 – Law Enforcement Authorities"),

    _5008_EUR_25_EUROPOL("5008", "EUR 25 – EUROPOL"),

    _5009_EUR_26_CONTROLLER_AUTHORITY("5009", "EUR 26 – Controller Authority"),

    _5010_EUR_27_ETIAS_NATIONAL_UNIT("5010", "EUR 27 - ETIAS National Unit"),

    EMPTY("-1", "");

    public static final St12EnduserRole EUR_27_ETIAS_NATIONAL_UNIT = St12EnduserRole._5010_EUR_27_ETIAS_NATIONAL_UNIT;

    private static final String SEPARATOR = ".";

    private static final Map<String, St12EnduserRole> CODE2ENUM = Stream.of(St12EnduserRole.values()).collect(Collectors.toUnmodifiableMap(e -> e.getFullCode(), e -> e));

    private final String code;

    private final String label;

    St12EnduserRole(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getFullCode() {
        return code;
    }

    public static Optional<St12EnduserRole> fromCode(String code) {
        return Optional.ofNullable(CODE2ENUM.get(code));
    }

    public String toString() {
        return getFullCode();
    }
}
