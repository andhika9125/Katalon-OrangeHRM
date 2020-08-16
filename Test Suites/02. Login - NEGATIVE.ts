<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>02. Login - NEGATIVE</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>43c21023-b4d8-43b1-ab54-81a7028d4dcc</testSuiteGuid>
   <testCaseLink>
      <guid>cf2279de-e597-4857-9f66-336e9b088c6f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01. NavigateToURL</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>122ac2b8-8d1c-4fa9-a1e8-b576a5a998fe</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03. InvalidLogin</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>a5f1cb06-1ee5-4a01-a5b3-5ee0c171c3e9</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/LoginNegative</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>a5f1cb06-1ee5-4a01-a5b3-5ee0c171c3e9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>f9436ff2-d238-484b-bf39-5f572f52dadf</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a5f1cb06-1ee5-4a01-a5b3-5ee0c171c3e9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>af109564-f9d0-4022-85cf-73aa8d039852</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a5f1cb06-1ee5-4a01-a5b3-5ee0c171c3e9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedResult</value>
         <variableId>99cee43e-9774-41b7-98ed-4ad67e5674cf</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
