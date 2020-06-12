public enum TestEnum {
    APPROVAL_REQUEST("Event Description for Approval Request"),
    APPROVAL_RESOLVED("Event Description for Approval Resolved"),
    SCHEDULE_REFUND("Event Description for Schedule Refund"),
    DISTRIBUTOR_REFUND("Event Description for Distributor Refund"),
    SYSTEM_NOTIFICATION("Event Description for System Notification"),
    EXCEPTION_EMAIL("Event Description for Exception Email"),
    BANK_SFTP_HEALTH_CHECK("Event Description for Bank SFTP Health Check");

    private final String description;

    TestEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
