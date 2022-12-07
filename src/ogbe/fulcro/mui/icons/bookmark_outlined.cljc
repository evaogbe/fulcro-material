(ns ogbe.fulcro.mui.icons.bookmark-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkOutlined" :default BookmarkOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkOutlined)))