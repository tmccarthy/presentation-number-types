#!/usr/bin/env bash

pushd presentation || exit

marp \
    --config-file .marprc.yml \
    --input-dir . \
    --server \
    --watch

popd || exit