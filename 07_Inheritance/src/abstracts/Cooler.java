package abstracts;

public abstract class Cooler extends Electronic{

	@Override
	public boolean isPower() {
		return super.isPower();
	}

	@Override
	public void setPower(boolean power) {
		super.setPower(power);
	}

	@Override
	public int getButton() {
		return super.getButton();
	}

	@Override
	public void setButton(int button) {
		System.out.println("냉장 버튼 추가");
		super.setButton(button);
	}

	@Override
	public String getFeature() {
		return super.getFeature();
	}

	@Override
	public void setFeature(String feature) {
		System.out.println("냉장 과학 추가");
		super.setFeature(feature);
	}
	
}
