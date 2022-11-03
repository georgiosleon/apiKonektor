package arxangellos.app.testing.main.ess.biz;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.Generated;

@Generated("by generation tool")
public enum St504OperationVariant {
    _5001_USE_OF_DATA_FOR_VERIFICATION_AT_THE_BORDERS("5001", "Use of data for verification at the borders"),

    _5002_ACCESS_TO_DATA_FOR_VERIFICATION_WITHIN_THE_TERRITORY("5002", "Access to data for verification within the territory"),

    _5003_AUTHORISATION_FOR_SHORT_STAY_IS_REVOKED_ANNULLED_OR_EXTENDED("5003", "Authorisation for short stay is revoked, annulled or extended"),

    _5004_REBUTTAL_OF_THE_PRESUMPTION_THAT_THE_THIRD_COUNTRY_NATIONAL_DOES_NOT_FULFIL_THE_CONDITIONS_OF_DURATION_OF_AUTHORISED_STAY("5004", "Rebuttal of the presumption that the third country national does not fulfil the conditions of duration of authorised stay"),

    _5005_EXAMINING_AND_DECIDING_ON_VISAS("5005", "Examining and deciding on visas"),

    _5006_EXAMINING_APPLICATIONS_FOR_ACCESS_TO_NATIONAL_FACILITATION_PROGRAMMES("5006", "Examining applications for access to national facilitation programmes"),

    _5007_ACCESS_TO_DATA_FOR_LAW_ENFORCEMENT_PURPOSES("5007", "Access to data for law enforcement purposes"),

    _5008_ACCESS_TO_DATA_BY_EUROPOL("5008", "Access to data by Europol"),

    _5009_AMENDMENT_OF_DATA("5009", "Amendment of data"),

    _5010_DATA_RETENTION("5010", "Data retention"),

    _5011_INFORMATION_MECHANISM("5011", "Information mechanism"),

    _5012_ADVANCE_DATA_ERASURE("5012", "Advance data erasure"),

    _5013_ACCESS_TO_DATA_FOR_IDENTIFICATION("5013", "Access to data for identification"),

    _5014_ENTRY_OF_DATA_BY_COMPETENT_AUTHORITIES("5014", "Entry of data by competent authorities"),

    _5015_MANAGEMENT_OF_AUTHORITIES("5015", "Management of authorities"),

    _5016_MANAGEMENT_OF_VHVE_MATRIX("5016", "Management of VH/VE matrix"),

    _5017_PRE_ENROLMENT_OF_DATA("5017", "Pre-Enrolment of data"),

    _5018_USE_OF_THE_EES_FOR_THE_MANUAL_PROCESSING_BY_ETIAS_NATIONAL_UNITS("5018", "Use of the EES for the manual processing by ETIAS National Units"),

    _5019_AUTHORISATION_FOR_SHORT_STAY_IS_ISSUED_REVOKED_ANNULLED_OR_EXTENDED_VIA_VIS("5019", "Authorisation for short stay is issued, revoked, annulled or extended via VIS"),

    _5020_EXAMINING_AND_DECIDING_ON_VISAS_VIA_VIS("5020", "Examining and deciding on visas via VIS"),

    _5021_ACCESS_TO_DATA_BY_EUROPOL_FOR_IDENTIFICATION("5021", "Access to data by Europol for identification"),

    _5022_ACCESS_TO_DATA_FOR_LAW_ENFORCEMENT_PURPOSES_FOR_IDENTIFICATION("5022", "Access to data for law enforcement purposes for identification"),

    _5023_ENTRY_OF_DATA_BY_VISA_OR_IMMIGRATION_AUTHORITIES("5023", "Entry of data by visa or immigration authorities"),

    EMPTY("-1", "");


    private static final String SEPARATOR = ".";

    private static final Map<String, St504OperationVariant> CODE2ENUM = Stream.of(St504OperationVariant.values()).collect(Collectors.toUnmodifiableMap(e -> e.getFullCode(), e -> e));

    private final String code;

    private final String label;

    St504OperationVariant(String code, String label) {
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

    public static Optional<St504OperationVariant> fromCode(String code) {
        return Optional.ofNullable(CODE2ENUM.get(code));
    }


    public String toString() {
        return getFullCode();
    }
}
