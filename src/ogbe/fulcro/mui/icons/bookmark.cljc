(ns ogbe.fulcro.mui.icons.bookmark
  #?(:cljs (:require
            ["@mui/icons-material/Bookmark" :default Bookmark]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bookmark)))