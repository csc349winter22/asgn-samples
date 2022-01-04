## Please Note
When compiling typescript code you must use the globally installed
typescript compiler by running tsc. In order to use `@types/node`
you must run the compiler with the --typeRoots flag  to point
tsc to the global types location. See example below or in `compile.sh`.

```bash
#!/bin/sh

tsc --typeRoots $(npm root -g)/@types
```