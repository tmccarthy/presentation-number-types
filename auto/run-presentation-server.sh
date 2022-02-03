#!/usr/bin/env bash

pushd presentation || exit

marp \
    --config-file .marprc.yml \
    --input-dir . \
    --html \
    --server \
    --watch

popd || exit