(ns ogbe.fulcro.mui.icons.library-books
  #?(:cljs (:require
            ["@mui/icons-material/LibraryBooks" :default LibraryBooks]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-library-books
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LibraryBooks)))