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
        Job test_job_fields = new Job("Product tester", new Employer("ACME").toString(), new Location("Desert").toString(), new PositionType("Quality control").toString(), new CoreCompetency("Persistence").toString());
        assertEquals("Product tester", test_job_fields.getName());
        assertEquals("ACME", test_job_fields.getEmployer().getValue());
        assertEquals("Desert", test_job_fields.getLocation().getValue());
        assertEquals("Quality control", test_job_fields.getPositionType().getValue());
        assertEquals("Persistence", test_job_fields.getCoreCompetency().getValue());

        assertTrue(test_job_fields.getName(), true);
        assertTrue(test_job_fields.getEmployer().getValue(), true);
        assertTrue(test_job_fields.getLocation().getValue(), true);
        assertTrue(test_job_fields.getPositionType().getValue(), true);
        assertTrue(test_job_fields.getCoreCompetency().getValue(), true);
    }


}
