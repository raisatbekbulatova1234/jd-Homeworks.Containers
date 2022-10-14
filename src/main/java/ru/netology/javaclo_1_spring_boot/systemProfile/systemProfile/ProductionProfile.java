package ru.netology.javaclo_1_spring_boot.systemProfile.systemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}