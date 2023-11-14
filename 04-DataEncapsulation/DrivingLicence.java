import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private int licenceNumber;
    private int yearOfIssue = Year.now().getValue();
    private String licenceCategory;

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAdress(){
        return adress;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public int getLicenceNumber(){
        return licenceNumber;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
    public String getLicenceCategory(){
        return licenceCategory;
    }
    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
    public void setYearOfIssue(int yearOfIssue) {
        int currentYear = Year.now().getValue();
        if (yearOfIssue > 1980 && yearOfIssue <= currentYear) {
            this.yearOfIssue = yearOfIssue;
        }
    }
    public void setLicenceCategory(String licenceCategory) {
        this.licenceCategory = licenceCategory;
    }
    
    public void Display(){
        System.out.println("Name and surname: " + getName() + " " + getSurname());
        System.out.println("Adress: " + getAdress() + " " + getPostalCode());
        System.out.println("Licence number and licence category: " + getLicenceNumber() + " " + getLicenceCategory());
        System.out.println("Year of issue: " + getYearOfIssue());
    }

    public String toString() {
        return "Name and surname: " + getName() + " " + getSurname() +
                "\nAdress: " + getAdress() + " " + getPostalCode() +
                "\nLicence number and licence category: " + getLicenceNumber() + " " + getLicenceCategory() +
                "\nYear of issue: " + getYearOfIssue();
    }

    

}

