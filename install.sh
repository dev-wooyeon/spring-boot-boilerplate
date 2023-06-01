#!/bin/bash

set -u

REPOSITORY_URL="https://github.com/ieunune/spring-boot-boilerplate"

abort() {
    printf "%s\n" "$@" >&2
    exit 1
}

installBoilerPlate() {
    mkdir temp
    cd temp
    git init
    git config core.sparseCheckout true
    git remote add -f origin $REPOSITORY_URL
    echo "$1/*" > .git/info/sparse-checkout
    git pull origin main
    git checkout main
    rm -rf .git
    mv "$1" "../$1"
    cd ..
    rm -rf temp

    echo "finish spring-boot-boilerplate download!"
}

if [ -z "${BASH_VERSION:-}" ]
then
    abort "Bash is required to interpret this script."
fi

boilerplates="spring-boot-api spring-boot-react-web"

select boilerplate in $boilerplates ; do
    if [ "$boilerplate" = "spring-boot-api" ] ; then
        installBoilerPlate "spring-boot-api"
        exit
    elif [ "$boilerplate" = "spring-boot-react-web" ] ; then
        installBoilerPlate "spring-boot-react-web"
        exit
    else
        abort "not supported"
    fi
done