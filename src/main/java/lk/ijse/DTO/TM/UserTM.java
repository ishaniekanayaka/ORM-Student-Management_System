package lk.ijse.DTO.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserTM extends lk.ijse.Controller.UserFormController{

    private  String userID;
    private  String UserName;
    private String UserPassword;
    private  String UserRole;

}
