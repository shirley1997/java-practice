public class BMI{
	public static void main(String[] args){
	int weight = 80;
	double height = 1.8;
	double BMI = weight / (height*height);
	if(BMI<20){
		System.out.println("BMI<20             Untergewicht");
		
	}
	else if((BMI>=20)&&(BMI<=25)){
		System.out.println("20<=BMI<=25        Normalgewicht");
		

	}
	else/*(BMI>25)*/{
		System.out.println("BMI>25             Uebergewicht");

	}
	}
	}