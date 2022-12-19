package mate.academy.spring.dto.request;

import mate.academy.spring.validation.RepeatedPasswordEquals;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@RepeatedPasswordEquals()
public class UserRequestDto {
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
