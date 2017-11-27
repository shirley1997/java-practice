class Untitled {
	
	enum Gender {MALE, FEMALE}
	public static void main(String[] args) {
		Gender myGender = Gender.MALE;
		Gender yourGender = Gender.FEMALE;
		
		if(myGender == yourGender) {
			System.out.println("something is wrong");
		}
		else {
			System.out.print("these genders are different");
			System.out.print(myGender);
			System.out.print(yourGender);
		}
	}
}