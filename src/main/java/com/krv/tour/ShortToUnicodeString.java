package com.krv.tour;

public class ShortToUnicodeString extends ArrayInitBaseListener {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.printf("\"");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.printf("\"");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        if (ctx.getText().startsWith("{")) return; // TODO: is this a
        int value = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
