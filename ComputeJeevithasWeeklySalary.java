import java.util.*;
public class ComputeJeevithasWeeklySalary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sun = sc.nextInt();
		int mon = sc.nextInt();
		int tue = sc.nextInt();
		int wed = sc.nextInt();
		int thu = sc.nextInt();
		int fri = sc.nextInt();
		int sat = sc.nextInt();
		int sunSalary,monSalary,tueSalary,wedSalary,thuSalary,friSalary,satSalary,bonusWeekly = 0;
		
	   //Sunday Salary
		sunSalary = sun*150;          //50% bonus
		
	    //Monday Salary
		if(mon <= 8){
			monSalary = mon*100;
		}
		else{
			monSalary = (mon-8)*115+800;
			
		}
	   //Tuesday Salary
		if(tue <= 8){
			tueSalary = tue*100;
		}
		else{
			tueSalary = (tue-8)*115+800;
		}
	  //Wednesday Salary
		if(wed <= 8){
			wedSalary = wed*100;
		}
		else{
			wedSalary = (wed-8)*115+800;
		}
	  //Thursday Salary
		if(thu <= 8){
			thuSalary = thu*100;
		}
		else{
			thuSalary = (thu-8)*115+800;
		}
	   //Friday Salary
		if(fri <= 8){
			friSalary = fri*100;
		}
		else{
			friSalary = (fri-8)*115+800;
		}
	   //Saturday Salary
	   	satSalary = sat*125;
	   	
	   //Weekly bonus;
	   	int totalHours = mon+tue+wed+thu+fri;
	   	if(totalHours > 40){
	   		totalHours -= 40;
	   		bonusWeekly = totalHours*25;
	   	}
	   //Total Salary Of Jeeviths in a week.
	   	int totalSalary = sunSalary+monSalary+tueSalary+wedSalary+thuSalary+friSalary+satSalary+bonusWeekly;
	   	System.out.println(totalSalary);
	}
}











