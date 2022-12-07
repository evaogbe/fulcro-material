(ns ogbe.fulcro.mui.icons.bookmarks-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BookmarksOutlined" :default BookmarksOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmarks-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarksOutlined)))