package com.binar.latihan.template_java_backend;

import com.binar.latihan.template_java_backend.Controller.ControllerMovie;
import com.binar.latihan.template_java_backend.Controller.ControllerShowSeat;
import com.binar.latihan.template_java_backend.Entity.Movie;
import com.binar.latihan.template_java_backend.Entity.User;
import com.binar.latihan.template_java_backend.Repository.RepositoryMovie;
import com.binar.latihan.template_java_backend.Repository.RepositoryUser;
import com.binar.latihan.template_java_backend.Service.ServiceMovie;
import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class TemplateJavaBackendApplicationTests {

	ControllerShowSeat showSeat;

	@Mock
	RepositoryUser repositoryUser;

	@Test
	void contextLoads() {
		assertThrows(NullPointerException.class, () -> {
			showSeat.getSeatByBookingId(12345);
		});
	}

	ServiceMovie movie;
	@Test
	void testMovie() {
		User expect = new User(0, "Alma", "123", "gmail", "087719857757");

		Mockito.when(repositoryUser.findById(0))
				.thenReturn(Optional.of(new User(0, "Lucky", "123", "gmail", "21312")));

		var user = repositoryUser.findById(0);

		Assertions.assertEquals(expect, user);
	}
}
