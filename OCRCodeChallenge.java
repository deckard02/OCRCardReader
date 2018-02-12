package ocrcodechallenge;

/**
 * @author Keith Weber
 */
public class OCRCodeChallenge {
    
    //convenience method for printing the result of the parser/conact info
    public static String getPrintableContactInfo(ContactInfo contactInfo){
        String printableStr = "Name: "+ contactInfo.getName() + "\n" +
                              "Phone: "+ contactInfo.getPhoneNumber() + "\n" +
                              "Email: "+ contactInfo.getEmailAddress() + "\n";
        return printableStr;
    }
    
    public static void main(String[] args) {
        //normally I would create an array of strings with the examples but since there are only 3 I didn't :P
        String example1 = "ASYMMETRIK LTD\n" +
                          "Mike Smith\n" +
                          "Senior Software Engineer\n" +
                          "(410)555-1234\n" +
                          "msmith@asymmetrik.com";
        
        String example2 = "Foobar Technologies\n" +
                          "Analytic Developer\n" +
                          "Lisa Haung\n" +
                          "1234 Sentry Road\n" +
                          "Columbia, MD 12345\n" +
                          "Phone: 410-555-1234\n" +
                          "Fax: 410-555-4321\n" +
                          "lisa.haung@foobartech.com";
        
        String example3 = "Arthur Wilson\n" +
                          "Software Engineer\n" +
                          "Decision & Security Technologies\n" +
                          "ABC Technologies\n" +
                          "123 North 11th Street\n" +
                          "Suite 229\n" +
                          "Arlington, VA 22209\n" +
                          "Tel: +1 (703) 555-1259\n" +
                          "Fax: +1 (703) 555-1200\n" +
                          "awilson@abctech.com";
        
        //Could have looped through an array of examples here but again since there are only 3 wouldn't saved many lines of code     
        BusinessCardParser cardParser = new OCRBusinessCardParser();
        ContactInfo contactInfo1 = cardParser.getContactInfo(example1);        
        System.out.println(getPrintableContactInfo(contactInfo1));

        ContactInfo contactInfo2 = cardParser.getContactInfo(example2);        
        System.out.println(getPrintableContactInfo(contactInfo2));
        
        ContactInfo contactInfo3 = cardParser.getContactInfo(example3);        
        System.out.println(getPrintableContactInfo(contactInfo3));
    }
    
}
