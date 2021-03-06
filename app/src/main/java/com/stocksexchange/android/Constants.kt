package com.stocksexchange.android

import android.os.Build

// Request codes related
const val REQUEST_CODE_CAMERA_PERMISSION = 1000
const val REQUEST_CODE_STORAGE_PERMISSION = 1001
const val REQUEST_CODE_NEW_EMAIL = 1002
const val REQUEST_CODE_SECURITY_PROVIDER = 1003
const val REQUEST_CODE_CHART_ACTIVITY = 1004
const val REQUEST_CODE_RINGTONE_PERMISSION = 1005
const val REQUEST_CODE_RINGTONE_ACTIVITY = 1006
const val REQUEST_CODE_SHARE_VIA = 1007
const val REQUEST_CODE_COPY_LINK = 1008

const val MAIN_VIEW_ANIMATION_DURATION = 300L

const val MIN_DATA_REFRESHING_INTERVAL = 30_000L

const val TAB_TOGGLING_DELAY = 400L

const val PUBLIC_ORDERS_LIMIT = 100

const val OK_HTTP_CLIENT_TIMEOUT = 30_000L

const val CURRENCY_MARKET_SEPARATOR = "_"

const val ORDERS_ACTIVITY_TAB_COUNT = 3

// Versions
val API_VERSION = Build.VERSION.SDK_INT
val AT_LEAST_KITKAT = (API_VERSION >= Build.VERSION_CODES.KITKAT)
val AT_LEAST_LOLLIPOP = (API_VERSION >= Build.VERSION_CODES.LOLLIPOP)
val AT_LEAST_MARSHMALLOW = (API_VERSION >= Build.VERSION_CODES.M)
val AT_LEAST_NOUGAT = (API_VERSION >= Build.VERSION_CODES.N)
val AT_LEAST_OREO = (API_VERSION >= Build.VERSION_CODES.O)