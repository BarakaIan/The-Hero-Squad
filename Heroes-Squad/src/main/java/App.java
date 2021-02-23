import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static spark.Spark. *;

public class App {
//    static int getHerokuAssignedPort() {
//        staticFileLocation("/public");
//        ProcessBuilder processBuilder = new ProcessBuilder();
//        if (processBuilder.environment().get("PORT") != null) {
//            return Integer.parseInt(processBuilder.environment().get("PORT"));
//        }
//        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
//    }

    public static void main(String[] args) {

//        port(getHerokuAssignedPort());
        staticFileLocation("/public");



        //get: index route for home page
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

//
//        post("/success", (request, response) -> {
//            Map<String, Object> model = new HashMap<>();
//            String uniqueId = request.queryParams("uniqueId");
//            request.session().attribute("uniqueId", uniqueId);
//            model.put("uniqueId", uniqueId);
//            return new ModelAndView(model, "success.hbs");
//        }, new HandlebarsTemplateEngine());




//        route for adding hero
        get("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());


        post("/heroes/new", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            int defence = Integer.parseInt(request.queryParams("defence"));
            int strength = Integer.parseInt(request.queryParams("strength"));

            Hero hero = new Hero(name, age, power, weakness, defence, strength);

            model.put("hero", hero);
            return new ModelAndView(model, "successHero.hbs");
        }, new HandlebarsTemplateEngine());

//retrieves data from above for new hero
        get("/hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("addHeroes", Hero.getAll()); //displays hero
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());



        //route to form to create squad
        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squadForm", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squadForm.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad-form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());



//    route for creating squad
        post("/success", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("cause");

            Squad squad = new Squad(size, name, cause);

            model.put("squad", squad);
            return new ModelAndView(model, "successSquad.hbs");
        }, new HandlebarsTemplateEngine());

        //retreives data from above for new squad
        get("/newSquad", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("squad", Squad.getMembers()); //displays squad created
            return new ModelAndView(model, "newSquad.hbs");
        }, new HandlebarsTemplateEngine());

        post("/newSquad", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("cause");

            Squad squad = new Squad(size, name, cause);

            model.put("squad", squad);
            return new ModelAndView(model, "newSquad.hbs");
        }, new HandlebarsTemplateEngine());


    }

    }
