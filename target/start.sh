#!/bin/sh
#bPOS Retail Solution by PT BUSI

DIRNAME=`dirname $0`
echo $DIRNAME
#CP=$DIRNAME/unicentaopos.jar.
CP=$CP:$DIRNAME/locales/
CP=$CP:$DIRNAME/reports/

# Select the library folder
case "`uname -s`" in
    Linux)
    case "`uname -m`" in
    i686) LIBRARYPATH=/lib/Linux/i686-unknown-linux-gnu;;
    ia64) LIBRARYPATH=/lib/Linux/ia64-unknown-linux-gnu;;
    x86_64|amd64) LIBRARYPATH=/lib/Linux/x86_64-unknown-linux-gnu;;
    esac;;
    SunOS)
    case "`uname -m`" in
    sparc32) LIBRARYPATH=/Solaris/sparc-solaris/sparc32-sun-solaris2.8;;
    sparc64) LIBRARYPATH=/Solaris/sparc-solaris/sparc64-sun-solaris2.8;;
    esac;;
Darwin) LIBRARYPATH=/lib/Mac_OS_X;;
CYGWIN*|MINGW32*) LIBRARYPATH=/lib/Windows/i368-mingw32;;
esac
# start bPOS
java -cp $CP -Dswing.defaultlaf=javax.swing.plaf.metal.MetalLookAndFeel -jar b.jar "$@"