# Ciphers
This is a application will provide the user an JavaFX interface to perform basic encrypt and decript functions

<br />
###Scope
The project will support the following ciphers:
- Caesar
- ROT13
- ROT N
- Rail-Fence
- Baudot
- More to come...

######The final goal is make a library of common ciphers for public use

#####Skills Required
- MVC model
- JavaFX
- Algorithm design
- Hobbist level cipher knowledge

###Project Structure
The project will consit of three main directories; ciphers, user and test
- ciphers (The model of this project)
 - common
  - Shift (by n units)
 - Caesar
 - Rot13
 - RotN
 - RailFence
 - Baudot

- user (where the user interactions will be handled)
 - view
 - controller
 
- test <br>
 - Test cases for each cipher type to check if changes made affect the reliability

###References
ROT N - http://theblob.org/rot.cgi
