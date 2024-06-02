package com.tms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tms.bean.PackageDetails;
import com.tms.controller.PackageDetailsController;

@SpringBootTest
class PackageDetailsMyTest {

	@Autowired
	PackageDetailsController packController;

	// to verify get all packagedetails
//	@Test
//	void doGetPackage() {
//		List<PackageDetails> pack = packController.getPackageDetails();
//		assertNotNull(pack);
//		assertEquals(8, pack.size());
//	}

	// Get list by Package Id
	@Test
	void getListByPackageId() {
		PackageDetails pack = new PackageDetails();
		pack = packController.find(4);
		assertNotNull(pack);

	}

	// Delete PackageDetails By id
	@Test
	void testDeletePackage() {
		boolean result = packController.deletePackage(11);
		assertEquals(true, result);
	}

}
