package Jshellprogram;

public class Jshell {
	
	Microsoft Windows [Version 10.0.19045.2364]
			(c) Microsoft Corporation. All rights reserved.

			C:\Users\91987>java -version
			java version "9"
			Java(TM) SE Runtime Environment (build 9+181)
			Java HotSpot(TM) 64-Bit Server VM (build 9+181, mixed mode)

			C:\Users\91987>jshell
			|  Welcome to JShell -- Version 9
			|  For an introduction type: /help intro

			jshell> System.out.println("amit")
			amit

			jshell> static int v=10;
			|  Warning:
			|  Modifier 'static'  not permitted in top-level declarations, ignored
			|  static int v=10;
			|  ^----^
			v ==> 10

			jshell> int v=10
			v ==> 10

			jshell> System.out.println(v)
			10

			jshell> public static void test(){
			   ...> System.out.println(v)}
			|  Error:
			|  ';' expected
			|  System.out.println(v)}
			|                       ^

			jshell> public static void test(){
			   ...> System.out.println(v);
			   ...> }
			|  Warning:
			|  Modifier 'static'  not permitted in top-level declarations, ignored
			|  public static void test(){
			|  ^-----------^
			|  created method test()

			jshell> test()
			10

			jshell> public void test2(){
			   ...> System.out.println(v);
			   ...> }
			|  created method test2()

			jshell> test2();
			10

			jshell> public int test3()
			   ...> {
			   ...> System.out.println(v);
			   ...> }
			|  Error:
			|  missing return statement
			|  {
			|  ^

			jshell> public int test3(){
			   ...> return 0;
			   ...> }
			|  created method test3()

			jshell> test3()
			$10 ==> 0

			jshell> public class{
			   ...> static int c=10;
			   ...> }
			|  Error:
			|  <identifier> expected
			|  public class{
			|              ^

			jshell> public class A{
			   ...> static int v=11;
			   ...> int s=22;
			   ...> A a1=new A();
			   ...> a1.s
			   ...> System.out.println(a1.s)
			   ...> }
			|  Error:
			|  ';' expected
			|  System.out.println(a1.s)
			|        ^
			|  Error:
			|  <identifier> expected
			|  System.out.println(a1.s)
			|                    ^
			|  Error:
			|  <identifier> expected
			|  System.out.println(a1.s)
			|                         ^
			|  Error:
			|  ';' expected
			|  System.out.println(a1.s)
			|                          ^

			jshell>

			jshell> /set feedback
			|  /set feedback normal
			|
			|  Available feedback modes:
			|     concise
			|     normal
			|     silent
			|     verbose

			jshell> s>v
			|  Error:
			|  cannot find symbol
			|    symbol:   variable s
			|  s>v
			|  ^

			jshell> int x=20;
			x ==> 20

			jshell> int y=22;
			y ==> 22

			jshell> x>y
			$13 ==> false

			jshell> x<y
			$14 ==> true

			jshell> /imports
			|    import java.io.*
			|    import java.math.*
			|    import java.net.*
			|    import java.nio.file.*
			|    import java.util.*
			|    import java.util.concurrent.*
			|    import java.util.function.*
			|    import java.util.prefs.*
			|    import java.util.regex.*
			|    import java.util.stream.*

			jshell> imports java.sql
			|  Error:
			|  ';' expected
			|  imports java.sql;
			|              ^

			jshell> imports.java.sql.*;
			|  Error:
			|  <identifier> expected
			|  imports.java.sql.*;
			|                   ^
			|  Error:
			|  illegal start of expression
			|  imports.java.sql.*;
			|                    ^

			jshell> import.java.sql.*
			|  Error:
			|  <identifier> expected
			|  import.java.sql.*;
			|        ^

			jshell> import java.sql.*

			jshell> !

			jshell> /help
			|  Type a Java language expression, statement, or declaration.
			|  Or type one of the following commands:
			|  /list [<name or id>|-all|-start]
			|       list the source you have typed
			|  /edit <name or id>
			|       edit a source entry referenced by name or id
			|  /drop <name or id>
			|       delete a source entry referenced by name or id
			|  /save [-all|-history|-start] <file>
			|       Save snippet source to a file.
			|  /open <file>
			|       open a file as source input
			|  /vars [<name or id>|-all|-start]
			|       list the declared variables and their values
			|  /methods [<name or id>|-all|-start]
			|       list the declared methods and their signatures
			|  /types [<name or id>|-all|-start]
			|       list the declared types
			|  /imports
			|       list the imported items
			|  /exit
			|       exit jshell
			|  /env [-class-path <path>] [-module-path <path>] [-add-modules <modules>] ...
			|       view or change the evaluation context
			|  /reset [-class-path <path>] [-module-path <path>] [-add-modules <modules>]...
			|       reset jshell
			|  /reload [-restore] [-quiet] [-class-path <path>] [-module-path <path>]...
			|       reset and replay relevant history -- current or previous (-restore)
			|  /history
			|       history of what you have typed
			|  /help [<command>|<subject>]
			|       get information about jshell
			|  /set editor|start|feedback|mode|prompt|truncation|format ...
			|       set jshell configuration information
			|  /? [<command>|<subject>]
			|       get information about jshell
			|  /!
			|       re-run last snippet
			|  /<id>
			|       re-run snippet by id
			|  /-<n>
			|       re-run n-th previous snippet
			|
			|  For more information type '/help' followed by the name of a
			|  command or a subject.
			|  For example '/help /list' or '/help intro'.
			|
			|  Subjects:
			|
			|  intro
			|       an introduction to the jshell tool
			|  shortcuts
			|       a description of keystrokes for snippet and command completion,
			|       information access, and automatic code generation
			|  context
			|       the evaluation context options for /env /reload and /reset

			jshell> /exit
			|  Goodbye

			C:\Users\91987>jshell
			|  Welcome to JShell -- Version 9
			|  For an introduction type: /help intro

			jshell> /
			|  Command: '/' is ambiguous: /list, /edit, /drop, /save, /open, /vars, /methods, /types, /imports, /exit, /env, /reset, /reload, /history, /debug, /help, /set, /?, /!
			|  Type /help for help.

			jshell> /list

			jshell> int x=20;
			x ==> 20

			jshell> int y=50;
			y ==> 50

			jshell> /list

			   1 : int x=20;
			   2 : int y=50;

			jshell> /reset
			|  Resetting state.

			jshell> /list

			jshell> public void test(){
			   ...> System.out.println("nisja");
			   ...> }
			|  created method test()

			jshell> /edit

			jshell>

			jshell> /
			|  Command: '/' is ambiguous: /list, /edit, /drop, /save, /open, /vars, /methods, /types, /imports, /exit, /env, /reset, /reload, /history, /debug, /help, /set, /?, /!
			|  Type /help for help.

			jshell> /list

			   1 : public void test(){
			       System.out.println("nisja");
			       }

			jshell> /edit

			jshell> /list

			   1 : public void test(){
			       System.out.println("nisja");
			       }

			jshell> /edit 1

			jshell> /list

			   1 : public void test(){
			       System.out.println("nisja");
			       }

			jshell> /drop 1
			|  dropped method test()

			jshell> /list

			jshell> /save krishna.jsh

			jshell> /open krishna.jsh

			jshell> ArrayList<String> a=new ArrayList<>();
			a ==> []

			jshell> /vars
			|    ArrayList<String> a = []

			jshell> /methods

			jshell> public class A{
			   ...> }
			|  created class A

			jshell> public interface{
			   ...> }
			|  Error:
			|  <identifier> expected
			|  public interface{
			|                  ^

			jshell> /types
			|    class A

			jshell> public interface B{
			   ...> }
			|  created interface B

			jshell> /types
			|    class A
			|    interface B

			jshell> /history

			/
			/list
			int x=20;
			int y=50;
			/list
			/reset
			/list
			public void test(){
			System.out.println("nisja");
			}
			/edit
			/
			/list
			/edit
			/list
			/edit 1
			/list
			/drop 1
			/list
			/save krishna.jsh
			/open krishna.jsh
			ArrayList<String> a=new ArrayList<>();
			/vars
			/methods
			public class A{
			}
			public interface{
			}
			/types
			public interface B{
			}
			/types
			/history

			jshell> /!
			public interface B{
			}
			|  modified interface B

			jshell> /list

			   2 : ArrayList<String> a=new ArrayList<>();
			   3 : public class A{
			       }
			   5 : public interface B{
			       }

			jshell> /5
			public interface B{
			}
			|  modified interface B




}
