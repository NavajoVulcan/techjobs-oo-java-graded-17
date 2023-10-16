package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

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
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    //TODO tests task 5
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.toString().startsWith(System.lineSeparator()));
        assertTrue(job1.toString().endsWith(System.lineSeparator()));

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(lineSeparator() + "ID: " + theJob.getId() + lineSeparator() + "Name: Product tester" + lineSeparator() + "Employer: Data not available" + lineSeparator() + "Location: Desert" + lineSeparator() + "Position Type: Quality control" + lineSeparator() + "Core Competency: Data not available" + lineSeparator(), theJob.toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(lineSeparator() + "ID: " + theJob.getId() + lineSeparator() + "Name: Product tester" + lineSeparator() + "Employer: ACME" + lineSeparator() + "Location: Desert" + lineSeparator() + "Position Type: Quality control" + lineSeparator() + "Core Competency: Persistence" + lineSeparator(), theJob.toString());
    }

}
//As usual, the autograding tests are very picky about capitalization and spaces,
// so your code should match the format shown above exactly.