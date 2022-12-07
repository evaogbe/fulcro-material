(ns ogbe.fulcro.mui.icons.bookmarks-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BookmarksSharp" :default BookmarksSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmarks-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarksSharp)))