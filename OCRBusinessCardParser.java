package ocrcodechallenge;

import ocrcodechallenge.ContactInfo;

/**
 *
 * @author Keith
 */
public class OCRBusinessCardParser implements BusinessCardParser {
    
    public ContactInfo getContactInfo(String document){
        String[] lines = document.split("\\r?\\n");
        
        //how does one know what a person's name is aside from a job title or copmpany name?
        //not easy really. wihout cheating atleast. =)
        //Going to do emailAddress first bc it wil help with name 
        String email = lines[lines.length-1];// could've searched for @ but know it's always on the last line in examples
        String[] emailSplitted = email.split("@");//I only want the part before the @
        String emailName = emailSplitted[0];
        int nameLineNumber = 0;
        for ( int i=0; i<3; i++){           
            String[] splitBySpace = lines[i].split("\\s+");
            if ( emailName.contains(splitBySpace[1].toLowerCase())){                
                nameLineNumber = i;
            };
        }
        String name = lines[nameLineNumber];
        
        //now comes the phone regex
        String phoneNumber="";
        for ( int i=0; i<lines.length; i++){           
            String[] splitBySpace = lines[i].split("\\s+");
            String onlyNumbers = lines[i].replaceAll("[^0-9]", "");
            if(onlyNumbers.length()>9 && onlyNumbers.length()<12 && phoneNumber==""){
                phoneNumber = onlyNumbers;
            }
        }       
        
        ContactInfo parsedContactInfo = new OCRContactInfo(name, phoneNumber, email);
        return parsedContactInfo; 
    }
    
}