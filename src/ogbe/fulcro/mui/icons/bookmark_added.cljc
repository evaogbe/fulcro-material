(ns ogbe.fulcro.mui.icons.bookmark-added
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkAdded" :default BookmarkAdded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-added
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkAdded)))