package exercise.dto.users;

import exercise.model.User;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
// BEGIN
    public final class UsersPage {
        private List<User> users;
        private String header;
    }
// END
