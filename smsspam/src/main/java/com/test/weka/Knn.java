/**
 * Copyright Rio Chandra Rajagukguk
 */
package com.test.weka;

import com.test.weka.classifiers.BaseClassifier;
import weka.classifiers.lazy.IBk;

public class Knn {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		/** initialize the Knn Classifier with k = 3 */
		IBk knn = new IBk(3);
		BaseClassifier classifier = new BaseClassifier();
		classifier.setClassifier(knn);

        System.out.println("Start training data, please wait...");
		classifier.train();
        System.out.println("complete.");

        String dataTest[] = {
        /*ham*/	"Nah I don't think he goes to usf, he lives around here though",
        /*spam*/"FreeMsg Hey there darling it's been 3 week's now and no word back! I'd like some fun you up for it still? Tb ok! XxX std chgs to send, £1.50 to rcv",
        /*ham*/	"Even my brother is not like to speak with me. They treat me like aids patent.",
        /*ham*/	"As per your request 'Melle Melle (Oru Minnaminunginte Nurungu Vettam)' has been set as your callertune for all Callers. Press *9 to copy your friends Callertune",
        /*spam*/"WINNER!! As a valued network customer you have been selected to receivea £900 prize reward! To claim call 09061701461. Claim code KL341. Valid 12 hours only.",
        /*spam*/"Had your mobile 11 months or more? U R entitled to Update to the latest colour mobiles with camera for Free! Call The Mobile Update Co FREE on 08002986030",
        /*ham*/	"I'm gonna be home soon and i don't want to talk about this stuff anymore tonight, k? I've cried enough today.",
        /*spam*/"SIX chances to win CASH! From 100 to 20,000 pounds txt> CSH11 and send to 87575. Cost 150p/day, 6days, 16+ TsandCs apply Reply HL 4 info",
        /*spam*/"URGENT! You have won a 1 week FREE membership in our £100,000 Prize Jackpot! Txt the word: CLAIM to No: 81010 T&C www.dbuk.net LCCLTD POBOX 4403LDNW1A7RW18",
        /*ham*/	"I've been searching for the right words to thank you for this breather. I promise i wont take your help for granted and will fulfil my promise. You have been wonderful and a blessing at all times.",
        /*ham*/	"I HAVE A DATE ON SUNDAY WITH WILL!!",
        /*spam*/"XXXMobileMovieClub: To use your credit, click the WAP link in the next txt message or click here>> http://wap. xxxmobilemovieclub.com?n=QJKGIGHJJGCBL",
        /*ham*/	"Oh k...i'm watching here:)",
        /*ham*/	"Eh u remember how 2 spell his name... Yes i did. He v naughty make until i v wet.",
        /*ham*/	"Fine if thats the way u feel. Thats the way its gota b",
        /*spam*/"England v Macedonia - dont miss the goals/team news. Txt ur national team to 87077 eg ENGLAND to 87077 Try:WALES, SCOTLAND 4txt/ú1.20 POBOXox36504W45WQ 16+",
        /*ham*/	"Is that seriously how you spell his name?"
        };
        String dataResultTrue[] = {
            "ham",
            "spam",
            "ham",
            "ham",
            "spam",
            "spam",
            "ham",
            "spam",
            "spam",
            "ham",
            "ham",
            "spam",
            "ham",
            "ham",
            "ham",
            "spam",
            "ham"
        };

        int i = 0;
        int tru = 0;
        for(String msg: dataTest){
            String res = classifier.classifyMessage(msg);
            System.out.println(String.valueOf(i) + ". " +  String.valueOf(dataResultTrue[i].equals(res)) + ", " + dataResultTrue[i] + " - " + res);
            if(dataResultTrue[i].equals(res))
                tru++;

            i++;
        }
        System.out.println("Akurasi: " + String.valueOf(tru * 100 / i) + "%");
	}
}
