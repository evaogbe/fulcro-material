(ns ogbe.fulcro.mui.icons.bookmark-border
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkBorder" :default BookmarkBorder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-border
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkBorder)))