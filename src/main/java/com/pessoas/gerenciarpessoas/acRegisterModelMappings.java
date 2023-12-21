package com.pessoas.gerenciarpessoas;

import acuRepositorySQL.*;
import acuModel.*;
import utuStateMachine.*;
import acuUseCaseStateMachine.*;

	public class acRegisterModelMappings {
	
		
		static void RegisterClassTickets1(acMetaModel piMetaModel, acMetaModelPersistenceMapSQL piMetaModelPersistenceMap) {
			acClassTicket lClassMapTicket;
			acDBIdoMapTicket lDBIntIdoMapTicket;
			acClassToDBMapTicket lClassToDBMapTicket;
			acAttributeTicket prop;
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("972","ngAnalysis","acPersistentObject", 6);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONEIDANAL");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("972", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONETANALY");
			lClassToDBMapTicket.setTypeColumnName("MONEIDTYPE");
			acClassTicket arg_972_0 = lClassMapTicket;
			String piAttributeName1;
			piAttributeName1 = "Name";
			prop = arg_972_0.NewAttributeTicket(piAttributeName1, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(60);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONENAMEEE");
			acClassTicket arg_972_1 = lClassMapTicket;
			String piAttributeName2;
			piAttributeName2 = "Description";
			prop = arg_972_1.NewAttributeTicket(piAttributeName2, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(200);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONEDESCRI");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("2078","ngAnalysisServerRequests","ngAnalysis", 6);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONEIDANAL");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("2078", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONETANALY");
			lClassToDBMapTicket.setTypeColumnName("MONEIDTYPE");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("1320","ngAnalysisSystemErrors","ngAnalysis", 6);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONEIDANAL");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("1320", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONETANALY");
			lClassToDBMapTicket.setTypeColumnName("MONEIDTYPE");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("973","ngAnalysisType","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONFIDANTY");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("973", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONFTANTYP");
			acClassTicket arg_973_0 = lClassMapTicket;
			String piAttributeName3;
			piAttributeName3 = "Name";
			prop = arg_973_0.NewAttributeTicket(piAttributeName3, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(60);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONFNAMEEE");
			acClassTicket arg_973_1 = lClassMapTicket;
			String piAttributeName4;
			piAttributeName4 = "Description";
			prop = arg_973_1.NewAttributeTicket(piAttributeName4, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(200);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONFDESCRI");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("362","ngAuditEvent","acPersistentObject", 9);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SISCIDAUDI");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("362", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SISCTAUDIT");
			acClassTicket arg_362_0 = lClassMapTicket;
			String piAttributeName5;
			piAttributeName5 = "TransactionId";
			prop = arg_362_0.NewAttributeTicket(piAttributeName5, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(38);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCTRANID");
			acClassTicket arg_362_1 = lClassMapTicket;
			String piAttributeName6;
			piAttributeName6 = "Date";
			prop = arg_362_1.NewAttributeTicket(piAttributeName6, "acDateTime", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCDATETI");
			acClassTicket arg_362_2 = lClassMapTicket;
			String piAttributeName7;
			piAttributeName7 = "UserName";
			prop = arg_362_2.NewAttributeTicket(piAttributeName7, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(30);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCUSERNA");
			acClassTicket arg_362_3 = lClassMapTicket;
			String piAttributeName8;
			piAttributeName8 = "EventType";
			prop = arg_362_3.NewAttributeTicket(piAttributeName8, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(10);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCEVNTYP");
			acClassTicket arg_362_4 = lClassMapTicket;
			String piAttributeName9;
			piAttributeName9 = "UseCaseName";
			prop = arg_362_4.NewAttributeTicket(piAttributeName9, "acString", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCUCNAME");
			acClassTicket arg_362_5 = lClassMapTicket;
			String piAttributeName10;
			piAttributeName10 = "ObjectClassName";
			prop = arg_362_5.NewAttributeTicket(piAttributeName10, "acString", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCCLNAME");
			acClassTicket arg_362_6 = lClassMapTicket;
			String piAttributeName11;
			piAttributeName11 = "ObjectOID";
			prop = arg_362_6.NewAttributeTicket(piAttributeName11, "acString", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(40);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCOBJOID");
			acClassTicket arg_362_7 = lClassMapTicket;
			String piAttributeName12;
			piAttributeName12 = "Context";
			prop = arg_362_7.NewAttributeTicket(piAttributeName12, "acString", acAttributeStereotype.pvPersistent, false, 7);
			prop.setFixSize(0);
			prop.setVarSize(255);
			prop.setMandatory(false);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISCCONTEX");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("363","ngAuditEventData","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SISDIDEVND");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("363", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SISDTEVNDA");
			acClassTicket arg_363_0 = lClassMapTicket;
			String piAttributeName13;
			piAttributeName13 = "DataName";
			prop = arg_363_0.NewAttributeTicket(piAttributeName13, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISDDATNAM");
			acClassTicket arg_363_1 = lClassMapTicket;
			String piAttributeName14;
			piAttributeName14 = "OldValue";
			prop = arg_363_1.NewAttributeTicket(piAttributeName14, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(4000);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISDOLDVAL");
			acClassTicket arg_363_2 = lClassMapTicket;
			String piAttributeName15;
			piAttributeName15 = "NewValue";
			prop = arg_363_2.NewAttributeTicket(piAttributeName15, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(4000);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISDNEWVAL");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("2275","ngAxisX","acPersistentObject", 8);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONKIDAXIS");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("2275", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONKTAXISX");
			acClassTicket arg_2275_0 = lClassMapTicket;
			String piAttributeName16;
			piAttributeName16 = "Code";
			prop = arg_2275_0.NewAttributeTicket(piAttributeName16, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKCODEEE");
			acClassTicket arg_2275_1 = lClassMapTicket;
			String piAttributeName17;
			piAttributeName17 = "Description";
			prop = arg_2275_1.NewAttributeTicket(piAttributeName17, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(200);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKDESCRI");
			acClassTicket arg_2275_2 = lClassMapTicket;
			String piAttributeName18;
			piAttributeName18 = "LevelCount";
			prop = arg_2275_2.NewAttributeTicket(piAttributeName18, "acInt", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKLVCOUN");
			acClassTicket arg_2275_3 = lClassMapTicket;
			String piAttributeName19;
			piAttributeName19 = "Divisor";
			prop = arg_2275_3.NewAttributeTicket(piAttributeName19, "acInt", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKDIVISO");
			acClassTicket arg_2275_4 = lClassMapTicket;
			String piAttributeName20;
			piAttributeName20 = "MaiorUltimaFaixa";
			prop = arg_2275_4.NewAttributeTicket(piAttributeName20, "acInt", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKMAIULT");
			acClassTicket arg_2275_5 = lClassMapTicket;
			String piAttributeName21;
			piAttributeName21 = "MenorPrimeiraFaixa";
			prop = arg_2275_5.NewAttributeTicket(piAttributeName21, "acInt", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKMENPRI");
			acClassTicket arg_2275_6 = lClassMapTicket;
			String piAttributeName22;
			piAttributeName22 = "FaixaSistema";
			prop = arg_2275_6.NewAttributeTicket(piAttributeName22, "acInt", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONKFAISIT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("278","ngBusinessEvent","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTAIDBUEV");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("278", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTATBUEVN");
			acClassTicket arg_278_0 = lClassMapTicket;
			String piAttributeName23;
			piAttributeName23 = "Data";
			prop = arg_278_0.NewAttributeTicket(piAttributeName23, "acText", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("TEXT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTADATAAA");
			acClassTicket arg_278_1 = lClassMapTicket;
			String piAttributeName24;
			piAttributeName24 = "PublishDateTime";
			prop = arg_278_1.NewAttributeTicket(piAttributeName24, "acDateTime", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTAPUBLDT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("744","ngBusinessEventDistributed","acPersistentObject", 1);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTLIDBUED");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("744", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTLTBUEVD");
			acClassTicket arg_744_0 = lClassMapTicket;
			String piAttributeName25;
			piAttributeName25 = "DistributedDateTime";
			prop = arg_744_0.NewAttributeTicket(piAttributeName25, "acDateTime", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTLDISTDT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("2964","ngBusinessEventManager","acPersistentObject", 2);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTNIMANAG");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("2964", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTNTMANAG");
			acClassTicket arg_2964_0 = lClassMapTicket;
			String piAttributeName26;
			piAttributeName26 = "Name";
			prop = arg_2964_0.NewAttributeTicket(piAttributeName26, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTNNAME");
			acClassTicket arg_2964_1 = lClassMapTicket;
			String piAttributeName27;
			piAttributeName27 = "LastExec";
			prop = arg_2964_1.NewAttributeTicket(piAttributeName27, "acDateTime", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTNEXECDT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("279","ngBusinessEventSubscriber","acPersistentObject", 9);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTBIDSUBS");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("279", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTBTSUBSC");
			acClassTicket arg_279_0 = lClassMapTicket;
			String piAttributeName28;
			piAttributeName28 = "code";
			prop = arg_279_0.NewAttributeTicket(piAttributeName28, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTBCODEE");
			acClassTicket arg_279_1 = lClassMapTicket;
			String piAttributeName29;
			piAttributeName29 = "Name";
			prop = arg_279_1.NewAttributeTicket(piAttributeName29, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTBNAMEE");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("743","ngBusinessEventSubscriberError","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTJIDSBER");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("743", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTJTSBERR");
			acClassTicket arg_743_0 = lClassMapTicket;
			String piAttributeName30;
			piAttributeName30 = "ErrorDate";
			prop = arg_743_0.NewAttributeTicket(piAttributeName30, "acDateTime", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTJDTERRO");
			acClassTicket arg_743_1 = lClassMapTicket;
			String piAttributeName31;
			piAttributeName31 = "Description";
			prop = arg_743_1.NewAttributeTicket(piAttributeName31, "acText", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(512);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTJDESCRI");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("280","ngBusinessEventType","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTCIDEVNT");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("280", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTCTEVNTP");
			acClassTicket arg_280_0 = lClassMapTicket;
			String piAttributeName32;
			piAttributeName32 = "Code";
			prop = arg_280_0.NewAttributeTicket(piAttributeName32, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTCCODEEE");
			acClassTicket arg_280_1 = lClassMapTicket;
			String piAttributeName33;
			piAttributeName33 = "Name";
			prop = arg_280_1.NewAttributeTicket(piAttributeName33, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTCNAMEEE");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("742","ngBusinessSubscriberNotifierEventualTimeWindow","acPersistentObject", 7);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTHIDETMW");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("742", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTHTETMWI");
			acClassTicket arg_742_0 = lClassMapTicket;
			String piAttributeName34;
			piAttributeName34 = "ValidAt";
			prop = arg_742_0.NewAttributeTicket(piAttributeName34, "acDateTime", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTHVDATTT");
			acClassTicket arg_742_1 = lClassMapTicket;
			String piAttributeName35;
			piAttributeName35 = "StartAt";
			prop = arg_742_1.NewAttributeTicket(piAttributeName35, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTHSTARTA");
			acClassTicket arg_742_2 = lClassMapTicket;
			String piAttributeName36;
			piAttributeName36 = "EndAt";
			prop = arg_742_2.NewAttributeTicket(piAttributeName36, "acInt", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTHENDATT");
			acClassTicket arg_742_3 = lClassMapTicket;
			String piAttributeName37;
			piAttributeName37 = "Code";
			prop = arg_742_3.NewAttributeTicket(piAttributeName37, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTHCODEEE");
			acClassTicket arg_742_4 = lClassMapTicket;
			String piAttributeName38;
			piAttributeName38 = "ClosedAt";
			prop = arg_742_4.NewAttributeTicket(piAttributeName38, "acInt", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTHCLOSAT");
			acClassTicket arg_742_5 = lClassMapTicket;
			String piAttributeName39;
			piAttributeName39 = "OpenedAt";
			prop = arg_742_5.NewAttributeTicket(piAttributeName39, "acInt", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTHOPENAT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("740","ngBusinessSubscriberNotifierTimeGrid","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTFIDTMGR");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("740", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTFTTMGRD");
			acClassTicket arg_740_0 = lClassMapTicket;
			String piAttributeName40;
			piAttributeName40 = "ValidFrom";
			prop = arg_740_0.NewAttributeTicket(piAttributeName40, "acDateTime", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTFVDFROM");
			acClassTicket arg_740_1 = lClassMapTicket;
			String piAttributeName41;
			piAttributeName41 = "ValidTo";
			prop = arg_740_1.NewAttributeTicket(piAttributeName41, "acDateTime", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("DATETIME");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTFVDTOOO");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("741","ngBusinessSubscriberNotifierTimeWindow","acPersistentObject", 6);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("INTGIDTMWI");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("741", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("INTGTTMWIN");
			acClassTicket arg_741_0 = lClassMapTicket;
			String piAttributeName42;
			piAttributeName42 = "StartAt";
			prop = arg_741_0.NewAttributeTicket(piAttributeName42, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTGSTARTA");
			acClassTicket arg_741_1 = lClassMapTicket;
			String piAttributeName43;
			piAttributeName43 = "EndAt";
			prop = arg_741_1.NewAttributeTicket(piAttributeName43, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTGENDATT");
			acClassTicket arg_741_2 = lClassMapTicket;
			String piAttributeName44;
			piAttributeName44 = "Code";
			prop = arg_741_2.NewAttributeTicket(piAttributeName44, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTGCODEEE");
			acClassTicket arg_741_3 = lClassMapTicket;
			String piAttributeName45;
			piAttributeName45 = "OpenedAt";
			prop = arg_741_3.NewAttributeTicket(piAttributeName45, "acInt", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTGOPENAT");
			acClassTicket arg_741_4 = lClassMapTicket;
			String piAttributeName46;
			piAttributeName46 = "ClosedAt";
			prop = arg_741_4.NewAttributeTicket(piAttributeName46, "acInt", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(4);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("INT");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("INTGCLOSAT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-3","ngCategory","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESDIDCATE");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-3", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESDTCATEG");
			acClassTicket arg_A3_0 = lClassMapTicket;
			String piAttributeName47;
			piAttributeName47 = "Name";
			prop = arg_A3_0.NewAttributeTicket(piAttributeName47, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESDNMCATE");
			acClassTicket arg_A3_1 = lClassMapTicket;
			String piAttributeName48;
			piAttributeName48 = "Code";
			prop = arg_A3_1.NewAttributeTicket(piAttributeName48, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESDCDCATE");
			acClassTicket arg_A3_2 = lClassMapTicket;
			String piAttributeName49;
			piAttributeName49 = "Situation";
			prop = arg_A3_2.NewAttributeTicket(piAttributeName49, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESDCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-4","ngEntity","acPersistentObject", 5);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESCIDENTI");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-4", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESCTENTID");
			acClassTicket arg_A4_0 = lClassMapTicket;
			String piAttributeName50;
			piAttributeName50 = "Name";
			prop = arg_A4_0.NewAttributeTicket(piAttributeName50, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESCNMENTI");
			acClassTicket arg_A4_1 = lClassMapTicket;
			String piAttributeName51;
			piAttributeName51 = "Code";
			prop = arg_A4_1.NewAttributeTicket(piAttributeName51, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESCCDENTI");
			acClassTicket arg_A4_2 = lClassMapTicket;
			String piAttributeName52;
			piAttributeName52 = "Caption";
			prop = arg_A4_2.NewAttributeTicket(piAttributeName52, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESCTIENTI");
			acClassTicket arg_A4_3 = lClassMapTicket;
			String piAttributeName53;
			piAttributeName53 = "Situation";
			prop = arg_A4_3.NewAttributeTicket(piAttributeName53, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESCCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-8","ngEvent","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SEGCIDESEG");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-8", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SEGCTEVSEG");
			acClassTicket arg_A8_0 = lClassMapTicket;
			String piAttributeName54;
			piAttributeName54 = "DtLaunching";
			prop = arg_A8_0.NewAttributeTicket(piAttributeName54, "acDateTime", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGCDTLANC");
			acClassTicket arg_A8_1 = lClassMapTicket;
			String piAttributeName55;
			piAttributeName55 = "EventType";
			prop = arg_A8_1.NewAttributeTicket(piAttributeName55, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("char");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGCTPEVEN");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("963","ngEventLog","acPersistentObject", 14);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONBIDEVLO");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("963", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONBTEVLOG");
			acClassTicket arg_963_0 = lClassMapTicket;
			String piAttributeName56;
			piAttributeName56 = "Code";
			prop = arg_963_0.NewAttributeTicket(piAttributeName56, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBCODEEE");
			acClassTicket arg_963_1 = lClassMapTicket;
			String piAttributeName57;
			piAttributeName57 = "EventType";
			prop = arg_963_1.NewAttributeTicket(piAttributeName57, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(60);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBEVTYPE");
			acClassTicket arg_963_2 = lClassMapTicket;
			String piAttributeName58;
			piAttributeName58 = "Source";
			prop = arg_963_2.NewAttributeTicket(piAttributeName58, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(60);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBSOURCE");
			acClassTicket arg_963_3 = lClassMapTicket;
			String piAttributeName59;
			piAttributeName59 = "Description";
			prop = arg_963_3.NewAttributeTicket(piAttributeName59, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(200);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBDESCRI");
			acClassTicket arg_963_4 = lClassMapTicket;
			String piAttributeName60;
			piAttributeName60 = "User";
			prop = arg_963_4.NewAttributeTicket(piAttributeName60, "acString", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(0);
			prop.setVarSize(40);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBUSERRR");
			acClassTicket arg_963_5 = lClassMapTicket;
			String piAttributeName61;
			piAttributeName61 = "System";
			prop = arg_963_5.NewAttributeTicket(piAttributeName61, "acString", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(0);
			prop.setVarSize(30);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBSYSTEM");
			acClassTicket arg_963_6 = lClassMapTicket;
			String piAttributeName62;
			piAttributeName62 = "DateTime";
			prop = arg_963_6.NewAttributeTicket(piAttributeName62, "acDateTime", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBDTTIME");
			acClassTicket arg_963_7 = lClassMapTicket;
			String piAttributeName63;
			piAttributeName63 = "Session";
			prop = arg_963_7.NewAttributeTicket(piAttributeName63, "acString", acAttributeStereotype.pvPersistent, false, 7);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBSESSION");
			acClassTicket arg_963_8 = lClassMapTicket;
			String piAttributeName64;
			piAttributeName64 = "PeerName";
			prop = arg_963_8.NewAttributeTicket(piAttributeName64, "acString", acAttributeStereotype.pvPersistent, false, 8);
			prop.setFixSize(0);
			prop.setVarSize(30);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBPEERNA");
			acClassTicket arg_963_9 = lClassMapTicket;
			String piAttributeName65;
			piAttributeName65 = "UCInstance";
			prop = arg_963_9.NewAttributeTicket(piAttributeName65, "acString", acAttributeStereotype.pvPersistent, false, 9);
			prop.setFixSize(0);
			prop.setVarSize(120);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBUCINST");
			acClassTicket arg_963_10 = lClassMapTicket;
			String piAttributeName66;
			piAttributeName66 = "Serial";
			prop = arg_963_10.NewAttributeTicket(piAttributeName66, "acInt", acAttributeStereotype.pvPersistent, false, 10);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBSERIAL");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("964","ngEventLogDetail","acPersistentObject", 2);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONCIDEVLD");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("964", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONCTEVLDT");
			acClassTicket arg_964_0 = lClassMapTicket;
			String piAttributeName67;
			piAttributeName67 = "Detail";
			prop = arg_964_0.NewAttributeTicket(piAttributeName67, "acText", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(32000);
			prop.setMandatory(true);
			prop.setDBType("text");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONCLOGDET");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("974","ngEventType","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONGIDEVTP");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("974", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONGTEVTYP");
			acClassTicket arg_974_0 = lClassMapTicket;
			String piAttributeName68;
			piAttributeName68 = "Code";
			prop = arg_974_0.NewAttributeTicket(piAttributeName68, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONGCODEEE");
			acClassTicket arg_974_1 = lClassMapTicket;
			String piAttributeName69;
			piAttributeName69 = "ClassTypeName";
			prop = arg_974_1.NewAttributeTicket(piAttributeName69, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(60);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONGCLASSS");
			acClassTicket arg_974_2 = lClassMapTicket;
			String piAttributeName70;
			piAttributeName70 = "Description";
			prop = arg_974_2.NewAttributeTicket(piAttributeName70, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(200);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONGDESCRI");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("128","ngGUITicket","acPersistentObject", 5);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESOIDINTE");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("128", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESOTINTER");
			acClassTicket arg_128_0 = lClassMapTicket;
			String piAttributeName71;
			piAttributeName71 = "Name";
			prop = arg_128_0.NewAttributeTicket(piAttributeName71, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESONMINTE");
			acClassTicket arg_128_1 = lClassMapTicket;
			String piAttributeName72;
			piAttributeName72 = "Code";
			prop = arg_128_1.NewAttributeTicket(piAttributeName72, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESOCDINTE");
			acClassTicket arg_128_2 = lClassMapTicket;
			String piAttributeName73;
			piAttributeName73 = "Description";
			prop = arg_128_2.NewAttributeTicket(piAttributeName73, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(250);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESODSINTE");
			acClassTicket arg_128_3 = lClassMapTicket;
			String piAttributeName74;
			piAttributeName74 = "Situation";
			prop = arg_128_3.NewAttributeTicket(piAttributeName74, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESOCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-2","ngIcon","acPersistentObject", 5);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESFIDCUIC");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-2", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESFTCUICO");
			acClassTicket arg_A2_0 = lClassMapTicket;
			String piAttributeName75;
			piAttributeName75 = "Description";
			prop = arg_A2_0.NewAttributeTicket(piAttributeName75, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESFDSCUIC");
			acClassTicket arg_A2_1 = lClassMapTicket;
			String piAttributeName76;
			piAttributeName76 = "Code";
			prop = arg_A2_1.NewAttributeTicket(piAttributeName76, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESFCDCUIC");
			acClassTicket arg_A2_2 = lClassMapTicket;
			String piAttributeName77;
			piAttributeName77 = "Image";
			prop = arg_A2_2.NewAttributeTicket(piAttributeName77, "acBlob", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(16);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("image");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESFIMCUIC");
			acClassTicket arg_A2_3 = lClassMapTicket;
			String piAttributeName78;
			piAttributeName78 = "Situation";
			prop = arg_A2_3.NewAttributeTicket(piAttributeName78, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESFCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("2276","ngInterval","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONJIDINTE");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("2276", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONJTINTER");
			acClassTicket arg_2276_0 = lClassMapTicket;
			String piAttributeName79;
			piAttributeName79 = "Inicio";
			prop = arg_2276_0.NewAttributeTicket(piAttributeName79, "acDouble", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(10);
			prop.setVarSize(2);
			prop.setMandatory(true);
			prop.setDBType("Decimal");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONBFXINIC");
			acClassTicket arg_2276_1 = lClassMapTicket;
			String piAttributeName80;
			piAttributeName80 = "Fim";
			prop = arg_2276_1.NewAttributeTicket(piAttributeName80, "acDouble", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(10);
			prop.setVarSize(2);
			prop.setMandatory(true);
			prop.setDBType("Decimal");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONJFXFIMM");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-11","ngLevel","acPersistentObject", 5);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESHIDLEVE");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-11", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESHTLEVEL");
			acClassTicket arg_A11_0 = lClassMapTicket;
			String piAttributeName81;
			piAttributeName81 = "Code";
			prop = arg_A11_0.NewAttributeTicket(piAttributeName81, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESHCDLEVE");
			acClassTicket arg_A11_1 = lClassMapTicket;
			String piAttributeName82;
			piAttributeName82 = "Description";
			prop = arg_A11_1.NewAttributeTicket(piAttributeName82, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESHDSLEVE");
			acClassTicket arg_A11_2 = lClassMapTicket;
			String piAttributeName83;
			piAttributeName83 = "Situation";
			prop = arg_A11_2.NewAttributeTicket(piAttributeName83, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESHCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("2772","ngLogStatistics","acPersistentObject", 9);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONLIDSTAT");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("2772", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONLTSTATI");
			acClassTicket arg_2772_0 = lClassMapTicket;
			String piAttributeName84;
			piAttributeName84 = "Source";
			prop = arg_2772_0.NewAttributeTicket(piAttributeName84, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(255);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLSOURCE");
			acClassTicket arg_2772_1 = lClassMapTicket;
			String piAttributeName85;
			piAttributeName85 = "RequestID";
			prop = arg_2772_1.NewAttributeTicket(piAttributeName85, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(255);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLRQSTID");
			acClassTicket arg_2772_2 = lClassMapTicket;
			String piAttributeName86;
			piAttributeName86 = "StartTime";
			prop = arg_2772_2.NewAttributeTicket(piAttributeName86, "acDateTime", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLSTTIME");
			acClassTicket arg_2772_3 = lClassMapTicket;
			String piAttributeName87;
			piAttributeName87 = "Duration";
			prop = arg_2772_3.NewAttributeTicket(piAttributeName87, "acInt", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLDUTIME");
			acClassTicket arg_2772_4 = lClassMapTicket;
			String piAttributeName88;
			piAttributeName88 = "QueueTime";
			prop = arg_2772_4.NewAttributeTicket(piAttributeName88, "acInt", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLQUTIME");
			acClassTicket arg_2772_5 = lClassMapTicket;
			String piAttributeName89;
			piAttributeName89 = "CPUTime";
			prop = arg_2772_5.NewAttributeTicket(piAttributeName89, "acInt", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLCPTIME");
			acClassTicket arg_2772_6 = lClassMapTicket;
			String piAttributeName90;
			piAttributeName90 = "RequestSize";
			prop = arg_2772_6.NewAttributeTicket(piAttributeName90, "acInt", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLRQSIZE");
			acClassTicket arg_2772_7 = lClassMapTicket;
			String piAttributeName91;
			piAttributeName91 = "ResponseSize";
			prop = arg_2772_7.NewAttributeTicket(piAttributeName91, "acInt", acAttributeStereotype.pvPersistent, false, 7);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONLRSSIZE");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("132","ngNatureza","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SEGDIDNAUS");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("132", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SEGDTNAUSU");
			acClassTicket arg_132_0 = lClassMapTicket;
			String piAttributeName92;
			piAttributeName92 = "Codigo";
			prop = arg_132_0.NewAttributeTicket(piAttributeName92, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGDCDNAUS");
			acClassTicket arg_132_1 = lClassMapTicket;
			String piAttributeName93;
			piAttributeName93 = "Descricao";
			prop = arg_132_1.NewAttributeTicket(piAttributeName93, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGDDSNAUS");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-9","ngOperation","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESJIDOPER");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-9", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESJTOPERA");
			acClassTicket arg_A9_0 = lClassMapTicket;
			String piAttributeName94;
			piAttributeName94 = "Description";
			prop = arg_A9_0.NewAttributeTicket(piAttributeName94, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESJDSOPER");
			acClassTicket arg_A9_1 = lClassMapTicket;
			String piAttributeName95;
			piAttributeName95 = "Code";
			prop = arg_A9_1.NewAttributeTicket(piAttributeName95, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESJCDOPER");
			acClassTicket arg_A9_2 = lClassMapTicket;
			String piAttributeName96;
			piAttributeName96 = "Situation";
			prop = arg_A9_2.NewAttributeTicket(piAttributeName96, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESJCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-7","ngPermission","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SEGBIDPERM");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-7", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SEGBTPERMI");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("1518","ngProfile","acPersistentObject", 5);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESSIDPROF");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("1518", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESSTPROFI");
			acClassTicket arg_1518_0 = lClassMapTicket;
			String piAttributeName97;
			piAttributeName97 = "Code";
			prop = arg_1518_0.NewAttributeTicket(piAttributeName97, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESSCDPROF");
			acClassTicket arg_1518_1 = lClassMapTicket;
			String piAttributeName98;
			piAttributeName98 = "Name";
			prop = arg_1518_1.NewAttributeTicket(piAttributeName98, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(40);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESSNMPROF");
			acClassTicket arg_1518_2 = lClassMapTicket;
			String piAttributeName99;
			piAttributeName99 = "Description";
			prop = arg_1518_2.NewAttributeTicket(piAttributeName99, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESSDSPROF");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("2952","ngResource","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESVIDRESR");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("2952", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESVTRESRC");
			acClassTicket arg_2952_0 = lClassMapTicket;
			String piAttributeName100;
			piAttributeName100 = "ResourceID";
			prop = arg_2952_0.NewAttributeTicket(piAttributeName100, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESVRESRID");
			acClassTicket arg_2952_1 = lClassMapTicket;
			String piAttributeName101;
			piAttributeName101 = "MIMEType";
			prop = arg_2952_1.NewAttributeTicket(piAttributeName101, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESVMIMETP");
			acClassTicket arg_2952_2 = lClassMapTicket;
			String piAttributeName102;
			piAttributeName102 = "CreateDatetime";
			prop = arg_2952_2.NewAttributeTicket(piAttributeName102, "acDateTime", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESVCREADT");
			acClassTicket arg_2952_3 = lClassMapTicket;
			String piAttributeName103;
			piAttributeName103 = "Data";
			prop = arg_2952_3.NewAttributeTicket(piAttributeName103, "acBlob", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("IMAGE");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESVRESRCE");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("971","ngSample","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONDIDSAMP");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("971", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONDTSAMPL");
			acClassTicket arg_971_0 = lClassMapTicket;
			String piAttributeName104;
			piAttributeName104 = "StartTime";
			prop = arg_971_0.NewAttributeTicket(piAttributeName104, "acDateTime", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONDSTTIME");
			acClassTicket arg_971_1 = lClassMapTicket;
			String piAttributeName105;
			piAttributeName105 = "EndTime";
			prop = arg_971_1.NewAttributeTicket(piAttributeName105, "acDateTime", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONDENTIME");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("838","ngSerialNumber","acPersistentObject", 2);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SISGIDSERN");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("838", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SISGSERNUM");
			acClassTicket arg_838_0 = lClassMapTicket;
			String piAttributeName106;
			piAttributeName106 = "Number";
			prop = arg_838_0.NewAttributeTicket(piAttributeName106, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("Int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISGSERNUM");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("839","ngSerialNumberGroup","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SISFIDSERG");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("839", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SISFSERGRP");
			acClassTicket arg_839_0 = lClassMapTicket;
			String piAttributeName107;
			piAttributeName107 = "LastUsedNumber";
			prop = arg_839_0.NewAttributeTicket(piAttributeName107, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("Int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISFLSTNUM");
			acClassTicket arg_839_1 = lClassMapTicket;
			String piAttributeName108;
			piAttributeName108 = "InitialNumber";
			prop = arg_839_1.NewAttributeTicket(piAttributeName108, "acInt", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("Int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SISFININUM");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("269","ngService","acPersistentObject", 8);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("MONAIDSERV");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("269", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("MONATSERVE");
			acClassTicket arg_269_0 = lClassMapTicket;
			String piAttributeName109;
			piAttributeName109 = "Caption";
			prop = arg_269_0.NewAttributeTicket(piAttributeName109, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONACAPTIO");
			acClassTicket arg_269_1 = lClassMapTicket;
			String piAttributeName110;
			piAttributeName110 = "Address";
			prop = arg_269_1.NewAttributeTicket(piAttributeName110, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONAADDRES");
			acClassTicket arg_269_2 = lClassMapTicket;
			String piAttributeName111;
			piAttributeName111 = "Port";
			prop = arg_269_2.NewAttributeTicket(piAttributeName111, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(30);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONASERVIC");
			acClassTicket arg_269_3 = lClassMapTicket;
			String piAttributeName112;
			piAttributeName112 = "SystemCode";
			prop = arg_269_3.NewAttributeTicket(piAttributeName112, "acInt", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONASYSCOD");
			acClassTicket arg_269_4 = lClassMapTicket;
			String piAttributeName113;
			piAttributeName113 = "UserName";
			prop = arg_269_4.NewAttributeTicket(piAttributeName113, "acString", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(0);
			prop.setVarSize(40);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONAUSRNAM");
			acClassTicket arg_269_5 = lClassMapTicket;
			String piAttributeName114;
			piAttributeName114 = "Password";
			prop = arg_269_5.NewAttributeTicket(piAttributeName114, "acString", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONAPASSWO");
			acClassTicket arg_269_6 = lClassMapTicket;
			String piAttributeName115;
			piAttributeName115 = "MaxReconnectionAttempts";
			prop = arg_269_6.NewAttributeTicket(piAttributeName115, "acInt", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONAMAXATT");
			acClassTicket arg_269_7 = lClassMapTicket;
			String piAttributeName116;
			piAttributeName116 = "ReconnectionAttemptDelay";
			prop = arg_269_7.NewAttributeTicket(piAttributeName116, "acInt", acAttributeStereotype.pvPersistent, false, 7);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("MONAATTDEL");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-5","ngSystem","acPersistentObject", 10);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESAIDSIST");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-5", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESATSISTE");
			acClassTicket arg_A5_0 = lClassMapTicket;
			String piAttributeName117;
			piAttributeName117 = "Name";
			prop = arg_A5_0.NewAttributeTicket(piAttributeName117, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(10);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESANMSIST");
			acClassTicket arg_A5_1 = lClassMapTicket;
			String piAttributeName118;
			piAttributeName118 = "Description";
			prop = arg_A5_1.NewAttributeTicket(piAttributeName118, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESADSSIST");
			acClassTicket arg_A5_2 = lClassMapTicket;
			String piAttributeName119;
			piAttributeName119 = "Version";
			prop = arg_A5_2.NewAttributeTicket(piAttributeName119, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(10);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESAVERSAO");
			acClassTicket arg_A5_3 = lClassMapTicket;
			String piAttributeName120;
			piAttributeName120 = "Code";
			prop = arg_A5_3.NewAttributeTicket(piAttributeName120, "acInt", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESACDSIST");
			acClassTicket arg_A5_4 = lClassMapTicket;
			String piAttributeName121;
			piAttributeName121 = "Situation";
			prop = arg_A5_4.NewAttributeTicket(piAttributeName121, "acString", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESACDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-12","ngSystemConfigUpdateLog","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESQIDUPLO");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-12", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESQTUPLOG");
			acClassTicket arg_A12_0 = lClassMapTicket;
			String piAttributeName122;
			piAttributeName122 = "XMLLog";
			prop = arg_A12_0.NewAttributeTicket(piAttributeName122, "acText", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(9999999);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("Text");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESQXMLOG");
			acClassTicket arg_A12_1 = lClassMapTicket;
			String piAttributeName123;
			piAttributeName123 = "UpdateDate";
			prop = arg_A12_1.NewAttributeTicket(piAttributeName123, "acDateTime", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESQUDATE");
			acClassTicket arg_A12_2 = lClassMapTicket;
			String piAttributeName124;
			piAttributeName124 = "UserLogin";
			prop = arg_A12_2.NewAttributeTicket(piAttributeName124, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(true);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESQCDLOGI");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("129","ngSystemGUITickets","acPersistentObject", 4);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESPIDSISI");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("129", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESPTSISIN");
			acClassTicket arg_129_0 = lClassMapTicket;
			String piAttributeName125;
			piAttributeName125 = "Situation";
			prop = arg_129_0.NewAttributeTicket(piAttributeName125, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESPCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-14","ngSystemUseCaseTicket","acPersistentObject", 3);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESEIDSISC");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-14", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESETSISCU");
			acClassTicket arg_A14_0 = lClassMapTicket;
			String piAttributeName126;
			piAttributeName126 = "Situation";
			prop = arg_A14_0.NewAttributeTicket(piAttributeName126, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESECDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-1","ngUseCaseTicket","acPersistentObject", 11);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESBIDCASO");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-1", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESBTCASOU");
			acClassTicket arg_A1_0 = lClassMapTicket;
			String piAttributeName127;
			piAttributeName127 = "Description";
			prop = arg_A1_0.NewAttributeTicket(piAttributeName127, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(250);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESBDSCASO");
			acClassTicket arg_A1_1 = lClassMapTicket;
			String piAttributeName128;
			piAttributeName128 = "Name";
			prop = arg_A1_1.NewAttributeTicket(piAttributeName128, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(50);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESBNMCASO");
			acClassTicket arg_A1_2 = lClassMapTicket;
			String piAttributeName129;
			piAttributeName129 = "Code";
			prop = arg_A1_2.NewAttributeTicket(piAttributeName129, "acInt", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESBCDCASO");
			acClassTicket arg_A1_3 = lClassMapTicket;
			String piAttributeName130;
			piAttributeName130 = "UseCaseType";
			prop = arg_A1_3.NewAttributeTicket(piAttributeName130, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("char");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESBTPCASO");
			acClassTicket arg_A1_4 = lClassMapTicket;
			String piAttributeName131;
			piAttributeName131 = "Situation";
			prop = arg_A1_4.NewAttributeTicket(piAttributeName131, "acString", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESBCDSITU");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-10","ngUseCaseTicketOperation","acPersistentObject", 7);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESGIDCUOP");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-10", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESGTCUOPE");
			acClassTicket arg_A10_0 = lClassMapTicket;
			String piAttributeName132;
			piAttributeName132 = "Situation";
			prop = arg_A10_0.NewAttributeTicket(piAttributeName132, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESGCDSITU");
			acClassTicket arg_A10_1 = lClassMapTicket;
			String piAttributeName133;
			piAttributeName133 = "AccessControlExternalCode";
			prop = arg_A10_1.NewAttributeTicket(piAttributeName133, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("VARCHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESGCDACEX");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("-6","ngUser","acPersistentObject", 27);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("SEGAIDUSUA");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("-6", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("SEGATUSUAR");
			lClassToDBMapTicket.setTypeColumnName("SEGACDHERA");
			acClassTicket arg_A6_0 = lClassMapTicket;
			String piAttributeName134;
			piAttributeName134 = "Login";
			prop = arg_A6_0.NewAttributeTicket(piAttributeName134, "acString", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(25);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGACDUSUA");
			acClassTicket arg_A6_1 = lClassMapTicket;
			String piAttributeName135;
			piAttributeName135 = "Password";
			prop = arg_A6_1.NewAttributeTicket(piAttributeName135, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(12);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGASENHAU");
			acClassTicket arg_A6_2 = lClassMapTicket;
			String piAttributeName136;
			piAttributeName136 = "PasswordResetCode";
			prop = arg_A6_2.NewAttributeTicket(piAttributeName136, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(20);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAPRSETC");
			acClassTicket arg_A6_3 = lClassMapTicket;
			String piAttributeName137;
			piAttributeName137 = "DtRegister";
			prop = arg_A6_3.NewAttributeTicket(piAttributeName137, "acDateTime", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGADTCADU");
			acClassTicket arg_A6_4 = lClassMapTicket;
			String piAttributeName138;
			piAttributeName138 = "DtLastChangePassword";
			prop = arg_A6_4.NewAttributeTicket(piAttributeName138, "acDateTime", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGADTULSE");
			acClassTicket arg_A6_5 = lClassMapTicket;
			String piAttributeName139;
			piAttributeName139 = "IsCanceled";
			prop = arg_A6_5.NewAttributeTicket(piAttributeName139, "acBoolean", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("char");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAINCANC");
			acClassTicket arg_A6_6 = lClassMapTicket;
			String piAttributeName140;
			piAttributeName140 = "CodigoReferencia";
			prop = arg_A6_6.NewAttributeTicket(piAttributeName140, "acString", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(25);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGACDREFE");
			acClassTicket arg_A6_7 = lClassMapTicket;
			String piAttributeName141;
			piAttributeName141 = "PasswordFormat";
			prop = arg_A6_7.NewAttributeTicket(piAttributeName141, "acInt", acAttributeStereotype.pvPersistent, false, 7);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAFORMSE");
			acClassTicket arg_A6_8 = lClassMapTicket;
			String piAttributeName142;
			piAttributeName142 = "PasswordSalt";
			prop = arg_A6_8.NewAttributeTicket(piAttributeName142, "acString", acAttributeStereotype.pvPersistent, false, 8);
			prop.setFixSize(0);
			prop.setVarSize(128);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGASALTSE");
			acClassTicket arg_A6_9 = lClassMapTicket;
			String piAttributeName143;
			piAttributeName143 = "MobilePIN";
			prop = arg_A6_9.NewAttributeTicket(piAttributeName143, "acString", acAttributeStereotype.pvPersistent, false, 9);
			prop.setFixSize(0);
			prop.setVarSize(16);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAMOBILE");
			acClassTicket arg_A6_10 = lClassMapTicket;
			String piAttributeName144;
			piAttributeName144 = "Email";
			prop = arg_A6_10.NewAttributeTicket(piAttributeName144, "acString", acAttributeStereotype.pvPersistent, false, 10);
			prop.setFixSize(0);
			prop.setVarSize(256);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAEEMAIL");
			acClassTicket arg_A6_11 = lClassMapTicket;
			String piAttributeName145;
			piAttributeName145 = "LoweredEmail";
			prop = arg_A6_11.NewAttributeTicket(piAttributeName145, "acString", acAttributeStereotype.pvPersistent, false, 11);
			prop.setFixSize(0);
			prop.setVarSize(256);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGALEMAIL");
			acClassTicket arg_A6_12 = lClassMapTicket;
			String piAttributeName146;
			piAttributeName146 = "PasswordQuestion";
			prop = arg_A6_12.NewAttributeTicket(piAttributeName146, "acString", acAttributeStereotype.pvPersistent, false, 12);
			prop.setFixSize(0);
			prop.setVarSize(256);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGASENHAQ");
			acClassTicket arg_A6_13 = lClassMapTicket;
			String piAttributeName147;
			piAttributeName147 = "PasswordAnswer";
			prop = arg_A6_13.NewAttributeTicket(piAttributeName147, "acString", acAttributeStereotype.pvPersistent, false, 13);
			prop.setFixSize(0);
			prop.setVarSize(256);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGASENHAA");
			acClassTicket arg_A6_14 = lClassMapTicket;
			String piAttributeName148;
			piAttributeName148 = "IsLockedOut";
			prop = arg_A6_14.NewAttributeTicket(piAttributeName148, "acBoolean", acAttributeStereotype.pvPersistent, false, 14);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("char");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGABLOQUE");
			acClassTicket arg_A6_15 = lClassMapTicket;
			String piAttributeName149;
			piAttributeName149 = "LastLoginDate";
			prop = arg_A6_15.NewAttributeTicket(piAttributeName149, "acDateTime", acAttributeStereotype.pvPersistent, false, 15);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAULTLGN");
			acClassTicket arg_A6_16 = lClassMapTicket;
			String piAttributeName150;
			piAttributeName150 = "LastLockoutDate";
			prop = arg_A6_16.NewAttributeTicket(piAttributeName150, "acDateTime", acAttributeStereotype.pvPersistent, false, 16);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAULTBLQ");
			acClassTicket arg_A6_17 = lClassMapTicket;
			String piAttributeName151;
			piAttributeName151 = "FailedPasswordAttemptCount";
			prop = arg_A6_17.NewAttributeTicket(piAttributeName151, "acInt", acAttributeStereotype.pvPersistent, false, 17);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAFSACOU");
			acClassTicket arg_A6_18 = lClassMapTicket;
			String piAttributeName152;
			piAttributeName152 = "FailedPasswordAttemptWindowStart";
			prop = arg_A6_18.NewAttributeTicket(piAttributeName152, "acDateTime", acAttributeStereotype.pvPersistent, false, 18);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAFSAWST");
			acClassTicket arg_A6_19 = lClassMapTicket;
			String piAttributeName153;
			piAttributeName153 = "FailedPasswordAnswerAttemptCount";
			prop = arg_A6_19.NewAttributeTicket(piAttributeName153, "acInt", acAttributeStereotype.pvPersistent, false, 19);
			prop.setFixSize(10);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAFSAACO");
			acClassTicket arg_A6_20 = lClassMapTicket;
			String piAttributeName154;
			piAttributeName154 = "FailedPasswordAnswerAttemptWindowStart";
			prop = arg_A6_20.NewAttributeTicket(piAttributeName154, "acDateTime", acAttributeStereotype.pvPersistent, false, 20);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAFSAAWS");
			acClassTicket arg_A6_21 = lClassMapTicket;
			String piAttributeName155;
			piAttributeName155 = "Comment";
			prop = arg_A6_21.NewAttributeTicket(piAttributeName155, "acString", acAttributeStereotype.pvPersistent, false, 21);
			prop.setFixSize(16);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("text");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGACOMMEN");
			acClassTicket arg_A6_22 = lClassMapTicket;
			String piAttributeName156;
			piAttributeName156 = "LastActivityDate";
			prop = arg_A6_22.NewAttributeTicket(piAttributeName156, "acDateTime", acAttributeStereotype.pvPersistent, false, 22);
			prop.setFixSize(8);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("datetime");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("SEGAULTACT");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("515","ngUserMessage","acPersistentObject", 8);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESRIDMESS");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("515", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESRTMESSG");
			acClassTicket arg_515_0 = lClassMapTicket;
			String piAttributeName157;
			piAttributeName157 = "Code";
			prop = arg_515_0.NewAttributeTicket(piAttributeName157, "acInt", acAttributeStereotype.pvPersistent, false, 0);
			prop.setFixSize(0);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("int");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRCDMESS");
			acClassTicket arg_515_1 = lClassMapTicket;
			String piAttributeName158;
			piAttributeName158 = "Description";
			prop = arg_515_1.NewAttributeTicket(piAttributeName158, "acString", acAttributeStereotype.pvPersistent, false, 1);
			prop.setFixSize(0);
			prop.setVarSize(300);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRDSMESS");
			acClassTicket arg_515_2 = lClassMapTicket;
			String piAttributeName159;
			piAttributeName159 = "Name";
			prop = arg_515_2.NewAttributeTicket(piAttributeName159, "acString", acAttributeStereotype.pvPersistent, false, 2);
			prop.setFixSize(0);
			prop.setVarSize(100);
			prop.setMandatory(true);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRSGMESS");
			acClassTicket arg_515_3 = lClassMapTicket;
			String piAttributeName160;
			piAttributeName160 = "Situation";
			prop = arg_515_3.NewAttributeTicket(piAttributeName160, "acString", acAttributeStereotype.pvPersistent, false, 3);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(true);
			prop.setDBType("CHAR");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRCDSITU");
			acClassTicket arg_515_4 = lClassMapTicket;
			String piAttributeName161;
			piAttributeName161 = "DetailedDescription";
			prop = arg_515_4.NewAttributeTicket(piAttributeName161, "acString", acAttributeStereotype.pvPersistent, false, 4);
			prop.setFixSize(0);
			prop.setVarSize(4000);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRDSDETA");
			acClassTicket arg_515_5 = lClassMapTicket;
			String piAttributeName162;
			piAttributeName162 = "ShowCode";
			prop = arg_515_5.NewAttributeTicket(piAttributeName162, "acString", acAttributeStereotype.pvPersistent, false, 5);
			prop.setFixSize(1);
			prop.setVarSize(0);
			prop.setMandatory(false);
			prop.setDBType("char");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRSHOCOD");
			acClassTicket arg_515_6 = lClassMapTicket;
			String piAttributeName163;
			piAttributeName163 = "DescriptionUser";
			prop = arg_515_6.NewAttributeTicket(piAttributeName163, "acString", acAttributeStereotype.pvPersistent, false, 6);
			prop.setFixSize(0);
			prop.setVarSize(300);
			prop.setMandatory(false);
			prop.setDBType("varchar");
			lClassToDBMapTicket.NewDbColumnMapRegisterTicket(prop).setColumnName("IESRDSMEUS");
			
			lClassMapTicket = piMetaModel.NewClassRegisterTicket("1540","ngUserProfile","acPersistentObject", 2);
			lClassMapTicket.setAuditDescription("");
			lDBIntIdoMapTicket = new acDBIntIdoMapTicket("IESUIDUSEP");
			lClassToDBMapTicket = piMetaModelPersistenceMap.NewClassToDBMapRegisterTicket("1540", lClassMapTicket, lDBIntIdoMapTicket);
			lClassToDBMapTicket.setTableName("IESUTUSERP");
		}
		
		
		static void RegisterClassRelationTickets1(acMetaModel piMetaModel, acMetaModelPersistenceMapSQL piMetaModelPersistenceMap) {
			acRelationTicket lRelationTicket;
			String piOriginPropertyName1;
			String piDestinationPropertyName1;
			piOriginPropertyName1 = "Samples";
			piDestinationPropertyName1 = "Analysis";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngAnalysis", piOriginPropertyName1, 2, 0, 2147483647, acPropertyAggregation.pvNone, "Analysis has samples", "ngSample", piDestinationPropertyName1, 3, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "MONEIDANAL");
			}
			
			String piOriginPropertyName2;
			String piDestinationPropertyName2;
			piOriginPropertyName2 = "Services";
			piDestinationPropertyName2 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngAnalysis", piOriginPropertyName2, 4, 0, 2147483647, acPropertyAggregation.pvNone, "Analysis listen to Servers", "ngService", piDestinationPropertyName2, -1, 0, 2147483647, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "MONEIDANAL", "MONAIDSERV", "MONITANSRV");
			}
			
			String piOriginPropertyName3;
			String piDestinationPropertyName3;
			piOriginPropertyName3 = "";
			piDestinationPropertyName3 = "AnalysisType";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngAnalysisType", piOriginPropertyName3, -1, 0, 2147483647, acPropertyAggregation.pvNone, "Analysis has a type", "ngAnalysis", piDestinationPropertyName3, 3, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "MONFIDANTY");
			}
			
			String piOriginPropertyName4;
			String piDestinationPropertyName4;
			piOriginPropertyName4 = "EventTypes";
			piDestinationPropertyName4 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngAnalysisType", piOriginPropertyName4, 2, 1, 2147483647, acPropertyAggregation.pvNone, "AnalysisType has EventTypes", "ngEventType", piDestinationPropertyName4, -1, 0, 2147483647, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "MONFIDANTY", "MONGIDEVTP", "MONHTEVANA");
			}
			
			String piOriginPropertyName5;
			String piDestinationPropertyName5;
			piOriginPropertyName5 = "Data";
			piDestinationPropertyName5 = "AuditEvent";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngAuditEvent", piOriginPropertyName5, 8, 0, 2147483647, acPropertyAggregation.pvNone, "Audit Event has Data", "ngAuditEventData", piDestinationPropertyName5, 3, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SISDIDAUDI");
			}
			
			String piOriginPropertyName6;
			String piDestinationPropertyName6;
			piOriginPropertyName6 = "Intervals";
			piDestinationPropertyName6 = "AxisX";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngAxisX", piOriginPropertyName6, 7, 0, 2147483647, acPropertyAggregation.pvNone, "", "ngInterval", piDestinationPropertyName6, 2, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "MONJIDAXIS");
			}
			
			String piOriginPropertyName7;
			String piDestinationPropertyName7;
			piOriginPropertyName7 = "Distributed";
			piDestinationPropertyName7 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEvent", piOriginPropertyName7, 3, 0, 1, acPropertyAggregation.pvComposite, "Distributed BusinessEvent", "ngBusinessEventDistributed", piDestinationPropertyName7, -1, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToOneDbRelationMapRegisterTicket(lRelationTicket, "INTLIDBUEV");
			}
			
			String piOriginPropertyName8;
			String piDestinationPropertyName8;
			piOriginPropertyName8 = "";
			piDestinationPropertyName8 = "BusinessEvent";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEvent", piOriginPropertyName8, -1, 0, 2147483647, acPropertyAggregation.pvNone, "SubscriberError has Event", "ngBusinessEventSubscriberError", piDestinationPropertyName8, 2, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTJIDBUEV");
			}
			
			String piOriginPropertyName9;
			String piDestinationPropertyName9;
			piOriginPropertyName9 = "NotifierEventualTimeWindows";
			piDestinationPropertyName9 = "Subscriber";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName9, 6, 0, 2147483647, acPropertyAggregation.pvComposite, "Subscriber has eventual notifier time windows", "ngBusinessSubscriberNotifierEventualTimeWindow", piDestinationPropertyName9, 6, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTHIDSUBS");
			}
			
			String piOriginPropertyName10;
			String piDestinationPropertyName10;
			piOriginPropertyName10 = "NotifierTimeGrids";
			piDestinationPropertyName10 = "Subscriber";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName10, 7, 0, 2147483647, acPropertyAggregation.pvComposite, "Subscriber has notifier time grids", "ngBusinessSubscriberNotifierTimeGrid", piDestinationPropertyName10, 2, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTFIDSUBS");
			}
			
			String piOriginPropertyName11;
			String piDestinationPropertyName11;
			piOriginPropertyName11 = "ActiveErrors";
			piDestinationPropertyName11 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName11, 4, 0, 2147483647, acPropertyAggregation.pvNone, "Subscriber''s Active Error", "ngBusinessEventSubscriberError", piDestinationPropertyName11, -1, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewIndirectOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTBIDSUBS", "INTJIDSBER", "INTKTSUBER");
			}
			
			String piOriginPropertyName12;
			String piDestinationPropertyName12;
			piOriginPropertyName12 = "Errors";
			piDestinationPropertyName12 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName12, 5, 0, 2147483647, acPropertyAggregation.pvComposite, "Subscriber''s Errors", "ngBusinessEventSubscriberError", piDestinationPropertyName12, -1, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTJIDSUBS");
			}
			
			String piOriginPropertyName13;
			String piDestinationPropertyName13;
			piOriginPropertyName13 = "EventsType";
			piDestinationPropertyName13 = "Subscribers";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName13, 2, 0, 2147483647, acPropertyAggregation.pvNone, "Subscriber''s Events Type of Interest", "ngBusinessEventType", piDestinationPropertyName13, 2, 0, 2147483647, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "INTBIDSUBS", "INTCIDEVNT", "INTETINTER");
			}
			
			String piOriginPropertyName14;
			String piDestinationPropertyName14;
			piOriginPropertyName14 = "IgnoredEvents";
			piDestinationPropertyName14 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName14, 8, 0, 2147483647, acPropertyAggregation.pvNone, "Subscriber''s Ignored Events", "ngBusinessEvent", piDestinationPropertyName14, -1, 0, 2147483647, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "INTBIDSUBS", "INTAIDBUEV", "INTITIGNOR");
			}
			
			String piOriginPropertyName15;
			String piDestinationPropertyName15;
			piOriginPropertyName15 = "UnnotifiedEvents";
			piDestinationPropertyName15 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventSubscriber", piOriginPropertyName15, 3, 0, 2147483647, acPropertyAggregation.pvNone, "Subscriber''s Unnotified Events", "ngBusinessEvent", piDestinationPropertyName15, -1, 0, 2147483647, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "INTBIDSUBS", "INTAIDBUEV", "INTDTUNNOT");
			}
			
			String piOriginPropertyName16;
			String piDestinationPropertyName16;
			piOriginPropertyName16 = "";
			piDestinationPropertyName16 = "EventType";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessEventType", piOriginPropertyName16, -1, 0, 2147483647, acPropertyAggregation.pvNone, "Event has type", "ngBusinessEvent", piDestinationPropertyName16, 2, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTAIDEVNT");
			}
			
			String piOriginPropertyName17;
			String piDestinationPropertyName17;
			piOriginPropertyName17 = "TimeWindows";
			piDestinationPropertyName17 = "TimeGrid";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngBusinessSubscriberNotifierTimeGrid", piOriginPropertyName17, 3, 0, 2147483647, acPropertyAggregation.pvComposite, "Time grid has time windows", "ngBusinessSubscriberNotifierTimeWindow", piDestinationPropertyName17, 5, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "INTGIDTMGR");
			}
			
			String piOriginPropertyName18;
			String piDestinationPropertyName18;
			piOriginPropertyName18 = "UseCases";
			piDestinationPropertyName18 = "Category";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngCategory", piOriginPropertyName18, 3, 0, 2147483647, acPropertyAggregation.pvNone, "Usecases have a category", "ngUseCaseTicket", piDestinationPropertyName18, 6, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESBIDCATE");
			}
			
			String piOriginPropertyName19;
			String piDestinationPropertyName19;
			piOriginPropertyName19 = "UseCases";
			piDestinationPropertyName19 = "Entity";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngEntity", piOriginPropertyName19, 4, 0, 2147483647, acPropertyAggregation.pvNone, "Entity has Usecases", "ngUseCaseTicket", piDestinationPropertyName19, 5, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESBIDENTI");
			}
			
			String piOriginPropertyName20;
			String piDestinationPropertyName20;
			piOriginPropertyName20 = "Statistic";
			piDestinationPropertyName20 = "EventLog";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngEventLog", piOriginPropertyName20, 13, 0, 1, acPropertyAggregation.pvNone, "", "ngLogStatistics", piDestinationPropertyName20, 8, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToOneDbRelationMapRegisterTicket(lRelationTicket, "MONLIDEVLO");
			}
			
			String piOriginPropertyName21;
			String piDestinationPropertyName21;
			piOriginPropertyName21 = "Data";
			piDestinationPropertyName21 = "EventLog";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngEventLog", piOriginPropertyName21, 11, 0, 1, acPropertyAggregation.pvNone, "EventLog has Data", "ngEventLogDetail", piDestinationPropertyName21, 1, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToOneDbRelationMapRegisterTicket(lRelationTicket, "MONBIDEVLO");
			}
			
			String piOriginPropertyName22;
			String piDestinationPropertyName22;
			piOriginPropertyName22 = "SystemGUIs";
			piDestinationPropertyName22 = "GUI";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngGUITicket", piOriginPropertyName22, 4, 0, 2147483647, acPropertyAggregation.pvNone, "System GUIs have GUI", "ngSystemGUITickets", piDestinationPropertyName22, 3, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESPIDINTE");
			}
			
			String piOriginPropertyName23;
			String piDestinationPropertyName23;
			piOriginPropertyName23 = "UseCases";
			piDestinationPropertyName23 = "Icon";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngIcon", piOriginPropertyName23, 4, 0, 2147483647, acPropertyAggregation.pvNone, "Usecases have an icon", "ngUseCaseTicket", piDestinationPropertyName23, 7, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESBIDCUIC");
			}
			
			String piOriginPropertyName24;
			String piDestinationPropertyName24;
			piOriginPropertyName24 = "";
			piDestinationPropertyName24 = "Natureza";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngNatureza", piOriginPropertyName24, -1, 0, 2147483647, acPropertyAggregation.pvNone, "User has nature", "ngUser", piDestinationPropertyName24, 24, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGAIDNAUS");
			}
			
			String piOriginPropertyName25;
			String piDestinationPropertyName25;
			piOriginPropertyName25 = "Systems";
			piDestinationPropertyName25 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngNatureza", piOriginPropertyName25, 2, 0, 2147483647, acPropertyAggregation.pvNone, "User nature can access systems", "ngSystem", piDestinationPropertyName25, -1, 0, 2147483647, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGEIDNAUS", "SEGEIDSIST", "SEGETSINAU");
			}
			
			String piOriginPropertyName26;
			String piDestinationPropertyName26;
			piOriginPropertyName26 = "UseCaseOperations";
			piDestinationPropertyName26 = "Operation";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngOperation", piOriginPropertyName26, 3, 0, 2147483647, acPropertyAggregation.pvNone, "UseCase operations has operation", "ngUseCaseTicketOperation", piDestinationPropertyName26, 4, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESGIDOPER");
			}
			
			String piOriginPropertyName27;
			String piDestinationPropertyName27;
			piOriginPropertyName27 = "UseCaseOperations";
			piDestinationPropertyName27 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngProfile", piOriginPropertyName27, 3, 0, 2147483647, acPropertyAggregation.pvNone, "Profile has Usecase Operations", "ngUseCaseTicketOperation", piDestinationPropertyName27, -1, 0, 2147483647, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "IESSIDPROF", "IESGIDCUOP", "IESTTOPPRO");
			}
			
			String piOriginPropertyName28;
			String piDestinationPropertyName28;
			piOriginPropertyName28 = "UserProfiles";
			piDestinationPropertyName28 = "Profile";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngProfile", piOriginPropertyName28, 4, 0, 2147483647, acPropertyAggregation.pvNone, "Profile has Users", "ngUserProfile", piDestinationPropertyName28, 0, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESUIDPROF");
			}
			
			String piOriginPropertyName29;
			String piDestinationPropertyName29;
			piOriginPropertyName29 = "";
			piDestinationPropertyName29 = "RunningSample";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSample", piOriginPropertyName29, -1, 1, 1, acPropertyAggregation.pvNone, "Analysis has running sample", "ngAnalysis", piDestinationPropertyName29, 5, 0, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToOneDbRelationMapRegisterTicket(lRelationTicket, "MONDIDSAMP");
			}
			
			String piOriginPropertyName30;
			String piDestinationPropertyName30;
			piOriginPropertyName30 = "EventLogs";
			piDestinationPropertyName30 = "Sample";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSample", piOriginPropertyName30, 2, 0, 2147483647, acPropertyAggregation.pvNone, "Sample has EventLogs", "ngEventLog", piDestinationPropertyName30, 12, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "MONDIDSAMP");
			}
			
			String piOriginPropertyName31;
			String piDestinationPropertyName31;
			piOriginPropertyName31 = "Numbers";
			piDestinationPropertyName31 = "SerialNumberGroup";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSerialNumberGroup", piOriginPropertyName31, 2, 0, 2147483647, acPropertyAggregation.pvComposite, "SerialNumberGroup has serial numbers", "ngSerialNumber", piDestinationPropertyName31, 1, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SISGIDSGRP");
			}
			
			String piOriginPropertyName32;
			String piDestinationPropertyName32;
			piOriginPropertyName32 = "SystemGUIs";
			piDestinationPropertyName32 = "System";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSystem", piOriginPropertyName32, 6, 0, 2147483647, acPropertyAggregation.pvNone, "System has GUIs", "ngSystemGUITickets", piDestinationPropertyName32, 1, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESPIDSIST");
			}
			
			String piOriginPropertyName33;
			String piDestinationPropertyName33;
			piOriginPropertyName33 = "Levels";
			piDestinationPropertyName33 = "System";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSystem", piOriginPropertyName33, 7, 0, 2147483647, acPropertyAggregation.pvNone, "System has Levels", "ngLevel", piDestinationPropertyName33, 4, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESHIDSIST");
			}
			
			String piOriginPropertyName34;
			String piDestinationPropertyName34;
			piOriginPropertyName34 = "";
			piDestinationPropertyName34 = "System";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSystem", piOriginPropertyName34, -1, 0, 2147483647, acPropertyAggregation.pvNone, "System has Message", "ngUserMessage", piDestinationPropertyName34, 7, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESRIDSIST");
			}
			
			String piOriginPropertyName35;
			String piDestinationPropertyName35;
			piOriginPropertyName35 = "SystemUseCases";
			piDestinationPropertyName35 = "System";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSystem", piOriginPropertyName35, 9, 0, 2147483647, acPropertyAggregation.pvNone, "System has Usecases", "ngSystemUseCaseTicket", piDestinationPropertyName35, 1, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESEIDSIST");
			}
			
			String piOriginPropertyName36;
			String piDestinationPropertyName36;
			piOriginPropertyName36 = "Permissions";
			piDestinationPropertyName36 = "System";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSystem", piOriginPropertyName36, 5, 0, 2147483647, acPropertyAggregation.pvNone, "System has permissions", "ngPermission", piDestinationPropertyName36, 1, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGBIDSIST");
			}
			
			String piOriginPropertyName37;
			String piDestinationPropertyName37;
			piOriginPropertyName37 = "Events";
			piDestinationPropertyName37 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngSystem", piOriginPropertyName37, 8, 0, 2147483647, acPropertyAggregation.pvNone, "System has security events", "ngEvent", piDestinationPropertyName37, -1, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGCIDSIST");
			}
			
			String piOriginPropertyName38;
			String piDestinationPropertyName38;
			piOriginPropertyName38 = "SystemGUIs";
			piDestinationPropertyName38 = "UseCase";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUseCaseTicket", piOriginPropertyName38, 9, 0, 2147483647, acPropertyAggregation.pvNone, "UseCase has system GUIs", "ngSystemGUITickets", piDestinationPropertyName38, 2, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESPIDCASO");
			}
			
			String piOriginPropertyName39;
			String piDestinationPropertyName39;
			piOriginPropertyName39 = "UseCaseSystems";
			piDestinationPropertyName39 = "UseCase";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUseCaseTicket", piOriginPropertyName39, 10, 0, 2147483647, acPropertyAggregation.pvNone, "Usecas has systems", "ngSystemUseCaseTicket", piDestinationPropertyName39, 2, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESEIDCASO");
			}
			
			String piOriginPropertyName40;
			String piDestinationPropertyName40;
			piOriginPropertyName40 = "UseCaseOperations";
			piDestinationPropertyName40 = "UseCase";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUseCaseTicket", piOriginPropertyName40, 8, 0, 2147483647, acPropertyAggregation.pvNone, "Usecase has usecase operations", "ngUseCaseTicketOperation", piDestinationPropertyName40, 3, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESGIDCASO");
			}
			
			String piOriginPropertyName41;
			String piDestinationPropertyName41;
			piOriginPropertyName41 = "Events";
			piDestinationPropertyName41 = "";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUseCaseTicketOperation", piOriginPropertyName41, 6, 0, 2147483647, acPropertyAggregation.pvNone, "Use Case Operations have security events", "ngEvent", piDestinationPropertyName41, -1, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGCIDCUOP");
			}
			
			String piOriginPropertyName42;
			String piDestinationPropertyName42;
			piOriginPropertyName42 = "Permissions";
			piDestinationPropertyName42 = "UseCaseOperation";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUseCaseTicketOperation", piOriginPropertyName42, 2, 0, 2147483647, acPropertyAggregation.pvNone, "UseCase Operation has permissions", "ngPermission", piDestinationPropertyName42, 0, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGBIDCUOP");
			}
			
			String piOriginPropertyName43;
			String piDestinationPropertyName43;
			piOriginPropertyName43 = "Levels";
			piDestinationPropertyName43 = "UseCaseOperations";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUseCaseTicketOperation", piOriginPropertyName43, 5, 0, 2147483647, acPropertyAggregation.pvNone, "Usecase Operations has levels", "ngLevel", piDestinationPropertyName43, 3, 0, 2147483647, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewManyToManyDbRelationMapRegisterTicket(lRelationTicket, "IESIIDCUOP", "IESIIDLEVE", "IESITOPLEV");
			}
			
			String piOriginPropertyName44;
			String piDestinationPropertyName44;
			piOriginPropertyName44 = "PermissionSecurityEvents";
			piDestinationPropertyName44 = "User";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUser", piOriginPropertyName44, 23, 0, 2147483647, acPropertyAggregation.pvNone, "User generate security events", "ngEvent", piDestinationPropertyName44, 2, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGCIDUSUA");
			}
			
			String piOriginPropertyName45;
			String piDestinationPropertyName45;
			piOriginPropertyName45 = "Permissions";
			piDestinationPropertyName45 = "User";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUser", piOriginPropertyName45, 25, 0, 2147483647, acPropertyAggregation.pvNone, "User has Permissions", "ngPermission", piDestinationPropertyName45, 2, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGBIDUSUA");
			}
			
			String piOriginPropertyName46;
			String piDestinationPropertyName46;
			piOriginPropertyName46 = "";
			piDestinationPropertyName46 = "User";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUser", piOriginPropertyName46, -1, 0, 2147483647, acPropertyAggregation.pvNone, "User has Profiles", "ngUserProfile", piDestinationPropertyName46, 1, 1, 1, acPropertyAggregation.pvNone, false, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "IESUIDUSUA");
			}
			
			String piOriginPropertyName47;
			String piDestinationPropertyName47;
			piOriginPropertyName47 = "SecurityEvents";
			piDestinationPropertyName47 = "AuthorizedUser";
			lRelationTicket = piMetaModel.NewRelationRegisterTicket("ngUser", piOriginPropertyName47, 26, 0, 2147483647, acPropertyAggregation.pvNone, "User has security events", "ngEvent", piDestinationPropertyName47, 3, 1, 1, acPropertyAggregation.pvNone, true, false);
			if (lRelationTicket != null){
				piMetaModelPersistenceMap.NewOneToManyDbRelationMapRegisterTicket(lRelationTicket, "SEGCIDRESP");
			}
			
		}
		
		static void NewUseCaseTicket_ucImportaConfiguracaoSistema_1327(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1327", null, true);
			lUseCaseTicket.setName("ucImportaConfiguracaoSistema");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucCadastroNatureza_1360(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1360", null, true);
			lUseCaseTicket.setName("ucCadastroNatureza");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucDetalhesAtualizacaoSistema_1359(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1359", null, true);
			lUseCaseTicket.setName("ucDetalhesAtualizacaoSistema");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucControleAcesso_104(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("104", null, true);
			lUseCaseTicket.setName("ucControleAcesso");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucExplorerV4_1432(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1432", null, true);
			lUseCaseTicket.setName("ucExplorerV4");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucCadastroPerfil_1963(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1963", null, false);
			lUseCaseTicket.setName("ucCadastroPerfil");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucCadastroUsuarioSistema_101(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("101", null, true);
			lUseCaseTicket.setName("ucCadastroUsuarioSistema");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucCadastroServidores_1153(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1153", null, true);
			lUseCaseTicket.setName("ucCadastroServidores");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucSISMONEventLogServer_1603(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1603", null, true);
			lUseCaseTicket.setName("ucSISMONEventLogServer");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucEventLogAnalyser_1611(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1611", null, true);
			lUseCaseTicket.setName("ucEventLogAnalyser");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucEventLogAnaliserGraphic_2603(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("2603", null, true);
			lUseCaseTicket.setName("ucEventLogAnaliserGraphic");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucCadastroAxisX_2605(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("2605", null, true);
			lUseCaseTicket.setName("ucCadastroAxisX");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucDashBoard_2930(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("2930", null, true);
			lUseCaseTicket.setName("ucDashBoard");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucClassMetaInfo_3583(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("3583", null, true);
			lUseCaseTicket.setName("ucClassMetaInfo");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucCadastroGenerico___ucGENERIC(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("__ucGENERIC", null, true);
			lUseCaseTicket.setName("ucCadastroGenerico");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_ucPropriedadesDoServico_1536(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("1536", null, true);
			lUseCaseTicket.setName("ucPropriedadesDoServico");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static void NewUseCaseTicket_Treinamento_5678(acMetaModel piMetaModel) {
			acUseCaseTicket lUseCaseTicket = piMetaModel.NewUseCaseTicket("5678", null, true);
			lUseCaseTicket.setName("Treinamento");
			lUseCaseTicket.setInheritsFromClass("ucUseCase");
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stAguardando_RM_INCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stAguardando_RM_INCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence minOccurs=\"1\" maxOccurs=\"1\">				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"optional\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"optional\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"optional\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"optional\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stAguardando_RM_EXCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stAguardando_RM_EDITA_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stAguardando_RM_EDITA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stAguardando_RM_CONSULTA_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stAguardando_RM_CONSULTA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stEditando_RM_SALVA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stEditando_RM_SALVA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stEditando_RM_EXCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stEditando_RM_VALIDA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stEditando_RM_VALIDA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stConsultando_RM_INCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stConsultando_RM_INCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence minOccurs=\"1\" maxOccurs=\"1\">				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"optional\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"optional\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"optional\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"optional\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stConsultando_RM_EDITA_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stConsultando_RM_EDITA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stConsultando_RM_EXCLUI_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1153_smCadastroServidores_stConsultando_RM_CONSULTA_OBJETO() {
			return "<?xml version=\"1.0\"?><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"OBJECTID\" type=\"xs:string\"/>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1153_smCadastroServidores_stConsultando_RM_CONSULTA_OBJETO() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element name=\"Server\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:integer\" use=\"required\"/>								<xs:attribute name=\"Caption\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Address\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"100\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"Service\" use=\"required\">									<xs:simpleType>										<xs:restriction base=\"xs:string\">											<xs:maxLength value=\"30\"/>										</xs:restriction>									</xs:simpleType>								</xs:attribute>								<xs:attribute name=\"UserName\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"Password\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"SystemCode\" type=\"xs:int\" use=\"required\"/>								<xs:attribute name=\"MaxReconnectionAttempts\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"ReconnectionAttemptDelay\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Initializing_RM_GET_CONTEXT() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Initializing_RM_GET_CONTEXT() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:all>				<xs:element name=\"ServersList\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">								<xs:complexType>									<xs:simpleContent>										<xs:extension base=\"xs:string\">											<xs:attribute name=\"OID\" type=\"xs:string\"/>											<xs:attribute name=\"Name\" type=\"xs:string\"/>										</xs:extension>									</xs:simpleContent>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>				<xs:element name=\"AnalysisList\">					<xs:complexType>						<xs:sequence minOccurs=\"0\" maxOccurs=\"unbounded\">							<xs:element name=\"Analysis\">								<xs:complexType>									<xs:sequence minOccurs=\"0\" maxOccurs=\"unbounded\">										<xs:element name=\"Sample\">											<xs:complexType>												<xs:sequence minOccurs=\"0\" maxOccurs=\"unbounded\">													<xs:element name=\"Event\">														<xs:complexType>															<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"Timestamp\" type=\"xs:dateTime\" use=\"required\"/>															<xs:attribute name=\"Source\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"PeerName\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"Type\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"Description\" type=\"xs:string\" use=\"required\"/>														</xs:complexType>													</xs:element>												</xs:sequence>												<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>												<xs:attribute name=\"StartTime\" type=\"xs:dateTime\" use=\"required\"/>												<xs:attribute name=\"EndTime\" type=\"xs:dateTime\" use=\"optional\"/>												<xs:attribute name=\"Running\" type=\"xs:boolean\" use=\"required\"/>											</xs:complexType>										</xs:element>									</xs:sequence>									<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"Name\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"Description\" type=\"xs:string\" use=\"optional\"/>									<xs:attribute name=\"AnalysisType\" type=\"xs:string\" use=\"required\"/>								</xs:complexType>							</xs:element>						</xs:sequence>						<xs:attribute name=\"SampleCount\" type=\"xs:string\" use=\"required\"/>					</xs:complexType>				</xs:element>			</xs:all>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Executing_RM_NEW_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Executing_RM_NEW_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:all>				<xs:element name=\"AnalysisTypeList\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"AnalysisType\">								<xs:complexType>									<xs:simpleContent>										<xs:extension base=\"xs:string\">											<xs:attribute name=\"OID\" type=\"xs:string\"/>											<xs:attribute name=\"Name\" type=\"xs:string\"/>											<xs:attribute name=\"Description\" type=\"xs:string\"/>										</xs:extension>									</xs:simpleContent>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>				<xs:element name=\"ServerList\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">								<xs:complexType>									<xs:simpleContent>										<xs:extension base=\"xs:string\">											<xs:attribute name=\"OID\" type=\"xs:string\"/>											<xs:attribute name=\"Name\" type=\"xs:string\"/>										</xs:extension>									</xs:simpleContent>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>				<xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:sequence minOccurs=\"1\" maxOccurs=\"1\">							<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Servers\">								<xs:complexType>									<xs:sequence>										<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">											<xs:complexType>												<xs:simpleContent>													<xs:extension base=\"xs:string\">														<xs:attribute name=\"OID\" use=\"required\"/>													</xs:extension>												</xs:simpleContent>											</xs:complexType>										</xs:element>									</xs:sequence>								</xs:complexType>							</xs:element>						</xs:sequence>						<xs:attribute name=\"Name\" type=\"xs:string\"/>						<xs:attribute name=\"Description\" type=\"xs:string\"/>						<xs:attribute name=\"AnalysisTypeOID\" type=\"xs:string\"/>						<xs:attribute name=\"OID\" type=\"xs:string\"/>					</xs:complexType>				</xs:element>			</xs:all>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Executing_RM_START_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:string\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Executing_RM_START_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Sample\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"AnalysisOID\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"StartTime\" type=\"xs:dateTime\" use=\"required\"/>								<xs:attribute name=\"EndTime\" type=\"xs:dateTime\" use=\"optional\"/>								<xs:attribute name=\"Running\" type=\"xs:boolean\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Executing_RM_STOP_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:string\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Executing_RM_STOP_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Sample\">								<xs:complexType>									<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"EndTime\" type=\"xs:dateTime\" use=\"required\"/>								</xs:complexType>							</xs:element>						</xs:sequence>						<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>					</xs:complexType>				</xs:element>			</xs:sequence>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Executing_RM_GET_CONTEXT() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Executing_RM_GET_CONTEXT() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:all>				<xs:element name=\"ServersList\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">								<xs:complexType>									<xs:simpleContent>										<xs:extension base=\"xs:string\">											<xs:attribute name=\"OID\" type=\"xs:string\"/>											<xs:attribute name=\"Name\" type=\"xs:string\"/>										</xs:extension>									</xs:simpleContent>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>				<xs:element name=\"AnalysisList\">					<xs:complexType>						<xs:sequence minOccurs=\"0\" maxOccurs=\"unbounded\">							<xs:element name=\"Analysis\">								<xs:complexType>									<xs:sequence minOccurs=\"0\" maxOccurs=\"unbounded\">										<xs:element name=\"Sample\">											<xs:complexType>												<xs:sequence minOccurs=\"0\" maxOccurs=\"unbounded\">													<xs:element name=\"Event\">														<xs:complexType>															<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"Timestamp\" type=\"xs:dateTime\" use=\"required\"/>															<xs:attribute name=\"Source\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"PeerName\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"Type\" type=\"xs:string\" use=\"required\"/>															<xs:attribute name=\"Description\" type=\"xs:string\" use=\"required\"/>														</xs:complexType>													</xs:element>												</xs:sequence>												<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>												<xs:attribute name=\"StartTime\" type=\"xs:dateTime\" use=\"required\"/>												<xs:attribute name=\"EndTime\" type=\"xs:dateTime\" use=\"optional\"/>												<xs:attribute name=\"Running\" type=\"xs:boolean\" use=\"required\"/>											</xs:complexType>										</xs:element>									</xs:sequence>									<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"Name\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"Description\" type=\"xs:string\" use=\"optional\"/>									<xs:attribute name=\"AnalysisType\" type=\"xs:string\" use=\"required\"/>								</xs:complexType>							</xs:element>						</xs:sequence>						<xs:attribute name=\"SampleCount\" type=\"xs:string\" use=\"required\"/>					</xs:complexType>				</xs:element>			</xs:all>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Executing_RM_EDIT_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"OID\" type=\"xs:string\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Executing_RM_EDIT_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:all>				<xs:element name=\"AnalysisTypeList\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"AnalysisType\">								<xs:complexType>									<xs:simpleContent>										<xs:extension base=\"xs:string\">											<xs:attribute name=\"OID\" type=\"xs:string\"/>											<xs:attribute name=\"Name\" type=\"xs:string\"/>											<xs:attribute name=\"Description\" type=\"xs:string\"/>										</xs:extension>									</xs:simpleContent>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>				<xs:element name=\"ServerList\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">								<xs:complexType>									<xs:simpleContent>										<xs:extension base=\"xs:string\">											<xs:attribute name=\"OID\" type=\"xs:string\"/>											<xs:attribute name=\"Name\" type=\"xs:string\"/>										</xs:extension>									</xs:simpleContent>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>				<xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:sequence minOccurs=\"1\" maxOccurs=\"1\">							<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Servers\">								<xs:complexType>									<xs:sequence>										<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">											<xs:complexType>												<xs:simpleContent>													<xs:extension base=\"xs:string\">														<xs:attribute name=\"OID\" use=\"required\"/>													</xs:extension>												</xs:simpleContent>											</xs:complexType>										</xs:element>									</xs:sequence>								</xs:complexType>							</xs:element>						</xs:sequence>						<xs:attribute name=\"Name\" type=\"xs:string\"/>						<xs:attribute name=\"Description\" type=\"xs:string\"/>						<xs:attribute name=\"AnalysisTypeOID\" type=\"xs:string\"/>						<xs:attribute name=\"OID\" type=\"xs:string\"/>					</xs:complexType>				</xs:element>			</xs:all>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_Executing_RM_GET_SERVERS_STATUS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_Executing_RM_GET_SERVERS_STATUS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence minOccurs=\"1\" maxOccurs=\"1\">				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Servers\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">								<xs:complexType>									<xs:sequence>										<xs:element minOccurs=\"0\" maxOccurs=\"1\" name=\"EventTypes\">											<xs:complexType>												<xs:sequence>													<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"EventType\">														<xs:complexType>															<xs:simpleContent>																<xs:extension base=\"xs:string\">																	<xs:attribute name=\"Name\" type=\"xs:string\" use=\"required\"/>																</xs:extension>															</xs:simpleContent>														</xs:complexType>													</xs:element>												</xs:sequence>											</xs:complexType>										</xs:element>									</xs:sequence>									<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"Name\" type=\"xs:string\" use=\"required\"/>									<xs:attribute name=\"Running\" type=\"xs:boolean\" use=\"optional\"/>									<xs:attribute name=\"Error\" type=\"xs:string\" use=\"optional\"/>								</xs:complexType>							</xs:element>						</xs:sequence>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_InsertingAnalysis_RM_SAVE_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence minOccurs=\"1\" maxOccurs=\"1\">				<xs:element name=\"Analysis\">					<xs:complexType>						<xs:sequence>							<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"ServerList\">								<xs:complexType>									<xs:sequence>										<xs:element minOccurs=\"0\" maxOccurs=\"unbounded\" name=\"Server\">											<xs:complexType>												<xs:simpleContent>													<xs:extension base=\"xs:string\">														<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>													</xs:extension>												</xs:simpleContent>											</xs:complexType>										</xs:element>									</xs:sequence>								</xs:complexType>							</xs:element>						</xs:sequence>						<xs:attribute name=\"AnalysisTypeOID\" type=\"xs:string\" use=\"required\"/>						<xs:attribute name=\"Description\" type=\"xs:string\" use=\"optional\"/>						<xs:attribute name=\"Name\" type=\"xs:string\" use=\"required\"/>						<xs:attribute name=\"OID\" type=\"xs:string\" use=\"optional\"/>					</xs:complexType>				</xs:element>			</xs:sequence>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_InsertingAnalysis_RM_SAVE_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:sequence>				<xs:element minOccurs=\"1\" maxOccurs=\"1\" name=\"Analysis\">					<xs:complexType>						<xs:simpleContent>							<xs:extension base=\"xs:string\">								<xs:attribute name=\"Name\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"Description\" type=\"xs:string\" use=\"optional\"/>								<xs:attribute name=\"AnalysisTypeName\" type=\"xs:string\" use=\"required\"/>								<xs:attribute name=\"OID\" type=\"xs:string\" use=\"required\"/>							</xs:extension>						</xs:simpleContent>					</xs:complexType>				</xs:element>			</xs:sequence>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDIn_1611_smEventLogAnalyser_InsertingAnalysis_RM_CANCEL_NEW_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static String GetXSDOut_1611_smEventLogAnalyser_InsertingAnalysis_RM_CANCEL_NEW_ANALYSIS() {
			return "<?xml version=\"1.0\"?><!--Created with Liquid XML Studio 6.1.18.0 - FREE Community Edition (http://www.liquid-technologies.com)--><xs:schema attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">	<xs:element name=\"SYSMSG\">		<xs:complexType>			<xs:anyAttribute processContents=\"skip\"/>		</xs:complexType>	</xs:element></xs:schema>";
		}
		
		static void RegisterUseCases1(acMetaModel piMetaModel) {
					NewUseCaseTicket_ucImportaConfiguracaoSistema_1327(piMetaModel);
			NewUseCaseTicket_ucCadastroNatureza_1360(piMetaModel);
			NewUseCaseTicket_ucDetalhesAtualizacaoSistema_1359(piMetaModel);
			NewUseCaseTicket_ucControleAcesso_104(piMetaModel);
			NewUseCaseTicket_ucExplorerV4_1432(piMetaModel);
			NewUseCaseTicket_ucCadastroPerfil_1963(piMetaModel);
			NewUseCaseTicket_ucCadastroUsuarioSistema_101(piMetaModel);
			NewUseCaseTicket_ucCadastroServidores_1153(piMetaModel);
			NewUseCaseTicket_ucSISMONEventLogServer_1603(piMetaModel);
			NewUseCaseTicket_ucEventLogAnalyser_1611(piMetaModel);
			NewUseCaseTicket_ucEventLogAnaliserGraphic_2603(piMetaModel);
			NewUseCaseTicket_ucCadastroAxisX_2605(piMetaModel);
			NewUseCaseTicket_ucDashBoard_2930(piMetaModel);
			NewUseCaseTicket_ucClassMetaInfo_3583(piMetaModel);
			NewUseCaseTicket_ucCadastroGenerico___ucGENERIC(piMetaModel);
			NewUseCaseTicket_ucPropriedadesDoServico_1536(piMetaModel);
			NewUseCaseTicket_Treinamento_5678(piMetaModel);

			acUseCaseTicket lUseCaseTicket;
			utStateMachine lStateMachine;
			utState lState;
			acUseCaseTicket lSubMachineUseCaseTicket;
			utSubMachineState lSubMachineState;
			utTransition lTransition;

			//UseCase "ucImportaConfiguracaoSistema"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1327");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1327");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smImportaConfiguracaoSistema" );
			new utState(lStateMachine, "AguardandoXML");
			new utState(lStateMachine, "XMLCarregado_AlteracoesMapeadas");
			new utFinalState(lStateMachine, "FinalState1");
			lStateMachine.setInitialState( lStateMachine.FindState("AguardandoXML") );
			lState = lStateMachine.FindState("AguardandoXML");
			lTransition = lState.NewOutgoingTransition("RM_CARREGARXML");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("XMLCarregado_AlteracoesMapeadas") );
			lTransition.AddTrigger("RM_CARREGARXML", "");
			lTransition.AddEffect("EFFECT_CARREGARXML");
			lTransition = lState.NewOutgoingTransition("RM_IMPORTA_CONFIGURACAO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("FinalState1") );
			lTransition.AddTrigger("RM_IMPORTA_CONFIGURACAO", "");
			lTransition.AddEffect("EFFECT_IMPORTA_CONFIGURACAO");

			lState = lStateMachine.FindState("XMLCarregado_AlteracoesMapeadas");
			lTransition = lState.NewOutgoingTransition("RM_APLICAR_ALTERACOES");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("FinalState1") );
			lTransition.AddTrigger("RM_APLICAR_ALTERACOES", "");
			lTransition.AddEffect("EFFECT_APLICAR_ALTERACOES");



			//UseCase "ucCadastroNatureza"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1360");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1360");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smCadastroNatureza" );
			new utState(lStateMachine, "stEditando");
			new utState(lStateMachine, "stConsultando");
			new utState(lStateMachine, "stAguardando");
			lStateMachine.setInitialState( lStateMachine.FindState("stEditando") );
			lState = lStateMachine.FindState("stEditando");
			lTransition = lState.NewOutgoingTransition("RM_OBTEM_CONTEXTO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTEM_CONTEXTO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_SALVA_OBJETO");
			lTransition.setGuardCondition("GUARD_ValidaObjeto");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_SALVA_OBJETO", "");
			lTransition.AddEffect("EFFECT_SalvaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_VALIDA_OBJETO");
			lTransition.setGuardCondition("GUARD_ValidaObjeto");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_VALIDA_OBJETO", "");

			lState = lStateMachine.FindState("stConsultando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");

			lState = lStateMachine.FindState("stAguardando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");



			//UseCase "ucDetalhesAtualizacaoSistema"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1359");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1359");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smDetalhesAtualizacaoSistema" );
			new utState(lStateMachine, "Executando");
			new utFinalState(lStateMachine, "FinalState1");
			lStateMachine.setInitialState( lStateMachine.FindState("Executando") );
			lState = lStateMachine.FindState("Executando");
			lTransition = lState.NewOutgoingTransition("RM_RETORNA_XML");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("FinalState1") );
			lTransition.AddTrigger("RM_RETORNA_XML", "");
			lTransition.AddEffect("EFFECT_RETORNA_XML");



			//UseCase "ucControleAcesso"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("104");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("104");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smControleAcesso" );
			new utState(lStateMachine, "Inicializando");
			new utState(lStateMachine, "Executando");
			lStateMachine.setInitialState( lStateMachine.FindState("Inicializando") );
			lState = lStateMachine.FindState("Inicializando");
			lTransition = lState.NewOutgoingTransition("RM_INICIALIZAR_INTERFACE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executando") );
			lTransition.AddTrigger("RM_INICIALIZAR_INTERFACE", "");
			lTransition.AddEffect("EFFECT_INICIALIZAR_INTERFACE");

			lState = lStateMachine.FindState("Executando");
			lTransition = lState.NewOutgoingTransition("RM_CARREGAR_PERMISSOES");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_CARREGAR_PERMISSOES", "");
			lTransition.AddEffect("EFFECT_CARREGAR_PERMISSOES");
			lTransition = lState.NewOutgoingTransition("RM_SALVAR");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_SALVAR", "");
			lTransition.AddEffect("EFFECT_SALVAR");



			//UseCase "ucExplorerV4"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1432");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1432");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smExplorerV4" );
			new utState(lStateMachine, "Aguardando");
			lStateMachine.setInitialState( lStateMachine.FindState("Aguardando") );
			lState = lStateMachine.FindState("Aguardando");
			lTransition = lState.NewOutgoingTransition("RM_EXECUTE_OQL");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EXECUTE_OQL", "");
			lTransition.AddEffect("EFFECT_EXECUTE_OQL");
			lTransition = lState.NewOutgoingTransition("RM_GET_OBJECT_DATA");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_OBJECT_DATA", "");
			lTransition.AddEffect("EFFECT_GET_OBJECT_DATA");
			lTransition = lState.NewOutgoingTransition("RM_EXECUTE_SQL");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EXECUTE_SQL", "");
			lTransition.AddEffect("EFFECT_EXECUTE_SQL");
			lTransition = lState.NewOutgoingTransition("RM_GET_MODEL_OBJECT_DATA");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_MODEL_OBJECT_DATA", "");
			lTransition.AddEffect("EFFECT_GET_MODEL_OBJECT_DATA");
			lTransition = lState.NewOutgoingTransition("RM_GET_OQL_FROM_OBJECT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_OQL_FROM_OBJECT", "");
			lTransition.AddEffect("EFFECT_GET_OQL_FROM_OBJECT");



			//UseCase "ucCadastroPerfil"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1963");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1963");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smucCadastroPerfil" );
			new utState(lStateMachine, "stAguardando");
			new utState(lStateMachine, "stEditando");
			new utState(lStateMachine, "stConsultando");
			lStateMachine.setInitialState( lStateMachine.FindState("stAguardando") );
			lState = lStateMachine.FindState("stAguardando");
			lTransition = lState.NewOutgoingTransition("RM_OBTEM_CONTEXTO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTEM_CONTEXTO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_EditaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_CONSULTA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_CONSULTA_OBJETO", "");
			lTransition.AddEffect("Effect_ConsultaObjeto");

			lState = lStateMachine.FindState("stEditando");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_SALVA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_SALVA_OBJETO", "");
			lTransition.AddEffect("Effect_SalvaObjeto");

			lState = lStateMachine.FindState("stConsultando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_EditaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_CONSULTA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_CONSULTA_OBJETO", "");
			lTransition.AddEffect("Effect_ConsultaObjeto");



			//UseCase "ucCadastroUsuarioSistema"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("101");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("101");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smCadastroUsuarioSistema" );
			new utState(lStateMachine, "stConsultando");
			new utState(lStateMachine, "stEditando");
			new utState(lStateMachine, "stAguardando");
			lStateMachine.setInitialState( lStateMachine.FindState("stConsultando") );
			lState = lStateMachine.FindState("stConsultando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_OBTEM_CONTEXTO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTEM_CONTEXTO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_SALVA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_SALVA_OBJETO", "");
			lTransition.AddEffect("EFFECT_SalvaObjeto");

			lState = lStateMachine.FindState("stEditando");
			lTransition = lState.NewOutgoingTransition("RM_OBTEM_CONTEXTO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTEM_CONTEXTO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_SALVA_OBJETO");
			lTransition.setGuardCondition("GUARD_ValidaObjeto");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_SALVA_OBJETO", "");
			lTransition.AddEffect("EFFECT_SalvaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_VALIDA_OBJETO");
			lTransition.setGuardCondition("GUARD_ValidaObjeto");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_VALIDA_OBJETO", "");

			lState = lStateMachine.FindState("stAguardando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");



			//UseCase "ucCadastroServidores"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1153");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1153");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smCadastroServidores" );
			new utState(lStateMachine, "stAguardando");
			new utState(lStateMachine, "stEditando");
			new utState(lStateMachine, "stConsultando");
			lStateMachine.setInitialState( lStateMachine.FindState("stAguardando") );
			lState = lStateMachine.FindState("stAguardando");
			lTransition = lState.NewOutgoingTransition("RM_OBTEM_CONTEXTO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTEM_CONTEXTO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stAguardando_RM_INCLUI_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stAguardando_RM_INCLUI_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stAguardando_RM_EXCLUI_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_EditaObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stAguardando_RM_EDITA_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stAguardando_RM_EDITA_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_CONSULTA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_CONSULTA_OBJETO", "");
			lTransition.AddEffect("Effect_ConsultaObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stAguardando_RM_CONSULTA_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stAguardando_RM_CONSULTA_OBJETO() );

			lState = lStateMachine.FindState("stEditando");
			lTransition = lState.NewOutgoingTransition("RM_SALVA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_SALVA_OBJETO", "");
			lTransition.AddEffect("EFFECT_SalvaObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stEditando_RM_SALVA_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stEditando_RM_SALVA_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stEditando_RM_EXCLUI_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_VALIDA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_VALIDA_OBJETO", "");
			lTransition.AddEffect("EFFECT_ValidaObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stEditando_RM_VALIDA_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stEditando_RM_VALIDA_OBJETO() );

			lState = lStateMachine.FindState("stConsultando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stConsultando_RM_INCLUI_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stConsultando_RM_INCLUI_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_EditaObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stConsultando_RM_EDITA_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stConsultando_RM_EDITA_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stConsultando_RM_EXCLUI_OBJETO() );
			lTransition = lState.NewOutgoingTransition("RM_CONSULTA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_CONSULTA_OBJETO", "");
			lTransition.AddEffect("Effect_ConsultaObjeto");
			lTransition.getXsdIn().setXML( GetXSDIn_1153_smCadastroServidores_stConsultando_RM_CONSULTA_OBJETO() );
			lTransition.getXsdOut().setXML( GetXSDOut_1153_smCadastroServidores_stConsultando_RM_CONSULTA_OBJETO() );



			//UseCase "ucSISMONEventLogServer"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1603");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1603");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smSISMONEventLogServer" );
			new utState(lStateMachine, "Running");
			lStateMachine.setInitialState( lStateMachine.FindState("Running") );
			lState = lStateMachine.FindState("Running");
			lTransition = lState.NewOutgoingTransition("RM_PROCESS_EVENTLOG");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_PROCESS_EVENTLOG", "");
			lTransition.AddEffect("EFFECT_PROCESS_EVENTLOG");



			//UseCase "ucEventLogAnalyser"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1611");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1611");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smEventLogAnalyser" );
			new utState(lStateMachine, "Initializing");
			new utState(lStateMachine, "Executing");
			new utState(lStateMachine, "InsertingAnalysis");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("RM_GET_CONTEXT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_GET_CONTEXT", "");
			lTransition.AddEffect("EFFECT_GET_CONTEXT");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Initializing_RM_GET_CONTEXT() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Initializing_RM_GET_CONTEXT() );

			lState = lStateMachine.FindState("Executing");
			lTransition = lState.NewOutgoingTransition("RM_NEW_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("InsertingAnalysis") );
			lTransition.AddTrigger("RM_NEW_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_NEW_ANALYSIS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Executing_RM_NEW_ANALYSIS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Executing_RM_NEW_ANALYSIS() );
			lTransition = lState.NewOutgoingTransition("RM_START_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_START_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_START_ANALYSIS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Executing_RM_START_ANALYSIS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Executing_RM_START_ANALYSIS() );
			lTransition = lState.NewOutgoingTransition("RM_STOP_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_STOP_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_STOP_ANALYSIS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Executing_RM_STOP_ANALYSIS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Executing_RM_STOP_ANALYSIS() );
			lTransition = lState.NewOutgoingTransition("RM_GET_CONTEXT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_CONTEXT", "");
			lTransition.AddEffect("EFFECT_GET_CONTEXT");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Executing_RM_GET_CONTEXT() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Executing_RM_GET_CONTEXT() );
			lTransition = lState.NewOutgoingTransition("RM_EDIT_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("InsertingAnalysis") );
			lTransition.AddTrigger("RM_EDIT_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_EDIT_ANALYSIS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Executing_RM_EDIT_ANALYSIS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Executing_RM_EDIT_ANALYSIS() );
			lTransition = lState.NewOutgoingTransition("RM_GET_SERVERS_STATUS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SERVERS_STATUS", "");
			lTransition.AddEffect("EFFECT_GET_SERVERS_STATUS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_Executing_RM_GET_SERVERS_STATUS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_Executing_RM_GET_SERVERS_STATUS() );
			lTransition = lState.NewOutgoingTransition("RM_GET_SAMPLE_EVENTS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SAMPLE_EVENTS", "");
			lTransition.AddEffect("EFFECT_GET_SAMPLE_EVENTS");
			lTransition = lState.NewOutgoingTransition("RM_NOTIFY_MONITOR_PARAMETERS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_NOTIFY_MONITOR_PARAMETERS", "");
			lTransition.AddEffect("EFFECT_NOTIFY_MONITOR_PARAMETERS");
			lTransition = lState.NewOutgoingTransition("RM_GET_EVENT_CONTENT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_EVENT_CONTENT", "");
			lTransition.AddEffect("EFFECT_GET_EVENT_CONTENT");

			lState = lStateMachine.FindState("InsertingAnalysis");
			lTransition = lState.NewOutgoingTransition("RM_SAVE_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_SAVE_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_SAVE_ANALYSIS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_InsertingAnalysis_RM_SAVE_ANALYSIS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_InsertingAnalysis_RM_SAVE_ANALYSIS() );
			lTransition = lState.NewOutgoingTransition("RM_CANCEL_NEW_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_CANCEL_NEW_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_CANCEL_NEW_ANALYSIS");
			lTransition.getXsdIn().setXML( GetXSDIn_1611_smEventLogAnalyser_InsertingAnalysis_RM_CANCEL_NEW_ANALYSIS() );
			lTransition.getXsdOut().setXML( GetXSDOut_1611_smEventLogAnalyser_InsertingAnalysis_RM_CANCEL_NEW_ANALYSIS() );



			//UseCase "ucEventLogAnaliserGraphic"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("2603");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("2603");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smEventLogAnaliserGraphic" );
			new utState(lStateMachine, "Initializing");
			new utState(lStateMachine, "Executing");
			new utState(lStateMachine, "InsertingAnalysis");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("RM_GET_CONTEXT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_GET_CONTEXT", "");
			lTransition.AddEffect("EFFECT_GET_CONTEXT");

			lState = lStateMachine.FindState("Executing");
			lTransition = lState.NewOutgoingTransition("RM_NEW_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("InsertingAnalysis") );
			lTransition.AddTrigger("RM_NEW_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_NEW_ANALYSIS");
			lTransition = lState.NewOutgoingTransition("RM_START_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_START_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_START_ANALYSIS");
			lTransition = lState.NewOutgoingTransition("RM_STOP_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_STOP_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_STOP_ANALYSIS");
			lTransition = lState.NewOutgoingTransition("RM_GET_CONTEXT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_CONTEXT", "");
			lTransition.AddEffect("EFFECT_GET_CONTEXT");
			lTransition = lState.NewOutgoingTransition("RM_EDIT_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("InsertingAnalysis") );
			lTransition.AddTrigger("RM_EDIT_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_EDIT_ANALYSIS");
			lTransition = lState.NewOutgoingTransition("RM_GET_SERVERS_STATUS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SERVERS_STATUS", "");
			lTransition.AddEffect("EFFECT_GET_SERVERS_STATUS");
			lTransition = lState.NewOutgoingTransition("RM_GET_SAMPLE_EVENTS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SAMPLE_EVENTS", "");
			lTransition.AddEffect("EFFECT_GET_SAMPLE_EVENTS");
			lTransition = lState.NewOutgoingTransition("RM_NOTIFY_MONITOR_PARAMETERS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_NOTIFY_MONITOR_PARAMETERS", "");
			lTransition.AddEffect("EFFECT_NOTIFY_MONITOR_PARAMETERS");
			lTransition = lState.NewOutgoingTransition("RM_GET_EVENT_CONTENT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_EVENT_CONTENT", "");
			lTransition.AddEffect("EFFECT_GET_EVENT_CONTENT");
			lTransition = lState.NewOutgoingTransition("RM_GET_ANALYSIS_GRAPHIC");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_ANALYSIS_GRAPHIC", "");
			lTransition.AddEffect("EFFECT_GET_ANALYSIS_GRAPHIC");
			lTransition = lState.NewOutgoingTransition("RM_REFRESH_ANALYSIS_GRAPHIC");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_REFRESH_ANALYSIS_GRAPHIC", "");
			lTransition.AddEffect("EFFECT_REFRESH_ANALYSIS_GRAPHIC");
			lTransition = lState.NewOutgoingTransition("RM_UPDATE_GRAPHIC_FAIXA");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_UPDATE_GRAPHIC_FAIXA", "");
			lTransition.AddEffect("EFFECT_UPDATE_GRAPHIC_FAIXA");
			lTransition = lState.NewOutgoingTransition("RM_UPDATE_GRAPHIC_LEVEL");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_UPDATE_GRAPHIC_LEVEL", "");
			lTransition.AddEffect("EFFECT_UPDATE_GRAPHIC_LEVEL");
			lTransition = lState.NewOutgoingTransition("RM_START_SERVERS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_START_SERVERS", "");
			lTransition.AddEffect("EFFECT_START_SERVERS");
			lTransition = lState.NewOutgoingTransition("RM_GET_SAMPLES");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SAMPLES", "");
			lTransition.AddEffect("EFFECT_GET_SAMPLES");
			lTransition = lState.NewOutgoingTransition("RM_GET_SAMPLE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SAMPLE", "");
			lTransition.AddEffect("EFFECT_GET_SAMPLE");
			lTransition = lState.NewOutgoingTransition("RM_GET_ANALYSIS_BASE_DADOS_GRAPHIC");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_ANALYSIS_BASE_DADOS_GRAPHIC", "");
			lTransition.AddEffect("EFFECT_GET_ANALYSIS_BASE_DADOS_GRAPHIC");
			lTransition = lState.NewOutgoingTransition("RM_UPDATE_GRAPHIC_FAIXA_BASE_DADOS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_UPDATE_GRAPHIC_FAIXA_BASE_DADOS", "");
			lTransition.AddEffect("EFFECT_UPDATE_GRAPHIC_FAIXA_BASE_DADOS");
			lTransition = lState.NewOutgoingTransition("RM_UPDATE_GRAPHIC_LEVEL_BASE_DADOS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_UPDATE_GRAPHIC_LEVEL_BASE_DADOS", "");
			lTransition.AddEffect("EFFECT_UPDATE_GRAPHIC_LEVEL_BASE_DADOS");

			lState = lStateMachine.FindState("InsertingAnalysis");
			lTransition = lState.NewOutgoingTransition("RM_SAVE_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_SAVE_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_SAVE_ANALYSIS");
			lTransition = lState.NewOutgoingTransition("RM_CANCEL_NEW_ANALYSIS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_CANCEL_NEW_ANALYSIS", "");
			lTransition.AddEffect("EFFECT_CANCEL_NEW_ANALYSIS");



			//UseCase "ucCadastroAxisX"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("2605");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("2605");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smCadastroAxisX" );
			new utState(lStateMachine, "stAguardando");
			new utState(lStateMachine, "stEditando");
			new utState(lStateMachine, "stConsultando");
			lStateMachine.setInitialState( lStateMachine.FindState("stAguardando") );
			lState = lStateMachine.FindState("stAguardando");
			lTransition = lState.NewOutgoingTransition("RM_OBTEM_CONTEXTO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTEM_CONTEXTO", "");
			lTransition.AddEffect("EFFECT_MontaContexto");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_EditaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_CONSULTA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_CONSULTA_OBJETO", "");
			lTransition.AddEffect("Effect_ConsultaObjeto");

			lState = lStateMachine.FindState("stEditando");
			lTransition = lState.NewOutgoingTransition("RM_SALVA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stConsultando") );
			lTransition.AddTrigger("RM_SALVA_OBJETO", "");
			lTransition.AddEffect("EFFECT_SalvaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_VALIDA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_VALIDA_OBJETO", "");
			lTransition.AddEffect("EFFECT_ValidaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_INCLUIR_INTERVALO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_INCLUIR_INTERVALO", "");
			lTransition.AddEffect("Effect_IncluirIntervalo");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUIR_INTERVALO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EXCLUIR_INTERVALO", "");
			lTransition.AddEffect("Effect_ExcluirIntevalo");
			lTransition = lState.NewOutgoingTransition("RM_ALTERAR_INTERVALO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_ALTERAR_INTERVALO", "");
			lTransition.AddEffect("Effect_AlterarIntervalo");

			lState = lStateMachine.FindState("stConsultando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_INCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_IncluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EDITA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stEditando") );
			lTransition.AddTrigger("RM_EDITA_OBJETO", "");
			lTransition.AddEffect("EFFECT_EditaObjeto");
			lTransition = lState.NewOutgoingTransition("RM_EXCLUI_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("stAguardando") );
			lTransition.AddTrigger("RM_EXCLUI_OBJETO", "");
			lTransition.AddEffect("EFFECT_ExcluiObjeto");
			lTransition = lState.NewOutgoingTransition("RM_CONSULTA_OBJETO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_CONSULTA_OBJETO", "");
			lTransition.AddEffect("Effect_ConsultaObjeto");



			//UseCase "ucDashBoard"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("2930");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("2930");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smucDashBoard" );
			new utState(lStateMachine, "Initializing");
			new utState(lStateMachine, "Executing");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("RM_GET_CONTEXT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("Executing") );
			lTransition.AddTrigger("RM_GET_CONTEXT", "");
			lTransition.AddEffect("EFFECT_GET_CONTEXT");

			lState = lStateMachine.FindState("Executing");
			lTransition = lState.NewOutgoingTransition("RM_GET_CONTEXT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_CONTEXT", "");
			lTransition.AddEffect("EFFECT_GET_CONTEXT");
			lTransition = lState.NewOutgoingTransition("RM_GET_SERVERS_STATUS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SERVERS_STATUS", "");
			lTransition.AddEffect("EFFECT_GET_SERVERS_STATUS");
			lTransition = lState.NewOutgoingTransition("RM_NOTIFY_MONITOR_PARAMETERS");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_NOTIFY_MONITOR_PARAMETERS", "");
			lTransition.AddEffect("EFFECT_NOTIFY_MONITOR_PARAMETERS");



			//UseCase "ucClassMetaInfo"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("3583");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("3583");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smucClassMetaInfo" );
			new utState(lStateMachine, "Executando");
			lStateMachine.setInitialState( lStateMachine.FindState("Executando") );
			lState = lStateMachine.FindState("Executando");
			lTransition = lState.NewOutgoingTransition("RM_OBTER_CLASSES");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTER_CLASSES", "");
			lTransition.AddEffect("Effect_ObterClasses");
			lTransition = lState.NewOutgoingTransition("RM_OBTER_DADOS_DA_CLASSE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTER_DADOS_DA_CLASSE", "");
			lTransition.AddEffect("Effect_ObterDadosDaClasse");



			//UseCase "ucCadastroGenerico"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("__ucGENERIC");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("__ucGENERIC");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smucCadastroGenerico" );
			new utState(lStateMachine, "Executando");
			lStateMachine.setInitialState( lStateMachine.FindState("Executando") );
			lState = lStateMachine.FindState("Executando");
			lTransition = lState.NewOutgoingTransition("RM_INCLUIR");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_INCLUIR", "");
			lTransition.AddEffect("Effect_Incluir");
			lTransition = lState.NewOutgoingTransition("RM_EDITAR");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_EDITAR", "");
			lTransition.AddEffect("Effect_Editar");
			lTransition = lState.NewOutgoingTransition("RM_DELETAR");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_DELETAR", "");
			lTransition.AddEffect("Effect_Deletar");
			lTransition = lState.NewOutgoingTransition("RM_CONSULTAR");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_CONSULTAR", "");
			lTransition.AddEffect("Effect_Consultar");
			lTransition = lState.NewOutgoingTransition("RM_OBTER_MODELO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_OBTER_MODELO", "");
			lTransition.AddEffect("Effect_ObterModelo");



			//UseCase "ucPropriedadesDoServico"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1536");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("1536");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "smPropriedadesDoServico" );
			new utState(lStateMachine, "Executando");
			lStateMachine.setInitialState( lStateMachine.FindState("Executando") );
			lState = lStateMachine.FindState("Executando");
			lTransition = lState.NewOutgoingTransition("RM_GET_SERVICE_PROPERTIES");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_SERVICE_PROPERTIES", "");
			lTransition.AddEffect("EFFECT_GET_SERVICE_PROPERTIES");



			//UseCase "Treinamento"
			lUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("5678");
			lUseCaseTicket.setStateMachine(new acUseCaseStateMachine(lUseCaseTicket, null));

			lStateMachine = lUseCaseTicket.getStateMachine();

			lStateMachine.setName("smServer");
			new utState(lStateMachine, "Initializing");
			lSubMachineState = new utSubMachineState(lStateMachine, "UseCaseSubmachine");
			lSubMachineUseCaseTicket = piMetaModel.GetUseCaseTicketByCode("5678");
			lSubMachineState.setStateMachine( new acUseCaseStateMachine(lSubMachineUseCaseTicket, lSubMachineState) );
			new utFinalState(lStateMachine, "smBase_FinalState");
			lStateMachine.setInitialState( lStateMachine.FindState("Initializing") );
			lState = lStateMachine.FindState("Initializing");
			lTransition = lState.NewOutgoingTransition("READY");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("UseCaseSubmachine") );
			lTransition.AddTrigger("READY", "");

			lState = lStateMachine.FindState("UseCaseSubmachine");
			lTransition = lState.NewOutgoingTransition("ABORT");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("smBase_FinalState") );
			lTransition.AddTrigger("UM_ABORT","4");
			lTransition.AddEffect("EFFECT_Abort");
			lTransition = lState.NewOutgoingTransition("TIMEOUTCHECK");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_TIMEOUT_CHECK","16");
			lTransition.AddEffect("EFFECT_TimeOutCheck");
			lTransition = lState.NewOutgoingTransition("GETTRIGGERSFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_TRIGGERS_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetTriggersFromCurrentState");
			lTransition = lState.NewOutgoingTransition("GETXSDBYTRIGGERFROMCURRENTSTATE");
			lTransition.setSourceState(lState);
			lTransition.setTargetState(lState);
			lTransition.AddTrigger("RM_GET_XSD_BY_TRIGGER_FROM_CURRENT_STATE", "");
			lTransition.AddEffect("EFFECT_GetXSDByTriggerFromCurrentState");


			lStateMachine = lUseCaseTicket.FindStateMachine("smServer");
			lStateMachine = (acUseCaseStateMachine)( (utSubMachineState) lStateMachine.FindState("UseCaseSubmachine") ).getStateMachine();
			lStateMachine.setName( "StateMachine1" );
			new utState(lStateMachine, "State1");
			new utState(lStateMachine, "State2");
			new utState(lStateMachine, "State3");
			new utFinalState(lStateMachine, "FinalState1");
			new utState(lStateMachine, "State4");
			lStateMachine.setInitialState( lStateMachine.FindState("State1") );
			lState = lStateMachine.FindState("State1");
			lTransition = lState.NewOutgoingTransition("RM_GO_2");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("State2") );
			lTransition.AddTrigger("RM_GO_2", "");
			lTransition.AddEffect("Effect_1_2");
			lTransition = lState.NewOutgoingTransition("RM_GO_3");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("State3") );
			lTransition.AddTrigger("RM_GO_3", "");
			lTransition.AddEffect("Effect_1_3");

			lState = lStateMachine.FindState("State2");
			lTransition = lState.NewOutgoingTransition("RM_GO_4");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("State4") );
			lTransition.AddTrigger("RM_GO_4", "");
			lTransition.AddEffect("Effect_2_4");

			lState = lStateMachine.FindState("State3");
			lTransition = lState.NewOutgoingTransition("RM_GO_4");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("State4") );
			lTransition.AddTrigger("RM_GO_4", "");
			lTransition.AddEffect("Effect_3_4");

			lState = lStateMachine.FindState("State4");
			lTransition = lState.NewOutgoingTransition("RM_INICIO");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("State1") );
			lTransition.AddTrigger("RM_INICIO", "");
			lTransition.AddEffect("Effect4_1");
			lTransition = lState.NewOutgoingTransition("RM_FIM");
			lTransition.setSourceState(lState);
			lTransition.setTargetState( lStateMachine.FindState("FinalState1") );
			lTransition.AddTrigger("RM_FIM", "");
			lTransition.AddEffect("Effect_FIM");



		}
		
		public static void RegisterModelMappings(acMetaModelPersistenceMapSQL piMetaModelPersistenceMap) {
			RegisterClassTickets1(piMetaModelPersistenceMap.getMetaModel(), piMetaModelPersistenceMap);
			RegisterClassRelationTickets1(piMetaModelPersistenceMap.getMetaModel(), piMetaModelPersistenceMap);
			RegisterUseCases1(piMetaModelPersistenceMap.getMetaModel());
		}
	
	}
