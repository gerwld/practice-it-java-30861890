package _03_02;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    // Return true if the percentage is higher than or equal to 60.
   return percentage >= 60;
  }

  public char getGrade(int percentage) {
    // If the percentage is 90 or above, return 'A'.
    if(percentage >= 90) return 'A';
    // If it's 80-89, return 'B'.
    else if(percentage >= 80) return 'B';
    // If it's 70-79, return 'C'.
    else if(percentage >= 70) return 'C';
    // If it's 60-69, return 'D'.
    else if(percentage >= 60) return 'D';
    // If it's less than 60, return 'F'.
    return 'F';
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {
    // If percentage is 60 or higher, return a String that says "A retake is not
    // required."
    if(percentage >= 60) return "A retake is not required.";

    // If percentage is less than 60 and allowedToRetake is true, return a String
    // that says "The student has been entered for a retake."
    else if(percentage < 60 && allowedToRetake) return "The student has been entered for a retake.";

    // If percentage is less than 60 and allowedToRetake is false, return a String
    // that says "The student is not allowed to retake this exam."
    else if(percentage < 60 && !allowedToRetake) return "The student is not allowed to retake this exam.";
    return "";
  }

}
