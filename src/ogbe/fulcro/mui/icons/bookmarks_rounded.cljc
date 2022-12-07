(ns ogbe.fulcro.mui.icons.bookmarks-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BookmarksRounded" :default BookmarksRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmarks-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarksRounded)))