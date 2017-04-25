@echo off
REM bPOS Retail Solution by PT BUSI

set DIRNAME=%~dp0
set CP="%DIRNAME%bpos.jar"
set CP=%CP%;"%DIRNAME%lib/jasperreports-4.5.1.jar"
set CP=%CP%;"%DIRNAME%lib/jcommon-1.0.15.jar"
set CP=%CP%;"%DIRNAME%lib/jfreechart-1.0.12.jar"
set CP=%CP%;"%DIRNAME%lib/jdt-compiler-3.1.1.jar"
set CP=%CP%;"%DIRNAME%lib/commons-beanutils-1.8.3.jar"
set CP=%CP%;"%DIRNAME%lib/commons-digester-2.1.jar"
set CP=%CP%;"%DIRNAME%lib/iText-2.1.7.jar"
set CP=%CP%;"%DIRNAME%lib/poi-3.8-20120326.jar"
set CP=%CP%;"%DIRNAME%lib/barcode4j-2.0.jar"
set CP=%CP%;"%DIRNAME%lib/commons-codec-1.4.jar"
set CP=%CP%;"%DIRNAME%lib/velocity-1.7-dep.jar"
set CP=%CP%;"%DIRNAME%lib/oro-2.0.8.jar"
set CP=%CP%;"%DIRNAME%lib/commons-collections-3.2.1.jar"
set CP=%CP%;"%DIRNAME%lib/commons-lang-2.4.jar"
set CP=%CP%;"%DIRNAME%lib/bsh-core-2.0b4.jar"
set CP=%CP%;"%DIRNAME%lib/RXTXcomm.jar"
set CP=%CP%;"%DIRNAME%lib/jpos1121.jar"
set CP=%CP%;"%DIRNAME%lib/swingx-all-1.6.4.jar"
set CP=%CP%;"%DIRNAME%lib/substance.jar"
set CP=%CP%;"%DIRNAME%lib/substance-swingx.jar"

REM Apache Axis SOAP libraries.
set CP=%CP%;"%DIRNAME%lib/axis.jar"
set CP=%CP%;"%DIRNAME%lib/jaxrpc.jar"
set CP=%CP%;"%DIRNAME%lib/saaj.jar"
set CP=%CP%;"%DIRNAME%lib/wsdl4j-1.5.1.jar"
set CP=%CP%;"%DIRNAME%lib/commons-discovery-0.4.jar"
set CP=%CP%;"%DIRNAME%lib/commons-logging-1.1.jar"
set CP=%CP%;"%DIRNAME%locales/"
set CP=%CP%;"%DIRNAME%reports/"

start /B javaw -cp %CP% -Djava.library.path="%DIRNAME%lib/Windows/i368-mingw32" -Ddirname.path="%DIRNAME%./" com.openbravo.pos.migrate.JFrmMigrate %1
