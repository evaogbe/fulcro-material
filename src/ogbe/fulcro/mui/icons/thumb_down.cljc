(ns ogbe.fulcro.mui.icons.thumb-down
  #?(:cljs (:require
            ["@mui/icons-material/ThumbDown" :default ThumbDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbDown)))