package arxangellos.app.testing.main.ess.biz;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum St14ErrorCode {
    _0001_INVALID_SOAP("0001", "Invalid SOAP"),

    _0004_SERVICE_IS_NOT_ACTIVE("0004", "Service is not active."),

    _0005_USER_ROLE_DOES_NOT_EXIST("0005", "User role does not exist."),

    _0006_THE_USERROLE_HAS_NO_ACCESS_TO_THIS_SERVICE("0006", "The UserRole has no access to this service."),

    _0007_OPERATION_NOT_ALLOWED_ON_CHANNEL("0007", "Operation Not Allowed On Channel"),

    _0008_MESSAGE_NOT_COMPLIANT_WITH_XSD("0008", "Message Not Compliant with XSD."),

    _0009_INVALID_CODETABLE_IN_MESSAGE("0009", "Invalid CodeTable in Message."),

    _0012_INVALID_SOAP_ENCODING("0012", "Invalid SOAP encoding"),

    _0101_MANDATORY_FIELD_MISSING_IN_NIST("0101", "Mandatory field missing in NIST"),

    _0102_INVALID_RECORD_TYPE_IN_NIST("0102", "Invalid record type in NIST"),

    _0103_UNDEFINED_FIELD_IN_NIST("0103", "Undefined field in NIST"),

    _0104_EXCEEDS_THE_MAXIMUM_OCCURRENCE_IN_NIST("0104", "Exceeds the maximum occurrence in NIST"),

    _0105_INVALID_NUMBER_OF_SUBFIELDS_IN_NIST("0105", "Invalid number of subfields in NIST"),

    _0106_FIELD_LENGTH_TOO_SHORT_IN_NIST("0106", "Field length too short in NIST"),

    _0107_FIELD_LENGTH_TOO_LONG_IN_NIST("0107", "Field length too long in NIST"),

    _0108_FIELD_IS_NOT_A_NUMBER_AS_EXPECTED_IN_NIST("0108", "Field is not a number as expected in NIST"),

    _0109_FIELD_NUMBER_VALUE_TOO_SMALL_IN_NIST("0109", "Field number value too small in NIST"),

    _0110_FIELD_NUMBER_VALUE_TOO_BIG_IN_NIST("0110", "Field number value too big in NIST"),

    _0112_INVALID_DATE_IN_NIST("0112", "Invalid date in NIST"),

    _0114_INVALID_DATE_OR_TIME_IN_NIST("0114", "Invalid date or time in NIST"),

    _0115_INVALID_ITEM_VALUE_IN_NIST("0115", "Invalid item value in NIST"),

    _0116_INVALID_TYPE_OF_TRANSACTION_IN_NIST("0116", "Invalid type of transaction in NIST"),

    _0201_INVALID_TCN_TRANSACTION_CONTROL_NUMBER_IN_NIST("0201", "Invalid TCN (Transaction Control Number)  in NIST"),

    _0300_DATABASE_ERROR("0300", "DATABASE_ERROR"),

    _0301_IO_ERROR("0301", "IO_ERROR"),

    _0400_NOTIFICATION_ERROR("0400", "NOTIFICATION_ERROR"),

    _0501_INSUFFICIENT_FINGERPRINT_QUALITY("0501", "Insufficient fingerprint quality"),

    _0502_MISSING_FINGERPRINTS("0502", "Missing fingerprints"),

    _0891_TOO_MANY_FINGERPRINTS_OR_FINGER_POSITIONS_NOT_ALLOWED("0891", "Too many fingerprints or finger positions not allowed"),

    _0894_ONE_TO_ONE_MATCHING_FAILED("0894", "One-to-one matching failed"),

    _0899_NON_UNIQUENESS_OF_FINGERS("0899", "Non-uniqueness of fingers"),

    _0900_INSUFFICIENT_FACIAL_IMAGE_QUALITY("0900", "Insufficient facial image quality"),

    _0902_SAMPLE_NOT_FOUND("0902", "Sample not found"),

    _0903_BIOMETRIC_TYPE_DOES_NOT_MATCH("0903", "Biometric type does not match"),

    _0904_RESOLUTION_TOO_HIGH("0904", "Resolution too high"),

    _0905_RESOLUTION_TOO_LOW("0905", "Resolution too low"),

    _0906_UNREADABLE_IMAGE("0906", "Unreadable image"),

    _0907_FACE_OR_EYES_ARE_NOT_DETECTED("0907", "Face or eyes are not detected"),

    _0911_BIOMETRIC_TYPE_NOT_ALLOWED("0911", "Biometric type not allowed"),

    _0916_INVALID_PROVIDED_SAMPLES("0916", "Invalid provided sample(s)"),

    _1001_MANDATORY_FIELDS_EXCEPTION("1001", "MANDATORY_FIELDS_EXCEPTION"),

    _1004_VIS_IDENTIFIER_NOT_FOUND("1004", "VIS identifier not found"),

    _1005_NON_COHERENCE("1005", "NON_COHERENCE"),

    _1402_BIOMETRIC_NOT_KNOWN("1402", "BIOMETRIC_NOT_KNOWN"),

    _1405_WRONG_TYPE("1405", "WRONG_TYPE"),

    _1410_FINGERPRINTSET_TOO_LARGE("1410", "FINGERPRINTSET_TOO_LARGE"),

    _1412_FACIAL_IMAGE_TOO_LARGE("1412", "FACIAL_IMAGE_TOO LARGE"),

    _1413_FINGERPRINT_QUALITY_TOO_LOW("1413", "FINGERPRINT_QUALITY_TOO_LOW"),

    _1415_TOO_MANY_FINGERPRINTS("1415", "TOO_MANY_FINGERPRINTS"),

    _1416_NOT_A_FINGERPRINT("1416", "NOT_A_FINGERPRINT"),

    _1417_MISSING_FINGERPRINT("1417", "MISSING_FINGERPRINT"),

    _1418_INVALID_IMAGE("1418", "INVALID_IMAGE"),

    _1419_INVALID_NIST("1419", "INVALID_NIST"),

    _1420_INVALID_ITEM_VALUE("1420", "INVALID_ITEM_VALUE"),

    _1421_INVALID_DATE("1421", "INVALID_DATE"),

    _1422_INVALID_DATE_OR_TIME("1422", "INVALID_DATE_OR_TIME"),

    _1423_NUMBER_TOO_SMALL("1423", "NUMBER_TOO_SMALL"),

    _1424_NUMBER_TOO_BIG("1424", "NUMBER_TOO_BIG"),

    _1425_NOT_A_NUMBER("1425", "NOT_A_NUMBER"),

    _1426_FIELD_TOO_LONG("1426", "FIELD_TOO_LONG"),

    _1427_FIELD_TOO_SHORT("1427", "FIELD_TOO_SHORT"),

    _1428_SUBFIELDS_OUT_OF_RANGE("1428", "SUBFIELDS_OUT_OF_RANGE"),

    _1429_MAXIMUM_OCCURENCE_VIOLATED("1429", "MAXIMUM_OCCURENCE_VIOLATED"),

    _1430_INVALID_RECORD_TYPE("1430", "INVALID_RECORD_TYPE"),

    _1431_MANDATORY_FIELD("1431", "MANDATORY_FIELD"),

    _1432_UNDEFINED_FIELD("1432", "UNDEFINED_FIELD"),

    _1434_FINGERPRINT_DUPLICATED("1434", "FINGERPRINT_DUPLICATED"),

    _1435_RESOLUTION_TOO_HIGH("1435", "RESOLUTION_TOO_HIGH"),

    _1436_INVALID_TYPE_OF_TRANSACTION("1436", "INVALID_TYPE_OF_TRANSACTION"),

    _1500_GROUP_TYPE_INVALID("1500", "GROUP_TYPE_INVALID"),

    _1600_INVALID_PSEUDO_DATE("1600", "INVALID_PSEUDO_DATE"),

    _1603_ATTACHMENT_ID_NOT_KNOWN("1603", "Attachment ID NOT KNOWN"),

    _1604_PRECONDITION("1604", "PRECONDITION"),

    _1605_TOO_MANY_PARAMETERS_PROVIDED("1605", "TOO_MANY_PARAMETERS_PROVIDED"),

    _1607_INVALID_FLAGS_COMBINATION("1607", "INVALID_FLAGS_COMBINATION"),

    _1608_MINIMAL_STRING_LENGTH("1608", "MINIMAL_STRING_LENGTH"),

    _1609_INVALID_DATE_RANGE("1609", "INVALID_DATE_RANGE"),

    _1610_INVALID_ATTACHMENT("1610", "INVALID_ATTACHMENT"),

    _1611_INEXACT_SEARCH_CANNOT_CONTAIN_WILDCARDS("1611", "INEXACT_SEARCH_CANNOT_CONTAIN_WILDCARDS"),

    _1612_INEXACT_SEARCH_WITH_ONLY_ONE_CRITERION("1612", "INEXACT_SEARCH_WITH_ONLY_ONE_CRITERION"),

    _1613_SEARCH_WITH_ONLY_ONE_CODE_TABLE("1613", "SEARCH_WITH_ONLY_ONE_CODE_TABLE"),

    _1614_SEARCH_WITH_ONLY_DATE_OF_BIRTH("1614", "SEARCH_WITH_ONLY_DATE_OF_BIRTH"),

    _1616_TOO_MANY_HITS("1616", "TOO_MANY_HITS"),

    _1617_SEARCH_CRITERION_NA_NOT_ALLOWED("1617", "SEARCH_CRITERION_NA_NOT_ALLOWED"),

    _1800_INVALID_UID_FORMAT("1800", "INVALID_UID_FORMAT"),

    _1802_AUTHORITY_WRONG_TYPE("1802", "AUTHORITY_WRONG_TYPE"),

    _5000_NOT_WELL_FORMED_MESSAGE("5000", "Not well-formed message"),

    _5001_SEARCH_PARAMETER_RULES_VIOLATED("5001", "Search parameter rules violated"),

    _5002_TIMEOUT("5002", "Timeout"),

    _5004_INVALID_MESSAGE_VERSION("5004", "Invalid message version"),

    _5005_OFFLINE_MODE("5005", "Offline Mode"),

    _5006_INVALID_SEARCH_PARAMETERS_COMBINATION("5006", "Invalid search parameters combination"),

    _5007_NOT_IDENTIFIED_RESPONSE_LIST("5007", "Not identified Response List"),

    _5008_INVALID_OPERATION_VARIANT("5008", "Invalid Operation Variant"),

    _5009_INVALID_SEARCH_SCOPE_MODIFIER("5009", "Invalid search scope modifier"),

    _5010_MISSING_SESSIONID("5010", "Missing SessionID"),

    _5011_SAME_TRANSACTIONID_CONFLICTING_WITH_ANOTHER_OPERATION("5011", "Same TransactionID conflicting with another operation"),

    _5012_INVALID_VARIANT_AND_OPERATION_COMBINATION("5012", "Invalid Variant and Operation Combination."),

    _5013_INVALID_SEARCH_PARAMETERS_COMBINATION("5013", "Invalid search parameters combination"),

    _5014_INVALID_SEARCH_SCOPE_MODIFIER("5014", "Invalid search scope modifier"),

    _5015_SEARCH_PARAMETER_RULES_VIOLATED("5015", "Search parameter rules violated"),

    _5016_TRAVELLER_FILE_NOT_FOUND("5016", "Traveller File not found"),

    _5017_ENTRY_RECORD_NOT_FOUND("5017", "Entry Record not found"),

    _5018_TRAVELDOCUMENTNUMBER_NOT_FOUND("5018", "TravelDocumentNumber not found"),

    _5019_MISSING_FACIALIMAGE("5019", "Missing_FacialImage"),

    _5020_THE_SAME_SOURCE_AND_TARGET_TRAVELLER_FILE("5020", "The same source and target Traveller File"),

    _5023_EXIT_RECORD_NOT_FOUND("5023", "Exit Record not found"),

    _5024_PRE_ENROLLED_DATA_NOT_FOUND("5024", "Pre-enrolled data not found"),

    _5025_REFUSAL_RECORD_NOT_FOUND("5025", "Refusal Record not found"),

    _5026_BORDER_CONTROL_TRANSACTION_DOES_NOT_EXIST("5026", "Border control transaction does not exist"),

    _5027_NO_DATA_SUPPLIED_TO_BORDER_CONTROL("5027", "No data supplied to border control"),

    _5028_NO_EESIDENTIFICATION_ELEMENT_IN_REQUEST("5028", "No EESIdentification element in request"),

    _5029_TRAVELLERFILEID_NOT_FOUND_WITHIN_IDENTIFICATION_RESULTS("5029", "TravellerFileID not found within identification results"),

    _5030_VSN_NOT_FOUND_WITHIN_IDENTIFICATION_RESULTS("5030", "VSN not found within identification results"),

    _5031_NO_BILATERAL_AGREEMENT_IS_LINKED_TO_THE_CHANGE_GROUND("5031", "No Bilateral Agreement is linked to the change ground."),

    _5045_MESSAGE_SIZE_EXCEEDED("5045", "Message size exceeded"),

    _5046_SEARCH_WITH_ONLY_FACIAL_IMAGE("5046", "Search with only Facial Image"),

    _5047_BIOMETRIC_FILE_TOO_LARGE("5047", "Biometric file too large"),

    _5048_NO_IDENTIFICATION_RESULT_SPECIFIED("5048", "No identification result specified"),

    _5049_NO_VIS_IDENTIFICATION_ELEMENT_IN_REQUEST("5049", "No VIS Identification element in request"),

    _5050_AT_LEAST_1_TRAVEL_DOCUMENT_NEEDS_TO_REMAIN_IN_THE_TRAVELLER_FILE("5050", "At least 1 Travel Document needs to remain in the Traveller File"),

    _5051_THE_SAME_TRAVEL_DOCUMENT_APPEARS_TO_BE_CURRENTLY_IN_USE_AT_DIFFERENT_BORDER_POINTS("5051", "The same Travel Document appears to be currently in use at different border points"),

    _5052_BILATERAL_AGREEMENT_BELONGS_TO_DIFFERENT_COUNTRY("5052", "Bilateral agreement belongs to different country"),

    _5053_CALCULATOR_NOT_APPLICABLE("5053", "Calculator not applicable"),

    _5054_ENTRY_RECORD_WITHOUT_EXIT_RECORD("5054", "Entry record without Exit Record"),

    _5055_EXIT_RECORD_WITHOUT_ENTRY_RECORD("5055", "Exit Record without Entry Record"),

    _5056_NO_ENTRY_EXIT_AND_REFUSAL_RECORDS("5056", "No Entry/ Exit and Refusal Records"),

    _5057_VSN_NOT_FOUND("5057", "VSN not found"),

    _5058_SEQUENCE_OF_ENTRIES_AND_EXITS_IS_VIOLATED_BY_THE_PROVIDED_DATE("5058", "Sequence of entries and exits is violated by the provided date"),

    _5059_FTD_STICKER_NUMBER_NOT_FOUND("5059", "FTD Sticker Number not found"),

    _5060_INVALID_INPUT_PARAMETERS_FOR_OPERATION_MODIFIER("5060", "Invalid input parameters for operation modifier"),

    _5061_2_TRAVEL_DOCUMENTS_WITH_THE_SAME_NUMBER("5061", "2 Travel Documents with the same number"),

    _5062_TRAVELLERFILEID_NOT_FOUND_WITHIN_SEARCH_RESULTS("5062", "TravellerFileID not found within search results"),

    _5063_VSN_NOT_FOUND_WITHIN_SEARCH_RESULTS("5063", "VSN not found within search results"),

    _5064_MISSING_ENTRY_OR_EXIT_RECORD("5064", "Missing Entry or Exit Record"),

    _5065_INVALID_INPUT_PARAMETERS_FOR_OPERATION_VARIANT("5065", "Invalid input parameters for operation variant"),

    _5066_DIFFERENT_TRAVEL_DOCUMENT_DATA_THAN_USED_IN_THE_FIRST_CALL_OF_START_BORDER_CONTROL("5066", "Different Travel Document data than used in the first call of Start Border Control"),

    _5067_FOR_USED_PERSONSTATUS_AUTHORISEDSTAYUNTIL_VALUE_NEEDS_TO_BE_SUPPLIED("5067", "For used PersonStatus AuthorisedStayUntil value needs to be supplied"),

    _5068_FI_ANDOR_FP_MISSING_IN_PRE_ENROLLED_DATA("5068", "FI and/or FP missing in pre-enrolled data"),

    _5069_WFE_TRAVELLER_FILE_NOT_FOUND("5069", "WFE -Traveller File not found"),

    _5071_INVALID_AUTHORITY("5071", "Invalid Authority"),

    _5072_THREE_LETTER_CODE_OF_THE_AUTHORITYUNIQUEID_DOES_NOT_BELONG_TO_THE_MS_SENDING_THE_REQUEST("5072", "Three-letter code of the AuthorityUniqueId does not belong to the MS sending the request"),

    _5073_SAMPLE_NOT_FOUND("5073", "Sample not found"),

    _5074_CHANGE_AUTHORISATION_CAN_NOT_BE_PERFORMED_FOR_TCNS_TO_WHOM_AUTHORISED_STAY_UNTIL_IS_NOT_APPLICABLE("5074", "Change Authorisation can not be performed for TCNs to whom Authorised Stay Until is not applicable"),

    _5075_EITHER_AUTHORISED_STAY_UNTIL_OR_DURATION_OF_STAY_NEEDS_TO_BE_PROVIDED_IN_THE_REQUEST_MESSAGE("5075", "Either Authorised Stay Until or Duration of Stay needs to be provided in the request message."),

    _5076_BIOMETRICS_MISSING_IN_REQUEST("5076", "Biometrics missing in Request"),

    _5077_PRE_ENROLLED_DATA_DOESNT_CONTAIN_FI("5077", "Pre-enrolled data doesn't contain FI"),

    _5078_PRE_ENROLLED_DATA_DOESNT_CONTAIN_FP("5078", "Pre-enrolled data doesn't contain FP"),

    _5079_NO_MATCH_WITH_SSS_BIOMETRICS_VERIFICATION("5079", "No match with SSS Biometrics Verification"),

    _5081_REFUSAL_RECORD_OR_EXIT_RECORD_FOUND("5081", "Refusal Record or Exit Record found"),

    _5087_ONLY_EES_OPERATION_MODIFIER_IS_ALLOWED_FOR_ACCESS_TO_DATA_FOR_VERIFICATION_WITHIN_THE_TERRITORY_OPERATION_VARIANT("5087", "Only EES operation modifier is allowed for \"Access to data for verification within the territory\" Operation Variant"),

    _5088_ENTRYRECORDID_SUPPLIED_IS_NOT_REFERRING_TO_THE_LATEST_ENTRY_RECORD("5088", "EntryRecordID supplied is not referring to the latest Entry Record"),

    _9000_INTERNAL_ERROR("9000", "INTERNAL_ERROR"),

    EMPTY("-1", "");

    private static final String SEPARATOR = ".";

    private static final Map<String, St14ErrorCode> CODE2ENUM = Stream.of(St14ErrorCode.values()).collect(Collectors.toUnmodifiableMap(e -> e.getFullCode(), e -> e));

    private final String code;

    private final String label;

    St14ErrorCode(String code, String label) {
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

    public static Optional<St14ErrorCode> fromCode(String code) {
        return Optional.ofNullable(CODE2ENUM.get(code));
    }


    public String toString() {
        return getFullCode();
    }
}
