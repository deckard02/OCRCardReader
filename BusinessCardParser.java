package ocrcodechallenge;

/**
 *
 * @author Keith
 */
public interface BusinessCardParser {
    
    ContactInfo getContactInfo(String document);
}
