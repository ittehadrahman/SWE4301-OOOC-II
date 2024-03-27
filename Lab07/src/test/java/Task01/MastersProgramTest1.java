package Task01;

import Task01.DegreeType;
import Task01.MastersProgram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MastersProgramTest1 {

        @Test
        public void isEligibleThesis(){
            Task01.MastersProgram mp = new Task01.MastersProgram(Task01.DegreeType.RegularThesis, "swe");
            boolean isEligible = mp.isEligible(2, "swe");
            assertFalse(isEligible);
            isEligible = mp.isEligible(3.9f, "swe");
            assertTrue(isEligible);
        }

        @Test
        public void getMarksThesis(){
            Task01.MastersProgram mp = new Task01.MastersProgram(Task01.DegreeType.RegularNonThesis, "swe");
            int marks = mp.getMarks(80,60, 40);
            assertEquals(100, marks);
        }

        @Test
        public void isEligibleThesisDifferentMajor(){
            Task01.MastersProgram mp = new Task01.MastersProgram(Task01.DegreeType.RegularThesis, "cse");
            boolean isEligible = mp.isEligible(3.9f, "swe");
            assertFalse(isEligible);
        }

        @Test
        public void isEligibleExecutive(){
            Task01.MastersProgram mp = new MastersProgram(Task01.DegreeType.Executive, "cse");
            boolean isEligible = mp.isEligible(3.6f, "swe");
            assertFalse(isEligible);
        }
    }


