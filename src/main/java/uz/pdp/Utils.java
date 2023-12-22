package uz.pdp;

import uz.pdp.bot.BotService;
import uz.pdp.buttons.Buttons;
import uz.pdp.repository.UserRepository;
import uz.pdp.service.SendService;
import uz.pdp.service.UserService;

import java.util.logging.Logger;

public interface Utils {
    UserRepository userRepository = new UserRepository();
    UserService userService = new UserService();
    BotService botService = new BotService();
    SendService sendService = new SendService();
    Logger logger = Logger.getLogger("Loggerjon");

    Buttons buttons = new Buttons();
    String nafsniPoklashText = "Darsliklarning tartibi bilan tanishing!\n" +
            "\n" +
            "1. Muqaddima\n" +
            "2. Inson - eng oliy maxluq!\n" +
            "3. Nafs va Fitrat\n" +
            "4. Imom G'azzoliyning ta'limoti\n" +
            "5. Buyuruvchini tanish!\n" +
            "6. Iymon va Muhabbat - 1\n" +
            "7. Iymon va Muhabbat - 2\n" +
            "8. Iymon va Muhabbat - 3\n" +
            "9. Ixlos - 1\n" +
            "10. Ixlos - 2\n" +
            "\n" +
            "11. Ixlos - 3\n" +
            "12. Ilmning manzilati - 1\n" +
            "13. Ilmning manzilati - 2\n" +
            ".\n" +
            ".\n" +
            ".";

    String qisqaDarsliklarText = "Darsliklar ro'yxati:\n\n" +
            "1. Musibatga sabr\n" +
            "2. Hayvonlarni azoblovchilar\n" +
            "3. Allohga Tavakkul\n" +
            "4. Ayollar bilan chiroyli muomila\n" +
            "5. O'gay ona\n" +
            "6. Hayvonlarga Raxm shavqatlilar\n" +
            "7. Tumorga ishanuvchilar\n" +
            "8. Sabr haqida\n" +
            "9. Nima eksang shuni o'rasan\n" +
            "10. Allohga suyanish kerak.\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "11. Hayvonlarni qulog'ini kesubchilar\n" +
            "12. Rizq haqida\n" +
            "13. Yig'lash xaqida\n" +
            "14. Hasbun Alloh\n" +
            "15. Besabrlik\n" +
            "16. Kim  baxtli dunyoda\n" +
            "17. Eng saodatli odam\n" +
            "18. Hayotning eng go'zal lahzalari\n" +
            "19. Qamoqdagi ulamolarning gaplari\n" +
            "20. Qalb qachon hotirjam bo'ladi\n" +
            "\n" +
            "____________________________";

    String siyratDarslariText = "«Siyrat yohud Rosululloh s.a.v ning hayoti 2012» darsliklari tartibi bilan tanishing! \n" +
            "\n" +
            "1. Siyratning fazilati\n" +
            "2. Amr ibn Luhay\n" +
            "3. Asxabul uhdud\n" +
            "4. Fil voqeasi\n" +
            "5. Yamanga forslarning kirib kelishi\n" +
            "6. Zam zam va Rosulimizning tug'ilishlari\n" +
            "7. Halima enaga\n" +
            "8. Shomga safari va Xadicha onamizga uylanishlari\n" +
            "9. Ka'batullohning ta'miri\n" +
            "10. Vahiyning boshlanishi\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "11. Avvalgi musulmonlar\n" +
            "12. Xamza r.a ning Islomga kirishi\n" +
            "13. Mo'jiza talabi\n" +
            "14. Umar ibn Xattob r.a ning Islomga kirishi\n" +
            "15. Iqtisodiy qamal\n" +
            "16. Toifga safari\n" +
            "17. Nusaybin jinlarining islomi\n" +
            "18. Birinchi hijrat va Najjoshiy xuzurida\n" +
            "19. Isro va Me'roj voqeasi\n" +
            "20. Mo'jizalar\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "21. Aqoba bay'ati\n" +
            "22. Rosululloh s.a.vning hijrati\n" +
            "23. Madinaga kirib kelishi\n" +
            "24. Abdulloh ibn Sallam\n" +
            "25. Badr g'azoti 1.\n" +
            "26. Badr g'azoti 2.\n" +
            "27. Badr g'azoti 3.\n" +
            "28. Badr g'azoti 4.\n" +
            "29. Uhud g'azoti 1.\n" +
            "30. Uhud g'azoti 2.\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "31. Uhud g'azoti 3. \n" +
            "32. Uhud g'azoti 4.\n" +
            "33. Banu Nazir g'azoti\n" +
            "34. Handaq janggi 1.\n" +
            "35. Handaq janggi 2.\n" +
            "36. Banu Qurayza g'azoti\n" +
            "37.  Sumoma ibn Usol\n" +
            "38. Banu Mustalia\n" +
            "39. Ifk voqeasi\n" +
            "40. Hudaybiya sulhi\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "41. Hudaybiya sulhi 2.\n" +
            "42. Xaybar g'azoti 1.\n" +
            "43. Xaybar g'azoti 2.\n" +
            "44. Xaybar g'azoti 3.\n" +
            "45. Xaybar g'azoti 4.\n" +
            "46. Hiroql va Abu So'fyon suxbati\n" +
            "47. Mut'a g'azoti\n" +
            "48. ZatuSalohi sariyasi\n" +
            "49. Makka fathi 1.\n" +
            "50. Makka fathi 2.\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "51. Makka fathi 3.\n" +
            "52. Hunayin g'azoti\n" +
            "53. G'animlarni tarqatish\n" +
            "54. Toif va Tabuk safari\n" +
            "55. Tabuk safari\n" +
            "56. Tabukda qaytish\n" +
            "57. Ka'b ibn Molik\n" +
            "58. Musaylama Kazzob\n" +
            "59. Adiy ibn Holim va Najron\n" +
            "60. Vidolashuv (oxirgi) xaji\n" +
            "\n" +
            "____________________________\n" +
            "\n" +
            "61. Vidolashuv xutbasi\n" +
            "62. Rosululloh s.a.v ning vafot etishi\n" +
            "63. Rosululloh s.a.v ning dafn etishi va Rosululloh s.a.v ning ko'rinishlari xaqida sahobalarning so'zlari\n" +
            "\n" +
            "O'zingizga kerakli bo'lgan darsliklarni yuqorida keltirilgan tartib bo'yicha pastdagi boʻlimlardan tanlashingiz mumkin! \uD83D\uDC47\uD83C\uDFFB";
    String aloqaText = "\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB Loyiha asoschisi — Jahongir Sobirjonov\n" +
            "\n"+
            "©\uFE0F Manba : Ilm Nuri\n"+
            "\n" +
            "\uD83D\uDCE9 Murojaatlar uchun — @sobirjonov_221\n" ;

}
