package final_package;

public final class stupid {
    // nemo: guess from content, these three funcs serve as base64 to hex
    public static byte[] a(String paramString, int paramInt) {
        System.out.printf("In first stupid.a: %s, %d\n", paramString, paramInt);
        return a(paramString.getBytes(), paramInt);
    }

    public static byte[] a(byte[] paramArrayOfbyte, int paramInt) {
        System.out.printf("In second stupid.a: %s, %d\n", paramArrayOfbyte, paramInt);
        return a(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramInt);
    }

    private static byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
        System.out.printf("In third stupid.a: %s, %d, %d, %d\n", paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
        // nemo: see this 3/4, don't you?
        b b1 = new b(paramInt3, new byte[paramInt2 * 3 / 4], null);
        if (b1.a(paramArrayOfbyte, paramInt1, paramInt2, true)) {
            paramInt1 = b1.b;
            paramArrayOfbyte = b1.a;
            if (paramInt1 == paramArrayOfbyte.length)
                return paramArrayOfbyte;
            byte[] arrayOfByte = new byte[paramInt1];
            System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramInt1);
            return arrayOfByte;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    static abstract class a {
        byte[] a;

        int b;
    }

    private static class b extends a {
        private static final int[] c = new int[] {
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, 62, -1, -1, -1, 63, 52, 53,
                54, 55, 56, 57, 58, 59, 60, 61, -1, -1,
                -1, -2, -1, -1, -1, 0, 1, 2, 3, 4,
                5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, -1, -1, -1, -1, -1, -1, 26, 27, 28,
                29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
                49, 50, 51, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1 };

        private static final int[] d = new int[] {
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, 62, -1, -1, 52, 53,
                54, 55, 56, 57, 58, 59, 60, 61, -1, -1,
                -1, -2, -1, -1, -1, 0, 1, 2, 3, 4,
                5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, -1, -1, -1, -1, 63, -1, 26, 27, 28,
                29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
                49, 50, 51, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1 };

        private int e;

        private int f;

        private final int[] g;

        private b(int param1Int, byte[] param1ArrayOfbyte, Integer what) {
            int[] arrayOfInt;
            this.a = param1ArrayOfbyte;
            if ((param1Int & 0x8) == 0) {
                arrayOfInt = c;
            } else {
                arrayOfInt = d;
            }
            this.g = arrayOfInt;
            this.e = 0;
            this.f = 0;
        }

        public boolean a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, boolean param1Boolean) {
            // Byte code:
            //   0: aload_0
            //   1: getfield e : I
            //   4: istore #8
            //   6: iload #8
            //   8: bipush #6
            //   10: if_icmpne -> 15
            //   13: iconst_0
            //   14: ireturn
            //   15: iload_3
            //   16: iload_2
            //   17: iadd
            //   18: istore #10
            //   20: aload_0
            //   21: getfield f : I
            //   24: istore #5
            //   26: aload_0
            //   27: getfield a : [B
            //   30: astore #11
            //   32: aload_0
            //   33: getfield g : [I
            //   36: astore #12
            //   38: iconst_0
            //   39: istore_3
            //   40: iload_2
            //   41: istore #6
            //   43: iload #5
            //   45: istore_2
            //   46: iload #6
            //   48: istore #5
            //   50: iload_2
            //   51: istore #7
            //   53: iload_3
            //   54: istore #6
            //   56: iload #5
            //   58: iload #10
            //   60: if_icmpge -> 620
            //   63: iload #5
            //   65: istore #9
            //   67: iload_2
            //   68: istore #6
            //   70: iload_3
            //   71: istore #7
            //   73: iload #8
            //   75: ifne -> 234
            //   78: iload #5
            //   80: iconst_4
            //   81: iadd
            //   82: istore #7
            //   84: iload #7
            //   86: iload #10
            //   88: if_icmpgt -> 208
            //   91: aload #12
            //   93: aload_1
            //   94: iload #5
            //   96: baload
            //   97: sipush #255
            //   100: iand
            //   101: iaload
            //   102: bipush #18
            //   104: ishl
            //   105: aload #12
            //   107: aload_1
            //   108: iload #5
            //   110: iconst_1
            //   111: iadd
            //   112: baload
            //   113: sipush #255
            //   116: iand
            //   117: iaload
            //   118: bipush #12
            //   120: ishl
            //   121: ior
            //   122: aload #12
            //   124: aload_1
            //   125: iload #5
            //   127: iconst_2
            //   128: iadd
            //   129: baload
            //   130: sipush #255
            //   133: iand
            //   134: iaload
            //   135: bipush #6
            //   137: ishl
            //   138: ior
            //   139: aload #12
            //   141: aload_1
            //   142: iload #5
            //   144: iconst_3
            //   145: iadd
            //   146: baload
            //   147: sipush #255
            //   150: iand
            //   151: iaload
            //   152: ior
            //   153: istore #6
            //   155: iload #6
            //   157: istore_2
            //   158: iload #6
            //   160: iflt -> 208
            //   163: aload #11
            //   165: iload_3
            //   166: iconst_2
            //   167: iadd
            //   168: iload #6
            //   170: i2b
            //   171: bastore
            //   172: aload #11
            //   174: iload_3
            //   175: iconst_1
            //   176: iadd
            //   177: iload #6
            //   179: bipush #8
            //   181: ishr
            //   182: i2b
            //   183: bastore
            //   184: aload #11
            //   186: iload_3
            //   187: iload #6
            //   189: bipush #16
            //   191: ishr
            //   192: i2b
            //   193: bastore
            //   194: iload_3
            //   195: iconst_3
            //   196: iadd
            //   197: istore_3
            //   198: iload #7
            //   200: istore #5
            //   202: iload #6
            //   204: istore_2
            //   205: goto -> 78
            //   208: iload #5
            //   210: istore #9
            //   212: iload_2
            //   213: istore #6
            //   215: iload_3
            //   216: istore #7
            //   218: iload #5
            //   220: iload #10
            //   222: if_icmplt -> 234
            //   225: iload_2
            //   226: istore #7
            //   228: iload_3
            //   229: istore #6
            //   231: goto -> 620
            //   234: aload #12
            //   236: aload_1
            //   237: iload #9
            //   239: baload
            //   240: sipush #255
            //   243: iand
            //   244: iaload
            //   245: istore #5
            //   247: iload #8
            //   249: ifeq -> 561
            //   252: iload #8
            //   254: iconst_1
            //   255: if_icmpeq -> 524
            //   258: iload #8
            //   260: iconst_2
            //   261: if_icmpeq -> 468
            //   264: iload #8
            //   266: iconst_3
            //   267: if_icmpeq -> 349
            //   270: iload #8
            //   272: iconst_4
            //   273: if_icmpeq -> 311
            //   276: iload #8
            //   278: iconst_5
            //   279: if_icmpeq -> 291
            //   282: iload #8
            //   284: istore_2
            //   285: iload #7
            //   287: istore_3
            //   288: goto -> 605
            //   291: iload #8
            //   293: istore_2
            //   294: iload #7
            //   296: istore_3
            //   297: iload #5
            //   299: iconst_m1
            //   300: if_icmpeq -> 605
            //   303: aload_0
            //   304: bipush #6
            //   306: putfield e : I
            //   309: iconst_0
            //   310: ireturn
            //   311: iload #5
            //   313: bipush #-2
            //   315: if_icmpne -> 329
            //   318: iload #8
            //   320: iconst_1
            //   321: iadd
            //   322: istore_2
            //   323: iload #7
            //   325: istore_3
            //   326: goto -> 605
            //   329: iload #8
            //   331: istore_2
            //   332: iload #7
            //   334: istore_3
            //   335: iload #5
            //   337: iconst_m1
            //   338: if_icmpeq -> 605
            //   341: aload_0
            //   342: bipush #6
            //   344: putfield e : I
            //   347: iconst_0
            //   348: ireturn
            //   349: iload #5
            //   351: iflt -> 408
            //   354: iload #5
            //   356: iload #6
            //   358: bipush #6
            //   360: ishl
            //   361: ior
            //   362: istore #6
            //   364: aload #11
            //   366: iload #7
            //   368: iconst_2
            //   369: iadd
            //   370: iload #6
            //   372: i2b
            //   373: bastore
            //   374: aload #11
            //   376: iload #7
            //   378: iconst_1
            //   379: iadd
            //   380: iload #6
            //   382: bipush #8
            //   384: ishr
            //   385: i2b
            //   386: bastore
            //   387: aload #11
            //   389: iload #7
            //   391: iload #6
            //   393: bipush #16
            //   395: ishr
            //   396: i2b
            //   397: bastore
            //   398: iload #7
            //   400: iconst_3
            //   401: iadd
            //   402: istore_3
            //   403: iconst_0
            //   404: istore_2
            //   405: goto -> 605
            //   408: iload #5
            //   410: bipush #-2
            //   412: if_icmpne -> 448
            //   415: aload #11
            //   417: iload #7
            //   419: iconst_1
            //   420: iadd
            //   421: iload #6
            //   423: iconst_2
            //   424: ishr
            //   425: i2b
            //   426: bastore
            //   427: aload #11
            //   429: iload #7
            //   431: iload #6
            //   433: bipush #10
            //   435: ishr
            //   436: i2b
            //   437: bastore
            //   438: iload #7
            //   440: iconst_2
            //   441: iadd
            //   442: istore_3
            //   443: iconst_5
            //   444: istore_2
            //   445: goto -> 605
            //   448: iload #8
            //   450: istore_2
            //   451: iload #7
            //   453: istore_3
            //   454: iload #5
            //   456: iconst_m1
            //   457: if_icmpeq -> 605
            //   460: aload_0
            //   461: bipush #6
            //   463: putfield e : I
            //   466: iconst_0
            //   467: ireturn
            //   468: iload #5
            //   470: iflt -> 476
            //   473: goto -> 529
            //   476: iload #5
            //   478: bipush #-2
            //   480: if_icmpne -> 503
            //   483: aload #11
            //   485: iload #7
            //   487: iload #6
            //   489: iconst_4
            //   490: ishr
            //   491: i2b
            //   492: bastore
            //   493: iload #7
            //   495: iconst_1
            //   496: iadd
            //   497: istore_3
            //   498: iconst_4
            //   499: istore_2
            //   500: goto -> 605
            //   503: iload #8
            //   505: istore_2
            //   506: iload #7
            //   508: istore_3
            //   509: iload #5
            //   511: iconst_m1
            //   512: if_icmpeq -> 605
            //   515: aload_0
            //   516: bipush #6
            //   518: putfield e : I
            //   521: goto -> 309
            //   524: iload #5
            //   526: iflt -> 541
            //   529: iload #5
            //   531: iload #6
            //   533: bipush #6
            //   535: ishl
            //   536: ior
            //   537: istore_2
            //   538: goto -> 569
            //   541: iload #8
            //   543: istore_2
            //   544: iload #7
            //   546: istore_3
            //   547: iload #5
            //   549: iconst_m1
            //   550: if_icmpeq -> 605
            //   553: aload_0
            //   554: bipush #6
            //   556: putfield e : I
            //   559: iconst_0
            //   560: ireturn
            //   561: iload #5
            //   563: iflt -> 585
            //   566: iload #5
            //   568: istore_2
            //   569: iload #8
            //   571: iconst_1
            //   572: iadd
            //   573: istore_3
            //   574: iload_2
            //   575: istore #6
            //   577: iload_3
            //   578: istore_2
            //   579: iload #7
            //   581: istore_3
            //   582: goto -> 605
            //   585: iload #8
            //   587: istore_2
            //   588: iload #7
            //   590: istore_3
            //   591: iload #5
            //   593: iconst_m1
            //   594: if_icmpeq -> 605
            //   597: aload_0
            //   598: bipush #6
            //   600: putfield e : I
            //   603: iconst_0
            //   604: ireturn
            //   605: iload #9
            //   607: iconst_1
            //   608: iadd
            //   609: istore #5
            //   611: iload_2
            //   612: istore #8
            //   614: iload #6
            //   616: istore_2
            //   617: goto -> 50
            //   620: iload #4
            //   622: ifne -> 645
            //   625: aload_0
            //   626: iload #8
            //   628: putfield e : I
            //   631: aload_0
            //   632: iload #7
            //   634: putfield f : I
            //   637: aload_0
            //   638: iload #6
            //   640: putfield src_package.b : I
            //   643: iconst_1
            //   644: ireturn
            //   645: iload #6
            //   647: istore_2
            //   648: iload #8
            //   650: ifeq -> 751
            //   653: iload #8
            //   655: iconst_1
            //   656: if_icmpeq -> 742
            //   659: iload #8
            //   661: iconst_2
            //   662: if_icmpeq -> 724
            //   665: iload #8
            //   667: iconst_3
            //   668: if_icmpeq -> 692
            //   671: iload #8
            //   673: iconst_4
            //   674: if_icmpeq -> 683
            //   677: iload #6
            //   679: istore_2
            //   680: goto -> 751
            //   683: aload_0
            //   684: bipush #6
            //   686: putfield e : I
            //   689: goto -> 466
            //   692: iload #6
            //   694: iconst_1
            //   695: iadd
            //   696: istore_3
            //   697: aload #11
            //   699: iload #6
            //   701: iload #7
            //   703: bipush #10
            //   705: ishr
            //   706: i2b
            //   707: bastore
            //   708: iload_3
            //   709: iconst_1
            //   710: iadd
            //   711: istore_2
            //   712: aload #11
            //   714: iload_3
            //   715: iload #7
            //   717: iconst_2
            //   718: ishr
            //   719: i2b
            //   720: bastore
            //   721: goto -> 751
            //   724: aload #11
            //   726: iload #6
            //   728: iload #7
            //   730: iconst_4
            //   731: ishr
            //   732: i2b
            //   733: bastore
            //   734: iload #6
            //   736: iconst_1
            //   737: iadd
            //   738: istore_2
            //   739: goto -> 751
            //   742: aload_0
            //   743: bipush #6
            //   745: putfield e : I
            //   748: goto -> 466
            //   751: aload_0
            //   752: iload #8
            //   754: putfield e : I
            //   757: aload_0
            //   758: iload_2
            //   759: putfield src_package.b : I
            //   762: iconst_1
            //   763: ireturn
            return true;
        }
    }
}