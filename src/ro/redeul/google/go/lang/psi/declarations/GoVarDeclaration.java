package ro.redeul.google.go.lang.psi.declarations;

import ro.redeul.google.go.lang.psi.GoPsiElement;
import ro.redeul.google.go.lang.psi.expressions.GoExpr;
import ro.redeul.google.go.lang.psi.expressions.literals.GoLiteralIdentifier;

public interface GoVarDeclaration extends GoPsiElement {

    GoLiteralIdentifier[] getIdentifiers();

    GoExpr[] getExpressions();

    /**
     * Whether redeclare variables provided they were originally declared in the same block with the same type.
     * In current spec, it's true for short variable declaration, false for regular variable declaration
     *
     * @return true if it's possible to redeclare variables.
     */
    boolean mayRedeclareVariable();
}
