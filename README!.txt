part A - 
Create a private external GitLab repository named “_D387” and do the following:
•   Push the code from the IDE to the repository.
•   Add “WGU-Evaluation” as a member with reporter access to your repository on GitLab.
•   Commit with a message and push when you complete each requirement listed in parts C1, C2, C3, D2, and D3.
•   Submit a copy of the GitLab repository URL and a copy of the repository branch history created following the completion of all task requirements and retrieved from your repository, which must include the commit messages and dates.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

* Created gitlab repo for d387
https://gitlab.com/wgu-gitlab-environment/student-repos/jlairs5/d387-advanced-java/-/tree/working_branch

==================================================================================================================================================================================================

part B - 
Create a README file that includes the following:
1.   Include notes describing where in the code to find the changes you made for each requirement in parts C1, C2, C3, D2, and D3. Each note should include the label for the task requirement (e.g., C1, C2), file name, line number, and change.
2.   Include the URL to the GitLab repository.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

* Created this README! file

==================================================================================================================================================================================================

part C -   
Modify the Landon Hotel scheduling application for localization and internationalization by doing the following:
1.   Install the Landon Hotel scheduling application in your integrated development environment (IDE). Modify the Java classes of application to display a welcome message by doing the following:
a.   Build resource bundles for both English and French (languages required by Canadian law). Include a welcome message in the language resource bundles.
b.   Display the welcome message in both English and French by applying the resource bundles using a different thread for each language.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

* Created resource bundle 'langs' with 2 locales (1 lines each)
* Created  and populated WelcomeMessage.java (28 lines) and WelcomeController (22 lines) to use resource bundle messages from langs
* Edited D387SampleCodeApplication.java (lines 15 -27) to run welcome messages in separate threads
* Edited front end files app.component.ts (lines 18, 19, 36, 37) and app.component.html (lines 26 - 30) to display welcome message threads

==================================================================================================================================================================================================

part C -
2.   Modify the front end to display the price for a reservation in currency rates for U.S. dollars ($), Canadian dollars (C$), and euros (€) on different lines.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

* modified app.component.ts (lines 73, 74, 122, 123) and app.component.html (lines 84, 85) to include room prices in EUR and CAD currencies

==================================================================================================================================================================================================

part C -
3.   Display the time for an online live presentation held at the Landon Hotel by doing the following:
a.   Write a Java method to convert times between eastern time (ET), mountain time (MT), and coordinated universal time (UTC) zones.
b.   Use the time zone conversion method from part C3a to display a message stating the time in all three times zones in hours and minutes for an online, live 
presentation held at the Landon Hotel. The times should be displayed as ET, MT, and UTC.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

* Created and populated Timezone.java (32 lines) and TimezoneController.java (14 lines) to send time conversions to angular front end
* Edited app.component.ts (lines 32, 36, 58 - 67) and app.component.html (lines 66 - 69) to display meeting message on angular front end with time conversions

==================================================================================================================================================================================================

part D -
1.   Build the Dockerfile to create a single image that includes all code, including modifications made in parts C1 to C3. Commit and push the final Dockerfile to GitLab.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

* Created Dockerfile in project directory (5 lines)
* Built docker image named 'd387' in cmd
* Pushed Dockerfile to gitlab

==================================================================================================================================================================================================

part D -
2.   Test the Dockerfile by doing the following:
•   Create a Docker image of the current multithreaded Spring application.
•   Run the Docker image in a container and give the container a name that includes D387_[student ID].
•   Submit a screenshot capture of the running application with evidence it is running in the container.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
* Ran app in new Docker container named 'd387_009965674'
* Screenshot of running app in Docker container

==================================================================================================================================================================================================
part D -
3.   Describe how you would deploy the current multithreaded Spring application to the cloud. Include the name of the cloud service provider you would use.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

In order to migrate this app to the cloud, it is necessary to remove static port numbers from the project code and and instead include the utilities 'location' and 'locationStrategy' 
to dynamically assign web addressing. I would use AWS for cloud hosting because their record for hosting uptime is better than their competitors over the long term, and lost site 
availability is lost business.
Upon signing up for AWS EC2 cloud service, I can begin a session, install Docker to that environment, and run my app's Docker container.

==================================================================================================================================================================================================
part E -
Export your project from the IDE as a compressed file.

* Done!