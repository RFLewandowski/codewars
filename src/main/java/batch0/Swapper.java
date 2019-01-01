package batch0;

class Swapper {

    private Object[] arguments;

    public Swapper(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }

    public Object[] getArguments() {
        return arguments;
    }
}