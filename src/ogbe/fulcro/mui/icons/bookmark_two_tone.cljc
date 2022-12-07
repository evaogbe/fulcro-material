(ns ogbe.fulcro.mui.icons.bookmark-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkTwoTone" :default BookmarkTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkTwoTone)))