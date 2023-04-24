abstract class TextInput {
    protected StringBuilder input = new StringBuilder();

    public abstract boolean validate();

    public void add(char c) {
        input.append(c);
    }
}

class IntegerTextInput extends TextInput {
    @Override
    public boolean validate() {
        try {
            Integer.parseInt(input.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class FloatTextInput extends IntegerTextInput {
    @Override
    public boolean validate() {
        if (super.validate()) {
            return true;
        }
        try {
            Float.parseFloat(input.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

