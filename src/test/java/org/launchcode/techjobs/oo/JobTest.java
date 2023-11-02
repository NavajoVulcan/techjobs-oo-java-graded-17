package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.*;

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
       Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product Tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().toString());
        assertEquals("Desert", job1.getLocation().toString());
        assertEquals("Quality control", job1.getPositionType().toString());
        assertEquals("Persistence", job1.getCoreCompetency().toString());

        assertNotNull(job1.getName());
        assertNotNull(job1.getEmployer());
        assertNotNull(job1.getCoreCompetency());
        assertNotNull(job1.getLocation());
        assertNotNull(job1.getPositionType());

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }

    //TODO tests task 5
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.toString().startsWith(lineSeparator()));
        assertTrue(job1.toString().endsWith(lineSeparator()));

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals(lineSeparator() + "ID: " + job1.getId() + lineSeparator() + "Name: Product Tester" + lineSeparator() + "Employer: Data not available" + lineSeparator() + "Location: Desert" + lineSeparator() + "Position Type: Quality control" + lineSeparator() + "Core Competency: Data not available" + lineSeparator(),job1.toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(lineSeparator() + "ID: " + job1.getId() + lineSeparator() + "Name: Product Tester" + lineSeparator() + "Employer: ACME" + lineSeparator() + "Location: Desert" + lineSeparator() + "Position Type: Quality control" + lineSeparator() + "Core Competency: Persistence" + lineSeparator(), job1.toString());
    }

}
//As usual, the autograding tests are very picky about capitalization and spaces,
// so your code should match the format shown above exactly.