// Copyright (c) 2013-2017 Rob Norris
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package doobie.free

trait Types {

  type BlobIO[A]              = blob.BlobIO[A]
  type CallableStatementIO[A] = callablestatement.CallableStatementIO[A]
  type ClobIO[A]              = clob.ClobIO[A]
  type ConnectionIO[A]        = connection.ConnectionIO[A]
  type DatabaseMetaDataIO[A]  = databasemetadata.DatabaseMetaDataIO[A]
  type DriverIO[A]            = driver.DriverIO[A]
  type NClobIO[A]             = nclob.NClobIO[A]
  type PreparedStatementIO[A] = preparedstatement.PreparedStatementIO[A]
  type RefIO[A]               = ref.RefIO[A]
  type ResultSetIO[A]         = resultset.ResultSetIO[A]
  type SQLDataIO[A]           = sqldata.SQLDataIO[A]
  type SQLInputIO[A]          = sqlinput.SQLInputIO[A]
  type SQLOutputIO[A]         = sqloutput.SQLOutputIO[A]
  type StatementIO[A]         = statement.StatementIO[A]

  type BlobOp[A]              = blob.BlobOp[A]
  type CallableStatementOp[A] = callablestatement.CallableStatementOp[A]
  type ClobOp[A]              = clob.ClobOp[A]
  type ConnectionOp[A]        = connection.ConnectionOp[A]
  type DatabaseMetaDataOp[A]  = databasemetadata.DatabaseMetaDataOp[A]
  type DriverOp[A]            = driver.DriverOp[A]
  type NClobOp[A]             = nclob.NClobOp[A]
  type PreparedStatementOp[A] = preparedstatement.PreparedStatementOp[A]
  type RefOp[A]               = ref.RefOp[A]
  type ResultSetOp[A]         = resultset.ResultSetOp[A]
  type SQLDataOp[A]           = sqldata.SQLDataOp[A]
  type SQLInputOp[A]          = sqlinput.SQLInputOp[A]
  type SQLOutputOp[A]         = sqloutput.SQLOutputOp[A]
  type StatementOp[A]         = statement.StatementOp[A]

}

trait Modules {
  lazy val FB   = blob
  lazy val FCS  = callablestatement
  lazy val FCL  = clob
  lazy val FC   = connection
  lazy val FDMD = databasemetadata
  lazy val FD   = driver
  lazy val FNCL = nclob
  lazy val FPS  = preparedstatement
  lazy val FREF = ref
  lazy val FRS  = resultset
  lazy val FSD  = sqldata
  lazy val FSI  = sqlinput
  lazy val FSO  = sqloutput
  lazy val FS   = statement
}

trait Instances {
  implicit lazy val AsyncBlobIO              = blob.AsyncBlobIO
  implicit lazy val AsyncCallableStatementIO = callablestatement.AsyncCallableStatementIO
  implicit lazy val AsyncClobIO              = clob.AsyncClobIO
  implicit lazy val AsyncConnectionIO        = connection.AsyncConnectionIO
  implicit lazy val AsyncDatabaseMetaDataIO  = databasemetadata.AsyncDatabaseMetaDataIO
  implicit lazy val AsyncDriverIO            = driver.AsyncDriverIO
  implicit lazy val AsyncNClobIO             = nclob.AsyncNClobIO
  implicit lazy val AsyncPreparedStatementIO = preparedstatement.AsyncPreparedStatementIO
  implicit lazy val AsyncRefIO               = ref.AsyncRefIO
  implicit lazy val AsyncResultSetIO         = resultset.AsyncResultSetIO
  implicit lazy val AsyncSQLDataIO           = sqldata.AsyncSQLDataIO
  implicit lazy val AsyncSQLInputIO          = sqlinput.AsyncSQLInputIO
  implicit lazy val AsyncSQLOutputIO         = sqloutput.AsyncSQLOutputIO
  implicit lazy val AsyncStatementIO         = statement.AsyncStatementIO
}
