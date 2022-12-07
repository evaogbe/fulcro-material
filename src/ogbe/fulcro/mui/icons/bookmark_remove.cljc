(ns ogbe.fulcro.mui.icons.bookmark-remove
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkRemove" :default BookmarkRemove]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-remove
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkRemove)))