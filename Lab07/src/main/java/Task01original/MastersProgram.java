package Task01original;
enum DegreeType {
    RegularThesis, RegularNonThesis, Executive
}
public class MastersProgram {

        private DegreeType degreeType;
        private String major;
        public MastersProgram(DegreeType type, String major){
            this.degreeType = type;
            this.major = major;
        }
        public boolean isEligible(float cgpa, String major){
            if(degreeType == DegreeType.RegularThesis){
                return this.major.equals(major) && cgpa >= 3.8;
            } else if (degreeType == DegreeType.Executive) {
                return this.major.equals(major) || cgpa>=3.75;
            } else {
                return this.major.equals(major);
            }
        }
        public int getMarks(int theoryMarks, int thesisMarks, int presentationMarks){
            if(degreeType == DegreeType.RegularNonThesis){
                return theoryMarks + presentationMarks/2;
            } else if (degreeType == DegreeType.Executive) {
                return theoryMarks;
            } else {
                return theoryMarks + thesisMarks;
            }
        }
}

