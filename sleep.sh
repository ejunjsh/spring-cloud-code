
#!/bin/bash

sleep $1

shift
cmd="$@"

exec $cmd