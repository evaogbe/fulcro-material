(ns ogbe.fulcro.mui.icons.flip-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlipRounded" :default FlipRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipRounded)))