(ns ogbe.fulcro.mui.icons.radio-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RadioRounded" :default RadioRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioRounded)))