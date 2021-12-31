#!/bin/sh

function fib {
    if [ "$1" -lt 0 ]; then
        echo '-1'
    elif [ "$1" -eq 0 ] || [ "$1" -eq 1 ]; then
        echo "$1"
    else
        echo "$(( $(fib "$(($1 - 1))") + $(fib "$(($1 - 2))") ))"
    fi
}

fib "$1"
