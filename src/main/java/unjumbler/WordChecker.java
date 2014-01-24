package unjumbler;

import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;

import java.io.IOException;
import java.util.List;

public class WordChecker {

    private static JLanguageTool langTool;

    private static JLanguageTool getLangTool() {
        if (langTool == null) {
            try {
                langTool = new JLanguageTool(new AmericanEnglish());
                langTool.activateDefaultPatternRules();
                langTool.check("car"); // First call is always false!
            } catch (IOException e) {
                throw new IllegalStateException("Cannot instantiate WordChecker", e);
            }
        }
        return langTool;
    }

    public static boolean check(String word) {
        List<RuleMatch> matches;

        try {
            matches = getLangTool().check(word);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot check word", e);
        }

        /*
        for (RuleMatch match : matches) {
            System.out.println("Potential error at line " +
                    match.getLine() + ", column " +
                    match.getColumn() + ": " + match.getMessage());
            System.out.println("Suggested correction: " +
                    match.getSuggestedReplacements());
        }
        */

        return (matches == null || matches.isEmpty());
    }
}
