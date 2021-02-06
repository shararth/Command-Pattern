
public class EggCurry_Biryani_GarlicNaan implements IndianOrder {
	IndianCook cook;
	public EggCurry_Biryani_GarlicNaan(IndianCook cook) {
		this.cook = cook;
	}
	public void orderUp() {
		cook.EggCurry();
		cook.ChickenBiryani();
		cook.GarlicNaan();
		cook.Paneer65();
	}
}
