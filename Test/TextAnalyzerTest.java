import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {

    @Test
    void main() {
        Mod2TextAnalyzer.main(new String[0]);
        assertEquals(57, Mod2TextAnalyzer.GetWordCount("the"));
    }
}