package com.johncaboose.adventofcode.days.twentytwenty;

class ProblemInput {
    public static final String DAY_1_EXAMPLE = """
            1721
            979
            366
            299
            675
            1456""";
    public static final String DAY_1_INPUT = """
            1706
            1466
            1427
            1744
            1684
            1386
            2001
            1750
            1753
            1770
            1559
            1616
            1408
            1860
            1940
            2002
            1862
            1918
            1456
            1209
            1840
            1462
            1783
            1644
            1901
            1791
            1506
            2005
            1338
            1383
            1420
            1631
            1784
            1897
            1771
            1588
            1955
            1937
            1392
            1396
            1803
            1429
            1407
            1698
            1562
            1913
            1678
            1198
            1398
            1703
            1831
            1489
            1782
            1864
            1708
            1397
            1915
            1953
            1395
            1610
            1549
            1564
            1973
            1931
            2009
            1980
            1800
            1443
            1993
            1900
            1964
            1581
            1904
            1665
            1567
            1057
            1805
            1402
            1878
            1729
            1825
            1682
            1719
            1469
            1004
            1591
            1594
            811
            1523
            1424
            1756
            373
            1442
            1718
            1411
            1892
            1820
            1977
            1871
            1890
            1653
            1372
            1475
            1476
            1422
            2004
            1755
            1676
            639
            1425
            1853
            1712
            1525
            1514
            1455
            1658
            1963
            1579
            1861
            1458
            1474
            1613
            1681
            1586
            1441
            1499
            1865
            1735
            1989
            1952
            792
            1669
            1509
            1481
            1893
            1445
            1834
            1779
            1732
            1826
            1595
            1829
            449
            1920
            1707
            1780
            1935
            1867
            1769
            1107
            919
            1382
            1604
            1875
            1453
            1496
            1946
            1659
            1570
            1692
            1630
            1638
            1922
            1691
            1580
            1880
            1482
            1762
            1775
            1376
            1434
            1856
            1971
            1646
            1951
            1416
            1889
            1773
            1814
            1471
            1488
            1736
            1743
            1459
            1389
            1498
            1663
            1611
            1727
            1699
            1624
            1511
            1767
            1754
            1785
            1491
            1235
            1510
            1500
            1485""";
    public static final String DAY_2_EXAMPLE = """
            1-3 a: abcde
            1-3 b: cdefg
            2-9 c: ccccccccc""";
    public static final String DAY_2_INPUT = """
            1-2 x: xpxc
            1-5 b: bwlbbbbcq
            3-5 v: qvjjdhvl
            9-12 t: ttfjvvtgxtctrntnhtt
            3-4 r: rqjw
            3-7 p: ppfpppppp
            5-6 q: qqqqgq
            7-10 v: gpvgmqkvxgbvs
            4-12 b: kkdnrhwzbbbb
            3-7 r: rrkwrshls
            3-4 l: ldltwzclnrllhkb
            4-6 m: mfcmmdvmmmm
            6-16 c: ccccczcccccccccgcc
            5-7 k: kkppkrr
            2-5 p: bpppmpcjrgwp
            8-14 c: dcwklzcckccwdw
            4-7 j: qhjjjhsj
            2-5 c: jcdclznbzb
            7-8 x: xxxxxxxsxxxxlxxxxxx
            6-7 s: rhsstssmvssss
            8-16 j: rhsxwjrtpjjjjxhcjhx
            13-14 q: lqmqqqzsvqqjqq
            5-7 g: gggsfggj
            15-16 s: ssssssssssssssxd
            3-5 d: dmwsm
            4-5 v: vbvvvg
            5-6 f: jfzbgfp
            1-4 k: qkkkk
            11-15 l: lllllllllllllln
            12-16 n: nfpnnnnnnhncnjnnls
            6-8 l: llllllllll
            13-15 p: pppppppppppphppp
            4-9 k: bkvqvwkgk
            1-3 j: jsrg
            10-14 r: rrvfrvrrrrtrrmsr
            2-4 r: tcfnd
            5-6 t: ttwtjk
            7-18 h: wjjfhphhbqlvqkhjwhk
            6-9 p: phkkzvppppjpcpnfpsxt
            5-6 f: ffffmfffffff
            9-16 p: gbwsmxplndwmrpps
            1-6 s: sczssw
            5-14 t: ctxlqhrlvvdttwlnt
            2-5 n: nndkqnnft
            7-8 c: zclccrwc
            4-11 q: pqrqdkpqbjshn
            5-6 m: nmcmrbmfcgmfw
            16-17 h: hhhhhhhxhhrhhhhhlh
            5-6 v: vvvvvv
            2-11 m: wpsmlpznxdkhs
            3-4 s: sswf
            2-3 s: hsbczzspqkwjr
            4-7 s: zsjrrsvssss
            11-16 j: hpjdcwpjjnjfgkjlxt
            5-7 b: rcbbbbg
            13-15 w: wwwwwwwwwwwwwwww
            1-6 c: cccmgc
            2-4 v: vvgv
            4-5 m: mfmmhms
            1-3 t: mntqgkdfjsxzptk
            2-7 v: nvnqmvv
            19-20 c: ccccccccccccccpcccfc
            11-12 t: wttmnqtbkttc
            3-5 p: ptpvp
            1-11 l: lglwgtlqlnxl
            4-8 m: mprmmmmwmmfmm
            9-10 d: ddddddddxdd
            16-20 r: rrrrrrrrrrrrrrrlrrrt
            1-4 g: gggg
            2-12 b: bczgbbbfbwbprbbbtb
            2-7 n: nnnmnxkntwwxnr
            14-18 z: tzzzqzzzlnpqzpzzkz
            5-7 p: ppppmkp
            9-14 c: vvcgvrxlccxvlpfml
            2-3 l: jlzpf
            3-5 p: pbpbp
            9-13 j: jjjjjjjjjjjjj
            5-7 k: fmckjkkklkxpf
            5-6 d: ddddrd
            9-10 s: sssnsgssbs
            9-10 p: ppwvppbpptpp
            1-8 z: kmfszzrx
            9-10 v: vvjjvsklvdkrkvs
            2-17 k: kkctmcfzhtvskxlkq
            10-12 n: vjnndvnlgnhmfc
            5-6 n: hnnnnntn
            1-6 f: fptffkhhkktfbtst
            4-6 k: kqnkjhhwqhpzb
            6-12 r: rrrrrrrrrrrv
            8-13 l: llllllllwlllllll
            4-6 p: qxprzs
            2-10 w: wswpdwwwrcth
            4-6 n: gnnfnnnnnnn
            10-14 s: ssssssprbfssssw
            3-4 f: ftfk
            6-16 x: cqxxqwrdxxxxsxbxxxxt
            4-8 f: ffsqvfpm
            8-11 t: ttztttttttnttt
            13-15 q: qqnqqqqqqqqqqqq
            2-3 w: wwww
            2-8 n: ntnnnnnrnn
            2-3 k: jkzkk
            3-4 s: sscscp
            14-19 g: gzggggggggggfgfgggqg
            5-6 n: nnnnwlnn
            11-12 b: bbmbbbbbbbxbbn
            5-6 t: zntzfk
            4-5 j: ljphjl
            3-12 d: zndtlvdvvdzzn
            7-8 h: hhhhhhhwhh
            12-13 s: sssssshssxssss
            4-5 h: nhsxxmh
            7-9 f: fzfkffffsfxn
            1-8 c: cccfcpccmhcch
            1-2 d: kfdwwm
            13-14 l: llllllllllllcll
            2-5 p: jpxdpkg
            2-4 h: hvhbmhhhhhnh
            5-9 g: ngqgtqtggdgg
            15-17 b: brhlrjflddssrrjxb
            10-15 v: vkfvvqtcxvvvtvcbvv
            1-3 g: pvkqsgzggg
            7-8 j: jjjjjjbjj
            3-4 w: jwrw
            4-7 c: mhcmkcjrpncxmcrccbc
            9-12 q: qqqqqqqqqqqs
            13-16 n: nwngndnnnnnnnnnnnn
            3-4 b: fjbbb
            8-9 d: jdfdsqnmdwfdnddkd
            1-4 f: ggfwgbfhvs
            4-5 g: gggvg
            8-12 x: gxhxxxxkxzmfxxx
            1-5 q: dqqhq
            3-9 m: mmdmmmzmmp
            1-2 l: llll
            6-8 q: qjwhqqhpkbzppc
            3-10 m: mmcjgrtzmmdmmm
            2-4 q: cxvq
            11-13 v: fvvvvvvvvvvvv
            7-13 b: bbbgbnbkbkbrldbbtc
            14-16 m: wmmmmmzxrmmjmwmh
            6-10 b: bwvwbbvshbgtbsrlwbzt
            6-8 q: qdwhcgpqxw
            16-17 l: llllbjlrllllcbdhllpl
            3-4 m: mmmrv
            7-8 m: mhjnnchg
            12-13 p: ppppppppppppt
            1-4 s: sssx
            1-2 d: xmpdq
            10-11 x: xxxxxxxxxbbx
            2-4 s: lxds
            1-4 b: jbsxbbmbbj
            6-8 q: qqqqqqblqq
            15-16 q: qqqqqwzqqqqqnqqqqfq
            5-7 s: fzvsssr
            6-7 l: lncbgqr
            7-8 s: ssssssvs
            3-5 r: rbrjt
            3-8 j: ksjjtvnjbjppjjjl
            6-10 s: sszlkrsssss
            1-4 z: znzfpz
            7-11 m: dfkcbxmxmnmmtvmtdn
            6-9 h: hlhhkhhhq
            8-9 p: ppppppppvp
            6-9 c: cccgccccmcch
            5-8 g: bgkggjgtvggn
            3-4 x: xxhk
            10-12 h: hhhhhhhhhlhhhhdnh
            5-6 j: zjjsjn
            9-14 s: ksclwttsmpjtds
            6-7 l: gtdcblql
            1-4 d: dkndjkcd
            1-6 k: kkkkkckmc
            10-12 x: xxxxxxxxxrxl
            2-5 v: fxdjtv
            3-5 q: pjmkqdmqnzqppr
            5-8 t: xtgtgtcht
            6-11 j: nftjzjmfljqjrc
            6-9 g: rskgggmgmwjggggvgb
            11-12 v: vkvdmvdvvvdv
            15-16 z: zzzzzzzzzzzzzzgxz
            13-17 v: vvvvvvvvvvvvvvvvnv
            9-14 j: clrfkrwhjtvzvqqj
            1-12 l: lljljznslllffhblz
            4-7 c: cccgcxclc
            6-11 z: tbxqrzzbwbr
            18-19 m: jmbmmqmshmczlphfgmf
            1-5 s: ssvsq
            4-5 k: kkkkw
            4-7 f: fcqffxff
            3-8 f: fffzthzf
            9-12 v: vvvvvvvvvvvmvv
            14-17 f: ftflcfffjtjrvfkffmvf
            4-7 n: pnmnxnqqjp
            6-7 r: rrrkrmr
            4-13 k: drckdzxrsmzrkqckn
            5-14 t: dttttttttttttt
            13-14 v: vvvvfvvvvvvvvvv
            7-12 j: jrljwnctjqjjxj
            6-7 v: wchfzvm
            1-8 d: dddddddzd
            10-12 g: gvvzrglgrgggggggggg
            3-4 n: ngtnnn
            2-4 b: fzbb
            1-15 x: cxxfxxxckxxhxlxxxxxx
            7-19 f: ffkzcglddffcfvfhffv
            9-12 s: sssssssmssss
            13-20 t: ttttmttttttthtttddtt
            2-15 v: vvqvcwvvvvsvvqvwm
            5-10 w: wxcstswwwwnc
            3-4 v: tjvvnvvtzfdcjjwb
            1-2 l: lbclr
            2-13 d: dkdlddcddddddd
            2-7 n: npnngnnn
            4-12 g: kmvvmfngwmlg
            1-2 w: wwwww
            5-11 t: ttttjtttttttttttt
            4-5 r: srlrrr
            5-8 q: qhqfpjqsnqqkq
            8-15 s: hvtnslpsfbsssrw
            11-16 n: gnwnfndrnnhnnknsnnc
            2-7 r: tdrrshrrhsxrr
            16-18 m: mmbmmmjmmmmmmmmmmbm
            6-7 n: nnnnnxt
            4-6 k: dpxzklksk
            1-9 g: ggkxhgggggggggggqg
            1-8 l: lllglllh
            1-4 c: cwtc
            5-6 h: vhhhvshh
            10-11 x: xxxxxxxxxxc
            2-3 q: qhqqgqmt
            3-6 k: hkqqshgjnxmlkrjdzg
            9-11 l: llprlllllllll
            5-7 l: lknflmrv
            8-9 h: hhhhhhhhh
            7-8 z: zzzzzgvzzzzz
            18-20 v: vvvvvvvhbvqvgvlvjbrv
            13-15 k: xkfcvkrnfkkkvcpt
            3-5 l: llnnglmgtz
            15-19 t: tmtsfttxtctdtgtmpttt
            6-8 f: gmffwvffff
            10-13 d: dndsddddddpdjndddd
            7-10 r: rjzqrpgrrrcmrrg
            1-4 m: hlmm
            9-15 d: pdddlrwdzddddddd
            6-13 q: qqqhnvqqqqqqfbqq
            1-11 z: wzsqmnrzwzzhzxczzzzd
            6-11 t: tptnjttkttttvtttr
            3-5 n: nnznnn
            5-6 t: trtttslv
            5-6 g: gggggt
            15-19 s: sssssssssssxsswsssss
            1-13 q: wzqjljdqqqqnqq
            6-7 k: kkkkkgkkk
            4-5 k: zkxvk
            7-14 t: thsstltbvmsctqkfhdzc
            2-5 n: hnnnn
            2-16 t: gsvkhmhktcxkfqbtd
            8-9 q: qqtzznrqg
            17-18 v: vvzvvvvvvvvvvvvvlk
            3-4 v: vvvl
            3-4 b: bbvb
            10-12 w: wwwcwwwwwwkzwhw
            1-3 d: ntps
            8-9 j: mqcjcjjfjjhjbjj
            1-7 j: mjjjjjjj
            13-14 f: bzffglvfcfsfjb
            2-3 k: kqkq
            7-15 c: fccpccshcccccccc
            12-13 k: kkkkkkpkktksqk
            12-13 w: rwwwwwkwwwwswwwhw
            5-12 k: nlkthkkklkkktchmhb
            15-16 f: fffffffdffffffbf
            3-4 k: kqkprkkp
            4-5 p: dcpdppzpppjqm
            4-7 b: qbbkgbgz
            10-11 n: nnnnnnnnnnw
            9-12 h: hhhchbhhvhrhhh
            3-5 h: hrhnbcl
            6-10 v: nvlvhvrpvvvvvvv
            3-6 d: dddddjd
            4-5 r: rrcvr
            7-12 l: llllllllllllltll
            3-6 b: zbbbbt
            6-10 z: zznzzzzzbzbhzz
            2-5 h: rfwbmkhmhhhmjhmh
            11-13 q: wkkzzqxvqqsqx
            2-15 p: hbpjpppppptppppzb
            9-10 b: bbmbbbbbsb
            3-10 t: cqmtttjtttttf
            8-11 v: tvgcvvvvvkv
            6-9 g: tggnggtggkg
            3-6 w: dfwnht
            8-14 c: pncwqccsfgctpccxc
            6-9 p: bpppjtzprggp
            15-18 j: sjjjjjjdjmjbjjpvjj
            1-6 m: mhmkrhxn
            10-11 d: xcjtpdwdcfvhqdksfhd
            16-17 t: txtlrttctwtztttnx
            13-14 j: jjtjjmjjnjjjjjjj
            10-12 m: ldqmmmgmmxrmfwrbv
            4-6 p: psmpnpkfq
            13-14 t: tltttsttmtttjttt
            7-9 g: ggggggbgv
            8-9 q: qqqqqqqqd
            4-5 d: ddddl
            14-16 g: gggggggwggpgfpgm
            4-5 v: vvvvl
            5-8 v: gtjpvvdv
            5-11 s: dsslsvqpwsss
            4-6 h: hhhghh
            16-17 k: hkkkkkkkkkkkkkkqj
            5-10 d: dddtddddjd
            6-7 v: vclfvvzvj
            6-8 m: dtkbcblppzx
            1-4 g: hggggg
            9-11 q: qdqvdqkdfqvqzqkq
            2-6 s: ssgsbswhs
            3-8 j: jjpjjjjv
            3-8 d: dddddddqdddd
            6-8 v: vvvvhcvn
            6-12 z: gzzzzzzzzzzkzzzzz
            5-12 k: nrkzklbxcwbc
            10-14 p: clxjpnhsvttnjp
            6-17 w: vztxwwwgwlwcwwwtw
            8-11 c: cctzcccqcjc
            1-3 b: zdqx
            3-5 x: dvxxxx
            6-13 b: gvbbbbbbbbvpkbb
            7-12 k: hkbkkqkvkmpkrhk
            3-6 c: ccrbcdccc
            4-6 m: znhphh
            4-11 x: xmmgbxxgdxxtbwg
            15-16 m: nmmbmmbjmrbvmmbm
            11-12 j: jdcjjtsjjdjj
            1-4 c: cccfcc
            6-15 n: ssvnnnnnnwnggzmp
            4-6 l: qwfllpx
            6-9 b: bbbbbsbbmb
            3-6 j: ljjgfh
            5-9 t: tttttphtwtvtf
            8-12 x: xtdxxxdjghxxpxhkbxx
            5-9 r: rrprrmrrrjvszrrtp
            15-16 r: lrrrrrrrrrrrkrrrr
            2-5 q: ltfgqcqmt
            7-13 k: zkkkkkkkkkkkhkkkkk
            5-6 z: zzzzzszz
            2-7 g: tnjqnsgkdtc
            3-4 j: njjjgkxcgckj
            4-7 j: rxmjlxzhjjjsgjcj
            7-10 f: rmfbffhffcf
            11-12 h: hdhhhhhhhhhsh
            7-8 v: nwrvvvvdv
            8-9 l: llllllllf
            4-5 r: rmxrrrrx
            2-3 c: ccgdcc
            13-15 r: rrwrrrnrrrrrdrslr
            4-16 x: cnlxmtpxdzxblfxxjd
            4-5 m: mmmmtm
            9-13 x: gxxxxxxlxxqxxxxx
            1-3 d: ddhd
            11-14 f: tffffffffqlfff
            2-4 r: xrrf
            1-11 m: mtdmsmmmmdmmmmmsmtmr
            1-8 g: pggtggggdgmgggn
            7-8 f: ffvfffpff
            2-7 k: khqgfzk
            11-12 s: ssssssssssbsss
            7-14 h: hthpwhhxhglzqtmhh
            2-4 z: zzpmz
            16-18 x: xxxqxxmlgbxxxxxxxx
            9-11 v: dblhzhvvvnfvptvmf
            4-11 n: nxsddnsnnngsdnghngk
            8-11 x: xxxxxxxwxxxxxxxxx
            1-4 s: swst
            13-14 m: mgmmghmmmmmmrmmfmmmg
            4-5 c: dcccc
            4-5 r: jzrrc
            13-19 b: bbbbbbbbbbbcbcbbbbb
            11-14 c: ccccncfclccccfcccm
            3-4 t: tstl
            1-20 v: vzrzgsvsfgxjqkxgdpwv
            14-15 h: hhvkbhhhhhhhhmhhsh
            9-13 b: bbbbbbbbtbbbbbb
            2-3 b: zbbb
            17-18 s: smsssssrsssssssssfss
            5-10 v: vfvvvfvdvjvlltv
            9-10 n: nnnqnnnnxtn
            6-7 w: pwtwwwfkwvk
            11-14 z: wzzzzzjzzzlzzkz
            5-6 l: lxlllv
            5-8 v: vvvvvvthhv
            1-9 r: rrrrjkzrdqmr
            6-8 s: sssssssg
            2-4 f: frfff
            1-16 r: pzbdrgnpndnrrwkczmr
            8-9 b: sbbbbbbblkwb
            2-5 z: zzjzz
            3-6 q: qqwqqr
            2-13 v: vbvvbvvjvvnvcdnvc
            12-15 p: pppppppppppppppp
            2-7 m: mmmmmmd
            6-11 f: ffffffffffz
            5-6 r: drrthrzrrrp
            2-7 q: fntqnbqqzb
            5-14 w: wlfwstdfzvwvqw
            4-7 s: mgsssslfjzsssv
            7-8 g: tgtgjrggggsggtg
            11-19 z: fkzzzvzzvzdzzzzzfzz
            3-7 w: kwcwwww
            6-14 s: sssssssssssswjss
            7-8 v: vvmbxvxv
            2-6 n: nnnnnp
            7-8 b: bbbbbbbb
            3-6 z: zzzzhz
            11-17 t: bltttdttttttttttzt
            1-9 l: llllllvll
            10-11 n: tznsxfhdpnn
            6-8 t: tttttnttt
            4-10 p: pppppppbppppppnc
            4-11 j: rhvjjjjjjwjnrcp
            3-4 j: cjjj
            7-12 v: kmctjvksqzvv
            16-17 w: wwwwwwwwcwwwwwwwwww
            12-16 f: fffffjbfffwffwffff
            9-10 p: ppntppppjppkpdp
            3-4 l: lllcf
            5-6 b: dbbbbsbtb
            2-3 p: pvpz
            5-6 f: pqffdf
            1-3 l: lnlpxl
            8-10 n: nnnjttnxmmns
            1-10 j: xjjwtjtjjjjjjj
            2-8 m: smwmcmzrfqbmmwdmm
            1-6 k: jxpsfkkkgm
            5-9 f: zjfffjjwknqh
            1-6 c: rcccczcccccc
            13-17 g: zsgpfppggwshgbtggxzh
            12-14 n: qmknbfcgnnnhwn
            1-6 k: vdklkkzkkkkfkm
            1-3 h: hhlhhhl
            16-18 p: qggnxmswcppklptgsp
            1-4 m: vmmqmmmmmmm
            8-10 l: lllllxlllvllg
            4-12 g: gjgghggwctzvgggggg
            8-11 x: jxhxxxxxxxx
            4-16 n: xnrnbkrkdvntnjkc
            2-4 m: mdmmj
            6-7 n: nnnnnngnnnntn
            1-13 j: jjjgjjjfgjjmj
            8-10 z: zzzzzzpjtz
            1-18 f: ffkwvfgcrnffgnffmf
            4-5 j: jjtjvb
            6-11 s: ssscsnslsssssssshsss
            11-12 n: nnnnnnnnnnmd
            2-10 n: cpnhnrnbknnkwnbnlb
            2-4 d: dddnh
            9-12 f: fffffffffffldfff
            1-9 d: ddddddvdlddddd
            1-8 w: wnwwwdwww
            3-4 h: bhgv
            1-4 x: vxxj
            3-4 g: gmgbg
            7-8 j: nzwgbtnj
            3-6 z: zzpzzhzw
            8-10 h: hmhhhhszgz
            1-5 m: dnqgnxjm
            11-12 z: zkzpbjxszzzhwgdz
            10-11 r: rlrrrrrrrrr
            1-2 v: vvvvtsvvvvvvvvqvvvn
            13-14 n: nrfzqlxxxsxqhnkhrmws
            1-4 z: znftzjjwzc
            6-15 v: fvvvlvvhvvvvvzhvv
            5-10 x: mtxprgbqxxkfnssvq
            8-9 f: lffffffwf
            1-4 g: grxgvlhflrbghj
            3-5 c: fcxcl
            6-7 s: ssssdds
            10-13 l: llllllllllllxl
            12-15 j: jjvjjbjcjjjjsjjj
            1-2 c: ctggc
            2-4 w: wbwwwwr
            8-20 v: phvvvvvrbvvfvvvvvvhv
            5-8 v: cvvnvjbl
            4-19 x: xhvxflxpkxxcfvwxxhl
            1-2 m: mgqj
            5-6 q: wpxdbq
            19-20 d: ddddddbxddddddddddpd
            5-11 d: dhhwddjddkdd
            6-7 g: ggggggn
            1-7 h: zhphhhhhgn
            7-11 s: ssssssssssksssss
            2-3 n: hnwn
            8-9 h: hhsshhhhh
            1-2 c: ccwcc
            2-5 s: cdsmmfqfcrsh
            3-5 m: mwmjt
            1-4 n: ndntnnnnnnnnnn
            4-6 s: ssslsssshsssmq
            5-16 r: rrrrcrrrjrrrrrrrrr
            1-6 v: bvvvvvvv
            9-10 t: tsttttztxtttttb
            8-12 d: tvrbvwxdddxmhfsd
            3-9 w: wbwwwwwwww
            3-5 g: bgglcqg
            8-12 f: fqffvdzslhksrv
            1-4 h: hsqh
            6-12 b: hbwhxbfppkbb
            12-15 l: llllllllllllllplv
            16-17 m: mmmmmzmvmmmmmmkmhmmm
            2-8 p: mpnnnpwpv
            9-10 x: xxpxxxxlcxj
            10-14 c: mccclvcccfcckwcbczc
            2-3 v: vvsrg
            13-15 h: hhhhrlhfhhhhvhhhshh
            3-8 z: vsbkqlzzzzzsmzw
            9-11 h: qhhhhhhhddnh
            4-5 h: hhhkxhh
            7-12 t: dtcvttttbhnntft
            1-5 z: kksnxzzxz
            1-3 j: cjjjjjjjfjj
            12-15 s: sslssstssssssszss
            2-4 c: mntc
            5-8 v: mvbsvfvvvlsrv
            5-6 z: zmhfjq
            10-15 r: rrrrrrrjrbrmrjr
            9-11 j: jjjjjjjjjjxjjj
            1-2 d: jwhdd
            4-5 m: mmmkm
            1-7 j: rprmjbxjj
            13-14 g: ggggggpqggggqgg
            1-5 l: llxzlkpptdzg
            1-2 z: zzzzzzzzzzzzjzzz
            3-4 h: qhhwtz
            2-5 t: tptttt
            1-14 c: cccccccccccccxcccc
            8-9 t: tgtpttwtqttvt
            1-16 m: mhmtpmmpmmtmzmmcqj
            3-4 q: qqvq
            10-11 h: hxhhhhhhhbhh
            5-6 n: xlchhnljrlnfrlwzs
            1-9 x: mxxxxxxxtxxxfxx
            2-7 n: bbnnrqmnnnnnl
            2-7 p: rgpqnqp
            3-4 f: fndf
            10-11 c: cccccccccqc
            3-10 l: lpzxlhpslfh
            3-5 k: kkkkkkk
            14-17 b: bbbbbbbtbbbbbfbbbb
            1-2 f: gfff
            10-14 j: jjjjjjhjjjdjrjc
            1-9 s: wszsswssspsss
            4-6 k: dckkkkkk
            3-13 h: hhvkvhhhhhhdhh
            15-16 g: ggggggggggggggngg
            2-11 m: nzdsmbqtmmmmxskcmmv
            3-11 m: mmmkmhxmwmcmqdlpmf
            1-8 n: snnnbnwn
            1-13 j: pjjjjjgjjjjjxjj
            3-18 m: mmvvmqmlmmmmzcmkwqlw
            1-4 d: dbdx
            12-15 r: rrrrrrmrrrrrrrr
            4-18 s: sssvsssssszsssssscss
            2-5 q: nqbmmbqds
            3-12 d: hrdvzzcrbjwdkgddbrpq
            2-3 r: rsrghkrmdsfm
            5-9 k: twfwkkkswqkkkkwv
            4-6 p: tppxpstmxcw
            12-13 k: kkkktkkkkrkksk
            1-2 m: lmmm
            3-5 s: shsss
            6-7 c: ccccclc
            10-17 s: ssssshsssssssssshs
            6-15 n: nnnxnrtfnnnnnnnnn
            3-18 s: jsfcdsscssmnsgssnj
            7-8 x: xxcxxxxr
            3-5 l: lvlllll
            11-12 h: hmhhhhhhhcxjhhfdh
            3-4 d: wdfdd
            3-4 r: qrvr
            10-18 j: mvwlxblnhjddlzkhqjfj
            6-20 b: bhbbbbbbbbbtbbkbbbbc
            8-9 c: cclccmnrr
            3-6 w: wwwwwww
            5-9 k: dlgkjnqxk
            12-18 f: fqfffbfffffcfffhfkf
            1-3 w: fwwgjsclwpw
            6-7 z: zwzzzzl
            14-16 r: jrrrrrrrrrrrrfrrrr
            11-14 b: bbbbbbbbbbbbbw
            9-11 h: hhhzhhhfxhhhh
            3-4 p: pplnp
            2-3 f: ffff
            5-8 p: lppppppsppppppp
            17-18 w: wwwwwwwwwwwwwwwwzcww
            11-13 n: nnnnnnnqnnnnfn
            7-12 f: fxmfpdfjrffjgtffzlfg
            4-16 w: bctwmwtxvwqzrwwwwhw
            2-7 m: gmmmmmjmmmm
            1-15 q: tqqqqqqqqqqqqqqq
            3-4 q: gqwq
            3-12 s: ssssssssssrhpsg
            6-8 m: mrmlmhcrsm
            4-9 q: gdbffcqbqt
            1-17 k: kkkkkkkkkkkkkkkkkmk
            15-16 h: hghhhhhhhhhhhhrhh
            4-5 p: pkpzmb
            2-18 h: khvkdpbxdptllfdxvhh
            18-20 z: zzczzzzzzzzzzzzzzpzs
            1-11 p: ppppppcpzppppppppp
            4-9 z: ztpfrjzwnv
            6-11 x: snxxtstcqhv
            3-5 c: nrlcccbcpsvcc
            2-7 z: dztxzzqmfzrpz
            5-14 w: pbcjnqpwwlccfscz
            1-5 f: rfndsxdmhbgf
            8-14 t: ttttpdfwtxfttd
            2-11 l: lndmmrnxdmdpdmlzll
            3-4 h: chzl
            10-17 d: ngkkdbvflmcssmgmdk
            4-7 d: bhksdtd
            2-6 k: ktkdkzwsgkhkk
            1-4 r: hrrs
            15-19 j: ndnvjfjljnwklsmdbjj
            5-12 v: vhvvvrvgvvqgwvvbfv
            2-3 r: rfkkhrrhqhks
            13-17 q: qqmlqqqqqmqqvqqqcqq
            4-15 z: zvbkvbzczkrttcz
            4-8 s: ssssssss
            13-14 x: xmxxrxxxgxxxmb
            7-10 s: sfjzslwsqsss
            4-13 c: clccncccccccpc
            2-4 l: lddlpplrqqs
            12-13 j: jjjvjjhjjjjmjjjjj
            6-9 n: lnnznnpnclnnn
            6-10 g: gggggggwgjgg
            4-6 l: tjhqmr
            2-4 d: hddxjdvj
            5-13 t: tzftwttwttjttt
            1-9 j: jnjjjkjftjjfmjhjkj
            8-9 q: qqqsqqqjj
            15-19 l: lllllbtdlsllllllxlfl
            5-6 g: gkgkrsgg
            2-4 t: tttb
            12-15 p: jpppppspgpppppkxb
            10-13 n: nznprnnhnmgxhxnknnnn
            12-13 d: dddsdddddddsd
            5-15 q: qqqqkqqqmqfzqqqw
            5-9 s: nmgslvgdz
            1-4 d: gddkddd
            12-16 v: zvdsdsgjrtjvzsjtx
            11-14 q: pqdgjqqqqgqqjwlqqqmq
            2-7 p: pkpqsppqgz
            6-10 b: bzdbbbbbbvbbbx
            14-15 v: vvvvqvvvcvvvvvvv
            4-5 w: wjwwwhjwg
            5-10 x: wgthfxtdpxx
            6-7 c: ccqcfcbcccbml
            6-7 w: rwwwwxb
            4-5 n: jnnnngvljjmnr
            3-11 m: lbmmmmmmmmtxgxmmzm
            1-2 b: bbbvjcbbb
            6-9 b: tbwbbcbbbb
            11-13 d: sdkwqrjdddbdd
            9-15 t: ttttpqttjttttsjt
            5-7 j: jjjjjjzj
            12-13 v: vvjvmvvqvfzvcvvvvvv
            6-7 d: ddlddrd
            5-6 j: jjjjwj
            5-6 f: fffffp
            6-7 w: zwmwdwww
            1-4 d: jddddppdktdgh
            4-14 n: nnnnncnnnnnnnnrn
            14-17 c: ccccccsdccccccccn
            3-4 z: zzzgqz
            5-17 m: mmrsmmnzqlnbmmlljwpm
            3-5 j: cgvjh
            12-13 w: wtgblrdchjjkfhg
            4-7 t: rgclgtt
            1-3 k: wckhkkkjkk
            6-11 n: nnnnnnnnnnvn
            17-18 k: kktkkkknczkkkkhkkk
            1-6 x: rwxqgxrxxxmsmkrx
            17-18 g: ggggggggggggggqgjp
            14-17 w: wwwwwwwwwwwwwnwww
            11-12 w: vcbmkbwnwbwww
            15-16 g: gggggggggghjgwgggjvg
            5-9 n: nnnnwnnnfnnnnnnsnnnn
            3-4 k: kkkjhk
            5-8 k: kkkkmkkkk
            9-13 k: kkrskkkkkkkqfkknmz
            2-3 j: jtjcj
            7-8 c: ccvcrcsxc
            5-9 k: kkkkgkkkkk
            4-5 h: hhzsxv
            1-7 d: lgdbdhdddd
            5-6 j: dsjjkj
            7-20 x: xnxwmwkbbbkjbpfwkpgx
            11-12 q: wmbqtffthfcqgq
            7-16 h: hhfkhhdhhhhhhhhhhhh
            9-13 b: bhbfbmbbsgbbfbj
            8-10 w: xwwmwwwgfwwzpwnw
            7-11 m: bmrmbwmmmmmmmm
            8-9 d: lshdfglpdq
            11-13 w: vxwwwwxckwwkww
            8-13 x: xxzxgtpxxlxxx
            8-13 z: jrsfgvzzzwrdxz
            10-11 q: qqqqqlqqqqq
            2-7 m: knxnmxm
            2-4 n: znnhnnnnnnn
            4-6 k: kmxgkkk
            10-18 z: qhhzhzbldchlmwdzfrsz
            3-4 n: nnnt
            11-15 v: vvvvvvvvvvwvwvf
            4-9 x: dxjxnmghvrxbnzgxljc
            1-2 m: mmgm
            18-19 z: zzzzczzzzczzzzzzzjsz
            6-20 p: pkhzdzpppfbphphpxppp
            3-9 h: zxhqqkkqknkfvq
            5-8 l: lllltlll
            8-10 z: zdzzzzmszz
            10-17 l: txhgwzsrjlvlvglxl
            1-12 s: bvgswssssmssvssssssb
            3-6 j: xjjbjt
            3-5 x: xxlxq
            5-15 r: htprxzjstgzpddrtjrr
            1-10 x: xzftsqxxpgzdlcth
            6-9 w: wbdwwpbwwwwcrx
            4-11 n: nnknnhnnnnk
            8-11 f: ffffffpsfffff
            6-9 h: hhhnhhqhhhnhvv
            6-9 x: gqxzhlpnxlcrwnxxp
            5-7 k: kkkkjkkk
            5-7 x: xxdxxsqcx
            6-7 j: jfjljjfp
            7-8 l: clsldvlc
            5-10 h: qhqmchbzhlfhc
            5-9 m: mpdnhsmmb
            2-4 k: jvmkjrkhkctwlrq
            2-3 s: ssgstssds
            8-9 t: tvttttttht
            5-6 n: nnnpnpn
            8-9 x: xxxxqxxxsp
            6-7 z: zzzzzzl
            4-5 f: fffpkffq
            1-12 b: bsfbclbxbkbbmbmb
            14-15 b: rcnwnhbdfbhtblvb
            7-9 j: jjjjjjjjx
            2-3 x: xxxx
            13-14 z: zqzzzzzdztzzzmzz
            2-6 r: rmlbjrrbrc
            2-3 m: mwmm
            9-10 d: ddddddjddz
            15-18 p: pppppppzppppppzppj
            3-6 g: glfgdgfgbgdkg
            1-3 s: sdsblxzscp
            5-6 v: vvvvsv
            1-3 d: vdxdkd
            6-8 w: wkzwcwvwwwqwd
            9-10 h: hhhhhhhhwh
            9-12 b: bdbbbbbwbbmbbbb
            2-8 b: bbbbbbbcb
            2-9 v: nvtgsfvpv
            11-13 v: hvvgvvvvvvbvphlhnv
            6-7 r: rrrrprr
            10-16 w: wlxptrzwmwxhspcww
            5-7 f: ffpfshf
            3-6 t: rnttvx
            8-16 b: pvlbtnfbvspdhtkk
            1-4 v: vlvd
            4-17 l: qflfllkllplllllkl
            1-3 s: psswjplkhvxssftnpl
            6-11 t: tthmbtwkfct
            11-17 w: wwwwjwdtwcnwwwxkx
            9-11 s: sssssssslsss
            8-10 n: nnnnnpnwnnnvw
            12-13 m: mmmmmmmmmmmnpmm
            14-17 w: xbswvmsflkmqlpkxwm
            1-3 w: mzww
            5-6 g: ggggdw
            1-15 r: rslcrjzhrjdpwqm
            7-12 g: ggdgfggdzlxfkg
            2-11 x: cpsxxkxxqhsxdxxjkgbt
            7-8 w: wdvhwwwp
            1-4 z: zmfzllxnrnlw
            9-10 b: rkbbbbksbpdsbcm
            1-8 h: sqdmcjpw
            2-6 x: pxxvrx
            5-6 x: xjshxxqt
            1-13 b: fbbbbbbbbbbbbbb
            11-13 t: bwhtttdvtbtkw
            2-6 j: rjrggj
            5-6 v: fvvvwvtv
            10-15 s: ssdsstswssssssc
            2-6 h: hnqzhlclp
            8-12 t: pjztttrjtvttt
            5-6 g: gwxrggtmg
            1-8 z: kzzzzzzvz
            10-15 p: pppppppppvpppppp
            3-4 g: ngxdgg
            2-5 x: xcxxnbwh
            3-10 s: sgkghshxdssws
            1-2 s: pssldmf
            2-5 m: jmxmm
            5-6 n: pnsjqnnn
            13-17 t: ttxslvttlnttrdwtt
            1-6 n: nnpnsn
            3-20 m: mmmmmwjmmmmmtmmvmmmm
            15-17 s: ssszsslsssszssssss
            5-8 s: hsgzspsk
            7-8 c: ccccccchc
            14-17 l: llllllllllllllllk
            7-14 p: xjbxdpkbgcpbfpptfx
            5-6 s: sghmss
            4-6 s: ssssss
            1-2 c: kcwpwc
            5-6 m: mmmqtmt
            1-9 l: glllllllslllll
            3-4 r: rrcr
            6-9 r: rpcbrrrrdvrrwf
            3-7 l: wglsfjtwlldg
            6-9 g: gggbgggxw
            9-10 j: jjjjjjjjrjjjjjjjjjj
            4-14 p: vbppfpncsmhctp
            10-13 k: kkkkkkkkkkkkkkkkk
            3-5 p: dnlpp
            11-15 f: fsffzftkfqflnflf
            9-11 q: bqdqcqqqqgffqfqmrqlq
            1-10 l: lszxlhdkgtprglxxl
            16-18 l: sllllllmlllllllllwl
            4-7 b: brblbbbtbj
            3-6 n: rhnntq
            7-9 k: kjnkjpbkkkkvkjm
            11-12 g: kvjpqmhcgbrl
            3-12 h: khhhvhhmchhgfh
            3-4 r: xmpr
            3-7 m: mmlmmmmhm
            7-16 m: mmmlmmlmmmmmmmmmmm
            3-4 b: sdbbbr
            14-19 k: hkkkkkjclkgmzvgkkkk
            12-14 w: ssqgwwcxcqwwww
            2-3 k: lkkr
            1-7 t: wtttttlt
            4-8 d: wdjnqgdf
            8-9 j: jjsjwjjlj
            4-7 h: hnhphxhhhq
            2-5 d: qdjgqdb
            3-5 w: wpwzwdm
            3-12 n: pnnngxnjqjhpcntfrvz
            10-15 h: hhhhhvhhhhhhhhg
            4-6 s: dwrsksjhtsrjdvmbsbwr
            8-11 v: vvvvvvvcvvvvvv
            4-5 m: lnmlmmwsmfsm
            7-16 c: kvzcrcbcvkcpptdccq
            2-3 b: bnbbpjp
            3-5 m: hpjkrmmlwq
            3-7 v: vvvnlhn
            3-4 b: bnbbb
            3-6 d: tkdktrctmjw
            3-5 f: pffffj
            6-10 t: ltrgjvjthtpttphrttk
            3-8 s: ssrkstfgssxxxc
            1-2 d: sdhkcfdcdg
            6-12 h: shhhhhzzzhfh
            4-7 j: jjkzgrj
            13-15 l: llltlwlllllqzlbldl
            5-9 d: dzxjdrftsprbldvddk
            4-14 q: wqsqqxtbfnckzqcqqqq
            1-2 v: lvdxdwpphqv
            5-6 z: zpzhzjzqtzh
            3-4 q: qqqlq
            9-10 v: svvvhvvvtv
            3-12 g: kjgmbzgklwfb
            10-15 v: vvddvvvrhvvmvwvvv
            1-20 j: kjjjjjjjjkjjpjjjjjjj
            6-8 t: tttttdtt
            11-12 v: vvvvvqvvqvxvvv
            12-13 h: hnhshhhhshhhh
            7-8 z: vzzzzzrzzzfpz
            7-8 x: xkxhxxhn
            4-7 b: hbbzptb
            5-9 d: fddqjsdbj
            3-10 l: llllllglxslll
            1-9 b: dbsbbbbgbb
            5-8 n: dtnnsnnnn
            7-16 m: mmmmmmmmmmmmmmmsm
            3-4 f: nhwk
            15-17 w: wwfwwxwmwwwwwdswwwww
            1-11 l: llllllllllll
            4-9 c: cccccccchcc
            2-3 k: kkkkbskk
            3-6 s: nssqtf
            4-5 m: mmrhm
            9-11 f: nfnsrfdfnfff
            15-16 k: kkkkkkkkkkkkkkzhk
            6-9 q: tzqqxqhnq
            3-11 k: kkkkkkkkkkck
            2-5 p: wmpgpmjmrqg
            15-19 r: rrrrrsrrrrrrhfrrjrr
            4-10 l: lllsldllll
            4-7 s: sjhzqns
            1-3 n: nnknnp
            13-14 j: hjjgxjzjvjpxjj
            4-5 r: rrrgrrrrr
            10-11 p: ppptphpxkpppp
            2-7 j: fjsnxwpjgqnzjjj
            6-8 k: kdkkwnvkkkk
            2-5 q: qdqqjqqwq
            5-7 x: xdxddbcxvnxxxxhxxxq
            2-6 n: cnqlmrlwqhdbbvbnhskh
            7-8 z: zzzzzzzwz
            6-8 r: llrrtzrpr
            1-7 d: ddlddvmkddjpd
            8-9 v: vvvvvvvrkv
            18-19 t: vtststttfmtqtmttdnz
            3-9 b: nbwbzntrb
            3-4 r: pzrrqqrj
            5-9 x: bvxxllwcf
            4-6 f: fxmlxf
            11-15 n: nnqnwnnnwnknnnnnfnn
            9-11 n: nnnnqnnnnnj
            7-12 k: kkkkkvjkkksskrkkk
            2-3 b: cbbvbv
            3-6 x: xxfldxxxc
            6-11 k: fkvvkkwkvkpjkjk
            10-16 f: ffffffmffffffffffff
            7-8 p: fppplpnc
            11-20 r: srrrfrrrrrrrrhrrbrrr
            13-17 s: smssssssssssssssb
            5-8 q: fcqlqqqq
            6-10 g: rmpsgrlxcvgtggwgvk
            13-15 h: hhhhhhhhhcmfhhldhzh
            5-10 q: qqqqjqqqqqcq
            5-9 m: lmvcmmsznmmgmmmcs
            5-6 h: hhhbzr
            3-4 d: dzdg
            11-14 h: rfvjnjbzvrhthdxhv
            14-19 g: ggggggggggggggggggcg
            6-7 m: mmmmmphg
            13-14 p: ftzfrppkzrrpgp
            12-16 n: lxnnnnnngnnbnncnn
            8-9 c: dqgzbncfccrjtdkc
            6-9 r: jdrrfrtkmkfltkm
            4-6 g: dnggrr
            3-4 s: ssssvs
            18-19 f: wffffffffsffffffffvf
            6-10 l: klllbxltll
            6-7 r: rbdgrrr
            17-18 l: vjplzpcftlkrllsbqlqg
            3-9 n: bqnnnnrbxkdsdwnvtwwh
            1-2 w: qwwt
            5-18 z: zzzzzzzzzzzzzzzzzlz
            2-7 n: nbnnnnnnn
            14-15 g: mcdcmxpxmgkqdhm
            18-19 s: gsssssssssswssssssss
            5-6 s: tptssvs
            8-12 c: cccnbcccmcctclccccx
            6-15 t: tttttttttmttstf
            5-6 l: lllklq
            7-9 d: dqdcdcddxcddmdkrd
            4-5 r: rrvrxqnzrm
            9-11 p: pjpppppppppppppp
            4-6 v: vpvvvvv
            6-9 h: wwchhhgfh
            10-11 f: flfcjvtljftfffhff
            6-7 v: vvvvvvvv
            12-15 k: kjkkkktkkkkkzvn
            6-9 v: rsrvvgnwktwvvnvclvvc
            2-12 c: ccvqsctcwkmkqzc
            16-18 w: wwwwwwwwwwwwwwwwwwww
            17-18 g: ggzgggggggglggggsgg
            13-18 v: vvvvvnvvvgrvvkvtqv
            5-11 k: kkkkkkkkkkkkkkk
            11-12 f: ffffffffffvf
            1-7 h: rstpvhh
            11-14 l: lrnllwvlnflllfdfllt
            5-7 g: gcgjgrkgj
            7-18 z: zzzzzzgzztzzzzzzzxzz
            17-18 v: vvvvvvvvvvvvmvvvvvvv
            16-18 m: mmmmhmmmmmtmmmmvmx
            1-3 z: vzzzwz
            5-6 n: nnnhnq
            8-15 r: jsrprrrrmrrkgrkrr
            2-12 g: txwxcgwfqkfg
            9-15 l: ldlllllllllllll
            3-5 f: gfbsf
            15-16 v: vvhrnzxfvvvvcwjv
            4-15 c: cccmccccccccccccccc
            7-13 l: bwlzlxzllctjcf
            1-3 q: rsgtq
            4-9 n: npznnnvvnzg
            3-7 z: sqtczzfzzrzfz
            2-3 k: ckkrjnkglnz
            9-10 q: qqqqqqwqjqqfq
            4-11 v: vvvbvvvvvvnvvd
            5-7 n: lbwxnnnncnnwnv
            8-9 k: kgkkkkkjf
            7-9 l: llllllllll
            15-19 p: pppbpcppxcptppvmpppb
            3-4 m: fqmwcncsmp""";
    public static final String DAY_3_EXAMPLE = """
            ..##.......
            #...#...#..
            .#....#..#.
            ..#.#...#.#
            .#...##..#.
            ..#.##.....
            .#.#.#....#
            .#........#
            #.##...#...
            #...##....#
            .#..#...#.#""";
    public static final String DAY_3_INPUT = """
            .........#..##..#..#........#..
            #...#..#..#...##.....##.##.#...
            ....#..............#....#....#.
            #.#..#.....#...#.##..#.#.#.....
            ........#..#.#..#.......#......
            .#........#.#..###.#....#.#.#..
            ........#........#.......#.....
            ...##..#.#.#........##.........
            #.#.##..###............#...#...
            ............#....#.......###.##
            ....##....##..#........#......#
            ............#.#..........#.....
            #.#....#....##...#.....#.....#.
            ......#.#.#...#.....###....#..#
            ...........##..#.........#..#.#
            ..#..#.................#..#..#.
            .#....###...#.......#.........#
            #.#.#.#...#......#.......#...#.
            .......#.#.#...#..............#
            ...##.......#..##.#.......##...
            #.#.##....#..##..##..###...###.
            .#......##.##.#....#.##........
            ..###.............##..##..#....
            .....#.#...........#..##..##...
            .###.#.#......#.....#........##
            ...#.......#...##..#..#..#.....
            ..............#.#..##.##..##..#
            #..#.#......#............#.....
            ........#..#....#..............
            ...#...#..............#.#####..
            ...##......#........#.#...#....
            ..##......#............#..#..#.
            ....#.........#.#.#.....###.#..
            #....#........#........#....#.#
            .....#...#..##.....##...#.....#
            #...#.#.#...##..##.###.#.#.....
            ......#.#..........#...#.##....
            ..............##...#..#.......#
            ........##.....#.....#.#....#..
            ..............#..#..#...#.....#
            ##......##.......##...#.#....#.
            .....#.............#.#.........
            #.........##..#..#.........##..
            ..#..#.....#####.........##.#..
            .......##.#......#........#....
            #.................#.#...#....#.
            ...#........#.###.##.##.....#..
            #.....##..#...##.#.#......#....
            .....#..#.#..........##..#.##..
            ..###.............#..#..#...#..
            ...###..#...#.....##..........#
            #.......#.#...#....#..##..#..#.
            .#..#.........#..............#.
            ..######.....#....##......#....
            #..##...#......#..#.#....#.....
            .#...................#.#.....#.
            ..#...#.#..#.#......#..#...#..#
            ..##..##.#.##.........#.#.#....
            ...#...#...........#..##.##...#
            #...#....#....#....#..#.##..#..
            ..#.##....#....###..#..........
            #.#..##.#.#...##.#..#.##..#.#..
            #......##...#.#..........#..#..
            #.#...#..#...#.#.#..#........#.
            #.#.##.#..#...#..#.#.##........
            .....#......#........#..#......
            ...#....#.#....#...............
            ....#..###..#....#..#....#....#
            .#........###..........##.##.#.
            #.#......##....##...##.#......#
            #..##.##...#...........##.#.#..
            .#.....#.#...#.................
            ##..........#..#....#.....#...#
            ....#.#..........##..#.....#.##
            #.#..#..#..##..........#.......
            ..#.#.###......................
            ......##..##.....#..##.##....#.
            ...#.......#.##....#......#....
            ...#...#........#...#.#...#..##
            ##...#....#.#...#.#.##..##...#.
            ...#.....#...#...#....###.#..#.
            ..#.#..#........#......#..##..#
            ...#......#...#.#.##...##.#.#.#
            ....#.#....#....#.....#.....##.
            .....#.#..##.#....##....##.....
            .#...###..#.....#............#.
            #..#.#.#..#..#...#....#...#....
            #.....#..#...#................#
            ..........#..#.......#......#.#
            ...#..#......#...#......#......
            .#.#.....#.#.#.#......#..#..#..
            .....#.........#.#.#.....##.#..
            .....#.#.....#..#..#..#.....###
            ##....#......##....##.#....#.#.
            #####........#..........##.....
            .#...##...#...#.......#....#...
            #.#.##...##...##..##........#..
            #.#..............#.#...#...###.
            ...#.....##..#.........#....#.#
            #.#....#....#..##.#..#...#.....
            ..#....#.#..#...#...##.....#...
            ....#...#......................
            ..#...#.......#..#...##....#...
            .#........#...#.....##.##...#..
            #......#..............#..#..#..
            ...........#.#..#.#.#....#....#
            .##..##.......#...#..#.....#..#
            ...#.........#.........###..#..
            ...#.##....#....#.....#.....#..
            .#.#.#.........#.#.#....#....#.
            ...#..........##..#....#.#.....
            ...#....##................#....
            #....##..#..#........##...#....
            #...#...##.#............#....#.
            ##..#....#...#...............#.
            ..........#.#...#..##..#.#.....
            ..##...##..#....#.#......#.....
            .......#......#.#.....#.....##.
            #...###.....##..##....#.#....#.
            .###......#.....#.#............
            #.....#.....####.##....#..#....
            ......###.............#......##
            .........##.......##..#..#..#..
            .#.......#....#...#...#.#......
            #...#..#...#........#...##..#..
            .#....#........#.........##..#.
            ..............##.#...##..#.##.#
            .#....#...#....#......#..#.....
            #....##.#...#.#.....###..#....#
            #.......##.#..###..............
            #..#..#..#......#.#..#...#..#.#
            .......#.#.#..#..#...#..#......
            .#..#......#.....#......##..##.
            ....#....#.......#.......#.#.##
            .......#.#................#...#
            #.#.....#.......#.#........#...
            .....#....##...#......#.....##.
            .#......#.#...#..#....#....#.##
            ##...#.###.#....#..#....#.#...#
            ....#.##..##.#.............#...
            #..#.............##.......#.#..
            ##.#..#..#.#...........###...##
            .#.#.....#......###........#...
            #.#...#.#....##......#.#....#..
            #.........#..........#.........
            .......#....#...#..#.....#...##
            .......................#...#..#
            .###...........##...#........##
            #.#....######.#........#..##.#.
            ..#.##.#...#.#.......#.##.##..#
            #.............###..#.##.#......
            ...#..##......#...#..###.....#.
            ..........#.....#..#...##..#...
            ..##..........#.#..#.....#...#.
            ...#.......#.....##.........#..
            #..#.#...#..#...###...#...#.#..
            #.##....#..#.#.......#..#..#...
            ..#.##.#......#.#......#....#..
            ..........#...##.....###.......
            ...#...##..#......#...##.......
            ....#........#.#.......#..###..
            .....#.#..........##.#..#..#.#.
            .............##.....#.#..##....
            ...#...............##...#......
            ....#......#..#....#...##..#...
            .##.#....#.#.....#.#.........#.
            .....#.###....#..###..#.#.....#
            .#.........##.........##...#...
            ..#.....###....##..........#..#
            ........#..#.#.#..#.......#..##
            ..#.#..#.#............#.##.#..#
            .#....#.....#..#...#.......##..
            .#...........#.#..#..###.###...
            ..#.....#..#........#.#........
            .#........##........#..#.##....
            ......#.....##........##..#....
            .#..................##....#.#..
            .#..#.#..#.#...#........#......
            ...#..##.#......#..#..........#
            ....#.##...#....##.............
            #....#.##....##.###..#..#..#...
            ..........#..#...##.##....#..#.
            .###.#.....#...#...#...#.......
            ............#...............#.#
            #....#...#......#....#.#.#.#.##
            ...#..........#.#.#.....###....
            #.#...##...#..#.....###...#....
            ......#...#..#..#..#.##...##...
            ...#..#.#....#...#.#.........##
            ##....#..###.#.##.....##.......
            ..#.#...#..##.......#.#.......#
            ##......#...........#......#...
            .......#..###....###..##.#...##
            .........#.....#..#.......##..#
            .......#.##..#....#...#.#...#..
            #..#.#..................##.#..#
            ...#..#..#.....#..#........#...
            ...#.#..###..#.....##...#....#.
            ..#..#......#...........#...#..
            #...##.##..###.......##........
            .#.....#..#....#.....#.##....#.
            #..#........#.#....#..#...#.###
            ..#...#.#.#.....#.....#..#.....
            .##.............#.#......##...#
            .#....#####............#.....##
            #.###.......#.#...##.....#.....
            ......#.##..#...#..#..##.#..##.
            ......#.#...##.....#...#....##.
            ....#............#...#...#....#
            .........##.#.#....#....#....##
            .#...##.#...#.......#.##....#.#
            #....#.#...#.#...#.#.#...#.....
            .#.#.........##..#..#..........
            .#.........#.#.....#..#.#..###.
            ....##.#.#..........#..####....
            ....#..#.#.#...#...#..#....#...
            ..#.#...#...##.......#.#.#..#..
            ...##...#......#.....#.#...#..#
            ......#.###.#.......##...#...#.
            .....#.#.#......##..........###
            ##.#.#.#..#....#...............
            .#.#.##.......#....#.#.....#..#
            .........#...#.#..#.......#....
            ....#.####.#......#...#...##...
            #..#..#..#..#....#...##.....##.
            ......####.#..##..#.....##.....
            ##.#.........#........#..#.#...
            .#.#....#....#.......#.#....##.
            ....#....#.......##..#.....#...
            .#......#..#....#.#............
            #..#.#.##.....#..#.#.#.#.#.##..
            .#.....#.....#...#..#.#...#.#..
            .#.#.##............#.#.#.#.#.#.
            .##..........#.....#...###.....
            #.#...#...#................#.#.
            ##...#.##.....#.....#.#.##.....
            ####.....##..........#......#..
            #.............#..............#.
            .###....#.#...#..#..#..#.......
            ..#.#.....#...#..#..####.......
            ...#.#..#........#..##..#..#.##
            .#........#..........#.#...##..
            .#.......#.#.#..#...#..#.#...##
            .#.....##......##..............
            ......#..#.#.##...##.#.....#...
            .........#.#...##.....##....#.#
            .....##...#........#..#.#..#.#.
            .#.##..#.....##...#...###.#.#..
            ...##...#...#..#.#..#..........
            ##..............#...#...#.#..#.
            ......#..#......#..#.....#...#.
            .......#...#..#....#.....#.....
            ..##.....##..#.#........#......
            .###.#...#.....................
            ..#...#.................#...#..
            #..#.##...####.............#...
            .##....#..####.......#.........
            #..#...###...#...#..#..##......
            ....#.##.#.#.........#.....#..#
            .....#...#.....#.#.#.##.#...##.
            .............#........#.....#..
            ...##.###.#....##.......#..#...
            #..#....#....#.#............#..
            .........#.##........##.....#..
            .........#.#.#..#..#.......#...
            .......#.#..#.......#.....#.#..
            ##.#.....##...##.....#.#.......
            .#.#.#......##.##.#.........#..
            ..#.##..###.....###.........##.
            .#......#..#..##...#.#...##.#.#
            ......#.#............#.....#...
            ###.#..#..#..#..#.##...#.......
            .#.#.##..###....#......##..###.
            #...#.#.#..#..#..##.#.##....#..
            ..#...#...####...#......####.##
            ..##.#.####........#..#......#.
            .#..#.......#...#.#.........#..
            ........#.#....#..#####..#.....
            .#...........#..#..#..#...#....
            ....#....#...#.................
            ....##..#....##....#..#....#.##
            ....#.##.....###...#...##.##...
            ......##.#..##.#.#.#....#.#.#..
            ##.#...###....#.#..#.#.###....#
            ......###..#..#..........##...#
            ..........#.##...##..#....##.#.
            .#...#.#..#.#.#..#.....#.......
            .#....#..#.#..#.#...##.#.#.....
            .##.....#...#..##.#........#...
            ....#......#.........#....#..##
            .#..#.#.#.#..#..#.#.........#..
            .........#.....#...#....#......
            #..#..#........#...#.#.........
            ...#.#.#...##.#.#...#..#......#
            #.#.#.#........#...#..#.....#..
            .###..#..#..###..#..#..........
            .....#......#.#..#...#.......#.
            ##.##.........#.......##.......
            #...##.......#..#.#.......#....
            #..#..#.....#...#......#.......
            .#..#..#.##....#.#..#...#...#..
            .#...#.....#..#.........#..#...
            ...#.#.#.......#....#..##.....#
            .........#..##.#..#..#.#.......
            #.##.....##..###..#..#..#.##...
            ........#......#...##...###..##
            .##....##..#..#..###......#....
            ............##......#...#..##..
            ...##.......#......#...##.##..#
            ...#..#..#.#...####.#.......#..
            ..#.##..#....#......#.#.....#..
            ..#.##..............#..##.....#
            .....##....#......#....#......#
            ......#..#......#.........#..#.
            ...#.##.###...###..#.##........
            ..........####.#.##.....#..#.##
            #...##...........#...........##
            #.#..#.#....#.#..#....##......#
            .......#...#.....#......#.#.##.
            ....#.##..##..........#..#.....
            #.#.#...#......#...#.....#.##.#
            ........#.......#..##.....##...
            .....####.#....#.#.............""";
    public static final String DAY_4_EXAMPLE = """
            ecl:gry pid:860033327 eyr:2020 hcl:#fffffd
            byr:1937 iyr:2017 cid:147 hgt:183cm
                        
            iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884
            hcl:#cfa07d byr:1929
                        
            hcl:#ae17e1 iyr:2013
            eyr:2024
            ecl:brn pid:760753108 byr:1931
            hgt:179cm
                        
            hcl:#cfa07d eyr:2025 pid:166559648
            iyr:2011 ecl:brn hgt:59in""";
    public static final String DAY_4_INPUT = """
            byr:1971
            eyr:2039
            hgt:172in pid:170cm hcl:17106b iyr:2012 ecl:gry
            cid:339
                        
            hgt:161cm eyr:2027
            ecl:grn iyr:2011 hcl:#a97842 byr:1977 pid:910468396
                        
            cid:257
            ecl:gry hgt:186cm iyr:2012
            byr:1941
            eyr:2029
            pid:108935675
            hcl:#cfa07d
                        
            hgt:165in
            hcl:#cfa07d eyr:2035 pid:82570731
            byr:1973
            cid:74 ecl:xry
                        
            eyr:2020 cid:105 iyr:2012 pid:947726115
            hcl:#ceb3a1 ecl:grn byr:1966 hgt:151cm
                        
            hcl:#888785 eyr:2027 ecl:hzl byr:1966
            pid:853607760
            iyr:2012
            hgt:155cm
                        
            hgt:61cm
            iyr:2019
            byr:1952 pid:#1468e6 eyr:2033 ecl:#7d39d5 hcl:z
                        
            pid:2306523501
            eyr:2032 hcl:z ecl:brn
            cid:266 hgt:151in iyr:2024
            byr:2008
                        
            hcl:#a97842 hgt:191cm eyr:2025 ecl:gry byr:1923 pid:574171850 iyr:2019
                        
            hgt:140
            iyr:1987 byr:2003
            eyr:2013 cid:242 hcl:z
            ecl:#19177c pid:150cm
                        
            byr:1959
            hgt:169cm hcl:#7d3b0c ecl:gry eyr:2028 cid:107 pid:584790749
                        
            byr:1955
            cid:309
            hcl:#a97842
            pid:740105085 iyr:2020
            hgt:188cm ecl:oth eyr:2029
                        
            iyr:2016 hcl:#cfa07d eyr:2026
            hgt:151cm
            pid:394185014 ecl:grn byr:1974
                        
            pid:226566060 ecl:blu cid:272 hgt:188cm hcl:#efcc98
            eyr:2029 iyr:2014
            byr:1956
                        
            pid:#7c7a9d ecl:#8fa327
            eyr:2006 iyr:2022
            hcl:#7d3b0c hgt:169
            byr:2025
                        
            hgt:188in byr:2015 ecl:xry
            iyr:1975
            eyr:1928
            pid:8939875193 hcl:7bbcce
                        
            hgt:193cm
            eyr:2029
            pid:141707808 byr:1997
            cid:83 iyr:2019
            ecl:hzl hcl:#cfa07d
                        
            iyr:2019
            pid:681586971
            hcl:#6b5442 hgt:165cm
            eyr:2022 ecl:brn byr:1985
                        
            byr:1970
            iyr:2016 hgt:156in pid:#e32394 eyr:2024
            hcl:#efcc98 ecl:grt
                        
            iyr:2013
            ecl:grn pid:341584587 eyr:2027 hgt:185cm hcl:#18171d
            byr:1935
            cid:113
                        
            hcl:#fffffd ecl:grn iyr:2010
            pid:738986504 hgt:98 eyr:2024
            byr:1968
                        
            pid:175337478 ecl:oth hgt:173cm hcl:#733820
            eyr:2025 byr:1960
            cid:283 iyr:2018
                        
            byr:1959
            hcl:#341e13 eyr:2023
            pid:566612260 hgt:176cm
            iyr:2017 ecl:grn
                        
            cid:321 pid:355095309 byr:1945
            hgt:161cm
            eyr:2029 iyr:2017
            ecl:brn hcl:#733820
                        
            hcl:#c0946f pid:75316487 iyr:2013 cid:201 hgt:152cm ecl:lzr byr:1996 eyr:1928
                        
            hgt:160cm iyr:2010 hcl:#a018b9
            eyr:2024 ecl:amb
            cid:347
                        
            eyr:2021
            pid:893047101 iyr:2016 ecl:hzl hcl:#866857 byr:1988
            hgt:166cm
                        
            hcl:#7d3b0c
            ecl:blu pid:085336099 eyr:2024
            iyr:2019 hgt:178cm byr:1999
                        
            ecl:grt iyr:2022
            hcl:z
            hgt:192cm byr:2010
                        
            pid:677187953 eyr:2025 iyr:2020 hgt:163cm byr:1957 ecl:grn hcl:#cfa07d
                        
            cid:213
            byr:1987
            pid:113078018 ecl:blu iyr:2013 eyr:2022
            hcl:#7d3b0c hgt:157cm
                        
            ecl:blu hcl:#c0946f hgt:186cm
            byr:1992 eyr:2028 iyr:2010
                        
            pid:#b01156 hgt:67
            byr:2014 ecl:#35dca0 eyr:1922 hcl:790130
                        
            hcl:#602927
            ecl:blu hgt:173cm byr:1974 pid:116377061 cid:294 eyr:2030 iyr:2010
                        
            hgt:151cm eyr:2022 iyr:2011 ecl:blu byr:1987 hcl:#733820
            pid:#b90d2e
                        
            cid:188
            byr:1990
            hcl:#602927 iyr:2026
            pid:530373696
            hgt:154cm ecl:gry
            eyr:2029
                        
            hgt:178cm eyr:2027
            hcl:#733820
            ecl:grn iyr:2014 pid:575371227 byr:1965
                        
            hcl:#fffffd iyr:2020
            hgt:185cm ecl:amb pid:692760311
            byr:1961
                        
            byr:1967 pid:397518948 ecl:lzr iyr:2015 hcl:#cfa07d cid:328
            hgt:177cm eyr:2035
                        
            hcl:#8e1608
            pid:554618249 iyr:2010 hgt:176cm cid:220
            ecl:brn byr:1928 eyr:2029
                        
            eyr:2030
            ecl:oth cid:177 hcl:#602927
            iyr:2010 hgt:66in
            pid:915661465 byr:1992
                        
            ecl:brn pid:558826437 hgt:151cm byr:1936 hcl:#fffffd
            eyr:2021 iyr:2012
                        
            eyr:2033
            iyr:2019 hgt:190cm byr:1953
            hcl:#6b5442
            pid:584941735 ecl:hzl
                        
            hgt:71cm
            byr:2015 iyr:2025
            ecl:#663b65 eyr:2039 hcl:z pid:62548949
                        
            ecl:hzl byr:1943
            iyr:2020 hgt:175cm pid:830628564 hcl:#7d3b0c eyr:2021
                        
            hgt:182cm byr:1951 cid:175 eyr:2021 pid:635966127 ecl:blu iyr:2014 hcl:#18171d
                        
            hcl:#733820 iyr:2011 pid:581100835 eyr:2022 ecl:grn byr:1985 hgt:192cm
                        
            iyr:2013
            ecl:grn
            hgt:185cm hcl:#a97842 byr:1981 eyr:2029 pid:711625030
                        
            byr:1995
            pid:326992839
            iyr:2015
            eyr:2028 hcl:#733820 ecl:hzl
                        
            hgt:160
            eyr:2037 ecl:#6b6b83
            cid:123 iyr:2028
            pid:7692333345
            hcl:z byr:2029
                        
            hcl:#6b5442 iyr:2030
            hgt:165cm byr:2028 ecl:#21516d
            eyr:2039
            pid:182cm
                        
            hgt:159cm iyr:2018 pid:610521467 eyr:2028 ecl:amb byr:1934 hcl:#602927
                        
            ecl:blu
            hcl:#09d9a5 hgt:162cm iyr:2020
            eyr:2025 byr:1971 pid:406714780
                        
            hgt:179cm eyr:2022 hcl:#18171d
            ecl:blu pid:314891131 iyr:2015
            byr:2002
                        
            hcl:#623a2f hgt:181cm pid:442693333 byr:1990 ecl:grn eyr:2027
            iyr:2011
                        
            iyr:2022 eyr:1939
            pid:557187110 hcl:#18171d hgt:60cm ecl:#d6ac04 byr:1984
                        
            ecl:grn byr:1948 hgt:174cm pid:438876745 cid:321
            iyr:2018
            hcl:#866857 eyr:2023
                        
            hgt:189cm iyr:2012 hcl:#602927 pid:978388052 ecl:brn
            eyr:2030
                        
            ecl:amb cid:235
            byr:1938
            pid:315825546 hcl:#ceb3a1 eyr:2029
            iyr:2013 hgt:171cm
                        
            ecl:dne hcl:z
            hgt:76cm byr:2010
            cid:185 eyr:2001
                        
            hcl:#733820 byr:1988 pid:558453117
            hgt:66in
            ecl:oth iyr:2010 eyr:2021
                        
            byr:1926 pid:796557821 cid:155 hcl:#efcc98
            hgt:159cm eyr:2023 ecl:oth iyr:2016
                        
            byr:2023 eyr:2031 hcl:0ba99a pid:14902250
            hgt:132 ecl:#9b89b1 iyr:2017
                        
            hcl:#a97842 byr:1926
            cid:205
            ecl:blu
            iyr:2016 hgt:159cm eyr:2029
                        
            byr:1939 hcl:#866857
            pid:025607627 hgt:174cm cid:309 eyr:2026 ecl:brn
                        
            ecl:hzl pid:805133506
            iyr:2014
            byr:1991
            hcl:#cfa07d
            cid:350
            hgt:190cm
                        
            hgt:155cm byr:1941 eyr:2024
            cid:164 hcl:#602927 iyr:2013 pid:531781358 ecl:amb
                        
            hcl:#72a068 hgt:164cm
            pid:621006770
            ecl:brn
            eyr:2029 byr:1969
                        
            byr:1991
            ecl:grn iyr:2020
            pid:9921729009 eyr:2029 hcl:#623a2f
            hgt:62in
                        
            iyr:2017 ecl:hzl
            pid:768217275 eyr:2020 byr:1937
            hcl:#866857 hgt:157cm
                        
            cid:270 byr:1993 hcl:#733820 ecl:hzl pid:722650020
            hgt:174cm iyr:2010
            eyr:2021
                        
            hcl:#c0946f ecl:blu
            hgt:154cm
            eyr:2022 byr:1929 pid:357023679 iyr:2010
                        
            ecl:hzl
            iyr:2013 hgt:165cm byr:1979 eyr:2023 hcl:#733820 pid:008734536
                        
            hcl:#341e13
            eyr:2030 byr:1993
            iyr:2014 hgt:193cm
            cid:346
            ecl:blu pid:536339538
                        
            eyr:2030
            ecl:hzl
            cid:296 pid:660062554 hcl:#efcc98
            byr:1977 hgt:179cm
            iyr:2010
                        
            cid:119 pid:498520651 hgt:159cm
            eyr:2029 iyr:2015 hcl:#18171d
            ecl:gmt
            byr:1950
                        
            eyr:2025 iyr:2010 hcl:#efcc98 pid:196372989 hgt:181cm byr:1952 ecl:oth
                        
            cid:317
            eyr:2026 ecl:blu hcl:#733820
            hgt:184cm
            pid:549730813 byr:1927 iyr:2018
                        
            pid:591769824
            hgt:180cm
            byr:1920
            ecl:blu
            eyr:2021 hcl:#cfa07d iyr:2017
                        
            pid:988946348 hgt:183cm cid:117 byr:1955 ecl:blu
            iyr:2015 hcl:#623a2f eyr:2029
                        
            iyr:2014
            eyr:2026 hgt:184cm
            ecl:oth
            hcl:#7d3b0c pid:252101860
                        
            byr:1995
            hgt:182cm ecl:brn hcl:#6b5442
            iyr:2012 eyr:2028 pid:482757872
                        
            iyr:2017 cid:333 ecl:gry hcl:#623a2f hgt:157cm eyr:2021
            pid:487895819
            byr:1951
                        
            hcl:#fffffd
            hgt:193cm eyr:2025 byr:1927 iyr:2014 ecl:oth pid:989206297
                        
            eyr:2030 ecl:brn hcl:#18171d hgt:193cm
            iyr:2013 byr:1953 pid:862636088
                        
            hcl:#fffffd
            pid:204286737 ecl:gry byr:1923
            hgt:181cm
            iyr:2015
            eyr:2023
                        
            cid:288 pid:413935643 ecl:gry
            iyr:2012
            hgt:171cm
            hcl:#623a2f
            eyr:2020 byr:1943
                        
            byr:2023 hcl:#c0946f
            ecl:oth
            pid:182634296 eyr:2009
            cid:306 hgt:183cm
            iyr:2029
                        
            eyr:2026 ecl:hzl byr:2003
            iyr:2027 pid:734296691 hgt:188cm hcl:#fffffd
                        
            hcl:#18171d ecl:gry pid:401957684 eyr:2020
            iyr:2017 cid:141 byr:1944 hgt:74in
                        
            ecl:grn hcl:z
            pid:335097003 byr:1925
            hgt:170in iyr:2020 eyr:2022
                        
            pid:727198487
            hgt:173cm
            cid:323 hcl:#18171d iyr:2012 eyr:2024
            byr:1995 ecl:blu
                        
            ecl:amb hcl:#602927
            pid:460274414
            hgt:76in byr:1995
            iyr:2020
            eyr:2028
                        
            byr:2002 ecl:oth pid:101164770
            hgt:172cm hcl:#fffffd eyr:2023 iyr:2016
                        
            ecl:blu hcl:#888785 iyr:2016 pid:031162631 eyr:2025 hgt:186cm
            byr:1959
                        
            ecl:blu pid:093242619 hgt:188cm byr:1970
            eyr:2025
            hcl:#6b5442
            iyr:2020
                        
            byr:1990 eyr:2025 ecl:grn
            pid:907309460
            iyr:2011 hcl:#602927 hgt:62in
                        
            pid:346468647 eyr:2021
            ecl:oth hgt:169cm
            iyr:2010 cid:233
            hcl:#b6652a byr:1977
                        
            pid:904834317 iyr:2011
            hcl:#b6652a eyr:2028 cid:281
            byr:1944 hgt:187cm ecl:gry
                        
            eyr:1988 pid:663941602
            hgt:156in
            hcl:#fa2e93 iyr:2015 ecl:gry byr:1953
                        
            hgt:184cm cid:107 pid:094829817
            ecl:gry byr:1998 eyr:2023 iyr:2017
                        
            eyr:2020 ecl:gry byr:1955 hcl:#a97842 pid:553841536
                        
            hgt:185cm eyr:2022 hcl:#341e13 ecl:oth byr:1934 pid:863541754 cid:178
            iyr:2016
                        
            eyr:2029 iyr:2014 byr:1937 cid:232 hgt:177cm hcl:#fffffd ecl:blu
            pid:076753558
                        
            hcl:#cfa07d
            hgt:168cm
            ecl:grn
            pid:664159349 eyr:2028 iyr:2017 byr:1972
                        
            hcl:#a97842
            byr:1987
            eyr:2020 hgt:182cm
            iyr:2018
            ecl:brn pid:560272731
                        
            hgt:172cm cid:125 ecl:blu pid:291640184
            byr:1926
            iyr:2014 hcl:#ceb3a1
                        
            iyr:2027 hgt:84 hcl:z
            ecl:#b68fec
            pid:809408661
            byr:2018 eyr:1927 cid:87
                        
            pid:951007276 cid:260 eyr:2025
            ecl:brn iyr:2015 byr:1957
            hcl:#4b8216 hgt:161cm
                        
            pid:359973697 hcl:#6b5442
            eyr:2022 hgt:169cm
            byr:1965 ecl:brn iyr:2013
                        
            iyr:2012 hgt:65in eyr:2024 pid:842371195
            ecl:amb
            hcl:#341e13 byr:2000
                        
            ecl:hzl hgt:170cm byr:1950
            cid:289 eyr:2037 iyr:2021 hcl:#18171d pid:389051819
                        
            hgt:159cm
            ecl:amb hcl:#c0946f eyr:2020 pid:010539976 iyr:2011 byr:1921
                        
            hgt:176cm cid:270 pid:838338992
            eyr:2024 hcl:#866857
            ecl:amb iyr:2015 byr:1982
                        
            ecl:blu
            cid:246 hgt:185cm
            byr:1987
            hcl:#fffffd pid:042361456 eyr:2022
            iyr:2010
                        
            hgt:164cm
            pid:881486702 ecl:brn byr:1969 hcl:#c0946f
            iyr:2010 eyr:2030
                        
            iyr:2019 hcl:#6b5442 hgt:167cm
            ecl:amb
            cid:207 byr:1922
            eyr:2025 pid:343956182
                        
            ecl:oth iyr:2012
            hgt:158cm
            eyr:2024 hcl:#602927 byr:1964
                        
            byr:1988 pid:030965463 hgt:154cm
            ecl:gry eyr:2020 cid:227
            iyr:2012
            hcl:#3edc53
                        
            hgt:178cm hcl:#c0946f byr:1945 ecl:amb eyr:2030
                        
            hgt:158cm pid:270264980 eyr:2027 iyr:2016 byr:1928 cid:259
            ecl:gry hcl:#733820
                        
            byr:2026 hgt:164in cid:235 ecl:xry
            hcl:z pid:2517730699
            eyr:2033 iyr:2024
                        
            ecl:grn hgt:69cm pid:1321222581 byr:1987
            eyr:2035
            iyr:2018 hcl:#fffffd
                        
            hcl:#733820 cid:244
            ecl:gry iyr:2013 eyr:2028
            pid:794178180 hgt:74in byr:1923
                        
            hcl:#a97842 byr:1934 ecl:hzl eyr:2027
            pid:401882857
            iyr:2018 hgt:185cm
                        
            iyr:2018
            pid:665564950 byr:1990 ecl:hzl
            hgt:154cm
            eyr:2026 hcl:#623a2f
                        
            hcl:#602927 cid:189 byr:1967 pid:332861702 eyr:2021
            hgt:163cm
            ecl:amb
                        
            ecl:grn pid:734161280 hgt:184cm
            iyr:2018 eyr:2020 byr:1929 hcl:#a97842
                        
            iyr:2018 byr:1925
            eyr:2022 hgt:193cm ecl:hzl
            hcl:#341e13
            pid:008582320
                        
            byr:2025 ecl:dne hgt:167cm pid:48963526
            iyr:2025 hcl:z
            eyr:2034
                        
            hcl:#cfa07d ecl:hzl eyr:2029 cid:194 byr:1936
            iyr:2020
            hgt:186cm
            pid:328573727
                        
            iyr:2011 hgt:188cm pid:338435675 cid:326 ecl:gry
            eyr:2027
            hcl:#6b5442
            byr:1958
                        
            pid:165cm
            hgt:70 iyr:1996
            eyr:2034 cid:210 hcl:z ecl:#75606f byr:2027
                        
            hgt:180in hcl:#a0515a pid:#97a753
            byr:2026 iyr:2016
            eyr:1995
                        
            eyr:2020
            hcl:#18171d byr:1978 iyr:2012 hgt:68in
            ecl:amb cid:346 pid:332495922
                        
            ecl:blu hgt:61in pid:747650669
            byr:1961 eyr:2028
            iyr:2020
            hcl:#4992f2
                        
            byr:1958 iyr:2017 ecl:oth
            hgt:153cm
            hcl:#602927 eyr:2023 pid:108391213
                        
            byr:1976 eyr:2023 iyr:2015 hgt:177cm pid:391628371 hcl:#8069c4
            ecl:grn
                        
            pid:910402636 ecl:gry hgt:188cm byr:1924 hcl:#82dfdc eyr:2029
                        
            byr:1978 pid:302223240 iyr:2017
            hgt:174cm
            hcl:#6b6569 ecl:blu eyr:2027
                        
            cid:135
            byr:1995 iyr:2015 ecl:oth pid:054611703
            eyr:2023
            hcl:#7d3b0c hgt:75in
                        
            ecl:grn
            eyr:2020 hgt:184cm pid:444944678 iyr:2019 hcl:#efcc98
                        
            byr:1946
            hgt:70in eyr:2022 hcl:#6b5442 ecl:amb iyr:2018 pid:859762925
                        
            byr:1995 eyr:2022
            ecl:grn pid:575081777
            hcl:#341e13
            hgt:183in iyr:2018
                        
            eyr:2028 hgt:162cm byr:1989 hcl:#0bd11f
            iyr:2020 ecl:gry
            pid:073498924
                        
            iyr:2014
            pid:122787281 byr:1982 cid:138 eyr:2021 hcl:#866857 ecl:hzl hgt:184cm
                        
            cid:198 byr:2014
            pid:5529128129
            hgt:185in
            iyr:2025
            hcl:z
            eyr:2023
            ecl:gmt
                        
            eyr:2021 hgt:170cm
            cid:74
            iyr:2019 pid:943445928 byr:1980
            ecl:oth hcl:#ceb3a1
                        
            iyr:2020 eyr:2030 pid:201122734 cid:246 hgt:169cm ecl:grn hcl:#fffffd byr:1962
                        
            pid:025560194
            byr:1989
            hcl:#cfa07d hgt:182cm ecl:blu eyr:2025 iyr:2012
                        
            hgt:151cm
            hcl:#efcc98 ecl:blu
            byr:1983 eyr:2023 pid:814513328 iyr:2013 cid:73
                        
            byr:1961 pid:536384108 hgt:188cm ecl:amb iyr:2013 eyr:2027 hcl:#888785 cid:121
                        
            pid:364607819
            eyr:2024 ecl:amb hcl:#b6652a iyr:2016
            byr:2000 hgt:187cm
                        
            hcl:z eyr:1956 iyr:2028
            hgt:168cm cid:105
            byr:2026
            ecl:#5b17d3
                        
            cid:207 pid:913509058 ecl:brn byr:2001 eyr:2026
            hcl:#866857 iyr:2019
            hgt:180cm
                        
            pid:363979129
            eyr:2027 iyr:2013
            ecl:gry hcl:#866857 byr:1957 hgt:62in
                        
            byr:1932
            eyr:2027
            hgt:66in ecl:hzl hcl:#efcc98 pid:417620217 iyr:2013
                        
            iyr:2013 cid:331 hgt:192cm
            hcl:#d896d9 pid:795744816 byr:1935
                        
            byr:1960 hcl:#888785 hgt:176cm ecl:hzl pid:025206542
            iyr:2015 eyr:2030
                        
            ecl:oth hgt:182cm
            hcl:#341e13
            pid:526568190 iyr:2018 cid:280 byr:1997
            eyr:2028
                        
            hgt:186cm pid:273625601 byr:1993 iyr:2018 eyr:2021 hcl:#733820
            ecl:blu
                        
            hgt:74cm
            byr:1981 eyr:2024
            ecl:amb iyr:2012 pid:154027492 hcl:#733820
                        
            hcl:#a97842 pid:347084450 ecl:oth
            eyr:2030 hgt:176cm byr:1955 cid:229
            iyr:2013
                        
            hcl:#fffffd byr:1979 iyr:2017
            pid:183840860 hgt:177cm ecl:blu eyr:2023
                        
            pid:045246162 eyr:2021 byr:1928 hgt:190cm ecl:gry hcl:#602927
                        
            pid:273620987
            eyr:2022 hgt:162cm
            cid:269
            byr:1991 hcl:#602927 ecl:amb iyr:2019
                        
            pid:621069556 ecl:amb
            cid:202 byr:2020 hgt:189cm
            iyr:2014 hcl:#fffffd
            eyr:2027
                        
            eyr:2022 byr:1988
            hgt:190cm
            pid:349839553 hcl:#602927 iyr:2018 ecl:gry
                        
            iyr:2014 ecl:gry
            hcl:#733820 eyr:2025 hgt:179cm pid:231854667 byr:1984
            cid:102
                        
            eyr:2020
            pid:509400891 hcl:#cfa07d hgt:172cm
            ecl:grn byr:1997 iyr:2020
                        
            iyr:2017 byr:1994 hgt:174cm ecl:amb
            pid:685743124
            hcl:#fffffd eyr:2029
                        
            iyr:2012 hgt:177cm byr:1999 pid:549190825 hcl:#b6652a eyr:2028 ecl:oth cid:316
                        
            hgt:192cm ecl:grn byr:1924
            iyr:2011 eyr:2029 hcl:#efcc98
            pid:215962187
                        
            iyr:2011 hcl:#866857
            cid:164
            hgt:184cm
            ecl:gry eyr:2023 byr:1959 pid:204093118
                        
            hgt:172cm ecl:hzl hcl:#3f2f3a pid:623470811 byr:1938 iyr:2013 eyr:2022
                        
            hcl:#b6652a
            iyr:2019 hgt:152in
            ecl:oth
            pid:189008850 byr:2006
                        
            ecl:oth hcl:#602927
            pid:049746898 byr:1924 hgt:150cm eyr:2026
            iyr:2014
                        
            ecl:oth
            eyr:2028 byr:2018 hcl:#733820
            pid:8676207205 iyr:2018
            hgt:190cm
                        
            eyr:2023 cid:308 hgt:170cm ecl:oth iyr:2014 hcl:#18171d pid:874405208 byr:1936
                        
            eyr:2021 ecl:hzl
            pid:423603306
            hcl:#c0946f cid:147
            byr:1988 iyr:2016 hgt:164cm
                        
            hgt:176cm iyr:2010
            hcl:#6b5442 cid:280 byr:1988 ecl:hzl pid:967151288 eyr:2028
                        
            cid:299 hgt:163cm ecl:gry
            pid:561439154 eyr:2023
            hcl:#cfa07d iyr:2019 byr:1959
                        
            pid:635547007
            ecl:blu
            byr:1996 hcl:#7d3b0c cid:280 eyr:2023
            hgt:170cm iyr:2017
                        
            hcl:#888785 iyr:2014
            ecl:brn
            hgt:190cm byr:1941 eyr:2021
                        
            hcl:#c0946f cid:199 hgt:162cm ecl:amb pid:130696599 eyr:2022 iyr:2018 byr:1948
                        
            cid:314 hcl:#a4fc09 ecl:hzl iyr:2019
            pid:886849824 eyr:2026 byr:1933 hgt:178cm
                        
            byr:1996 iyr:2016 eyr:2030 hgt:169cm
            pid:119207760
            hcl:#ef542c
            ecl:brn
                        
            iyr:2030 eyr:2039 hcl:#c0946f pid:#7336a0 hgt:182cm cid:347
            ecl:#c81361 byr:2003
                        
            pid:727812879 iyr:2013 eyr:2027 hgt:172cm
            hcl:#7d3b0c ecl:gry byr:1966
                        
            hcl:#341e13
            iyr:2016 pid:744997238
            cid:322
            byr:1973
            ecl:hzl eyr:2028 hgt:190cm
                        
            hgt:171cm eyr:2026
            iyr:2014 ecl:oth
            pid:074049558 hcl:#04083f byr:1923
                        
            pid:973713235
            eyr:2021
            ecl:brn
            byr:1922 hcl:#fffffd iyr:2012
            hgt:178cm
                        
            ecl:#10165d
            cid:201 eyr:2026 pid:#ceefa8 byr:2020
            hgt:164cm iyr:2011
            hcl:9fccf7
                        
            ecl:blu
            hgt:165cm iyr:2012 eyr:2025 pid:775787557
            byr:1952 hcl:#623a2f
                        
            pid:6186829005 ecl:lzr hcl:z hgt:69in iyr:2021 byr:2018 eyr:1974
                        
            pid:824641755 eyr:2028 byr:1950 hgt:184cm
            hcl:#c0946f
            iyr:2014
                        
            hcl:#7d3b0c cid:84 hgt:187cm iyr:2015
            pid:895876610
            byr:1988 eyr:2023
                        
            hcl:#fffffd
            hgt:157cm iyr:2020 eyr:2030 ecl:grn pid:486236241
                        
            iyr:2010
            eyr:2029
            hgt:74in ecl:hzl byr:1926 pid:348573885 hcl:#9d1214
                        
            hgt:171cm ecl:oth
            eyr:2022 pid:148728436 byr:1993 hcl:#a97842 iyr:2013
                        
            iyr:2019
            hgt:151cm
            eyr:2020 pid:319882814 ecl:grn byr:1966 cid:256 hcl:#3107b3
                        
            hgt:184cm ecl:grn
            byr:1947
            eyr:2025 iyr:2015 pid:827962962 cid:62 hcl:#f3a364
                        
            iyr:2013
            hcl:#fffffd pid:215012801 ecl:amb eyr:2024
            hgt:154cm
            byr:1973
                        
            ecl:hzl hgt:152cm
            hcl:#623a2f
            byr:1944 eyr:2022 pid:295632731
            cid:243 iyr:2019
                        
            ecl:brn
            iyr:2011 pid:089250747 byr:1984 hcl:73e739 cid:253 hgt:161cm eyr:2021
                        
            hcl:#18171d byr:1944 pid:732054667 eyr:2021
            ecl:oth hgt:173cm
                        
            ecl:gry pid:445116331
            hcl:#a97842
            hgt:187cm eyr:2026 iyr:2020 byr:1992
                        
            hcl:80c091 pid:745555899
            iyr:2021
            hgt:170cm
            byr:1990
                        
            pid:058987865 byr:1927 cid:209
            hcl:#65ccf6 eyr:2025
            ecl:brn iyr:2012 hgt:164cm
                        
            hgt:67cm
            byr:2026 hcl:f8e749 iyr:2023 eyr:1921 ecl:lzr
                        
            eyr:2028 iyr:2013 pid:103268377 hgt:179cm byr:1922
            ecl:hzl
            hcl:#7d3b0c
                        
            byr:1923 ecl:gry hgt:167cm hcl:#7fc8ee iyr:2015 pid:427963077 eyr:2024
                        
            byr:1927 ecl:grn pid:741328150
            eyr:2029 hcl:#733820
            iyr:2015 hgt:157cm
                        
            hgt:70cm hcl:e76970 iyr:1945 cid:186
            byr:1921 eyr:2029
            pid:823622634
            ecl:zzz
                        
            hgt:61cm cid:87 hcl:d5e5ff
            eyr:2024 ecl:dne pid:182634269
            iyr:2029
                        
            hcl:#623a2f eyr:2020 byr:1936 ecl:gry pid:236984204
            iyr:2011 hgt:156cm
                        
            pid:872645776
            byr:2023
            cid:220 ecl:blu hgt:172cm eyr:2033
            iyr:2010 hcl:ff82f9
                        
            pid:774489073 iyr:2013 byr:1922 ecl:brn eyr:2025 hcl:#18171d hgt:163cm
                        
            eyr:2024 hgt:65in byr:1962 iyr:2019
            pid:112233558 hcl:#888785 ecl:grn
                        
            hgt:172cm eyr:2022
            hcl:#18171d ecl:blu
            pid:609008608 iyr:2013
            cid:244 byr:1980
                        
            cid:124 hgt:175in eyr:2025
            hcl:674e80 pid:099875931 iyr:1956
                        
            byr:1926 hgt:188cm
            ecl:hzl eyr:2021
            iyr:2018
            hcl:#866857 pid:557800355
                        
            byr:1939 pid:200409089
            eyr:2026 hgt:164cm
            ecl:grn iyr:2013
            hcl:#733820
                        
            cid:73 hgt:169cm iyr:2016 byr:1976 ecl:gry eyr:2024
            pid:043453462
                        
            pid:609818712 hcl:#733820 byr:1958
            eyr:2025 hgt:187cm iyr:2017 ecl:gry
                        
            hgt:66in pid:618590610 iyr:2013 byr:1938 hcl:#d1bda9
            eyr:2022
            ecl:grn cid:69
                        
            hgt:156cm pid:755742405
            byr:1929 hcl:#6b5442 eyr:2024
            iyr:2018
            ecl:gry
            cid:105
                        
            eyr:2030 pid:77022842
            hgt:160cm byr:1989
            iyr:2011 hcl:#7d3b0c ecl:blu
                        
            iyr:2015
            hcl:#341e13 byr:1968 pid:434159843
            ecl:amb hgt:150cm
            eyr:2030
                        
            hcl:z eyr:1993 pid:#b3a5a6 iyr:1947 hgt:176in
            ecl:#78876d
                        
            cid:249 hcl:#cfa07d
            hgt:180cm ecl:gry eyr:2026 byr:1965
            pid:048327438 iyr:2010
                        
            pid:136468890 ecl:gry
            byr:1940
            hcl:#fffffd hgt:185cm iyr:2016 eyr:2021
                        
            hcl:#b6652a hgt:180in byr:1976 eyr:2022 pid:156cm ecl:#737836
            iyr:2013
                        
            ecl:amb iyr:2016 hgt:162cm byr:1955 pid:193cm eyr:2028 cid:346
            hcl:#733820
                        
            iyr:2010 byr:1932 eyr:2025 ecl:grn
            pid:595837820
            hcl:#341e13
            hgt:166cm cid:224
                        
            pid:481646831
            eyr:2029
            hcl:#623a2f cid:319 iyr:2016
            ecl:brn hgt:160cm byr:1944
                        
            ecl:zzz pid:428329840 cid:238 iyr:2022 hgt:76cm
            hcl:#a97842
            byr:2024 eyr:2028
                        
            iyr:2014 hgt:170cm
            byr:1963 hcl:#623a2f
            eyr:2026 pid:225910806 ecl:gry
                        
            ecl:grn iyr:2010 hgt:193cm byr:1928 eyr:2028 pid:343022641 hcl:#733820
                        
            eyr:2023 ecl:grn
            byr:1950 iyr:2012 hcl:#866857 pid:400725165
            hgt:193cm
                        
            cid:195 iyr:2014 ecl:oth eyr:2027 byr:1966
            hgt:177cm hcl:#18171d pid:913894485
                        
            iyr:2015 hgt:154cm
            cid:206
            pid:134599284 hcl:#602927
            eyr:2023 ecl:brn
            byr:1983
                        
            ecl:#2d0e7a pid:#f34625 eyr:1942 iyr:2027 byr:2013 hcl:z hgt:162cm
                        
            hgt:189cm byr:1965 iyr:2011
            cid:178 ecl:hzl
            hcl:#b6652a eyr:2026 pid:683560227
                        
            eyr:2030 pid:047446524 ecl:grn hgt:167cm iyr:2017 hcl:#602927
            byr:1920
                        
            cid:86
            iyr:1920 hgt:193cm
            eyr:2027 pid:401913877 ecl:hzl
            hcl:#888785 byr:1953
                        
            byr:1991
            ecl:grn
            iyr:2016
            hcl:#5e1ef2 hgt:186cm
            pid:076499738
            eyr:2025
                        
            eyr:2030 hcl:#18171d pid:750694893
            hgt:157cm iyr:2020 cid:338
            byr:1956 ecl:gry
                        
            iyr:2027 pid:#37f002 hgt:164cm ecl:#80df11
            hcl:#aeacee cid:320
            eyr:2039 byr:1956
                        
            iyr:2014 hcl:#733820 ecl:grn
            byr:1960
            eyr:2025 pid:667089568
                        
            hgt:163cm
            byr:1962 cid:108 ecl:gry hcl:#733820 iyr:2012
            eyr:2029 pid:763684725
                        
            byr:1984 hcl:#888785 hgt:159cm iyr:2012 ecl:gry
            eyr:2024 cid:236 pid:174711749
                        
            ecl:gry pid:044931271
            hcl:#b6652a eyr:2029 iyr:2013 byr:1985
                        
            byr:1973 iyr:2018 hcl:#a97842 pid:937214113 ecl:blu
            cid:247 hgt:186cm eyr:2023
                        
            cid:108 pid:231782961 iyr:2017
            eyr:2034 hgt:170cm byr:2025 hcl:#18171d ecl:utc
                        
            pid:298274796 byr:1928 hcl:#a97842 hgt:188cm iyr:2011 ecl:gry eyr:2028
                        
            hgt:65cm iyr:1943 eyr:2025
            hcl:z
            pid:65702335 ecl:#bb54e6 byr:2010
                        
            pid:499116613 eyr:2024
            ecl:gry hcl:#cfa07d hgt:193cm byr:1999
            cid:278 iyr:2015
                        
            hcl:#6b5442 eyr:2027 hgt:175cm byr:1988
            ecl:brn pid:410075320 iyr:2010
                        
            pid:269678991 ecl:oth iyr:2013
            hcl:#602927 byr:1991 eyr:2023
                        
            ecl:oth
            pid:144593265 hcl:#fffffd
            eyr:2020 iyr:2018
            byr:1975 hgt:160cm
            cid:304
                        
            iyr:2014 hcl:#ceb3a1 eyr:2029
            byr:1951 pid:520804395 hgt:185cm ecl:oth
                        
            hgt:159cm
            pid:312887994
            cid:205
            iyr:2016 ecl:hzl hcl:#866857 eyr:2029 byr:1944
                        
            iyr:2023 ecl:#54c85c byr:2030
            eyr:1946 cid:190 pid:512417622
                        
            byr:1946 eyr:2023 hgt:163cm
            hcl:#2d4e9c ecl:brn pid:839043333 iyr:2014
                        
            iyr:2027 cid:122 hgt:187cm eyr:1975 ecl:grn byr:1920
            hcl:#c0946f
                        
            eyr:2029 hgt:189cm ecl:blu byr:1922 iyr:2016
            pid:924104599
            hcl:#b6652a
                        
            hgt:162cm
            iyr:2016 byr:1921 hcl:#18171d eyr:1938 ecl:hzl
            pid:682222023
                        
            cid:118 pid:959515596
            byr:1921 iyr:2010 eyr:2029 hcl:#7d3b0c ecl:oth hgt:158cm
                        
            ecl:#8ac844 pid:162cm
            hcl:8f4d80 hgt:150in byr:2005
            eyr:2008
            iyr:2017 cid:174
                        
            hcl:z byr:1936
            pid:255481052 eyr:2021
            iyr:2012 hgt:170cm cid:276 ecl:hzl
                        
            iyr:2013 byr:1935 hgt:179cm
            eyr:2023 ecl:amb pid:073621563 hcl:#623a2f
                        
            hcl:#18171d cid:230 byr:1989 ecl:oth eyr:2021 hgt:181cm pid:661224730
            iyr:2019
                        
            pid:748039140 iyr:2020 eyr:2020 ecl:#6ebbc2 hcl:#fffffd hgt:171cm
            byr:1995
                        
            ecl:hzl pid:758144605 hcl:#ceb3a1 hgt:186cm
            eyr:2028 iyr:2014
            byr:1928
                        
            ecl:hzl
            hgt:66in
            byr:2000 iyr:2017 eyr:2020
            pid:162973694 hcl:#a97842
                        
            iyr:2012 pid:749770535
            byr:1969 cid:148
            hcl:#733820
            hgt:180cm eyr:2021 ecl:hzl
                        
            iyr:2010
            byr:1958
            hgt:164cm
            ecl:blu hcl:#733820 pid:890634327 eyr:2024
                        
            hgt:70in pid:218397894
            iyr:2020 eyr:2025 ecl:gry hcl:#341e13
            byr:1970
                        
            eyr:2020 pid:854208004 hgt:157cm hcl:#7d3b0c ecl:amb byr:1981 iyr:2020
                        
            byr:1924
            cid:321 eyr:2028 hcl:#cfa07d iyr:2010 ecl:amb pid:036669613 hgt:170cm
                        
            ecl:#6649d4 pid:0026989865 cid:188
            hgt:152in
            byr:1950 hcl:z eyr:1928 iyr:1963
                        
            hcl:#ceb3a1 ecl:grn eyr:2028 pid:074363489 iyr:2010 hgt:173cm byr:1966
                        
            eyr:2030
            pid:9731612333 ecl:#f8824c
            iyr:2022 hgt:161in
            byr:2023
            cid:316
            hcl:z
                        
            hgt:175cm iyr:2016 eyr:2024 cid:244
            byr:1952
            pid:085432899
            hcl:#fffffd ecl:brn
                        
            ecl:brn eyr:2026 iyr:2017 hgt:75in
            pid:745302991 byr:1969 hcl:#7394c7""";
}
