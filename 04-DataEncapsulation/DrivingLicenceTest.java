public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("krYStian");
        dl.setSurname("Gwizdała");
        dl.setAdress("Łęki 159");
        dl.setPostalCode("32-425");
        dl.setLicenceNumber(1234455);
        dl.setYearOfIssue(1800);
        dl.setLicenceCategory("B");

        // dl.Display();

        System.out.println(dl.toString());
    }
}
