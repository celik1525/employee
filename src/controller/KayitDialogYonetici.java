/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dimension;
import javax.swing.JDialog;
import model.Kullanici;

/**
 *
 * @author asimsinanyuksel
 */
public class KayitDialogYonetici{
    private Kullanici kullanici;
    private JDialog dialog;
    public KayitDialogYonetici(Kullanici kullanici,JDialog dialog){
    this.kullanici=kullanici;
    this.dialog=dialog;
    
    }
    
    public void dialogGoster(){
    dialog.setMinimumSize(new Dimension(369, 187));
    dialog.setVisible(true);
    }
    
    public void dialogKapat(){
    dialog.dispose();
    }
    
    public void kullaniciBilgileriniAyarla(String ad,String kad,String sifre){
    
        kullanici.setAdSoyad(ad);
        kullanici.setKullaniciAdi(kad);
        kullanici.setSifre(sifre);
    }
    
    
    
}
