package com.company;

public enum Arabian {
    K1("I"),        K2("II"),       K3("III"),      K4("IV"),       K5("V"),        K6("VI"),       K7("VII"),      K8("VIII"),       K9("IX"),         K10("X"),
    K11("XI"),      K12("XII"),     K13("XIII"),    K14("XIV"),     K15("XV"),      K16("XVI"),     K17("XVII"),    K18("XVIII"),     K19("XIX"),       K20("XX"),
    K21("XXI"),     K22("XXII"),    K23("XXIII"),   K24("XXIV"),    K25("XXV"),     K26("XXVI"),    K27("XXVII"),   K28("XXVIII"),    K29("XXIX"),      K30("XXX"),
    K31("XXXI"),    K32("XXXII"),   K33("XXXIII"),  K34("XXXIV"),   K35("XXXV"),    K36("XXXVI"),   K37("XXXVII"),  K38("XXXVIII"),   K39("XXXIX"),     K40("XL"),
    K41("XLI"),     K42("XLII"),    K43("XLIII"),   K44("XLIV"),    K45("XLV"),     K46("XLVI"),    K47("XLVII"),   K48("XLVIII"),    K49("XLIX"),      K50("L"),
    K51("LI"),      K52("LII"),     K53("LIII"),    K54("LIV"),     K55("LV"),      K56("LVI"),     K57("LVII"),    K58("LVIII"),     K59("LIX"),       K60("LX"),
    K61("LXI"),     K62("LXII"),    K63("LXIII"),   K64("LXIV"),    K65("LXV"),     K66("LXVI"),    K67("LXVII"),   K68("LXVIII"),    K69("LXIX"),      K70("LXX"),
    K71("LXXI"),    K72("LXXII"),   K73("LXXIII"),  K74("LXXIV"),   K75("LXXV"),    K76("LXXVI"),   K77("LXXVII"),  K78("LXXVIII"),   K79("LXXIX"),     K80("LXXX"),
    K81("LXXXI"),   K82("LXXXII"),  K83("LXXXIII"), K84("LXXXIV"),  K85("LXXXV"),   K86("LXXXVI"),  K87("LXXXVII"), K88("LXXXVIII"),  K89("LXXXIX"),    K90("XC"),
    K91("XCI"),     K92("XCII"),    K93("XCIII"),   K94("XCIV"),    K95("XCV"),     K96("XCVI"),    K97("XCVII"),   K98("XCVIII"),    K99("XCIX"),      K100("C");

    private String name;

    Arabian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
