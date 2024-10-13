package exercise.dto.users;

import exercise.model.User;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@AllArgsConstructor
@Setter
@Getter
public class UsersPage {
    public List<User> USERS;
    public String term;
}
// END
