package gr.aueb.cf.ch19.enums;

public enum AccountType {   // corresponding automatic number
    DEPOSIT("DP"),    // ordinal 0
    SAVINGS("SA"),    // ordinal 1
    CURRENT("CU") ;   // ordinal 2

    // Immutable
    private final String code;

    // Constructor
    AccountType(String code) {
        this.code = code;
    }

    // Setter is not allowed

    public String getCode() {
        return code;
    }
}
