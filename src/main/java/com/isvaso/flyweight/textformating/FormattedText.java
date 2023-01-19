package com.isvaso.flyweight.textformating;

public class FormattedText {

    private String plaintText;
    private boolean[] capitalize;

    public FormattedText(String plaintText) {
        this.plaintText = plaintText;
        capitalize = new boolean[plaintText.length()];
    }

    public void capitalize(int start, int end) {
        for (int i = start; i <= end ; ++i) {
            capitalize[i] = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plaintText.length(); ++i) {
            char c = plaintText.charAt(i);
            sb.append(capitalize[i] ? Character.toUpperCase(c) : c);
        }
        return sb.toString();
    }
}
