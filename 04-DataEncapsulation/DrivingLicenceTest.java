public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.name = "Krystian";
        dl.surname = "Gwizdała";
        dl.adress = "Łęki 159";
        dl.postalCode = "32-425";
        dl.licenceNumber = 1234455;
        dl.yearOfIssue = 2021;
        dl.licenceCategory = "B";

        dl.Display();
    }
}
