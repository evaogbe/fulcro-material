(ns ogbe.fulcro.mui.icons.blur-circular-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BlurCircularRounded" :default BlurCircularRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-circular-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurCircularRounded)))