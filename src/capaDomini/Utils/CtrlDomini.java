/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDomini.Utils;

import capaDomini.Algoritmes.KenKenGenerator;
import capaDomini.Usuari.CtrlUser;
import capaPersistencia.CtrlPersistencia;
import java.util.Scanner;

/**
 *
 * @author Oriolcapo
 */
public class CtrlDomini {
    
    private static Scanner sn;
    private CtrlPersistencia CP;
    private CtrlUser CU;
    
    public CtrlDomini(Scanner sn) {
        this.sn = sn;
        CP = new CtrlPersistencia();
        CP.setSeparator(" ");
        CU = new CtrlUser();
        generaKenkenAleatori (4);
    }
    
    public TaulerKenKen generaKenkenAleatori (int N) {
        KenKenGenerator KG = new KenKenGenerator(sn);
        return KG.generateRandomly(N);
    }
}