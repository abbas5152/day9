package day9;

public class ScienceStudent extends Student {
	
		int phisicsMarks;
		int chemistryMarks;
		int mathsMarks;
		@Override
		public int getPercentage() {
			int total= phisicsMarks + chemistryMarks + mathsMarks;
			return (total/3);
		}
		


}
