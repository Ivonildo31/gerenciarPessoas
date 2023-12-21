package com.pessoas.gerenciarpessoas;

import ucuUseCase.ucSecuredUseCase;
import utuRequest.utRequest;
import utuStateMachine.utTransition;

public class ucTreinamento extends ucSecuredUseCase {

    public void Initialize() {
        super.Initialize();
    }

    public void Finish() {
        super.Finish();
    }

    public ucTreinamento() {
    }

    public void Effect_1_2(utRequest piRequest, utTransition piTransition) {
        piRequest.setProcessed(true);
    }

    public void Effect_1_3(utRequest piRequest, utTransition piTransition) {
        piRequest.setProcessed(true);
    }

    public void Effect_2_4(utRequest piRequest, utTransition piTransition) {
        piRequest.setProcessed(true);
    }

    public void Effect_3_4(utRequest piRequest, utTransition piTransition) {
        piRequest.setProcessed(true);
    }

    public void Effect_4_1(utRequest piRequest, utTransition piTransition) {
        piRequest.setProcessed(true);
    }

    public void Effect_FIM(utRequest piRequest, utTransition piTransition) {
        piRequest.setProcessed(true);
    }
}


