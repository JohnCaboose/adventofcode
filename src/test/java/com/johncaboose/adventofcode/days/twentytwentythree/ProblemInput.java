package com.johncaboose.adventofcode.days.twentytwentythree;

public class ProblemInput {

    public static final String DAY_1_EXAMPLE = """
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet""";
    public static final String DAY_1_EXAMPLE_2 = """
            two1nine
            eightwothree
            abcone2threexyz
            xtwone3four
            4nineeightseven2
            zoneight234
            7pqrstsixteen""";
    public static final String DAY_1_INPUT = """
            hcpjssql4kjhbcqzkvr2fivebpllzqbkhg
            4threethreegctxg3dmbm1
            1lxk2hfmcgxtmps89mdvkl
            sixbfjblhsjr3
            soneighttwo39ktl132
            sqd1fivenfsmpsmjtscfivedzxfhnbbj8six
            9oneonetwofiveseven42
            7mhpslddjtwo9sixkzdvqzvggvfoursdvd
            onetwothreextbtpkrcphhp4kfplhqdvp9
            89l991eightttxtj3
            7znvzpdnnnfsevennrvlhseven16b
            5eight8579
            6twotwo18eightthreeeight
            5fourthreesbgsix6two
            nineoneh841dxnrvcmtwo
            9one7three9kbrdcdeighttqmgg
            vsrsixfiveninestndvtfqmr7
            six5eight
            prvdoneqmsnstjgq7bdshdninenine9
            3715nineeighthxnqxhg4ch
            zvdhmnvnineqjghs93bmmxrtxhrvsksqgfive
            6hznsq5qjcjsvgnl
            51gzmkn5
            2rscfiveonetwoonexndftfive
            5gkxjcskc89eight
            onethreeoneeightqskd4zhr
            8dnkzpsfzrqljhkx6one
            threenine41tczlqlsjjrkhsjm3jqhgscgspx
            sevennine4dkkqrrjcpfourckzxj71one
            nineseven2sixnineqd
            eight72threefivefour9onefive
            gprffive3kksp
            qcl27four4
            sfdreight4ninesix5
            1756gvjdggpchc9
            threerzcxhlvdjkhtlxlg6ninetwonine1
            thnine5
            twoninejxxm1one
            nc73threetwoeight
            s2sixbnsmngsclg
            6tplzllbthreecljqhtgqlkxnl
            4four4
            ntxmgvkm9
            5fourslt8gqdrdsseven6six
            fourfour26
            263eightfivefthkfxfxnfms2
            716
            twodgksqsdtrsrpeight8five1
            jdhtxp1nine8jrxrrkc12six3
            2gmmtgzstg1rbsix
            threemhmfivevg6sixlppbjmmninej
            9eighthvxnlvthqjtpsjnleightwokq
            three8threeeightmcnvlmj7
            sixmn5
            8jctlksix
            fkrxrsseven6dcxzhdmvtg
            sixxgrnqk8qvgrqbs
            skprzqrt3h65eighteightdlpljhnjdp
            onelpfdt669hrzninethree
            3ninehgveightzppzljfourfour4
            838onejonehznckplj5nine
            lrdtwo61
            niner5kqzqg
            4eight8seventwo3
            fvbrtpbcfive24
            twoczldjcsix1six
            9fourklmzjmnlgtvh
            five7nine2nvjbprppthnine8
            tmht6mfjnnpznrv6jscqfjxkvtgklmprsix
            svpqzpj9sixsixxnvbprh1
            eight8two47g11
            7qxbfj5c
            2hzcmzl7
            4gbkshmmksfseven
            8sevenone
            oneseven1three
            9three2fjldqmdhv
            3vfsqqzrpzq38twotwondxrc
            sixbgz1four
            trzvzjzeight7sixdgq41
            94rj2
            twofour3tkjjvjsfourz3
            cxtgfmqddm9five61f
            ninesfvfmrk7vrgddhzvh11onethree
            zhdbmjhsfv5nkkllpthree88seven
            69zlsvkk2six
            576dqcspgvd
            7flqjn9
            eightqxsix4fiveeightfive
            oneeight9onemll8ccgrrqvrp
            7qdscnine5two
            eightfive5threekkrb741xgnndtvzd
            6xpdgng622cplsixone
            ninesix4jxxgjppthree9six
            87sixtwotcjlss
            njlfxvcxbpmk6ttdng
            sevenzcprvz4eightnk6ninefourtwo
            2twomvdjvrhrsgrqhp
            eightonehtmvfvxeight2onettnkt
            ngbtlr8five5fourtwotwojsdl
            39sixthree9
            4ntgdsbshd32
            ninetwo5htqnmctjkxrttgtdfone
            bckgxxpreight4eightbpchtxv8seven
            twoeight2sxnxsfkxqkbsix
            one8kjtgoneeightsdcmrllcfiveqxsj7
            gsfmgl4one43
            zthm8cmmb83twotwothree
            seventgd6
            sixphptdkzcqsixlgztbffhs5
            2onenine9sevenonefourfvd
            1djkqqd
            slfldflseven6five85tvxbzvmjvjhpbnqtfxtvcfc
            six2kseven
            seven7464
            zcslbttpgk3foureightone5
            4oneone4453
            fivex6lz
            zceightwobvhfqqzngtctgsq3rjzmtnmbx7xtc
            zxrxseven7ncr5m4
            7ninelzrrzmlfourpssbjpkckj9
            6vbrpprjfive3twovfklfh7
            9cgkqfgccl5fivezlhcfgvm
            bttvvjkgp6clntnrksthreeeight7
            threesix8eight4foureightkjxjfgxlcfqnh
            three5foursevenlhlmrzrdvxthreeglfvksgmxlrz
            c48seventhree
            sevenddgcqkgkr9fourppxqzpqxpkzjpcc51rh
            3rn2zhhth
            628nine
            seven86four
            7bdqmrbdnzbnine
            nine621rlqzseven
            73two
            rnbchhfk6884fivejtr5twonet
            qpjlhpnxpnszsrgglpnlclml5qone
            3threeninesixdsdsjvz
            vmeightbtzkbvdjbcqsx5mfqft8sevensl
            jzvqqfzxrbfbhonetwo2knrhfl
            1hjkmdchmone2twotwosix
            sixseven9
            9two8zlkph
            7twoz
            ninergqldrlxvn148zdpvgdrptvpg9nbbhgk
            szcspm5sixtwovtrmvrthreefour7oneightqqj
            foursixthreetwo7vjjdgcqrbh7
            qgqhpnkzgrfivenine7foursixlgqcxzkcjr
            phhljpb4zsixpxt22four3
            twogjbhrdrnl9six
            znbkscjpxnjzninesevenjnkdvckhgtwo5five
            xfkgbhrrpckrftonenxghthree2mz
            fivefdgxmb894ztnrljrr7kxzrvlxjcq2
            nqblpkxmzcnhplrhcpv4
            tq3nine9
            bqxh6nine57
            nine5fgvfmthreethree2
            2bqvhb79rrczpptxbb4lmcdgkqm6
            seven1eightnine3seventhreeeightlcsspsb
            one7llljbvzngchlnineoneeight
            dcztsfgsix8sixjlghbxslpd
            4v365
            5fiveqsgkf63fivefmp9seven
            2gpnfjrnmcvjfninelmdzkvrmkjqvcp
            2lznfour1threerqjtphnine
            nzvvxdbb8cpxjdlqxxfour
            joneight9nlqrzbthreeonenine
            four5hhnbcc8eight4eightbvhsfktmk
            sixfpnzsixgksix2s
            9onefmkkgvzlzqpl7eight5
            p8vceight1
            dnkzmnvffthreefive7sevenxthdvzxxg
            nine4seven38mbhpcdfour
            4seventwo7nine
            tqxhpxmgllzvbxlfvrmvsgkk3four6
            xgvvninensvnjhglfng8ninefive
            threecqccjxnfournineeight7
            fkone9bstvjhmrzh9qfhnxdld1
            72gxqrns94
            8xkqjdvone1339dgdzj
            61zvcqrbdlgfivefourdcvpfpspbgxsmjbmblkz
            4ninethreelbjtv89xnrt
            honeightfivegjbghjfbvlv78vcg
            sixjg5dbhkr2sevenjsbrvfv
            6onenineone
            688ninetwo
            7tworbz
            jthreesixsixfive7fiveseven
            slnsnqn1glrhtrltdlvqmmgfrvckhkbxtsixxjlzqh
            msj8
            pqz759rdgv2fourfjvdqvtn3
            gscbthreethree3five7five68
            3seven2
            5llpcgxpcv85d39qqkxltchpc
            2vflrsvfive7hnkmgfvnnsqz
            7lfdthreegbkqsevenninefive5nj
            3dsddfournine
            2gghdftbmm9three
            jnfxg762
            pgrzbonenine3eight959nine
            4phpncp2six
            hvdvhprnsplknvdqlx9eightgcxvphpv4687
            5ninembmxsppthreefour3
            tworgvxntpjhr7xftlhponehzqdggmbhp62
            sseven5two
            rhtzskrlvtmzgkszone1eightone
            1tjrchtrxknstbmxh2zdpglqsxpdbnx4
            8vvpsixbjxxkxclxchjvlvvqqdspqrgh
            2six1gfzlrvxgfntqhjqd
            8onenineeightsevendfhgbbmc1
            six12three81vfive
            four153one
            1dfbkfpnqvthreemqzlvcvdnsxgfourtwovhmf
            tll5xhqgfvq1hsphkgclrzhmlsqeight8
            2three9sixkprzkzrdzjndjtptbmbsfjzplss
            36onepntjtvpjfour4eightnine
            8t2ninefour6sixjx
            gpnfthree16xj8fqx8n
            seven42eight5pzxvx
            6ninefour
            zrmgttjv3vtnlmrkdtjgsdhc
            8plhvcl8sblzgsd
            one77phjchvd5six
            6gfour8bvgcxsrslrqf
            36jllpvdrzqkdjvcts1fjkbfttbeightseven
            4nine663mjtdlmqqrvsxnlhcz3six
            ftzqhxjvstrz18threepzrjkkqxrd4
            mtbvkvsq38rzk
            xtldnjzthree7
            3eightfive83nine32
            3qpdkkdfxgvlktkkbtptnzqnzxl7four5
            nine97eight212
            mcvj6
            sixninefkgntpsboneskphgqmvfq81
            six7mdntzshzr6two81bklxmvcv
            qs7ft
            fiveqzpcskcrlninebnkvgthreengfbfhln3sevenfour
            spjqtwo4seventwo
            8fqq
            4eightgltkrzs64spgdrhf35
            ffckrhfjb9
            lv128sixninefive
            6th
            sevenfive19eightninenine9seven
            jhmfcj6foursevenmszfjthree8gkpdpnnxbhj
            8gvjzvvthreeseven33
            threexnfjlnkmkt9seven949sixgsfdkzzk
            eightvfdjxhcvonebnzhrrqpvxdmnqxtzf7tzl
            fivesjkthreem6twokhdrsk1hz
            641pqhdbzk99onetwofour
            sevenxsskzhcppdthree48
            2two49qcnine
            sevenseventhreemqcgvbr8onernnone
            rkclvq4seven446dkjfpgtseightwobc
            two11pzzzxlqqqnfxxqg
            5911four4three6six
            7jsvdgx
            dvdffj2
            8fourfourdbrbbnsjrzhj7
            pzkckdkmfonefivetwozmdxrdmztwo6xd
            48sevenninexqglbmcnbgsdtjtkcp
            nine4rbbnhlbmfseventwobqbrpvqssxcxqsmcg
            7lgzfznxpspthreedgreightwopmf
            zmlhnk9bhtdqmxzvgdssixtvvrkpznvjpn
            11five16snqbrtqbx
            gnvmgninenine83
            onehnmbqdhtpmone29vhhxsxzkrnsix
            9dpcdfxp3qtcktbbxglrfp2dsjdhbdncbtxj
            fouronezh9ninethreenine
            6lrbthreemplnineseven
            five6onefourthree
            3twoseven
            8sixxtmqfxnp234twohsfr
            6seven5ninenine3
            sevenfivectsglsqstxjmgdsjrzfveight7
            four9sevensixs7onergssqzfmbvbspmr
            jjeightwosix9fklkfxrfhjxksznine
            39six
            ndbbqgqf3gvzczcdkpzxlxfjshr9
            fourxmnjvrbkln8mnzvpthree5
            foureight94
            ztjplxlksevenseven8ktlb
            94ngctc1hnvkpgxnmxxsp1
            qchqnmstcsevenmkkmkxltzjtfsc798
            97zkqgmsfive8
            nqkjxjvvb7nqbgtr45sixsixgczfive
            pvrjzqpfoureightfivetwo4zcmmcffnlthree
            xktoneighttwoqljrsctbzxxqjtwo1ftsjczrsevenzqcdxtnktwo
            eightjbxnnhscg5seven
            gpjxfmgpdcmbc6
            six1two9
            g8fivethree
            kv5nine9fzkvznlfive
            1ts86
            75five6
            threepbhr81
            ninek2xhmcmtnrf
            eightkntlndvjskzfour5c
            threehpg7kgnjkgqzs87
            4bnnpbgqpmfour2rjpthreeqmjrb9four
            four24three
            2chsixsixqfcksfpqbt
            2ztjdqjr4kpbxmcdpd
            xfive79two775eightwohm
            cpcjzmltqbtljgqqvnine78three
            5sevenl
            6tqsvxbbqx
            two9zkvfcllbpmmsscvn2fivecndc4
            zqmz46fivejfljvptwosix
            4zmhnjftwo1qmtqnhbtt
            sixsevenlknss2gzcvfshvfpkfcq9four6
            81mjbktphdjfv6glzl
            five6cpctwofiveccsvlshnj
            three8lninexhlqmrhm
            225onecrjvgckdbk6
            nine154fivemtgvpfnlgx
            rtmpvkpdtgtm67five
            seventmcrfpsfpx9seven9five1seven9
            rpftkjkhfive858mgjjgcpcsevenxrjfsxrr
            kvcthrfkcjvq3659
            kxnbtm5
            three7mmqmcpkz7sixhpzsxpknszbdr
            nine92csvcxhcr7
            7fouronefive6qfml9eight5
            489hdvzxfsgjngkzkdvfiveone3
            6sgnbhjqqxqeightgmvtqdcfivesix
            dfphtx3
            four8mcrszfpbbsjdmqpkjdgftqhskp9
            7763tqbgpfltbrcgm6
            9onevrnmrhtb5onethree3zbpdfznxbkbscjtjb
            pninethreetwo76tclssnpz
            9fournine
            63nxvsmhbngseventwosix
            djnine3jzghptvbpbseven9
            2six16one
            4eight2
            four85nzfour69one
            6625lbssixkrxsfshjp
            2133eightzmfxcrlhngthree
            four7fcszmcs
            gtfqrjqxkxjkblfstrcszcrz3one1mjhbv
            vbpseven2four
            2bngj8rdxvdcxdvj7four
            2pqnineeighttworps
            twoszzrbzlqb8sixq
            six54bgrpn
            17five
            8threefrvhj19fivethree42
            eightltpcssixtwoxms5ghf
            sevenonefive57mdpqbsdttdxxzctcqonethree
            threersqkhmgbsnlszskhslp57oneightlm
            six9threerzdsfkzj
            rskvrvxrxntspzstworpxfxqjrvnmhgsvcdthree21zvjlxd
            3gdkcg
            vvvxkxhzeight295seven
            1hqzbfzdzrbnz3x6
            9fiveeightpvjpvdrl
            7jcgbkthree3pqxlsixfour
            rxeightwonineqntwocpstsl3rtfbzzf5
            trlsqtls9nxstgtnthree89
            glxnkkssflcttone73
            3drvbgb8eight
            4937fouronemnqb
            63vjtwo1fourcmvkmzpcsh
            four8119sixonedjmsqnxtwo
            296544
            ninefj3
            three4ninefour8two
            fiveninethreethree3jss8lzlk
            gsjfrnhggktwobcnxfp96bt
            27onerbtz4fourfour1
            88three6five
            ffckjftkbrxfvzphmx4
            2nqbxnqhxonesevengsxfspghjnglnl2
            7hqtrhpdtnrhjx1sixeightknhzpmt
            five29xb1xhdf6bxbxptxfnrmmvn
            2sixmmdkrzkgmvjvp1six9four
            414fournine2kcjss
            7kgb5twonine
            66five3threerhx
            qzh9
            ninexsdkngnzffourljrhrsrkx9sevenseven
            five6eightninetnonesix
            6prgtmxjlztstbkcfour
            th9
            jmtgprnslgn5
            7twoeightgngmcqnpd
            92eight8
            twolvxlvg57
            3ninethreeeightvgvbnk2f
            nsmeightwo8vjbgfhhrsixoneclzeight
            9sixeight3nrbxqhtgskeightvmh8
            threelsqvpd99chmlmtj
            xeightwo8
            5pjjjkxxkfourjvgshnffjfjzd4
            1px
            three8twoneh
            sevenfivephvqsqrzl524
            2seven3
            five45pktjrjnckjsixninezrcjxdrsmdc
            rxgxctwobtwo9ngbrhfjhqc
            six153bq
            2qltqxkzeightonevxhsbglxk
            hjpltpcf1blmcfourtwonine467
            42five9eight
            sixxhlfqh1ttp
            threetwosgbvsprq7j5threelcbx
            npgrkbnhbsmpbnshg46
            ninenine9five8m
            pjdxpnddndfiveqjlsp5dtlstrlz
            tvc57krtsmhqqvfqxfpjkfbbddpg3five
            1jkcfxpgmeight4qmhxrxjlghjsgnjptltvtwones
            eightkpgvbmlpfmrpfncnlb6rtltdbk4
            3fxcmvxfivemntgvphgsspeightzsdjdrpxnlxs
            shsdpncrxhlxsevenmkjpznnkdjr5fournine
            four8qdrjtt1eightnineonefour3
            three82gnpljsnbcn5
            1ggfivethreefour75
            one6vhx
            5fivetwo2529
            six2b2
            fourninefiveseven9
            fourfvrglnpdqfhsnine6zpsccbone1h
            1eight8mzdtwofour
            8eightwoq
            ninesixfivecpmlvqkk9three
            kgcmvpjvjbmnqbstwo45fiveoneightqhn
            xjrcgdblffour5onefive
            hqtxjnineqngjvsfour4gbt2
            9sevenlxzlrvzln
            brcptklplkfj1vqdpbvbdsix96
            four9oneldsvbfivesix
            145tdpvphfbqknine
            ljflbdvxqhvmtsevensix4eight
            6onefive8zlplrvfour
            6mzhddbtg8sevennine48rnc
            fivesix3fivehtpdghxhm62
            87123
            fivethree43seven5pztchmt
            onegzqbbzm6vpm5
            952eight
            6four2srtnppsttwoninegvhctmqftp
            5threethreeqxvspthn612phhseven
            73four35pgtvz
            5four29
            79fiveeightone1
            bgblfdstmvbsgsjgn281sevenzlrpmtxbeightwohcq
            9sixpqttnvjmlscone5
            6threesfourfivebkkx
            fivesixsevendlmldl3
            bqvpfzghfoursxbndvlxzgbs5eighteight
            fbmcgpz83pztlsevenmjbxbpcxx
            three61rrthjdzs
            8mx57sevennines7
            3rmcfbldjhtcfhfnqsixkkpclcb5z
            ttsm16gzcqninetzkjzcrmcbkrn
            qkvonetwoseven486
            lnqnbkpsix84
            5sixrzl1hlgjcnzxsevenone7
            99hcznvbnbnhssk
            2cccbmqtzkfivenine7gnhjvcg5
            8gxkkrgnpsx38kbxeightwonzm
            8kdv
            pmxninecqeightfour1bgpqrrkjnhjfhtn
            nineseventwo6nine
            fpftlgd33sevenseven417
            fourt3fivethree
            tfive8jzbjf5nkvttwonzpbplthc
            41nineninethreeone8two
            31mdlfvreightwotr
            6twosixsixjlmcdqrpjthree4four
            g2
            eightjjzh3ntlglxxpmcdrfnvkone
            ht6
            eight9threehmbfnsjtpl5threergldqjfjheightdhbz
            vssqqrmvpnpjthreetwo8bhbbrfckmzvbc4
            klgl8nntkkvhsixsixfour47fivetwonel
            ttwospnvbcr2ktkzcmftpfqxbbrfjxpxthree
            six7jcfjpjt6lgclnzonebzlbfsdbgbpzdkhx
            six824czjxvvkghdvzbzql6
            vfivecjlm8seven
            fiveeightcrn6ldxqdqxkvntwo4
            lzcqrfkct4ninesixfour5onenjqx
            ninenine1ttjjjmvrbs
            4xcmqggjhts
            8nkd1six
            mldzcxznine4seight
            eighthdthqc56
            zhjffivefshkbqttwo5
            lgngmclkjjvhncffivetwo5stcjnzlfjb2
            glpflvjx6
            one863sixfivenineninejrbvqlz
            9fttbspxxtgbeight
            sglfjndn8mcfcftwotwo
            fxzsrvxhpvkseven3fivejmtjlpmb
            9kphnine31ddxztph
            s39lffour3lkdbrks
            3fhhth5hgsmh8vqspmmqcteight
            6sevenhtclc
            26njgdfive7onejtglghzlj
            kktgkzfcpd6nlfcvxvvfnine
            8ccnhdd4czfgsevennineqszfqd
            onefour194xkj9eight8
            onesixkvjr52
            eightfive1rnrqjbfdck9hp8klq
            five69bcg
            threefivet136pfivefive
            seven7mhdhlhnmghklbbjcbseven93mgltsvnbx
            9762threefive
            ctdssd25qnrztptmr
            13fxdptkcgmxjfdccgcrj545gfzdlmcrpp
            sixjrlmbcfournrsvjltwo5sbbvsfxsr5
            grkkhhpmx9
            vbvmkmxnmvdxfive8jd
            41141722
            91xngpn3sfjkkfmjnthree
            zxsix17brp7twotwo
            nine39six6
            llq7
            83threethreeeightninethree
            svdbjstvsix6zqbppsfour
            two76fxzdss3sevenzg9htmnflgq
            fourtwotwo2ptb
            cbrv9
            vrvdvq1psq2fourgvmqk
            42sevendmdsonetwom75
            fourhxr4ntppb
            14btwo18
            vzx8two
            3sdmnlqsqkb9324xfdhptnine
            6n4
            5twoltmoneseven
            xmqdjlz5seveneightonetwoseven9
            7three4eightzxlgpxhnrb4667
            5nine39eight
            one1twojxjnb
            eightkmlhjvhhgd5pqkblcr
            jddsgdgdf16231sixmzfnpgvnqp
            hgkss234five691
            kxzvnbnnine3n438xrt
            lhnfour9
            fourrqktqhglbh3sevensevenfive89
            xdrtgjlstwothreeqdhnpxhqtjkldfcbkqgxmlktfour7
            fqoneightftbxksztshxssevensq1
            3rtsnzspqrrqsfive
            213
            nine6three53bzrhpg6nine
            t3sxccdtzvhvfive
            7762
            7gxvmb
            644eight5448two
            8hxnqrqknththree3
            3sevenfive9six
            fiveseven3threemkppbkpxhqgn
            czseven6418mqkjdlftcjfbjsd4
            971ponenckqqv1
            ninesevenmqqtcnl151seven2
            7cmrgqbzfour
            3six6fourdxbxngjonelzhjl
            txtfxpsmmlninefour8q8
            pqhpzfive3four
            7bggjsjrsv
            49ninefive1fivenstnfcm5
            seven2lrkhzgkj5fourtwo
            eightone7717eight9
            fld3threetwo1three
            1fourfive34onetszfour
            mxfdscrkbr8nine53seven
            onethree4fivemxlchhzqbzpvszj7
            cjzhpqseven1fivetwofour78
            9vsnhq22ksrrjmkhvdtwo
            2lzkxtvseventhreeseventwo
            three8fourfivetwozgcrbrxdjk
            87vqrqfvxrkdsix3
            two3ccsix
            spjtwo5four
            53gvzvzrnr29mrxljz
            onefourone1ninethreeeight66
            6kbt
            3nc5eight
            sevennkbjttdjv216m9djcrntqxx
            jzs333tjlhhroneklmmhflgvb
            two9seven2eight834five
            fivetwo4two3five
            five76
            9sevenljjrrrrvfg
            tlttwonermnfrl94
            xpbjpfzbkcgseven36fiveseven
            7fivefourhvjf6seven
            5three765nkj
            eight8nine8eighttwonine3
            2fivesixvfhninehbsfklrhgzfourjdjgb
            cdthree6vbntwo9
            sevenfpnmvftmpn8
            qcbhgzqtrbcc6
            ntvtxbdkcvtxdkzdz5kvkvdbxhdj5twojxfivekxvdtmg
            pzlxrnsqlfour9hdpllf9sxjtxntwo
            7prlzzkninenxthqdk4nine
            twothhhbfourbsdbmsixczrhddqdt1
            nineninefivetwo6eightfour74
            foureightghgrjtwo5zvnrxttwo4
            two8five
            hltjz5two1seven19
            sixcfz1jpfp3onesix57
            544
            7626
            fhzhpfivebbkvsix71
            xtwonefive1eight7cfss18
            threeninefmlbfznine6sixtwohfxnfffive
            szpgrtwo7
            3xsixtwo1nzlpb
            5three1rhcczoneg
            onefourz3tff6htmmqk
            mfclgcvn8fourkxjdtwohsxphnftsn
            392one29
            2hpflkrtwo
            8ncfncgvtcgxd3rkfqb3twodlldrzqsix
            3three63eighttwovgsdkx18
            6sixfour
            zksq2xdxkz1onebtbmbmmlc71vldqsk
            r2
            1ncdcsbq
            8cbdqgbcc1six5pxdbkgzjhq
            tltwopsjsgtvvftc2six
            fournvseight3two3
            four57cphtrbghtscdhkhjttr
            qninesixtrrjxgbvms9five28six
            one8qsixthree75csc
            8pqd4threefivephpkqcgnine
            nkfjpxqhsjmbbx64rpdfqksmfq877
            677sixbgg1
            4six3mzzrgcrms5six
            gzcmlrqvktstnjmrzqx36pmftnbvr5
            honemvzkfbkvxsjnlkhfrs6seven3six
            8onemmcjp
            sixseventhree8threetwo3six
            7sevengdjqlx12three
            chgvllfqlfninetwo7twotkntcpls6four
            6lvxcqzcfmg9mcjjlnbr9
            onelfjdbnntlvndktceight42
            95rfdnllb3pqtnpmgbtssbbx
            sixkntcqsnmg3eightldfkeight8six
            vonexcchsdssblsqd8dsmggkzjsdfclmbpthree7
            4msevenfivesevenljxtkxhdfbnine
            fksf6
            lmmqndlfthree17397
            fourninemrr8cljkkqbseven
            336six4blbbpxcbdd
            ninetwo1threefggtvbrsczftcrthkcmxhtseven
            sevensixone4three2
            one4four
            bc2
            qhgndzxpdmonecbjqtwojvkftdlfvnhqrtpdb4lbkgffvlp
            324fiveninenzp
            c54
            482799
            6ninemd
            kd3ljjxmmckrcbrcshxflgs6llvvthrhvd2
            hjlxsksix2eight
            one12twotzchrdfpg
            3dfksprqsvzmr2eight4
            sftsktwofjxbhhvseven76sevengtptwonej
            seven2threefour4two
            2tdzxcbnpnx4
            2b6six4lsglzkbjxk2
            kfrntpdnl6sixvs3lxcrpjmkkff
            ninesix8xkhmmnplggvng
            3jjd5onevssix
            nine2cfbhdmgptwo4xz8
            sdjtzbzm1threethreedhvhshgvnn3
            sevenone534bgjmzlpcmxfz
            pvvbcnlq8djdp21lhdgkfkleightoneightlxv
            4xgjzmcbkn2jgb41
            4pmfbgqrjdrkmxfjthreeone2
            eight7ninefqxjvm3oneightx
            1ntbgttnbfive8
            6nqfive
            fourpdxvg1dqhtbc
            8ninemrdtwo
            8onesbdp
            34kxkvvdkfourmktjbzqpktwo5
            8jjnjvzrzkmkj8qqsevenfjkqnbvlrqdnbfnxvb
            ljhpqnqfdkstssrptpq1hhv
            dsix7df4qhsvjp53vlnhthp
            fourpq9
            dcvlmlvbtwo5jlfkhmxxrldsqqhkztx1sevenfive
            1rgnhdjrcvhnxhk5ndfxprfmmgff
            8jhqfm3bonen7
            2eight2km7kjdkltnfivesixnine
            8j5onecmbceightoneseven
            nvvskqrjfz77four21tvclspzgjq8
            fhdlvm52seven5ninethclsbhbmcsixtx
            8btlvsfpz
            sevenonepsxfdhqck5fzvftnsix
            five4twoone56
            rzgxzdzqrmseven1rrkpbp
            vvhpzfcbchtwo3seven8nine3
            three7zqxvhmbnrsdxvnpjsevenninefour2
            6fivesblnqfjtrninekrxvzd927
            sixfp2xfdqqkblc9
            nlvxkslrgjrsfive2
            kvxtdkfvxntwo7hvqlzz
            3five4twolvxnmzltcbthree
            2sevenfive6
            sixseven3113ncgzrjjkr
            2gppmh39dmmgjks
            363czlhjeight95
            zk1sixsix6twosix
            8fourtc5
            sixeight1three2twonine87
            5vvnh
            fhnvvkhsx3
            one9nine
            jnrk8r
            zhjqc66oneightxf
            three72cpzhp2pmgzkddb8
            6sixtcxqcv
            three3mdqgkhjdbc1nine76nvht
            dqbk6fourfssthlnjmgmjfjf72
            fjgjfbv2dlmqgtssnmonesevenfoureighttwo
            66gqffpzqfs
            zpmslbnm75foureightspkjssseventwo
            81xjd3
            t2three7zqcnklffivefive
            kfdkflvrgkfour6threevhdm
            gpjdrtm2sbttvbcxdvfmc3one5three
            xcpjgnninenineonenine3fourfourqghsvqfn
            hvxtnvtn9twot
            svftdtjhlone5twosevenonekjxtnnnrg5
            2ninesixthree
            88twofourf
            14brpnzhmlljgxxc
            rzzmsskzbsonelts28
            34ninerft5
            rzvlkjvone142oneightpv
            onenzeightvcgzhpkmfn3rxninenstzzbv
            78xtwo3qmjvnlmvslqftd
            twoeightnine4ctzmjrfjtqpv8g4
            9pcfive7four7nine
            7kjnfhncjxcdhmsptr9srht9
            89548szcgrnvfive
            xdtgbmkknmoneseven6jtzmlbpcktncfcllvfgckqbpxtwo
            nfjqcnine68eight
            61fqhc
            bljszntg1hchhb
            eight331qs5drzfn
            75733
            sevenfour7fourfive3
            qhn7jrcxzxm
            72fournpppvgzxhfkz15pbcvhlqm
            kzktsfzq5dhhmzfbx55
            sjcqgjnxrcxhnineninemzpmczrxbppp5
            three8dqhstsgpc78
            g46zlqxtn4
            fivegzddrsevenseven9xmztgpjprxseven3
            9nqdflnboneeightnineone2
            3hxlf8nine9
            6sx9eight4
            77two121
            two31ltrbfrsix1
            sevenone575jxgcvqjzcrthktczhqnq1
            53phstwo
            5sixkgmvkxcf
            3mlcvx
            164vpmdfeightzqsddcd
            55jcqcfthtgsssbc
            kmfsxjv4mrpvceight857zdqtqb6
            bdms1czcpxgcgb1jsjhpzncxdrqcbhkfivexgzlq
            ninenineeightfivedhthreelfour5
            mbsmkshmsbnxbflmrz7qzqz87qqqxbhphgbvgseven
            9sevenldstrnjtkdkjtlspsjmzzttzdzsix
            5lsrdqxghnl1
            64twoninethreeqqfrzcmmrfqnbp
            khoneightsevenrflbbdmfourm6nhfdxzpkhlbsdqgvtctlp
            eighteightfive5
            eightrfourrbscmnrsxg9kjj
            ninexpbbmlsevenfour9
            ntnckzcfour9twosrff
            rnxdgvfivesix1psstntffn
            cbcxxst47three2ninevkpbcspcj
            16seven5qbpnhqxrcjvtwo
            849two8185
            seven2seven2one8fourfourseven
            fourdjjmtvfbr12
            sevennvrfqzl9lhgsflkk
            cdhklbhntwosgbpqmljhsevensfff1onesixvmdxcglt
            6pcqhlzzzone
            eightqkthfivesevenfpxbrnkphfttgstdv3
            48fivesevenfivetwo
            n5fivefour
            4gnnbznfour
            1threefivebcgxzpd
            ttmeightwo19mrnhbgxz2gjdctxvhtzpkq
            sevenmtlmpzlzgzq5one29
            314threehdmtckfgtxbvdg
            1fivefour4jninevgdxthreeone
            bhkjl84fiveeight
            sgtbgcrplgfqqqkkxsveightseven2
            twonine9
            3nineqffxrtthree98spldqjdrqzzcs
            one9fpgbcdsldpfour
            6two1sevenmrxbvkp22
            ctdsninethree5
            cszlntkkq4prfcrdsx4
            cmvxcgtgrsbjsd8189
            4sixrshzpspnzvftftwotk8bmcrpn
            four5pbqqpdgcmkspsccmgffive939
            j3eight2
            6twosixeightfkfftzthree
            hhjn7ccfxjl3eight
            2fiveseven
            four9rt
            7ffflzh5zrqftwonehht
            4qfive
            four7h
            six8four149six8
            nine74six1hblnnrone
            sixtlrmmckxgsmskqdmtnvvmncmdtqtmpfive4
            5seven95bmrtd
            17cgstgbcjsixvlzkqh3fgsvmcssjvsevenffrjtt
            6576bkmbjplfive7seven9
            nrbmhmkbxdntb17qbncrtmvjcsix4
            8dckvflvm
            33seven7nmjlctwovrpjpvmrgr
            2eighttwo7mdv9
            vk9gone
            9cdxlcxgvoneseveneight
            8five7one
            sevendtslgtkcrs1rqpkl4mq5five8
            3thhhqplbqczvkg67
            7661dqjcnsix7knccb
            four3eightbslcfbsbvj4
            2fivegfvhsvsj4fourqxd
            six35smmsqtnmtwo3threeeighttwo
            9fchjtgvfvpxlvpbghn
            threefoureighttwo1q
            fiveeighttwo6
            25three9eighteightsix
            cjhbnineone342xjvfour
            sixnine3
            1nine53
            5fouronevzstmptgrgffrprbbjnrhfzmfour
            fnlvqxgbseven3qdbsvqcm8sixthreerfp
            foureighteight2
            foureight82dx8gdqzrpssd4jqkzm
            dpthree2565cqgthree4
            cjjjkftntjq4
            1qdmmfivetwo
            lb4four
            two6hjgqt
            ddjchjglpbcsfourdtvtcbzb3five
            6twojqffjcbxone
            4gc6cskjfptjxbpone
            32gfttjsdtfvsixone
            oneffjrrtrx4xlscjrpcdzv
            hznvzf59jfsftctzh1343
            pkxpqnbvgscseventhreeeight2two3
            tgsrfcseight5four
            9three5
            njddsqsix5three
            drpksbtwo6jgxmphdnvjbxc951
            dltwone554rrczft9four
            ninethreeghlldqbtl69bvpbmxx
            four6spcfqgvvcvz6ninedtltbcnhsj
            7lfnzntzjxvthreeonefourthreevssnvvgzc
            3fourxxqbfdjxjdmrbxxzgxjhmvxh
            pkxjxrszx4
            onetwoqpzltxj4threetwokzlcqrvmpq
            mpfslkxeighttdfcbpvdjbfb84hsbz
            twosixeight72gdvmqbnpq
            threefivenndkfive4lqhkxqfthree
            92cpsgjonefivethreefourvnqmrn
            8eightbtcskqbl
            8eightqcqcfrtdc8sixtwomfdg
            5z14
            7sevenfiveonefbsgzzf5ninevjhqx
            57eighttcspqjtxponeightffd
            5ninenxthreeonectxfqmrlskzkxclghth
            97ttkhsvqfivez6
            lvkkp9jkkxrmph1
            jfnfpzqttgzmcrhn3nvbddtnrtxfoursix
            7ff7tgdzfour
            3four8kggghfzmcq1
            onefour4xfnpgfrfp
            43pbxbjp6vqvrvkvc
            twofournkcj56nine5
            one9qzkptjmeight
            f86ninen24twothree
            three2ffqzzzzbdm837qtczrbpd
            6five49
            399ffk
            825pbghkzmz
            27eighteight38sixfive
            2fivepqqcnphkfc19xnqfljkrqt
            769clhcfmcbnntlrrtg21
            323jmphjone
            lpgvnlqtwo8
            97onesix5
            99dccchbdfdlczdfxtfbh4
            8tkqfsdsevenfour11
            4klm3fiveeightcszvlftm1
            eight6foureightfouronefht6
            qpfive1
            32nrjhnnldb
            7ninefourhpbfivermgkkxqsixnjkrntfv
            9mzjsevenghctqjcbjz
            two95gdfive
            5flpvgjsmbbxgsgh2threesqjnoneightdt
            mtpcvjlq2891rnine8
            srhrgtwonine4
            fivesixninenkkrnpthreeseven6mffive
            qrmtfour8
            eightfourfive4
            558
            15sixbfdsgrdmponefour
            5threepfqbrkcgrv
            twolxzdhfourqjeightfour55zjvconeightnf
            hmscktxrthreeqrp26
            27kzbhxzfiverrzkdrxqfd3two
            765eight748vzflchf
            6fourljfoursix3
            nineone9
            dtwone672fiveqzzcfrpzfjmhttninetgm
            clkseveneight8jcgmtmkrv
            fourfive4vqtqtngssone
            rkjjcbgsxfzxjfd2hjonerqkkhnxpboneh
            one3mbccxfv7rgtxbnvs7
            61pxsixpztmvfr5eight4ntgl
            63kmhbdgdbnbctkrtwotmd4tx
            fiveseven4eightwolq
            4three2fivecnlzgone3
            7mmmfrrdcqs
            fivegfk5sixeight7pt14
            19two
            1gqsqnmbvlzklsxdbmeight1six4fourgztmkqsl
            sevenzbqdzlmthree7two381eight
            eight7nxzvrpxl
            fourtwothreeqjvqgsbtlmgqnb9sevenrxn
            5eight4sixeightbggshzhjtwo2dsvhtsgg
            3oneeightrhzktblfcp5
            339bfrsfdbbxv32zxjxkflknlvsq
            51
            34eightcvgm
            gb944hzjhdtdcg9
            seven2khjt
            sixpgsvqxdgd8813rrzv
            six1eightrksvzhltnnfivefqvnxcsjzzthree1
            89xz
            jxzccq8eighteight
            rn4ncmgllzht
            nhrptztv2eightseven
            sixbztt3sevenjnhzxkgsbsvmq
            eightsixeight9two5four
            5kgkrnbplph7
            fivefour3one37sevenbhd
            one6onepkpnfhqmp
            1sevenqzcgsnine1zkone
            1vbbppvtxonefive
            vpxlbcqfivejhxh69six14six
            54kzqzvfshddq
            zk124jcgnc3three1
            fbkvqqbhmkfiveone9kctfour7
            jkzgeightfour7nine6
            cdvxvmtwofourgbsk9kmfrtv
            x9one
            gsixfourzkmnmvk41djssgh
            threehvpdzlhnzpthree9
            2z
            vttbsmn1seven9nine4
            xtht483fivet
            threehgxlkzrd1
            sevensixmb68sixthreefive1
            5sfqxpx2fiveone
            38zdpcljqkf
            two32ndxvvqpnn5
            1fourprmkdzqxqsonedlkhxbqplx
            3nine5two8three
            4sbvcnsjdmktwofourseven
            moneeight2jjrfvfxztcseven
            two8three3twoljpzzshzgfqjpb
            twosix7nineseven
            seight3qvmq2f1kkfone
            xtwonezkxhsdkqvmp2fmcmqxcczpeight
            5sixthree22fourfoursix
            fivezqpspcbzkdmmtwo3ssgpfgkhnrpplt
            lbtsdpgjp73
            3rccfnineffpgrmh
            5bsnjxljdcsixtwo53
            fivefour4fourg9
            98seven
            sevenninemskq8
            dhpbgtkmjfourone6rsgnpvsbjtkfqsvrs9threethree
            one5nine
            ninelnsmgk3seven27eightsshhpqpb
            fourtwoqscffdv4nmvngxbqht
            ndtvfive2brkzntrjjl179
            8six82one
            nine5fivecgfsbvbtsn57five7djxlclnfv
            2gzqrfldtlpeight3fivencmlmffivevqkhncfm
            7bbfbcvh6
            ffnrprtnine1tjznmckv5sixczv""";

    public static final String DAY_2_EXAMPLE = """
            Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
            Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
            Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
            Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
            Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green""";
    public static final String DAY_2_INPUT = """
            Game 1: 1 green, 4 blue; 1 blue, 2 green, 1 red; 1 red, 1 green, 2 blue; 1 green, 1 red; 1 green; 1 green, 1 blue, 1 red
            Game 2: 2 blue, 2 red, 6 green; 1 red, 6 green, 7 blue; 10 green, 8 blue, 1 red; 2 green, 18 blue, 2 red; 14 blue, 3 green, 1 red; 8 green, 1 red, 9 blue
            Game 3: 6 green, 5 blue, 9 red; 4 blue, 1 green, 13 red; 9 green, 14 red, 1 blue
            Game 4: 14 green, 3 blue, 16 red; 20 red; 4 green, 2 red, 1 blue; 10 blue, 11 green, 18 red; 3 red, 3 blue, 6 green; 2 green, 18 red, 9 blue
            Game 5: 5 green, 4 blue; 1 red, 3 blue, 2 green; 4 green, 2 red, 15 blue; 11 blue, 8 green, 4 red; 4 red, 3 green; 4 red, 3 green, 7 blue
            Game 6: 6 blue, 10 green; 2 red, 6 green, 2 blue; 4 red, 4 blue, 1 green; 2 blue, 7 green, 2 red
            Game 7: 14 green, 3 red, 2 blue; 5 blue, 3 green, 2 red; 1 green, 3 blue
            Game 8: 7 red; 3 blue, 9 red, 1 green; 5 green, 5 blue, 7 red; 1 red, 2 blue
            Game 9: 3 green, 4 blue, 1 red; 3 blue, 12 green, 18 red; 7 green, 9 red, 8 blue; 2 blue, 10 red, 12 green; 4 blue, 1 red, 1 green; 4 blue, 6 green, 6 red
            Game 10: 2 blue, 4 green, 2 red; 7 green, 4 red; 5 red, 8 green
            Game 11: 1 blue, 10 green, 15 red; 1 blue, 2 green, 2 red; 5 green, 10 blue, 8 red; 13 red, 7 blue; 1 red, 9 green, 4 blue; 9 blue, 9 red, 8 green
            Game 12: 1 green, 10 red, 3 blue; 14 red, 1 green, 4 blue; 6 red, 3 green, 12 blue; 13 blue, 1 green, 18 red; 4 green, 14 red, 7 blue
            Game 13: 1 red, 3 green; 2 green, 1 red, 5 blue; 1 blue; 1 green, 7 blue, 1 red; 1 red, 2 green, 7 blue
            Game 14: 7 blue, 9 red, 1 green; 8 red, 2 blue; 11 red, 18 blue, 4 green; 2 blue, 3 green, 1 red; 1 green, 8 red, 9 blue; 2 blue, 8 red, 1 green
            Game 15: 8 blue, 3 green, 15 red; 13 red, 10 blue; 2 red
            Game 16: 1 green, 1 red; 1 blue, 2 green, 2 red; 1 blue, 4 red, 1 green; 3 green; 2 blue, 3 green, 4 red
            Game 17: 1 green, 3 red, 14 blue; 1 red, 2 blue, 2 green; 3 red
            Game 18: 1 red, 2 green, 8 blue; 2 blue, 14 red; 4 blue, 2 red, 2 green; 6 red
            Game 19: 2 red, 11 blue, 18 green; 3 red, 6 green, 3 blue; 7 green, 1 red, 10 blue
            Game 20: 10 red, 1 blue, 4 green; 4 green, 3 blue; 10 green, 13 red, 4 blue; 2 red, 7 green; 4 red, 3 blue, 5 green; 13 red, 1 green, 4 blue
            Game 21: 20 red, 4 green, 5 blue; 10 red, 11 green, 4 blue; 1 red, 8 blue, 14 green; 11 green, 8 blue, 15 red; 8 blue, 2 green, 13 red
            Game 22: 2 red, 11 blue, 4 green; 1 blue, 3 red, 6 green; 6 green, 1 red, 1 blue; 4 green, 7 blue, 3 red; 11 blue, 6 green, 4 red
            Game 23: 6 green, 3 red, 1 blue; 17 green, 11 red; 1 red, 2 blue, 13 green; 13 green, 19 red
            Game 24: 1 blue; 12 red, 1 blue; 1 red; 12 red, 1 green, 1 blue; 11 red, 1 blue; 12 red, 1 green
            Game 25: 12 blue, 6 red, 3 green; 8 green, 14 blue; 11 green, 5 blue, 6 red; 4 red, 12 blue, 8 green
            Game 26: 15 red, 13 green, 9 blue; 9 blue, 8 green, 7 red; 2 green, 6 red, 3 blue; 1 blue, 7 red, 3 green; 13 blue, 4 green, 18 red
            Game 27: 9 blue, 5 red; 15 red, 12 blue, 3 green; 12 red, 12 blue, 1 green
            Game 28: 18 red, 4 green; 4 green, 6 red; 1 blue, 6 green, 19 red; 9 green, 17 red; 4 green, 5 blue, 18 red
            Game 29: 7 green, 6 red, 6 blue; 6 blue, 19 red, 4 green; 4 green, 4 blue, 13 red; 5 blue, 15 red, 10 green; 2 green, 6 blue, 5 red; 8 red, 10 green, 6 blue
            Game 30: 1 green, 13 red, 12 blue; 1 red, 2 blue; 11 blue, 1 red, 1 green
            Game 31: 8 green, 18 blue, 17 red; 4 red, 8 green, 6 blue; 9 blue, 7 green; 3 green, 1 blue, 12 red; 5 red, 10 blue, 11 green
            Game 32: 17 red, 17 green, 7 blue; 18 red, 16 green; 1 blue
            Game 33: 16 blue, 3 red; 9 blue, 1 red, 2 green; 3 green, 7 blue; 1 green, 4 red; 3 green, 1 red, 8 blue; 5 blue
            Game 34: 5 blue, 8 red, 1 green; 9 red, 10 blue, 7 green; 1 green, 14 blue; 8 blue, 4 red, 10 green; 15 blue, 8 green, 7 red; 2 red, 6 green, 3 blue
            Game 35: 13 red, 9 blue; 7 blue, 16 red, 10 green; 4 red, 6 blue; 3 blue, 12 green, 7 red; 8 blue, 6 red; 10 blue, 3 green, 2 red
            Game 36: 1 blue, 9 red, 2 green; 11 red, 3 blue, 2 green; 2 green, 6 red; 8 green, 11 red, 3 blue; 4 green, 7 blue, 11 red; 9 green, 8 red, 2 blue
            Game 37: 8 green, 3 blue, 4 red; 14 blue, 10 green, 3 red; 19 green, 2 blue, 7 red
            Game 38: 2 green, 3 red, 3 blue; 3 green, 9 red; 13 blue, 8 red; 6 red, 5 green, 13 blue
            Game 39: 8 red, 5 blue; 4 green, 5 blue, 3 red; 18 red, 2 green, 6 blue; 2 green, 5 blue, 17 red; 1 green, 2 red; 5 green, 6 blue
            Game 40: 12 red, 4 blue, 1 green; 11 green, 20 blue, 4 red; 10 blue, 4 red
            Game 41: 2 green, 2 blue; 2 red, 2 green; 2 green, 2 blue, 10 red
            Game 42: 6 green, 3 blue; 2 red, 2 green, 1 blue; 3 blue, 5 green, 6 red; 6 red; 1 blue, 6 green, 12 red
            Game 43: 1 blue, 4 green; 1 blue; 2 blue, 8 red, 2 green; 2 blue, 1 red, 4 green; 1 blue, 4 red, 4 green; 4 green, 7 red
            Game 44: 8 green, 9 red; 1 red, 2 blue, 13 green; 4 blue, 8 green, 17 red; 13 red, 13 green; 1 red, 9 green; 19 red, 3 green, 3 blue
            Game 45: 10 blue, 2 red, 1 green; 6 green, 5 red, 8 blue; 3 blue, 1 red; 4 green, 10 blue, 4 red
            Game 46: 3 red, 8 blue; 6 blue, 7 green, 6 red; 6 green, 1 blue, 7 red; 8 red, 1 green, 5 blue; 9 red, 12 blue, 10 green; 7 green, 5 red, 1 blue
            Game 47: 5 red; 2 blue, 2 green, 5 red; 3 green, 7 red; 14 red, 3 green, 2 blue
            Game 48: 7 blue, 12 green, 2 red; 11 green, 10 blue, 1 red; 1 red, 13 blue, 2 green; 14 green, 2 red, 9 blue; 2 red, 12 green, 3 blue; 2 red, 7 blue
            Game 49: 4 green, 5 blue; 9 blue; 10 blue, 5 green, 2 red; 10 blue, 2 red, 2 green; 1 red, 1 green, 4 blue; 2 blue
            Game 50: 2 red, 2 blue, 7 green; 7 red, 9 green, 3 blue; 5 red, 10 green
            Game 51: 15 red, 9 blue, 4 green; 5 red, 2 blue, 15 green; 4 blue, 3 green, 20 red; 12 green, 1 red, 10 blue; 10 green, 5 blue, 13 red; 9 red, 10 green, 11 blue
            Game 52: 3 blue, 12 green, 1 red; 6 green; 1 red, 8 green; 1 blue, 1 green, 1 red
            Game 53: 10 green, 7 red, 12 blue; 9 blue, 6 green, 2 red; 8 green, 5 blue, 5 red; 7 blue, 16 green, 11 red; 6 red, 8 blue, 13 green
            Game 54: 10 green, 6 blue, 3 red; 6 green, 2 red, 8 blue; 9 blue, 11 green, 2 red; 10 green, 1 blue, 3 red
            Game 55: 4 blue, 1 red; 3 red, 7 blue; 12 red, 4 green, 8 blue; 3 green, 5 blue, 1 red; 13 blue, 12 red, 1 green
            Game 56: 12 blue, 15 green; 1 green, 7 red, 11 blue; 5 green, 9 blue, 1 red; 8 red, 5 green, 6 blue
            Game 57: 4 green, 11 blue, 18 red; 14 blue, 14 red, 16 green; 7 red, 15 green, 3 blue; 18 red, 20 green, 8 blue; 12 blue, 9 red, 16 green
            Game 58: 10 blue, 9 green, 8 red; 13 green, 6 blue, 8 red; 8 green, 4 red; 4 blue, 1 red, 18 green; 7 red, 10 green, 10 blue; 15 blue, 10 green, 3 red
            Game 59: 17 green, 2 blue, 2 red; 2 blue, 1 red, 8 green; 14 green, 1 red, 1 blue; 15 green, 3 blue, 2 red; 2 blue, 8 green, 1 red; 1 blue, 1 red, 8 green
            Game 60: 1 green, 1 blue, 1 red; 4 blue, 3 red, 2 green; 13 green; 2 blue, 2 red, 8 green; 4 red, 12 green, 4 blue; 4 green, 4 blue, 4 red
            Game 61: 3 blue, 7 red; 5 blue, 8 red, 1 green; 1 blue, 8 red; 10 blue, 2 red, 1 green; 1 green, 5 blue, 2 red
            Game 62: 10 red, 2 green; 8 blue, 7 red, 2 green; 4 green, 2 blue, 10 red
            Game 63: 1 green, 3 blue, 5 red; 6 green, 5 blue, 2 red; 3 blue, 7 red
            Game 64: 6 red, 20 blue; 4 red, 3 blue, 2 green; 3 green, 19 blue, 6 red; 2 green, 6 blue, 3 red; 13 blue, 5 green, 5 red
            Game 65: 6 red, 9 blue, 20 green; 6 red, 16 green, 4 blue; 12 red, 6 green, 5 blue
            Game 66: 2 blue, 5 red, 4 green; 13 blue, 2 green; 1 green, 6 blue
            Game 67: 4 green, 5 blue, 2 red; 1 red, 14 blue, 6 green; 1 green, 14 red, 5 blue; 18 red, 16 blue; 15 blue, 8 red, 18 green; 1 green, 18 red, 6 blue
            Game 68: 1 blue, 9 red, 7 green; 7 red, 1 blue, 6 green; 5 green, 1 blue, 8 red
            Game 69: 12 green, 3 blue, 4 red; 9 green, 8 red, 7 blue; 4 blue, 5 red, 10 green; 4 red, 5 green, 7 blue; 9 green, 4 red, 2 blue; 3 green, 13 blue, 1 red
            Game 70: 9 red, 1 green, 8 blue; 11 green, 13 blue, 12 red; 3 blue, 5 green, 8 red; 1 red, 14 blue
            Game 71: 10 blue; 2 green, 8 blue, 9 red; 5 red, 1 blue
            Game 72: 3 green, 5 blue, 5 red; 1 blue, 1 red, 2 green; 4 red, 4 blue, 1 green; 5 blue, 4 red, 1 green; 6 blue, 3 green, 5 red; 5 blue, 1 red, 4 green
            Game 73: 3 red, 1 green, 1 blue; 7 green, 2 red, 1 blue; 2 green, 1 blue, 3 red; 1 red, 4 green, 1 blue; 3 red, 5 green
            Game 74: 5 blue, 1 red, 4 green; 3 red, 2 green; 4 red, 6 blue; 2 red, 2 blue; 1 green, 4 red, 8 blue; 5 blue, 4 red
            Game 75: 3 red, 5 blue, 3 green; 9 green, 6 blue, 7 red; 2 green, 3 red, 12 blue; 14 green, 4 blue, 10 red
            Game 76: 1 blue, 7 red, 1 green; 6 red, 1 blue, 2 green; 4 red, 2 green; 3 red, 1 blue; 16 red, 1 green
            Game 77: 3 red, 10 blue, 1 green; 4 red, 7 blue, 3 green; 7 blue, 6 green, 7 red; 5 green, 15 blue, 7 red; 12 green, 5 red
            Game 78: 6 red, 10 blue, 15 green; 6 green, 11 red, 4 blue; 6 blue, 8 red; 4 blue, 7 red, 2 green; 11 green, 7 red, 11 blue; 3 blue, 14 green, 6 red
            Game 79: 14 red, 6 green, 4 blue; 13 red, 6 blue; 6 red, 13 green, 4 blue
            Game 80: 8 red, 2 blue, 8 green; 6 red, 10 green, 4 blue; 3 red, 9 green; 2 green, 8 blue, 7 red; 7 blue, 3 red, 11 green; 1 red, 12 green, 8 blue
            Game 81: 9 red, 4 blue, 11 green; 1 blue, 4 red, 2 green; 5 red; 3 blue, 2 red, 2 green; 14 red, 12 green
            Game 82: 5 green; 2 blue; 2 red; 1 blue, 2 red, 11 green; 8 green, 2 red, 1 blue
            Game 83: 3 green, 7 red, 6 blue; 7 red, 7 green, 11 blue; 7 blue, 13 green, 7 red; 12 blue, 10 red, 2 green; 1 green, 11 red, 7 blue; 12 blue, 9 red, 9 green
            Game 84: 5 blue, 1 green; 16 green, 4 blue, 8 red; 7 red, 5 blue, 16 green
            Game 85: 9 green, 20 blue, 7 red; 19 blue, 14 red, 2 green; 10 green, 2 red, 10 blue
            Game 86: 1 green, 3 red, 5 blue; 9 red, 2 blue, 6 green; 8 green, 14 red, 3 blue; 18 green, 2 blue, 7 red; 2 blue, 10 red, 14 green; 17 green, 4 blue, 12 red
            Game 87: 4 green, 8 red, 13 blue; 7 red, 13 blue, 4 green; 1 green, 8 blue
            Game 88: 9 blue, 11 red; 5 green, 7 blue, 12 red; 10 red, 2 green, 1 blue; 2 blue, 5 red, 5 green; 7 red, 6 green, 9 blue; 1 green, 10 red, 5 blue
            Game 89: 7 red, 2 green, 1 blue; 1 blue, 2 green; 6 red, 1 green; 7 red, 1 blue; 3 green, 3 red
            Game 90: 8 blue, 2 red, 3 green; 9 green, 4 blue, 3 red; 7 green, 11 blue, 2 red; 13 green, 12 blue, 8 red; 10 blue, 2 green; 5 green, 1 red, 9 blue
            Game 91: 2 red, 2 green, 4 blue; 5 blue, 2 red, 16 green; 11 green; 3 blue, 2 red, 8 green; 4 green, 3 blue
            Game 92: 8 red, 12 blue, 3 green; 11 red, 10 blue, 6 green; 14 red, 8 green, 14 blue
            Game 93: 3 green, 2 red, 3 blue; 3 green, 3 red, 1 blue; 2 blue, 16 red, 3 green; 2 green; 5 green, 2 blue, 2 red
            Game 94: 5 red, 2 green; 9 red, 3 blue; 2 green, 2 blue, 5 red; 3 blue, 8 red, 2 green; 8 red, 1 blue, 1 green
            Game 95: 3 blue, 4 green, 7 red; 7 red, 1 green, 15 blue; 6 blue, 2 green, 7 red
            Game 96: 2 blue, 1 red, 6 green; 7 blue, 8 green; 1 red, 7 green; 2 green, 14 blue, 1 red; 3 blue, 1 red, 7 green; 4 blue, 11 green
            Game 97: 2 red, 9 blue, 8 green; 3 green, 5 blue; 6 green, 1 red, 9 blue; 2 red, 13 green, 1 blue; 2 green, 2 red, 2 blue
            Game 98: 2 blue, 1 green, 1 red; 4 blue, 5 red, 1 green; 4 blue, 3 red, 2 green
            Game 99: 17 red, 2 blue, 4 green; 4 green, 8 red, 6 blue; 5 red
            Game 100: 6 red, 4 green; 3 red, 2 blue, 9 green; 1 blue, 5 green, 14 red; 1 blue, 2 red, 2 green; 9 red, 1 blue, 14 green; 2 blue, 11 green, 8 red""";
    public static final String DAY_3_EXAMPLE = """
            467..114..
            ...*......
            ..35..633.
            ......#...
            617*......
            .....+.58.
            ..592.....
            ......755.
            ...$.*....
            .664.598..""";

    public static final String DAY_3_INPUT = """
            ...........................................751........501...................................890.231...............829..168......143.........
            ......................................*.........841....*....../................+..311.......................441..........*...........202....
            .........332...60....537..697.......901.................609....678....261.....90................870....519...........272..449.......%.......
            840.........*...........*....*..968......273...440.415..................*..................&......*...*......447................883...&.....
            .....34....651.786...646...804.*..........*.../.....-..........=...............94......96..760.222.....637.%...&.290...55..368.....*..565...
            .518*..........+................717......80.............231.....610...810*942..........*...................640...*................499.......
            ...................189......................772.........*........................550..626...676-......213......432...........790.......834..
            ......995..=..........&..955...........391......387...825..362........481...334..*................579.*...84%.......506./...................
            ........*.700..............*..........*.......+..*............*...170.%..........733........658..*....832............-..777..616.915........
            ......322...........977.526............852...410.14.........28.....$.........831.....%.....@.....586.........69.....................+.......
            ...............................30.........................*............./.....*.......505....274...........=.#....344...52.308..............
            .........123*504.................-...-..................15.968.....427.439...456..............*..935../..441......*.....*..*.....195.794....
            ..729.............186...............786..476*168.653*.............*........................148...+...962...................271......*.......
            ............23.......................................435.491*4..40...-...26.......11..133..................*758.-....215....................
            466...656..=............957.........463.............................372..*..............................894.....661.......903.......%283....
            ..................421...*.................32..946...%....668.886..........30.682......108...........................292..................189
            ....759......379.*.....380.......................-..942..=....*...891......../.......*....193.......703..946/......./...................*...
            .39*.........*...847............80-..........................886.*.....+.............418.@......763............432.....................873..
            ...........916.......................335..369.....................651..624.445*809.........*695...*..267.......+....666.641.888.480.........
            ...@38...............685..149..........&.*..........312..................................27......544....*.420.........*....*..........*750..
            ................&.....*..*...............208...........*...361.....&.....569................*986.....295...*..751..499.............549......
            .....@.......626...390..761....*.............$.........319....+.289..250*................189.....947......804....*......742*................
            .....660....................342.582.......24..611..................................354.*............*.............997.......595....874......
            ...................................................109.........*...108.........252.*...168.@88...973................................#...$...
            214.....161..............499-.......................%........497...*....419.....*...52.........................83.........*5.............739
            .......*...............................156..........................88........798..............204...............*.....444.......974........
            .108..39..................*651.395#.....*.............963.......911...............886.................532.....417...................-.......
            ....*..........921*82..321...........597...@321..409.....*254....../........237...*.......................&......./...................=308..
            .954..110........................................../.................478....*.....423.........990....187.429..#...506..........614*.........
            ........#...211.............................575.....................*....893...13.........811*................673.....85...........465......
            ..................393...........782.............-166.........=.831...401........*.348....................477...........*.819..#261..........
            .....761..........*...536.....+....&.................549..427.....*...........924.@......283.50............*........795...=.................
            ....*....-.51....617./......954...................................248...................*........776....407.................................
            .756..986..............326........516............387..342....336............142=.823..354....233.............$...........523........336.....
            ..........+495...856.....*....363....*188.177.4..+..............*....=512....................*...835......458..348..........*.......=....445
            ................*.........638.$..............*.......214.........190......293...........&.128......*............*..167......711.........*...
            ...565.......842.................#.....................@...............=..#...........195.......984.....201#...530...................640....
            ...*...........................289.401.......251...626..........198*..277....$..............%.......................719..........964........
            ...397..910+............................$....*.....&.....936..............893../...........249.....#334.299.../503..........*....*..........
            ..............................918-...420...405..............$...226.729.........910........................*.........892....76....511.......
            ...674=...282*418......#................................................962..........=693.....760..........499.908/..../.......$........*926
            .......................906..../......485*..........*......9....+....564*.........132.............*..........................137.............
            ...........................300...........960....503.572......490............608*.......*....504.979..25......230.................925...@....
            ..673............787..............................................433*164.......961.956.596.........*...610...............340.......#...765.
            ....*....................8*............217*805..................*..................................427..*........680*.......................
            ....247..............699...848....................651........137.870.673............696..................660.........432...593=.........906.
            ..........209.........*....................327............................%..........%................3.....................................
            .....%.../.....482...708...782............*..........520..................947....390...420.....%..............456.....667*544............732
            ..305.......%.....*......%....%....220...419....608..*.............282............&....#........269......117-....*834.........546#..........
            ............137...145.128...........%.............*.555.............*.......................=...............................................
            ....988.299.....................940.......978..971........437.......79..........*.........238.497...490.912.539.........85......157-........
            ..........*.660....335......../...%........................*..224........@...556.368.............*...*...*..*...551......................474
            291..217..1..................321......-...................17.....*.......810............411......573.688...273.....*....$.............../...
            ....*.........=.......701............781...*....................761...........315........*........................895.445...................
            ...............467.......*...............444................................/../..........925..530+....50.....-.............................
            ........+..........545....970........./........767......543..............953........389.................$.....393......#....17....83........
            .668.....577...&..@............803.....931......*............829..226*.............*.......-....114................=..9.....&............298
            ..../........239.......101...&...*..................419.....@.........922..17......598....704..*..................722...........768.........
            .................776..*......156.163............419...@....................*...................465..+....................206=......-.*......
            ....506.891-.......=.499....................@......#..........992..664....270......*395..............519.......666..............37...566....
            ....&........251.................671.=.......474......429....*..../.............776.........#.............260.&....319......410*............
            ............*.....46...772.........#.441.........340=..-.....393.....452..../..............219......487..*........*.....697.................
            ......993.507.............*.........................................&......515.231..#988........./..$...519.=...435.....*...........753.....
            ..177..=.......*17.........341..62.....361...820.....647+.........................*...........939...........980.......7.145....310....*.....
            ....*.....113.....................*17.....*..................583....585...........160..571............................*..............75.....
            ..937.163....*857...........322.......233..436..973................*............................678..................304.....#140...........
            .........*............@................@.......@......412..521......917......+.............................................@..............32
            .........233.........5.......649.230..................*...%..................513....304.........745...85..31....799........958..............
            .....983........@...............*.....#......%.....340..........=....745...............*565........%..*..........*.....835.........../503...
            .....*.......558....71.............518......546..........148..439....*.......567......................870..846$.519.......#..../17..........
            ....945..381.......$........671@.....................390...........870..........+..%.........*..198..................347-...............164.
            ....................................................@.....-...............318......555....234.9................@..................134.......
            ..............489$....=608.............................&...40.*.................................................291.274...489.690*..........
            .....=485...........................633.462....+......490......370...............-......740..........416*..............*....................
            ....................................*.....*.....125./.....#656.....679.....227....455.-....*.......*.................414................552.
            .................227..............733.$....787.......532..............*879...-........681...148.188.426./.......547.........=.......645.....
            ....+..21.....75...*.....797...........73...................491...12............27......................727...@...*........912..............
            ...258...*572.....955.......*..&...585.........*.......800.*...............@...-............................357.........................+...
            ...........................415.389.*........973.738.%..-...759.968....477..192.......553...#.......398..170......900..../..986..834$..758...
            .........10......816..676..........356..............78............*..%..............*.....372......./......*..........322...................
            .....122*..........*......%............590.............870..920..911............246..452................740...............199...............
            ...........444.....738....505...@.498...*...=..........*...................................946...................+.*......*.................
            .....675.....*................180...%.957..335.295...&.222....-..........281..625....@....=.....695...........173..652......141...-.........
            .......*....860........842.........................453.......809.....167....*..*..308..........*......902.101..................+...894..130.
            .....834...............*....=138.........................224.....301...$..663.9.......58.....899.........*..................................
            ........................948......................908............+...............#................74........384.454......69.....*724.........
            ...............4............84........990.949...*...................480...961..230......18........#..367......*.............................
            ......496.......*289..........*11............*..........139*129....@.........*........................*...255................532.....607.443
            ......*................888....................812....................876..364......965....105.....446.612...*..12*............*......*......
            ..374...833.........19*.......904.........432.......153.....78/...............267..........*..............800......285......890...618.......
            ...*......*...479..........*.*.................648.....+.........71...........*........53..216.686............3/....@..498...............346
            .739......28.....*760....112.725..145......133.../.#71.....737....$..*.....407..228......=........%....................=.............407*...
            .....619............................=.........&.............../.....932........&.............................296.........348.+166...........
            .......*.............22...-917......................................................-317........................=.........#........=.....111
            .......263...............................$........829......=...418-...........$..............599..304.............@..........849$..442..&...
            ..792%...........*880....499...........719....415*.......853................928...47...*59...@...*....679.......744.........................
            .........590..589..........*...90...................*...............#282.........*..............568..$..........................736..383.321
            .........../.........481....87.*.................831.674....430.............270..393....................%65......................*......*...
            ....864.........809....*........922.979......................./....461.545.....@.....738........-.....................355.....646...........
            .......%......@....#....539.........$.................*122............*....992...898*.....801.497.......#...&...@.................214..862..
            .............393...............................964.953..........503@......*........................764..143.17..385...........525...*.......
            .......87.49......444#....................&............................108.....801..............*.....&................866.......$.334...626
            ............*120.............736.971....595........715...462...=.....-........=.................754.............@.........*629..............
            .....331............620........*...*.........252.............987.=...846..........163..941.............-219...719...231*..........=.........
            ....../.........468*..........734...939.........+..220..934......170........745..-.................*....................635......650........
            .550.......&..........................................%.*.....................*.......&.........261.346.237..................#..............
            ...*.528..303.546..........357.....878.....571..........755...619...661.....803.358.335....67.......................496...259.........25....
            .938.+....................*...........+.......*649.............*..../.....................*..........................*..........961....*....
            ...........975........-....745...........312................134...........253.98...........362.......716.............94.+...620...+.-...62..
            ............*.......123..............429....*26.......590............836&.@...........$..............=..................485.........821.....
            ....555......924...........287........../.............*............................837..........408.........................................
            ........265............924*.........784......382......354.............255..280.896...............+..........537....936....524...601.........
            .............495........................177.....+...........148...628*......*............691.........776=..*......*......*.......&..........
            .....617....*....................832.....#........278*651...*...............767.......16.......66..........857.956.....145..............817.
            .......*...560..........906..........635..........................526*.............44*...%....@......@981......................=...624.*....
            ....446............-.../................*....................%........798...............796.....................448..........839...*....941.
            .................523.......%.990..828-.537......22........771....251...........938..884........782....866..................@........776.....
            .808...255..............527..$..............&......709*.............*....=....*........+.......*.........*..........908..659.675............
            ..........=.-694.................225........603........523.......617...201.....85..............430.......982...62..=..........*...+...118...
            .......=..........672............*.................713...................................120..........&.....................237..733........
            ........723....77*.......765........453....296.......*...........................392.554*.......@......770.878.569..../..............757....
            ........................./............*.......@.....518.................360*.................272...602........*....456....614/..............
            ..............*677............593.460.51..571.................136..758.................422........+.........................................
            ...........265.......974....../...........=..............142..................82......+.........$......591*...........$......&..............
            ....542........44.......*297.......................=.......*.......516.......$.................113.........198.......792..244......391......
            ......&...$........737*.............743......741.64.....688........*...........647.986..+588..................................=......&..129.
            ...........4...........14..............$.397*................896..832...810*.........*.............656...........996..........618.......*...
            .......765..................887....8..................226.......%...........149......884.678..........*...358....*................915....956
            ........*...................*...../....514.............*................995......429.......@../969...434...*......955....../..210*..........
            .....672....@......@.......322.........*........404#...784.............../..#884....*......................506..........984..........708....
            ..........757..712.195...............188.....................895...................326...501.480..&524..........998./..........996.....*....
            ..972.160...............857..293..............274....-...-...........807...%............*....................+...*...128..313.........478...
            ...*..*...804............*...........334..110*.......974.459...........*....801........727.595..778.........699..800.........*..............
            .934..798.%...............37.....191.............*............@.......75...........486......*.................................323...........
            ................................*......387....477.200......360.......................*....962...47................................179.......
            .....................884........985...................................67..145*.......292................191..323...213..............*.......
            .....................$....860.............700.147..................$..&.......334........282..267...........*.........-.93..867........525..
            ..............492.......&...*....91.......%...*....779.......-691.93.......@.........710.*....*...=...310..........97.....*./..........*....
            ..........568*.......708...216..............780......*....................312........*....438.....346....$..$327...=......5........756..855.
            .......................................261......807.261.............................42......................................................""";
    public static final String DAY_4_EXAMPLE = """
            Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
            Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19
            Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1
            Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83
            Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36
            Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11""";

    public static final String DAY_4_INPUT = """
            Card   1: 69 24 51 87  9 49 17 16 21 48 |  5 52 86 35 57 18 60 84 50 76 96 47 38 41 34 36 55 20 25 37  6 70 66 45  3
            Card   2: 59 63 94  2 95 30 57 69 85  7 | 95 44 84 30 92 21 74  9 99 49 24 23  8 68  7 63 45 28 96  2 69 77 93 59 85
            Card   3: 90 28  1 14 41 83 24 59 55  6 | 29 15 72 47 32 96 73 76 52 20 53 26 78 39 85 92  3 67 51 75 64 54 99 65 22
            Card   4: 88 86 30  6 50 32 66 89 81 93 | 99 93 68 37 13 56 66 88 78 89 81 69  6 50 53 86 45 34 32 38 36 84 49 30 35
            Card   5: 97 23 64 49 50 60 80 55 65 66 | 30 25 93 92 39 91 85 38 80 52 86  6 40 64 89 15 98 81 13 66 68 87 43  2 74
            Card   6: 42 58 18 41 39 60 86 91 71 29 | 20 90 83 19 65 13 70 18 46 95 49 56 52 15 21  8 81 93 89 31 87 91 24 86 53
            Card   7: 29 51 49 50 83 80 15 45 61  2 | 29 27 50  4 68 51 15 63 12 33 83 64 96 66 97 10 43 39  2 45 94 89 61 49 82
            Card   8: 34 55 80 83 94 48 61  6 68 53 | 76 84 54 46 48 41 93 39 61 96 24 53 83  9 92  6 78 23 47  4 95 31  8 28 56
            Card   9: 36 17 51 57 85 66 12 60 22 28 | 50 28 21 34 59 85 49 65 43 17 48 38  3 36 52 44 32 35  7 12 51 61 60 57 22
            Card  10: 34 82 78 94 18 13 43 73 55 92 | 88 24 25 82 17 39 69 64 66 80 29 31 58 26 84 92 36 96 30 14 32 99 12  1 18
            Card  11: 10 26 21 81 52 90 83 53  1 79 | 34 39 43 86 90 20 23 25 21  1 15 66 93 58 17 68 46 84 71 62  8 81 82 10 26
            Card  12: 18 64 34  3 60 10 25 74 73 55 |  4 77 69 19 35 39 54 16 58 71 11 49 64 62 59 12 44 25 80  5 90 36 61 43 21
            Card  13: 77 41 66 78 53 94 32 82 15 96 | 55 94 60 16 69  6 82 34 42 65  2 37 20 21 40 57 86 17 35 66 18 68 33 78 46
            Card  14: 17  1  7 83 36 53 62 10 20 29 |  9 28 82 13 33 83 49 72 19 37 64 96 12 85  5 75 66 73 31 93 15 70 67  4 52
            Card  15: 73 78 29 12 50 19 45 59 13 87 | 90 88 93 47 94 35 11 67 87 84 54 17 22 74 25 70 57 21 30 48 55 15  7 68 85
            Card  16: 92  4 20 49 62 85 41 91 60 64 | 52 37 12 94 38  2 97 28 68 93 54  8 82 41 75 34 40 65 64 87 74 76  3 89 46
            Card  17: 83 58 26 95 70 62  5 27 36 42 | 23 85 45 12 39 33 81  3  8 90 54 30 80 50 41 61 31 14 21 64 78 17 28 47  7
            Card  18: 45 59 66 43 84  7 39 67 16 40 | 35 71 12  4 48 82 91 92 37  1 22 50 55  5 47 19 60 78 14 57 11  8 63 76 73
            Card  19: 17 28 32 69 68 42 87 84 33 58 | 84  2 46 54  4 28 64  6 24 68 21 87 69 60 33 19 42 58 82 17 32 73 93 59 44
            Card  20:  7 64 52 68 17 88 29 82 19 39 | 12 81 51 72 84 83 62 97 13 25  1  5 44 57 40 86 32 30 80  2 58 76 65 38  7
            Card  21: 45 10 78 85 47 31 38 16 70 41 | 16 10 55 78 70 41  2  1 38 61 67 45 99 44 76 86 63  7 31 85 58 34  4 47 52
            Card  22: 97 76 54 22 46 98 25 84 94 50 |  5 49 21 81 82 20 23 74 48 57 34 87 13 71 27 45  6 35 67 68 44  1 93 14 29
            Card  23: 35 68 90 67 56 28 81 73  8 31 | 51 48 53 61 67 95 68 74 56 26 63 55 73 36 57 15 90 81 28 17 16 30  8 86 12
            Card  24: 12 73 45 21 41 44 31  9 23 43 | 57 87  3 73 38 58 93 12 91 56 67  6 61  5 41 33 86 24 70 94 13 44 90 39 63
            Card  25: 13 51 56 90 63 27 12 74 94  8 | 26 25 92  7  1 90 72 20 40 85  5 35 23 13 77 99 27 54  3 34 19 65 57 80 52
            Card  26: 39 21 92 54 28 86 62 77 13 57 |  4 38 95 41 26  2 27 48 46 55 74 78 61 40 22 45 36 50 14 24 42 97 68 83 85
            Card  27: 75 29 12 42 59 41  9 32 81 47 | 87 29 44 26 71 16 32 99 75 58 43 52 56 25  5 28 47  3 30  9 37 57 54 92 78
            Card  28: 77 60 69 32 44 47 94 52 16 90 | 91 81 28 17 57 20 69 78 32 27 45 79 12  8 90 34 83 76 47 72 94 56 61  4 93
            Card  29: 77 17 36 45 48 39 65 40  8 79 |  9 73 68 79 27 45 18 90 74 53 93 36 85 55 63 64 52 40 76 69 28 41 16 46 30
            Card  30: 14  1 34 84 79 38 61 81 37 12 |  3 46 83 50 98 40 61 21 44 65 39 63 43 92 69 15  1 87 78 60 91 25 82 70 54
            Card  31:  9 46 80 56 92 25 55 40 87 59 |  5 20  8 76 35 67 50 14 58 48 60 45 42 93 37 31 43 21 16 44  2 84 18 66 82
            Card  32: 41 98 65 17 29 21 30 74 78 43 | 44 61 15 88 13 87 26  8 37 23 50 31  1 22 16 97 18 91 73 79 81 60 55  2 34
            Card  33: 35 89  1 47 69 49 60 68 91 87 | 53  5 66 92 78 77 10 75 72 22 80 23  8 61 16 99 56 24 55 54  9 74 81 41 85
            Card  34: 51 45 97 73 12 48 81 99 19 84 | 20 73  6 86 97 99 91 84 29 68 19  2 45 35  5 78 95 81 51 12 34 47 22 48 39
            Card  35: 33 95 77 54 71  1 15 13 14 55 | 69 12  4 95 71 90 62 72 11 47 61 77 25  6 50 29 20 97 21 65 37 14 17 85 64
            Card  36: 34 39 52 24 10 53 59 56 76 13 | 57 24 95 56 99 10 53 54 46 76 77 97 85  6 58 60 59 40 31 13 61 34 39 52 66
            Card  37: 16 52 12 81 88 69 57 40 59 33 | 24 95 74 36 54 59 52 90 18 46 37 61 25 23 11 56 29 60 97 87 96  7  5 44 64
            Card  38: 39 24 14 41 95 89 86 32 35 62 | 17 54 47 51 12 70  8 40 24 56 10 38 75 18 59 25 41 53 58 63 14 77 16 19 36
            Card  39: 76 97 86 48 13 11 32 60  8 54 | 34 32 43 95 16 51 38 57 81 85 36 41  3 10  9 24 68 37 87 30 71 59 65 53 52
            Card  40: 18 37 65  2 60 13 42 76 86 17 | 49 29 77 76 17  1 37 13 57 12 52 48 45 97 65  3 91 79 42 27  2 89 18 60 86
            Card  41: 93 42 44 24 64 78 79 51 75 66 | 93 66 73 88 22 64 75 51 12 95 42 69 78 79 45 41 19 44 71 49 10 68 86 83 60
            Card  42: 68 99 67 81 50 14 38 61 39 82 | 27 86 33 26 52 47 73  3 78 48 74 28 36 68 58 24 40 15 82 56 69 30  1 71 13
            Card  43: 34 14 85  8  2 73 43 76 30 50 | 46 18  9 77 21 49 62 17 38 76 23 44 66 50 43 56 85 97 73 59  2 30 75 63 58
            Card  44: 58 18 63 35 67 88 82 69 11 33 | 40 60 16 98 89 77 95 48 11 97 87 36 82 99 65 85 17 12 22 64 80  2 50 32  7
            Card  45: 63 65 12 68 11  2 27 22 19  8 | 86 15  2 16 11 34 96 71 75 41 83 68 58 19 63 97 26 22 57 67 69 65 94 49 10
            Card  46: 33  1 17 91 87 13 57 65 66 29 | 68 84 38 86 96 20 94 92 72 44 33 49 77 70 40 42 54 35 46 47 10 15 30 48 76
            Card  47: 39 63 71 40 65 23 29 33 90 97 | 28 53 85 83 72 25  2 62  6 26 34 18 30 47 82 73 15  8 52 70 20 86  7 11 74
            Card  48: 12 92 19 89 72 49 33  9 42 79 | 47 95  1 23 85 21 34  6 10 93 94 77 69  4 88 82 89 45 38 31 99 50 36 11 68
            Card  49: 99 41 27 48 22 97 87 11 88 40 | 89 14 54 44 34 93 69 23 48 59 39 21 19 36 15  1 42 74 96 64 25 94  7 53 26
            Card  50: 71 58 70 52 49 72 60 75 39  6 | 27 76 69 36 83 67 39 51 30 57 65 15 93 95 32 14 20 23 34 54 25 64 53 88 77
            Card  51: 94 89 83 15 61 59 21 31 13 20 | 92 49 26 38 87 84 90 33 27  7 81 98 25 56 91 41 10 48 14  4 30 85 39  1  5
            Card  52: 50 34 33  8 61 99 16 38 27 66 | 18 90 32 13 55 83 36 12  2 43 80 85 52 14 69 71 86 24 82 44 23 25 73 31 41
            Card  53: 22 20 49 67 94 84 97 68 58 85 | 58 13 90 52 49 67 86 47 22 84 80 89 77 23 68 85 71 43 37 73 20 16 97 79 94
            Card  54: 22 54 25 28 39 17  7 99 34 45 | 28 11 54 95 73  5 82 43 15 38 39  8 96 99 61 85 45  7 29 87 17 22 20 25 34
            Card  55: 19 59 78 99 50 97 28 16 52 81 | 33 76 99 36 19 34 16 26 59  1 40 78 64 50 24 71 55 81 56 52 28 65  3 93 82
            Card  56: 41 53 91 67  6 19 37 81  2 99 | 82 81 96 91 43  6 53 45  7 27 33 99 41 95  1 37 36 11 89  2 19 16 87 67  5
            Card  57: 83 43 40 79 19 21 75 35 41 55 | 35 75 65 78 40 56 39 81 29 84 42 28 33 86 54 52 13 24 30 15 70 23 73 98  1
            Card  58:  1 40 98 36 99 70 30 11 34 48 | 50 30 41 40 98 87 48 21 34 55 46 24 93 25 99 36 11 70 29  5  4 84 23  1 65
            Card  59: 99  2 35 38 46 75 30 18 63 20 | 63 73 78 34 45 99  1 27 30 91 71 18 51  4 82 79 76 72 86 84 50  7 15 23 66
            Card  60: 92 32 75 18 29  7 42 33 30 66 | 10 54 84 44 56 30 71 97 31 99 49 91 90 67 83 21 93 98 11 96 95 52 29 38 73
            Card  61: 32 39  7 45 99 79 56 82 13 78 | 58 53 15 48 28  1 32 72 33 52  9 29 57 20 68 89 64 27 81  5 38 80 25 22 10
            Card  62: 44 66 55 80 41 98 24 13 63 99 | 17 66 13 15 37 61 69 74 16 25 80 45 39 85 98 55 63 42 99 92 41 83 24 44 31
            Card  63:  3 90 16 61 30  8 80 92 84 32 | 12 96 80 25  3 39 98 29 30 55 92 37 61 16  5 14 89 68 63 90 10 69 84 70 41
            Card  64: 28 38 60 24 68  9 21 18 73 32 | 51 24  3 60 56 22 18 86 94 15 35 38 85 90  6 23 27 76 66 17 87 58 73 99 93
            Card  65: 71 38 10 14 72 76 31 46 50 93 | 98 51 38 65 67 54 71  2 12 87 90 50 46 10 76 19 56 33 64  6 11 99 62 89 93
            Card  66: 39 75 77 90 88 82 19 22 67 97 | 23 45  5 62 30 75 69 10 61 99 94 79 90 13  3 97 12 74 78 88 77 95 42 76 64
            Card  67: 38 95 70 56 66 26 93 57 40 39 | 93 66 68 40 27 48 70  4 95  9  1 26 39 57 56 92 97 89 77 16 47 74 44 80 85
            Card  68: 62 70 79 24 96 68 78 86  5 82 | 78 79 46 64  2  3 59 55 39 35 95 86 45 74 82 80 28 20 32 51 70 24 38  8 92
            Card  69: 12 34 18 72 83 14 64 25 43 79 | 23 32 28  9 81 90 60 98  8 92 80 61 91 96 76 48 75 78 12 15 89 40 87  7 53
            Card  70: 58 42 86 92 41 93 89 78 91  4 | 59 49 26 10  6 13 70 90 19 30 53  7 34 45 38 72 86 93 32 73 54 15 85 46 56
            Card  71: 11 71 96 53 65 83 32 63 56 70 | 99 25 39 37 11 49 23 67 94 20 97 69 78 81 22 47  4 90 71 34 35 19 29 64 30
            Card  72: 20 16 43 39 59 37 60 92 30 62 | 64 91 14 84 21 78 43 82 65 51 32 46  4 31 90 95 56 92 88  3 41 54 67 79 18
            Card  73: 71 76 27 73 52 70  6 65 53  9 | 40 39 15 98 60 80 88 26 12 34 90 21 68 52 30  6 66 96  5  7 62 65 92 11 82
            Card  74: 75 95 13 44 34 96 38 87 52 20 | 28 35 22 80 40 82 19  1 34  7  8 56 33 59 25 26  6 43 87 89 37 94 72 11 15
            Card  75: 22 17 49 93  7 68 60 55 86 65 | 62 72 87 15 37 45 20 92 43 32 79 39 83 54 50 31 22 64 41 98 61  5 89  2 91
            Card  76: 95  7 35  5 36 38 15 82 28 66 | 40 83 50 77 76 63  8 24 33 42 90  9 23 68 79 73 16 72  2 25 32 96 92 69 65
            Card  77:  9 38 54 32  7 55 94 77 37 84 | 51 25  7  6 90 24 32 94 82 43 37 70 58 80 14 89 62 54 49 77 17 68 29  9 86
            Card  78:  9 29 79 96 53 77 74 89 92  5 | 45 39  5 29 53 55 77 17 18 92 10 19 42  9 89 87 49  4 60 79 33 38 96 74 69
            Card  79: 96 80 69 68 84 53  7 64 40 35 | 65  3 92 59 34 73 40 17 37 54 63 42 82 44 64 93 74 27 38 57 85 23 72 48 75
            Card  80:  8 80 68 15 20 98 77 36 42 34 | 34 98 57  7 42 94 50 68 99 20 15 36 32 41 80 78 38 90  4 75 30 17 72  8 77
            Card  81: 53 28 67 55 57 94 72 10 30 44 | 33 84  6 75 87 70 78  3 38  9 42 39 44 77 92 68 79 82 27  5 18 40 98 34 85
            Card  82: 40 42 31 71 87 94 99 84 76  7 | 23 62 95 78 49 47 88 42 61 50 56 76 31  7 87 84 16 34 40 12 99 21 71 24 33
            Card  83: 90 70 42  5 19 29 69 93 20 15 | 23 65 15 42 75 97 45 41 86 90  6 69  2 84  3 19 18  5 29 70 39 51 22 20 93
            Card  84: 44 98 96 14 33 45 36 59 80 56 | 69 33 20 59 64 96 80 18 46 44 38 95 71 11 97 54 19 92 36 58 56 83 49 76 89
            Card  85: 89  5  2 48 95 86 13 77 98 33 |  6 26 60 73 98 51 83 34 30 78  8 52 39 59 75 99 28 49 63  3 96 38  4 57  9
            Card  86: 31 72 57 77 34 41 95 70 32 97 | 32 11 31 97 87 26 10 68 27 34 86 83 70 21 41 95 12  5 62 19 18 77 99  7 72
            Card  87: 42 55 61 33 16 56  1 91 41 26 | 69 37 72 28 65 22 20 90 79 95 36 25  4  1 82 80 14 76 85  2 68 27 55 21  3
            Card  88: 22 24 77 35 38 19 62 70 84 80 | 28 54 62 26 98 22 27 38 33 92 10 53 41 56 48 71 39 20 77 17 49 23 96 87 91
            Card  89: 52 58 14 84 66 45  5 81 20 28 | 43 70 18 71 15 73 38 39 32 83 62 11 24 80 72 67 21 77 64 59  1 86 26 45 42
            Card  90: 57 90 11 18  8 64 99 85 30 77 | 30 29 91 93 64 67 70  6 97 85 10 77 12 55 14 90 18  4  3  8 60 25 13 87 58
            Card  91: 29 41 92 69 78 56 26 39 79  6 | 56 85 79 98 49 26  1 32 80 16 28 91 20 92 39 22 75 69 66 73 83  2 54  4  9
            Card  92: 98 86 61 23 25 82 21 94 44 78 | 38 86 90 56 47 11 84 87 61 89 31 45 80 95 41 49 42  7 44 23 14 76 63 29 85
            Card  93: 44 45 55 73 69  5 30 36 66 65 | 23 10 89 39 35 58 45 15 51 98 55 83 99 13 57 28 70  6 84 94 79 52 86 27 85
            Card  94: 21 64 88 42 38 40 47 75 69 16 | 36 84 99 51 50  1 18 10  6 77 25 54 86 33 98 97 90  9 23 40 41 59 73 39  3
            Card  95: 91 45 99 85 36 39 11 96 15 60 |  2 18 27 77 54 10 13 42 29 65  9 14 67 52 62 47 32 97 40 78 61 30 80 50 66
            Card  96: 12 51 95 70 17 58 79 76 21 29 | 36 16  9 98 48 84 68  3 73 86 40 85 94 63 26 57 21 95  5 56 90 64 50 18 23
            Card  97: 45 13 85 44 93 51 59 30 98 11 | 77 70 78 43  1  4 20 23 80  9 93 90 31 27 53 84 16 41 58 63  5 89 15 28 36
            Card  98: 91 48 35 10 11 59 16 86 34  1 | 85 15  2 33 28 37 55 71 24 45 70 78 67 40 31 61 99  8 58 53  7 30 46 60 50
            Card  99: 58 52 34 19 75 98 35 18 30 62 | 99 28 82 47 23 27 16 79 92 17 61 83  6  3 68 43 51 21 58 19 57 80 64 42 25
            Card 100: 99  9 93 30 29  5 33 42 17 85 | 29 81 71 56 34 14 72 33 93  3 30 98 39 63  9 90 42 11 96 18 57 50 38 58 17
            Card 101: 20 10 50  8 88  2 36 98 82 95 | 12 49 64 90 38 11 46  7 89 94 43 63 65 62 19 17 56 67 27 53 93 58 22 66 28
            Card 102:  5 87 50 56 53 71  7 34 76 46 | 87 53 34 56  7 88  1 59 64 68 32 44 13 21 23 92 50  5 46 67 71 76 77 85 80
            Card 103: 17 24 77 25  1 76 40 35 61 68 | 58 17 77 11 64 80 25  5 53 70  1 76 86  9 24 35 27 68 55 40 79 74 56 61 20
            Card 104: 11 99 30 35 84 28 12 50  6 33 | 23 30 79 87 47 84 99  7  8  2 52  5 20 16 15 80 60 78 86 97 33 70 34 32 27
            Card 105: 63 60 42 94 59 57 79 78 10 35 |  1 64 84 78 16 46 55 72 35 50 60 44 43 80 52 18 10 66 39 82 54 33 95 63  4
            Card 106:  3 97 26 50 77 16 81 84 12 65 |  3 69 12 54  8 92 67 33 20 65 43 10 93 97 51 34 63 58 88 77 84 76 89 32 26
            Card 107: 30 14 49 68 73 15 96 77  9  8 | 81 46 49 73 86 89 95 14 30 25  9 68 72 83 15 20 45 53 99 85 65 77 82 96  8
            Card 108: 81  8 32 41 86 22  6 36 49 31 | 22 68 80 97 81 73 41 58 90  6 95 23 88 32 49  8 89 24 56 36 31 86 18 37 94
            Card 109: 88  5 61 34 84 60 39 81 32 24 | 18 75 65 64 77 85 60 88 32 34 84 62 50  5 91  4 24 48 72 61 93 81 20 39  2
            Card 110: 70 67  7 55 81 92 98 62 45 91 | 54 55 53 27 62 77 13  9  7 26 24 70 75 37 45 97 69 68 21 44 83 71 91 72 30
            Card 111: 96 53  6 83 31 24 67 46 21 91 | 91 94 89 41 83 22 72 18 96 24 81 47 70  6 51 13 46 53 74 90 66  8 67 57 84
            Card 112: 33 90 15 30 10 77 44 54 20 38 | 30 47 64 52 49 79 80 90 78 31 72 33 39 99 74 38 11 54  7 55 97 42 75 29 77
            Card 113: 40 12 82 18 61 55 59 56 65  6 | 65 40 49 90 37 82 12 41 27 59 64 55 70 56  6 39 89 87 11 33 73 25 10 61 66
            Card 114: 84 90 17 60 31 29 55  2 30 46 | 65 73 13 38 66 22 44 70 79 92  9 29 26 83 71 30 86 52 98 85 45 34 41 75 59
            Card 115: 15 71 14 80 13 76 83 78  5 11 | 20 10 94 72 89 47 15 71  1 39 17 77 22 28 90 25 85 54 59 35 23 33 86 34  3
            Card 116: 31 51 72 40 68 98 81  4 79 69 |  5 40 22 39 10 54 95 81  8 16 52 79 46 99 57 32 94  1 63 78 59 69 73 30 64
            Card 117:  5 78 66 25 95 56 50  1 53 77 | 23 58 26 81  8  4 47  2 46 28 44 59 74 97 90 34 49 91 48 45 12 61 51 93 19
            Card 118: 56 51 69 35 40 31 77 78 30  4 | 34 99 95 47 70 25 41 68 86 51 64 65 10 46  9 74 18 28  8 90 23 24 53 80 94
            Card 119: 72 61 69  4 16 21 92 36 26 47 | 82 96  1 35 54  4 84 33 34 77 62 65 68 85 53 73  8 14 37 44 55 31 94 59  5
            Card 120: 81 86 27 46 28 82 13 90  1 43 | 33 79 44 91 93 88 11 64 52 21 42 56 39 81 82 78 15 73 65 41  7 77 38 66 35
            Card 121: 91 39  4 59 49 20 81 86 44 35 | 18 70  5 83 63 80 55 66 84 25 15 16 65 75 38 36 58 92 56 11 78 32 54 24 46
            Card 122: 46 44 74 55  9 59 40 47 16 10 | 11 87 16 39 18 27 34 94 99  7 51 64 32 91 92 82  3 72 60 43 89 98 33 12  1
            Card 123: 71 34 44 91 92 82 46 50 66 56 | 22 75 31 25 69 57 62 14 85 19 21 41 17 59 48 99 73 58 72 24 33 61  3 97 49
            Card 124: 85 12 81 29 95 65 82 42 51 66 | 82  1 81 28 23 38 39 29 42 12 66 91 27 63 95 31 45 85 65 93 74 67 51  9 52
            Card 125: 81 70 47 86  1 42 91 36 24 85 | 78 36 77 24 43 38 29 72  4 83  1 21 28 22 48 89 14 86 91 81 47 27 42 70 85
            Card 126: 92  2 63 81  9 99 42 95 75 31 | 40  1  3 45 56  2 58 62 47 33 85 49 86 42 98 12 81 22 32 70 78 61 65 18 16
            Card 127: 61 78 43 28 99 26 93 65 79 53 | 43 28 78 64 79 53 65 50 70 48 98 35 22 63 93 71 20 26 14 17 31 99 84 61 75
            Card 128: 51 14 59 65 84 18  4 86 95 74 | 90 69 21 72 29 95 28 71 20 68 41 40 25 12 85 30 99 22 83 78 16 43 14 47 33
            Card 129: 41 36 25 82 22 62 48 58 17 88 | 22 53 55 37 50 49 44 52 48 61 62 38 58 82 41 78 88 17 94 76 68 95 25 13 36
            Card 130: 12 34 86 18 82 54 81 32 56 91 | 49 30 62 61 18 66 67 84 45 40 64 26 51 15 57 56 35 80 17 39 53 89 24 34 46
            Card 131: 83 29 67 31  6 76 41 52 19 94 | 46 11 78 96 33 55 64 83 29 71 19 52 31 74  6 44 95 28 41 67 76 88 94 90 79
            Card 132: 74 71 24  2  7 66 43 54 75 10 | 83 27 94 85 12 52 84  7 92 29  9 93 40 62 53 32 69 48  2 55 86 42 44 95 41
            Card 133: 54 16 20 35 22  7 50 55 46 94 | 83 25  4 18 79 90 30 99 51 43 85 12 33 89 22 56 61 57 26 93 64 14 42 39 19
            Card 134: 38 26 19 31 48 58 91 65 22 88 |  9 21 75  7 65 10  4 69 44 73 35 89 93 28 83 53 87 91  1 31 86 24 56 37 46
            Card 135: 49 93 60 36 30 27 70  5 57 61 | 19 12 36  7 82 38  9 13 54 30  3 56 24 58 21 35 85 59  4 55 90 65 60 80 23
            Card 136:  1 96 65 19 99 42 92 34 95 60 | 42 95 35 19 25 33 92 34 94 26 81 98 65 60 86 56 96 99 50 66 15 29  2  1 63
            Card 137: 36 33 19 17 72 94 55 35 88 48 | 73 66 41  7 27 12 25 47 62 78 16  9 81 26 82 98 75 32 15 95 89 46 65 54 58
            Card 138: 42 59 28 98 20 62 15 50 65 66 | 65 16 20 90 52 62 59 72  9 98 46 99 50 34  1 42 15 47 31 93 66 21  4 23  3
            Card 139: 22 76 73 91 94 10 89 40 68 59 | 81 40 26 73 59 22  4 17 71 80 62 88 91 46 43 60 89 76 27 16 28 93 50 52 82
            Card 140: 90 79 52 99 16  3  6  4 78 73 | 79 71 38 96 65 20 13 94 74  9 85 83  3 33 23 58 30 99 80 70 39 66 47 60 12
            Card 141: 73  9 48 60 53 47 70 46 20 38 |  2  7 96  1 24 13 98 62 58 55 71 73 12 36 32 66 11 15 49 57  3 22 64 93 51
            Card 142: 80 79 72 59 20 43 13 49 19 58 | 94 21 86 24 46 53 15  5  7 16 57 36 83 25 34 80 71 32  3 11  8 88 20  2 59
            Card 143: 41 27  2 90 16 97 75 99 37 24 | 14 71 89 54  9 85 99 21 88 49 91 97 36 90 41  2  5 81 63 56 13 23 43 26 48
            Card 144: 34 22 37 89 31 83 79 70 66  7 | 80  3 31 29 74 12 52 61 15 39 81  6 22 98  7 89 94 47 55 65 28 48 62 16 30
            Card 145: 28 88 74 72 87 44 21 61 69 93 | 78 62 64 63 69 67 97 87  9 80 52 41  2 57 98 42 75 11 25 95 38 70 92  8 50
            Card 146: 23 73  1 25 11 43  4 89 53 35 | 69 66 51 17 90 70 47  9 40 44 74 19 58 99 84  7 86 38 73 59 52 10  6 21 79
            Card 147: 32 27 47 38 37 50  6 11 92 77 | 66 18 62 30 13  2 55 23 57 47 29 40 46 87 71 69 48 19 84 94 45 67 96 15 74
            Card 148: 32 87 65  1 85 69 10 36 76 75 |  2 17 94 46  9 63 77 33 68 30 72 82 56 84 14 43 42 12 98 67 55 89 11 48 78
            Card 149: 98 30 10  4 52 91 73  8 83 54 | 28 91 12 10 30 53 54  8 52 68 34  2 23 64 11 21  4 14 51 94 98 50 83 73 36
            Card 150: 75 70 35 14 51 90 39 25 87 19 | 48 35 14 59 70 39  7 71 40 51 24 50 85 90 22 92 18 68 41 25 87 19 83 61 75
            Card 151: 15 25 92 39 49 88 51 60 42 47 | 23 69 94 88 74 80 12 41 29 49 71 47 67 31 89 82 87 92 15 51 60 42  1 25 39
            Card 152: 75 40 32 15 90 24 49 46 62 36 | 11 99 44 83 45 80  8 28 70 57  9 18 73 94 55 66 14 19 10 47 95 97 62 67 87
            Card 153: 50 23 26 14 83 51 12 13 37 68 | 93 58 56 98 39 55 92 54 36 29 50 85 42 49 66 61 14 70  7 75 51 87 37 30 96
            Card 154: 46 24 76  2 11 32 61 73 86 49 | 86 63 35 32 98 78 73 92  3 24 49 79 37 97 53 80  4 29 61 46  2 83 76 11 23
            Card 155: 92 59 74 11 35 33 52 71 67 91 | 24 35 38 33 64 58 97 52 71 51 49 59 74  1 91 45 84 99 56 67 11 92 73 23 48
            Card 156: 90 44  4 88 50 45  2 68 27  1 |  4 74 36 10 14 95 16 87 44  2 33 63 45 81 38 27  3 11 29 58 90 55 30 64 98
            Card 157: 96 97 16 21 61 89 70 46 75 80 | 80 97 22 69 82 61 50 65 70 16 21 84 89 96 83 46 71 59 75 79 98 23 15 30  3
            Card 158: 31 33 66 80 14 61 94 84 56 42 | 94 35 14 80 27 42 31 56 52 48 97 92 74 84  3 72 15 61 95 33 57  9 28 34 66
            Card 159: 47 58 72 36 89 15 29 56  4  5 | 47 82 77  4 58 73 51 30 72 86 36 66 29 96  5 31 56 83 24 55 89 15 54 90 32
            Card 160: 22 27 25 16  7 34 60 65 36 82 |  8 67 22  5 84 13 21 10  6 27 77 43 23 57 36 65 71 12  7 80 19 81  3 85 25
            Card 161: 11 82 72 20 88 53 86 31 44 92 | 30 72 80  6 52 93 48 98 18 22 44 81 46 84 86 14 36 92 53 88 82 66 95 38 59
            Card 162:  4 71 73  9 72 76 20 55 37 30 | 24 48 97 31 33 55 46 81 79 15 51 30 11 49 25 18 77 67 73 26 10 69 42 98 41
            Card 163: 49 31 41 19 61 21 32 40 95 42 | 31  2 41 53  4 12 81 88 36 69 90 50 95 75 48  5 16 82 23 42 91 13  6  9 97
            Card 164: 25 48 96 99 60 63 94 84 56 32 |  5  3 99 25 60  2 84 78 89 52 66  8 22 97 19 21 93 26 87 10 72 71 15 58 91
            Card 165: 11 37 82 74 31 10 97 13 59 66 | 82  3 75 35 10 37 33 34 77 41 59 74 70 57 86 13 87 84 11  6 72 66 88 25  5
            Card 166: 31 51 74 33 48  8 14 97 21  2 | 67 45 81 11 78 40 52 72 34 12 58 14 92 53 77 49 47 44 64 79 95 10 16 65 27
            Card 167: 60 22 10 31 14 71  3 21 73 85 | 92 34 70 37 16 91 87 15 21 63 86  6 19 58 85 57 68 47 42 39 27 74 89 28 20
            Card 168: 56 27 76 73 50 91 35 20 29  4 | 93 76 58 87 45 12  6 84 34 55  1  8  2  4 31 21  9 44 35 33  3 82 83 94 91
            Card 169: 95 44  9 64 20 59 17 61 81 58 | 39 18  1 21 90 44 53 69 43 94 85 50 62 27 63 96  9 81 60  5 67 80 79 75 17
            Card 170: 83 33 31 18 99 96 98 39 12 81 | 42 37 51 15 60  4 94 49 26 88 27 83 10 62 92 58 76 54 38 72  7 30  8 46 22
            Card 171: 36 18 98 39 63 75 53 28  2 76 | 78 83 76  8 30 12 41 64 96 19 40 80 92 42 67 11 86 50 14 17 51 98 46 27 65
            Card 172: 62  3 96 45 26 33 11 53 44 19 | 18 83 15 97 49 76 95 10 96 22 77 28 51 82 32 81 59  5 73 38 29 98  9 74 80
            Card 173: 53 96 78 27 83 80 42 48 15 90 | 51 26 35 13 16 44 88 10 75  8 29 39 28  1 33 79 19 81 56 11 89 60  6 47 46
            Card 174: 14 35 82 23 88 98 51 71 95 17 | 93 66 56 83 77 36 87 99 15 90 18 74  1 57 91 29 25 34 65 52 54 88 23 14 96
            Card 175: 18 52 49 74 39 28 55 25 42 79 | 66 35 99 24 68 32 45 25 43 18 20  9 98  4 73 39 23 42 37 49 75 33 94 50 63
            Card 176: 20 82 72 86 56  3 12 84 92 61 |  3 57 38 63 26 77 54 96 39 71 48 41 21 97 15 22 33 24 65 51  4 43 74 27 59
            Card 177: 42 20 63  4 55 12 50 37 96 79 | 30 46 57 63 65 43 41 35  9 25 33 92 79  4 60 42 73 96 72 61 23 89 99 20 10
            Card 178: 27 47 39 92 53 89 94 48 83 80 | 48 75 49 47 67 53 56 88 19  5 31 28 46 40 14 83 27 39 92  6 43 94 33 89 97
            Card 179: 97 31 80 73  8 79 88 89 36 20 | 11  4  2 76 26 17 22 35  8 83 60 62 64 13 52  1 79 84 94 92 68 30 56 40 80
            Card 180: 86 22 35 51 84 48 53 75 31 63 | 46 25 35 58 89 13 59 93 48 75 92 90  1 41 86 22 88 53 19 69 28 63 64 81 71
            Card 181: 86 31 74 83 85 55 91 34 75 12 | 68 19 86 26 85 40 37 77 17 56 34  6 21 83 75 88 27 52 31 76 74 92 32  1 55
            Card 182: 94 95 38 48 52  6 14 35 69  2 | 31 54 90 94 61 83 92 40 98 77  1 18 41 42 81  7 87 34 80 47 23 66 21 63 37
            Card 183: 12 24 88 81 17 79 74 39 92 85 | 69  2 74 17  8 28 19 24 15  1 84 35 10 43 48 88 52 82 39 62 96 86 11 87 22
            Card 184: 83  9 86 81 47 69 65 41 98 34 | 74 82 72  5 57 29 38 45  1 21 18 84 91 65 87  6 30 11 35 13 48 97 66 46 70
            Card 185: 64 91 37 62 88 49 74 23 61  2 | 90 25 96 69 92 54 43 27 16 65 97 63 20 44 70  2 37 51 80 68 59 81 91 41 12
            Card 186: 45 77 32 92 39 18 62 44 19 53 | 88 11 70  5 97 46 65 89 35 38 87 78 63 28 19 37 79 99 27 55 80 72 26 15 51
            Card 187: 69 55 15  8 38 94 47 41 87 35 | 65 70 51 63 56  2 88  3 34 79 44 76 37 53 24 97 78 35  1 11 49  9 18 16  5
            Card 188: 59  6 46 62 43 98 56 21 10 70 | 27 96 83 78 20  2 84 45 94 41  7 82 15  8 53 38 87 73 36 66 24 34  9 67 51
            Card 189: 40 85 84 28 11 89 93 64  1 14 | 82 13 65 83 16 51 56 71 41 23 94 10 67 70 44 98 32 34 63 69 79 37 78 95 35
            Card 190: 44 99 94 98 68 23  5 96 29 90 | 99 42 14 95 45 19 82 67 27 87 90 10 70 12 33 79 81  1 31 86 35 47 84 11 72
            Card 191: 38 20 92 57 74 24 27 17 22 39 | 66 36 59 50 46 22 20 11 25 62 96 15 80 68 24 39 23  3 60 74 92 57 38 17 27
            Card 192: 34 35 12  1 30 22 17 55 14 15 | 14 13 15 33 95  6 55 12 79  2  5  7 22 53 34 10 35 84 19 30 17 26 43 47  1
            Card 193: 91 17 30 53 61 97 10 66 31 84 | 61 53 82 29 30 31 99 22 66 91 21 36 15 88 33 10 57 84 75 17 97 80 69 45 93
            Card 194: 90 72 71 86 87 46 24 41  1 54 | 72 19 36 98 99 83  6 86 43 57 96 47 67 79 81 50 33 46 25 90 17 15 70 97 56
            Card 195: 48 26 97 36 79 35 62 65 42 81 |  2  3 48 97 71 89 57 76 26 36 69 99 52 35 60 42 22  6 37 51 62 84 21 95 46
            Card 196: 47 30 78 70 87 36 92 28 86 27 | 92 87 88 57 40 91 75 30 65 28  4 27 43 86 70 49 64 47 34 22 36 80  7 50 78
            Card 197:  6  7 56 65 43 73 15 17 54 80 | 72 22 44 82 36 55 94 71 74 87 77 38 32 45 78 92 20 84 16 51 91 11 59 68  9
            Card 198:  6 87 55 16 40 13 29 71 58 42 | 36 22 85 77 30 25 72 23 96 70  3  7 54 69 82  1 21 18 95  2  5 84 89 41 81
            Card 199: 31 66 71  2 54 16 14 18 67 70 | 44  6 10 86 71 21 45 35 49 31  3 64  5 60 34 63 41 85 61 23 33 40 43 94 74
            Card 200: 23 40 93 28 11 47 33 37 48 56 | 35  8 23 41 96 85 91 40 93 89 14 37 47 11 98 83 19 48 28  7 36 39 56 62 27
            Card 201: 81 48 69 18 49 71 60 95  9 83 | 23 26 37 29  5  6 45 53  8 52 69 63 73 82 15 58 36  3 51 72 97 68 16 89 14
            Card 202: 81 60 71 11 34 57 50 49 39  5 | 64 74 36 89 32 29 87 94 34 73 55 20 85 13 49 69 56  4 62  7 84 18 88 97 98
            Card 203: 45 93 57 29 63 90 64 47 65 13 | 21 38 68  8 89 71 11 82 24 64 59 85 41 39 36 25 43 20 99 23 67 76 62  9 93
            Card 204: 41  6 21 63 53 85 56 92 55 49 | 56 92 27 73 94 82 48 50 24 14 63 90 75 49 84 85 15 54 83 38 55 41 21 23 36
            Card 205: 41 91 43 89 56 84 10 76 81 67 | 21 65 20 28  8 54 10 40 12 84  9 86 69 59 90 71 77 52 76 97 66 88 17 56 91
            Card 206: 83  1 24 30 50 91  4 47 11 22 | 26 41 44 65 45 78 36 37 30 49  6 75 50 73 47  2 21 53 94 98 64 40 87 10 96
            Card 207: 65 85 93 66 38  3 89 76 98 72 | 55 72 80 12 93 50  8 83 84 82 76 17 90  5 65 34 96 45 44 97 57 73 33 92 13
            Card 208: 15 99 75  8 52  6 30 82 64 36 | 27 54 28 64 98 24  3 71 63 92 47 55 31 34  6 48 37 99 70  8 30 66 32 52 91
            Card 209: 71 75 51 76 70 55 37 34 16  5 | 91  1 79 65 66 24  2 38 47 92 61 71  4 84 57 60 86 19 50 44 67 40 27 32 62
            Card 210: 24 92 99 37 74  1 69 98 96 67 | 47 16 33  5  8 62 20 46 50 73 32 71 80 68  7 17 14 96 65 54 76 30 75 98 72
            Card 211:  7 47 34 58 54 38 70 93 43 87 | 97 79 37 72 88 27 17 14 78 94 59 63 87 15 53 46 57 98 75 42  1 40 28  3 89
            Card 212: 95 63 96 50 55 64 62 11 66  1 | 17 28 19 53 76 38 90 94 31 87 32  6 27 10 63 68 25 70 22 42 79 41  3 47 72
            Card 213: 44 62 67 29 17 65 45 35 48 51 | 21 54 20  8  3 49 55 85 91 58 59 27 37 35 28 83 92 90  1 81 47 73 69 33  2
            Card 214: 96  3 24 46 13 64 86  8  2 92 | 97 54 53 88 12 17 61 21  7 40 79 16 39 25 69  9 50 56 91 31 32 90 19 37 33""";
    public static final String DAY_5_EXAMPLE = """
            seeds: 79 14 55 13
                        
            seed-to-soil map:
            50 98 2
            52 50 48
                        
            soil-to-fertilizer map:
            0 15 37
            37 52 2
            39 0 15
                        
            fertilizer-to-water map:
            49 53 8
            0 11 42
            42 0 7
            57 7 4
                        
            water-to-light map:
            88 18 7
            18 25 70
                        
            light-to-temperature map:
            45 77 23
            81 45 19
            68 64 13
                        
            temperature-to-humidity map:
            0 69 1
            1 0 69
                        
            humidity-to-location map:
            60 56 37
            56 93 4""";
    public static final String DAY_5_INPUT = """
            seeds: 768975 36881621 56868281 55386784 1828225758 1084205557 2956956868 127170752 1117192172 332560644 357791695 129980646 819363529 9145257 993170544 70644734 3213715789 312116873 3107544690 59359615
                        
            seed-to-soil map:
            2797638787 1764015146 26675178
            3378130613 0 34101494
            388521182 772535426 141493697
            1148410839 174832460 323494173
            4259440029 4076987921 35527267
            1664835130 2610603190 214355271
            530014879 1680432282 83582864
            1471905012 758583825 13951601
            3909335908 4187323696 107643600
            3834527400 4173068203 14255493
            2824313965 136499996 38332464
            191321127 498326633 7266716
            1562436628 34101494 102398502
            3224943851 3320680296 153186762
            4058150677 3747050674 42920787
            2360258758 2578478063 32125127
            1485856613 682003810 76580015
            613597743 1875739628 457683244
            4016979508 3789971461 35854425
            3412232107 562825709 61634951
            4101071464 3825825886 158368565
            3848782893 4112515188 60553015
            3119382417 1629353314 51078968
            1879190401 1555705358 58037106
            2169686033 2387905338 190572725
            2900098047 914029123 217063885
            1071280987 2824958461 77129852
            3770924949 3984194451 63602451
            2449927035 2902088313 205430088
            2740406427 505593349 57232360
            198587843 1365772019 189933339
            0 3107518401 191321127
            3741733930 4047796902 29191019
            2655357123 1790690324 85049304
            1937227507 1133313493 232458526
            2392383885 624460660 57543150
            2862646429 3298839528 8221502
            3170461385 2333422872 54482466
            3117161932 1131093008 2220485
            2870867931 3307061030 13619266
            2884487197 1613742464 15610850
            4052833933 3741733930 5316744
                        
            soil-to-fertilizer map:
            4028970075 3670916442 62323047
            2369466456 2039626615 114411480
            1849958430 857955699 318236064
            3393877313 4090328901 50115157
            2483877936 2154038095 163115765
            1589335864 2448679033 50786994
            378911477 2812908636 641955
            1562596120 1971627164 26739744
            2168194494 224261755 114905540
            2837233268 2508892349 45204280
            3094415439 2813550591 72281454
            3166696893 1619734477 89254096
            0 2317153860 40391789
            1131679423 1771284034 40991112
            1765319835 1708988573 9045883
            1365410346 1420078500 197185774
            2305946785 794436028 63519671
            2882437548 2691241517 119296423
            3001733971 3046337498 45651876
            3643083526 3393877313 47307752
            379553432 1812275146 28890919
            1172670535 1206862634 190369115
            2807083959 1741134725 30149309
            2694347611 467149827 112736348
            2646993701 579886175 47353910
            4091293122 3733239489 203674174
            1763025041 1718034456 2294794
            40391789 1998366908 41259707
            808535136 1176191763 22037784
            799902049 1198229547 8633087
            632706106 627240085 167195943
            3598515708 3936913663 44567818
            408444351 0 224261755
            3799238698 3441185065 229731377
            3443992470 4140444058 154523238
            376441274 1617264274 2470203
            1795171193 339167295 54787237
            830572920 3091989374 301106503
            81651496 1841166065 130461099
            212112595 393954532 73195295
            3255950989 2554096629 137144888
            3690391278 3981481481 108847420
            1363039650 2810537940 2370696
            3047385847 2499466027 9426322
            285307890 2357545649 91133384
            2283100034 1397231749 22846751
            1640122858 2923435315 122902183
            3056812169 2885832045 37603270
            1774365718 1720329250 20805475
                        
            fertilizer-to-water map:
            4242763083 2459563591 52204213
            2506579022 1704611330 53532973
            268946243 855055502 34908994
            1704611330 3860653042 434314254
            2640952334 3547869528 81626644
            1436013703 728008388 21784904
            0 680695205 47313183
            140858905 749793292 69300705
            686187385 489152830 141379201
            3612022528 2522034035 498682726
            827566586 959642930 428042082
            260322784 12467526 8623459
            2435545592 3789619612 71033430
            47313183 1387685012 93545722
            303855237 21090985 382332148
            2425279361 2511767804 10266231
            2947118206 2257396248 202167343
            1457798607 403423133 23432127
            2138925584 1890202132 286353777
            1366335269 889964496 69678434
            1255608668 819093997 35961505
            210159610 630532031 50163174
            1291570173 0 12467526
            2560111995 2176555909 80840339
            3419426199 3416054902 131814626
            3149285549 3159639578 110017210
            2868977092 3081498464 78141114
            4110705254 1758144303 132057829
            3551240825 3020716761 60781703
            2722578978 3269656788 146398114
            3259302759 3629496172 160123440
            1304037699 426855260 62297570
                        
            water-to-light map:
            1712728062 165708071 30118229
            994660402 322543075 139832356
            2666749758 3184731531 182834316
            3535613929 2585377632 130318231
            1589771501 643255284 6486180
            3665932160 773195884 193821728
            2655704544 2479239619 11045214
            2970686930 195826300 21859186
            1596257681 2345480344 116470381
            2648218599 765709939 7485945
            267433833 0 38915982
            701913980 2301280038 4624639
            2130796669 1543842466 272797567
            57533669 1275520329 209900164
            1756207753 3442698892 374588916
            3859753888 2305904677 39575667
            1134492758 2809419770 26839161
            309521113 217685486 8494012
            433983600 1485420493 20638459
            1742846291 522451528 13361462
            1161331919 2715695863 90552609
            1251884528 967017612 308502717
            3052622213 2490284833 95092799
            454622059 2461950725 17288894
            2472852656 535812990 24122952
            318015125 649741464 115968475
            2496975608 3367565847 75133045
            553952700 3070057156 114674375
            668627075 1959120081 31105212
            2992546116 462375431 60076097
            3147715012 299507329 20253631
            2574890768 226179498 73327831
            0 108174402 57533669
            306349815 2806248472 3171298
            2887367588 559935942 83319342
            760862177 2836258931 233798225
            1560387245 1990225293 29384256
            3167968643 1816640033 140298355
            2572108653 319760960 2782115
            4260952033 4113795026 34015263
            2849584074 1506058952 37783514
            2403594236 38915982 69258420
            706538619 2246956480 54323558
            4113795026 4147810289 147157007
            3308266998 2019609549 227346931
            471910953 3817287808 82041747
            699732287 1956938388 2181693
                        
            light-to-temperature map:
            1642970452 2619648642 320925092
            871949201 797630676 97655745
            655931949 2008010966 216017252
            3785141775 4061613243 12865567
            4215077801 4197959319 79889495
            2563411697 1252642831 573187176
            1254390764 4601171 388579688
            0 1980893220 27117746
            3136598873 895286421 241010052
            3798007342 3785141775 276471468
            467378984 1136296473 116346358
            62929167 393180859 404449817
            583725342 2257865135 72206607
            58327996 0 4601171
            1220553847 2224028218 33836917
            1065490634 1825830007 155063213
            2157586756 2971783984 405824941
            1963895544 2330071742 193691212
            4197959319 4277848814 17118482
            969604946 2523762954 95885688
            27117746 2940573734 31210250
                        
            temperature-to-humidity map:
            3204530368 2689103462 122673126
            1097831066 741139709 15277662
            2587190266 2506197062 28166734
            2972900803 2149468273 231629565
            2754733708 3879909767 93747273
            1118529763 1007376005 639297716
            591529103 1795771252 224967444
            1113108728 305315251 5421035
            2266839735 3973657040 65644628
            3425464071 2534363796 64415445
            2332484363 2811776588 254705903
            3353763689 3525362348 71700382
            411622859 756417371 179906244
            2629634484 2381097838 125099224
            0 1646673721 149097531
            1912202739 439529310 384078
            1828879869 221992381 83322870
            1038488928 310736286 59342138
            2149468273 3597062730 22900616
            3731081879 3337447905 173636959
            2172368889 2598779241 90324221
            218548417 439913388 193074442
            3489879516 4053764933 212174931
            3327203494 3090464996 12096930
            149097531 370078424 69450886
            2615357000 3511084864 14277484
            4064227942 3102561926 230739354
            3702054447 4265939864 29027432
            838437176 21940629 200051752
            3339300424 4039301668 14463265
            2262693110 3333301280 4146625
            3904718838 3619963346 159509104
            2948918298 3066482491 23982505
            1757827479 936323615 71052390
            1912586817 632987830 108151879
            2848480981 3779472450 100437317
            816496547 0 21940629
                        
            humidity-to-location map:
            3394148556 2925849667 56813934
            4223178672 3844939961 29088809
            3743018622 3753904164 91035797
            6295169 0 111018407
            3175071902 3531111280 47991613
            4252267481 2883149852 42699815
            129982843 693964199 99494334
            229477177 272742930 300412252
            798562242 793458533 315959887
            1114522129 680103472 13860727
            3223063515 3050521430 171085041
            1574260097 2117833331 253788822
            691613952 573155182 106948290
            2250567596 1223353243 43558595
            2851928754 4027938301 267028995
            3887810914 1266911838 1671681
            3725220028 3431759743 17798594
            1828048919 3449558337 77343652
            2479857123 3329899124 101860619
            3889482595 3526901989 4209291
            3604872021 2982663601 7751828
            3834054419 2371622153 53756495
            1905392571 2537974827 345175025
            2581717742 1324697672 270211012
            1145914964 1689488198 428345133
            2294126191 3221606471 108292653
            3612623849 2425378648 112596179
            117313576 1109418420 12669267
            4163072671 2990415429 60106001
            3893691886 1594908684 94579514
            0 1122087687 6295169
            3450962490 3874028770 153909531
            2402418844 1145914964 77438279
            3988271400 3579102893 174801271
            3118957749 1268583519 56114153
            529889429 111018407 161724523""";
    public static final String DAY_6_EXAMPLE = """
            Time:      7  15   30
            Distance:  9  40  200""";
    public static final String DAY_6_INPUT = """
            Time:        56     97     78     75
            Distance:   546   1927   1131   1139""";
    public static final String DAY_7_EXAMPLE = """
            32T3K 765
            T55J5 684
            KK677 28
            KTJJT 220
            QQQJA 483""";
    public static final String DAY_7_INPUT = """
            99898 978
            T99A9 198
            43Q34 550
            KK8QK 418
            Q6Q57 767
            35A37 832
            AJ867 137
            45679 936
            8TJ88 409
            7772T 208
            8KJKQ 788
            KKK66 948
            JATQA 365
            2A224 66
            77QKA 119
            88844 834
            68K68 872
            225J7 557
            A7A3A 855
            22326 7
            7A7JQ 565
            JQ44Q 735
            5AA55 970
            A23JQ 715
            77976 47
            QQ333 162
            7JT7T 333
            9T9T9 151
            JJ888 217
            77QQQ 954
            TJ999 145
            44J4T 485
            J9378 655
            3TK2T 747
            297K5 257
            AK77K 912
            J25J4 120
            999Q9 928
            Q9Q88 981
            9K696 919
            66336 268
            86J69 168
            26729 650
            8A7K2 59
            7K77K 12
            7Q567 391
            5TQT5 688
            JT838 968
            45JJQ 647
            JA44A 716
            3QT98 507
            6KT38 241
            88838 362
            AAA36 1000
            KTKKJ 934
            JJ8JJ 178
            66286 757
            27722 625
            99899 53
            6J6TT 128
            TQ536 540
            72222 165
            K22K2 397
            JA3AA 719
            236Q8 82
            Q229J 974
            9639J 793
            9Q67A 787
            7JJ77 926
            KK33K 423
            AT735 497
            KA3AK 664
            AJQAA 459
            JJT24 20
            7J82Q 184
            52K52 211
            557K7 196
            3JJ3J 531
            68J8T 375
            6A5KQ 93
            J55AA 454
            5838Q 898
            9J7A9 32
            T666J 419
            777J7 99
            38823 319
            A4979 452
            K22JK 740
            8T4T8 663
            A9TQA 63
            KJ2T5 13
            Q2946 614
            39937 904
            53975 982
            29JTA 152
            65T8J 718
            6286T 500
            JJAAJ 528
            9K226 842
            TA436 902
            7464K 473
            Q55AQ 155
            63AA6 605
            QK6KA 25
            2442J 760
            7A787 706
            AQAQQ 140
            KJTAK 689
            88A8A 91
            QA268 187
            T8T36 308
            K7727 961
            82228 225
            A55A8 811
            Q63AQ 161
            4AKKT 589
            J2223 269
            5J673 376
            8586K 776
            774KA 887
            J5523 223
            J78T6 481
            QQQKQ 240
            TQJQQ 668
            K3T89 430
            TTT3T 588
            56655 604
            TJJ8A 329
            49422 969
            5T6T5 233
            J3773 894
            99939 253
            869T7 14
            QQ242 143
            4AQJ7 174
            T74AQ 973
            2397K 106
            656T5 810
            KQ2QK 250
            99797 330
            KQQK6 797
            T9J9Q 170
            586TK 310
            AK54J 366
            2676J 744
            462KT 958
            32366 460
            K4664 651
            8K859 683
            TTT4T 517
            43343 849
            K3TTK 341
            747KJ 70
            4494T 1
            6A962 378
            AAAA4 197
            9K6A6 583
            TT68J 237
            77K5J 576
            JTK55 467
            T8T88 559
            55497 918
            7J4TK 946
            K3756 401
            88J48 594
            T6666 8
            A8AAK 3
            AAAQ7 316
            JA3A6 897
            3J77K 789
            929KJ 773
            9KJ22 129
            K93A7 5
            Q88T2 727
            669Q6 57
            555A5 875
            AQ8JJ 632
            6767Q 352
            9AAAJ 745
            AJ7Q8 979
            55252 343
            89QTA 406
            T5555 845
            9TTTT 676
            6J8J7 696
            9AQ8A 772
            A25KK 831
            K5K64 337
            J62JQ 659
            K344K 377
            95T2Q 281
            65666 527
            A9A8A 925
            JQKKJ 580
            43K2K 266
            JJ5J5 259
            QJT65 564
            Q6886 285
            3QJQQ 67
            T88TT 867
            99922 31
            22225 648
            4A235 816
            68866 967
            73377 494
            5TT5T 228
            9QQ99 618
            4K73T 472
            Q6QQQ 426
            TT3T6 871
            TJ498 712
            6Q8J6 786
            QQAAK 892
            46377 264
            62832 711
            5J57Q 642
            A28A2 561
            T7K79 624
            2T22J 402
            J5252 820
            T7988 299
            T9988 603
            97369 993
            88JJJ 726
            8KK8K 72
            694K6 457
            999J3 514
            78QKK 364
            K6Q9K 743
            636AK 717
            5KT49 826
            84A65 957
            42K74 575
            23322 512
            69KAA 65
            66339 96
            3QATA 999
            J7887 311
            QA55A 214
            J2242 389
            J9999 346
            99599 703
            77Q7Q 68
            25QK2 292
            9JAT6 361
            QAQQQ 923
            48TJ6 815
            55TK8 115
            22668 751
            KKKA7 853
            372A4 424
            4KK22 710
            58555 478
            6756J 775
            36888 620
            KKK64 940
            24KK4 530
            78437 405
            63QJ5 653
            TTQ7K 771
            55352 995
            4Q83J 149
            5Q55T 421
            Q7Q4T 498
            T6496 144
            35433 807
            JKQJT 836
            979A7 38
            3K658 534
            J7QJ4 707
            Q947A 232
            J439J 458
            K7777 230
            59525 360
            KKKK2 370
            9KKQK 554
            J2T2Q 484
            TT626 847
            Q3299 812
            67TAJ 2
            66926 97
            2Q7QQ 56
            K797J 242
            5J455 103
            J66AJ 438
            77477 71
            83438 4
            JJT3Q 722
            5A7KA 873
            77778 756
            93744 888
            99AAT 489
            A75KQ 989
            33A33 450
            6786J 916
            J55J5 821
            99788 503
            66A3T 493
            JJJA7 112
            ATTJ3 465
            K9K7K 699
            9T9TT 885
            883K8 858
            96J24 590
            8J88Q 939
            39TJ5 328
            QQA23 966
            A229A 619
            8K267 868
            66686 425
            T662J 634
            QQJQ8 997
            3Q694 980
            66636 325
            TT8JK 296
            289T7 231
            9K479 801
            66AJ6 327
            524Q8 298
            JTTT8 684
            QQ9QJ 357
            2222T 219
            QQQ22 692
            9TQK8 635
            4T378 731
            2K77T 125
            5757T 860
            2J222 29
            64J4A 183
            439T2 769
            JA6QA 21
            4Q8QJ 929
            4JQ93 822
            TT34J 804
            QQ7KK 179
            JJA22 943
            5TJ6T 455
            43QTA 545
            JQ2Q2 572
            94449 78
            AA7AJ 814
            89666 529
            37443 385
            TTJ22 607
            AAKKJ 502
            4K444 289
            AAAJA 374
            T3T74 121
            K7TA4 794
            T73A2 153
            673J7 446
            QQQ66 132
            Q8288 675
            9JJ44 262
            326JQ 746
            JQ44K 277
            33T33 422
            4555Q 626
            33353 172
            7Q8K9 515
            55T27 750
            KA29T 382
            JTTA4 471
            8A8JA 135
            A8AA5 462
            25443 487
            555AJ 475
            J5T55 522
            Q2942 657
            JKK88 182
            T5TKJ 251
            Q3942 965
            9Q853 806
            2QKQQ 113
            T9J66 272
            KK7KK 838
            2JTQ6 307
            4J494 24
            59K4J 917
            K26JJ 398
            44743 17
            5T548 275
            KAA99 50
            4J6A5 896
            8J9J6 766
            8J888 613
            QQ2QQ 349
            54544 581
            T4666 347
            82J62 448
            K2KAA 186
            92TQT 646
            4Q4A4 107
            525J5 436
            22759 739
            75456 94
            QQ3Q3 695
            22296 567
            T44TT 796
            JT55T 102
            2A9Q4 569
            Q9QQQ 854
            J554A 136
            J8KKJ 835
            65QK7 667
            777QK 597
            76677 278
            35555 670
            8Q32K 577
            28KA5 546
            T95T9 209
            44QAA 622
            2A98T 40
            6AA6A 41
            JTTQT 984
            K885K 686
            444J4 254
            2TK96 599
            TJ24T 301
            628K5 535
            9K73Q 987
            J6KQ3 795
            9J663 199
            3KQ5J 271
            47864 761
            5KAAA 238
            Q474A 381
            65A45 578
            93JA8 592
            2K5T5 95
            Q3777 985
            54465 280
            A9A33 631
            377J7 387
            A8867 759
            323KJ 134
            74447 42
            3T433 725
            66AQ6 139
            29926 283
            4K868 293
            AAAAQ 164
            4Q92Q 693
            TT7AK 142
            K2A77 215
            44Q44 15
            64AA5 64
            92T49 930
            2AAAA 570
            KKKTK 188
            J444K 573
            KK4KK 627
            88T77 83
            J7959 261
            9Q2TK 479
            22622 176
            JJQJ2 900
            A328T 58
            3A33J 263
            KT76K 874
            35A28 852
            7877J 640
            J6QA9 428
            2622T 709
            KT736 202
            KKQKA 392
            QA542 236
            J333T 694
            J99J9 394
            QQJ2Q 677
            K223Q 645
            692Q6 798
            86792 932
            Q33T3 207
            3TAQQ 552
            Q65AJ 226
            74444 449
            9J47T 439
            3Q7KA 749
            AA8A8 39
            5KQ5J 150
            TTTJT 111
            5355J 286
            46J6A 468
            J6T24 679
            A43T3 990
            8659J 732
            88JJ7 173
            5T379 800
            AA777 26
            6KT9Q 555
            43444 850
            72T72 274
            42222 16
            262J6 840
            KAKAQ 864
            T367J 889
            A2A22 235
            58566 509
            399J3 996
            QAAQA 802
            3J3J6 321
            99449 942
            TTKTK 612
            JT6TT 456
            AATA7 54
            37536 678
            54A44 248
            77737 195
            K495K 661
            9QQ9Q 22
            66J66 396
            A649J 146
            22599 724
            22929 988
            2K2QK 444
            58622 508
            AAA3Q 354
            55J75 538
            K9KQQ 62
            K6QAJ 169
            A2KQQ 666
            J44J4 818
            QA8QA 755
            33343 331
            A2634 44
            664T4 729
            K3QQ3 701
            4AKTJ 519
            T7T97 124
            54KJ8 733
            9QJQ9 273
            866T6 167
            K7TTK 480
            8TJ84 705
            24477 608
            78877 148
            A7777 300
            QQKKK 844
            KJ347 803
            9699Q 160
            J22J2 601
            3AQ82 827
            AA844 758
            QQT7Q 690
            4KAJ6 960
            J77AJ 950
            3TT3T 166
            2A62Q 636
            QQAJA 55
            222A8 28
            3TA59 579
            834A3 833
            6K26K 819
            92T9K 466
            954A5 118
            5KKKK 935
            J86J6 400
            454TK 404
            A5255 463
            269TJ 61
            6A686 407
            39333 861
            A25A2 431
            JK72Q 388
            A74AA 412
            T5QA6 790
            6AJAA 74
            934TT 563
            9JJK9 359
            A534K 358
            62TA9 568
            7T474 158
            JA8AA 443
            J95J7 641
            5585J 86
            2Q9KA 708
            3733T 350
            83373 914
            T89TJ 35
            KKJKK 644
            JT645 742
            KK656 846
            2A25T 983
            74KKK 437
            8Q898 730
            K6J56 413
            49989 464
            79797 532
            6Q444 353
            AKQ42 371
            84844 784
            626K6 288
            535QJ 870
            QQ686 523
            3643K 37
            34T2Q 977
            J3272 260
            2222Q 87
            4TTKQ 36
            T2AQ8 314
            94349 229
            77673 825
            J27A5 513
            TQQ25 649
            TT77T 869
            32632 175
            39799 312
            6QKTT 189
            TK428 859
            68648 306
            QKQ5A 372
            755JJ 427
            J8969 239
            A835T 355
            4J56Q 486
            T475A 363
            Q72KT 23
            37733 837
            J9959 687
            56595 738
            88778 909
            JKQQ4 937
            QQ766 297
            6TAK5 944
            87Q4A 34
            595Q9 947
            45J45 543
            AKQ59 629
            5A4KT 395
            4A576 440
            T8TTK 379
            8887J 582
            A5947 417
            88848 383
            33QJ4 482
            8A77A 411
            66A9T 863
            93935 291
            JTJT2 824
            2KQJQ 474
            Q33A9 587
            4Q244 956
            36TAT 108
            8498K 19
            944KJ 539
            JTTAT 130
            82828 638
            795A7 201
            5Q5QQ 910
            66QJ6 596
            2224Q 303
            5K278 895
            A4854 783
            4744J 338
            242A7 681
            8358J 491
            322QQ 141
            99499 267
            TT277 741
            9KQ7Q 445
            3TT33 799
            T224T 416
            J6TA4 351
            45555 516
            444A9 110
            KKKAK 768
            T2778 249
            6666K 216
            96566 504
            96J96 866
            5J284 891
            52555 702
            44JA4 496
            73QQQ 952
            A7TT2 403
            55TT2 673
            A552T 972
            9855J 210
            49J53 606
            Q4A4Q 994
            8J8K2 492
            49623 884
            T5T6T 785
            8484J 495
            55559 924
            96929 276
            JJ857 533
            555J5 123
            Q293K 704
            T4275 553
            22228 380
            44245 903
            A6696 116
            89T2J 410
            94J99 104
            24227 224
            K9KKK 777
            QQQQ3 748
            T6ATT 591
            33J39 147
            AAQ66 131
            9K9K9 441
            KQ88Q 245
            45K44 157
            2A6K4 393
            366J7 736
            3K72J 76
            2TT22 33
            8777Q 200
            6TJJ4 302
            338A8 433
            276K9 434
            Q884Q 100
            7Q77J 258
            J9AJ7 315
            A849T 10
            99QQ8 227
            455J2 600
            99699 322
            26868 114
            J88A8 886
            5A796 483
            5TTTT 933
            JQ6QK 805
            9J6A3 255
            33733 368
            A397J 593
            T7TTT 317
            8K447 18
            55Q5A 656
            59993 320
            4JJ28 906
            3JKTA 584
            AAQ6A 857
            KQ7J7 420
            T6K22 246
            3363K 520
            JQQQQ 384
            ATJ7T 713
            95455 992
            2QK6Q 11
            66722 737
            8A327 510
            6J6QJ 453
            888J5 781
            338A3 526
            J4TJT 548
            A9627 52
            29277 792
            83866 244
            97AAA 159
            4K4K7 848
            QATTT 610
            AK26Q 75
            5976K 566
            88899 101
            33K33 662
            42739 652
            QQ8Q6 89
            K3KK7 880
            9944K 672
            QQQQ4 763
            242K5 181
            T86QA 915
            55K2J 488
            26262 326
            A5755 518
            22292 938
            AKT2T 691
            Q79J2 630
            JJ488 6
            QK9QQ 501
            8T59A 447
            4222T 222
            2A4A5 971
            KQ5TT 949
            8JJAA 88
            2A3Q2 922
            76696 658
            J22JJ 122
            Q5362 616
            A9T9T 602
            4A234 290
            33999 714
            7Q9J6 964
            4K424 660
            848JK 558
            K4K44 881
            57K5K 839
            3222Q 505
            6QA98 117
            929AA 340
            42546 945
            9QQQ8 698
            8KK88 674
            QTQJ4 51
            4KKJK 671
            KJQ7T 243
            33437 90
            QA5JA 654
            JKT3J 927
            33K39 752
            KKK62 332
            4AA5A 234
            J3333 843
            K5555 765
            4Q333 77
            Q27J2 893
            7KJ77 506
            AAAJJ 206
            67676 828
            7575J 562
            25252 643
            77277 204
            87588 700
            TQQQT 334
            T4T94 339
            TTJT5 345
            6K8A6 778
            6KT3J 595
            J7774 639
            9988J 685
            JQ879 180
            TT6T7 542
            JKKKJ 279
            Q5QQQ 399
            67666 511
            593A2 318
            24932 265
            J4JJ4 907
            T4A8A 356
            33988 335
            999AA 536
            9JQQ5 963
            9553K 780
            35435 913
            224KJ 754
            32K3Q 876
            5246Q 48
            A333A 551
            JJT75 878
            A8888 953
            KKT6K 171
            A767A 879
            T66TT 865
            55J99 46
            8J442 212
            88858 469
            74T77 126
            JJ885 390
            K5J38 637
            49664 80
            4TKJQ 986
            69969 809
            TTTT6 560
            84A5T 154
            K6TAT 720
            AAAA3 442
            43KQA 611
            9JQ45 734
            A8AAA 830
            A22K3 367
            38883 323
            6K966 193
            75595 324
            5A2A5 477
            54Q42 521
            44424 901
            34J43 991
            K5KK7 782
            A64Q2 156
            TJ7T3 541
            65996 386
            62J69 829
            QQA2T 856
            4A443 476
            KK333 247
            997J9 920
            86856 962
            QTJQT 256
            7A363 49
            75755 98
            578T4 665
            3336J 680
            526A5 185
            TQ36J 435
            85K3T 823
            7Q87J 753
            83338 304
            58585 408
            5A984 941
            7T5Q8 975
            QQ939 369
            TTT2T 723
            T32T2 270
            39K79 598
            AATTT 295
            KJ9KK 615
            J8754 415
            67777 499
            4T44T 461
            JJJJJ 628
            97A27 177
            J9822 770
            48KKT 808
            JJ553 109
            JTTTJ 313
            2JKA9 203
            JQ339 669
            Q5T5Q 817
            Q5J2A 79
            QQ8Q8 30
            T778T 617
            4355J 45
            662QQ 305
            9J788 544
            Q8299 623
            J7923 911
            AAA77 81
            93T79 220
            A4446 697
            8Q5J5 373
            26257 221
            AAJ66 470
            7J49J 27
            K7QT5 92
            37J43 621
            999K9 955
            684K7 547
            J666J 105
            T4J49 344
            53T5K 69
            J6224 586
            47TJ3 609
            AA789 451
            33636 998
            8TJKJ 549
            7KT42 976
            A9J84 218
            977AJ 882
            68888 336
            5K32A 931
            35AJ9 764
            42442 205
            KQQQK 342
            66TAT 721
            TTQ9T 862
            KAAKT 163
            5TT9T 138
            3753J 813
            43K32 633
            KKTQT 877
            8TTJJ 84
            383J8 85
            8946T 556
            4K2KK 585
            T7T44 791
            575Q3 294
            K5Q49 574
            Q2QJ4 774
            5A93K 348
            5A643 194
            A24J9 429
            TT773 127
            K9J5A 921
            38377 851
            2226A 191
            66662 537
            77AA9 890
            Q7547 951
            JQAJQ 841
            78888 213
            4TTT7 571
            526J2 133
            TKQJT 309
            955J5 414
            96666 959
            8886K 525
            KK8TT 73
            22A2T 908
            JT4JQ 282
            43448 60
            JKJAQ 9
            T4TTJ 43
            Q75T6 779
            237T4 883
            46644 682
            92T29 287
            AAATA 490
            TATK3 762
            JK4KJ 192
            34436 905
            QK5T8 432
            333K4 252
            QQQ78 524
            AAAA7 190
            QQ222 899
            7K283 284
            23339 728""";
    public static final String DAY_8_EXAMPLE = """
            LLR
                        
            AAA = (BBB, BBB)
            BBB = (AAA, ZZZ)
            ZZZ = (ZZZ, ZZZ)""";
    public static final String DAY_8_PART_2_EXAMPLE = """
            LR
                        
            11A = (11B, XXX)
            11B = (XXX, 11Z)
            11Z = (11B, XXX)
            22A = (22B, XXX)
            22B = (22C, 22C)
            22C = (22Z, 22Z)
            22Z = (22B, 22B)
            XXX = (XXX, XXX)""";
    public static final String DAY_8_INPUT = """
            LRRLRRRLRRRLLRRLRRLRLRLRRLLRRLRRLRRRLLLRRRLRRRLRRRLLRRRLRRLLRRLRRLRLRRRLRRLRLRRLRRRLLRRLLRLRRRLLRRLRRLLLRLRRRLRLRLRLLRRRLRLLRRRLRLRRRLRRRLLRRLRRRLLRRLRLLRLRRLLLRRLRRLLLRLLRLRRRLRLRLRRRLRRLLRRRLRLRLRRLRRRLRLRRLRRLRRRLRRRLRRRLRRRLRRLLRRLRLLRRLLRRRLRLLRLRLRRLRRLRLRLRRRLRLRLRRLRLRRLRRRR
                        
            FPF = (PTN, MPT)
            DGM = (KXM, PRM)
            FKB = (JLC, MBX)
            XCJ = (DCJ, TSH)
            JVH = (VCH, SMV)
            BXL = (HLB, NVF)
            GVD = (FSQ, MFD)
            CDJ = (SMM, HHS)
            BGM = (FHB, LKH)
            FBP = (HHS, SMM)
            LTK = (TCV, GQX)
            LDM = (MRM, JKJ)
            RDK = (KBL, GHP)
            BJB = (XBN, BXG)
            KST = (BGX, VFS)
            VKM = (MFR, CJP)
            CSG = (GGJ, JHH)
            JFS = (QCG, XFR)
            MDV = (FPQ, NRX)
            QHF = (PJP, QHX)
            DHM = (LJC, PDS)
            MMV = (CHS, FXX)
            CQP = (LFN, GSD)
            RDT = (NVG, NVG)
            XFN = (HFM, LTK)
            MFD = (RKJ, XGN)
            DTD = (JBV, JBV)
            KJG = (PCC, PPR)
            GLH = (JRN, BLK)
            KBV = (MCQ, MCS)
            LQF = (KDR, GFC)
            GGB = (JGL, RRM)
            BQX = (QKQ, NSG)
            SVS = (SQL, FXL)
            GMC = (BHG, GPC)
            KPZ = (HLV, RVH)
            RQB = (TDV, XPN)
            GVR = (SXD, QRB)
            MNX = (DLT, CMJ)
            QDM = (TKN, VDH)
            CCB = (KPR, QCK)
            BVF = (QJX, FKK)
            TJB = (HKV, BCP)
            BHC = (SSN, HHH)
            NTN = (RPT, PVF)
            NDP = (BJQ, MGH)
            PJP = (NTN, FSR)
            BLL = (MTQ, SNQ)
            RNP = (RTD, PGM)
            PVF = (BMP, LPM)
            QFL = (NNS, GLR)
            VRG = (GGV, DMG)
            XRX = (TTR, LXS)
            MBH = (RHX, GKF)
            CXD = (LFN, GSD)
            FFK = (LDG, VHS)
            NHM = (BLM, XQD)
            TNB = (KSS, FSB)
            VLX = (KCF, VXL)
            DDF = (TNK, FBS)
            GQR = (BGM, MGR)
            BPQ = (FHD, MJT)
            KPR = (SDL, NMQ)
            CNL = (QFP, XPV)
            HVA = (BRQ, XPL)
            PHF = (LHF, HVR)
            TNZ = (XCM, BFL)
            NDJ = (GCQ, RTL)
            HCT = (PQT, VVB)
            JNH = (GVV, JMC)
            CNV = (SDP, NQR)
            GGV = (RHT, SLG)
            PRX = (FSD, KST)
            BLM = (KKQ, CSG)
            JRN = (GGK, GBF)
            DJK = (GQJ, JKB)
            RVH = (FXJ, JVN)
            RXF = (CHG, GDT)
            MBX = (KJM, XFN)
            HLV = (JVN, FXJ)
            XDG = (HJM, KCT)
            LPM = (RCG, RHG)
            GLP = (XDM, XNC)
            HQP = (JXQ, XPT)
            CXF = (SCV, PHF)
            QJT = (FJN, GHV)
            MPL = (HSQ, FKN)
            SDP = (LCQ, GRV)
            CDQ = (JLV, LLD)
            HHA = (BFL, XCM)
            GPS = (VLX, CPL)
            BXZ = (KSN, VKP)
            PGM = (LJV, CDQ)
            PKG = (VQF, FXC)
            XPL = (LBN, DMV)
            BJJ = (TVV, MNX)
            HLB = (SNN, HNH)
            CDV = (TNB, FSN)
            FXC = (CLF, HSC)
            JFM = (LSR, CNL)
            CMV = (DHQ, DJR)
            LDN = (BCQ, JMS)
            XNC = (JLS, KXS)
            SNN = (NGM, MFJ)
            CND = (RDL, GJJ)
            SKT = (FCM, MRC)
            QRB = (BCG, HRR)
            XNK = (LJC, PDS)
            DGK = (KBF, SRB)
            LNL = (FSD, KST)
            PCM = (PDL, JFS)
            BSV = (LSR, CNL)
            SMX = (TKL, QPF)
            XMS = (MDB, PKP)
            XPT = (LDM, PKV)
            RLB = (XFT, PKM)
            VVV = (NRX, FPQ)
            MGB = (LNN, NKR)
            SFJ = (LFT, QDM)
            MFX = (GLP, RPN)
            DLX = (SQQ, NHM)
            XQC = (HQJ, NPC)
            GHF = (VNG, TGQ)
            LRX = (GDT, CHG)
            SHV = (SRM, DVJ)
            TQS = (PRD, HGV)
            SQK = (QNB, PSJ)
            CHS = (MXK, GCR)
            VDH = (FMX, XMR)
            DGN = (LGT, PNQ)
            RMM = (CFK, RQD)
            RQK = (FSN, TNB)
            SLH = (BDS, BBP)
            HVR = (NTS, NQG)
            PSJ = (JFK, XXM)
            GBD = (VMR, KJG)
            FRH = (MNX, TVV)
            THH = (GHF, MNF)
            XTP = (VPC, BQQ)
            VMR = (PCC, PPR)
            PPQ = (GJJ, RDL)
            VHK = (TXT, DDN)
            JCG = (CCD, BXL)
            LCQ = (MPF, NDP)
            KCR = (PFH, DJK)
            LHL = (LGL, KCR)
            JMC = (RBG, CGH)
            JPM = (XMS, CVR)
            CLF = (HDT, DHR)
            FSQ = (XGN, RKJ)
            DVJ = (VHD, XNM)
            KCT = (SKT, QLK)
            XFD = (HXR, JVH)
            BVA = (GPT, RSD)
            MGR = (FHB, LKH)
            PXV = (MJJ, VBK)
            FNG = (TQS, HHM)
            GFD = (XRG, JCS)
            SST = (PHP, JGC)
            KJV = (DMG, GGV)
            PQM = (TTX, RMM)
            XRT = (KBL, GHP)
            JLV = (NKV, BLL)
            FKS = (CBR, RLJ)
            HMD = (JNH, GXG)
            FRL = (KQX, DDB)
            TRP = (LXT, HMC)
            TNK = (FRN, FRN)
            KDR = (PRX, LNL)
            XTS = (NDJ, HFB)
            HVM = (FMG, FHN)
            CHH = (TMD, MNM)
            HHM = (PRD, HGV)
            PJC = (FCC, VJD)
            TSH = (RPR, CVJ)
            GGJ = (NFK, NXD)
            DMG = (RHT, SLG)
            QPT = (QFL, PFN)
            DDN = (RHP, NSS)
            XHJ = (BPQ, CSM)
            NNM = (KHG, SRF)
            LFL = (TMN, JCG)
            NKV = (SNQ, MTQ)
            TMH = (LGT, PNQ)
            CCD = (HLB, NVF)
            GSD = (MRB, TFS)
            RHG = (VXH, MXS)
            LFT = (TKN, VDH)
            BJV = (DST, PTK)
            CGD = (PKG, ZZZ)
            VNG = (BJV, HDX)
            HJS = (GPC, BHG)
            FRN = (VKP, KSN)
            MRC = (JKK, CMV)
            BQQ = (NBF, PJC)
            KSN = (FNJ, GVR)
            QNB = (XXM, JFK)
            RSC = (JCB, JCB)
            GCQ = (XGH, FKB)
            SHS = (JBV, DDF)
            LLR = (XHJ, PGB)
            RSA = (RVH, HLV)
            DMX = (GSH, SST)
            HRD = (HLK, DJG)
            LHF = (NTS, NQG)
            JMS = (FKS, HPB)
            SRB = (SRG, GSF)
            LHN = (HLK, DJG)
            DTM = (RXM, VHK)
            PNP = (SNC, LPF)
            MPF = (BJQ, BJQ)
            SCV = (LHF, HVR)
            BTV = (GLH, PNN)
            NJG = (RXK, NXB)
            NGM = (THG, TXQ)
            FXL = (XRX, MBV)
            NHJ = (DSX, NNM)
            RBG = (DGK, LFQ)
            HGV = (HTS, RNP)
            LDF = (KRB, NXC)
            PMR = (GNH, CHQ)
            DVM = (MNM, TMD)
            FBS = (FRN, BXZ)
            BMM = (XSK, DDK)
            GGK = (MXH, JNG)
            NXB = (LHN, HRD)
            PNN = (JRN, BLK)
            PSV = (LLR, KXX)
            KGK = (TJP, QMM)
            CVG = (VLX, CPL)
            QNF = (XPB, PCM)
            HTS = (PGM, RTD)
            FJN = (DTD, SHS)
            JXB = (CLX, KPZ)
            DLT = (JGH, SFD)
            SFV = (HJM, KCT)
            GSF = (DLX, CHL)
            TKN = (XMR, FMX)
            LJB = (QJT, FVJ)
            QFP = (NXL, DGP)
            PKV = (JKJ, MRM)
            RHX = (RDK, XRT)
            KDP = (FKN, HSQ)
            RLJ = (BGF, JRP)
            VQR = (FDK, RLB)
            XNX = (HGQ, HGQ)
            DSX = (KHG, SRF)
            PDS = (VQK, KNJ)
            GKX = (TKL, QPF)
            CHQ = (XSM, HMD)
            KXX = (XHJ, PGB)
            MDB = (VVV, MDV)
            BCG = (XJX, SQK)
            KJM = (LTK, HFM)
            HRR = (SQK, XJX)
            GXD = (JFM, BSV)
            SCR = (JDN, QRS)
            GMK = (FPF, CTM)
            KXM = (PDJ, MFX)
            DKQ = (GCL, QFN)
            DJR = (FGV, PSV)
            GQX = (DFL, LQF)
            PTK = (TRS, TMC)
            BLK = (GGK, GBF)
            RSD = (XDG, SFV)
            SVT = (PXV, XCL)
            XFT = (BJJ, FRH)
            LSR = (XPV, QFP)
            BCP = (NMB, NXM)
            KGP = (RDT, FNB)
            DHF = (PNN, GLH)
            JHH = (NXD, NFK)
            DGP = (GKX, SMX)
            KSK = (DKP, RXT)
            KRM = (PQM, DCK)
            XJX = (QNB, PSJ)
            JKK = (DJR, DHQ)
            CFK = (DGN, TMH)
            PSS = (HNP, STL)
            MFR = (PMR, RJS)
            JNG = (TQQ, HXB)
            MDG = (VCC, HTF)
            VCC = (DGM, MKH)
            TQQ = (FCQ, SCR)
            DMK = (GXD, GFF)
            GHV = (DTD, SHS)
            HLP = (NNH, TQN)
            BGK = (QHJ, BQX)
            VKN = (DPT, FNG)
            STL = (DPP, NMX)
            QFS = (MGR, BGM)
            HSC = (DHR, HDT)
            FPQ = (NSL, RQN)
            QMM = (CDJ, FBP)
            PDL = (XFR, QCG)
            PDJ = (GLP, RPN)
            FSD = (VFS, BGX)
            MPT = (DKQ, RSQ)
            MHQ = (NTL, TKG)
            MPC = (NQJ, NQJ)
            DST = (TRS, TMC)
            KHD = (CLX, CLX)
            BNT = (MFR, CJP)
            VJD = (GPS, CVG)
            DLG = (JCS, XRG)
            MCD = (CHH, DVM)
            VSG = (XPR, TVQ)
            MSX = (VQR, KXQ)
            VMV = (VQR, KXQ)
            QCG = (NHJ, NMH)
            RPN = (XNC, XDM)
            NVG = (RSC, RSC)
            GDT = (LDC, QPT)
            GMX = (RJX, VRM)
            RDL = (MBH, NTF)
            XXM = (JSC, MHQ)
            SRF = (BGK, NQF)
            XNM = (SGJ, XCJ)
            RPT = (LPM, BMP)
            GPT = (SFV, XDG)
            JCB = (BFL, XCM)
            QKQ = (FRL, GGT)
            MTQ = (LQB, XPG)
            CHG = (QPT, LDC)
            FMS = (FJX, GMX)
            MBV = (LXS, TTR)
            JFP = (XPN, TDV)
            JFJ = (HNP, STL)
            GKF = (RDK, XRT)
            LDK = (QCT, TVX)
            CLX = (RVH, HLV)
            TXQ = (DFR, KQF)
            XGH = (MBX, JLC)
            KFB = (SHV, MRV)
            RSV = (GSX, TPK)
            NKR = (KFB, TFN)
            FCQ = (JDN, QRS)
            RQN = (TLC, GFQ)
            FSN = (FSB, KSS)
            QDQ = (VBQ, GSM)
            FFC = (DKC, DMK)
            KBC = (BHQ, TRP)
            PHB = (VCC, HTF)
            GBH = (FFC, CGL)
            TTR = (KBV, LJP)
            MRB = (DHG, QNF)
            SDL = (PSS, JFJ)
            TMC = (BXK, RSV)
            LXT = (GGB, MDT)
            LQB = (BNT, VKM)
            RXT = (GBH, SSD)
            SSN = (CRH, XTP)
            MRV = (SRM, DVJ)
            FJX = (RJX, VRM)
            FQB = (MNF, GHF)
            DKC = (GFF, GXD)
            MGQ = (LDK, RVG)
            DLK = (FPF, CTM)
            FHN = (HKK, BVF)
            BFL = (LJG, XQM)
            PKP = (VVV, MDV)
            QHJ = (QKQ, NSG)
            BCQ = (HPB, FKS)
            LDG = (VMV, MSX)
            BFH = (RXT, DKP)
            XPB = (JFS, PDL)
            HDX = (PTK, DST)
            NQF = (BQX, QHJ)
            DPT = (TQS, HHM)
            DCK = (TTX, RMM)
            NPC = (KGP, QJG)
            BCD = (NXB, RXK)
            HDT = (HPM, FTQ)
            FHD = (XNK, DHM)
            NNS = (XFD, MBT)
            GSX = (VRG, KJV)
            BXG = (BFH, KSK)
            VVB = (QDQ, JXC)
            NVF = (HNH, SNN)
            KRB = (JBH, JNJ)
            FXX = (GCR, MXK)
            JXQ = (LDM, PKV)
            MTT = (DLG, GFD)
            HXR = (VCH, SMV)
            MNM = (SPQ, PNP)
            QJG = (RDT, FNB)
            JLS = (KRM, LBQ)
            CJK = (TJB, VDD)
            TXT = (RHP, NSS)
            FXT = (JMS, BCQ)
            NSS = (LRX, RXF)
            VJQ = (RSC, MXR)
            XXH = (LNN, NKR)
            NSL = (GFQ, TLC)
            XSM = (GXG, JNH)
            HFM = (TCV, GQX)
            JGC = (NDL, JPM)
            HGQ = (GPT, RSD)
            CHL = (SQQ, NHM)
            VBK = (GKG, XTS)
            MBT = (HXR, JVH)
            FNJ = (SXD, QRB)
            JBH = (HCT, SGG)
            JRP = (FXP, VKN)
            VRM = (MPC, GQP)
            BBP = (JCL, LDF)
            GXH = (RXM, VHK)
            MXR = (JCB, TNZ)
            BSD = (CCP, GBD)
            QFN = (MPL, KDP)
            LNN = (TFN, KFB)
            SQQ = (BLM, XQD)
            MJT = (XNK, DHM)
            GSH = (JGC, PHP)
            PQT = (JXC, QDQ)
            RVG = (QCT, TVX)
            DHG = (PCM, XPB)
            LKJ = (HQP, HHG)
            XHB = (SJL, DMX)
            GKG = (HFB, NDJ)
            PGB = (BPQ, CSM)
            VBQ = (CVS, QHF)
            JXC = (GSM, VBQ)
            QCK = (SDL, NMQ)
            PFN = (NNS, GLR)
            RXK = (LHN, HRD)
            BVX = (GMK, DLK)
            LPF = (MMV, LQK)
            SMM = (SFJ, KGR)
            SJL = (SST, GSH)
            HMC = (MDT, GGB)
            VQF = (CLF, HSC)
            NRX = (RQN, NSL)
            CBR = (JRP, BGF)
            JLC = (KJM, XFN)
            TMD = (SPQ, PNP)
            HXB = (FCQ, SCR)
            SBQ = (SQV, NCH)
            LGT = (MGB, XXH)
            HSF = (TJB, VDD)
            JBS = (MGQ, NVQ)
            DKP = (SSD, GBH)
            HSQ = (SVT, LKV)
            GPC = (HVM, TGC)
            TVV = (DLT, CMJ)
            BHG = (TGC, HVM)
            CGR = (LDN, FXT)
            PFH = (GQJ, GQJ)
            FCM = (JKK, CMV)
            RRM = (KJP, BMM)
            FCG = (MDG, PHB)
            MCS = (HLP, DNV)
            BXK = (GSX, TPK)
            VQK = (HJS, GMC)
            LDH = (XPR, TVQ)
            DXN = (GMK, DLK)
            GFQ = (RQB, JFP)
            PKK = (BBP, BDS)
            BBR = (FXT, LDN)
            BJQ = (KHD, KHD)
            RCG = (MXS, VXH)
            HPM = (KJF, CXF)
            QJX = (CDV, RQK)
            NMB = (RKC, GVD)
            JCL = (KRB, NXC)
            GXM = (BBR, CGR)
            NMX = (XNX, SQP)
            NXM = (RKC, GVD)
            QMT = (MDG, PHB)
            DMV = (LTG, SBQ)
            FTQ = (KJF, CXF)
            TCV = (DFL, LQF)
            MFJ = (TXQ, THG)
            VKP = (FNJ, GVR)
            XQD = (CSG, KKQ)
            SRM = (VHD, XNM)
            SLG = (LRJ, JFL)
            JCS = (CQP, CXD)
            LJP = (MCQ, MCS)
            NBF = (FCC, VJD)
            DFL = (KDR, GFC)
            NFM = (XBN, BXG)
            CMR = (PKG, PKG)
            JVN = (XHB, MCC)
            RKC = (FSQ, MFD)
            JKJ = (BSQ, LJB)
            BGX = (MMD, FMS)
            THG = (KQF, DFR)
            RKJ = (CVN, FFK)
            LQK = (CHS, FXX)
            CPL = (VXL, KCF)
            JSC = (TKG, NTL)
            DNV = (TQN, NNH)
            LFF = (HQJ, NPC)
            TVQ = (SSF, GXM)
            NQR = (LCQ, GRV)
            TMN = (BXL, CCD)
            XDM = (KXS, JLS)
            CJP = (RJS, PMR)
            HKV = (NMB, NXM)
            SPQ = (SNC, LPF)
            HQJ = (KGP, QJG)
            GXG = (JMC, GVV)
            KSS = (CND, PPQ)
            LJG = (DTM, GXH)
            BHQ = (HMC, LXT)
            FGV = (KXX, LLR)
            KCF = (LKJ, NTJ)
            PRM = (MFX, PDJ)
            QKD = (FXL, SQL)
            DDB = (CSB, MCD)
            VHH = (CMR, CGD)
            LLM = (BVX, DXN)
            PTN = (RSQ, DKQ)
            GSM = (CVS, QHF)
            CVN = (VHS, LDG)
            RHT = (LRJ, JFL)
            JFK = (JSC, MHQ)
            NTS = (QFS, GQR)
            TQN = (DHF, BTV)
            KHG = (BGK, NQF)
            ZZZ = (FXC, VQF)
            VXL = (NTJ, LKJ)
            VFS = (MMD, FMS)
            LBQ = (PQM, DCK)
            KQX = (CSB, MCD)
            FDK = (XFT, PKM)
            NQG = (GQR, QFS)
            KXS = (LBQ, KRM)
            JDN = (HDL, CCB)
            TKL = (HSF, CJK)
            XRG = (CQP, CXD)
            BMP = (RCG, RHG)
            KQF = (KGK, LGN)
            HLK = (MTT, PFT)
            NFK = (MRS, CNV)
            HNH = (MFJ, NGM)
            FKN = (SVT, LKV)
            VPC = (PJC, NBF)
            DDK = (SVS, QKD)
            DCJ = (RPR, CVJ)
            NQJ = (CMR, CMR)
            LGL = (PFH, PFH)
            RTD = (CDQ, LJV)
            FVJ = (FJN, GHV)
            BDS = (LDF, JCL)
            NSG = (GGT, FRL)
            RXM = (DDN, TXT)
            JNJ = (SGG, HCT)
            SRG = (DLX, CHL)
            TGC = (FMG, FHN)
            FMG = (BVF, HKK)
            NTJ = (HHG, HQP)
            KNJ = (HJS, GMC)
            QJB = (CCP, GBD)
            NXL = (SMX, GKX)
            VHS = (MSX, VMV)
            CRH = (BQQ, VPC)
            GFF = (JFM, BSV)
            GLR = (XFD, MBT)
            XPR = (GXM, SSF)
            LLD = (BLL, NKV)
            KXQ = (FDK, RLB)
            MXH = (TQQ, HXB)
            RQD = (DGN, TMH)
            FNB = (NVG, VJQ)
            MGH = (KHD, JXB)
            JGL = (BMM, KJP)
            KJF = (SCV, PHF)
            SXD = (BCG, HRR)
            TPK = (KJV, VRG)
            TJP = (FBP, CDJ)
            MKH = (KXM, PRM)
            HJM = (SKT, QLK)
            GHP = (RFL, KBC)
            LGN = (TJP, QMM)
            LJV = (JLV, LLD)
            NXD = (CNV, MRS)
            LKH = (LLM, BNK)
            CTM = (MPT, PTN)
            SNC = (LQK, MMV)
            PNQ = (XXH, MGB)
            FMX = (BSD, QJB)
            QQL = (HHH, SSN)
            QLK = (FCM, MRC)
            CMJ = (JGH, SFD)
            FHB = (BNK, LLM)
            TKG = (FQB, THH)
            XPV = (DGP, NXL)
            RHP = (LRX, RXF)
            BRQ = (LBN, DMV)
            NDL = (XMS, CVR)
            LDC = (PFN, QFL)
            DPP = (XNX, XNX)
            NMQ = (PSS, JFJ)
            SGG = (PQT, VVB)
            FSR = (RPT, PVF)
            AAA = (VQF, FXC)
            JFL = (BJB, NFM)
            XFR = (NHJ, NMH)
            HHS = (SFJ, KGR)
            MLZ = (RSD, GPT)
            MNF = (VNG, TGQ)
            FXP = (DPT, FNG)
            MRS = (SDP, NQR)
            MDT = (JGL, RRM)
            MJJ = (GKG, XTS)
            PFT = (GFD, DLG)
            TVX = (BCD, NJG)
            NPA = (VKP, KSN)
            TDV = (LDH, VSG)
            GQJ = (PDM, PDM)
            NTF = (GKF, RHX)
            GGT = (KQX, DDB)
            LFN = (TFS, MRB)
            CSM = (MJT, FHD)
            NVQ = (RVG, LDK)
            PKM = (FRH, BJJ)
            PDM = (BRQ, XPL)
            JGH = (BHC, QQL)
            SSF = (CGR, BBR)
            GVV = (CGH, RBG)
            FSB = (PPQ, CND)
            LKV = (XCL, PXV)
            MXK = (SLH, PKK)
            SQL = (XRX, MBV)
            LRJ = (BJB, NFM)
            VXH = (LFF, XQC)
            HTF = (MKH, DGM)
            CTB = (LGL, KCR)
            HFB = (RTL, GCQ)
            NTL = (FQB, THH)
            SFD = (QQL, BHC)
            HNP = (DPP, DPP)
            TTX = (RQD, CFK)
            MCQ = (HLP, DNV)
            CCP = (VMR, KJG)
            TFN = (MRV, SHV)
            JKB = (PDM, RFZ)
            TGQ = (BJV, HDX)
            PHP = (JPM, NDL)
            RJX = (MPC, GQP)
            CVJ = (LFL, KLG)
            KJP = (DDK, XSK)
            QPF = (HSF, CJK)
            SNQ = (XPG, LQB)
            BGF = (VKN, FXP)
            KLG = (TMN, JCG)
            CGL = (DMK, DKC)
            XCM = (XQM, LJG)
            RPR = (LFL, KLG)
            LFQ = (KBF, SRB)
            RJS = (CHQ, GNH)
            HDL = (KPR, QCK)
            FXJ = (MCC, XHB)
            XPG = (VKM, BNT)
            DHQ = (FGV, PSV)
            SQV = (QMT, FCG)
            DHR = (FTQ, HPM)
            FCC = (GPS, CVG)
            NCH = (FCG, QMT)
            QRS = (HDL, CCB)
            XQM = (GXH, DTM)
            SGJ = (TSH, DCJ)
            KBL = (RFL, KBC)
            NXC = (JBH, JNJ)
            BSQ = (QJT, FVJ)
            LTG = (NCH, SQV)
            SMV = (JBS, MDQ)
            GJJ = (MBH, NTF)
            GRV = (MPF, NDP)
            HPB = (RLJ, CBR)
            TRS = (BXK, RSV)
            GCR = (SLH, PKK)
            HHH = (CRH, XTP)
            GNH = (XSM, HMD)
            RSQ = (QFN, GCL)
            HKK = (QJX, FKK)
            JBV = (TNK, TNK)
            TFS = (DHG, QNF)
            RTL = (FKB, XGH)
            HHG = (XPT, JXQ)
            PPR = (LHL, CTB)
            SQP = (HGQ, MLZ)
            XBN = (BFH, KSK)
            CVR = (MDB, PKP)
            RFL = (BHQ, TRP)
            QHX = (FSR, NTN)
            VCH = (MDQ, JBS)
            GCL = (MPL, KDP)
            KKQ = (GGJ, JHH)
            GFC = (PRX, LNL)
            PRD = (HTS, RNP)
            GQP = (NQJ, VHH)
            LJC = (VQK, KNJ)
            QCT = (BCD, NJG)
            KBF = (SRG, GSF)
            NNH = (BTV, DHF)
            SSD = (CGL, FFC)
            VDD = (HKV, BCP)
            VHD = (XCJ, SGJ)
            RFZ = (XPL, BRQ)
            KGR = (LFT, QDM)
            MDQ = (NVQ, MGQ)
            MXS = (LFF, XQC)
            PCC = (LHL, CTB)
            TLC = (RQB, JFP)
            CVS = (PJP, QHX)
            BNK = (DXN, BVX)
            CSB = (CHH, DVM)
            XPN = (VSG, LDH)
            XSK = (SVS, QKD)
            LBN = (LTG, SBQ)
            FKK = (RQK, CDV)
            MCC = (SJL, DMX)
            NMH = (DSX, NNM)
            MMD = (GMX, FJX)
            LXS = (LJP, KBV)
            XMR = (QJB, BSD)
            DFR = (KGK, LGN)
            DJG = (PFT, MTT)
            CGH = (DGK, LFQ)
            MRM = (BSQ, LJB)
            XCL = (MJJ, VBK)
            GBF = (JNG, MXH)
            XGN = (FFK, CVN)""";
    public static final String DAY_9_EXAMPLE = """
            0 3 6 9 12 15
            1 3 6 10 15 21
            10 13 16 21 30 45""";
    public static final String DAY_9_INPUT = """
            0 14 45 109 238 493 989 1942 3763 7260 14077 27610 54805 109473 218063 429227 829002 1564034 2875989 5151147 8990168
            15 18 30 59 111 187 296 499 999 2292 5394 12159 25703 50949 95308 169511 288607 473142 750534 1156659 1737663
            5 11 15 33 90 214 428 752 1253 2229 4693 11450 29258 72870 172222 384737 815757 1651623 3212059 6031479 10982866
            11 16 23 24 13 -7 -3 134 674 2194 5828 13721 29926 62289 126510 254929 515555 1053450 2181099 4575420 9702689
            16 31 60 112 215 439 934 1988 4110 8143 15412 27912 48541 81383 132046 208060 319340 478719 702556 1011424 1430883
            12 7 12 54 178 448 938 1712 2791 4113 5527 6958 9104 15500 37718 107235 300798 792410 1957506 4580209 10266638
            17 21 30 48 77 119 191 374 932 2554 6791 16781 38378 81826 164146 312433 568291 993667 1678380 2749678 4384195
            24 37 63 112 194 319 497 738 1052 1449 1939 2532 3238 4067 5029 6134 7392 8813 10407 12184 14154
            11 8 18 52 130 304 693 1530 3221 6416 12092 21648 37012 60760 96247 147750 220623 321464 458294 640748 880278
            22 33 42 54 85 172 386 856 1822 3745 7512 14784 28545 53920 99340 178142 310702 527209 871198 1403970 2210037
            18 20 24 34 54 88 140 214 314 444 608 810 1054 1344 1684 2078 2530 3044 3624 4274 4998
            -8 -10 1 46 151 357 744 1469 2818 5272 9587 16888 28777 47455 75858 117807 178172 263050 379957 538034 748267
            1 6 26 72 171 381 806 1611 3037 5416 9186 14906 23271 35127 51486 73541 102681 140506 188842 249756 325571
            5 20 41 68 101 140 185 236 293 356 425 500 581 668 761 860 965 1076 1193 1316 1445
            20 38 72 140 277 545 1041 1903 3314 5504 8750 13374 19739 28243 39311 53385 70912 92330 118052 148448 183825
            4 7 21 74 220 564 1301 2769 5512 10346 18439 31487 52233 85884 143500 249291 455277 869701 1711690 3417800 6854447
            0 1 9 36 101 231 473 938 1906 4032 8710 18677 38984 78578 153085 290356 542855 1017057 1944000 3845866 7918498
            12 15 30 67 130 208 262 208 -104 -915 -2586 -5631 -10754 -18890 -31250 -49370 -75164 -110981 -159666 -224625 -309894
            2 18 45 83 132 192 263 345 438 542 657 783 920 1068 1227 1397 1578 1770 1973 2187 2412
            10 11 20 47 100 195 375 731 1422 2715 5135 9968 20651 46080 107649 252985 580950 1284615 2721626 5524697 10768850
            -4 -4 9 49 141 337 751 1623 3426 7039 14036 27210 51589 96428 178991 331412 612714 1129686 2074056 3792092 6922209
            5 12 40 97 192 356 683 1398 2974 6351 13364 27575 55854 111344 219060 426682 825747 1593398 3073408 5928841 11418708
            18 36 65 116 222 456 965 2037 4241 8715 17723 35658 70733 137675 261817 485069 874340 1533078 2616693 4352728 7066744
            3 14 33 56 81 125 268 732 2005 5030 11514 24508 49620 97614 189795 368602 717489 1397080 2710069 5218030 9953981
            26 50 97 182 323 552 935 1601 2780 4850 8393 14260 23645 38168 59967 91799 137150 200354 286721 402674 555895
            14 29 73 160 309 548 930 1575 2752 5015 9407 17746 33007 59814 105056 178641 294402 471169 734021 1115732 1658425
            2 2 6 31 105 278 643 1364 2702 5023 8781 14539 23309 38000 67770 138871 318530 762996 1807680 4127011 9005033
            19 20 30 70 181 451 1057 2322 4787 9298 17108 29994 50389 81529 127615 193990 287331 415856 589546 820382 1122597
            17 32 74 157 295 502 792 1179 1677 2300 3062 3977 5059 6322 7780 9447 11337 13464 15842 18485 21407
            3 4 4 4 17 74 232 595 1362 2914 5950 11697 22294 41677 77846 148591 295156 612955 1317215 2877781 6287522
            19 37 64 98 137 179 222 264 303 337 364 382 389 383 362 324 267 189 88 -38 -191
            7 7 26 85 209 438 867 1734 3593 7652 16437 35081 73762 152177 307542 608680 1180815 2249821 4223028 7840205 14459843
            -5 -12 -20 -22 7 125 448 1196 2772 5887 11745 22303 40622 71326 121187 199855 320753 502158 768490 1151832 1693705
            5 0 -5 -10 -15 -20 -25 -30 -35 -40 -45 -50 -55 -60 -65 -70 -75 -80 -85 -90 -95
            -1 6 15 19 10 -3 49 371 1430 4169 10381 23363 49033 97772 187349 347401 626073 1099576 1885595 3161675 5189932
            13 26 42 57 64 60 53 70 173 497 1331 3267 7438 15847 31746 59946 106813 179516 283824 419381 570900
            18 44 94 176 298 479 782 1395 2798 6078 13503 29553 62744 128783 255871 493340 925282 1691416 3018156 5263702 8981990
            13 21 39 94 224 472 881 1507 2474 4102 7152 13269 25811 51524 104128 212091 435133 898089 1858087 3834270 7853652
            10 32 59 91 127 171 250 451 1002 2450 6028 14373 32912 72576 155200 324266 665886 1348552 2695773 5313987 10309945
            -2 -3 3 29 105 287 676 1453 2930 5610 10241 17840 29653 47006 70990 101910 138414 176203 206207 212095 166969
            4 8 24 56 111 199 340 598 1178 2648 6392 15474 36213 80955 172804 353468 695920 1324304 2444472 4389764 7688187
            -1 2 18 74 224 576 1339 2894 5893 11396 21068 37479 64607 108829 181221 303325 521487 940762 1800302 3631184 7569222
            11 21 41 68 95 115 131 179 376 1010 2694 6611 14882 31094 61030 113648 202361 346675 574247 923430 1446377
            0 -5 1 40 155 426 998 2125 4240 8071 14842 26641 47129 82940 146427 260898 470224 855763 1565015 2858398 5183119
            18 20 20 18 14 8 0 -10 -22 -36 -52 -70 -90 -112 -136 -162 -190 -220 -252 -286 -322
            16 37 63 102 179 355 759 1633 3390 6685 12499 22236 37833 61883 97771 149823 223468 325413 463831 648562 891327
            15 19 29 66 169 406 900 1878 3759 7322 14062 26987 52376 103452 207559 419283 843056 1670365 3239758 6135514 11361164
            4 9 29 79 179 352 622 1017 1588 2461 3945 6725 12175 22832 43078 80083 145068 254953 434461 718755 1156691
            3 10 14 26 78 235 623 1487 3295 6912 13896 27036 51386 96281 179189 332801 617539 1142726 2101074 3822974 6859390
            22 50 96 165 259 378 539 822 1446 2885 6082 12949 27610 59338 129001 282330 615951 1326821 2804217 5798898 11732018
            4 12 36 85 179 375 813 1797 3930 8328 16953 33136 62415 113897 202474 352388 602856 1016740 1693586 2788767 4540955
            5 9 14 20 37 99 281 722 1668 3566 7263 14399 28147 54587 105307 202555 390030 756604 1490039 2999763 6195548
            16 38 84 163 284 456 688 989 1368 1834 2396 3063 3844 4748 5784 6961 8288 9774 11428 13259 15276
            2 4 9 21 50 113 237 464 858 1514 2569 4215 6714 10415 15773 23370 33938 48384 67817 93577 127266
            6 11 24 56 127 269 546 1106 2280 4743 9752 19476 37433 69049 122354 208830 344426 550755 856488 1298960 1926003
            23 48 97 192 367 665 1144 1921 3296 6018 11796 24254 50761 106109 220203 454376 935673 1927092 3966811 8134512 16543215
            3 3 2 2 10 51 204 683 2012 5398 13507 32018 72611 158539 334894 687689 1380199 2724154 5322133 10354528 20154880
            19 22 29 53 130 339 824 1822 3703 7028 12638 21811 36577 60387 99564 166539 287349 519488 994437 2016603 4284750
            6 22 50 105 212 416 803 1539 2939 5583 10501 19454 35343 62783 108884 184286 304500 491612 776412 1201015 1822046
            -4 10 45 122 282 596 1173 2161 3736 6074 9301 13416 18182 22980 26621 27111 21364 4858 -28771 -88202 -184974
            24 45 84 149 257 449 814 1529 2922 5565 10404 18933 33419 57185 94958 153289 241052 370029 555588 817461 1180629
            8 25 68 164 354 705 1335 2454 4442 8017 14593 26988 50703 96031 181252 337183 613701 1090570 1900670 3289782 5776671
            6 8 24 79 221 533 1151 2292 4296 7686 13250 22149 36055 57323 89201 136082 203802 299988 434460 619691 871329
            12 39 95 203 399 739 1323 2356 4271 7943 15026 28447 53092 96719 171132 293648 488886 790903 1245697 1914091 2875005
            21 34 47 60 73 86 99 112 125 138 151 164 177 190 203 216 229 242 255 268 281
            -2 -9 -12 -7 15 78 246 672 1687 3973 8918 19345 40989 85484 176451 361958 739808 1507779 3060484 6169849 12309863
            30 51 83 136 220 342 515 803 1438 3055 7099 16464 36428 75950 149395 278751 496398 848483 1398947 2234240 3468748
            12 19 40 103 262 613 1312 2603 4872 8752 15318 26434 45350 77700 133126 227852 388660 658881 1107212 1840409 3021190
            17 30 49 86 182 432 1032 2374 5238 11174 23249 47476 95474 189272 369723 710808 1343267 2492574 4538333 8104714 14194474
            -6 -2 20 78 202 434 823 1415 2238 3282 4474 5648 6510 6598 5237 1489 -5902 -18570 -38592 -68558 -111646
            -1 2 7 14 23 34 47 62 79 98 119 142 167 194 223 254 287 322 359 398 439
            2 13 45 115 251 505 972 1824 3380 6256 11693 22272 43437 86660 175927 360989 744448 1536918 3168045 6505602 13277061
            2 6 8 8 12 35 111 320 842 2048 4638 9836 19652 37221 67229 116436 194306 313754 492020 751680 1121804
            8 19 32 50 97 235 600 1487 3542 8162 18272 39770 84180 173596 350194 695154 1367144 2681061 5267792 10392438 20572991
            7 18 43 101 223 458 894 1718 3351 6715 13723 28140 57076 113623 221703 425347 806851 1522272 2869567 5415767 10226825
            9 4 -1 -6 -11 -16 -21 -26 -31 -36 -41 -46 -51 -56 -61 -66 -71 -76 -81 -86 -91
            21 35 67 134 263 502 940 1751 3298 6359 12578 25337 51479 104872 214045 438707 905097 1880089 3923095 8191130 17040717
            23 42 67 100 157 278 538 1066 2083 3974 7413 13564 24385 43066 74636 126778 210895 343474 547799 856068 1311973
            17 16 18 31 63 120 202 307 471 908 2382 7072 20449 55217 139462 333322 762667 1686190 3627381 7632222 15772239
            9 2 1 27 108 270 523 838 1113 1134 566 -903 -2924 -2545 10761 66488 237145 685806 1755099 4125935 9088652
            7 20 45 85 149 263 494 1002 2141 4636 9866 20286 40042 75917 138994 248064 437359 774748 1404271 2642831 5192055
            25 44 73 122 216 406 783 1492 2738 4771 7832 12037 17171 22359 25576 22953 7831 -30490 -108365 -249844 -489206
            5 26 57 88 111 127 148 195 312 648 1704 4900 13688 35521 85085 189311 394807 778486 1462315 2633272 4569773
            9 15 28 69 177 418 894 1752 3193 5481 8952 14023 21201 31092 44410 61986 84777 113875 150516 196089 252145
            -8 -1 16 41 72 107 144 181 216 247 272 289 296 291 272 237 184 111 16 -103 -248
            19 32 57 104 199 399 807 1587 2979 5314 9029 14682 22967 34729 50979 72909 101907 139572 187729 248444 324039
            5 3 0 -6 -19 -45 -92 -170 -291 -469 -720 -1062 -1515 -2101 -2844 -3770 -4907 -6285 -7936 -9894 -12195
            19 33 60 109 201 388 781 1587 3155 6031 11022 19269 32329 52266 81751 124171 183747 265661 376192 522861 714585
            13 25 43 70 112 192 375 813 1839 4173 9350 20546 44083 92094 187268 371602 723333 1390953 2662565 5106282 9848238
            16 33 58 92 149 259 468 837 1443 2386 3807 5923 9086 13874 21223 32610 50298 77655 119560 182910 277243
            10 17 28 57 142 355 820 1744 3460 6479 11556 19799 32896 53609 86792 141338 233654 393509 673404 1162981 2010426
            12 22 35 59 102 172 277 425 624 882 1207 1607 2090 2664 3337 4117 5012 6030 7179 8467 9902
            27 42 65 118 251 553 1157 2232 3950 6420 9614 13412 18140 26516 49054 117300 313917 837634 2137911 5184538 11990201
            20 47 90 157 266 463 848 1608 3060 5711 10346 18159 30946 51383 83416 132794 207780 320079 486026 728081 1076682
            11 15 30 71 165 376 860 1965 4387 9393 19139 37159 69195 124698 219589 381285 657667 1132755 1953604 3375703 5838449
            13 26 38 53 77 124 245 601 1615 4259 10577 24656 54514 115911 240113 489452 987549 1975872 3915636 7664879 14776079
            1 3 14 35 65 102 160 328 911 2706 7476 18700 42738 90769 182480 353978 675636 1292119 2509355 4976253 10049958
            0 9 29 81 213 525 1219 2699 5767 11991 24355 48332 93556 176366 323829 580822 1024172 1793204 3156883 5658162 10412313
            17 26 39 61 98 160 273 513 1090 2535 6078 14350 32597 70659 146042 288496 546607 997016 1756993 3001219 4983764
            14 35 72 134 232 388 659 1199 2400 5185 11579 25762 55912 117274 237038 461767 868274 1578991 2782986 4763846 7935632
            2 13 32 59 94 137 188 247 314 389 472 563 662 769 884 1007 1138 1277 1424 1579 1742
            -6 -6 10 58 151 307 565 1015 1873 3679 7786 17486 40472 94032 215754 485288 1068255 2304408 4883699 10195280 21012360
            12 28 52 87 156 320 706 1547 3236 6407 12098 22153 40229 74179 141357 279863 571507 1187397 2476601 5136472 10538777
            14 42 84 152 277 510 924 1627 2801 4788 8251 14446 25650 45800 81409 142837 246008 414678 683374 1101140 1736243
            -4 5 36 105 231 439 774 1347 2449 4785 9903 20943 43961 90419 182245 362688 719982 1438213 2903350 5916121 12103119
            10 8 16 49 129 289 589 1154 2237 4301 8105 14772 25814 43092 68700 104783 153332 216046 294414 390251 507023
            14 23 44 82 140 220 321 441 603 954 2041 5454 15141 39833 97146 220017 466132 930849 1763722 3187986 5521138
            19 28 30 29 44 129 416 1188 2988 6772 14115 27466 50399 87695 144891 226637 332833 451148 544300 530651 257630
            23 31 39 59 116 260 580 1211 2331 4158 6981 11320 18468 32034 61876 133343 307710 725396 1694506 3868100 8592743
            12 29 63 114 184 290 496 974 2104 4623 9833 19878 38100 69484 121202 203266 329300 517441 791379 1181546 1726464
            11 2 -15 -48 -114 -237 -433 -676 -830 -500 1321 7081 22505 60383 147877 339805 741589 1547198 3099561 5983662 11165960
            3 14 50 140 322 644 1177 2050 3526 6152 11035 20320 37975 71022 131392 238626 423693 734250 1241728 2050692 3310992
            10 28 68 140 254 420 648 948 1330 1804 2380 3068 3878 4820 5904 7140 8538 10108 11860 13804 15950
            10 26 52 86 134 223 414 815 1594 2992 5336 9052 14678 22877 34450 50349 71690 99766 136060 182258 240262
            10 7 1 7 68 277 807 1949 4158 8107 14749 25387 41752 66089 101251 150801 219122 311535 434425 595375 803308
            18 23 37 88 233 584 1346 2867 5700 10677 18995 32314 52867 83582 128216 191501 279302 398787 558609 769100 1042477
            14 21 23 16 -4 -41 -99 -182 -294 -439 -621 -844 -1112 -1429 -1799 -2226 -2714 -3267 -3889 -4584 -5356
            21 35 62 129 292 664 1472 3154 6498 12822 24222 44027 77895 136629 243054 447596 861211 1721101 3515958 7216069 14683862
            12 25 64 148 299 545 930 1531 2482 4005 6448 10330 16393 25661 39506 59721 88600 129025 184560 259552 359239
            17 18 17 12 -7 -49 -100 -92 129 824 2355 5132 9489 15461 22430 28604 30289 20910 -10267 -79764 -211927
            26 52 88 130 174 216 252 278 290 284 256 202 118 0 -156 -354 -598 -892 -1240 -1646 -2114
            8 29 63 121 224 405 715 1230 2059 3365 5448 9045 16277 33321 77294 192711 488472 1216862 2935481 6828532 15328488
            16 33 64 108 175 302 577 1176 2433 4988 10100 20297 40729 82034 166486 341120 705138 1465263 3043356 6277654 12785247
            -5 -2 15 68 207 530 1222 2622 5331 10380 19490 35487 62993 109594 187767 317929 533187 887242 1469801 2441742 4120851
            7 22 62 138 263 465 823 1536 3040 6205 12683 25553 50537 98261 188327 356366 665777 1226540 2224336 3964224 6934319
            7 22 49 91 163 308 637 1404 3133 6826 14302 28760 55760 105060 194310 356819 658076 1230467 2344492 4550830 8956014
            13 21 50 108 198 331 552 989 1955 4162 9159 20221 44162 95029 201507 421327 868273 1760839 3506560 6842958 13065390
            17 29 48 76 110 148 197 279 441 809 1804 4794 13746 38952 104757 264585 628665 1412989 3022544 6188184 12185166
            16 31 46 61 76 91 106 121 136 151 166 181 196 211 226 241 256 271 286 301 316
            8 17 32 50 61 56 43 78 343 1345 4388 12633 33413 83215 198256 456526 1022658 2236817 4785840 10023572 20554597
            25 52 94 152 221 284 312 290 310 801 3018 10023 28625 73214 173338 388683 838833 1763061 3642311 7451654 15187265
            5 23 54 109 219 451 935 1917 3872 7746 15450 30811 61331 121414 238406 464247 898411 1733121 3341050 6440929 12400487
            26 38 48 53 50 36 8 -37 -102 -190 -304 -447 -622 -832 -1080 -1369 -1702 -2082 -2512 -2995 -3534
            15 41 83 155 280 499 898 1662 3165 6105 11693 21905 39806 69955 118900 195772 312987 487065 739575 1098215 1598036
            -1 11 39 89 160 250 374 606 1166 2594 6114 14442 33624 77167 175032 392461 867845 1886013 4015037 8353159 16960836
            25 49 77 110 150 202 284 458 919 2229 5871 15448 39119 94370 217225 480047 1026198 2137894 4368794 8800331 17528385
            18 37 73 142 273 512 935 1680 3014 5460 10017 18503 34013 61360 107065 177843 275426 383827 442785 298508 -378975
            4 17 40 81 172 388 886 1988 4354 9335 19674 40850 83554 168068 331712 641057 1211304 2236133 4032468 7106023 12245232
            1 20 61 138 270 481 800 1261 1903 2770 3911 5380 7236 9543 12370 15791 19885 24736 30433 37070 44746
            12 24 53 102 172 262 369 488 612 732 837 914 948 922 817 612 284 -192 -843 -1698 -2788
            5 13 21 29 37 45 53 61 69 77 85 93 101 109 117 125 133 141 149 157 165
            -8 -14 -20 -9 46 183 457 947 1765 3091 5314 9468 18347 39030 88184 202717 460644 1021318 2201962 4621039 9461834
            8 19 39 73 124 203 351 672 1374 2813 5533 10293 18070 30025 47417 71448 103020 142383 188651 239161 288648
            17 32 47 62 77 92 107 122 137 152 167 182 197 212 227 242 257 272 287 302 317
            11 30 64 124 238 470 946 1891 3690 7005 13021 23982 44374 83549 161516 321489 656273 1361728 2840866 5898656 12093074
            11 22 25 14 -17 -73 -161 -295 -496 -775 -1075 -1104 146 5752 24433 79285 227593 602848 1498793 3529242 7918937
            8 21 49 92 150 223 311 414 532 665 813 976 1154 1347 1555 1778 2016 2269 2537 2820 3118
            16 30 62 122 235 454 872 1633 2942 5074 8382 13304 20369 30202 43528 61175 84076 113270 149902 195222 250583
            -3 8 41 122 302 669 1360 2573 4579 7734 12491 19412 29180 42611 60666 84463 115289 154612 204093 265598 341210
            12 25 46 89 172 330 643 1287 2634 5450 11268 23051 46318 90999 174433 326151 595424 1063039 1859434 3192221 5387304
            20 45 85 144 236 391 669 1193 2212 4205 8037 15178 27996 50135 86989 146283 238772 379069 586613 886788 1312204
            7 18 39 61 76 78 73 119 439 1686 5489 15473 39024 90162 193991 393315 758143 1398954 2484755 4267141 7111756
            1 -2 2 24 89 244 575 1245 2565 5110 9892 18602 33933 59996 102841 171095 276729 435966 670342 1007932 1484753
            13 27 50 87 148 248 407 650 1007 1513 2208 3137 4350 5902 7853 10268 13217 16775 21022 26043 31928
            10 4 -6 -26 -69 -153 -288 -434 -401 349 3049 10185 26338 59394 122217 234891 427648 744610 1248484 2026360 3196773
            12 34 81 161 280 442 649 901 1196 1530 1897 2289 2696 3106 3505 3877 4204 4466 4641 4705 4632
            14 11 6 5 19 64 161 336 620 1049 1664 2511 3641 5110 6979 9314 12186 15671 19850 24809 30639
            11 24 64 154 326 623 1113 1921 3286 5662 9923 17825 33046 63386 125071 250561 501785 991264 1914054 3593728 6545562
            3 0 10 54 162 384 804 1566 2949 5578 10934 22431 47467 101039 211757 431428 849851 1617128 2976734 5313904 9225716
            2 6 29 95 255 601 1280 2508 4584 7904 12975 20429 31037 45723 65578 91874 126078 169866 225137 294027 378923
            19 44 76 114 164 240 369 617 1173 2553 6021 14383 33430 74591 160067 333412 682278 1387741 2829485 5803531 11958283
            10 19 28 37 46 55 64 73 82 91 100 109 118 127 136 145 154 163 172 181 190
            15 27 43 54 53 47 74 235 763 2175 5601 13484 31055 69409 151802 326187 689327 1431483 2916207 5817834 11350665
            5 -2 -15 -36 -66 -95 -72 153 922 2903 7270 15933 31821 59220 104167 174900 282363 440764 668183 987226 1425720
            8 18 31 38 39 72 263 901 2544 6168 13381 26738 50211 89890 155017 259485 423968 678886 1068451 1656086 2531559
            -6 -9 -12 -15 -18 -21 -24 -27 -30 -33 -36 -39 -42 -45 -48 -51 -54 -57 -60 -63 -66
            -2 -6 -10 -11 -6 17 97 329 906 2176 4716 9425 17638 31263 52943 86245 135878 207942 310210 452445 646754
            27 38 46 63 112 227 453 846 1473 2412 3752 5593 8046 11233 15287 20352 26583 34146 43218 53987 66652
            3 10 24 45 73 108 150 199 255 318 388 465 549 640 738 843 955 1074 1200 1333 1473
            7 33 81 155 263 425 685 1131 1925 3341 5803 9907 16401 26085 39579 56891 76699 95241 104685 90827 29939
            11 19 33 59 108 212 454 1030 2383 5492 12475 27786 60464 128139 263828 526975 1020715 1917985 3499877 6210541 10734012
            28 55 98 159 252 413 706 1231 2155 3807 6903 13007 25428 51001 103817 213380 442709 928208 1965983 4195304 8982191
            14 33 69 134 259 509 1013 2033 4121 8447 17422 35786 72380 142871 273748 507953 912552 1588885 2685659 4415462 7075177
            7 9 14 16 6 -28 -101 -231 -439 -749 -1188 -1786 -2576 -3594 -4879 -6473 -8421 -10771 -13574 -16884 -20758
            17 29 48 86 171 362 792 1769 3985 8915 19539 41597 85697 170746 329371 616248 1120569 1984257 3427994 5787664 9564439
            8 13 31 84 223 546 1219 2500 4766 8543 14539 23680 37149 56428 83343 120112 169396 234353 318695 426748 563515
            5 21 44 77 146 318 724 1594 3328 6656 12981 25052 48179 92279 175131 327319 599455 1072399 1871330 3184671 5289032
            12 28 45 59 60 22 -112 -450 -1176 -2580 -5093 -9327 -16120 -26586 -42170 -64708 -96492 -140340 -199671 -278585 -381948
            -1 14 42 83 137 204 284 377 483 602 734 879 1037 1208 1392 1589 1799 2022 2258 2507 2769
            15 33 61 101 166 294 573 1184 2470 5054 10075 19728 38574 76716 157252 332959 721757 1578367 3432541 7345187 15367442
            7 1 0 18 76 215 519 1157 2477 5224 11018 23332 49370 103474 212993 427921 836035 1585699 2918884 5217198 9063704
            5 11 17 28 56 118 240 487 1066 2589 6642 16897 41149 94892 207413 431942 862227 1659103 3092311 5605138 9912558
            7 28 64 131 268 540 1039 1889 3269 5493 9245 16182 30312 60849 127676 271198 569483 1167754 2329742 4529493 8620100
            4 18 46 98 205 439 945 1993 4063 7996 15305 28882 54621 105004 206659 415703 848225 1740490 3568429 7286884 14811544
            6 11 18 35 66 117 221 486 1177 2858 6640 14603 30481 60716 115997 213400 379232 652653 1090102 1770483 2800972
            18 23 39 79 170 374 821 1762 3652 7281 14002 26181 48138 88080 161860 299832 558598 1040027 1920513 3493947 6232194
            24 37 56 92 163 294 517 871 1402 2163 3214 4622 6461 8812 11763 15409 19852 25201 31572 39088 47879
            19 29 34 32 21 -1 -36 -86 -153 -239 -346 -476 -631 -813 -1024 -1266 -1541 -1851 -2198 -2584 -3011
            12 23 49 104 213 417 785 1433 2550 4431 7517 12442 20087 31641 48669 73187 107744 155511 220377 307052 421177
            5 11 11 3 -18 -60 -115 -97 303 1920 6718 18961 47457 109829 240631 506810 1037285 2079649 4108537 8030811 15568212
            11 25 50 97 200 429 908 1853 3652 7011 13179 24238 43412 75340 126319 204746 322615 500627 783946 1286729 2309190
            11 28 70 154 315 628 1253 2512 5015 9871 19047 35969 66489 120365 213410 370453 629211 1045086 1696764 2692292 4175031
            25 44 70 105 151 206 260 291 261 112 -238 -899 -2013 -3758 -6352 -10057 -15183 -22092 -31202 -42991 -58001
            10 30 63 126 252 508 1034 2123 4370 8928 17929 35168 67220 125273 228105 406753 711362 1220134 2048615 3353738 5319460
            3 -7 -9 18 112 351 900 2092 4553 9381 18389 34422 61758 106603 177690 286992 450559 689489 1031043 1509914 2169660
            7 0 0 16 57 132 250 420 651 952 1332 1800 2365 3036 3822 4732 5775 6960 8296 9792 11457
            6 27 66 128 214 315 407 458 477 666 1793 6013 18563 51096 127960 297545 652000 1360261 2721540 5249326 9799676
            -7 -6 -3 -6 -23 -53 -66 35 477 1712 4551 10344 21213 40345 72352 123705 203249 322806 497873 748422 1099809
            -7 3 34 95 198 369 680 1324 2776 6111 13585 29632 62516 127086 249627 477176 896965 1679113 3171706 6110051 12065212
            1 0 -5 -10 -8 11 60 155 315 562 921 1420 2090 2965 4082 5481 7205 9300 11815 14802 18316""";
}
