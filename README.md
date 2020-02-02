# songr

*Description*

Java full-stack web application with CRUD functionality and 3 routes and methods for rendering basic html page.
Functional read and add operations.
"/hello" route renders the home page.
"/capitalize/{str}" uses the caps method to render a string passed as a parameter through the path variable as a capitalized string.
"/albums" renders a page with a list of album object passed from the controller.
Clicking on a album image routes user to individual album page where album data is displayed.
From the single album page users can add song objects to the album and the single album page will populate withthe new song information.

*Starting App*

- Clone repository
- Using IntelliJ, import project from root level
- Build app
- Run app
- Go to 127.0.0.1:8080/hello
- Go to 127.0.0.1:8080/capitalize/some-string
- Go to 127.0.0.1:8080/albums
- Click on album image to go to that album's page
- Fill out the form to add a song to the album
