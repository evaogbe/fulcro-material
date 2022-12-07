(ns ogbe.fulcro.mui.icons.bookmark-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkRounded" :default BookmarkRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkRounded)))