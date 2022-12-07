(ns ogbe.fulcro.mui.icons.bookmark-add
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkAdd" :default BookmarkAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkAdd)))