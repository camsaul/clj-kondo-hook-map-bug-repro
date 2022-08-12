Repro for Kondo bug.

```
$ clj-kondo --lint my_ns.clj

my_ns.clj:8:50: error: Expected: associative collection or nil, received: string.
linting took 9ms, errors: 1, warnings: 0
```
