(ns ogbe.fulcro.mui.icons.blur-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BlurOnRounded" :default BlurOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurOnRounded)))