package by.pvt.javacollections;

public enum IsActive {
    ACTIVE("Active"),

    NOTACTIVE("Not active");

    private String isActive;
    IsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsActive() {
        return isActive;
    }
}
