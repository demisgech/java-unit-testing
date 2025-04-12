package com.demiscode.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demiscode.core.HTMLFormatter;

@DisplayName("HTML Formater Tests")
public class HTMLFormatterTests {

    /**
     * General Naming Convention
     * 1. Standard convention
     * methodName_StateUnderTest_ExpectedBehavior, or in words
     * whatIsBeingTested_underWhatConditions_expectWhatOutcome
     * 
     * 2. Alternative Style
     * camelCase e.g shouldReturnZeroWhenCartIsEmpty()
     * underscore-separated returnsZero_whenCartIsEmpty()
     * BDD-style (Given/When/Then) (Behavioral Driven Development)
     * e.g givenEmptyCart_whenCalculateTotal_thenReturnZero()
     */

    /**
     * Generally
     * 📌 Test Method Naming Conventions – Verdict from the Java Pro Crowd
     * 
     * Professional Java developers typically follow one of the following naming
     * conventions
     * for test methods. The choice depends on the purpose of the test, project
     * size, and
     * readability preferences.
     * 
     * ✅ Recommended Conventions:
     * 
     * 1. methodName_StateUnderTest_ExpectedResult (Most Recommended)
     * - Use for: Unit tests
     * - Example: withdraw_withSufficientBalance_decreasesBalance
     * - Pros: Structured, scalable, easy to scan and debug
     * 
     * 2. givenCondition_whenAction_thenOutcome
     * - Use for: Integration tests, behavior-driven scenarios
     * - Example: givenEmptyCart_whenCalculateTotal_thenReturnsZero
     * - Pros: Clear flow of behavior, aligns well with BDD-style thinking
     * 
     * 3. Sentence-style Descriptive Method Names
     * - Use for: Domain-focused or BDD-heavy tests
     * - Example: formatAsBoldWhenCalledShouldEncloseTheStringWithHTMLStrongElement
     * - Pros: Highly descriptive, natural language feel
     * - Cons: Verbose, harder to scan in large test classes
     * 
     * 💡 Pro Tip:
     * Stick to one naming convention consistently across your team or codebase.
     * Most professional Java teams use the first style:
     * methodName_StateUnderTest_ExpectedResult.
     */

    @Test
    public void formatAsBold_withPlainText_enclosesWithStrongTag() {
        var formatter = new HTMLFormatter();

        var result = formatter.formatAsBold("abc");

        // Too specific
        assertThat(result).isEqualTo("<strong>abc</strong>");

        // Too generall
        assertThat("<strong>");

        // Yor test should not be too general or too specific
        assertThat(result)
                .startsWith("<strong>")
                .endsWith("</strong>")
                .contains("abc");

        // When testing string's it is better your test be a little general
        assertThat(result)
                .startsWithIgnoringCase("<strong>")
                .endsWithIgnoringCase("</strong>")
                .containsIgnoringCase("abc");
    }

}
