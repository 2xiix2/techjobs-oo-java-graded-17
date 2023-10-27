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
//        Job test_job_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Perstistence"));
//    }


        @Test
        public void testJobConstructionSetsAllFields() {
            Job test_job_fields = new Job("Product tester", "ACME", "Desert", "Quality control", "Persistence");
            assertEquals("Product tester", true);
            assertEquals("ACME", true);
            assertEquals("Persistence", true);
            assertEquals("Quality control", true);
            assertEquals("Desert", true);

            assertTrue("Product tester", true);
            assertTrue("ACME", true);
            assertTrue("Desert", true);
            assertTrue("Quality control", true);
            assertTrue("Persistence", true);
        }
}
