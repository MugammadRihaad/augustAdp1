package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;

import java.util.Date;

public class UserDemographyFactory {


    public static UserDemography buildUserDemography(String userEmail, String userTitle, String genderId, String raceId, Date dateOfBirth) {
        Date date=new Date();
        return new UserDemography("User@gmail.com","Manager","male","Coloured",date);
        /**
        * Your implementation goes here
        * INSTRUCTIONS
        * 1. Remove line [//TODO: implement method body ONLY!]
        * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
        * 3. Create and return an object of UserDemography
        */
    }
}
