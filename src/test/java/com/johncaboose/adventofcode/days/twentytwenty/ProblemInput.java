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
    public static final String DAY_5_EXAMPLE = """
            FBFBBFFRLR
            BFFFBBFRRR
            FFFBBBFRRR
            BBFFBBFRLL""";
    public static final String DAY_5_INPUT = """
            BBBFBFFRLR
            BFFFFFFRLL
            BFBBBBFLLL
            BBFBFFFRRR
            BBBFBFBRLR
            FBFFBBBLRL
            FBFFBFFRRL
            FFBBFFFRRL
            BBBFBFBLLL
            BBBBFFFLLR
            FBBFFBFRRR
            BFFFBBBLRR
            FFBBFFBRLR
            FFBFFBFRRL
            BBBBFBFRLL
            BBBBBFFLRL
            FFBBBFBRRR
            FFFBBBFLLR
            FFBFFBBLRL
            FBBFBBFLRL
            FFBBBBFRRR
            BFBFBFFRLL
            BBFBFFFLLL
            FFFBBBFRRL
            BBFFBFBRLL
            FBFBFBFLLL
            BBFFFFBLRR
            FFBBBFFRRL
            FFFBFBBLRL
            FBBFBBBLLL
            BBFBFFBRLR
            FBFBFBBRLL
            FFFBBFBLRL
            FFBFFBFLRR
            BBFBBBFRRL
            BBFBBFBLLR
            BBFBBBFRLL
            BFFBBBBRLR
            FBFBFBBRLR
            FBBBFFBRRR
            FBBBFBFLLR
            FFBFBBFLRL
            BFBFBFBRLL
            BFFFBFBLRR
            FFBBBFBRLR
            BBFBFFBLRR
            BFFFFBBLLL
            BFFFFBFLLR
            FBFBBBBRLR
            BBFFBBFLRL
            BFBFFBBRLR
            FFFBFBFRLL
            BFFFBBFRRL
            BBFBFBFRLL
            BFBFFFFRRL
            FFBFBBBRLR
            FBBFFFFLRR
            FBFBBFBRLR
            BBFFBFFLRR
            BBBFFBFLRR
            BFFFFFBRLR
            FBBFFFBRRL
            BFFFBBFRRR
            BBBFBFBRLL
            BFBBFBBRLR
            BFBFBFBLLL
            BBBFFFFRLL
            BFFFFBFRLL
            FFBBFFBLLL
            FBFFBBFRRL
            FFBBFBFRLR
            FFBFFFFRLR
            BFBBBFBLLL
            FBBFFBFRRL
            FBFBFFFLRR
            BFFBBBFLRR
            FBBFBBBRLL
            FFBFBBFLLR
            FFFBFFBRLR
            BBFBBFFRRR
            BFBBBFFLLL
            BFBBFBBRRR
            BBFFFBBLLR
            BBFBFFBLLR
            BFFBBFFRRL
            FFFBBFBRRR
            BBFBBFFLLR
            BFFBBBBRLL
            BFFBBFFRLR
            FFFBFBFLRL
            FBFFBBFLLR
            BFBBFBFRRL
            BFBFFFBRLL
            FBBFBFFLRR
            FFBFBBFLLL
            BFBBFBBRRL
            FBBBFFFLRR
            BBBFBBFRRL
            BBFBBBFRRR
            BFFBFFFLRL
            BFBFBBFRRL
            FFBBFFFLLR
            FBFFFFBLLL
            BFBBBBFRLR
            FFBFBFBRLL
            FBFFFBFLRL
            FFBFBFFLLL
            FBBBFFBRLL
            FBBBBBFLLR
            FFBFBBBLLL
            BFFBBBBLLL
            BFFBBBFRLL
            FBFFFFBLRL
            BFBFFBFRRR
            FFBFFFFRLL
            BBFBBFFRRL
            BBFBFBBLLL
            FFBBBBBRRR
            BBBFFFBLRL
            FBFBBBFRLL
            BFBFFFBRRL
            FFBFBBBRLL
            FBBBFBFLLL
            FBFBFFBLRL
            FBBBFFFLRL
            FBBBFBBRRL
            FBBFFBBRRR
            FFBFFBBRRR
            FBFFFFFLLL
            FFBBBFFRLL
            FBBFFFBRRR
            BFBBBFBRRR
            FFBFFBBRRL
            FFFBFBFLLR
            FBBFBFBRLL
            FBFFBFFRLR
            BFBBFFBLRR
            FFBFBBBLRR
            FFBFBBFLRR
            BFFFBFFLRL
            BBFFFBBRLL
            FFFBBFFLRL
            BBFBBFFLLL
            BFFBFFBRLR
            BBBFFBFRRR
            FBFFBFBRLL
            FBBBFFBLLR
            FFFBBFFLRR
            FFFBBFBLLL
            FBFBFBBLLR
            FBBBFBFRLR
            BFBBBFBLRL
            FBFBFFBLLL
            FBFBBFBRRR
            BFFBBBBRRR
            BFFFBFBLLR
            FFFBFBBRRL
            BBBBFBBLLL
            FBFFBFBLRR
            BFFFFFFLLL
            FFBFBFBRLR
            FBBBFFFLLR
            BBBFFFBLRR
            FBFFFFBRRL
            FBFFFFBRLR
            FBFFBBBLRR
            BBFBFBFRRL
            BFFFBFBRLL
            FBFBBFFRRR
            BFFFFFFRLR
            BFBBBBBLLR
            FBBBBFBLRR
            FBBFBBFRLR
            BBFBBBFLRR
            FBFFFBBLRR
            BBBBFFFRLL
            BFBFFBBRRR
            FBFFFBBLLR
            FFBBBFFRLR
            FBBFFFBRLL
            FBBFFBBRRL
            BFFFFFFLLR
            BBFBFBBRRL
            FBFFFBFRRL
            BBBBFFFLRL
            FFBFFBBLRR
            FBFFFFFRLL
            BFFFFBFRRR
            FFBFFFBRRR
            FBFBBFBRRL
            FFBFBFBLRR
            BBFBFFFRLR
            BBFFBBBRRR
            BBFFFBFLRL
            FBBBBBFLRL
            FBBBFFBRLR
            FBBFBBBLLR
            FFBFBBFRLR
            BFFBFBBLRL
            BBBFBFBLRL
            BFFBBFBRLR
            BFFFFFBRRL
            FBBFFBBLRR
            BFBBBBFRRL
            BBBBFFFRLR
            BFFFFFBLLR
            BBBBFBFRRR
            BFFBFBBRLR
            BFBFBFFLRL
            BBFFBBBRLR
            BBFFFBFLLR
            FFBFFBFLLL
            BBFFFFFRRR
            BBFBFFFLLR
            BFBFFFFLRR
            FBFBFBBRRL
            FBFFFFFRLR
            BBBBFFBLLL
            BBFFFBBLRR
            FFBBBBBRLL
            FBFFFFFLRR
            BFFFBBFLRL
            FBBBBFBLLL
            FBFBBFFLLL
            BBFFFBBRLR
            FFFBFFBRRR
            BBFFBBBRLL
            BFBFFBBLLR
            FFFBBBBRRL
            BFFFFBFLLL
            FBBFBBBRRR
            BFBBFBBLLL
            BFBFBBFLRL
            FBFFBFFRRR
            FBBFFFFRLL
            FBBBFBFRRR
            BBBFBFFLRR
            BBFFBBBLRR
            FFBBFBBRRR
            BFBBBFBLLR
            BBFBFFBRLL
            FFBBFBBRLL
            FFBBBFFLRL
            BBFBBBBRRR
            FFFBFFFLRR
            BFBBBFBRLL
            FFBBFBBLLR
            BFBFBFFLRR
            BBBBFBBRRL
            FBBFFBFLLR
            BFBBBFFRLL
            BBBFFBBLLL
            BFBFFBBLRR
            FBFFBBBRLR
            FBBFBFBRRL
            FBFBBBFRRR
            FBFFFBBRLR
            BBFFFFFLRR
            BBBBFFBRLL
            BFFBFFFRRR
            FFBFBFFLRR
            FFFBFBFRLR
            BFFFBBFRLL
            FFBFBBBRRR
            BFFFFBBRLR
            BBBFFFFRRL
            FBFBFBFRRR
            FBBBBFBRLR
            FBFBBBFRLR
            BBBBFFFLRR
            BFFBFFFRLR
            BFFFBBBLLL
            BFBBFFBRLR
            BFBFFBFLLL
            BFBFBBFRLL
            BFFBBFBLLL
            BFBBFFFRLL
            FFBBFFBLRL
            BBBBFFBRRL
            FBBBFFBLRR
            FFBBBBBLLR
            FBFFFBFLLR
            BBFFBFFRRL
            BFBFBBBLLL
            FBBBBFBRRL
            FBFBBBBRRR
            BBFBBFBRRR
            FBFBFFFRLL
            BFBFFBFLRL
            BFBFFBBLRL
            FFBFBFFRLR
            BFBBFBBRLL
            FBBBBBBRLR
            BBFBBBBLRL
            FFBBFBFLLL
            FFBBFBBLLL
            FFFBBFBRLR
            BBBBFBFLLL
            FBFBFFBLRR
            FFBBFFFLRL
            BBFBFFFRLL
            FBFFFBFRLL
            BBBFBBFLLL
            FFBBFFBLRR
            BBBBFBFLRR
            FBFFFFFRRL
            BFBFFBFRLR
            FBFBFFBRLR
            FBBFBBFRLL
            BFFFFFFLRR
            BBBFFFFLLL
            FFFBBFFRLR
            FFBBFFFRLR
            BBBFFBBRRL
            FBBFBFBLRL
            BFFFBBBLRL
            FBBFBBBRLR
            BFBFFFBLLL
            FBFFFBBLRL
            FBFFBFFRLL
            BFBFBFBLLR
            BBFFBFBRLR
            BBFFFFBRLR
            FFFFBBBRRR
            FFBBBBBLLL
            BBFBBBBRRL
            BBBBBFFLLR
            FFFBFFFRLL
            BFFBBFFLRR
            BFFBBFFLRL
            BBBFFBFRLL
            FFBFBFBLLL
            BFBBBBBLLL
            FFBBBBFLRL
            FBFFBBFLRL
            BBFFFFBLRL
            BBBFBBBRLL
            BFBFFFBLLR
            BFBFBFBRLR
            BFBBFFFRRR
            BFFBFBFLLL
            FBBFBFBLLR
            FBFBFBFLRR
            FFBFFBFLLR
            FFBFFFBLLL
            FBFFBFFLRL
            FFBBFBFLLR
            BFFFBFFLRR
            BBFFFBFRLL
            FBFBBBFLRR
            FFBBFFFLRR
            FBBBFBBLLL
            BFFBFBFRLR
            FFBFBBBLLR
            BBBFFBFLLR
            BFBFFFBLRL
            BFFBBFFLLL
            FBFBFFFRRL
            BFFBBBBLLR
            FFBBBFFLLR
            BBFFBBFRRL
            FFBFFBFLRL
            BBFFBFBRRL
            BFBBBFFLRR
            BFFBFBBRRR
            FBBFBBBLRL
            FFBFBFFRRR
            BBFBFFFLRL
            BBBFFBBLRR
            FBBFBFBLRR
            BFBBBBFLRL
            FBFFFBBRRL
            BFFFFBFLRR
            BBFFBBFRLL
            BFFBFBBLRR
            FBBBBFFRLL
            BFBFFFFLRL
            FBBBBBBLLL
            BFBBBBFRLL
            BFBFFFFLLL
            FFBBBFBLRL
            BBFFFFBLLL
            BFBBFBFLRR
            FFFFBBBRRL
            BFFBFBBLLL
            FFBBFFFRLL
            BFFFBFBRRR
            FBBBFBBRRR
            BBFBBFBLRR
            BFFBFFBLRL
            BBFFFBBLRL
            BFFBBBFRRR
            FFBFFBBRLR
            BFFBFBFLLR
            BFFBBFFRLL
            FBBFBFBRLR
            BFFFFFBLRR
            BFBFFBFRRL
            BFBBFFBLLL
            FBFFFFBRRR
            BBFFBFFLLL
            FBBBBBBLLR
            BFFFFFBRRR
            BFBFBFFRRR
            BBFFBFFRLR
            FBBBFFBLLL
            BFBFBBFLLL
            BFBFBBFRLR
            BBFFBFFLLR
            FBBFFFBLRR
            FBFFBBFLRR
            BFFFFBBLLR
            FFBFBFBLRL
            FFFBBBFRLL
            BFFBBFBRRR
            BFFBBBFRLR
            BBBBFFFRRR
            FBBBBFBLRL
            FBFFFFBLRR
            BFFFBBBRLL
            FBFBBFFRLR
            FFBBBBFLLR
            FFBFFBFRLR
            FFBBBBBRRL
            FBFFFFFLLR
            BFBBBFFLLR
            FBFFBBFRLL
            BBFFFBFRRL
            BBFFBFFLRL
            FBFBFFFLLL
            BBFFBFFRLL
            FFFBFFBLLL
            BBFBBFBLRL
            BBFFBFBLRL
            BFBFBFBRRL
            FBBBFBBLRR
            FBBBFBFLRL
            FBBBBFFRLR
            FFBFBFFLLR
            BFFFBFBRLR
            FBBFFBBRLR
            BBFFBBFRRR
            BBBFFBBRRR
            FFBFFFBRLR
            BBBBFFBLRR
            BBFBFBFLLL
            BBFFFBBLLL
            BFBBFFBLRL
            FBFBFBFRRL
            BBFBBBFLLR
            FBBBBBFRRL
            BFBFBFBLRR
            FBFBFFFRRR
            BFBFFBFLLR
            BBBFFBFRRL
            BBBFBFFLLL
            BFFFBFFRRR
            FFFBBBBLRR
            BFFBBFBLRR
            BFFBFBFLRL
            BBBBFFBLRL
            FBBFBBFRRR
            FFFBBBBLLL
            FBFFFBBRRR
            FBBBFFFLLL
            FFBBBBBRLR
            BFBFFFFRRR
            FBBFFFFRRR
            BBBFBFFLRL
            BFFFBFFRLR
            BFBFFFBLRR
            BFBBFBFRLR
            BBFFFFFRLR
            BFFFBBFLLL
            BBBFFFFLRL
            BBFFBBBLLL
            FBFFBFBRRL
            BFBBBBBRLR
            FBBFFFBLLL
            FBBBFBFLRR
            BBFBBBFLLL
            FFBFFBBLLR
            BFFFBBFLRR
            BBBBFFBRRR
            BBFFFFBRRL
            FBFFFBFLLL
            BBFFBBFLLL
            BFFFFFFRRL
            FBBFFBBRLL
            FFBBFBFRRL
            BBBFFBBRLL
            BFBFBBFRRR
            FFBFFFBLRL
            BFFFFBBRRR
            FFFBBFBRRL
            BBBFFBFLRL
            BFFBBFBLLR
            FFFBFFBLRL
            FBBBFBBRLL
            BFBBFBBLLR
            FBBFFFFLLR
            FFBFBFBRRL
            FBBFFBBLLL
            BBBBFFFLLL
            FBBBBBBLRR
            FFFBBBBRLR
            FBBBBFFRRL
            BBFFBBBRRL
            FBBFFFFRLR
            FFBFBFFLRL
            FBFFFBFRRR
            FBBFBBFLLR
            FBBBBBFLLL
            FFBFBFFRLL
            FFBFFFFLRR
            FFBBBBFLRR
            FFFBFBBLLR
            BBBFBFBLRR
            FFBBFBBRLR
            FBFFFFBLLR
            BBFBFBBRLR
            FBBFFFFLLL
            BBBBFBBLLR
            BFBBBBFRRR
            BBBFBFFRRR
            BFFBBBBLRL
            BBBFBBBRRR
            FBFFBFFLLL
            FFBFBFFRRL
            BBBBFFBRLR
            BFBBFFFRRL
            FFBFFFBRLL
            BBBBFBFLRL
            FBBBFBBLRL
            FFBBBFFLLL
            FFFBFFBLLR
            BFBBFBBLRR
            FFBFBBBLRL
            BFBBFFFLRR
            FFFBFFFLLR
            BFBBBBFLLR
            BFFBFBFRLL
            BFFBFBBRLL
            BBFBFFFLRR
            BBBFBBFLLR
            FBFBFFFLRL
            FBFFBFBLLL
            FFFBFFBLRR
            BFFFBFFRLL
            BBFFBBFLLR
            BBFFBBBLRL
            FBFBBBBLLL
            FBBFBBBLRR
            FBBBBBFLRR
            FBBBBBBLRL
            FBFBBFBLLL
            FFFBFFBRLL
            FBFBBFBLRR
            FBBFFBFRLR
            BBFFFFFRLL
            FFBBFBBRRL
            BFBFBBBRLL
            BBBFFFFLLR
            FBFFFBFRLR
            BFFFBFFLLL
            BBBFFFBRLL
            FBBBBFBLLR
            FBBFBFBLLL
            BBFBFBFLRR
            BFBFBFBLRL
            FBBBBBBRRL
            BFBFFFFRLL
            BBBFBBBLLL
            BFBFFFBRLR
            FFFBBBBRRR
            FFBFFFBRRL
            FBFBBBBLRL
            BBFBBFBRRL
            BBBFFBBLRL
            FBFBFBBLLL
            FBBBBBBRRR
            FFFBFBBRLR
            FBFFBFBRRR
            FFBBFBBLRL
            BBFBBBBLRR
            BFFFFFFRRR
            BBFFBFBLRR
            FFFBBBFLRR
            BBFFBBFLRR
            BFBFBFFRLR
            FBFBFFBRLL
            FFBFFFFLLL
            FBFBFFBLLR
            BFFFFBBLRR
            FBBBFFFRRR
            FFFBFFFRRL
            FBFBBBFRRL
            FBBFFFBLRL
            FBBBFFBRRL
            BBBFBBFLRR
            BFBBFBFRRR
            FFBFFBFRLL
            BBBFBBBRRL
            FBBFBFFLRL
            BBBFBFFRLL
            FFBBBFBLLL
            BFFFFFFLRL
            FFFBFFFLRL
            FBFBBFFLRL
            BFFBFBFLRR
            BBBFFFFRRR
            FBFBBBFLLL
            BFFBFBFRRL
            BFFFFBFRLR
            BFBBBFFLRL
            FBBBFBFRRL
            BFBBFBFLLR
            BFBFBBBLRR
            FFFBBBBLLR
            FBFBBBBLRR
            BFFBFFFLLR
            BBFBBFFLRR
            BBBBFBBRLR
            FFFBBFBLLR
            FFFBFBFLLL
            BBFBBFFLRL
            BFBBFFBRLL
            BFBFFFBRRR
            FFFBFBFLRR
            FFFBBFFRLL
            FFBBBBFRLL
            BFBBBFFRRR
            FBBFBBFRRL
            BBFBBBFRLR
            FBFBFBBLRL
            FBFBFFFLLR
            BFFFFBBRLL
            BFFFBBBRRR
            FBBFBFBRRR
            FBFBFBBLRR
            BFFBFFBLLL
            FFBFFFBLLR
            FBBBBBFRLL
            FFFBBBFRRR
            FFFBFFBRRL
            BBFBBBBLLL
            BBBBFBBLRL
            BBFFFFBRLL
            BFFFBBBRRL
            FBBBFBFRLL
            BFFBBFFRRR
            BFFFFFBLRL
            FBFBBFFLLR
            BFBBBFBRRL
            BBFBBFBRLR
            BBBBFBFLLR
            FBBBFBBRLR
            FBFBFBFLRL
            BBBFFBBRLR
            BBBBBFFLLL
            BFFBFBBRRL
            BBFFBBFRLR
            BFBBBBBLRR
            FFBFFBFRRR
            BFFFBBBLLR
            BFFFBFBRRL
            BFFFBFFLLR
            FBBFBBFLRR
            BBBFFFBRLR
            BBBBFBBRRR
            BFBFBFBRRR
            BBBFBBBLLR
            FBBFBFFRLL
            BBBFBBFRRR
            FFBFBBFRLL
            BFFBFFBRLL
            FBFBBFBLRL
            BBBFBFBRRR
            BFFFBBBRLR
            BFFBFBFRRR
            FFBFBFBRRR
            BFBFBBBRLR
            BBFFBFBLLR
            FFBFFFFRRR
            BFBBFFFLLL
            BFFFFBBLRL
            FBFFBFFLRR
            BFFBFFFRLL
            BBFBFFBRRL
            FBBFFBFLRL
            FBBFBFFLLL
            FBFFFBFLRR
            FBFBFFBRRR
            FBBBBFFLLL
            BFBFBBBRRR
            BBFBFBFLLR
            FFBBBFBRRL
            BBFBFFBLLL
            FBBBBFFRRR
            FFFBFBBLRR
            FFFBBBFRLR
            BBBFFFBRRL
            FFBBFBBLRR
            FFBBFBFRLL
            BBBFFFBRRR
            BBFBBFFRLL
            FBBFFBFLLL
            FBFBBFFRLL
            FFBBFBFRRR
            BBBBFFBLLR
            FBFFBBFLLL
            FBFBBFBLLR
            FFBBFFFRRR
            BBBFBBFRLL
            BFFBBFBRLL
            FBBBBBBRLL
            FBBFFFBRLR
            FFBBBBBLRL
            BFBBFBBLRL
            BBFBFBFRLR
            BFBFBBFLRR
            FFBFBBFRRR
            FFBFFFFLRL
            BBFBFFBRRR
            BBFBFBFLRL
            FFBFFBBRLL
            BBFFBFBLLL
            BBFFBBBLLR
            FBBFBFFLLR
            FBBBBFBRLL
            BBFFFFFLLL
            BBFBFFFRRL
            BBFFFBFRRR
            BBBFBFFLLR
            FFBBBFBLLR
            FBFBBBBLLR
            BBFFFFFRRL
            FBFBFBFRLR
            FFBFBBBRRL
            FFFBBFFRRL
            FFFBBBFLLL
            BFBFFFFRLR
            BFFBBBFRRL
            BFFFBBFLLR
            BFFBFFBRRL
            BBFBBBBRLL
            BBFBFBBRLL
            BBFBBBBRLR
            BFFFBBFRLR
            FBBFFBBLRL
            BBBBFBFRRL
            BFFBFFBRRR
            FFBBFFBLLR
            FFBBBBFRLR
            FBFFBBBLLR
            FFBBFFBRRL
            FBFBFFFRLR
            BFFBFFBLLR
            FBFFFBBLLL
            BFBBFFFLRL
            FFFBBFFRRR
            BFBBFFFRLR
            BFBFFBBRLL
            BBFFFFBRRR
            FBFFFFFLRL
            BFFBBBFLRL
            BFBBBFBLRR
            FFBFFBBLLL
            BFBFBBBRRL
            FBBBFBBLLR
            BFFFBFFRRL
            FBBFFBBLLR
            BBFFFFBLLR
            BFBBFBFRLL
            FBFBBBFLRL
            BFFBFFFLLL
            BBBBFBBRLL
            BBBFBBFRLR
            FBFFBBBRLL
            FBFBBBFLLR
            BFBBFFBRRL
            FBBFFFFLRL
            BFFBBBBRRL
            FBFBFBFRLL
            BFFBBBFLLR
            FBFBFFBRRL
            BBFBFBBRRR
            FFFFBBBRLR
            BBFFFBFRLR
            FBBBFFFRLR
            FBBBBFFLRR
            BBFFFBFLRR
            FBFBBFBRLL
            BBFFFBBRRL
            FFFBBBBLRL
            BBFBBFBRLL
            FBBBFFFRRL
            BFBFBBBLRL
            FFFBBBBRLL
            BBFFFFFLRL
            BBBBFBBLRR
            BFBBBBBRRR
            BBFFBFBRRR
            BFFFBFBLRL
            BFBFFBBLLL
            BBFFFFFLLR
            BFBBBFBRLR
            FBFFBFBLRL
            FFBFBFBLLR
            FBBFBBBRRL
            FBFBBBBRRL
            BFBFBFFLLL
            FBFFFFFRRR
            BBFBBBFLRL
            FFBFFFFRRL
            BBFBFFBLRL
            FFBFFFFLLR
            FBFFBBBLLL
            BBBBFBFRLR
            BBBFFBBLLR
            FFBBBBFLLL
            FBBBBFBRRR
            FBBBBBFRLR
            FFFBBBFLRL
            BBFFFBFLLL
            FBFFBFBRLR
            FFBBFBFLRL
            FFFBBFFLLR
            FFFBFFFRLR
            BFBFFBBRRL
            BBFFBFFRRR
            FFFBFBBRRR
            BFBFBFFLLR
            FBBBFFBLRL
            FFBBBBFRRL
            BBFBFBBLRR
            FFBBFFBRRR
            BFBBBBFLRR
            BFFBBBBLRR
            FBBBBFFLRL
            FBBFFFFRRL
            FFBBFBFLRR
            FFBBBFBRLL
            FFFBFBFRRL
            FFBBFFFLLL
            FBBFBFFRRL
            BBFFFBBRRR
            BBBFFBFRLR
            BFBFFBFRLL
            FBBFFFBLLR
            BFBBBBBRRL
            BFBBFBFLLL
            BBBFBFBRRL
            FBFFFBBRLL
            FBBFBFFRLR
            BFFBBBFLLL
            FFFBFBBRLL
            BBBBFFFRRL
            FBFBBFFLRR
            BFFFFBBRRL
            BBFBBFFRLR
            FBFFBFFLLR
            BBBFFBFLLL
            BFBBBBBLRL
            BFFFBFBLLL
            BFBFBBBLLR
            BBBFFFFLRR
            FBBBBBFRRR
            FBBFBFFRRR
            BBFBFBFRRR
            FFFBFFFLLL
            FBFFBBBRRL
            BBFBBBBLLR
            FBFBFBBRRR
            FFFBFBBLLL
            FFBBBFFRRR
            BBBFFFFRLR
            BFBFFFFLLR
            FBFFFFBRLL
            FBBFFBFLRR
            BFFBFFFRRL
            BBFBFBBLRL
            FFFBBFFLLL
            BFBBFFBRRR
            FFBBBBBLRR
            BBBFFFBLLL
            FFBFFFBLRR
            FFFBFBFRRR
            FFFBBFBLRR
            FBFFBBFRLR
            BFBBFFFLLR
            BFFBFFBLRR
            FBFFBBFRRR
            FFBBFFBRLL
            FBFBFBFLLR
            FBBFBBFLLL
            BFBBBBBRLL
            FBFFBFBLLR
            BFBBFBFLRL
            BFBBBFFRRL
            BBBFBFFRRL
            FFBBBFFLRR
            FBBBFFFRLL
            FFFBBFBRLL
            BFFBBFBRRL
            BFBFBBFLLR
            FFBFBBFRRL
            FBBBBFFLLR
            FFFBFFFRRR
            BBBFFFBLLR
            BBBFBBBLRR
            BBFBBFBLLL
            FFBBBFBLRR
            BFBFFBFLRR
            BFFBBFBLRL
            BFBBFFBLLR
            FBFFBBBRRR
            BBBFBBFLRL
            BFBFBFFRRL
            BBBFBBBLRL
            FBFBBBBRLL
            BFFFFBFRRL
            BFFFFFBRLL
            BFFFFBFLRL
            FBBFFBFRLL
            BBBFBFBLLR
            BBBFBBBRLR
            BFFBFFFLRR
            BFFBFBBLLR
            FBFBBFFRRL
            BBFBFBBLLR
            BFFFFFBLLL
            BFFBBFFLLR""";
    public static final String DAY_6_EXAMPLE = """
            abc
                        
            a
            b
            c
                        
            ab
            ac
                        
            a
            a
            a
            a
                        
            b""";
    public static final String DAY_6_INPUT = """
            su
            egu
                        
            h
            h
            h
            h
                        
            cpuqz
            cfqu
            cqekuv
            xunqc
                        
            hsaygprt
            hsfatgyr
            srtagyfbph
            rgqywhsealtx
                        
            aefomnlihcsdpyvxurbkq
            ipudhrafbcszoxmeqknv
            hpricubknmdoqsjvfx
            uiwohncxmrpsgqbfvktd
                        
            tvruzqbyspjdfalicehwkm
            haswlezrvxjbtckfyipmq
            alzkjcqpbsfmetihuvyr
            rkjibhvylpfqscaemzt
            zjctmrhpseqgfklnibyva
                        
            ix
            akdhy
            felrouzwt
            ygs
                        
            pifgwbtvs
            gkwbcpixmt
            pbrgitw
                        
            vex
            iyhmwl
            cks
            fj
            dzsfn
                        
            xsvmdzrpq
            ipzmvdgsxqa
            tcouzvhdqxwlspe
            psjydqizxgv
                        
            sdcgvhx
            ieupwazvdxq
            vgfxd
            xgjdbslv
                        
            cla
            aj
            a
                        
            unvhtezsdrxjyka
            sruxtezyjhdbkav
                        
            f
            s
                        
            l
            l
            l
            l
            l
                        
            dqlpmwrfuaeioc
            kzpyiembgthnj
                        
            ks
            qoh
            cftlim
            ukv
                        
            ekfwgpbaurcqijdvhtxznl
            tafuqxhgjkizprsvylcedb
            eukbxaligpfhdvrqtczjm
                        
            muikcbg
            ithfkq
                        
            ojdwcsigaflpykv
            uzjmbhrdlxnt
                        
            v
            v
            bv
            v
            vf
                        
            il
            li
                        
            sfqoutzki
            erfsuxcjqhtk
                        
            op
            gbepq
                        
            vtzpwj
            ijmxtzv
                        
            zvoxpf
            bwiexz
            birzwxq
                        
            h
            f
                        
            pjiae
            pjkyza
            akzptjb
            ajipz
            sjhap
                        
            xerdismyblco
            yaiowgpsedtnzrhx
            dilmokqxybrescu
                        
            bxeclkt
            bighzytlw
                        
            itokcrbm
            isa
            iwuq
                        
            rqcue
            pisb
                        
            gpdmiyet
            mwtgl
            gmtdz
                        
            hrselofawdu
            roadesjfukh
            sopadrhefuj
            drusaofeh
            hsdoekafur
                        
            matixrjqfw
            traxmfqwisj
            ajtqkrwmfi
            ipmwjaftvrq
                        
            eyvmb
            bht
            nkpbw
            ehtba
            zdrsjxblf
                        
            efpgnzjdabsukr
            kjpagiumfsbedzrn
            djngsrapubzefk
            kfbzpeadgrujsn
                        
            pwnqbhjv
            vwqhbp
            qwbhvp
                        
            sdlizutpwkfbhjm
            sdqvrpuflmwjz
                        
            uxahnymvs
            xnrlpebt
            gnzlxjfoq
            kfzxn
                        
            amedtwkgxcypbrqnujvifhs
            saxvbymtfrhgdiwqjnkcpe
            erjkmaigvdfxcnbtyqhwps
                        
            ivb
            vbi
            vbi
                        
            gme
            gem
            gme
                        
            h
            p
            e
            e
            e
                        
            b
            b
            b
            b
            bl
                        
            t
            l
            l
                        
            zda
            efmil
                        
            ulx
            solxwu
                        
            gclsqwx
            cgxswl
                        
            qawroeb
            owfeqlzxbn
            igratbowseq
            otvcqjbegw
                        
            mcahbeizsjovynpx
            nsbdiclahpmxyove
            qgepcisukanhmwyv
                        
            cogbsyu
            cusogb
            uxoscbgf
            bpugchsort
            bgocmsuv
                        
            jxigcazhlfsruwetkpynmvqo
            drkvthunlgcsyeaxzqpjfwimo
            syaeqcvmuxpnkgtwjfhbozilr
            mgczoqvyhjuxreawtnkfpsil
            acouwfqpjtgkrxyzivehsnml
                        
            xpyldvrbug
            falxpgdzuhsvrt
            ldewxuvpgrtm
                        
            jzbpury
            hlgzxrkpouavq
            emirbuzcp
            wnfumipczrb
                        
            liydasvrkgqe
            ayidqgrsvel
            vdjygiulearpws
            gvedasikylr
                        
            ikatocyfxps
            spaoikxctyf
            ckpsxfioyuta
            waxiforkpystc
            xcmykipsftoa
                        
            zxleoadsyv
            yovaleu
            veaoyl
                        
            qnmkplahgtubszedcij
            pscidealhtqjbguynz
            jqseucdgzbpilanth
            liahqmuznjscdbpgyte
            avqrielhntdjzpgxubsc
                        
            uflmyhndsqboxv
            mnlofduxbsqyvh
            kvoptzfmrgysanuhxblqdjec
            dfsnbvxolqmyuh
                        
            ihrjpxygmfudqwcaoezt
            jdlbmonxwraiqyctzhvupfe
            utfhadqciozemwjpryxg
                        
            mcy
            my
            ym
            aym
                        
            euktqozh
            qvjfhalk
                        
            ziblapqkvhcmdte
            lfqkvdeaicmztph
            mliqbcvpkathz
            ylwiochpqmtakvjz
                        
            oahnmutxc
            hncxomtuva
                        
            kfnsgxhiyzcbjmwvloe
            ezciqlkbmspnfgx
                        
            fatwrkenzmlij
            rftamzejnskiwl
            nlifwzaerjmtk
                        
            ygpdfunhz
            ycfquwndg
            ygfnud
            nfrygudbt
                        
            wargt
            vzumj
                        
            pevirabdgyntjmfzxu
            fbajcpgwtmveixnyzu
            fqkgtevmuiybnjxapz
            gufjytsplnvamozeixb
                        
            n
            w
            wsp
            y
            dheck
                        
            dyltqraen
            tpsgabzmoexn
            rvkailytneq
            tfnayeihu
                        
            ewsxrgjbqyno
            qmswbxnjogrye
            gobjqesnywxr
            bsyexgrnwjoq
            rbjewonsqgxy
                        
            stwikjqlp
            lrsiupwhofjtk
            pljtwiks
            pwkijqstl
            cslkjtwpiq
                        
            tpdekxavhynbmwq
            cplmqztabw
                        
            tagofzql
            leaoktp
            ltnuaoxv
            kylztoa
                        
            cyhkmbsxfwjndv
            xykhbcfvmenwdsj
            ycfmjwvnbhxskdz
            ecvmhdkjbwsxfyn
            xbksdmhwfjvycn
                        
            dwhonqeszgyucxip
            ilbhvtupfksgzm
                        
            oazfpt
            ozfpbt
                        
            yxor
            xrbe
            brxe
            rx
            erx
                        
            d
            d
            d
            d
            d
                        
            ihnyoscrtazjfwme
            jibycpvemkqzas
            jbaivmzxsgecudy
                        
            kmsp
            smapk
            jmpek
                        
            wbeoh
            zon
            fzoq
                        
            cmbwrupzjkq
            qzbprmkowuj
            rajuzkbwmpq
            ljrpxbuztwiqkme
                        
            ijnglzsbcqfawohpdxmtve
            aqpzxbndsfgtomwlvehjci
            ambcxwlvdzqftenorgjsihp
                        
            rbjtkm
            krm
            mkr
            mrk
                        
            qjkdftrpnumcizayl
            wqplnjcudgxzmkriatyf
                        
            qlhrxgeftoy
            bzorhtyxlpqegf
            egbolyfxrthq
            etflxyhoiqrg
            fyruhtqgoxel
                        
            ydogmjnixtkw
            yminkvjwfpdqgo
            nigxjwoykmd
            igwjnydkxom
            nikydjgmow
                        
            s
            s
            s
                        
            mctyqjebhrx
            jmteybcxhq
            vmbtseyoxhacdl
            miyeqcxhtb
            cmuybexth
                        
            j
            jrn
            j
            j
            j
                        
            gjwhqzotyivsa
            dncumikebpr
                        
            rjgvkwqib
            dumtbxzowfylh
                        
            oge
            eivjdbkmcywg
            eg
            gfoe
            ge
                        
            qebcdswmkoygivfhzt
            hxyztepdnocigquwvbfa
            dgtwcyhfivboeqz
            cdhbgtveizowfylqk
            yfzbqhlvitmcgwedso
                        
            evhlbqwtrfx
            mlfbwh
            hbflwp
            bfwlkhim
            whnfbl
                        
            pcrf
            crhf
            fcr
            cfr
                        
            okxihbndges
            cfheijbgqotnsk
            yngobhskevi
            rgknsoielhb
            dknoeisbhg
                        
            nztcvyikjfx
            fkityvjxnc
            kjvnfycxilgtp
                        
            tjlbadpizowyev
            qehgkdrzbcvotlay
            falbynztqeodhv
                        
            x
            x
            x
            x
            x
                        
            ausbpe
            sbeauop
                        
            ftgly
            bf
                        
            erhokg
            gekohr
            hrgkeo
            ghreko
            hregko
                        
            ag
            ga
            ga
            ag
                        
            vempgsokyfctax
            ckonsxfptmyvge
            yxefdorjmuzhvpsgwbltck
            esxmcvgykfnpot
                        
            thob
            obe
                        
            xg
            qyalvxc
            xg
            x
                        
            sqyowmanjczfebkulxtvgid
            fahgqzenwypcbrmtvjslok
                        
            zohlmctqxnueg
            jhpbgfkds
                        
            fyj
            cwojdbf
            jtf
            rfjt
                        
            hycpvrmfqlngu
            vmqcypgunlrh
            pqmhuvylgncr
                        
            rxgswj
            dwsybphk
                        
            pcozvsdx
            kvznm
                        
            xneik
            xkin
            xinqk
            nxsjik
                        
            btfdr
            jbqcasvpd
            tkubd
            ubdxwr
            towilbd
                        
            bfjidznx
            nxbijdzf
            jzfxidbn
            nifdbxjz
            nzfbidjx
                        
            kjnydrclqeiumxg
            foidejlnxgckm
            coinexmgdlkj
            lpckgdvnhmjxei
                        
            upnhgfa
            uhfpn
            uhpfn
            phufn
                        
            hvyqepkfdsulzb
            kfdepzvyhqlb
            yezgbkqpvfdh
            yzpfkegqdvhb
            ykveqbfjzhwrpd
                        
            lvndux
            uxdnlv
                        
            skymq
            yqmi
            yqzm
            zymutq
            qym
                        
            lgnxbpzsce
            eczlspaibgt
                        
            raimheuwjdlsvncoypgzbqkxt
            gcwavnjedbxsyfkqlprthuimoz
            gjszrpmaxbydoktivewhlqncu
            tojqzuenragvmxckiydphslwb
            xeacszmjuliyvqdgkwprbnoht
                        
            eahlnzupx
            ulhmektsxdyjz
                        
            zulrwsdaq
            rqilsadz
            tarlisqmdz
            arslzdq
                        
            pwzjtoafs
            pzjwoafts
            joafwztps
            fzstwojap
                        
            qbsykroiwcmzugealpxfjtdn
            rcketgxqjupwzbymofaidns
            kbngvtqdysrpumcejwaifozx
                        
            vxpyulwietrmfqbo
            tyeqbwxprmvfl
            jlqismvbdprexwtkyf
            betvyxlrnmwaqfpc
            pqywsxoerfitvmbl
                        
            osgilzptxmyhdwnbkjucvfq
            iovflbqpkshyxdcjtg
            iphsqdgyjfcevlotxk
                        
            pdmxwbrzyk
            orxtiplgmeua
                        
            rkeaoq
            muncxwzvjtfp
            eyhkiqso
                        
            acjpbvh
            knmspwuebjyvgft
            vbjpd
            pqbvrj
                        
            spld
            qlaogwv
            fhzjnmixyrut
                        
            khmw
            sjqdtwk
            pckw
            okwjz
            ybvnuakxwgr
                        
            js
            j
            qj
            j
            je
                        
            sdqftlargy
            jrmtgfaydoizsl
            rtdlwafsyg
            rtfylgwsad
            adgltwryefs
                        
            ujxfzvaptw
            txuwfjzp
            vjuzfatwxp
            gnzfxptwju
                        
            ltnfhrdwxv
            dnwxtprhfv
            hxfdntvawir
                        
            sd
            tl
            dvytb
            cv
            pofkherqumi
                        
            bnhwe
            iwesc
            swe
                        
            xgukzobv
            xkzugbafjrov
            ebxukzgvo
                        
            yor
            ior
            ryo
            royk
                        
            wj
            jzw
            wj
            wj
            jw
                        
            pigbdcozntylm
            toxilbam
            bixopln
            bvwkrloiefuh
                        
            eduk
            uekd
            eudk
            ckdue
                        
            vulk
            klvu
                        
            jeyafmuqxd
            aoxfed
            edxaf
                        
            sjbkveaymcdtgx
            gtskxcyqmhvjarfn
            jrngyohawxkqmpcvst
                        
            fmubgnqisdyax
            axnydgimfuts
                        
            nzkrjofhqiubspv
            fksopnbuihrjqvz
            vhrbipqfjsozknu
            urfvnibojqpkszh
            jvnpuzkifhobqsr
                        
            ctikjyqxempoh
            comiqtxhjpkny
                        
            whbdemfkursty
            ryfuqxvkwmbesht
            tkrumwhfsbeya
            ryefhwstbmukn
                        
            xnd
            flrakdi
            rlps
            ehqtbzvjgcouy
                        
            qvwihfpbd
            imsfuvbrwhd
            fvhdipbw
            vhifdbw
                        
            uezrmltpvhd
            fykjilqzsac
                        
            davlkgpqbwuc
            bgvdnwlcuakpq
            abuwhqckgzvtdplr
                        
            nd
            fdrjxc
            a
            bmzeuwq
                        
            luopqihwtygjda
            hodyuwapglqjbrti
            agwqcijhduoyplt
            qypgdtjlahiow
            ljpskhxvqwyafiotdg
                        
            nhkdmtw
            thyknm
                        
            jnfxrctwgqahudmoiyvs
            axdtfwsonugzimcjrhlyqv
            atcnfovyhjguxqimrdws
                        
            ue
            cm
            xrnozk
            a
                        
            n
            n
            n
            n
            n
                        
            fojreag
            e
            enq
            etdzqm
            eb
                        
            wfsakpx
            isfaxk
            axwskvf
            xeldakfsu
                        
            kzpwfxhab
            gfkqxdhtpbwz
            pfhazwxkb
            wbpzfkxh
                        
            tbcn
            mg
            vbkmg
            au
            sfz
                        
            vangwftohxdbrzy
            vohwdnbraftxzgy
            xvozdtfargyhnwb
            yardwbvhtofxzgn
                        
            irfa
            irawf
            iraf
            ifra
                        
            jbtsqvywarn
            bajcviqwyrt
            kutgqjmlxaryzbvwo
            rwsqjevdbyat
                        
            iyhg
            hyg
            hgy
            gyh
            ghy
                        
            qwidmahzfcueoskvlp
            fkysbnihvumpaegtd
            kaemjsurfdvhxip
                        
            oujsvbwceghnlpzxraf
            ecaogrvjxluswpnfhbz
            azexcujlfosbwnvgrhp
            busrxgazjvpcfonwhel
                        
            ughqky
            ntdwhmblxearjogzck
            hfkyg
            qighsk
            khgp
                        
            cuzonhjegy
            zujhocvnyeg
            eoculrnjbgzywh
            hjzcuyoegn
            ugzvhcemynjo
                        
            lrigswxvmcqofua
            owxmivacesurglkjq
            wcmaqsirovxnglu
            lisvmugqxrcofaw
                        
            t
            mj
            m
            j
            zdl
                        
            nmsexwigtjulcy
            favyolnmgqtbrjkw
                        
            w
            w
            w
                        
            gxu
            utx
                        
            mcgfu
            g
            gr
            rg
            gp
                        
            rhjaizdkxup
            erblofajmvspxt
                        
            zt
            tzf
            lxmcowgyk
                        
            q
            rux
            q
            g
            q
                        
            uantxs
            snwukxvjo
                        
            rixtwvc
            vwciatx
                        
            ycipkftmez
            yimcftepkz
            empozcyfikt
                        
            aijwrvfmgyxlbztod
            znytdgfbekxlpi
                        
            svqgfxh
            nvkqgseaxh
                        
            mgqxhbl
            zkvgqlbxm
            lqgmxb
                        
            wq
            fm
                        
            ktydgbsziqehmjfl
            ksihgtdfjylze
                        
            ne
            ne
            ne
            tenx
                        
            vzcwnxfimj
            icvxzjmnwf
            vzcmjrdxiwbnf
            wjxnmfzcvi
                        
            dwy
            h
            ovk
                        
            nbowqrxlpyzifjvka
            zyvxrolwfbpikqa
            vkqdwrbyiapzxofl
            kzebrvfiqypaomxlw
                        
            zjksb
            zkjbs
            zkbsj
            bzksj
                        
            oeimldgvybkrznxhc
            ejfxokaqhzd
                        
            esvbydlxc
            nbvcxlyes
            eoclzgsvxkmywb
            eltvbcsyx
            vnyelctsbx
                        
            hbjpermvdoc
            hmjpercovdb
            pjchombvred
            vdrobejphcm
                        
            ipbeqnsmujhvtdkowc
            bhmtonvedjkiuwcqsp
                        
            a
            eg
            t
                        
            vcmogkuapqrlsednzh
            lvhzknodrcapxuetqs
            nurkabhsywlceozdpfqv
            ingvptqocaszlkurehd
            skchauznlpvreodqg
                        
            oaqcwxnjr
            btdki
            cahmjsof
            vuegzpyl
                        
            cvy
            vyc
            yvc
                        
            pqrtafjgizcldshx
            ldsrhuqpjafgctinx
                        
            p
            p
            p
                        
            bwjtu
            ft
            fbp
            qosmg
                        
            oixgna
            wangjr
            xomcdugal
            agkftv
                        
            tvzoq
            oatqsvc
                        
            xvnkdyz
            kzdyafl
                        
            cxaquiretkwplvyszm
            cmlqxwuertsozyaphi
            fjzpsbytwnrxmqadgiceul
                        
            fnb
            p
            b
                        
            xvjswmpu
            fuwspvxm
                        
            ofwkhlpbdarcze
            eopfkwbazrhdl
                        
            m
            c
            a
            m
                        
            cnty
            ybonsp
            nykrh
            hnyc
                        
            tunpiybzjvskxwrgh
            zhfcxlatqbmdygwrosev
            yzdvgmxhesrbwtq
                        
            bflvmeipqojdngtyxuawh
            ktdjovceibnugpsfymqxhl
            vbueothjgpxfmilndqy
            qjinbdmfoerpvhglyutx
                        
            d
            d
            d
                        
            vcmh
            mch
                        
            ti
            bt
            rwhfdxtsy
            ti
            tmbi
                        
            ftiokrw
            tofkriw
            witkofr
            tkowrif
                        
            akfsdozrbuleytnjivq
            vaefyztrjboiqskhln
            ladtnokzvirjbsyefpq
                        
            kyzuqsnpmclrhi
            ulqznyrsckhpmi
            zilfphqmucyrsnk
                        
            yrtjqxbfmalw
            zsfmbqajcrgxyltwkv
            yqmjaxwolfbrt
            pnxlqmyrbwtfaj
                        
            qukbzapi
            uzakbq
            zkfbayv
            tkaznb
            qlbazk
                        
            pzfdbhyav
            swlmrnt
            rmw
            jn
            luqm
                        
            fmkgtbahndrqycowsplxiv
            micuraxlznwhgbfkystqpo
            ghrnsfwkcaoyimlbqtexp
                        
            kougsrdnt
            xtrd
            rtlwd
            hrpdaty
            xrdptm
                        
            nivmqo
            ivqnmo
            vmonqgi
                        
            tluszyrbkhg
            rhyucgzetibl
            wyuetgnlrzmh
            rhdzvluqajotgxyfp
                        
            vhqmbdneyafzgw
            lhwkvpaidgmyjzerq
            hauvndomegwzqty
                        
            jcwlh
            lwch
            ltcw
            weyckla
                        
            vcfrjqsgdtilbm
            edltfjsrcmvbgih
            bcylqfrmvstdgiej
            fjbzklvdnwasmptcgori
                        
            acyvqjfgopdzksmw
            dzofksgmycawpjvq
            fogswakdzxpcyvmjq
            mwqzsoydfcagpvjk
            agsmowfzpykdvcjq
                        
            imxe
            exim
            iexmd
                        
            zkxaqfudyi
            yacupxzkdqebfr
            xwfuakhnmqvdzly
            bqfydxakzru
                        
            ohaj
            ajho
            djoah
            ohaj
                        
            xmra
            mpa
            mwaqn
            am
            anm
                        
            sgqjafrnbm
            qfmrbjnas
            rsfnjabmq
            nsyjrbqfawm
            mjfarkqsbn
                        
            fba
            vfo
                        
            fncekxpr
            epkbzds
                        
            qrpejclbhaf
            lzcirpeqahjbf
            lsphcjfbqaewir
            rpnehulvcqayfj
                        
            ejkpzwght
            tzkjegwxph
                        
            mxtojefrbdlnkwaz
            mnwzjrbkaxoietfd
            daktrfexnojpbzmw
                        
            zyeq
            yzq
            cwnax
                        
            pvqzxgs
            xfqvszg
            xsqpzvg
                        
            banycodivlqzt
            mjbkheui
            rbwixjf
                        
            ltq
            tlq
            olxtq
            iltq
                        
            kerwtgcizshypfnxajdvolu
            gueyjtxonfrsliw
            lwruobigyesfnxtj
            leqrmsoyfbigntjuwx
                        
            qsfokthwrlx
            dlxosjagmr
            xljorvsg
                        
            dgohszbxkmvw
            gwzsboxvchkm
            xkzohpsgwbvjm
                        
            mquspzhxlgktcid
            xqktughicmdlzsp
            cusqlzghkptxmid
            zlscphgxdutimkq
                        
            vbrlu
            rbdvel
            lubvr
                        
            mkwzhyinogvxfl
            gwzovxnkfhm
            bksxgwzmvohn
            mnwvgxlzkho
            hgevxtklmwozn
                        
            m
            m
            jb
                        
            fjidp
            pjsid
            dfpji
            pdij
                        
            nvsmdfhlzowxiqjp
            npzqlhxifsvomdwj
            dmfhsqxvnjwpzoli
            vxoflmpdqzwjinsh
            qsjwxoifldmnpzhv
                        
            xthm
            mtxh
            txmh
            btxmwhd
                        
            b
            c
            kz
            c
                        
            ohvnbcapejswtmrk
            awskorhblqjepvtm
                        
            tvygs
            ysvtg
            gvsty
            ytsgv
            tvsyg
                        
            oyzucnqkxrimf
            quxnfyzmckir
            mrfkcqxyzniu
            yferzmqixkucn
            kfinqcrymxuz
                        
            gbuti
            bniufgtw
            giubt
            igutb
                        
            jgtmbxs
            mcbsxjt
                        
            huilkbsfytevzxwa
            ibuhkapfyszedxrv
            yufsaojhzkveibxg
                        
            mnswgtfdojhazrbq
            athqodnrgwmzsfjbp
            wtgdoaiuqnfxshbmrzj
                        
            wymeobr
            mrycewo
            oghswaxmzyufer
            pemowyr
                        
            vxcfqtzadwkmipnr
            iuarmqnpvdwkztx
            dktmqbnvwarzixp
                        
            w
            l
                        
            nprsxahzgfjltmwcbie
            zmrlbnegfxscwaiphj
            xzlwhejamsbipcgfrn
            pwrealhncjbzgxmifs
            mzwbepsjarflxnhcig
                        
            rqnie
            qxnimer
            ineqr
                        
            ergmlia
            jgtxbszvfhy
                        
            tpbklr
            plbtrk
            tlbkpr
            pkrlbt
                        
            e
            e
            e
                        
            ozqnktgywfjsm
            ywfzxqcnomg
            nqgfeczamywlo
            dyfznqiomgbw
                        
            sxzgtkpvyedf
            txgeyfmsd
            difagyxtse
                        
            qoehywxtjgpdkavfs
            bqjdigkxtwyfphev
                        
            dmni
            dimn
                        
            tfrvu
            tvaqruf
            ruvztfwy
            vuftqr
                        
            ydlrkcnoqahzjs
            fhlnkersbcy
            ervyucshkln
                        
            axkgudrfbvelt
            pjuegtolfxdvika
            evlkdfuzatgx
            bxtvaefudklg
            etxdlkafhguvr
                        
            hdcnjpfkbevusm
            mblvpcfjseuhdn
            bskjevpcufdnmh
                        
            wqnjbpoduamhytfkievszlgxc
            xjlygvwsmhnauzkipotb
            ixjknowtgzhbvumpylas
            wtgnmbxriuhjplvakzyso
                        
            tl
            tjl
            ayufcpid
            zxlm
            zm
                        
            cnmwbldgaisjyzpfq
            fjmrwsdibzqylcgpa
            lozcsdmqfyaijpbgtw
                        
            dtf
            fd
                        
            uqmtlwkfvo
            yhpgrcdi
            jhsnbezaxp
                        
            cefj
            tfjce
            tec
            wsec
                        
            onazewv
            wavykhnzd
            lxsgvrzabmtcpq
                        
            nbcrxusghzimepqa
            psqieacnuxohzgmbr
            xhgrbqcnfvuspieamz
            rixebsnmcpazdgjquh
            sngeamhprxfcbquzwi
                        
            grydbjpzscfunwx
            qcakmej
                        
            idhbcqoxzfuvt
            dtocbufh
            tfubdohc
                        
            yrp
            ypr
            pyr
            yrp
            rpy
                        
            bxlkfmjhqawictrnyvdpgus
            unbrdyifkgwcsmptjhxlaveq
            tlzjsycbnifvrdwuaphmkgqx
                        
            edkclbw
            elwabdk
                        
            iehpmokrctn
            pydojmegufz
            mpxoeayujw
                        
            ewdarsfjpvlchmqiboxg
            sfewicgrvdoxbmalhjqp
            tsphvciwfqdgrexalbomj
            vsxjleqokrfchybdpmiawg
            rlqeiwpvacogmhjfbxds
                        
            y
            y
                        
            vshoznkgwcdimrp
            nzdrkoiehltvwsmg
            gsjyoarznhwqvkdm
            fshedmouvlrnzkwcg
            vsokunwzrbdmhg
                        
            t
            t
            t
            ta
                        
            paejgztcsxq
            eszajxg
            znjdgasxe
            igxezjnas
                        
            ufakhtvdmr
            adfmjhvkrtu
            vmktjrzfdauh
            tumkdfvhra
            kutmavlhfrd
                        
            yxcnqsb
            hpufomvwaz
            lgai
            agfdw
                        
            bytx
            xrt
            rhdtx
                        
            qcuypb
            ycwlknup
            cpuy
            ucpy
                        
            l
            l
            l
            yl
            zlx
                        
            kradgyufzbxwole
            xydwzbgfauole
            alwugfoxbdyze
                        
            rob
            oer
            or
                        
            smul
            lhms
                        
            hxrpgin
            oxpcm
            xpmc
                        
            ekcjs
            nbkqpfjsc
            puckyszjo
            jsckb
                        
            mtakdsrxwecgozyi
            lijgwkmsratdxoyzu
            hkrtxgwyiamodsz
                        
            ucnfl
            nuflc
                        
            uoh
            shog
            osh
            oh
            hovazw
                        
            aywsjgbkn
            wgbqynskij
            ybsgknjpa
            ykqsbgnj
            bzsgdxcnyjke
                        
            zwlxdg
            wxgnlm
            gdjwlx
                        
            vfkurtlgnqpszwod
            nvtksfduzwqprglo
            fkolzvndqwgurtps
            oklfvqwtzgpunsdr
                        
            rbwfldicv
            fopvzijb
            hukbvgfqexyi
            rnzvisfb
            dbizvpaf
                        
            ruhvznkbqsxpmla
            zhbxpvaqrmknuse
            zbsrukpvnmaxwqh
            azqrbmnsxkhvpud
                        
            onsfuwzlx
            olsxufnvzw
            ozfluxswn
            oxwufzsln
                        
            xgzhikqe
                        
            pmwhykbvjduq
            mxpfyjuvswah
                        
            eylbn
            vebjwf
            prhomzs
            b
                        
            xqsvyfjgr
            wqxrsl
                        
            whapjuqyd
            uqgpwajd
            aqwpuj
            sfljpqnmaiuw
            kabjpqgewvuc
                        
            cyrpbuoslqkz
            zybkcxqfsrnue
            yszrkqtucob
                        
            rtweslzqynuoxhmpbc
            wuhbjyiackqfvpx
                        
            ahisomynwvbgklpjuzrxdtc
            lxavshmbwykztcuniorpgdj
            irdcxlzskwempjvghyatunbo
                        
            nlswcqkhvmxyfodrjizegu
            mlxaqjovndhyrcgiufzse
            fjdugnmlyeqzciovhxrws
                        
            suhwdifyrk
            giwtnkpsfauydmc
                        
            weshq
            qajovwhi
                        
            ph
            ph
            ph
            ph
                        
            mrouzhwixysv
            zarmsieovtyc
            yrivmozs
                        
            vsxbz
            svyxbzl
            szqvxb
            xzsbvq
                        
            b
            w
            w
            w
                        
            cwetnkaxfvgirdphsolyzj
            kapdhrvxezgwyfolijncts
            vdlwgrocshaexyktzifjnp
            ikezpjoraldxvfshwcgnty
            frdysohpmjtlkxgzewcanvi
                        
            wcoqzgbitjlyad
            duoznymtjbiwca
            wpahfobjcuiydtz
                        
            aclkhypervifzjbwqgxdstu
            sxlarjdgifwbztkchpuyvqe
            tfdbrjxepvkslwqzciguhya
            dyltqaruiwgckjvsbfxzhpe
                        
            qylp
            qpy
            yqpl
            qype
            pqy
                        
            xrkebt
            tbrkemx
            kebrtx
            xketbr
            etxrbk
                        
            yucsht
            sycwu
            vkuzcysl
                        
            qlfbrenuhm
            qzfrnelmu
            lrixmuefqn
            qjmdspkfornela
                        
            vmtc
            d
                        
            ait
            ita
            ait
            ati
            xavti
                        
            bxoygq
            mtgbyoq
                        
            nkes
            swkeg
            kes
            ksen
            kres
                        
            saouewqmlfd
            cygzlhbndtukixj
                        
            mxuboivyfpctzkael
            qjbtgukilvmy
            mktqbvhilnyu
            gtjykviblusm
            klbimtvyuq
                        
            fbdnvswoxpakthuz
            adwhspktonufxzv
            oamtszpdhkwyfnxuv
            tudnvpzawockfxhs
                        
            ugxpjzytdbm
            cerilwoby
                        
            onpmy
            mylpo
            pmoy
            lmypo
                        
            jaf
            afr
            af
                        
            casenkqdir
            sicuanvekrxh
            yizacrkosntpe
            agicxnrkesw
                        
            jqt
            ql
            qg
            jq
                        
            wc
            w
            w
            b
                        
            hzr
            g
            h
            iabscl
                        
            hqwpsagbnldrukzjifytx
            zpfrqidyshjkgwaxbtnul
            fjiprlyakugwdqzhtbnsx
            fiarukdwntlyhgzpbqsjx
                        
            czukvtah
            comukqhjbra
                        
            wmhncxkspailt
            uxfkbmrgt
                        
            teolabiy
            hpktibyaxoc
                        
            bqyarip
            wiyp
            piny
                        
            mtrgebyouwfk
            emwjyfrut
            eruvtfywm
            amwyfunelrptz
                        
            niduf
            nfdiu
            ifunjd
                        
            pelahycbn
            hpovfylkcbn
            iblwzqmxchgdstn
            bnrjhkcul
                        
            sfjzl
            sa
                        
            b
            d
            j
            ji
            j
                        
            zshvimlaw
            alwsvmhi
            vhlwsami
            vhsawlmi
                        
            awvgejcbhlsintoupdf
            gajfxdoebcphnsuwtl
                        
            tuickvpglhw
            lvthdgiuwp
            shuivyptl
                        
            nlxwpzuigcq
            lcwpufgxzniq
            wlxzuniqpgc
            pjgxclzuwiqn
                        
            tsozgkq
            lmvyuqracphne
            qfitdwgkzjx
                        
            k
            zk
            skh
            drkup
            ablk
                        
            qcr
            lq
                        
            m
            i
            jy
            m
                        
            hrsgfwaeytpl
            rifdnaq
                        
            detrifahwgjs
            piagxwmfsrhe
                        
            g
            l
            l
            t
            u
                        
            xlphfs
            tqnc
            knrgiu
                        
            auscpvhwfnkjgxdbtlzo
            wldqsafnxycpjzibrvu
            fzpdcuvngbxwslaj
            flsdbuwexnvajomzgpc
            wazdljnbuxcfpvs
                        
            ejpwgam
            pmgwja
            jgawmp
            wpamgj
                        
            jlupvzoyitmkeagfqnxswch
            csahitmwogflvunqxkjpzey
            vquxiozpmjatncwsykhlfeg
            ihoejuxnwtsckzylqmfvagp
            ovgfeciumakxsnpqyltzwhj
                        
            rlcy
            lyrg
            yr
            hyqr
                        
            pnv
            np
                        
            dxirheclfvkugyq
            lmqcngrihtbzkoa
                        
            xmdr
            cxdm
            jmxlsdgq
            dmx
            xmdo
                        
            tomwqa
            oqawmt
            kwtbmaoq
                        
            jm
            w
                        
            dem
            dme
            dejm
                        
            u
            u
            u
            u
                        
            dhqxlsbnp
            udbspl
            ldbspc
            kpsldbu
            subkldp
                        
            wconqgth
            vuhrlnzgt
            kghntm
            zhgnrt
                        
            tubwopjkrsglmfdqn
            kpixtmabowfsjlezdnqrcg
            ymjnolpqstbvfrgwkd
                        
            fykdachlrtxupbgq
            aprdlbchfkguytejx
            amvksrbwzlcfhyxgtupd
                        
            yac
            cay
            ydaeoc
                        
            yva
            avxy
            jyv
            vyo
                        
            ryozihbkmxegfvw
            ljexptfsyiwqcv
                        
            rszwmnhjp
            mslwygz
            zgwsm
                        
            lshvanz
            vnlha
            vnlha
                        
            glrmyfequjpboiczkhw
            uozqrgjhwfceyidblmaxpk
            wckorliguhqzmyfbepj
                        
            bc
            dcj
            bhc
                        
            ed
            ed
            de
            led
            de
                        
            geyxwujopkzd
            pkwuzxjdoegy
                        
            fplwjykaod
            rgz
                        
            qgpz
            fpgaq
                        
            yfwzkgqej
            vuzed
            znhsecid
                        
            vlgxshtipzfj
            vghilfsztxj
            hxpisvfgtlzj
            izshytgluxfvj
                        
            wyhoqaieuzf
            lcjpm
            btdxknglc
            rclts
                        
            qucrslhpoywjidgkmvab
            bvlidmwphqsoaykgurczj
            ramesuijngcxpqlkdovbwh
            ubapcqvshrgklwimojd
                        
            wfhcyjidtlqokx
            nhgvuwobcklisdqm
            drcnwvqslkaizohb
                        
            fidrkaw
            fr
            rueof
                        
            izypgsvlhfounrwemtdkqx
            yfthniwaxlskqopvurg
            xnqpustrywighalvbfko
                        
            gkihqofrasyz
            xptgbqkim
            iemgxqkup
                        
            rstvcynoaxpejid
            xajeyproin
            jixpmoreany
            mriewajpxgony
            rjaepyngiox
                        
            hysqpw
            quwtyiph
            hyqupw
            jvfrnywqhlp
            hwypqu
                        
            vojesgyt
            vgeuyoj
                        
            kq
            kgq
                        
            qash
            qhsdvl
                        
            ogecvxt
            gvtcxqeo
            xtvcogeu
                        
            aiuzktwjnshlevr
            ixuwcdgptmfzejl
                        
            mlsu
            luy
            wl
            tl
            golfv
                        
            ujxfyqdpchbk
            mckfrhiqudxp
            gkhbuxpcdfq
                        
            kamydczqfrsvg
            szgkfuvyicmrqa
            smcfgykqrvaz
                        
            hdyistonwvkuxm
            uqospkewltar
                        
            iloqsexhubfy
            deuiqbhfylxosw
            jqheudxwsiblyofa
            slahouqefyxib
            gfntrbcyqxoeisulh
                        
            rtkqzxi
            txzi
            vygxiwzt
            exztaci
                        
            pscgbunrdmlxz
            vmolpgzcxndr
            jrompngxdczl
            cxdlznrmgp
                        
            myopnajkcxd
            aoxdymgknjc
            fayoxjbdclvsnm
            cmjaxnoyd
            adenpocymjx
                        
            gwurxpealzqfn
            uqanelrwzpfxg
                        
            p
            p
            qgmpt
            p
            p
                        
            osjvfthlruqecwdgab
            omqzlxkfuybce
            oypfucqleibnm
                        
            jkylogfscpehwnzudbi
            yvqcuehfbzwsjplniogk
            cpgeosihzlbkwynjfu
            ekcwtnyjsgpohfuilbz
                        
            bqoxplvhnmgs
            jnmozhsdgqclb
            tuhbnyoqsmgwl
                        
            pyanchrwtoqe
            oenqatcphw
            wpqcnetoah
            nwqcapteho
                        
            wndqsh
            jfgnq
            pclbvk
                        
            gwav
            gawv
            gawv
            awvg
                        
            t
            zd
            jfcl
            t
                        
            ryhqtewijk
            fnqwhjkyrie
            qhjwrynki
            kogrhwuixqypj
                        
            vhytdaqf
            vyathqdf
                        
            vyeizmaopnglsqcxbdr
            acoixrsbglqvyzujdp
            bzqagplxovdcrsiy
            scxizbrdvpqgolya
            cylxpabuiodgsrvqz
                        
            hp
            hs
            rzuh
            he
                        
            glxeqjf
            tmufqbxiekdcj
            fxslvpeqj
            nzgpxjeqf
            xnzjlqefh
                        
            fcwd
            pxnowvtfrc
            lfcw
            wqgkcfd
                        
            teblqdskjwymgipvfocanzr
            glbojevqktirspuydncamwfz
                        
            zftjgnpuc
            zrcuqjtfn
            irdutbecnz
            nkcovuxzswmtlyah
            ztqncdu
                        
            kdirczys
            skrdzciy
            dcszyirk
                        
            weytvzmidgnbxl
            qdxfpkblsrouajvw
                        
            gmdupkbl
            klhtgdmsbp
            nbvpmdlkg
            pzibclmyeodqgk
            mpbxldkg
                        
            ikchnfbqgymdwpet
            gkmfnhtwxiqbdcyve
            mgdecfiotqknhbaw
            dsmrqfnkyctighzewb
            mqehgkwnscdbift
                        
            rzdnimcaxe
            dceaxbmzrt
            dmrecazx
            zeuqxmchlrydak
            rxeaczmd
                        
            nlbecfu
            nuelcf
            eufncl
            fluenc
                        
            skoltxqicvwfbhzdupem
            ilqsfyouaxvkwdcpth
                        
            gvecuatmospxl
            mhbxcyskojpeluv
            upfslomxcnve
            pqvmluiecsox
            mnpcfxzueloavts
                        
            mxquegw
            esgcbif
            gevrn
            cykzdhge
            bgzkieadl
                        
            hna
            nxha
                        
            qmorc
            rmcoq
            mcrqo
            cqorm
            qrcom
                        
            tewncgarvqjdoumkb
            jgwqdbcmorevutkn
            eomtvngdjrbcqkuw
                        
            aeckhjmvzn
            mvenkcuhazj
            hzkvdejamcn
            jevzhnmcak
            mhejzkcavn
                        
            yvpjqszo
            dtg
            atg
                        
            ghczoyrkviaudbtjwne
            dnbecrftkowghyuzvai
            wbygucnavdktezhior
                        
            vyoq
            voy
            oyv
            voy
                        
            um
            m
            m
                        
            eijf
            jief
            jgief
            jfie
            fijxde
                        
            xy
            xyc
            xy
            yx
            xy
                        
            ubcnvioqxlhm
            iqzbngoclhmxu
            iofwxbcmslndq
                        
            njqvmbatkxlfswizur
            dqxkwlzbnmvau
            vbuwmznakqlhx
            unvzlxmwaqkbg
                        
            izwlbfqdh
            wubacgyzrhfm
                        
            xvdzmaireyoqgfpub
            rndxuczebfyipvtogma
            vodgmwbxfzpeiyurja
                        
            hpdwqz
            rqdhpzwn
            whpdzq
            qphzwd
            cwqphvzd
                        
            rndgovb
            gdrvobn
            govndbr
            vgbnord
            nbvgord
                        
            ufxdk
            pehaqtz
            rwpiea
                        
            v
            v
            v
                        
            zrclgthjybdxwsnmvqi
            tnwyvidqrzxlgjscmbh
            isjynzrmbgwlxtpchdvq
            ynqwlihbxrmztsjdcgv
                        
            q
            q
            q
                        
            c
            c
            jb
            u
            c
                        
            vkejfcmgwixbnolutaqphrzsdy
            fqdwjngcuxviloyzkshmpteabr
                        
            rfv
            r
            rz
            qjmrg
                        
            wzhdyp
            r
            gbm
            aw
                        
            rsdywfzikhnlqc
            kifcrndqlswzhy
            hdfkiylsnqcrzw
                        
            lfhtzrxcj
            fbtzlhrcj
            lzdaftrjphco""";
    public static final String DAY_7_EXAMPLE = """
            light red bags contain 1 bright white bag, 2 muted yellow bags.
            dark orange bags contain 3 bright white bags, 4 muted yellow bags.
            bright white bags contain 1 shiny gold bag.
            muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.
            shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.
            dark olive bags contain 3 faded blue bags, 4 dotted black bags.
            vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.
            faded blue bags contain no other bags.
            dotted black bags contain no other bags.""";

    public static final String DAY_7_INPUT = """
            bright olive bags contain 5 dotted white bags, 2 wavy lavender bags.
            plaid brown bags contain 3 bright lime bags, 5 plaid coral bags.
            dim coral bags contain 1 shiny maroon bag, 2 bright orange bags, 3 clear lavender bags.
            dull olive bags contain 5 wavy purple bags, 2 plaid white bags, 4 vibrant magenta bags, 1 light brown bag.
            dim yellow bags contain 1 bright cyan bag, 3 striped green bags, 5 dim white bags.
            drab chartreuse bags contain 3 shiny lime bags, 2 bright indigo bags, 2 muted yellow bags, 5 dim tan bags.
            dim cyan bags contain 4 drab tomato bags, 3 dotted teal bags, 1 posh purple bag, 2 faded brown bags.
            striped indigo bags contain 2 wavy brown bags.
            dull coral bags contain 5 mirrored salmon bags.
            light violet bags contain 3 light maroon bags, 3 plaid purple bags, 1 pale lime bag, 2 pale orange bags.
            clear magenta bags contain 3 muted tan bags, 3 clear lime bags, 3 bright magenta bags, 3 faded purple bags.
            drab turquoise bags contain 1 dark violet bag.
            dim black bags contain 4 vibrant turquoise bags.
            dotted gray bags contain 1 posh salmon bag, 5 drab lime bags, 1 clear coral bag, 1 faded lime bag.
            light lime bags contain 5 wavy lavender bags, 3 shiny black bags.
            bright yellow bags contain 3 dotted beige bags, 4 clear purple bags, 4 faded salmon bags, 5 drab black bags.
            shiny teal bags contain 3 dotted chartreuse bags, 1 wavy yellow bag, 3 clear lavender bags.
            shiny crimson bags contain 2 light plum bags, 3 shiny black bags.
            shiny lime bags contain 1 dim turquoise bag, 4 pale fuchsia bags.
            pale lavender bags contain 3 bright lavender bags, 5 wavy blue bags.
            shiny purple bags contain no other bags.
            clear lime bags contain 2 drab bronze bags.
            vibrant lavender bags contain 2 plaid crimson bags, 3 plaid yellow bags.
            clear gray bags contain 4 shiny indigo bags, 1 vibrant salmon bag, 3 bright yellow bags, 2 light green bags.
            dark lime bags contain 1 light lime bag, 3 vibrant yellow bags, 5 faded bronze bags.
            bright chartreuse bags contain 5 mirrored olive bags, 2 mirrored white bags, 1 bright black bag, 2 clear olive bags.
            wavy red bags contain 5 bright black bags, 4 dotted salmon bags, 4 clear tomato bags, 4 faded teal bags.
            posh coral bags contain 4 posh plum bags, 4 shiny magenta bags, 4 light plum bags.
            shiny coral bags contain 5 shiny yellow bags.
            light bronze bags contain 2 shiny purple bags, 5 mirrored maroon bags, 2 light white bags.
            mirrored olive bags contain 5 mirrored white bags.
            pale crimson bags contain 2 vibrant gold bags, 1 bright yellow bag, 2 light green bags, 4 shiny gray bags.
            bright cyan bags contain 1 muted plum bag, 5 dark bronze bags, 4 dotted teal bags, 5 faded fuchsia bags.
            posh bronze bags contain 1 muted gold bag, 5 shiny turquoise bags, 3 wavy bronze bags.
            mirrored yellow bags contain 1 dull maroon bag, 2 posh orange bags, 3 striped lime bags, 4 plaid crimson bags.
            muted brown bags contain 5 mirrored indigo bags.
            posh lavender bags contain 2 dotted violet bags, 3 clear orange bags.
            shiny salmon bags contain 3 bright red bags, 1 light turquoise bag, 2 drab turquoise bags.
            striped teal bags contain no other bags.
            pale purple bags contain 1 faded yellow bag, 2 dotted beige bags, 1 dark red bag, 5 plaid yellow bags.
            drab tomato bags contain 2 faded aqua bags, 2 faded purple bags.
            wavy yellow bags contain 2 wavy gold bags, 1 dotted beige bag, 2 shiny gold bags, 4 posh tomato bags.
            shiny yellow bags contain 3 wavy brown bags, 5 dull violet bags, 2 muted tomato bags, 4 dull magenta bags.
            wavy brown bags contain no other bags.
            faded teal bags contain 5 muted plum bags, 1 posh indigo bag.
            vibrant tomato bags contain 1 pale blue bag.
            drab red bags contain 3 light teal bags, 4 shiny lime bags.
            muted beige bags contain 4 light teal bags, 2 vibrant orange bags, 1 drab turquoise bag.
            dotted orange bags contain 3 plaid cyan bags, 3 shiny beige bags, 1 bright chartreuse bag.
            posh fuchsia bags contain 3 posh tomato bags, 5 bright blue bags.
            striped lime bags contain 4 vibrant red bags, 1 bright yellow bag, 5 faded yellow bags, 3 dim gold bags.
            bright white bags contain 1 clear purple bag, 2 drab crimson bags.
            wavy olive bags contain 1 pale lavender bag, 2 dotted lime bags.
            clear black bags contain 2 pale yellow bags.
            clear brown bags contain 2 vibrant crimson bags.
            dotted aqua bags contain 4 light green bags, 4 light purple bags, 3 pale blue bags.
            dull red bags contain 1 bright fuchsia bag, 2 plaid crimson bags, 5 dotted salmon bags, 1 light salmon bag.
            light red bags contain 2 mirrored purple bags, 2 dull teal bags.
            mirrored bronze bags contain 4 striped lavender bags, 1 dotted brown bag, 1 posh maroon bag, 1 shiny chartreuse bag.
            light silver bags contain 4 dim orange bags, 1 dim aqua bag, 5 plaid crimson bags.
            faded violet bags contain 5 dotted tomato bags, 3 wavy beige bags.
            muted violet bags contain 1 dotted brown bag.
            muted black bags contain 3 shiny purple bags, 1 dark salmon bag, 3 bright lavender bags, 2 shiny white bags.
            muted tomato bags contain 3 dull magenta bags, 1 muted fuchsia bag.
            faded olive bags contain 3 bright coral bags, 5 dark salmon bags, 3 dotted lavender bags, 5 vibrant purple bags.
            dotted indigo bags contain 2 drab yellow bags, 5 dim coral bags, 3 striped green bags.
            dull turquoise bags contain 3 dark black bags.
            faded fuchsia bags contain 4 dull green bags, 5 pale lavender bags.
            mirrored gray bags contain 2 mirrored brown bags, 3 shiny gray bags, 2 light maroon bags.
            dull violet bags contain 5 muted tomato bags.
            vibrant crimson bags contain 1 vibrant tomato bag, 1 striped maroon bag, 3 drab plum bags.
            pale olive bags contain 3 shiny lime bags, 4 dim turquoise bags.
            muted orange bags contain 1 dull orange bag, 5 shiny tomato bags, 5 pale yellow bags, 1 faded orange bag.
            vibrant orange bags contain 5 muted yellow bags, 1 plaid salmon bag, 5 dim aqua bags.
            bright brown bags contain 3 muted gray bags, 2 dull cyan bags.
            clear coral bags contain 3 clear crimson bags, 4 dotted yellow bags, 1 bright orange bag.
            clear blue bags contain 1 posh tan bag.
            shiny cyan bags contain 3 light gold bags.
            plaid tomato bags contain 3 dull magenta bags, 2 clear brown bags, 1 wavy plum bag.
            dim magenta bags contain 5 dark orange bags.
            mirrored plum bags contain 3 dull green bags, 4 light violet bags, 2 vibrant bronze bags, 4 vibrant tomato bags.
            muted green bags contain 1 dull crimson bag, 2 drab crimson bags, 2 dim red bags.
            wavy gray bags contain 3 dark silver bags.
            mirrored white bags contain 4 bright yellow bags, 2 bright blue bags.
            dark white bags contain 2 posh turquoise bags, 2 light plum bags.
            striped maroon bags contain 5 shiny white bags, 3 shiny coral bags, 3 pale salmon bags.
            shiny aqua bags contain 1 bright indigo bag, 5 dim plum bags.
            vibrant chartreuse bags contain 3 drab gold bags, 1 striped cyan bag, 2 drab violet bags, 1 muted black bag.
            faded chartreuse bags contain 4 bright bronze bags, 3 dark silver bags, 1 bright aqua bag.
            shiny olive bags contain 1 light silver bag.
            dim chartreuse bags contain 5 striped tomato bags.
            vibrant red bags contain 3 mirrored beige bags.
            vibrant white bags contain 4 light aqua bags.
            dim gold bags contain 3 plaid gray bags.
            posh chartreuse bags contain 3 wavy blue bags, 5 dull maroon bags, 5 muted yellow bags.
            striped purple bags contain 4 shiny orange bags, 3 dim lavender bags, 3 muted lavender bags, 5 plaid tomato bags.
            plaid white bags contain 2 striped salmon bags.
            striped tomato bags contain 5 bright blue bags.
            bright lime bags contain 5 dark maroon bags, 1 shiny gray bag, 3 light white bags.
            vibrant yellow bags contain 3 plaid magenta bags, 3 wavy chartreuse bags, 3 bright lavender bags, 1 vibrant salmon bag.
            faded red bags contain 3 plaid turquoise bags, 2 wavy cyan bags, 5 dim chartreuse bags.
            dim red bags contain 4 muted coral bags.
            dotted beige bags contain no other bags.
            pale magenta bags contain 1 light violet bag, 2 mirrored lime bags.
            muted fuchsia bags contain no other bags.
            vibrant purple bags contain 5 shiny purple bags, 4 dim turquoise bags, 2 bright violet bags, 1 dotted beige bag.
            pale tomato bags contain 3 dull magenta bags, 5 dim turquoise bags.
            wavy gold bags contain 2 muted tomato bags, 5 posh tomato bags.
            dull green bags contain 1 shiny indigo bag, 3 dull maroon bags.
            muted magenta bags contain 1 clear tan bag, 5 dim tomato bags, 1 plaid purple bag, 1 wavy gray bag.
            drab bronze bags contain 5 dull violet bags, 1 light green bag, 3 dim turquoise bags.
            vibrant coral bags contain 5 bright black bags, 5 vibrant salmon bags.
            dim gray bags contain no other bags.
            mirrored black bags contain 5 mirrored lavender bags.
            muted cyan bags contain 5 mirrored gold bags.
            light aqua bags contain 1 dull cyan bag, 4 dull lavender bags, 2 wavy crimson bags.
            mirrored gold bags contain 1 light orange bag.
            vibrant cyan bags contain 2 pale chartreuse bags, 5 vibrant tan bags.
            dotted green bags contain 2 vibrant tan bags.
            vibrant tan bags contain 5 pale lime bags.
            drab magenta bags contain 3 light gold bags, 2 posh yellow bags, 4 mirrored salmon bags, 4 muted black bags.
            clear teal bags contain 3 vibrant red bags, 3 dotted crimson bags, 3 plaid fuchsia bags.
            dark coral bags contain 4 posh fuchsia bags, 5 mirrored fuchsia bags.
            bright plum bags contain 5 vibrant blue bags.
            drab indigo bags contain 2 shiny orange bags, 3 light indigo bags, 2 drab crimson bags, 5 light purple bags.
            shiny chartreuse bags contain 4 clear gold bags.
            plaid coral bags contain 1 shiny white bag, 2 dotted plum bags, 5 wavy indigo bags.
            dull silver bags contain 3 striped white bags, 2 faded gold bags, 3 dark fuchsia bags.
            dotted teal bags contain 5 clear lime bags.
            posh black bags contain 4 light plum bags, 4 dark plum bags, 4 vibrant plum bags.
            wavy black bags contain 5 bright bronze bags.
            mirrored magenta bags contain 3 muted olive bags, 5 striped tomato bags, 2 clear lavender bags.
            posh indigo bags contain 4 clear salmon bags, 3 vibrant salmon bags.
            vibrant brown bags contain 2 drab turquoise bags.
            pale blue bags contain 3 vibrant silver bags, 5 plaid turquoise bags.
            wavy lavender bags contain 5 plaid lime bags, 1 plaid crimson bag, 5 wavy coral bags, 1 dark gold bag.
            shiny tan bags contain 5 plaid blue bags, 3 shiny bronze bags, 1 mirrored gold bag, 4 faded salmon bags.
            muted purple bags contain 3 muted tan bags.
            mirrored crimson bags contain 2 drab plum bags, 3 muted magenta bags, 5 dim yellow bags.
            muted red bags contain 1 wavy indigo bag.
            dotted tomato bags contain 5 plaid turquoise bags, 1 dull lime bag.
            dull orange bags contain 2 shiny yellow bags, 1 drab bronze bag, 4 shiny lime bags.
            clear aqua bags contain 3 dull cyan bags, 2 bright yellow bags, 2 shiny maroon bags.
            light coral bags contain 4 wavy black bags.
            posh silver bags contain 5 light bronze bags, 2 clear purple bags, 5 pale fuchsia bags, 2 dull cyan bags.
            drab coral bags contain 2 posh yellow bags.
            light fuchsia bags contain 2 dim gray bags.
            faded cyan bags contain 1 faded orange bag.
            bright aqua bags contain 1 muted black bag, 1 muted chartreuse bag, 1 wavy blue bag.
            drab lavender bags contain 4 posh yellow bags.
            posh gray bags contain 4 shiny lime bags, 5 dotted gold bags, 4 vibrant maroon bags.
            plaid blue bags contain 5 vibrant tan bags, 5 mirrored white bags, 5 shiny purple bags, 1 clear white bag.
            shiny gray bags contain 2 muted fuchsia bags, 5 plaid crimson bags, 5 faded salmon bags.
            light brown bags contain 4 dotted tan bags, 5 wavy coral bags, 3 plaid teal bags.
            striped magenta bags contain 2 wavy turquoise bags.
            striped aqua bags contain 2 light cyan bags, 2 plaid lime bags, 2 mirrored orange bags, 1 posh lime bag.
            bright teal bags contain 1 faded plum bag, 1 dark blue bag, 1 posh cyan bag, 2 striped chartreuse bags.
            pale green bags contain 1 muted black bag, 4 faded olive bags, 1 wavy chartreuse bag, 5 dim maroon bags.
            vibrant bronze bags contain 3 vibrant lavender bags, 3 faded blue bags, 4 dim brown bags, 4 drab chartreuse bags.
            pale brown bags contain 3 faded yellow bags, 1 vibrant tomato bag.
            wavy aqua bags contain 1 striped magenta bag, 1 mirrored silver bag, 1 dim gold bag.
            dotted yellow bags contain 2 drab turquoise bags, 2 drab maroon bags, 1 light teal bag.
            pale salmon bags contain 2 bright indigo bags, 3 wavy violet bags.
            posh red bags contain 3 posh blue bags, 4 muted yellow bags, 5 dark silver bags.
            wavy violet bags contain 2 dotted lime bags, 2 vibrant purple bags, 1 dull maroon bag.
            drab purple bags contain 4 plaid crimson bags, 1 shiny plum bag.
            light black bags contain 2 faded teal bags, 1 faded yellow bag, 2 muted fuchsia bags.
            dim turquoise bags contain 4 wavy beige bags, 1 shiny plum bag, 3 muted tomato bags, 4 dull magenta bags.
            dark tan bags contain 5 drab chartreuse bags, 3 dim coral bags.
            striped gray bags contain 5 muted red bags, 1 bright blue bag, 5 wavy maroon bags.
            muted tan bags contain 5 drab turquoise bags, 1 light maroon bag, 5 plaid purple bags.
            posh green bags contain 3 dotted chartreuse bags, 4 muted yellow bags, 5 shiny gray bags, 1 dark black bag.
            mirrored lime bags contain 4 clear teal bags, 5 wavy coral bags, 2 mirrored beige bags.
            muted plum bags contain 5 faded yellow bags, 3 posh blue bags.
            dark maroon bags contain 2 dotted lavender bags.
            plaid green bags contain 3 wavy yellow bags, 1 shiny indigo bag, 4 mirrored maroon bags, 5 dim gray bags.
            mirrored teal bags contain 5 dim magenta bags, 1 dark magenta bag, 3 plaid green bags.
            wavy crimson bags contain 1 vibrant cyan bag, 2 light beige bags.
            wavy green bags contain 4 dim tan bags, 1 dotted lime bag, 5 drab white bags, 2 bright beige bags.
            shiny brown bags contain 5 dark silver bags, 3 shiny maroon bags, 5 dotted lavender bags.
            muted turquoise bags contain 5 dark indigo bags, 3 drab plum bags.
            mirrored lavender bags contain 2 clear salmon bags, 2 plaid maroon bags, 3 wavy cyan bags.
            drab blue bags contain 3 dotted olive bags, 1 shiny chartreuse bag, 1 drab magenta bag, 2 mirrored maroon bags.
            bright fuchsia bags contain 1 dark olive bag.
            pale turquoise bags contain 2 striped chartreuse bags.
            posh white bags contain 1 striped cyan bag, 1 plaid coral bag, 2 dim gray bags, 3 shiny red bags.
            drab brown bags contain 4 plaid red bags.
            pale gold bags contain 2 dim tan bags, 5 dark red bags, 4 vibrant cyan bags, 5 dark violet bags.
            plaid maroon bags contain 1 shiny lime bag, 4 faded lavender bags, 2 dim tan bags, 5 vibrant purple bags.
            vibrant green bags contain 1 drab purple bag, 2 faded blue bags.
            bright violet bags contain 1 dotted lavender bag, 5 light chartreuse bags, 4 bright indigo bags.
            bright magenta bags contain 5 shiny purple bags, 5 light teal bags, 2 pale purple bags, 4 pale silver bags.
            plaid orange bags contain 1 dull green bag.
            posh olive bags contain 5 dark silver bags, 3 drab yellow bags, 2 dim brown bags, 4 dull gray bags.
            light teal bags contain 3 dim gray bags.
            shiny beige bags contain 1 dark cyan bag, 1 vibrant yellow bag.
            drab cyan bags contain 4 dim silver bags, 1 wavy maroon bag.
            pale gray bags contain 2 dark salmon bags.
            plaid beige bags contain 3 bright purple bags, 1 drab plum bag, 4 shiny bronze bags, 3 drab salmon bags.
            dull plum bags contain 4 mirrored orange bags.
            shiny violet bags contain 3 drab olive bags.
            striped turquoise bags contain 1 faded green bag.
            dark aqua bags contain 5 clear crimson bags.
            dim crimson bags contain 3 faded chartreuse bags, 3 light orange bags, 4 striped plum bags.
            faded tan bags contain 1 dark cyan bag, 1 bright silver bag.
            faded brown bags contain 3 faded purple bags, 1 posh orange bag, 5 light silver bags.
            mirrored coral bags contain 1 vibrant tan bag.
            clear olive bags contain 2 pale olive bags.
            pale lime bags contain 2 muted fuchsia bags, 1 dim gray bag, 5 dotted beige bags, 5 striped teal bags.
            wavy white bags contain 3 dim indigo bags, 3 plaid green bags, 2 dull gold bags.
            pale plum bags contain 5 plaid gray bags.
            plaid yellow bags contain 5 dark yellow bags, 1 mirrored white bag, 5 shiny white bags, 1 shiny lime bag.
            drab salmon bags contain 2 vibrant blue bags, 2 plaid plum bags, 1 shiny gray bag, 3 bright black bags.
            striped fuchsia bags contain 2 striped teal bags, 5 drab black bags, 2 bright magenta bags.
            mirrored fuchsia bags contain 3 drab black bags.
            dark indigo bags contain 1 dull lime bag, 4 vibrant cyan bags, 1 bright gray bag, 3 pale purple bags.
            posh blue bags contain 1 shiny yellow bag.
            dark turquoise bags contain 4 bright yellow bags, 3 wavy bronze bags.
            posh tan bags contain 4 shiny plum bags, 4 dark silver bags, 3 wavy beige bags, 1 mirrored fuchsia bag.
            bright turquoise bags contain 1 dotted green bag, 4 faded silver bags, 1 plaid turquoise bag.
            vibrant teal bags contain 4 plaid teal bags, 3 pale blue bags.
            plaid purple bags contain 2 dim tan bags, 5 light turquoise bags.
            drab plum bags contain 2 dull green bags, 5 posh lavender bags, 3 drab tan bags.
            dark blue bags contain 3 mirrored indigo bags, 3 dark red bags.
            vibrant black bags contain 2 shiny red bags, 5 posh brown bags, 1 mirrored yellow bag.
            mirrored brown bags contain 1 shiny indigo bag, 2 shiny yellow bags, 5 shiny blue bags, 5 clear yellow bags.
            dotted crimson bags contain 3 posh tomato bags, 4 vibrant blue bags, 5 dark violet bags, 5 posh violet bags.
            shiny bronze bags contain 1 plaid maroon bag.
            drab orange bags contain 4 dotted crimson bags, 4 clear bronze bags, 3 pale turquoise bags, 5 dim coral bags.
            wavy fuchsia bags contain 4 posh fuchsia bags, 5 wavy purple bags, 2 muted cyan bags.
            plaid black bags contain 2 drab crimson bags, 4 vibrant tomato bags, 4 clear bronze bags, 4 faded lavender bags.
            mirrored red bags contain 3 shiny crimson bags.
            faded tomato bags contain 1 clear aqua bag, 3 vibrant bronze bags.
            light turquoise bags contain 2 posh silver bags, 2 shiny black bags, 5 muted blue bags.
            faded crimson bags contain 5 posh blue bags, 4 dim maroon bags.
            dull magenta bags contain no other bags.
            dark plum bags contain 5 vibrant purple bags, 5 wavy brown bags, 2 dark indigo bags.
            dotted white bags contain 1 dark teal bag, 5 dull white bags, 2 pale salmon bags, 1 dotted plum bag.
            wavy indigo bags contain 5 shiny maroon bags, 4 shiny lime bags.
            faded coral bags contain 5 dim indigo bags, 1 striped brown bag.
            vibrant turquoise bags contain 4 dotted magenta bags, 5 bright lavender bags, 5 plaid turquoise bags, 5 striped lavender bags.
            muted gray bags contain 1 mirrored white bag.
            dotted gold bags contain 4 dark brown bags.
            dim salmon bags contain 3 light gold bags, 4 plaid purple bags.
            clear salmon bags contain 3 striped lavender bags, 5 posh teal bags, 4 vibrant turquoise bags.
            vibrant olive bags contain 3 striped fuchsia bags, 3 muted indigo bags, 1 dotted yellow bag, 4 bright white bags.
            bright salmon bags contain 1 drab orange bag.
            muted maroon bags contain 5 dim crimson bags, 4 dark red bags, 5 plaid purple bags.
            light tan bags contain 2 dotted blue bags.
            dotted turquoise bags contain 4 faded lime bags, 2 dotted silver bags, 4 mirrored cyan bags.
            shiny magenta bags contain 1 mirrored salmon bag, 3 dim fuchsia bags, 3 muted red bags.
            dark cyan bags contain 5 dark brown bags, 5 vibrant silver bags, 5 dim green bags.
            dim violet bags contain 4 vibrant turquoise bags, 1 pale crimson bag, 4 bright red bags, 3 muted black bags.
            dull aqua bags contain 3 drab teal bags.
            dim aqua bags contain 3 vibrant blue bags, 4 pale salmon bags, 5 shiny bronze bags, 2 dim olive bags.
            light gray bags contain 4 dull white bags, 4 dim blue bags.
            dull salmon bags contain 1 striped fuchsia bag, 5 dark white bags, 2 pale tan bags.
            plaid teal bags contain 1 dim olive bag, 2 faded purple bags, 4 shiny gray bags, 1 shiny salmon bag.
            clear tan bags contain 1 clear lime bag, 4 mirrored turquoise bags, 4 bright white bags, 3 drab bronze bags.
            wavy beige bags contain 2 muted fuchsia bags, 3 clear bronze bags, 2 bright yellow bags.
            plaid salmon bags contain 2 drab bronze bags, 2 drab chartreuse bags, 4 plaid crimson bags, 5 shiny lime bags.
            drab lime bags contain 2 clear orange bags, 4 dotted silver bags, 5 dark maroon bags, 5 dim magenta bags.
            bright crimson bags contain 5 shiny maroon bags.
            clear turquoise bags contain 4 vibrant blue bags.
            clear lavender bags contain 3 pale fuchsia bags, 2 bright lavender bags, 2 dark orange bags, 1 dull magenta bag.
            clear green bags contain 3 clear orange bags.
            pale cyan bags contain 2 dull purple bags, 1 clear olive bag.
            posh lime bags contain 2 clear purple bags.
            dim lavender bags contain 3 clear crimson bags, 4 striped violet bags.
            faded indigo bags contain 5 dull cyan bags, 2 plaid blue bags, 4 striped teal bags.
            posh aqua bags contain 5 bright aqua bags, 2 shiny indigo bags, 2 drab silver bags, 1 vibrant turquoise bag.
            dark magenta bags contain 3 light silver bags.
            clear cyan bags contain 3 pale fuchsia bags, 2 shiny coral bags, 1 dull magenta bag, 4 dim turquoise bags.
            pale yellow bags contain 1 vibrant tan bag, 4 drab plum bags.
            dim plum bags contain 4 striped gray bags, 2 posh tomato bags, 1 drab black bag.
            dark purple bags contain 3 bright indigo bags, 3 dull purple bags.
            clear plum bags contain 4 bright cyan bags, 5 dim turquoise bags.
            faded magenta bags contain 1 muted olive bag, 3 plaid chartreuse bags.
            mirrored aqua bags contain 2 clear lavender bags.
            light white bags contain 3 dim gray bags, 3 bright white bags, 2 striped teal bags, 4 light green bags.
            clear gold bags contain 2 wavy coral bags.
            dull lavender bags contain 2 wavy beige bags, 3 drab black bags.
            dark yellow bags contain 3 wavy gray bags, 1 dark salmon bag, 2 vibrant tan bags.
            dotted black bags contain 4 dim plum bags, 2 bright white bags.
            posh tomato bags contain 5 wavy beige bags, 1 dim gray bag, 3 shiny lime bags, 5 bright black bags.
            bright indigo bags contain 4 striped teal bags, 1 shiny yellow bag, 5 dotted beige bags.
            dim purple bags contain 5 dark tan bags, 5 striped lavender bags.
            posh plum bags contain 5 posh maroon bags.
            pale bronze bags contain 5 shiny silver bags.
            striped crimson bags contain 2 dark indigo bags.
            plaid fuchsia bags contain 1 shiny lime bag, 4 mirrored orange bags.
            dark orange bags contain 2 dotted lavender bags, 1 posh blue bag, 2 muted yellow bags.
            dim blue bags contain 2 clear yellow bags.
            clear violet bags contain 2 shiny bronze bags.
            shiny blue bags contain 4 dark salmon bags, 5 posh plum bags.
            dull lime bags contain 5 plaid green bags, 3 bright black bags, 4 drab maroon bags.
            muted lavender bags contain 1 dark gray bag, 2 bright crimson bags.
            plaid gray bags contain 5 bright black bags, 5 pale silver bags.
            light yellow bags contain 2 mirrored crimson bags.
            muted chartreuse bags contain 1 pale fuchsia bag, 1 plaid purple bag.
            dim lime bags contain 3 dull maroon bags, 3 bright red bags, 3 drab black bags.
            light purple bags contain 5 dull violet bags, 5 vibrant lavender bags.
            posh orange bags contain 5 pale salmon bags, 5 light chartreuse bags, 1 dark red bag.
            vibrant violet bags contain 3 shiny gray bags.
            pale silver bags contain 5 mirrored salmon bags.
            light tomato bags contain 2 dim tan bags, 1 faded silver bag, 4 plaid yellow bags, 3 drab gold bags.
            posh salmon bags contain 3 bright plum bags.
            dotted plum bags contain 4 pale gold bags, 1 vibrant lavender bag, 2 pale blue bags.
            shiny lavender bags contain 1 dull gray bag, 4 muted teal bags, 2 dotted yellow bags, 2 bright turquoise bags.
            dim beige bags contain 2 wavy yellow bags, 2 drab violet bags, 1 wavy gold bag, 5 clear cyan bags.
            posh cyan bags contain 2 clear lavender bags, 4 clear salmon bags, 4 posh tan bags.
            light maroon bags contain 5 dark violet bags, 3 plaid lime bags, 3 wavy gold bags, 5 dotted lime bags.
            dotted lime bags contain 3 clear bronze bags, 5 dim turquoise bags.
            dim bronze bags contain 3 light fuchsia bags.
            faded black bags contain 3 light bronze bags, 2 bright beige bags.
            striped white bags contain 1 mirrored white bag.
            clear red bags contain 1 pale orange bag, 2 clear orange bags, 1 dull maroon bag, 3 dark bronze bags.
            muted lime bags contain 5 dim fuchsia bags.
            vibrant gold bags contain 4 wavy blue bags, 3 clear gray bags, 5 vibrant turquoise bags.
            clear silver bags contain 3 light violet bags, 5 dull turquoise bags.
            muted indigo bags contain 3 dark orange bags, 4 light gold bags.
            bright green bags contain 4 dark red bags.
            vibrant plum bags contain 5 dull tomato bags, 4 bright cyan bags, 4 plaid purple bags.
            wavy cyan bags contain 4 muted plum bags.
            plaid cyan bags contain 4 clear orange bags, 3 dull chartreuse bags.
            faded salmon bags contain 1 dim gray bag.
            shiny turquoise bags contain 3 light aqua bags, 1 vibrant beige bag, 4 clear turquoise bags, 1 faded silver bag.
            dotted silver bags contain 5 dotted blue bags, 1 dotted salmon bag.
            striped black bags contain 2 plaid crimson bags, 5 dotted silver bags, 5 dull maroon bags.
            dull indigo bags contain 4 dim magenta bags, 4 shiny magenta bags, 2 pale yellow bags, 1 plaid cyan bag.
            bright coral bags contain 1 shiny coral bag, 2 muted tomato bags, 4 drab crimson bags.
            faded bronze bags contain 5 posh cyan bags, 5 light beige bags, 1 drab yellow bag, 3 striped lime bags.
            drab green bags contain 1 clear cyan bag.
            pale black bags contain 2 muted yellow bags.
            muted salmon bags contain 4 plaid crimson bags, 2 vibrant lime bags.
            dark violet bags contain 4 clear cyan bags, 1 mirrored maroon bag, 5 drab black bags.
            faded aqua bags contain 3 pale fuchsia bags, 1 clear teal bag, 5 light white bags.
            vibrant indigo bags contain 5 light turquoise bags.
            bright blue bags contain 1 shiny purple bag, 1 wavy brown bag.
            dark olive bags contain 2 wavy beige bags.
            vibrant beige bags contain 3 wavy beige bags, 1 posh violet bag, 4 dark teal bags.
            dotted olive bags contain 5 dotted magenta bags.
            muted coral bags contain 2 vibrant silver bags, 3 dim coral bags.
            dark chartreuse bags contain 4 faded tomato bags, 2 light violet bags, 4 clear silver bags.
            light green bags contain no other bags.
            bright gray bags contain 2 drab yellow bags, 2 muted indigo bags.
            posh crimson bags contain 5 plaid indigo bags, 3 wavy lime bags, 2 dull turquoise bags, 5 faded salmon bags.
            drab yellow bags contain 3 shiny purple bags, 4 dark salmon bags, 3 shiny coral bags, 2 shiny plum bags.
            dull white bags contain 3 plaid lavender bags, 4 dark beige bags, 1 posh beige bag.
            drab olive bags contain 1 shiny cyan bag, 3 bright fuchsia bags.
            striped olive bags contain 2 drab aqua bags, 3 muted chartreuse bags, 2 clear red bags, 1 posh turquoise bag.
            posh purple bags contain 1 dull lime bag, 2 dull plum bags, 3 dark black bags.
            mirrored green bags contain 2 mirrored salmon bags.
            dull teal bags contain 1 dark gray bag, 1 posh indigo bag, 5 light coral bags.
            dim indigo bags contain 5 dark maroon bags.
            faded gray bags contain 4 muted crimson bags.
            light blue bags contain 2 plaid violet bags, 3 dim tomato bags, 4 plaid crimson bags, 5 dull orange bags.
            plaid turquoise bags contain 2 muted blue bags, 5 clear white bags, 1 dull violet bag.
            striped gold bags contain 2 striped brown bags, 1 wavy silver bag.
            faded blue bags contain 1 dark lavender bag, 4 muted yellow bags, 2 bright yellow bags, 2 dim tan bags.
            clear beige bags contain 5 dim tan bags, 4 faded blue bags, 2 bright green bags.
            shiny indigo bags contain 1 shiny purple bag.
            striped brown bags contain 2 light gold bags.
            shiny black bags contain 1 posh red bag, 5 bright black bags, 3 posh plum bags, 5 clear white bags.
            pale aqua bags contain 5 plaid purple bags, 3 wavy orange bags, 5 dotted purple bags, 4 bright lime bags.
            dark beige bags contain 3 clear white bags, 3 wavy yellow bags, 3 posh turquoise bags, 2 posh tan bags.
            striped green bags contain 3 posh red bags, 2 shiny salmon bags, 4 mirrored salmon bags, 3 posh teal bags.
            pale violet bags contain 5 wavy turquoise bags, 1 bright aqua bag.
            dim tomato bags contain 5 dim tan bags.
            mirrored cyan bags contain 5 shiny indigo bags, 3 faded blue bags.
            plaid magenta bags contain 3 mirrored brown bags, 5 pale olive bags, 2 clear purple bags.
            dotted tan bags contain 5 plaid turquoise bags.
            dull fuchsia bags contain 2 shiny crimson bags, 3 clear olive bags.
            clear orange bags contain 5 dotted lime bags, 2 dark olive bags, 3 bright yellow bags, 2 wavy violet bags.
            light indigo bags contain 1 drab plum bag, 5 dim lime bags.
            muted aqua bags contain 5 faded red bags, 5 pale blue bags, 5 dull lavender bags.
            faded plum bags contain 5 drab turquoise bags.
            dark gold bags contain 4 faded salmon bags, 4 bright black bags, 4 dim chartreuse bags.
            striped bronze bags contain 2 dark beige bags.
            mirrored purple bags contain 3 dim turquoise bags, 4 shiny bronze bags.
            faded white bags contain 4 faded tomato bags, 3 faded aqua bags, 5 faded gold bags, 4 vibrant orange bags.
            wavy turquoise bags contain 2 dotted olive bags, 1 muted yellow bag.
            striped blue bags contain 5 wavy bronze bags, 3 shiny chartreuse bags.
            dull gray bags contain 4 pale lavender bags.
            plaid plum bags contain 4 dim olive bags, 3 faded olive bags.
            pale coral bags contain 1 faded yellow bag, 3 shiny plum bags, 4 striped tomato bags, 4 shiny bronze bags.
            drab violet bags contain 2 plaid black bags, 5 bright violet bags, 3 pale blue bags.
            vibrant gray bags contain 4 vibrant indigo bags, 1 dull beige bag, 1 dull plum bag, 1 dotted brown bag.
            drab gray bags contain 5 mirrored brown bags, 5 bright coral bags.
            pale chartreuse bags contain 2 dull cyan bags, 4 mirrored fuchsia bags.
            dotted lavender bags contain 2 bright blue bags, 3 light chartreuse bags.
            dull tomato bags contain 5 wavy yellow bags.
            dull purple bags contain 5 wavy brown bags, 1 muted yellow bag.
            wavy orange bags contain 4 bright orange bags, 1 dotted purple bag, 3 dull blue bags, 3 light crimson bags.
            dotted purple bags contain 1 bright cyan bag, 5 wavy violet bags, 3 vibrant cyan bags.
            light lavender bags contain 4 shiny salmon bags, 4 mirrored salmon bags, 2 wavy magenta bags.
            plaid crimson bags contain 3 dotted salmon bags, 2 plaid maroon bags, 5 pale chartreuse bags, 3 dotted beige bags.
            plaid lavender bags contain 2 clear bronze bags, 5 light silver bags, 1 bright lavender bag.
            wavy lime bags contain 1 dim coral bag.
            clear tomato bags contain 1 dark violet bag.
            light gold bags contain 1 striped teal bag, 2 vibrant purple bags, 5 dark salmon bags.
            faded turquoise bags contain 1 shiny lime bag, 1 posh orange bag, 1 plaid maroon bag.
            wavy tomato bags contain 2 plaid plum bags, 1 dull lime bag, 3 dull maroon bags.
            faded beige bags contain 3 clear maroon bags, 1 dotted brown bag.
            dark black bags contain 1 faded salmon bag, 1 light green bag, 4 clear bronze bags, 4 dotted lavender bags.
            striped violet bags contain 4 mirrored beige bags.
            plaid chartreuse bags contain 2 dotted purple bags.
            posh maroon bags contain 5 wavy yellow bags, 2 pale chartreuse bags.
            posh yellow bags contain 5 mirrored blue bags, 2 wavy beige bags.
            bright black bags contain 3 clear bronze bags, 5 wavy gray bags.
            shiny tomato bags contain 3 dotted plum bags, 1 shiny orange bag, 4 faded teal bags, 1 bright lavender bag.
            dotted chartreuse bags contain 2 muted yellow bags, 4 faded cyan bags, 3 striped indigo bags, 1 drab red bag.
            pale tan bags contain 3 dotted chartreuse bags.
            dim white bags contain 2 dim tomato bags, 3 striped indigo bags, 1 faded red bag, 3 mirrored turquoise bags.
            mirrored salmon bags contain 1 pale chartreuse bag, 3 faded salmon bags, 2 dark silver bags.
            vibrant fuchsia bags contain 3 dim olive bags, 1 striped magenta bag, 2 dark magenta bags, 2 drab white bags.
            drab silver bags contain 2 dotted silver bags, 4 wavy yellow bags, 2 dim turquoise bags, 2 shiny maroon bags.
            dull yellow bags contain 2 posh teal bags, 1 muted chartreuse bag, 1 pale salmon bag, 1 posh beige bag.
            clear fuchsia bags contain 4 light turquoise bags, 1 dull white bag, 3 plaid indigo bags, 1 shiny gold bag.
            dark bronze bags contain 2 faded salmon bags.
            vibrant lime bags contain 3 dull chartreuse bags, 5 shiny yellow bags.
            wavy tan bags contain 4 wavy indigo bags, 3 dull crimson bags.
            mirrored tan bags contain 4 dim salmon bags, 5 dim tomato bags, 4 mirrored salmon bags, 3 drab indigo bags.
            plaid bronze bags contain 2 dotted silver bags, 1 striped black bag, 2 dotted tomato bags.
            shiny silver bags contain 2 muted salmon bags, 5 bright magenta bags, 2 drab lime bags.
            mirrored violet bags contain 1 shiny yellow bag, 5 vibrant tan bags.
            dotted red bags contain 3 posh beige bags, 3 posh lavender bags, 3 shiny lavender bags, 4 pale bronze bags.
            mirrored chartreuse bags contain 3 dark coral bags, 1 muted cyan bag.
            drab crimson bags contain 4 bright blue bags, 4 faded salmon bags.
            striped salmon bags contain 4 posh fuchsia bags, 4 faded salmon bags, 3 shiny yellow bags.
            dark gray bags contain 3 bright bronze bags.
            striped tan bags contain 3 vibrant green bags.
            dull maroon bags contain 1 muted tomato bag.
            light crimson bags contain 1 posh green bag.
            faded lavender bags contain 2 dotted beige bags.
            clear white bags contain 2 bright bronze bags, 2 wavy gray bags, 4 dull magenta bags, 2 shiny lime bags.
            dim orange bags contain 5 drab gray bags, 4 drab tan bags, 3 faded black bags, 2 pale cyan bags.
            faded green bags contain 4 dim blue bags.
            plaid aqua bags contain 2 drab indigo bags, 5 pale turquoise bags, 1 pale tomato bag.
            dotted magenta bags contain 5 pale lavender bags, 2 shiny yellow bags, 3 posh tomato bags.
            faded maroon bags contain 5 wavy plum bags, 2 shiny lime bags.
            dim silver bags contain 2 dull cyan bags, 1 shiny salmon bag, 1 striped salmon bag.
            dotted salmon bags contain 1 posh tomato bag, 4 bright black bags.
            vibrant salmon bags contain 2 dark silver bags.
            striped beige bags contain 2 clear tomato bags, 1 mirrored indigo bag, 2 pale chartreuse bags, 3 dull yellow bags.
            bright orange bags contain 1 pale lime bag.
            muted crimson bags contain 1 dotted lavender bag.
            muted bronze bags contain 3 light green bags.
            shiny fuchsia bags contain 4 plaid indigo bags, 5 bright fuchsia bags.
            bright red bags contain 2 posh fuchsia bags, 2 clear cyan bags.
            dim maroon bags contain 1 dotted beige bag, 2 drab black bags, 5 posh tomato bags, 3 striped lavender bags.
            bright gold bags contain 5 dim chartreuse bags, 1 vibrant salmon bag, 2 faded black bags.
            drab white bags contain 1 clear yellow bag, 4 pale cyan bags, 5 dark yellow bags.
            clear purple bags contain 2 wavy brown bags, 3 dull magenta bags, 5 dim gray bags, 4 shiny purple bags.
            dim green bags contain 2 posh turquoise bags, 4 light bronze bags.
            dull blue bags contain 1 light salmon bag, 1 posh red bag, 2 clear brown bags.
            bright silver bags contain 3 dotted bronze bags, 1 plaid blue bag, 2 light coral bags.
            bright bronze bags contain 3 dull magenta bags, 3 light white bags.
            shiny gold bags contain 3 wavy gold bags.
            wavy bronze bags contain 4 dull lime bags, 2 shiny white bags, 2 dim silver bags.
            muted yellow bags contain 5 dark bronze bags, 3 light white bags, 5 shiny coral bags, 4 shiny lime bags.
            faded orange bags contain 3 plaid maroon bags, 5 shiny plum bags, 2 mirrored white bags.
            vibrant silver bags contain 1 bright coral bag, 5 wavy blue bags, 1 mirrored maroon bag.
            mirrored maroon bags contain 5 drab crimson bags, 4 striped tomato bags.
            striped silver bags contain 2 dotted olive bags, 3 muted white bags, 5 dark black bags, 5 light gray bags.
            drab gold bags contain 2 clear coral bags.
            plaid tan bags contain 2 plaid orange bags, 2 muted beige bags, 2 mirrored purple bags.
            bright beige bags contain 5 light plum bags.
            light salmon bags contain 1 dark black bag, 5 mirrored salmon bags, 1 dim silver bag.
            dull beige bags contain 2 dark lavender bags.
            posh magenta bags contain 3 muted yellow bags.
            dotted violet bags contain 1 wavy brown bag, 3 dim turquoise bags.
            vibrant blue bags contain 4 wavy gray bags, 2 light turquoise bags, 1 drab bronze bag, 4 wavy cyan bags.
            wavy purple bags contain 3 dotted olive bags, 2 dull lime bags.
            wavy plum bags contain 3 posh chartreuse bags.
            dark silver bags contain no other bags.
            dark teal bags contain 4 posh red bags, 4 dark lavender bags.
            plaid lime bags contain 2 muted fuchsia bags.
            posh violet bags contain 5 clear olive bags.
            plaid olive bags contain 4 vibrant tan bags, 5 plaid fuchsia bags.
            mirrored indigo bags contain 5 posh maroon bags, 5 light turquoise bags.
            vibrant maroon bags contain 4 vibrant beige bags.
            light magenta bags contain 2 vibrant gray bags, 4 clear crimson bags.
            clear indigo bags contain 4 light gray bags, 1 plaid blue bag.
            shiny red bags contain 4 vibrant blue bags, 1 wavy brown bag, 5 striped maroon bags, 5 posh orange bags.
            dark crimson bags contain 2 bright yellow bags.
            dull crimson bags contain 5 striped salmon bags, 3 faded purple bags, 4 clear tomato bags.
            pale red bags contain 1 dotted cyan bag, 2 dark turquoise bags.
            striped plum bags contain 4 faded yellow bags, 1 posh blue bag.
            dim olive bags contain 1 light green bag, 1 faded salmon bag.
            dim brown bags contain 5 drab bronze bags, 2 dark red bags, 3 shiny gold bags.
            pale orange bags contain 3 pale gray bags, 1 clear olive bag.
            shiny green bags contain 2 clear turquoise bags, 1 mirrored aqua bag, 2 dull red bags, 4 dull bronze bags.
            dotted fuchsia bags contain 3 vibrant bronze bags, 1 dull maroon bag, 5 wavy indigo bags.
            posh teal bags contain 4 pale blue bags, 1 pale lime bag.
            pale teal bags contain 5 muted beige bags, 5 dark salmon bags, 2 faded black bags.
            vibrant aqua bags contain 5 vibrant silver bags, 5 shiny maroon bags.
            light olive bags contain 2 plaid turquoise bags.
            dim teal bags contain 1 muted magenta bag, 5 wavy maroon bags, 5 striped brown bags, 4 clear plum bags.
            faded silver bags contain 2 dull lavender bags.
            dark fuchsia bags contain 2 dim black bags, 3 dotted olive bags.
            dotted cyan bags contain 3 clear gold bags.
            pale beige bags contain 2 clear turquoise bags.
            vibrant magenta bags contain 5 light bronze bags, 3 drab black bags.
            pale indigo bags contain 2 vibrant cyan bags.
            clear bronze bags contain 1 vibrant salmon bag.
            pale white bags contain 4 faded orange bags.
            light chartreuse bags contain no other bags.
            striped chartreuse bags contain 4 clear gray bags.
            dark salmon bags contain 5 wavy gray bags, 1 light chartreuse bag, 2 clear gray bags.
            muted gold bags contain 3 bright lavender bags, 4 vibrant yellow bags, 3 posh silver bags.
            muted white bags contain 4 muted blue bags, 1 light gold bag.
            dim tan bags contain 5 posh fuchsia bags, 5 wavy brown bags, 1 dim turquoise bag.
            dull black bags contain 5 dotted cyan bags, 2 posh turquoise bags, 5 pale salmon bags.
            faded lime bags contain 4 mirrored orange bags, 2 vibrant orange bags, 2 dull lavender bags, 3 dotted chartreuse bags.
            drab tan bags contain 5 shiny maroon bags, 4 mirrored white bags, 3 dull plum bags, 4 shiny plum bags.
            muted olive bags contain 4 faded blue bags.
            dull chartreuse bags contain 4 shiny cyan bags, 5 dark silver bags, 2 dark violet bags, 2 bright lavender bags.
            posh turquoise bags contain 4 pale orange bags, 2 dotted yellow bags, 3 bright tomato bags, 2 vibrant turquoise bags.
            dull tan bags contain 2 mirrored purple bags.
            drab teal bags contain 1 dull lavender bag.
            light beige bags contain 3 plaid yellow bags, 4 faded lavender bags.
            wavy blue bags contain 3 shiny purple bags.
            striped orange bags contain 4 vibrant cyan bags.
            shiny orange bags contain 2 shiny black bags, 2 shiny coral bags.
            dull brown bags contain 3 wavy bronze bags.
            mirrored silver bags contain 4 vibrant tan bags, 4 faded fuchsia bags, 5 dark red bags, 3 wavy blue bags.
            wavy teal bags contain 1 pale coral bag.
            drab black bags contain 4 wavy brown bags, 4 striped teal bags, 2 muted fuchsia bags, 4 shiny indigo bags.
            drab aqua bags contain 2 bright orange bags, 1 vibrant tan bag.
            mirrored orange bags contain 2 striped salmon bags, 1 wavy gray bag, 5 pale blue bags, 4 mirrored salmon bags.
            muted teal bags contain 4 drab tan bags, 4 posh beige bags, 4 faded green bags.
            faded yellow bags contain 3 shiny purple bags, 3 wavy blue bags, 1 muted fuchsia bag.
            shiny maroon bags contain 3 striped salmon bags, 5 wavy violet bags.
            wavy silver bags contain 4 faded blue bags, 2 vibrant salmon bags, 5 plaid gray bags.
            shiny white bags contain 4 dark salmon bags.
            posh brown bags contain 5 drab red bags.
            bright purple bags contain 2 dim silver bags.
            dotted brown bags contain 1 dotted yellow bag.
            striped lavender bags contain 5 shiny gold bags, 5 mirrored fuchsia bags.
            dark lavender bags contain 3 bright violet bags, 5 dull violet bags, 1 shiny coral bag.
            drab maroon bags contain 2 light white bags, 2 vibrant turquoise bags, 2 vibrant cyan bags.
            pale maroon bags contain 3 dim red bags.
            plaid gold bags contain 4 posh bronze bags.
            striped coral bags contain 5 drab blue bags, 3 muted bronze bags.
            drab fuchsia bags contain 1 shiny bronze bag.
            light cyan bags contain 1 dotted fuchsia bag, 1 drab violet bag.
            plaid silver bags contain 3 clear gray bags, 5 light teal bags, 3 vibrant tan bags, 1 bright white bag.
            wavy coral bags contain 1 shiny black bag, 3 mirrored maroon bags.
            posh gold bags contain 3 bright yellow bags, 2 dark lavender bags.
            drab beige bags contain 5 bright gray bags, 3 pale olive bags, 3 plaid chartreuse bags.
            wavy salmon bags contain 5 shiny beige bags, 1 posh violet bag.
            pale fuchsia bags contain 4 wavy gray bags, 1 wavy beige bag.
            dim fuchsia bags contain 1 dim beige bag, 4 muted cyan bags, 1 clear lavender bag.
            bright tan bags contain 2 drab crimson bags.
            striped red bags contain 2 muted black bags.
            dark green bags contain 5 plaid red bags.
            faded gold bags contain 2 muted white bags, 5 clear yellow bags, 1 light fuchsia bag, 4 dotted violet bags.
            striped cyan bags contain 2 drab purple bags, 1 shiny fuchsia bag, 2 light salmon bags.
            dull bronze bags contain 1 faded black bag, 4 dull lavender bags.
            dull cyan bags contain 5 faded salmon bags, 1 clear bronze bag.
            shiny plum bags contain 2 dark silver bags.
            mirrored beige bags contain 3 posh red bags, 1 clear chartreuse bag, 2 muted magenta bags.
            mirrored tomato bags contain 3 posh lavender bags, 4 light violet bags, 1 wavy crimson bag, 1 dim tan bag.
            light plum bags contain 5 dim tan bags, 2 dotted beige bags, 4 posh blue bags, 4 light green bags.
            mirrored blue bags contain 4 faded lavender bags, 4 pale salmon bags.
            clear maroon bags contain 3 dark salmon bags, 2 shiny brown bags, 4 wavy purple bags, 1 plaid yellow bag.
            bright maroon bags contain 4 pale turquoise bags, 4 drab violet bags, 2 clear lime bags.
            plaid red bags contain 1 drab turquoise bag, 1 striped teal bag, 4 plaid yellow bags.
            mirrored turquoise bags contain 3 clear orange bags, 5 bright blue bags, 3 posh plum bags.
            dark brown bags contain 5 striped fuchsia bags, 5 mirrored plum bags, 1 wavy crimson bag, 4 clear gray bags.
            muted silver bags contain 2 dim tan bags, 2 muted crimson bags.
            dark red bags contain 2 wavy beige bags, 1 clear bronze bag, 5 shiny coral bags, 3 shiny indigo bags.
            dark tomato bags contain 2 faded gray bags, 2 dim tomato bags.
            muted blue bags contain 5 posh silver bags.
            wavy magenta bags contain 4 faded tomato bags.
            plaid violet bags contain 5 dim aqua bags, 4 drab orange bags, 4 posh lavender bags, 2 dull yellow bags.
            faded purple bags contain 4 vibrant bronze bags, 5 bright bronze bags, 1 faded red bag, 4 clear tan bags.
            wavy chartreuse bags contain 5 bright white bags, 2 shiny coral bags, 3 bright cyan bags.
            plaid indigo bags contain 3 pale purple bags, 2 posh orange bags.
            bright tomato bags contain 5 plaid blue bags, 2 posh orange bags, 1 vibrant purple bag.
            wavy maroon bags contain 1 striped white bag.
            bright lavender bags contain 3 faded salmon bags, 5 mirrored maroon bags, 5 posh tomato bags.
            light orange bags contain 2 bright blue bags, 1 dark yellow bag, 2 clear gray bags, 2 striped salmon bags.
            posh beige bags contain 2 dark orange bags.
            clear chartreuse bags contain 5 striped maroon bags, 5 light chartreuse bags, 4 drab black bags.
            dotted blue bags contain 4 clear cyan bags.
            dotted coral bags contain 4 shiny tomato bags, 1 posh gold bag, 5 muted olive bags.
            striped yellow bags contain 5 faded purple bags, 4 drab purple bags, 5 dark yellow bags, 5 muted red bags.
            dull gold bags contain 1 light turquoise bag.
            dotted maroon bags contain 3 dark maroon bags, 2 faded yellow bags.
            clear yellow bags contain 2 plaid maroon bags, 5 bright gray bags, 4 pale olive bags, 5 shiny indigo bags.
            clear crimson bags contain 5 faded yellow bags.
            dotted bronze bags contain 2 muted tomato bags.""";
}
