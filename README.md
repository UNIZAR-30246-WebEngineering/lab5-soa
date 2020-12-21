# Web Engineering 2020-2021 / SOA
**In this assignment your PR must only modify the `README.md` file**.
Please, go to the [Wiki](https://github.com/UNIZAR-30246-WebEngineering/lab5-soa/wiki) in order to get the instructions for this assignment.

## Primary goal

The objective is to extend the query interface to support the command `max:n`, where _n_ is a number. 
`max` sets a limit in the number of retrieved tweets.
That is `cool max:10` must return at most 10 tweets. 
There are several ways to do it. 
You can use the parameter `q` or create additional parameters. 
There is a restriction. 
You must explicitly tell the API Twitter to enforce such a limit. 
Read the documentation of the [Twitter Search component](https://camel.apache.org/components/latest/twitter-search-component.html) of Apache Camel to discover how.

You need to [apply for a free Twitter developer account](https://developer.twitter.com/en/apply-for-access).
Do not add `application.properties` with the Twitter tokens to your git!

Note: the Twitter Search endpoint is configured using URI syntax `twitter-search:{string}[?param=value[&param=value]*]`

## Secondary goals (:gift:)

Done:

- [Use Camel for keeping a copy of responses in a database](https://github.com/rauljavierre/lab5-soa/tree/test) Raul Javierre has learned how an external database can be integrated in a Camel route quite easily. In additon, his work shows how to use docker-compose for building and running two nodes: the application and the dabase. :gift:
- [Use Camel for providing a REST endpoint for queries](https://github.com/AlbertoCalvoRubio/lab5-soa/tree/gift) Alberto Calvo has learned that it is very easy to create http endpoints in Camel but remember: it is a pipeline and you must explicitly tell Camel what to do. :gift:
- [Create an operator "-" to filter out tweets that contain a keyword](https://github.com/andrewknoll/lab5-soa/tree/test) Andrés Otero has fought and won against Apache Camel documentation. :gift:  
- [Use Camel for providing a WebSocked endpoint for queries](https://github.com/TheRealFreeman/lab5-soa/tree/gift) Enrique Ruiz has leaned how to setup a WebSocket enpoint with Camel, and (after a review) how to ensure that JSON responses are send back to the client and handled by JavaScript. 
- [Throttle the route to avoid be banned by Twitter](https://github.com/Kifixo/lab5-soa/tree/test) Daniel Huici has leared a lesson complementary to Alberto Rubio's lesson: sometimes in Apache Camel it is very easy to do powerful things. :gift:
- [Enrich the response with moustache](https://github.com/jgarciapueyo/lab5-soa/tree/test) Jorge García has moved the moustache template from the front to the back and in the process he has learned a new aggregation strategy. :gift:

Proposed:

- **The possibilities of Camel are endless; you can propose your idea for a :gift:.**

Manifest your intention first by a PR updating this `README.md` with your goal.
If you desist of your goal, release it by a PR so other fellow can try it. 

|NIA    | User name | Repo | Improvement | Score  |
|-------|-----------|------|-------------|--------|
| 758267 | [Pedro Allué](https://github.com/piter1902) |  [piter1902/lab5-soa](https://github.com/piter1902/lab5-soa/tree/test)    |             |        | 
| 760704 | [Álvaro García](https://github.com/Alvarogd6) | [Alvarogd6/lab5-soa](https://github.com/Alvarogd6/lab5-soa/tree/test) |    |    | 
| 757755 | [Andrés Otero García](https://github.com/andrewknoll) |  [andrewknoll/lab5-soa](https://github.com/andrewknoll/lab5-soa/tree/test)    |[Create an operator "-" to filter out tweets that contain a keyword](https://camel.apache.org/components/latest/eips/filter-eip.html)             | :gift: 
| 758906 | [rauljavierre](https://github.com/rauljavierre)|[rauljavierre/lab5-soa](https://github.com/rauljavierre/lab5-soa/tree/test)|[Use Camel for keeping a copy of responses in a database](https://camel.apache.org/components/latest/jdbc-component.html)|:gift:|
| 757153 | [Fran-sw](https://github.com/Fran-sw) |[lab5-soa](https://github.com/Fran-sw/lab5-soa/tree/test)     |        | 
| 758803 | [Daniel González](https://github.com/Uncastellum) | [Uncastellum/lab5-soa](https://github.com/Uncastellum/lab5-soa/tree/test) |    |    | 
| 760739 | [Alberto Calvo](https://github.com/AlbertoCalvoRubio) | [AlbertoCalvoRubio/lab5-soa](https://github.com/AlbertoCalvoRubio/lab5-soa/tree/test) |[Use Camel for providing a REST endpoint for queries](https://camel.apache.org/components/latest/rest-component.html)   |:gift:| 
| 761319 | [Markles01](https://github.com/Markles01) |[lab5-soa](https://github.com/Markles01/lab5-soa/tree/test)     |        | 
| 739202 | [luisgg98](https://github.com/luisgg98) |[luisgg98/lab5-soa](https://github.com/luisgg98/lab5-soa/tree/test)     |        | 
| 757715 | [Hayk Kocharyan](https://github.com/hayk99) |  [hayk99/lab5-soa](https://github.com/hayk99/lab5-soa/tree/test)    |             |        | 
| 755742 | [jtambo99](https://github.com/jtambo99) |[jtambo99/lab5-soa](https://github.com/jtambo99/lab5-soa/tree/test)     |        | 
| 766685 | [Enrique Ruiz](https://github.com/TheRealFreeman) | [TheRealFreeman/lab5-soa](https://github.com/TheRealFreeman/lab5-soa/tree/test) | [Use Camel for providing a WebSocked endpoint for queries](https://camel.apache.org/components/latest/websocket-jsr356-component.html)|:gift:| 
| 756123 | [Rogelio Antonio Lacruz Mirallas](https://github.com/RogorStuff) |  [RogorStuff/lab5-soa](https://github.com/RogorStuff/lab5-soa/tree/test)| ||
| 758325 | [Irene Fumanal Lacoma](https://github.com/irefu) |[irefu/lab5-soa](https://github.com/irefu/lab5-soa/tree/test)     |        | 
| 740491 | [José Ignacio Hernández](https://github.com/740491) |[740491/lab5-soa](https://github.com/740491/lab5-soa/tree/test)     |        |
| 740491 | [Martín Gascón](https://github.com/MartinGasconL) |[MartinGasconL/lab5-soa](https://github.com/MartinGasconL/lab5-soa/tree/test)     |        | 
| 761754 | [David Alloza Tejero](https://github.com/david-AT) |[david-AT/lab5-soa](https://github.com/david-AT/lab5-soa/tree/test)     |        | 
| 738845 | [Víctor Martínez](https://github.com/viriannn) |[viriannn/lab5-soa](https://github.com/viriannn/lab5-soa/tree/test)     |        | 
| 756308 | [Álvaro Santamaría](https://github.com/SanTa45zgz) |[SanTa45zgz/lab5-soa](https://github.com/SanTa45zgz/lab5-soa/tree/test)     |        | 
| 758635 | [Daniel Huici Meseguer](https://github.com/Kifixo) |[Kifixo/lab5-soa](https://github.com/Kifixo/lab5-soa/tree/test)     | Throttle the route to avoid be banned by Twitter  | :gift: | 
| 756308 | [Eduardo Ruiz](https://github.com/eduardoRuizC) |[eduardoRuizC/lab5-soa](https://github.com/eduardoRuizC/lab5-soa/tree/test)     |        | 
| 758807 | [Jorge Garcia](https://github.com/jgarciapueyo) |[jgarciapueyo/lab5-soa](https://github.com/jgarciapueyo/lab5-soa/tree/test) | Enrich the response with moustache | :gift: | 
| 723883 | [Jorge Turbica](https://github.com/turbica) |[turbica/lab5-soa](https://github.com/turbica/lab5-soa/tree/test)     |        |
| 740241 | [Sergio Álvarez](https://github.com/sergio-alv) |[sergio-alv/lab5-soa](https://github.com/sergio-alv/lab5-soa/tree/test)     |        | 
| 755769 | [Saúl Flores](https://github.com/saul205) |[saul205/lab5-soa](https://github.com/saul205/lab5-soa/tree/test)     |        | 
| 739324 | [elenamv13](https://github.com/elenamv13)|[elenamv13/lab5-soa](https://github.com/elenamv13/lab5-soa/tree/test)| | |
| 719974 | [Sergio Martínez](https://github.com/Sergio-Martinez-97) |[Sergio-Martinez-97/lab5-soa](https://github.com/Sergio-Martinez-97/lab5-soa/tree/test)     |        |
| 738233 | [Sergio Torres](https://github.com/cul3bro) |[cul3bro/lab5-soa](https://github.com/cul3bro/lab5-soa/tree/test)     |        |
| 738737 | [Víctor Jarreta](https://github.com/VJarreta) |[VJarreta/lab5-soa](https://github.com/VJarreta/lab5-soa/tree/test)     |        | 
| 735041 | [Eduardo Díaz](https://github.com/ediazl) |[ediazl/lab5-soa](https://github.com/ediazl/lab5-soa/tree/test)     |        | 
| 737070 | [Daniel Barceló](https://github.com/DaniBarcelo) |[DaniBarcelo/lab5-soa](https://github.com/DaniBarcelo/lab5-soa/tree/test)     |        | 
