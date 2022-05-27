
package vn.sun.controller

import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import vn.sun.controller.example.HealthCheckController

@ExtendWith(SpringExtension::class)
@WebMvcTest(HealthCheckController::class)
@AutoConfigureMockMvc(addFilters = false)
abstract class BaseControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc
}
