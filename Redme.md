Q:How to Run the Assessment?
A:Right Click on testNG.xml file and run as testNG Suite.

Framework: TestNG Framework with Page Object Model.
1] /src/main/java/base/Base.java has driver initialization.
2] /src/main/java/base/Runner.java takes care of reporting and Test Execution flow(done using testNG annotations)
3] /src/main/java/pages has Pages. One Class corresponding to the respective Web Page.

Reporting: Extent Reports is been implemented. MainReport.html is the name of Report file generated after execution is done.

Report will capture Pass, Fail and Skipped status of all the tests along with Screenshot of failed Test Case.

Report Location: AssessmentTendable/MainReport.html