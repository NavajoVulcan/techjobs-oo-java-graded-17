package org.launchcode.techjobs.oo;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product Tester", jobExample.getName());
        assertEquals("ACME", jobExample.getEmployer().toString());
        assertEquals("Desert", jobExample.getLocation().toString());
        assertEquals("Quality control", jobExample.getPositionType().toString());
        assertEquals("Persistence", jobExample.getCoreCompetency().toString());

        assertTrue(jobExample.getName() instanceof String);
        assertTrue(jobExample.getEmployer() instanceof Employer);
        assertTrue(jobExample.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(jobExample.getLocation() instanceof Location);
        assertTrue(jobExample.getPositionType() instanceof PositionType);

    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

}
