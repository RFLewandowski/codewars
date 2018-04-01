import java.util.HashMap;

public class Welcome {
    public static String greet(String language) {
        HashMap<String, String> map = new HashMap<>();
        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");
        return map.getOrDefault(language, map.get("english"));

//        switch (language) {
//            case "english":
//                return "Welcome";
//            case "czech":
//                return "Vitejte";
//            case "danish":
//                return "Velkomst";
//            case "dutch":
//                return "Welkom";
//            case "estonian":
//                return "Tere tulemast";
//            case "finnish":
//                return "Tervetuloa";
//            case "flemish":
//                return "Welgekomen";
//            case "french":
//                return "Bienvenue";
//            case "german":
//                return "Willkommen";
//            case "irish":
//                return "Failte";
//            case "italian":
//                return "Benvenuto";
//            case "latvian":
//                return "Gaidits";
//            case "lithuanian":
//                return "Laukiamas";
//            case "polish":
//                return "Witamy";
//            case "spanish":
//                return "Bienvenido";
//            case "swedish":
//                return "Valkommen";
//            case "welsh":
//                return "Croeso";
//            default:
//                return "Welcome";
//        }
    }
}