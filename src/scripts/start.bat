@echo off
REM bPOS Retail Solution by PT BUSI

set DIRNAME=%~dp0

set CP=%CP%;"%DIRNAME%locales/"
set CP=%CP%;"%DIRNAME%reports/"

start /B javaw -cp %CP% -Djava.library.path="%DIRNAME%lib/Windows/i368-mingw32" -Ddirname.path="%DIRNAME%./" -splash:bpos_splash.png -jar bpos.jar %1