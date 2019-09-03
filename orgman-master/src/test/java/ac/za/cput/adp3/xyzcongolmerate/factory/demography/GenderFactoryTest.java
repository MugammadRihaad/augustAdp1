package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    
    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("M");
        
        Assert.assertNotNull(gender.getGenderId());
        System.out.println("genderId is: " + gender.getGenderId());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported!");]
         * 3. Test the GenderFactory class
         * 4. Assert that the id is generated.
         */
    }
}