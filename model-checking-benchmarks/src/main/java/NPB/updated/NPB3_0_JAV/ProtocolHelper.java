package NPB.updated.NPB3_0_JAV;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.generated.CG.CGProtocol_liberal_n_1;
import nl.florianslob.modelchecking.generated.CG.CGProtocol_liberal_n_2;
import nl.florianslob.modelchecking.generated.CG.CGProtocol_liberal_n_3;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_1;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_10;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_11;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_12;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_13;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_14;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_15;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_16;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_17;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_18;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_19;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_2;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_20;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_21;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_22;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_23;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_24;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_25;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_26;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_27;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_28;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_29;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_3;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_30;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_31;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_32;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_4;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_5;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_6;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_7;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_8;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_9;
import nl.florianslob.modelchecking.generated.FT.*;
import nl.florianslob.modelchecking.generated.ISProtocol_n_1;
import nl.florianslob.modelchecking.generated.ISProtocol_n_2;
import nl.florianslob.modelchecking.generated.ISProtocol_n_3;
import nl.florianslob.modelchecking.generated.MGProtocol_n_1;

public class ProtocolHelper {
    public static IProtocol GetProtocolImplementation(NpbType npbType, int numberOfThreads, ProtocolVariant protocolVariant){
        switch (npbType){
            case CG:
                if(protocolVariant == ProtocolVariant.STRICT){
                    switch (numberOfThreads) {
                        case 1:
                            return new CGProtocol_strict_n_1();
                        case 2:
                            return new CGProtocol_strict_n_2();
                        case 3:
                            return new CGProtocol_strict_n_3();
                        case 4:
                            return new CGProtocol_strict_n_4();
                        case 5:
                            return new CGProtocol_strict_n_5();
                        case 6:
                            return new CGProtocol_strict_n_6();
                        case 7:
                            return new CGProtocol_strict_n_7();
                        case 8:
                            return new CGProtocol_strict_n_8();
                        case 9:
                            return new CGProtocol_strict_n_9();
                        case 10:
                            return new CGProtocol_strict_n_10();
                        case 11:
                            return new CGProtocol_strict_n_11();
                        case 12:
                            return new CGProtocol_strict_n_12();
                        case 13:
                            return new CGProtocol_strict_n_13();
                        case 14:
                            return new CGProtocol_strict_n_14();
                        case 15:
                            return new CGProtocol_strict_n_15();
                        case 16:
                            return new CGProtocol_strict_n_16();
                        case 17:
                            return new CGProtocol_strict_n_17();
                        case 18:
                            return new CGProtocol_strict_n_18();
                        case 19:
                            return new CGProtocol_strict_n_19();
                        case 20:
                            return new CGProtocol_strict_n_20();
                        case 21:
                            return new CGProtocol_strict_n_21();
                        case 22:
                            return new CGProtocol_strict_n_22();
                        case 23:
                            return new CGProtocol_strict_n_23();
                        case 24:
                            return new CGProtocol_strict_n_24();
                        case 25:
                            return new CGProtocol_strict_n_25();
                        case 26:
                            return new CGProtocol_strict_n_26();
                        case 27:
                            return new CGProtocol_strict_n_27();
                        case 28:
                            return new CGProtocol_strict_n_28();
                        case 29:
                            return new CGProtocol_strict_n_29();
                        case 30:
                            return new CGProtocol_strict_n_30();
                        case 31:
                            return new CGProtocol_strict_n_31();
                        case 32:
                            return new CGProtocol_strict_n_32();
                        default:
                            throw new UnsupportedOperationException("This N is not supported");
                    }
                }else if(protocolVariant == protocolVariant.LIBERAL){
                        switch (numberOfThreads) {
                            case 1:
                                return new CGProtocol_liberal_n_1();
                            case 2:
                                return new CGProtocol_liberal_n_2();
                            case 3:
                                return new CGProtocol_liberal_n_3();
                            default:
                                throw new UnsupportedOperationException("This N is not supported");
                        }
                }else{
                    throw new UnsupportedOperationException("This ProtocolVariant is not supported");
                }
            case FT:
                switch (numberOfThreads){
                    case 1:
                        return new FTProtocol_n_1();
                    case 2:
                        return new FTProtocol_n_2();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case IS:
                switch (numberOfThreads){
                    case 1:
                        return new ISProtocol_n_1();
                    case 2:
                        return new ISProtocol_n_2();
                    case 3:
                        return new ISProtocol_n_3();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case MG:
                switch (numberOfThreads){
                    case 1:
                        return new MGProtocol_n_1();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case BT:
            case LU:
            case SP:
            default:
                throw new UnsupportedOperationException("Not Supported");
        }
    }

}