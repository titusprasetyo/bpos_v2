#!/bin/sh
# bPOS Retail Solution by PT BUSI

DIRNAME=`dirname $0`
CP=$DIRNAME/bpos.jar
CP=$CP:$DIRNAME/locales/
CP=$CP:$DIRNAME/lib/substance.jar
java -cp $CP -Dswing.defaultlaf=javax.swing.plaf.metal.MetalLookAndFeel com.openbravo.pos.config.JFrmConfig
