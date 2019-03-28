import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.testng.annotations.Test;




public class MainTestClass extends BaseTest {
	
	@Test
	public void testLowestCostByPrice() throws Exception {
		
		List<CarDTO> cars = getCars();
		
		Collections.sort(cars, new Comparator<CarDTO>() {
			@Override
			  public int compare(CarDTO c1, CarDTO c2) {
			    return c1.getPerdayrent().getPrice()> c2.getPerdayrent().getPrice()?1:-1;
			  }
		});
		
		
		float lowestPrice = cars.get(0).getPerdayrent().getPrice();
		
		
		System.out.println("Cars with lowest Cost by Price are: ");

		cars.stream().filter(car -> car.getPerdayrent().getPrice() == lowestPrice).forEach(System.out::println);
		
		
	}
	
	@Test
	public void testLowestCostByDiscount() throws Exception {
		List<CarDTO> cars = getCars();
		
		Collections.sort(cars, new Comparator<CarDTO>() {
			@Override
			  public int compare(CarDTO c1, CarDTO c2) {
			    return (c1.getPerdayrent().getPrice() * (c1.getPerdayrent().getDiscount()/100) )> (c2.getPerdayrent().getPrice() * (c2.getPerdayrent().getDiscount()/100))
			    		?-1:1;
			  }
		});
		
		
		float lowestPriceAfterDiscount = cars.get(0).getPerdayrent().getPrice()* (cars.get(0).getPerdayrent().getDiscount()/100);
		
		
		System.out.println("Cars with lowest Cost by Price after applying Discount are: ");
		cars.stream()
		.filter(car -> (car.getPerdayrent().getPrice() * (car.getPerdayrent().getDiscount()/100)) == lowestPriceAfterDiscount).forEach(System.out::println);
		
			
	}
	
	@Test
	public void testBlueTesla() throws Exception {
		
		System.out.println("Notes for Blue Teslas are: ");

		getCars().stream()
	    .filter(car -> car.getMake().equalsIgnoreCase("Tesla"))
	    .filter(car -> car.getMetadata().getColor().equalsIgnoreCase("Blue"))
	    .map(car -> car.getMetadata().getNotes())
	    .forEach(System.out::println);

	}
	
	
	@Test
	public void findHighestRevenueGeneratingCar() throws Exception {
List<CarDTO> cars = getCars();
		
		Collections.sort(cars, new Comparator<CarDTO>() {
			@Override
			  public int compare(CarDTO c1, CarDTO c2) {
			    return (c1.getMetrics().getDepreciation() +  c1.getMetrics().getYoyMaintenanceCost() ) >
			    (c2.getMetrics().getDepreciation() +  c2.getMetrics().getYoyMaintenanceCost() ) 
			    		?-1:1;
			  }
		});
		
		
		System.out.println("Highest Revenue Generating car is :"+cars.get(0));
	}
	
	
	
	

}
