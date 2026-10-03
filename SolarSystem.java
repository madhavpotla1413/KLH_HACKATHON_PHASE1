import java.util.Scanner;
public class SolarSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int panelId = 101;
        double energyGenerated = 25.75;
        int numberOfPanels = 10;
        char systemStatus = 'A';

        System.out.println("Rooftop Solar System Details");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}