package main
func f(n int) func(p *T) {}
/**-----
Go file
  PackageDeclaration(main)
    PsiElement(KEYWORD_PACKAGE)('package')
    PsiWhiteSpace(' ')
    PsiElement(IDENTIFIER)('main')
  PsiWhiteSpace('\n')
  FunctionDeclaration(f)
    PsiElement(KEYWORD_FUNC)('func')
    PsiWhiteSpace(' ')
    LiteralIdentifierImpl
      PsiElement(IDENTIFIER)('f')
    PsiElement(()('(')
    FunctionParameterListImpl
      FunctionParameterImpl
        LiteralIdentifierImpl
          PsiElement(IDENTIFIER)('n')
        PsiWhiteSpace(' ')
        TypeNameImpl
          LiteralIdentifierImpl
            PsiElement(IDENTIFIER)('int')
    PsiElement())(')')
    PsiWhiteSpace(' ')
    FunctionResult
      FunctionParameterListImpl
        FunctionParameterImpl
          TypeFunctionImpl
            PsiElement(KEYWORD_FUNC)('func')
            PsiElement(()('(')
            FunctionParameterListImpl
              FunctionParameterImpl
                LiteralIdentifierImpl
                  PsiElement(IDENTIFIER)('p')
                PsiWhiteSpace(' ')
                TypePointerImpl
                  PsiElement(*)('*')
                  TypeNameImpl
                    LiteralIdentifierImpl
                      PsiElement(IDENTIFIER)('T')
            PsiElement())(')')
    PsiWhiteSpace(' ')
    BlockStmtImpl
      PsiElement({)('{')
      PsiElement(})('}')
