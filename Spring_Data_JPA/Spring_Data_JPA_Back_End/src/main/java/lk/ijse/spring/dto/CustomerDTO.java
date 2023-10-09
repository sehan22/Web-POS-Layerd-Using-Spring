package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private String cusID;
    private String cusName;
    private String cusAddress;
    private BigDecimal cusSalary;
}
