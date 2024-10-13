package exercise;

import exercise.dto.users.UsersPage;
import exercise.model.User;
import exercise.repository.UserRepository;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;
import static net.datafaker.internal.helper.WordUtils.capitalize;

public final class App {

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        app.get("/users", ctx -> {
            List<User> users = UserRepository.getEntities();
            var page = new UsersPage(users);
            ctx.render("users/index.jte", model("page", page));
        });

        // BEGIN
        app.get("/users/build",ctx -> {
            ctx.render("users/build.jte");
        });
        app.post("/users", ctx -> {
            var firstName = ctx.formParam("firstName");
            String capitalizedName = capitalize(firstName);
            var lastName = ctx.formParam("lastName");
            String capitalizedLastName = capitalize(lastName);
            var email = ctx.formParam("email");
            var password = ctx.formParam("password").toLowerCase().trim();
            var passwordConfirmation = ctx.formParam("passwordConfirmation");

            var user = new User(capitalizedName, capitalizedLastName, email, password);
            UserRepository.save(user);
            ctx.redirect("/users");
        });
        // END

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7000);
    }
}
