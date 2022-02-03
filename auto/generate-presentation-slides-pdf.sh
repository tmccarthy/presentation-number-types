#!/usr/bin/env bash

pushd presentation || exit

marp \
    --config-file .marprc.yml \
    --input-dir . \
    --html \
    --output ../ \
    --allow-local-files \
    --pdf

popd || exit