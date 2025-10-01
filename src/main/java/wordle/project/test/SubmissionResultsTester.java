package wordle.project.test;

import wordle.project.data.SubmissionResults;

public class SubmissionResultsTester {
    public static void main(String[] args) {
        SubmissionResults submissionResults = new SubmissionResults("HELLO", "TESTS");
        System.out.println(submissionResults);
        System.out.println("Won game: " + submissionResults.wonGame());
    }
}
