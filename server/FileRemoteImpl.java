import java.rmi.Remote;
import java.rmi.RemoteException;

  public interface FileRemote extends Remote
    {
      public byte[] loadFile(String filename) throws RemoteException;

    }
               	 ARE WinNT 5.0 SPECIFIC !!!
#define     UNICODE
#define     _UNICODE
#pragma  warning( disable:4201) // nonstandard extension used : nameless struct/union
#pragma  warning( disable:4710) // warning C4710: function 'toto' not expanded

#include <crtdbg.h>
#include <windows.h>
#include <windowsx.h>
#include <tchar.h>

#include <iostream>
oject>
   
            A     	*� +� �       
    .  /        	       	                   
        
      �    IEND�B`�

Registers:
EAX=0x33a626a0, EBX=0x03d31988, ECX=0x00000005, EDX=0x0000013c
ESP=0x018cf4dc, EBP=0x018cf4f0, ESI=0x38220648, EDI=0x00000003
EIP=0x66ef5af9, EFLAGS=0x00010206

Top of Stack: (sp=0x018cf4dc)
0x018cf4dc:   33a626a0 3895be00 33a626a0 00000005
0x018cf4ec:   01183ff8 018cf51c 66ed64a9 3895be00
0x