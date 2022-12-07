(ns ogbe.fulcro.mui.icons.flip-to-back-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlipToBackRounded" :default FlipToBackRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-to-back-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipToBackRounded)))