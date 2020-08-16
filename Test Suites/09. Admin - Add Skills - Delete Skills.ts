<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>09. Admin - Add Skills - Delete Skills</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>43c55bee-8a13-4506-8ac1-6d2a323b8be6</testSuiteGuid>
   <testCaseLink>
      <guid>2e5d2c37-6447-45f5-a08d-9d6deb821c3f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01. NavigateToURL</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>11e4f99a-00a1-4d88-8b27-24bf3f799876</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02. ValidLogin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>f2d8ec2c-e753-4990-85e0-92ae299a39ac</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/12. GoToAdmin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>73c017c7-efaa-4173-bc29-5250b1a28d70</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/13. AddSkills</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>6841ac9d-73c9-473b-a87c-2b6e3af08521</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/Skills (1)</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>6841ac9d-73c9-473b-a87c-2b6e3af08521</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>skillName</value>
         <variableId>20fa2748-8a2d-49ce-a63e-ff7630625752</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>6841ac9d-73c9-473b-a87c-2b6e3af08521</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>description</value>
         <variableId>a1eb287c-c068-4ce1-897a-03a43e407a65</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>96a904c0-a040-44c7-ab62-01487cb54842</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/14. DeleteSkills</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
