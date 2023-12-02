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
}
