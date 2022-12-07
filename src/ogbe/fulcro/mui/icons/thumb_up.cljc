(ns ogbe.fulcro.mui.icons.thumb-up
  #?(:cljs (:require
            ["@mui/icons-material/ThumbUp" :default ThumbUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbUp)))