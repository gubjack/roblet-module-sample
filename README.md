# A sample of a roblet server module

If you want to develop a roblet server module from scratch - you may find the code in this repository useful.

There are basically 4 parts that you deal with.
Of course there's
* a Roblet server module

But in addition there is
* an Interface library
* a Command Line utility
* and a Debian package

It is organized as a multi-module Maven project to ease handling.
But don't get confused - Maven also uses the notion of a __module__.
And the 4 parts mentioned above are in this sense sub-directories each being a _Maven module_.

Only one of them will produce a _Roblet server module_.
And it will use the Interface library.

Anyway it's not difficult in the end.
