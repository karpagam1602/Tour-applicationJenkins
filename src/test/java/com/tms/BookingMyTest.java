package com.tms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.bean.Admin;
import com.tms.bean.Booking;
import com.tms.bean.PackageDetails;
import com.tms.bean.User;
import com.tms.controller.AdminController;
import com.tms.controller.BookingController;
import com.tms.controller.PackageDetailsController;
import com.tms.controller.UserController;
@SpringBootTest
class BookingMyTest {

	@Autowired
	BookingController bookController;

	@Autowired
	UserController userController;

	@Autowired
	PackageDetailsController packController;

	@Autowired
	AdminController admincontroller;

	Booking book = new Booking();

	// to insert the booking details
//	@Test
//	void doBookingInsert() {
//
//		Booking book = new Booking();
//		User user = new User();
//		PackageDetails pack = new PackageDetails();
//		Admin admin=new Admin();
//		
//		book.setBookingDate(LocalDate.of(2024, 6, 27));
//		book.setBookingStatus("pending");
//		pack.setPackageId(7);
//		user.setUserId(3);
//		admin.setAdminId(1);
//		
//		book.setPackagedetails(pack);
//		book.setUser(user);
//		
//		Booking result = bookController.insertBooking(book);
//		assertEquals(book, result);
//		
//
//	}
//	
	// to update the booking details
	@Test
	void doBookingDelete() {

		Booking book = new Booking();
		User user = new User();
		PackageDetails pack = new PackageDetails();
		Admin admin = new Admin();

		book.setBookingId(11);
		book.setBookingDate(LocalDate.of(2024, 6, 28));
		book.setBookingStatus("pending");
		pack.setPackageId(7);
		user.setUserId(3);
		admin.setAdminId(1);

		book.setPackagedetails(pack);
		book.setUser(user);

		Booking result = bookController.updateBook(book);
		assertEquals(book, result);

	}

	// get all booking details
//	@Test
//	void doGetBookings() {
//		List<Booking> books = bookController.getBookingDetails();
//		assertNotNull(books);
//		assertEquals(5, books.size());
//	}

	// delete booking details by booking Id
	@Test
	void testDeleteBooking() {
		int bookingId = 13;
		boolean result = bookController.deleteBooking(bookingId);
		assertEquals(true, result);
	}

	// pending count
	@Test
	void getPendingCount() {
		Object book = new Booking();
		book = bookController.getPendingCount();
		assertNotNull(book);
	}

	// rejected count
	@Test
	void getRejectedCount() {
		Object book = new Booking();
		book = bookController.getRejectedCount();
		assertNotNull(book);
	}

	// approved count
	@Test
	void getApprovedCount() {
		Object book = new Booking();
		book = bookController.getApprovedCount();
		assertNotNull(book);
	}

	// get approved booking list
	@Test
	void getApprovedList() {
		List<Booking> book = bookController.getApproveBookings();
		assertNotNull(book);
	}

	// get Rejected booking list
	@Test
	void getRejectedList() {
		List<Booking> book = bookController.getRejectedBookings();
		System.out.println(book);
		assertNotNull(book);
	}

	// get pending list
	@Test
	void getPendingList() {
		List<Booking> book = bookController.getBookings();
		assertNotNull(book);
	}

//	// update booking details (approved) by booking Id
//	@Test
//	void approveBooking() {
// 
//		boolean approved = bookController.updateApprovedBooking(11);
// 
//		assertEquals(approved,true);
//	}
	

	// update booking details (rejected) by booking Id
//	@Test
//	void rejectBooking() {
//
//		boolean rejected = bookController.updateRejectedBooking(11);
//
//		assertEquals(rejected, true);
//	}
//	
	
	

	// get booking by bookingId
	@Test
	void getListByPackageId() {
		Booking book = new Booking();
		book = bookController.appfind(12);
		assertNotNull(book);
	}
	
	// get from user Id
		@Test
		void getBookingUserId() {
			List<Booking> book = bookController.findBookingbyId(4);
			assertNotNull(book);
		}

}
