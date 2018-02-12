package ocrcodechallenge;

/**
 *
 * @author Keith
 */
public interface ContactInfo {
    //returns the full name of the individual (eg. John Smith, Susan Malick)
    String getName();
    
    //returns the phone number formatted as a sequence of digits
    String getPhoneNumber();
    
    //returns the email address
    String getEmailAddress();

}
