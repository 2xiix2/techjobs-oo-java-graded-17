package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job.getId(), test_job2.getId());
    }

//    @Test
//    public void testJobConstructionSetsAllFields() {
//        Job test_job_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    }


        @Test
        public void testJobConstructionSetsAllFields() {
            Job test_job_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertEquals("Product tester", test_job_fields.getName());
            assertEquals("ACME", test_job_fields.getEmployer().getValue());
            assertEquals("Desert", test_job_fields.getLocation().getValue());
            assertEquals("Quality control", test_job_fields.getPositionType().getValue());
            assertEquals("Persistence", test_job_fields.getCoreCompetency().getValue());

            assertTrue("Product tester", true);
            assertTrue("ACME", true);
            assertTrue("Desert", true);
            assertTrue("Quality control", true);
            assertTrue("Persistence", true);
        }
}
