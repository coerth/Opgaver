size(200,200);
//die variables 
int dieXpos = 0;
int dieYpos = 0;
int dieWidth = 100;
int dieHeight = 100;
int dieEdge = 15;
color dieColor;

//eye variables
color eyeColor;
float eyeWidth = dieWidth*0.20;

//Terning og øjne placering
stroke(0);
fill(255);
rect(dieXpos, dieYpos, dieWidth, dieHeight, dieEdge);

//die variables
int dieXpos = 0;
int dieYpos = 0;
int dieWidth = 100;
int dieHeight = 100;
int dieEdge = 15;
color dieColor;

//eye variables
color eyeColor;
float eyeWidth = dieWidth*0.20;

//Terning og øjne placering
stroke(0);
fill(255);
rect(dieXpos, dieYpos, dieWidth, dieHeight, dieEdge);

fill(0);


//øverste 2 øjne
circle(dieXpos+dieWidth*0.25, dieYpos+dieHeight*0.25, eyeWidth);
circle(dieXpos+dieWidth*0.75, dieYpos+dieHeight*0.25, eyeWidth);

//midteste 2 øjne
circle(dieXpos+dieWidth*0.25, dieYpos+dieHeight*0.50, eyeWidth);
circle(dieXpos+dieWidth*0.75, dieYpos+dieHeight*0.50, eyeWidth);

//nederste øjne
circle(dieXpos+dieWidth*0.25, dieYpos+dieHeight*0.75, eyeWidth);
circle(dieXpos+dieWidth*0.75, dieYpos+dieHeight*0.75, eyeWidth);

//center
circle(dieXpos+dieWidth*0.50, dieYpos+dieHeight*0.50, eyeWidth);
