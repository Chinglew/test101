/**
 *
 * @author Lewin
 */

public class Main {

    public static void main(String[] args) {
        HealthcareWorkerTeam teamMedicalDragon = new HealthcareWorkerTeam();
        Surgeon ryutarou = new Surgeon("Ryutarou Asada", 0);
        Nurse miki = new Nurse("Miki Satohara", 1000);
        Cardiologist keisuke = new Cardiologist("Keisuke Fujiyoshi", 1000);
        Anesthesiologist monji = new Anesthesiologist("Monji Arase", 10000);
        teamMedicalDragon.addMember(ryutarou);
        teamMedicalDragon.addMember(miki);
        teamMedicalDragon.addMember(keisuke);
        teamMedicalDragon.addMember(monji);

        System.out.println("================================");
        monji.service();
        System.out.println("Monji's price is " + monji.getPrice());
        teamMedicalDragon.service();
        System.out.println("Before Monji leaves, the total price of the Team Medical Dragon is " + teamMedicalDragon.getPrice());
        teamMedicalDragon.removeMember(monji);
        System.out.println("After Monji leaves, The total price of the Team Medical Dragon is " + teamMedicalDragon.getPrice());
        System.out.println("================================");

        HealthcareWorkerTeam theGoodDoctor = new HealthcareWorkerTeam();
        Surgeon freddie = new Surgeon("Freddie Highmore", 500);
        Surgeon nicholas = new Surgeon("Nicholas Gonzalez", 2000);
        HealthcareWorkerDecorator timeNicholas = new TimeLoggingHealthcareWorker(nicholas);
        HealthcareWorkerDecorator taxNicholas = new TaxPayingHealthcareWorker(timeNicholas);
        Surgeon antonia = new Surgeon("Antonia Thomas", 500);
        HealthcareWorkerDecorator timeAnotonia = new TimeLoggingHealthcareWorker(antonia);
        Surgeon chuku = new Surgeon("Chuku Modu", 500);
        theGoodDoctor.addMember(freddie);
        theGoodDoctor.addMember(taxNicholas);
        theGoodDoctor.addMember(timeAnotonia);
        theGoodDoctor.addMember(chuku);

        System.out.println("================================");
        theGoodDoctor.service();
        System.out.println("The total price of the Good Doctor Team is " + theGoodDoctor.getPrice());

        System.out.println("================================");
        
        HealthcareWorkerTeam KMITL_Doctor = new HealthcareWorkerTeam();
        Surgeon Pasin = new Surgeon("Pasin C", 1500);
        Surgeon Paritat = new Surgeon("Paritat t", 3000);
        KMITL_Doctor.addMember(Pasin);
        KMITL_Doctor.addMember(Paritat);

        System.out.println("================================");
        theGoodDoctor.service();
        System.out.println("The total price of KMITL Doctor Team is " + KMITL_Doctor.getPrice());

        System.out.println("================================");
        
        HealthcareWorkerTeam healthcareSeries = new HealthcareWorkerTeam();
        healthcareSeries.addMember(teamMedicalDragon);
        healthcareSeries.addMember(theGoodDoctor);
        healthcareSeries.addMember(KMITL_Doctor);
        System.out.println("The total price of the healthcare series is " + healthcareSeries.getPrice());
    }
}
