(ns ogbe.fulcro.mui.icons.thumb-down-alt
  #?(:cljs (:require
            ["@mui/icons-material/ThumbDownAlt" :default ThumbDownAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-down-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbDownAlt)))