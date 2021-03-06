package com.stocksexchange.android.utils.helpers

import android.os.Environment
import java.io.File

const val FILE_NAME_PREFIX_IMAGE = "IMAGE_"

const val FILE_NAME_EXTENSION_JPG = "jpg"


/**
 * Creates a parent directory (and its intermediates) if the don't exist
 * and return it.
 *
 * @param parentDirectoryRelativePath The relative path for the parent directory
 *
 * @return The parent directory
 */
fun createParentDirectory(parentDirectoryRelativePath: String): File {
    val parentDirectory = File(Environment.getExternalStorageDirectory(), parentDirectoryRelativePath)

    if(!parentDirectory.exists()) {
        parentDirectory.mkdirs()
    }

    return parentDirectory
}


/**
 * Composes a file name using the provided components.
 *
 * @param prefix The prefix of the file name
 * @param name The name for the file
 * @param date The data the file is created on
 * @param extension The extension of the file
 *
 * @return The file name
 */
fun composeFileName(prefix: String, name: String,
                    date: String, extension: String): String {
    val nameBuilder = StringBuilder()

    nameBuilder.append(prefix)
        .append(name)
        .append("_").append(date)
        .append(".").append(extension)

    return nameBuilder.toString()
}