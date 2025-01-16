import java.util.*;
public class student
{
   private int id_no;
   private int subjectno;
   private int[] subject_code;
   private int[] subject_credits;
   private int[] grade_obtained;
   private double spi;
    student()
    {
        this.id_no=id_no;
        this.subjectno=subjectno;
        this.subject_code=subject_code;
        this.subject_credits=subject_credits;
        this.grade_obtained=grade_obtained;
    }
    public void calculatespi()
    {
        int totalcreditd = 0;
        double weightedgrades = 0.0;

        for(int i=0;i<subjectno;i++)
        {
            totalcreditd += totalcreditd + subject_code[i];
            weightedgrades += weightedgrades + totalcreditd * grade_obtained[i]; 
        }
    }
}

