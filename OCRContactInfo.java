package ocrcodechallenge;

/**
 *
 * @author Keith
 */
public class OCRContactInfo implements ContactInfo {
    String name;
    String phoneNumber;
    String emailAdress;
    
    public OCRContactInfo(String name, String phoneNumber, String emailAdress){
        //No need for checking empty/bad values like normal bc we know values are good/exist in examples
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }
    
    //returns the full name of the individual (eg. John Smith, Susan Malick)
    public String getName(){
        return name;
    }
    
    //returns the phone number formatted as a sequence of digits
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    //returns the email address
    public String getEmailAddress(){
        return emailAdress;
    }
    
    
    
}
