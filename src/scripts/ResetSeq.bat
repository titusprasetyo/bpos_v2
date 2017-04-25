@echo off
REM bPOS Retail Solution by PT BUSI
set DIRNAME=%~dp0
set CP="%DIRNAME%bpos.jar"
set CP=%CP%;"%DIRNAME%locales/"
set CP=%CP%;"%DIRNAME%lib/substance.jar"
start /B javaw -cp %CP% com.openbravo.pos.sales.JResetPickupID