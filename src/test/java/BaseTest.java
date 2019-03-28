import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseTest {
	
	private	String carsJson = "[\n" + 
				"    {\n" + 
				"     \"make\": \"Audi\",\n" + 
				"	  \"model\": \"A7\",\n" + 
				"     \"vin\": \"09AGHY64352JITEG98K\",\n" + 
				"     \"metadata\" : {\n" + 
				"         \"color\" : \"Black\",\n" + 
				"         \"notes\": \"Scratches on the front side of the car\"\n" + 
				"         },\n" + 
				"     \"perdayrent\" : {\n" + 
				"        \"price\" : 110,\n" + 
				"         \"discount\" : 15\n" + 
				"         },\n" + 
				"     \"metrics\" : {\n" + 
				"         \"yoyMaintenanceCost\" : 190.76,\n" + 
				"         \"depreciation\": 2256.43,\n" + 
				"         \"rentalcount\" : {\n" + 
				"             \"lastWeek\" : 4,\n" + 
				"             \"yeartodate\" : 221\n" + 
				"             }\n" + 
				"         }\n" + 
				"    },\n" + 
				"    {\n" + 
				"     \"make\": \"Tesla\",\n" + 
				"	  \"model\": \"A7\",\n" + 
				"     \"vin\": \"09AGHY64352JITEG98K\",\n" + 
				"     \"metadata\" : {\n" + 
				"         \"color\" : \"Blue\",\n" + 
				"         \"notes\": \"Notes Sample 2\"\n" + 
				"         },\n" + 
				"     \"perdayrent\" : {\n" + 
				"        \"price\" : 140,\n" + 
				"         \"discount\" : 10\n" + 
				"         },\n" + 
				"     \"metrics\" : {\n" + 
				"         \"yoyMaintenanceCost\" : 210.76,\n" + 
				"         \"depreciation\": 2256.43,\n" + 
				"         \"rentalcount\" : {\n" + 
				"             \"lastWeek\" : 4,\n" + 
				"             \"yeartodate\" : 221\n" + 
				"             }\n" + 
				"         }\n" + 
				"    },\n" + 
				"    {\n" + 
				"     \"make\": \"Tesla\",\n" + 
				"	  \"model\": \"A7\",\n" + 
				"     \"vin\": \"09AGHY64352JITEG98K\",\n" + 
				"     \"metadata\" : {\n" + 
				"         \"color\" : \"Black\",\n" + 
				"         \"notes\": \"Notes Sample 3\"\n" + 
				"         },\n" + 
				"     \"perdayrent\" : {\n" + 
				"        \"price\" : 180,\n" + 
				"         \"discount\" : 5\n" + 
				"         },\n" + 
				"     \"metrics\" : {\n" + 
				"         \"yoyMaintenanceCost\" : 2190.76,\n" + 
				"         \"depreciation\": 2256.43,\n" + 
				"         \"rentalcount\" : {\n" + 
				"             \"lastWeek\" : 4,\n" + 
				"             \"yeartodate\" : 221\n" + 
				"             }\n" + 
				"         }\n" + 
				"    },\n" + 
				"    {\n" + 
				"     \"make\": \"Audi\",\n" + 
				"	  \"model\": \"A7\",\n" + 
				"     \"vin\": \"09AGHY64352JITEG98K\",\n" + 
				"     \"metadata\" : {\n" + 
				"         \"color\" : \"Blue\",\n" + 
				"         \"notes\": \"Notes Sample 4\"\n" + 
				"         },\n" + 
				"     \"perdayrent\" : {\n" + 
				"        \"price\" : 50,\n" + 
				"         \"discount\" : 20\n" + 
				"         },\n" + 
				"     \"metrics\" : {\n" + 
				"         \"yoyMaintenanceCost\" : 219.76,\n" + 
				"         \"depreciation\": 2256.43,\n" + 
				"         \"rentalcount\" : {\n" + 
				"             \"lastWeek\" : 4,\n" + 
				"             \"yeartodate\" : 221\n" + 
				"             }\n" + 
				"         }\n" + 
				"    },\n" + 
				"    {\n" + 
				"     \"make\": \"Tesla\",\n" + 
				"	  \"model\": \"A7\",\n" + 
				"     \"vin\": \"09AGHY64352JITEG98K\",\n" + 
				"     \"metadata\" : {\n" + 
				"         \"color\" : \"Blue\",\n" + 
				"         \"notes\": \"Scratches on the front side of the car\"\n" + 
				"         },\n" + 
				"     \"perdayrent\" : {\n" + 
				"        \"price\" : 70,\n" + 
				"         \"discount\" : 25\n" + 
				"         },\n" + 
				"     \"metrics\" : {\n" + 
				"         \"yoyMaintenanceCost\" : 290.76,\n" + 
				"         \"depreciation\": 2256.43,\n" + 
				"         \"rentalcount\" : {\n" + 
				"             \"lastWeek\" : 4,\n" + 
				"             \"yeartodate\" : 221\n" + 
				"             }\n" + 
				"         }\n" + 
				"    }\n" + 
				"    ]";
				
	    
	 protected List<CarDTO> getCars() throws Exception {
	    ObjectMapper oMapper = new ObjectMapper();
	    return oMapper.readValue( carsJson, new TypeReference<List<CarDTO>>() { });
	 }
	    
	
}
