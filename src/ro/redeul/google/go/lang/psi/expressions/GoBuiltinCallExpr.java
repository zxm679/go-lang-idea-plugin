package ro.redeul.google.go.lang.psi.expressions;

import ro.redeul.google.go.lang.psi.expressions.literals.GoLiteralIdentifier;

/**
 * Author: Toader Mihai Claudiu <mtoader@gmail.com>
 * <p/>
 * Date: 6/2/11
 * Time: 3:57 AM
 */
public interface GoBuiltinCallExpr extends GoExpr {

    GoLiteralIdentifier getIdentifier();

}
