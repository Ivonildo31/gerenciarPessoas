package com.pessoas.gerenciarpessoas.svTemplate;

import com.pessoas.gerenciarpessoas.acRegisterModelMappings;
import com.pessoas.gerenciarpessoas.ucTreinamento;

import acuFramework.acPersistenceManager;
import ucuMain.ucMain;
import ucuManager.ucManager;

public class SvTemplate extends acuServiceApplication.acServiceApplication {
    private acuModel.acMetaModel fMetaModel;
    private acuRepositorySQL.acMetaModelPersistenceMapSQL fMetaModelPersistenceMap;
    
    public SvTemplate(){
        super(null);
    }
   
    protected void DoInitialize()
    {
        super.DoInitialize();

        acuSystemCurrentConfig.acSystemCurrentConfig.getInstance().PortNumber = 5371;
        acuSystemCurrentConfig.acSystemCurrentConfig.getInstance().ServiceDisplayName = "treinamento";
        acuSystemCurrentConfig.acSystemCurrentConfig.getInstance().ServiceDescription = "desc treinamento";

        fMetaModel = new acuModel.acMetaModel(acPersistenceManager.getInstance().getModelImplementation());
        fMetaModelPersistenceMap = new acuRepositorySQL.acMetaModelPersistenceMapSQL(fMetaModel);
        acPersistenceManager.getInstance().RegisterModelMapping(fMetaModelPersistenceMap);
        acRegisterModelMappings.RegisterModelMappings(fMetaModelPersistenceMap);
        acPersistenceManager.getInstance().Initialize();

        ucManager.getInstance().RegisterClass("1", ucMain.class);
        ucManager.getInstance().RegisterClass("5678", ucTreinamento.class);
        
    }

    protected void DoStart()
    {
        super.DoStart();
    }
    
    protected void DoStop()        
    {
       super.DoStop();
    }
    
    protected void DoPause()        
    {
       super.DoPause();
    }
    
    protected void DoContinue()        
    {
       super.DoContinue();
    }
   
}
