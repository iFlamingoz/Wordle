package wordle.project.test;

import wordle.project.data.GeneralData;

public class GeneralDataTester {
    public static void main(String[] args) {
        GeneralData generalData = new GeneralData();
        System.out.println("Account: " + generalData.getAutoLoginAccount());
        System.out.println("Time remaining: " + generalData.getAccountRememberTimeRemaining());
        System.out.println(generalData.getAutoLoginAccount());
    }
}
