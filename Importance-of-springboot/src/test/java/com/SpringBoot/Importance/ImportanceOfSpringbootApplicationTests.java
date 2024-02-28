package com.SpringBoot.Importance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SpringBoot.Importance.Entity.Coupon;
import com.SpringBoot.Importance.Repository.CouponRepo;

@SpringBootTest
class ImportanceOfSpringbootApplicationTests {
	
	@Autowired
	CouponRepo couponRepo;

	@Test
	void testsaveCoupon() {
		Coupon coupon = new Coupon();
		coupon.setCode("SUPERSALE");
		coupon.setDiscount(new BigDecimal(20));
		coupon.setExpDate("12/12/2025");
		couponRepo.save(coupon);
	}
	@Test
	void testfindbyCode() {
		Coupon coupon = couponRepo.findByCode("SUPERSALE");
		assertEquals(20, coupon.getDiscount().intValue());
	}

}
