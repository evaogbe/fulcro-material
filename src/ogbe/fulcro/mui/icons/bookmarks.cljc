(ns ogbe.fulcro.mui.icons.bookmarks
  #?(:cljs (:require
            ["@mui/icons-material/Bookmarks" :default Bookmarks]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmarks
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bookmarks)))