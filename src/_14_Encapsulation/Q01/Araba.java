package _14_Encapsulation.Q01;

public class Araba {
	
	private String model;
	 private String renk;
	 private int motor;
	 private int yil;
	 
	 public Araba () {
		 
	 }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		if (motor>=100) {
			this.motor = motor;
			System.out.println("tekerine tas degmesin    :))))");
		}else {
			System.out.println("100 altinda beygir gucu olmaz");
		}
		
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		if (yil<=0) {
			System.out.println(" hatali giris yaptiniz ");
			this.yil = -yil;
		}else {
			this.yil = yil;
		}
		
	}
	
	public Araba(String model, String renk, int motor, int yil) {
		this.model=model;
		this.renk=renk;
		setMotor(motor);
		//this.motor=motor;
		// this.yil=yil;
		setYil(yil);
	}
	
	

}
