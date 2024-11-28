public class StrategyPattern {

    // Strategy Class
    static class TextFormatter {
        void format(String text) {
        }
    }

    static class UpperCaseFormatter extends TextFormatter {
        @Override
        void format(String text) {
            System.out.println("Formatted Text: " + text.toUpperCase());
        }
    }

    static class LowerCaseFormatter extends TextFormatter {
        @Override
        void format(String text) {
            System.out.println("Formatted Text: " + text.toLowerCase());
        }
    }

    static class TextEditor {
        private TextFormatter formatter;

        public void setFormatter(TextFormatter formatter) {
            this.formatter = formatter;
        }

        public void formatText(String text) {
            formatter.format(text);
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Use UpperCaseFormatter
        editor.setFormatter(new UpperCaseFormatter());
        editor.formatText("Test Strategy Pattern");

        // Use LowerCaseFormatter
        editor.setFormatter(new LowerCaseFormatter());
        editor.formatText("Test Strategy Pattern");
    }

}
