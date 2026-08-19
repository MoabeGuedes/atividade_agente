public class AgenteIA {

    public void processarPrompt(String prompt) 
            throws FalhaProcessamentoAgenteException {

        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException(
                "O prompt não pode estar vazio."
            );
        }

        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException(
                "Prompt muito longo para o modelo atual."
            );
        }

        System.out.println("Agente processando: " + prompt);
    }

    public void verificarSeguranca(String prompt) 
            throws PromptInadequadoException  {
        if (prompt.equalsIgnoreCase("Hackear") || prompt.equalsIgnoreCase("Roubar")){
            throw new PromptInadequadoException(
                "Prompt com palavras que não seguem nossas diretrizes!"
            );
        }

    }

    public void chamarModeloExterno() throws FalhaDoBancoException{
        double num = Math.random();
        if (num > 0.7){
            throw new FalhaDoBancoException(
                "ErroComunicacaoIAException"
            );
        }        
    }



}