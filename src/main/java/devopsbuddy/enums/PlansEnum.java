package devopsbuddy.enums;

/**
 * @author TheDioniz, created on 14.06.2017.
 */
public enum PlansEnum {

    BASIC(1, "Basic"),
    PRO(2, "Pro");

    private final int id;
    private final String planName;

    PlansEnum(int id, String planName) {
        this.id = id;
        this.planName = planName;
    }

    public int getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }
}
