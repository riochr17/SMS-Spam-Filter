/**
 * Copyright Guendouz Mohamed 2013
 */
package com.test.weka;

import com.test.weka.classifiers.BaseClassifier;

public class Common {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		/**
		 * initialize the base classifier with the default classifier ( Naive
		 * Bayes)
		 */
		BaseClassifier baseClassifier = new BaseClassifier();

        System.out.println("Start training data, please wait...");
        baseClassifier.train();
        System.out.println("complete.");

		String msg = "Where do you need to go to get it?";
		System.out.println(msg + " is a " + baseClassifier
				.classifyMessage(msg));

	}

}
